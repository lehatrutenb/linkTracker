package backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow;

import backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow.models.Answer;
import backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow.models.ApiAnswersResponse;
import backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow.models.ApiCommentsResponse;
import backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow.models.ApiQuestionsResponse;
import backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow.models.Comment;
import backend.academy.linktracker.scrapper.property.ScrapperGlobalProperties;
import backend.academy.linktracker.scrapper.property.StackoverflowProperties;
import backend.academy.linktracker.scrapper.usecase.dto.ScrapperLinkStackOverflowUpdateEvent;
import backend.academy.linktracker.scrapper.usecase.dto.ScrapperLinkUpdateEventDescription;
import backend.academy.linktracker.scrapper.usecase.service.ScrapperRateLimitService;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClient.ResponseSpec;

@Slf4j
@Component
@SuppressFBWarnings("VA_FORMAT_STRING_USES_NEWLINE")
public class StackOverflowApiClient {
    private static final String GET_ANSWER_UPDATES_PATH = "/questions/{ids}/answers";
    private static final String GET_COMMENTS_UPDATES_PATH = "/questions/{ids}/comments";
    private static final String GET_QUESTION_UPDATES_PATH = "/questions/{ids}";
    private static final String API_FILTER_HASH =
            "!*Mg4Pjg9LXr9bvJ1"; // To get markdown version of the content (we may create filters with SO api
    // `/filter/create`, but additional requests - so I just will keep it)
    private static final String RESPONSES_SORT_TYPE = "activity";
    private static final String RESPONSES_SORT_ORDER = "asc"; // To firstly handle the oldest ones
    private static final String RESPONSES_SITE = "stackoverflow";

    @Autowired
    private StackoverflowProperties stackoverflowProperties;

    @Autowired
    private ScrapperGlobalProperties globalProperties;

    private ScrapperRateLimitService rateLimitService;
    private Map<Long, String> questionCachedDescriptions = new ConcurrentHashMap<>();

    @Autowired
    public void setGlobalProperties(ScrapperGlobalProperties globalProperties) {
        this.globalProperties = globalProperties;
        rateLimitService = new ScrapperRateLimitService(globalProperties);
    }

    /**
     *
     * @param questionIds {ids} can contain up to 100 semicolon delimited ids!
     * @param since
     * @return (map question id -> new answers on it, Instant of last read event + 1 sec (cause stack overflow api has sec precision)
     * or since if no such event exists)
     */
    public Pair<Collection<ScrapperLinkStackOverflowUpdateEvent>, Instant> getUpdates(
            Collection<String> questionIds, Instant since, Instant to) {
        if (questionIds.size() > 100) { // TODO >= or >
            log.atError().addKeyValue("amount", questionIds.size()).log("Got too much questions ids to scrap");
            throw new IllegalArgumentException("Got too much questions ids to scrap");
        }

        fetchQuestionDescription(questionIds.stream().map(Long::parseLong).toList());

        var answers = scrapEntityUpdates(
                questionIds,
                since,
                to,
                this::parseAnswersUpdates,
                stackoverflowProperties.getApiVersion() + GET_ANSWER_UPDATES_PATH);
        var comments = scrapEntityUpdates(
                questionIds,
                since,
                to,
                this::parseCommentsUpdates,
                stackoverflowProperties.getApiVersion() + GET_COMMENTS_UPDATES_PATH);
        List<ScrapperLinkStackOverflowUpdateEvent> updates =
                Stream.concat(answers.stream(), comments.stream()).toList();

        return Pair.of(
                updates,
                updates.stream()
                        .max(Comparator.comparing(update -> update.lastActivityDate()))
                        .map(update -> update.lastActivityDate()
                                .plusSeconds(1)) // TODO care may loose updates because date precision, but let it be
                        .orElse(since));
    }

    private String getQuestionDescription(Long questionId) {
        return questionCachedDescriptions.getOrDefault(questionId, "");
    }

    private void fetchQuestionDescription(Collection<Long> questionIds) {
        RestClient restClient = RestClient.create(stackoverflowProperties.getApiRoot());
        ApiQuestionsResponse responseBody = null;
        try {
            responseBody = restClient
                    .get()
                    .uri(uriBuilder -> uriBuilder
                            .path(stackoverflowProperties.getApiVersion() + GET_QUESTION_UPDATES_PATH)
                            .queryParam("key", stackoverflowProperties.getKey())
                            .queryParam("site", RESPONSES_SITE)
                            .build(String.join(
                                    ";",
                                    questionIds.stream().map(String::valueOf).toList())))
                    .retrieve()
                    .body(ApiQuestionsResponse.class);
        } catch (HttpServerErrorException | HttpClientErrorException e) {
            log.atError().addKeyValue("questionIds", questionIds).log("Error fetching question descriptions", e);
            return;
        }
        if (responseBody == null) {
            return;
        }
        responseBody.getItems().forEach(item -> questionCachedDescriptions.put(item.getQuestionId(), item.getTitle()));
    }

