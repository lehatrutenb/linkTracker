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
import java.util.stream.Collectors;
import java.util.stream.Stream;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.awaitility.Awaitility;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.util.MultiValueMap;
import org.springframework.web.util.UriComponentsBuilder;

@Slf4j
@RequiredArgsConstructor
public class TelegramBotTestUtils {
    private static final Duration DEFAULT_MAX_WAIT_TIME = Duration.ofSeconds(100);

    private final String wiremockScenario;
    private final Collection<String> botMessagesSummator = new ArrayList<>();
    private String lastState;
    private static long lastMessageId = 0;
    private static long lastChatID = 0;

    // Will provide globally unique IDs
    public static long getFreeChatID() {
        lastChatID++;
        return lastChatID - 1;
    }

    public static long getFreeMessageID() {
        lastMessageId++;
        return lastMessageId - 1;
    }

    private MultiValueMap<String, String> getQueryParams(LoggedRequest request) {
        return UriComponentsBuilder.fromUriString(
                        "?" + URLDecoder.decode(request.getBodyAsString(), StandardCharsets.UTF_8))
                .build()
                .getQueryParams();
    }

    public List<LoggedRequest> getSendMessageRequests(List<Long> allowedChatIDs) {
        var res = getAllServeEvents().stream()
                .map(ServeEvent::getRequest)
                .filter(request ->
                        urlMatching(".*/sendMessage").match(request.getUrl()).isExactMatch())
                .filter(request -> {
                    var chatID = getQueryParams(request).get("chat_id");
                    return chatID != null && allowedChatIDs.contains(Long.parseLong(chatID.getFirst()));
                })
                .toList();
        return res;
    }

    public Collection<LoggedRequest> waitAndGetUpdates(
            int amtUpdatesToWait, Duration maxWaitTime, List<Long> allowedChatIDs) {
        List<LoggedRequest> gotRequests = Awaitility.await()
                .atMost(maxWaitTime)
                .pollInterval(Duration.ofSeconds(1))
                .until(() -> getSendMessageRequests(allowedChatIDs), requests -> requests.size() >= amtUpdatesToWait);
        log.atInfo().addKeyValue("total responses amount", gotRequests.size()).log("Got expected bot responses");
        return gotRequests.reversed().stream().limit(amtUpdatesToWait).toList();
    }

    public Collection<String> waitAndGetBotResponses(int amtUpdatesToWait, List<Long> allowedChatIDs) {
        return waitAndGetBotResponses(amtUpdatesToWait, DEFAULT_MAX_WAIT_TIME, allowedChatIDs);
    }

    public Collection<String> waitAndGetBotResponses(
            int amtUpdatesToWait, Duration maxWaitTime, List<Long> allowedChatIDs) {
        return waitAndGetUpdates(amtUpdatesToWait, maxWaitTime, allowedChatIDs).stream()
                .map(request -> getQueryParams(request).getFirst("text"))
                .toList();
    }

    public Map<String, Stream<String>> waitAndGetBotResponsesByChatID(int amtUpdatesToWait, List<Long> allowedChatIDs) {
        return waitAndGetBotResponsesByChatID(amtUpdatesToWait, DEFAULT_MAX_WAIT_TIME, allowedChatIDs);
    }

    public Map<String, Stream<String>> waitAndGetBotResponsesByChatID(
            int amtUpdatesToWait, Duration maxWaitTime, List<Long> allowedChatIDs) {
        return waitAndGetUpdates(amtUpdatesToWait, maxWaitTime, allowedChatIDs).stream()
                .collect(Collectors.toMap(
                        request -> getQueryParams(request).getFirst("chat_id"),
                        request -> Stream.of(getQueryParams(request).getFirst("text")),
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

    public static class Message {
        private final long chatID;
        private final long updateID;
        private final long messageID;
        private final String messageText;

        public Message(String messageText) {
            this(getFreeChatID(), messageText);
        }

        public Message(long chatID, String messageText) {
            this(chatID, getFreeMessageID(), messageText);
        }

        public Message(long chatID, long updateID, String messageText) {
            this.chatID = chatID;
            this.messageID = updateID;
            this.updateID = updateID;
            this.messageText = messageText;
        }
    }

    @SuppressFBWarnings("VA_FORMAT_STRING_USES_NEWLINE")
    private void addUpdateEvent(Message message) {
        botMessagesSummator.add(String.format(
                """
                                 {
                                  "update_id": %d,
                                  "message": {
                                    "message_id": %d,
                                    "from": {
                                      "id": %d,
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
                                """, message.updateID, message.messageID, message.chatID, message.chatID, message.messageText));
    }

    public long writeMessageToBot(String fromState, String toState, Message message) {
        lastState = toState;
        addUpdateEvent(message);
        stubFor(post(urlMatching("/bot/.*/getUpdates"))
                .inScenario(wiremockScenario)
                .whenScenarioStateIs(fromState)
                .willReturn(writeMessageToBot(aResponse()
                        .withStatus(200)
                        .withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)))
                .willSetStateTo(toState));
        return message.chatID;
    }

    public void repeatLastMessageLastState() {
        assert lastState != null;
        addUpdateEvent(new Message(
                getFreeChatID(), getFreeMessageID(), "/ignore")); // ChatID is not really mnatter in repeat messages
        stubFor(post(urlMatching("/bot/.*/getUpdates"))
                .inScenario(wiremockScenario)
                .whenScenarioStateIs(lastState)
                .willReturn(writeMessageToBot(aResponse()
                        .withStatus(200)
                        .withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)))
                .willSetStateTo(lastState));
    }

    public long trackURL(TrackURLRequest request) {
        var hash = java.util.UUID.randomUUID().toString().substring(0, 3);
        writeMessageToBot(request.inState(), "track_command_resieved" + hash, new Message(request.chatID(), "/track"));
        writeMessageToBot(
                "track_command_resieved" + hash,
                "url_resieved" + hash,
                new Message(request.chatID(), request.validURL()));
        writeMessageToBot("url_resieved" + hash, request.outState(), new Message(request.chatID(), request.tags()));
        return request.chatID();
    }

    public record TrackURLRequest(String inState, String outState, String validURL, String tags, long chatID) {
        public TrackURLRequest(String inState, String outState, String validURL, String tags) {
            this(inState, outState, validURL, tags, getFreeChatID());
        }
    }
}
