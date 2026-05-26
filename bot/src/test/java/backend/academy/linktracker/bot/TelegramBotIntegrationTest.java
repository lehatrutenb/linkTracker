package backend.academy.linktracker.bot;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.delete;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
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

import backend.academy.linktracker.bot.adapter.controller.UpdatesApiController;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils.Message;
import backend.academy.linktracker.bot.usecase.LinkTracerFacade;
import backend.academy.linktracker.bot.usecase.dto.generated.ApiErrorResponse;
import backend.academy.linktracker.bot.usecase.service.TelegramBotInitStateSetterService;
import backend.academy.linktracker.bot.usecase.service.command.CancelMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.ListMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.TrackMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.UntrackMessageHandler;
import com.fasterxml.jackson.databind.json.JsonMapper;
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module;
import com.github.tomakehurst.wiremock.client.WireMock;
import com.github.tomakehurst.wiremock.http.Fault;
import com.pengrad.telegrambot.model.Update;
import io.netty.handler.codec.http.HttpHeaderNames;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import lombok.SneakyThrows;
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
import org.springframework.cloud.context.scope.refresh.RefreshScope;
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
@ActiveProfiles("test")
@EnableWireMock
class TelegramBotIntegrationTest implements WithAssertions {
    private static final String TRACK_URL = "https://stackoverflow.com/questions/4568645";

    private RestClient restClient;

    @Autowired
    private TelegramBotInitStateSetterService telegramBotInitStateSetterService;

    @Autowired
    private LinkTracerFacade linkTracerFacade;

    @Autowired
    private RefreshScope refreshScope;

    @Container
    @ServiceConnection
    private static final PostgreSQLContainer postgres = new PostgreSQLContainer("postgres:18-alpine");

    @Autowired
    private JdbcClient jdbcClient;

    @Autowired
    private LinkTrackerUserEventController linkTracerUserEventController;

    @MockitoBean
    private ScrapperUpdatesService scrapperUpdatesService;

