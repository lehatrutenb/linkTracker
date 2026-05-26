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
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import org.awaitility.Awaitility;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@RequiredArgsConstructor
public class TelegramBotTestUtils {
    private final String wiremockScenario;
    private final Collection<String> botMessagesSummator = new ArrayList<>();

    public List<LoggedRequest> getSendMessageRequests() {
        return getAllServeEvents().stream()
                .map(ServeEvent::getRequest)
                .filter(request ->
                        urlMatching(".*/sendMessage").match(request.getUrl()).isExactMatch())
                .toList();
    }

    public Collection<LoggedRequest> waitAndGetUpdates(int amtUpdatesToWait, Duration maxWaitTime) {
        List<LoggedRequest> gotRequests = Awaitility.await()
                .atMost(maxWaitTime)
                .pollInterval(Duration.ofSeconds(1))
                .until(this::getSendMessageRequests, requests -> requests.size() >= amtUpdatesToWait);
        return gotRequests.reversed().stream().limit(amtUpdatesToWait).toList();
    }

    public Collection<String> waitAndGetBotResponses(int amtUpdatesToWait, Duration maxWaitTime) {
        return waitAndGetUpdates(amtUpdatesToWait, maxWaitTime).stream()
                .map(request -> "?" + URLDecoder.decode(request.getBodyAsString(), StandardCharsets.UTF_8))
                .map(UriComponentsBuilder::fromUriString)
                .map(UriComponentsBuilder::build)
                .map(UriComponents::getQueryParams)
                .map(qMap -> qMap.getFirst("text"))
                .toList();
    }

    public Map<String, Stream<String>> waitAndGetBotResponsesByChatID(int amtUpdatesToWait, Duration maxWaitTime) {
        return waitAndGetUpdates(amtUpdatesToWait, maxWaitTime).stream()
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

    @RequiredArgsConstructor
    public static class Message {
        private long chatID = 1;
        private long updateID = 1;
        private long messageID = 1;
        private final String messageText;

        public Message(long chatID, String messageText) {
            this.chatID = chatID;
            this.messageText = messageText;
        }

        private void setMessageID(long messageID) {
            this.messageID = messageID;
            this.updateID = messageID;
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

    private String lastState;
    private long lastMessageId = 0;

    public void writeMessageToBot(String fromState, String toState, Message message) {
        lastState = toState;
        message.setMessageID(lastMessageId);
        lastMessageId++;
        addUpdateEvent(message);
        stubFor(post(urlMatching("/bot/.*/getUpdates"))
                .inScenario(wiremockScenario)
                .whenScenarioStateIs(fromState)
                .willReturn(writeMessageToBot(aResponse()
                        .withStatus(200)
                        .withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)))
                .willSetStateTo(toState));
    }

    public void repeatLastMessage(String fromState, String toState) {
        addUpdateEvent(new Message(lastMessageId + 1, "/ignore"));
        stubFor(post(urlMatching("/bot/.*/getUpdates"))
                .inScenario(wiremockScenario)
                .whenScenarioStateIs(fromState)
                .willReturn(writeMessageToBot(aResponse()
                        .withStatus(200)
                        .withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)))
                .willSetStateTo(toState));
    }

    public void repeatLastMessageLastState() {
        assert lastState != null;
        addUpdateEvent(new Message(lastMessageId + 1, "/ignore"));
        stubFor(post(urlMatching("/bot/.*/getUpdates"))
                .inScenario(wiremockScenario)
                .whenScenarioStateIs(lastState)
                .willReturn(writeMessageToBot(aResponse()
                        .withStatus(200)
                        .withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)))
                .willSetStateTo(lastState));
    }

    public void trackURL(TrackURLRequest request) {
        var hash = UUID.randomUUID().toString().substring(0, 3);
        writeMessageToBot(request.inState, "track_command_resieved" + hash, new Message(request.chatID, "/track"));
        writeMessageToBot(
                "track_command_resieved" + hash, "url_resieved" + hash, new Message(request.chatID, request.validURL));
        writeMessageToBot("url_resieved" + hash, "tags_resieved", new Message(request.chatID, request.tags));
    }

    public record TrackURLRequest(String inState, String outState, String validURL, String tags, int chatID) {
        public TrackURLRequest(String inState, String outState, String validURL, String tags) {
            this(inState, outState, validURL, tags, 1);
        }
    }
}
