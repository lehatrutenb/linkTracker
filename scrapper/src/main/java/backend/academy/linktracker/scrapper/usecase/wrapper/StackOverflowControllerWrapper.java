package backend.academy.linktracker.scrapper.usecase.wrapper;

import backend.academy.linktracker.scrapper.adapter.scrapper.stackoverflow.StackOverflowApiClient;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.property.StackoverflowProperties;
import backend.academy.linktracker.scrapper.usecase.dto.ScrapperLinkStackOverflowUpdateEvent;
import backend.academy.linktracker.scrapper.usecase.dto.ScrapperLinkUpdateEvent;
import java.net.URI;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Component;
import org.springframework.web.util.UriTemplate;

@Slf4j
@Component
@RequiredArgsConstructor
public class StackOverflowControllerWrapper implements OuterServiceScrapper {
    private static final String EXPECTED_CONCRETE_URI_FORMAT = "/questions/{question_id}/{question_description}";
    private static final String EXPECTED_CONCRETE_URI_FORMAT_NO_DESCRIPTION = "/questions/{question_id}";
    private static final String QUESTION_ID_PATH_PARAM = "question_id";
    private final StackoverflowProperties properties;
    private final StackOverflowApiClient apiClient;

    public Pair<Collection<ScrapperLinkUpdateEvent>, Instant> scrap(URI uri, Instant since) {
        if (!checkCanScrap(uri)) {
            log.atError().addKeyValue("uri", uri).log("Got incorrect uri to scrap");
            throw new IllegalArgumentException("Got incorrect uri to scrap");
        }
        var questionID = getQuestionID(uri).orElseThrow();
        var res = apiClient.getUpdates(List.of(questionID), since, now());
        return Pair.of(mapToInnerEvents(res.getLeft(), uri), res.getRight());
    }

    private Collection<ScrapperLinkUpdateEvent> mapToInnerEvents(
            Collection<ScrapperLinkStackOverflowUpdateEvent> stackOverflowUpdateEvent, URI uri) {
        return stackOverflowUpdateEvent.stream()
                .map(update -> new ScrapperLinkUpdateEvent(uri, update.description()))
                .toList();
    }

    public boolean checkCanScrap(ScrapperLink link) {
        return checkCanScrap(link.getUri());
    }

    public boolean checkCanScrap(URI uri) {
        return getQuestionID(uri).isPresent();
    }

    public Optional<String> getQuestionID(URI uri) {
        var template = new UriTemplate(properties.getStackOverflowRoot().toString() + EXPECTED_CONCRETE_URI_FORMAT);
        var templateNoDescription = new UriTemplate(
                properties.getStackOverflowRoot().toString() + EXPECTED_CONCRETE_URI_FORMAT_NO_DESCRIPTION);
        return Optional.ofNullable(template.match(uri.toString()).get(QUESTION_ID_PATH_PARAM))
                .or(() -> Optional.ofNullable(
                        templateNoDescription.match(uri.toString()).get(QUESTION_ID_PATH_PARAM)));
    }

    private Instant now() {
        return Instant.now();
    }
}
