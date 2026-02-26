package backend.academy.linktracker.bot;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.getAllServeEvents;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;

import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;
import com.github.tomakehurst.wiremock.verification.LoggedRequest;
import java.util.Collection;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

@RequiredArgsConstructor
public class TelegramBotTestUtils {
    public Collection<LoggedRequest> waitAndGetUpdates(int amtUpdatesToWait) {
        List<LoggedRequest> gotRequests;
        while (true) {
            Collection<ServeEvent> events = getAllServeEvents();
            gotRequests = events.stream()
                    .map(ServeEvent::getRequest)
                    .filter(request -> urlMatching(".*/sendMessage")
                            .match(request.getUrl())
                            .isExactMatch())
                    .toList();
            if (amtUpdatesToWait <= gotRequests.size()) {
                break;
            }
        }
        return gotRequests;
    }

    /**
     * That method not really write - just set mock for answers to bot polling requests
     *
     * @return ResponseDefinitionBuilder with constructed body
     */
    public ResponseDefinitionBuilder writeMessageToBot(
            ResponseDefinitionBuilder responseDefinitionBuilder, long messageId, String messageText) {
        return responseDefinitionBuilder.withBody(String.format("""
                                {
                                  "ok": true,
                                  "result": [
                                    {
                                      "update_id": 123456,
                                      "message": {
                                        "message_id": %d,
                                        "from": {
                                          "id": 987654321,
                                          "is_bot": false,
                                          "first_name": "Test",
                                          "username": "testuser"
                                        },
                                        "chat": {
                                          "id": 987654321,
                                          "type": "private"
                                        },
                                        "date": 1234567890,
                                        "text": "%s"
                                      }
                                    }
                                  ]
                                }
                                """, messageId, messageText));
    }

    public void writeMessageToBot(
            String scenario, String fromState, String toState, long messageId, String messageText) {
        stubFor(post(urlMatching("/bot/.*/getUpdates"))
                .inScenario(scenario)
                .whenScenarioStateIs(fromState)
                .willReturn(writeMessageToBot(
                        aResponse()
                                .withStatus(200)
                                .withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE),
                        messageId,
                        messageText))
                .willSetStateTo(toState));
    }
}
