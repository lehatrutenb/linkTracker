package backend.academy.linktracker.bot.testutil;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.getAllServeEvents;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;

import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@RequiredArgsConstructor
public class TelegramBotTestUtils {
    private final String wiremockScenario;
    private final Collection<String> botMessagesSummator = new ArrayList<>();

    public Collection<LoggedRequest> waitAndGetUpdates(int amtUpdatesToWait) {
        List<LoggedRequest> gotRequests = List.of();
        while (true) {
            Collection<ServeEvent> events = getAllServeEvents();
            var currentAmt = gotRequests.size();
            gotRequests = events.stream()
                    .map(ServeEvent::getRequest)
                    .filter(request -> urlMatching(".*/sendMessage")
                            .match(request.getUrl())
                            .isExactMatch())
                    .toList();
            if (currentAmt != gotRequests.size()) {
                log.atInfo()
                        .addKeyValue("total responses amount", gotRequests.size())
                        .log("Got new responses");
            }
            if (amtUpdatesToWait <= gotRequests.size()) {
                break;
            }
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        return gotRequests.reversed().stream().limit(amtUpdatesToWait).toList();
    }

    public Collection<String> waitAndGetBotResponses(int amtUpdatesToWait) {
        return waitAndGetUpdates(amtUpdatesToWait).stream()
                .map(request -> "?" + URLDecoder.decode(request.getBodyAsString(), StandardCharsets.UTF_8))
                .map(UriComponentsBuilder::fromUriString)
                .map(UriComponentsBuilder::build)
                .map(UriComponents::getQueryParams)
                .map(qMap -> qMap.getFirst("text"))
                .toList();
    }

    public Map<String, Stream<String>> waitAndGetBotResponsesByChatID(int amtUpdatesToWait) {
        return waitAndGetUpdates(amtUpdatesToWait).stream()
                .map(request -> "?" + URLDecoder.decode(request.getBodyAsString(), StandardCharsets.UTF_8))
                .map(UriComponentsBuilder::fromUriString)
                .map(UriComponentsBuilder::build)
                .map(UriComponents::getQueryParams)
                .collect(Collectors.toMap(
                        query -> query.getFirst("chat_id"),
                        query -> Stream.of(query.getFirst("text")),
                        Stream::concat));
    }

    /**
     * That method not really write - just set mock for answers to bot polling requests
     *
     * @return ResponseDefinitionBuilder with constructed body
     */
    @SuppressFBWarnings("VA_FORMAT_STRING_USES_NEWLINE")
    public ResponseDefinitionBuilder writeMessageToBot(ResponseDefinitionBuilder responseDefinitionBuilder) {
        return responseDefinitionBuilder.withBody(String.format("""
            {
                "ok": true,
                "result": [
                    %s
                ]
            }""", String.join(",", botMessagesSummator)));
    }

    public record Message(long chatID, long updateID, long messageID, String messageText) {
        public Message(long messageID, String messageText) {
            this(1, messageID, messageID, messageText);
        }

        public Message(long chatID, long messageID, String messageText) {
            this(chatID, messageID, messageID, messageText);
        }
    }

    @SuppressFBWarnings("VA_FORMAT_STRING_USES_NEWLINE")
    private void addUpdateEvent(Message message) {
        botMessagesSummator.add(
                String.format("""
                                 {
                                  "update_id": %d,
                                  "message": {
                                    "message_id": %d,
                                    "from": {
                                      "id": 987654321,
                                      "is_bot": false,
                                      "first_name": "Test",
                                      "username": "testuser"
                                    },
                                    "chat": {
                                      "id": %d,
                                      "type": "private"
                                    },
                                    "date": 1234567890,
                                    "text": "%s"
                                  }
                                }
                                """, message.messageID, message.messageID, message.chatID, message.messageText));
    }

    public void writeMessageToBot(String fromState, String toState, Message message) {
        addUpdateEvent(message);
        stubFor(post(urlMatching("/bot/.*/getUpdates"))
                .inScenario(wiremockScenario)
                .whenScenarioStateIs(fromState)
                .willReturn(writeMessageToBot(aResponse()
                        .withStatus(200)
                        .withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)))
                .willSetStateTo(toState));
    }

    public void repeatLastMessage(
            String fromState, String toState, long messageId) { // TODO use inside writeMessageToBot
        addUpdateEvent(new Message(messageId, "/ignore"));
        stubFor(post(urlMatching("/bot/.*/getUpdates"))
                .inScenario(wiremockScenario)
                .whenScenarioStateIs(fromState)
                .willReturn(writeMessageToBot(aResponse()
                        .withStatus(200)
                        .withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)))
                .willSetStateTo(toState));
    }
}
