package backend.academy.linktracker.scrapper.usecases.wrappers;

import backend.academy.linktracker.scrapper.adapters.controllers.stackoverflow.StackOverflowApiClient;
import backend.academy.linktracker.scrapper.common.TimeUtils;
import backend.academy.linktracker.scrapper.properties.StackoverflowProperties;
import backend.academy.linktracker.scrapper.usecases.dtos.ScrapperLinkStackOverflowUpdateEvent;
import backend.academy.linktracker.scrapper.usecases.dtos.ScrapperLinkUpdateEvent;
import java.net.URI;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
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
    private static final String QUESTION_ID_PATH_PARAM = "question_id";
    private final StackoverflowProperties properties;
    private final StackOverflowApiClient apiClient;
    private final TimeUtils timeUtils;

    public Pair<Collection<ScrapperLinkUpdateEvent>, Instant> scrap(URI uri, Instant since) {
        if (!checkCanScrap(uri)) {
            log.atError().addKeyValue("uri", uri).log("Got incorrect uri to scrap");
            throw new IllegalArgumentException("Got incorrect uri to scrap");
        }
        var template = new UriTemplate(properties.getStackOverflowRoot().toString()
                + EXPECTED_CONCRETE_URI_FORMAT); // TODO check can add to fields
        var questionID = template.match(uri.toString()).get(QUESTION_ID_PATH_PARAM);
        var res = apiClient.getAnswersUpdates(List.of(questionID), since, timeUtils.now());
        return Pair.of(mapToInnerEvents(res.getLeft(), uri), res.getRight());
    }

    private Collection<ScrapperLinkUpdateEvent> mapToInnerEvents(
            Collection<ScrapperLinkStackOverflowUpdateEvent> stackOverflowUpdateEvent, URI uri) {
        return stackOverflowUpdateEvent.stream()
                .map(update -> new ScrapperLinkUpdateEvent(uri, update.description()))
                .toList();
    }

    public boolean checkCanScrap(URI uri) {
        var template = new UriTemplate(properties.getStackOverflowRoot().toString()
                + EXPECTED_CONCRETE_URI_FORMAT); // TODO check can add to fields
        return template.matches(uri.toString()); // TODO add better check with request to api
    }
}
