package backend.academy.linktracker.bot;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.reset;
import static com.github.tomakehurst.wiremock.client.WireMock.resetAllRequests;
import static com.github.tomakehurst.wiremock.client.WireMock.resetAllScenarios;
import static com.github.tomakehurst.wiremock.client.WireMock.resetToDefault;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static com.github.tomakehurst.wiremock.stubbing.Scenario.STARTED;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

import backend.academy.linktracker.bot.adapter.controller.LinkTrackerUserEventController;
import backend.academy.linktracker.bot.adapter.controller.UpdatesApi;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils.Message;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkResponse;
import backend.academy.linktracker.bot.usecase.services.ScrapperUpdatesService;
import io.github.resilience4j.core.functions.Either;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.Optional;
import java.util.function.Supplier;
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
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.web.client.RestClient;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.postgresql.PostgreSQLContainer;
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

    @Container
    @ServiceConnection
    private static final PostgreSQLContainer postgres = new PostgreSQLContainer("postgres:18-alpine");

    @Autowired
    private JdbcClient jdbcClient;

    @Autowired
    private LinkTrackerUserEventController linkTracerUserEventController;

    @MockitoBean
    private ScrapperUpdatesService scrapperUpdatesService;

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
    void setupBeforeEach(@Value("${local.server.port}") String linkTrackerAppPort) {
        linkTracerUserEventController.stopListener();

        reset();
        resetAllRequests();
        resetAllScenarios();
        resetToDefault();
        setupWireMock();

        jdbcClient
                .sql(
                        "TRUNCATE TABLE telegram_bot_user,bot_chat,chat_shared_state,event,link_update,telegram_bot_message,shared_state_messages_mapping,link_update_bot_chats_mapping CASCADE")
                .update();
        restClient = RestClient.create("http://localhost:" + linkTrackerAppPort);
        linkTracerUserEventController.startListener();
    }

    @AfterEach
    void teardownAfterEach() {
        linkTracerUserEventController.stopListener();
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
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenReturn(Either.left(new LinkResponse().id(1L)));
        when(scrapperUpdatesService.registerChat(any())).thenReturn(Optional.empty());

        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("updatesSendsReceivesOK");
        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(1, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(2, "https://test.com"));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(3, "-"));
        testUtils.repeatLastMessage("tags_resieved", "tags_resieved", 4);
        testUtils.waitAndGetBotResponses(3);

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
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenReturn(Either.left(new LinkResponse().id(1L)));
        when(scrapperUpdatesService.registerChat(any())).thenReturn(Optional.empty());

        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("invalidUpdatesSendsReceivesError");
        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(1, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(2, "https://test.com"));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(3, "-"));
        testUtils.repeatLastMessage("tags_resieved", "tags_resieved", 4);
        testUtils.waitAndGetBotResponses(3);

        Supplier<?> doResponse = () -> restClient
                .method(HttpMethod.POST)
                .uri(UpdatesApi._PATH_UPDATES_POST)
                .contentType(MediaType.APPLICATION_JSON)
                .body(invalidUpdateBody)
                .retrieve()
                .toBodilessEntity();

        assertThatThrownBy(doResponse::get);
    }
}
