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

import backend.academy.linktracker.bot.adapter.controller.UpdatesApiController;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils.Message;
import backend.academy.linktracker.bot.usecase.LinkTracerFacade;
import backend.academy.linktracker.bot.usecase.dto.generated.ApiErrorResponse;
import backend.academy.linktracker.bot.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.bot.usecase.exception.BadOuterRequestException;
import backend.academy.linktracker.bot.usecase.exception.ConflictException;
import backend.academy.linktracker.bot.usecase.exception.NotFoundException;
import backend.academy.linktracker.bot.usecase.exception.OuterServiceInnerException;
import backend.academy.linktracker.bot.usecase.service.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.service.TelegramBotInitStateSetterService;
import backend.academy.linktracker.bot.usecase.service.command.CancelMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.ListMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.TrackMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.UntrackMessageHandler;
import com.pengrad.telegrambot.model.Update;
import io.netty.handler.codec.http.HttpHeaderNames;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.VarHandle;
import java.util.List;
import java.util.function.Supplier;
import lombok.SneakyThrows;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.BeforeAll;
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
class TelegramBotIntegrationTest implements WithAssertions {
    private static final String TRACK_URL = "https://stackoverflow.com/questions/4568645";

    static RestClient restClient;

    @Container
    @ServiceConnection
    static PostgreSQLContainer postgres = new PostgreSQLContainer("postgres:18-alpine");

    @Autowired
    private TelegramBotInitStateSetterService telegramBotInitStateSetterService;

    @Autowired
    private LinkTracerFacade linkTracerFacade;

    @MockitoBean
    private ScrapperUpdatesService scrapperUpdatesService;

    void setupWireMock() {
        stubFor(post(urlMatching(".*/getUpdates"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), MediaType.APPLICATION_JSON_VALUE)
                        .withBody("{\"ok\":true,\"result\":[]}")));
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

    @BeforeAll
    static void setupBeforeAll(@Value("${local.server.port}") String linkTrackerAppPort) {
        restClient = RestClient.create("http://localhost:" + linkTrackerAppPort);
    }

    @BeforeEach
    void setupBeforeEach() {
        reset();
        resetAllRequests();
        resetAllScenarios();
        resetToDefault();
        setupWireMock();
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

        var chatID = testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message("/start"));
        var response =
                testUtils.waitAndGetBotResponses(1, List.of(chatID)).stream().findFirst();

