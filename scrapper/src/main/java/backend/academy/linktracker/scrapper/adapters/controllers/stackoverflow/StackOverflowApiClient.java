package backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow;

import backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models.Answer;
import backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.models.ApiAnswersResponse;
import backend.academy.linktracker.scrapper.properties.ScrapperGlobalProperties;
import backend.academy.linktracker.scrapper.properties.StackoverflowProperties;
import backend.academy.linktracker.scrapper.usecases.dtos.ScrapperLinkStackOverflowUpdateEvent;
import backend.academy.linktracker.scrapper.usecases.dtos.ScrapperLinkUpdateEventDescription;
import backend.academy.linktracker.scrapper.usecases.services.ScrapperRateLimitService;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Slf4j
@Component
public class StackOverflowApiClient {
    @Autowired
    private StackoverflowProperties stackoverflowProperties;

    private static final String GET_ANSWER_UPDATES_PATH = "/questions/{ids}/answers";
    private static final String RESPONSES_SORT_TYPE = "activity";
    private static final String RESPONSES_SORT_ORDER = "asc"; // To firstly handle the oldest ones
    private static final String RESPONSES_SITE = "stackoverflow";
    private ScrapperRateLimitService rateLimitService;

    @Autowired
    public void setScrapperGlobalProperties(ScrapperGlobalProperties globalProperties) {
        rateLimitService = new ScrapperRateLimitService(globalProperties);
    }

    /**
     *
     * @param questionIds {ids} can contain up to 100 semicolon delimited ids!
     * @param since
     * @return (map question id -> new answers on it, Instant of last read event + 1 sec (cause stack overflow api has sec precision)
     * or since if no such event exists)
     */
    public Pair<Collection<ScrapperLinkStackOverflowUpdateEvent>, Instant> getAnswersUpdates(
            Collection<String> questionIds, Instant since, Instant to) {
        if (questionIds.size() > 100) { // TODO >= or >
            log.atError().addKeyValue("amount", questionIds.size()).log("Got too much questions ids to scrap");
            throw new IllegalArgumentException("Got too much questions ids to scrap");
        }

        var answers = scrapAnswersUpdates(questionIds, since, to);
        var updates = answers.stream().map(this::mapAnswerToUpdateEvent).toList();

        return Pair.of(
                updates,
                answers.stream()
                        .max(Comparator.comparing(
                                answer -> answer.getLastActivityDate().orElseThrow()))
                        .map(answer -> answer.getLastActivityDate()
                                .orElseThrow()
                                .toInstant()
                                .plusSeconds(1))
                        .orElse(since) // TODO care may loose updates because date precision, but let it be
                );
    }

    public ScrapperLinkStackOverflowUpdateEvent mapAnswerToUpdateEvent(Answer answer) {
        return new ScrapperLinkStackOverflowUpdateEvent(
                answer.getQuestionId().toString(),
                new ScrapperLinkUpdateEventDescription(
                        answer.getOwner().orElseThrow().getDisplayName() + " answered"));
    }

    private Collection<Answer> scrapAnswersUpdates(Collection<String> questionIDs, Instant since, Instant to) {
        if (rateLimitService.isReachedRateLimit()) {
            return List.of();
        }

        RestClient restClient = RestClient.create(stackoverflowProperties.getApiRoot()); // TODO Improve not to recreate
        var answers = new ArrayList<Answer>();
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
            var response = restClient
                    .get()
                    .uri(uriBuilder -> uriBuilder
                            .path(stackoverflowProperties.getApiVersion() + GET_ANSWER_UPDATES_PATH)
                            .queryParam("key", stackoverflowProperties.getKey())
                            .queryParam("order", RESPONSES_SORT_ORDER)
                            .queryParam("sort", RESPONSES_SORT_TYPE)
                            .queryParam("site", RESPONSES_SITE)
                            .queryParam("min", since.toEpochMilli() / 1000) // Api need in sec unix timestamp
                            .queryParam("max", to.toEpochMilli() / 1000)
                            .queryParam("pagesize", stackoverflowProperties.getApiPageSize())
                            .queryParam("page", finalRequestingPage)
                            .build(questionFormattedIDs))
                    .retrieve()
                    .body(ApiAnswersResponse.class);
            if (response == null) {
                log.warn("Got null response - end updates scrapping");
                break;
            }
            rateLimitService.setUpdateRateLimitData(
                    Optional.of(response.getQuotaMax()), Optional.of(response.getQuotaRemaining()));
            answers.addAll(response.getItems());
            hasMoreUpdates = response.getHasMore();
        }

        return answers;
    }
}
