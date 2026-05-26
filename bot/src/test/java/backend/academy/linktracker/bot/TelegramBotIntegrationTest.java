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

import backend.academy.linktracker.bot.adapter.client.LinkTracerUserEventClient;
import backend.academy.linktracker.bot.adapter.controller.UpdatesApiController;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils.Message;
import backend.academy.linktracker.bot.usecase.LinkTracerFacade;
import backend.academy.linktracker.bot.usecase.dto.generated.ApiErrorResponse;
import backend.academy.linktracker.bot.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.bot.usecase.exception.BadOuterRequestException;
import backend.academy.linktracker.bot.usecase.exception.ConflictException;
import backend.academy.linktracker.bot.usecase.exception.DomainException;
import backend.academy.linktracker.bot.usecase.exception.NotFoundException;
import backend.academy.linktracker.bot.usecase.exception.OuterServiceInnerException;
import backend.academy.linktracker.bot.usecase.service.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.service.command.CancelMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.ListMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.TrackMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.UntrackMessageHandler;
import com.pengrad.telegrambot.model.Update;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
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
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;
import org.testcontainers.junit.jupiter.Container;
import org.testcontainers.junit.jupiter.Testcontainers;
import org.testcontainers.postgresql.PostgreSQLContainer;
import org.wiremock.spring.EnableWireMock;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
@ActiveProfiles("test")
@EnableWireMock
@Testcontainers
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
    private LinkTracerUserEventClient linkTracerUserEventController;

    @Autowired
    private LinkTracerFacade linkTracerFacade;

    @MockitoBean
    private ScrapperUpdatesService scrapperUpdatesService;

    void setupWireMock() {
        stubFor(post(urlMatching(".*/setMyCommands")) // TODO maybe don't need such format but just
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
    @Timeout(100)
    void initializingSendsCommandMenuSet() throws InterruptedException {
        Thread.sleep(3000);

        verify(postRequestedFor(urlMatching(".*/setMyCommands")));
    }

    @Test
    @Timeout(100)
    void startSendsResievesReply() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("startSendsResievesReply");

        testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message(1, "/start"));
        var response =
                testUtils.waitAndGetUpdates(1, Duration.ofSeconds(100)).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help")
                .contains("Добро пожаловать!");
    }

    @Test
    @Timeout(100)
    void helpSendsResievesCommands() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("helpSendsResievesCommands");

        testUtils.writeMessageToBot(STARTED, "help_command_resieved", new Message(1, "/help"));
        var response =
                testUtils.waitAndGetUpdates(1, Duration.ofSeconds(100)).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help")
                .contains("/start");
    }

    @Test
    @Timeout(100)
    void unknownCommandSendsResievesMessageWithHelp() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("unknownCommandSendsResievesMessageWithHelp");

        testUtils.writeMessageToBot(STARTED, "unknown_command_resieved", new Message(1, "/unknownCommand"));
        var response =
                testUtils.waitAndGetUpdates(1, Duration.ofSeconds(100)).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help");
    }

    @Test
    @Timeout(100)
    void unexpectedMessageSendsResievesMessageWithHelp() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("unexpectedMessageSendsResievesMessageWithHelp");

        testUtils.writeMessageToBot(STARTED, "unexpected_message_resieved", new Message(1, "unexpected message"));
        var response =
                testUtils.waitAndGetUpdates(1, Duration.ofSeconds(100)).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help");
    }

    @Test
    @Timeout(100)
    void updatesSendsReceivesOK() throws DomainException {
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenReturn(new LinkResponse().id(1L));

        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("updatesSendsReceivesOK");
        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(1, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(2, "https://test.com"));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(3, "-"));
        testUtils.repeatLastMessage("tags_resieved", "tags_resieved", 4);
        testUtils.waitAndGetBotResponses(3, Duration.ofSeconds(100));

        var response = restClient
                .method(HttpMethod.POST)
                .uri(UpdatesApiController.PATH_UPDATES_POST)
                .contentType(MediaType.APPLICATION_JSON)
                .body("{\"id\":1,\"url\":\"https://test.com\",\"description\":\"Test\",\"tgChatIds\":[1]}")
                .retrieve()
                .toBodilessEntity();

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Timeout(100)
    @ParameterizedTest
    @ValueSource(
            strings = {
                "{\"id\":1,\"url\":\"https://test.com\",\"description\":\"Test\",\"tgChatIds\":[\"wrongChatID\"]}",
                "{\"url\":\"https://test.com\",\"description\":\"Test\",\"tgChatIds\":[1]}",
                "{}"
            })
    void invalidUpdatesSendsReceivesError(String invalidUpdateBody) throws DomainException {
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenReturn(new LinkResponse().id(1L));

        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("invalidUpdatesSendsReceivesError");
        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(1, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(2, "https://test.com"));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(3, "-"));
        testUtils.repeatLastMessage("tags_resieved", "tags_resieved", 4);
        testUtils.waitAndGetBotResponses(3, Duration.ofSeconds(100));

        Supplier<?> doResponse = () -> restClient
                .method(HttpMethod.POST)
                .uri(UpdatesApiController.PATH_UPDATES_POST)
                .contentType(MediaType.APPLICATION_JSON)
                .body(invalidUpdateBody)
                .retrieve()
                .toBodilessEntity();

        assertThatThrownBy(doResponse::get).isInstanceOfSatisfying(HttpClientErrorException.class, exception -> {
            assertThat(exception.getStatusCode()).isEqualTo(HttpStatus.BAD_REQUEST);
        });
    }

    @Test
    @Timeout(100)
    void trackWhenScrapperReturnsBadRequestSendsInvalidUrlReply() throws DomainException {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("trackWhenScrapperReturnsBadRequestSendsInvalidUrlReply");
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenThrow(new BadOuterRequestException("trackLink", "test error"));

        testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", "https://test.com", "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, Duration.ofSeconds(100));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(TrackMessageHandler.INVALID_URL_REPLY);
    }

    @Test
    @Timeout(100)
    void trackWhenScrapperReturnsConflictSendsAlreadyTrackedReply() throws DomainException {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("trackWhenScrapperReturnsConflictSendsAlreadyTrackedReply");
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenThrow(new ConflictException("trackLink", "test error"));

        testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", "https://test.com", "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, Duration.ofSeconds(100));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(TrackMessageHandler.URL_ALREADY_TRACKED_REPLY);
    }

    @Test
    @Timeout(100)
    void listWhenScrapperReturnsNotFoundSendsNoLinksReply() throws DomainException {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("listWhenScrapperReturnsNotFoundSendsNoLinksReply");
        when(scrapperUpdatesService.listLinks(any())).thenThrow(new NotFoundException("listLinks", "test error"));

        testUtils.writeMessageToBot(STARTED, "list_command_resieved", new Message("/list"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(1, Duration.ofSeconds(100));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(1);
        assertThat(responses).last().isEqualTo(ListMessageHandler.NO_LINKS_TRACKED_URL_REPLY);
    }

    @Test
    @Timeout(100)
    void untrackWhenScrapperReturnsNotFoundSendsUntrackedReply() throws DomainException {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("untrackWhenScrapperReturnsNotFoundSendsUntrackedReply");
        when(scrapperUpdatesService.untrackLink(any(), anyString()))
                .thenThrow(new NotFoundException("untrackLink", "test error"));

        testUtils.writeMessageToBot(STARTED, "untrack_command_resieved", new Message("/untrack"));
        testUtils.writeMessageToBot(
                "untrack_command_resieved", "untrack_url_resieved", new Message(2, "https://test.com"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(2);

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(2);
        assertThat(responses).last().isEqualTo(UntrackMessageHandler.UNTRACKED_URL_REPLY);
    }

    @Test
    @Timeout(100)
    void trackWhenScrapperReturns500SendsInternalErrorReply() throws DomainException {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackWhenScrapperReturns500SendsInternalErrorReply");
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenThrow(new OuterServiceInnerException(new ApiErrorResponse().description("test error")));

        testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", "https://test.com", "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3);

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(CancelMessageHandler.ERROR_REPLY);
    }

    @Test
    @Timeout(100)
    void trackWhenScrapperConnectionFailsSendsInternalErrorReply() throws DomainException {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("trackWhenScrapperConnectionFailsSendsInternalErrorReply");
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenThrow(new RuntimeException("connection reset"));

        testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", "https://test.com", "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3);

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(CancelMessageHandler.ERROR_REPLY);
    }

    @Test
    void updateWithNullMessageAndIDSendsNoPanic() {
        assertThatThrownBy(() -> linkTracerFacade.processLinkTrackerUpdates(List.of(new Update())))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
