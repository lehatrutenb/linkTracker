package backend.academy.linktracker.bot;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;

import com.github.tomakehurst.wiremock.client.ResponseDefinitionBuilder;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import java.time.Duration;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;

public class TelegramBotTestUtils {
    private static final Duration DEFAULT_POLLING_TIMEOUT = Duration.ofSeconds(10);

    @Autowired
    TelegramBot telegramBot;

    public Collection<Update> waitAndGetUpdates() {
        List<Update> receivedUpdates = new CopyOnWriteArrayList<>();
        CountDownLatch latch = new CountDownLatch(1);

        telegramBot.setUpdatesListener(updates -> {
            receivedUpdates.addAll(updates);
            latch.countDown();
            return UpdatesListener.CONFIRMED_UPDATES_ALL;
        });

        try {
            latch.await(DEFAULT_POLLING_TIMEOUT.toSeconds(), TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return receivedUpdates;
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
        stubFor(post(urlMatching("/bot[^/]+/getUpdates"))
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