        assertThat(response).isPresent();
        assertThat(response.orElseThrow()).contains("/help").contains("Добро пожаловать!");
    }

    @Test
    @Timeout(100)
    void helpSendsResievesCommands() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("helpSendsResievesCommands");

        var chatID = testUtils.writeMessageToBot(STARTED, "help_command_resieved", new Message("/help"));
        var response =
                testUtils.waitAndGetBotResponses(1, List.of(chatID)).stream().findFirst();

        assertThat(response).isPresent();
        assertThat(response.orElseThrow()).contains("/help").contains("/start");
    }

    @Test
    @Timeout(100)
    void unknownCommandSendsResievesMessageWithHelp() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("unknownCommandSendsResievesMessageWithHelp");

        var chatID = testUtils.writeMessageToBot(STARTED, "unknown_command_resieved", new Message("/unknownCommand"));
        var response =
                testUtils.waitAndGetBotResponses(1, List.of(chatID)).stream().findFirst();

        assertThat(response).isPresent();
        assertThat(response.orElseThrow()).contains("/help");
    }

    @Test
    @Timeout(100)
    void unexpectedMessageSendsResievesMessageWithHelp() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("unexpectedMessageSendsResievesMessageWithHelp");

        var chatID =
                testUtils.writeMessageToBot(STARTED, "unexpected_message_resieved", new Message("unexpected message"));
        var response =
                testUtils.waitAndGetBotResponses(1, List.of(chatID)).stream().findFirst();

        assertThat(response).isPresent();
        assertThat(response.orElseThrow()).contains("/help");
    }

    @Test
    @SneakyThrows
    @Timeout(100)
    void updatesSendsReceivesOK() {
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenReturn(new LinkResponse().id(1L));
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("updatesSendsReceivesOK");
        var chatID = TelegramBotTestUtils.getFreeChatID();

        testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message(chatID, "/start"));
        testUtils.waitAndGetBotResponses(1, List.of(chatID));
        var response = restClient
                .method(HttpMethod.POST)
                .uri(UpdatesApiController.PATH_UPDATES_POST)
                .contentType(MediaType.APPLICATION_JSON)
                .body("{\"id\":1,\"url\":\"https://test.com\",\"description\":\"Test\",\"tgChatIds\":[" + chatID + "]}")
                .retrieve()
                .toBodilessEntity();

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Timeout(100)
    @ParameterizedTest
    @SneakyThrows
    @ValueSource(
            strings = {
                "{\"id\":1,\"url\":\"https://test.com\",\"description\":\"Test\",\"tgChatIds\":[\"wrongChatID\"]}",
                "{\"url\":\"https://test.com\",\"description\":\"Test\",\"tgChatIds\":[1]}",
                "{}"
            })
    void invalidUpdatesSendsReceivesError(String invalidUpdateBody) {
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenReturn(new LinkResponse().id(1L));
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("invalidUpdatesSendsReceivesError");

        var chatID = testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message("/start"));
        testUtils.waitAndGetBotResponses(1, List.of(chatID));
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
    @SneakyThrows
    @Timeout(100)
    void trackWhenScrapperReturnsBadRequestSendsInvalidUrlReply() {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("trackWhenScrapperReturnsBadRequestSendsInvalidUrlReply");
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenThrow(new BadOuterRequestException("trackLink", "test error"));

        var chatID =
                testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", TRACK_URL, "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(TrackMessageHandler.INVALID_URL_REPLY);
    }

    @Test
    @SneakyThrows
    @Timeout(100)
    void trackWhenScrapperReturnsConflictSendsAlreadyTrackedReply() {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("trackWhenScrapperReturnsConflictSendsAlreadyTrackedReply");
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenThrow(new ConflictException("trackLink", "test error"));

        var chatID =
                testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", TRACK_URL, "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(TrackMessageHandler.URL_ALREADY_TRACKED_REPLY);
    }

    @Test
    @SneakyThrows
    @Timeout(100)
    void listWhenScrapperReturnsNotFoundSendsNoLinksReply() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("listWhenScrapperReturnsNotFoundSendsNoLinksReply");
        when(scrapperUpdatesService.listLinks(any())).thenThrow(new NotFoundException("listLinks", "test error"));

        var chatID = testUtils.writeMessageToBot(STARTED, "list_command_resieved", new Message("/list"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(1, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(1);
        assertThat(responses).last().isEqualTo(ListMessageHandler.NO_LINKS_TRACKED_URL_REPLY);
    }

    @Test
    @SneakyThrows
    @Timeout(100)
    void untrackWhenScrapperReturnsNotFoundSendsUntrackedReply() {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("untrackWhenScrapperReturnsNotFoundSendsUntrackedReply");
        when(scrapperUpdatesService.untrackLink(any(), anyString()))
                .thenThrow(new NotFoundException("untrackLink", "test error"));
        var chatID = TelegramBotTestUtils.getFreeChatID();

        testUtils.writeMessageToBot(STARTED, "untrack_command_resieved", new Message(chatID, "/untrack"));
        testUtils.writeMessageToBot("untrack_command_resieved", "untrack_url_resieved", new Message(chatID, TRACK_URL));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(2, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(2);
        assertThat(responses).last().isEqualTo(UntrackMessageHandler.UNTRACKED_URL_REPLY);
    }

    @Test
    @SneakyThrows
    @Timeout(100)
    void trackWhenScrapperReturns500SendsInternalErrorReply() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackWhenScrapperReturns500SendsInternalErrorReply");
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenThrow(new OuterServiceInnerException(new ApiErrorResponse().description("test error")));

        var chatID =
                testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", TRACK_URL, "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3);
        assertThat(responses).last().isEqualTo(CancelMessageHandler.ERROR_REPLY);
    }

    @Test
    @SneakyThrows
    @Timeout(100)
    void trackWhenScrapperConnectionFailsSendsInternalErrorReply() {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("trackWhenScrapperConnectionFailsSendsInternalErrorReply");
        when(scrapperUpdatesService.trackLink(any(), anyString(), anyList(), anyList()))
                .thenThrow(new RuntimeException("connection reset"));

        var chatID =
                testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", TRACK_URL, "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, List.of(chatID));

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
