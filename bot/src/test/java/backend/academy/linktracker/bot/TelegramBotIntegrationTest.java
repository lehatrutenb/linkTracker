package backend.academy.linktracker.bot;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.stubbing.Scenario.STARTED;

import backend.academy.linktracker.bot.usecases.LinkTracerFacade;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Update;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.wiremock.spring.EnableWireMock;

@SpringBootTest
@Import(TestcontainersConfiguration.class)
@ActiveProfiles("test")
@EnableWireMock
@DirtiesContext(
        classMode =
                DirtiesContext.ClassMode
                        .AFTER_EACH_TEST_METHOD) // Need cause has repository bean that serves requests statuses
class TelegramBotIntegrationTest implements WithAssertions {
    @Autowired
    TelegramBot telegramBot;

    @Autowired
    LinkTracerFacade linkTracerFacade;

    @AfterEach
    void clearUpdatesListener() {
        telegramBot.removeGetUpdatesListener();
    }

    @BeforeEach
    void setupWireMock() {
        stubFor(post(urlMatching(".*/setMyCommands"))
                .willReturn(aResponse().withStatus(200).withBody("{ok:true,result:true}")));
    }

    @AfterEach
    void cleanWireMock() {
        WireMock.reset();
        WireMock.resetAllRequests();
        WireMock.resetAllScenarios();
        WireMock.resetToDefault();

        stubFor(post(urlMatching(".*/setMyCommands"))
                .willReturn(aResponse().withStatus(200).withBody("{ok:true,result:true}")));
    }

    @Test
    @Timeout(10)
    void startSendsResievesReply() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils();

        testUtils.writeMessageToBot("start_command_works", STARTED, "start_command_resieved", 1, "/start");
        var response = testUtils.waitAndGetUpdates(1).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help")
                .contains("Добро пожаловать!");
    }

    @Test
    @Timeout(10)
    void helpSendsResievesCommands() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils();

        testUtils.writeMessageToBot("help_command_works", STARTED, "help_command_resieved", 1, "/help");
        var response = testUtils.waitAndGetUpdates(1).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help")
                .contains("/start");
    }

    @Test
    @Timeout(10)
    void unknownCommandSendsResievesMessageWithHelp() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils();

        testUtils.writeMessageToBot(
                "unknown_command_handling", STARTED, "unknown_command_resieved", 1, "/unknownCommand");
        var response = testUtils.waitAndGetUpdates(1).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help");
    }

    @Test
    @Timeout(10)
    void unexpectedMessageSendsResievesMessageWithHelp() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils();

        testUtils.writeMessageToBot(
                "unexpected_message_handling", STARTED, "unexpected_message_resieved", 1, "unexpected message");
        var response = testUtils.waitAndGetUpdates(1).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help");
    }

    @Test
    void updateWithNullMessageAndIDSendsNoPanic() {
        assertThatThrownBy(() -> linkTracerFacade.processUpdates(List.of(new Update())))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
