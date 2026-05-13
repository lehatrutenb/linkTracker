package backend.academy.linktracker.bot;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static com.github.tomakehurst.wiremock.stubbing.Scenario.STARTED;

import backend.academy.linktracker.bot.adapters.controllers.UpdatesApi;
import backend.academy.linktracker.bot.testutils.TelegramBotTestUtils;
import backend.academy.linktracker.bot.testutils.TelegramBotTestUtils.Message;
import com.github.tomakehurst.wiremock.client.WireMock;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;
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
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.RestClient;
import org.wiremock.spring.EnableWireMock;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
@ActiveProfiles("test")
@EnableWireMock
@DirtiesContext(
        classMode =
                DirtiesContext.ClassMode
                        .AFTER_EACH_TEST_METHOD) // Need cause has repository bean that serves requests statuses
class TelegramBotIntegrationTest implements WithAssertions {
    RestClient restClient;

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
        stubFor(post(urlMatching(".*/setMyCommands")) // TODO maybe don't need such format but just
                // withHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)?
                .willReturn(aResponse().withStatus(200).withBody("{\"ok\":true,\"result\":true}")));
        stubFor(
                post(urlMatching(".*/sendMessage"))
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody(
                                                "{\"ok\":true,\"result\":{\"message_id\":1,\"chat\":{\"id\":123},\"date\":1234567890,\"text\":\"\"}}")));
    }

    @BeforeEach
    void setupBotClient(@Value("${local.server.port}") String linkTrackerAppPort) {
        restClient = RestClient.create("http://localhost:" + linkTrackerAppPort);
    }

    @AfterEach
    void cleanWireMock() {
        WireMock.reset();
        WireMock.resetAllRequests();
        WireMock.resetAllScenarios();
        WireMock.resetToDefault();
    }

    @Test
    @Timeout(10)
    void initializingSendsCommandMenuSet() throws InterruptedException {
        Thread.sleep(3000);

        verify(postRequestedFor(urlMatching(".*/setMyCommands")));
    }

    @Test
    @Timeout(10)
    void startSendsResievesReply() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("startSendsResievesReply");

        testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message(1, "/start"));
        var response = testUtils.waitAndGetUpdates(1).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help")
                .contains("Добро пожаловать!");
    }

    @Test
    @Timeout(10)
    void helpSendsResievesCommands() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("helpSendsResievesCommands");

        testUtils.writeMessageToBot(STARTED, "help_command_resieved", new Message(1, "/help"));
        var response = testUtils.waitAndGetUpdates(1).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help")
                .contains("/start");
    }

    @Test
    @Timeout(10)
    void unknownCommandSendsResievesMessageWithHelp() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("unknownCommandSendsResievesMessageWithHelp");

        testUtils.writeMessageToBot(STARTED, "unknown_command_resieved", new Message(1, "/unknownCommand"));
        var response = testUtils.waitAndGetUpdates(1).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help");
    }

    @Test
    @Timeout(10)
    void unexpectedMessageSendsResievesMessageWithHelp() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("unexpectedMessageSendsResievesMessageWithHelp");

        testUtils.writeMessageToBot(STARTED, "unexpected_message_resieved", new Message(1, "unexpected message"));
        var response = testUtils.waitAndGetUpdates(1).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help");
    }

    @Test
    @Timeout(10)
    void updatesSendsReceivesOK() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("updatesSendsReceivesOK");

        testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message(1, 1, "/start"));
        var response = restClient
                .method(HttpMethod.POST)
                .uri(UpdatesApi._PATH_UPDATES_POST)
                .contentType(MediaType.APPLICATION_JSON)
                .body("{\"id\":1,\"url\":\"https://test.com\",\"description\":\"Test\",\"tgChatIds\":[1]}")
                .retrieve()
                .toBodilessEntity();

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Timeout(10)
    @ParameterizedTest
    @ValueSource(
            strings = {
                "{\"id\":1,\"url\":\"https://test.com\",\"description\":\"Test\",\"tgChatIds\":[\"wrongChatID\"]}",
                "{\"url\":\"https://test.com\",\"description\":\"Test\",\"tgChatIds\":[1]}",
                "{}"
            })
    void invalidUpdatesSendsReceivesError(String invalidUpdateBody) {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("invalidUpdatesSendsReceivesError");

        testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message(1, 1, "/start"));

        Supplier<?> doResponse = () -> restClient
                .method(HttpMethod.POST)
                .uri(UpdatesApi._PATH_UPDATES_POST)
                .contentType(MediaType.APPLICATION_JSON)
                .body(invalidUpdateBody)
                .retrieve()
                .toBodilessEntity();

        assertThatThrownBy(doResponse::get);
    }

    @Test
    void updateWithNullMessageAndIDSendsNoPanic() {
        assertThatThrownBy(() -> linkTracerFacade.processLinkTrackerUpdates(List.of(new Update())))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