    private Collection<ScrapperLinkStackOverflowUpdateEvent> scrapEntityUpdates(
            Collection<String> questionIDs, Instant since, Instant to, EntityParser entityParser, String apiPath) {
        if (rateLimitService.isReachedRateLimit()) {
            return List.of();
        }

        RestClient restClient = RestClient.create(stackoverflowProperties.getApiRoot()); // TODO Improve not to recreate
        var updates = new ArrayList<ScrapperLinkStackOverflowUpdateEvent>();
        boolean hasMoreUpdates = true;
        String questionFormattedIDs = String.join(";", questionIDs);
        int apiRequestsDone = 0;
        int requestingPage = 0;

        while (hasMoreUpdates) {
            requestingPage++;
            apiRequestsDone++;
            if (apiRequestsDone
                    > stackoverflowProperties
                            .getMaxRequestsBeforeCalmDown()) { // Not to reach day limit randomly or even in prod
                log.warn("Failed to scrap all updates cause reached calm down - return just part");
                break;
            }
            log.atDebug()
                    .addKeyValue("questionIDs", questionFormattedIDs)
                    .log("Scrapping answers for stackoverflow questions");
            int finalRequestingPage = requestingPage;
            var responseSpec = restClient
                    .get()
                    .uri(uriBuilder -> uriBuilder
                            .path(apiPath)
                            .queryParam("key", stackoverflowProperties.getKey())
                            .queryParam("order", RESPONSES_SORT_ORDER)
                            .queryParam("sort", RESPONSES_SORT_TYPE)
                            .queryParam("site", RESPONSES_SITE)
                            .queryParam("min", since.toEpochMilli() / 1000) // Api need in sec unix timestamp
                            .queryParam("max", to.toEpochMilli() / 1000)
                            .queryParam("pagesize", stackoverflowProperties.getApiPageSize())
                            .queryParam("page", finalRequestingPage)
                            .queryParam("filter", API_FILTER_HASH)
                            .build(questionFormattedIDs))
                    .retrieve();
            try {
                hasMoreUpdates = entityParser.parseEntity(responseSpec, updates);
            } catch (HttpServerErrorException | HttpClientErrorException e) {
                log.atError()
                        .addKeyValue("questionIDs", questionFormattedIDs)
                        .log("Error scrapping stackoverflow updates", e);
                break;
            }
        }

        return updates;
    }

    private interface EntityParser {
        boolean parseEntity(ResponseSpec responseSpec, ArrayList<ScrapperLinkStackOverflowUpdateEvent> entities);
    }

    public boolean parseAnswersUpdates(
            ResponseSpec responseSpec,
            ArrayList<ScrapperLinkStackOverflowUpdateEvent> updates) { // TODO merge with comments
        var response = responseSpec.body(ApiAnswersResponse.class);
        if (response == null) {
            log.warn("Got bad response - end anwer updates scrapping");
            return false;
        }
        rateLimitService.setUpdateRateLimitData(
                Optional.of(response.getQuotaMax()), Optional.of(response.getQuotaRemaining()));
        updates.addAll(response.getItems().stream()
                .filter(answer -> answer.getAnswerId() != null)
                .map(this::mapAnswerToUpdateEvent)
                .toList());
        return response.getHasMore();
    }

    // Use blank default fields cause when i was testing by hands i got empty sometimes for same answer:)
    public ScrapperLinkStackOverflowUpdateEvent mapAnswerToUpdateEvent(Answer answer) {
        return new ScrapperLinkStackOverflowUpdateEvent(
                answer.getQuestionId().toString(),
                new ScrapperLinkUpdateEventDescription("""
                question text: `%s`
                user answered: `%s`
                timestamp: `%s`
                answer text: `%s`
                """.formatted(
                                getQuestionDescription(answer.getQuestionId()),
                                answer.getOwner()
                                        .map(owner -> owner.getDisplayName().orElse(""))
                                        .orElse(""),
                                answer.getCreationDate().format(DateTimeFormatter.ISO_DATE_TIME),
                                cutDescription(answer.getBodyMarkdown().orElse("")))),
                answer.getLastActivityDate().orElse(answer.getCreationDate()).toInstant());
    }

    public boolean parseCommentsUpdates(
            ResponseSpec responseSpec, ArrayList<ScrapperLinkStackOverflowUpdateEvent> updates) {
        var response = responseSpec.body(ApiCommentsResponse.class);
        if (response == null) {
            log.atWarn().log("Got null response - end comment updates scrapping");
            return false;
        }
        rateLimitService.setUpdateRateLimitData(
                Optional.of(response.getQuotaMax()), Optional.of(response.getQuotaRemaining()));
        var comments = response.getItems().stream()
                .filter(comment -> comment.getCommentId() != null)
                .toList();
        IntStream.range(0, comments.size()).forEach(i -> updates.add(mapCommentToUpdateEvent(comments.get(i))));
        return response.getHasMore();
    }

    public ScrapperLinkStackOverflowUpdateEvent mapCommentToUpdateEvent(Comment comment) {
        Long questionID =
                Long.parseLong(Arrays.asList(comment.getLink().toString().split("_"))
                        .reversed()
                        .getFirst());
        return new ScrapperLinkStackOverflowUpdateEvent(
                questionID.toString(),
                new ScrapperLinkUpdateEventDescription("""
                question text: `%s`
                user commented: `%s`
                timestamp: `%s`
                comment text: `%s`
                """.formatted(
                                getQuestionDescription(questionID),
                                comment.getOwner()
                                        .map(owner -> owner.getDisplayName().orElse(""))
                                        .orElse(""),
                                comment.getCreationDate().format(DateTimeFormatter.ISO_DATE_TIME),
                                cutDescription(comment.getBodyMarkdown().orElse("")))),
                comment.getCreationDate().toInstant());
    }

    public String cutDescription(String description) {
        return description.substring(0, Math.min(description.length(), globalProperties.getMaxDescriptionLength()));
    }
}