    @BeforeEach
    void setupBeforeEach(@Value("${local.server.port}") String linkTrackerAppPort) {
        stubFor(post(urlMatching(".*/setMyCommands"))
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
        stubFor(post(urlMatching(".*/setMyCommands"))
            .willReturn(aResponse().withStatus(200).withBody("{\"ok\":true,\"result\":true}")));
        stubFor(
            post(urlMatching(".*/sendMessage"))
                .willReturn(
                    aResponse()
                        .withStatus(200)
                        .withBody(
                            "{\"ok\":true,\"result\":{\"message_id\":1,\"chat\":{\"id\":123},\"date\":1234567890,\"text\":\"\"}}")));
        refreshScope.refreshAll();
    }

    @AfterEach
    void teardownAfterEach() {
        linkTracerUserEventController.stopListener();
    }

    @Test
    @SneakyThrows
    @Timeout(100)
    void initializingSendsCommandMenuSet() {
        VarHandle setterStateHandler = MethodHandles.privateLookupIn(
                        TelegramBotInitStateSetterService.class, MethodHandles.lookup())
                .findVarHandle(TelegramBotInitStateSetterService.class, "isStateInited", boolean.class);

        setterStateHandler.set(telegramBotInitStateSetterService, false);
        telegramBotInitStateSetterService.initState();

        verify(postRequestedFor(urlMatching(".*/setMyCommands")));
    }

    @Test
    @Timeout(100)
    void startSendsResievesReply() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("startSendsResievesReply");

        testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message("/start"));
        var response =
                testUtils.waitAndGetUpdates(1, Duration.ofSeconds(10)).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help")
                .contains("Добро пожаловать!");
    }

    @Test
    @Timeout(100)
    void helpSendsResievesCommands() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("helpSendsResievesCommands");

        testUtils.writeMessageToBot(STARTED, "help_command_resieved", new Message("/help"));
        var response =
                testUtils.waitAndGetUpdates(1, Duration.ofSeconds(10)).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help")
                .contains("/start");
    }

    @Test
    @Timeout(100)
    void unknownCommandSendsResievesMessageWithHelp() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("unknownCommandSendsResievesMessageWithHelp");

        testUtils.writeMessageToBot(STARTED, "unknown_command_resieved", new Message("/unknownCommand"));
        var response =
                testUtils.waitAndGetUpdates(1, Duration.ofSeconds(10)).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help");
    }

    @Test
    @Timeout(100)
    void unexpectedMessageSendsResievesMessageWithHelp() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("unexpectedMessageSendsResievesMessageWithHelp");

        testUtils.writeMessageToBot(STARTED, "unexpected_message_resieved", new Message("unexpected message"));
        var response =
                testUtils.waitAndGetUpdates(1, Duration.ofSeconds(10)).stream().findFirst();

        assertThat(response).isNotEmpty();
        assertThat(URLDecoder.decode(response.orElseThrow().getBodyAsString(), StandardCharsets.UTF_8))
                .contains("/help");
    }

    @Test
    @Timeout(100)
    void updatesSendsReceivesOK() {
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenReturn(Either.left(new LinkResponse().id(1L)));
        when(scrapperUpdatesService.registerChat(any())).thenReturn(Optional.empty());

        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("updatesSendsReceivesOK");
        testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message("/start"));
        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message("/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message("https://test.com"));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message("-"));
        testUtils.repeatLastMessage("tags_resieved", "tags_resieved", 4);
        testUtils.waitAndGetBotResponses(3);

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
    void invalidUpdatesSendsReceivesError(String invalidUpdateBody) {
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenReturn(Either.left(new LinkResponse().id(1L)));
        when(scrapperUpdatesService.registerChat(any())).thenReturn(Optional.empty());

        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("invalidUpdatesSendsReceivesError");

        testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message("/start"));
        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message("/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message("https://test.com"));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message("-"));
        testUtils.repeatLastMessage("tags_resieved", "tags_resieved", 4);
        testUtils.waitAndGetBotResponses(3);

        Supplier<?> doResponse = () -> restClient
                .method(HttpMethod.POST)
                .uri(UpdatesApiController.PATH_UPDATES_POST)
                .contentType(MediaType.APPLICATION_JSON)
                .body(invalidUpdateBody)
                .retrieve()
                .toBodilessEntity();

        assertThatThrownBy(doResponse::get);
    }

    @Test
    @Timeout(100)
    void trackWhenScrapperReturnsBadRequestSendsInvalidUrlReply() {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("trackWhenScrapperReturnsBadRequestSendsInvalidUrlReply");

        stubFor(post(urlMatching("/tg-chat/.*")).willReturn(aResponse().withStatus(200)));
        stubFor(post(urlMatching("/links"))
                .willReturn(aResponse()
                        .withStatus(HttpStatus.BAD_REQUEST.value())
                        .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), MediaType.APPLICATION_JSON_VALUE)
                        .withBody(scrapperErrorBody(HttpStatus.BAD_REQUEST))));
        testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", TRACK_URL, "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, Duration.ofSeconds(100));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(TrackMessageHandler.INVALID_URL_REPLY);
    }

    @Test
    @Timeout(100)
    void trackWhenScrapperReturnsConflictSendsAlreadyTrackedReply() {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("trackWhenScrapperReturnsConflictSendsAlreadyTrackedReply");

        stubFor(post(urlMatching("/tg-chat/.*")).willReturn(aResponse().withStatus(200)));
        stubFor(post(urlMatching("/links"))
                .willReturn(aResponse()
                        .withStatus(HttpStatus.CONFLICT.value())
                        .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), MediaType.APPLICATION_JSON_VALUE)
                        .withBody(scrapperErrorBody(HttpStatus.CONFLICT))));
        testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", TRACK_URL, "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, Duration.ofSeconds(100));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(TrackMessageHandler.URL_ALREADY_TRACKED_REPLY);
    }

    @Test
    @Timeout(100)
    void listWhenScrapperReturnsNotFoundSendsNoLinksReply() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("listWhenScrapperReturnsNotFoundSendsNoLinksReply");

        stubFor(get(urlMatching("/links"))
                .willReturn(aResponse()
                        .withStatus(HttpStatus.NOT_FOUND.value())
                        .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), MediaType.APPLICATION_JSON_VALUE)
                        .withBody(scrapperErrorBody(HttpStatus.NOT_FOUND))));
        testUtils.writeMessageToBot(STARTED, "list_command_resieved", new Message("/list"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(1, Duration.ofSeconds(100));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(1);
        assertThat(responses).last().isEqualTo(ListMessageHandler.NO_LINKS_TRACKED_URL_REPLY);
    }

    @Test
    @Timeout(100)
    void untrackWhenScrapperReturnsNotFoundSendsUntrackedReply() {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("untrackWhenScrapperReturnsNotFoundSendsUntrackedReply");
        stubFor(delete(urlMatching("/links"))
                .willReturn(aResponse()
                        .withStatus(HttpStatus.NOT_FOUND.value())
                        .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), MediaType.APPLICATION_JSON_VALUE)
                        .withBody(scrapperErrorBody(HttpStatus.NOT_FOUND))));
        testUtils.writeMessageToBot(STARTED, "untrack_command_resieved", new Message("/untrack"));
        testUtils.writeMessageToBot("untrack_command_resieved", "untrack_url_resieved", new Message(TRACK_URL));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(2, Duration.ofSeconds(100));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(2);
        assertThat(responses).last().isEqualTo(UntrackMessageHandler.UNTRACKED_URL_REPLY);
    }

    @Test
    @Timeout(100)
    void trackWhenScrapperReturns500SendsInternalErrorReply() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackWhenScrapperReturns500SendsInternalErrorReply");

        stubFor(post(urlMatching("/tg-chat/.*")).willReturn(aResponse().withStatus(200)));
        stubFor(post(urlMatching("/links")).willReturn(aResponse().withStatus(500)));
        testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", TRACK_URL, "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, Duration.ofSeconds(100));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(CancelMessageHandler.ERROR_REPLY);
    }

    @Test
    @Timeout(100)
    void trackWhenScrapperConnectionFailsSendsInternalErrorReply() {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("trackWhenScrapperConnectionFailsSendsInternalErrorReply");

        stubFor(post(urlMatching("/tg-chat/.*")).willReturn(aResponse().withStatus(200)));
        stubFor(post(urlMatching("/links")).willReturn(aResponse().withFault(Fault.CONNECTION_RESET_BY_PEER)));
        testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", TRACK_URL, "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, Duration.ofSeconds(100));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(CancelMessageHandler.ERROR_REPLY);
    }

    @Test
    void updateWithNullMessageAndIDSendsNoPanic() {
        assertThatThrownBy(() -> linkTracerFacade.processLinkTrackerUpdates(List.of(new Update())))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @SneakyThrows
    private String scrapperErrorBody(HttpStatus status) {
        JsonMapper mapper = JsonMapper.builder().addModule(new Jdk8Module()).build();
        return mapper.writeValueAsString(new ApiErrorResponse()
                .description("test error")
                .code(String.valueOf(status.value()))
                .exceptionMessage("test error")
                .stacktrace(List.of()));
    }
}
