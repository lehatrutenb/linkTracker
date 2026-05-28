package backend.academy.linktracker;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.reset;
import static com.github.tomakehurst.wiremock.client.WireMock.resetAllRequests;
import static com.github.tomakehurst.wiremock.client.WireMock.resetAllScenarios;
import static com.github.tomakehurst.wiremock.client.WireMock.resetToDefault;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.stubbing.Scenario.STARTED;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import backend.academy.linktracker.bot.BotApplication;
import backend.academy.linktracker.bot.adapter.client.LinkTracerUserEventClient;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils.Message;
import backend.academy.linktracker.bot.usecase.service.ScrapperUpdatesHandleService;
import backend.academy.linktracker.bot.usecase.service.command.ListMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.TrackMessageHandler;
import backend.academy.linktracker.bot.usecase.service.command.UntrackMessageHandler;
import backend.academy.linktracker.scrapper.ScrapperApplication;
import io.netty.handler.codec.http.HttpHeaderNames;
import java.util.List;
import java.util.Map;
import org.assertj.core.api.InstanceOfAssertFactories;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.api.extension.RegisterExtension;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.Ordered;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.wiremock.spring.EnableWireMock;

@SpringBootTest(classes = TestApplication.class)
@ActiveProfiles("test")
@EnableWireMock
class TgBotWithScrapperIntegrationTest implements WithAssertions {
    private static final String SCRAPPER_API_PATH = "http://localhost:18081";
    private static final String BOT_API_PATH = "http://localhost:18080";

    @RegisterExtension
    static SharedPostgresContainer postgresContainer = new SharedPostgresContainer();

    @Autowired
    private JdbcClient jdbcClient;

    @RegisterExtension
    static StatefulApplicationTestExtension tgBot = new DatasourcedApplicationTestExtension(
            BotApplication.class,
            postgresContainer,
            "--server.port=18080",
            "--app.scrapper.api-path=" + SCRAPPER_API_PATH);

    @RegisterExtension
    static StatefulApplicationTestExtension scrapper = new DatasourcedApplicationTestExtension(
            ScrapperApplication.class,
            postgresContainer,
            "--server.port=18081",
            "--app.scrapper.api-path=" + BOT_API_PATH,
            "--app.telegram.link.tracker.api-path=" + BOT_API_PATH);

    @Value("${wiremock.server.baseUrl}")
    private String wiremockBaseUrl;

    @DynamicPropertySource
    static void postgresProperties(DynamicPropertyRegistry registry) { // Add to use jdbcClient
        registry.add("spring.datasource.url", SharedPostgresContainer::getJdbcUrl);
        registry.add("spring.datasource.username", SharedPostgresContainer::getUsername);
        registry.add("spring.datasource.password", SharedPostgresContainer::getPassword);
    }

    static void configConnections() {
        scrapper.addProperties(
                "test-config",
                Map.of("app.telegram.link.tracker.api-path", "http://localhost:" + tgBot.getServerPort()));
        scrapper.refreshScope();

        tgBot.addProperties(
                "test-config", Map.of("app.scrapper.api-path", "http://localhost:" + scrapper.getServerPort()));
        tgBot.refreshScope();
    }

    // TODO Move to bot test config?
    void setupWireMock() {
        stubFor(post(urlMatching(".*/setMyCommands"))
                .atPriority(Integer.MAX_VALUE)
                .willReturn(aResponse().withStatus(200).withBody("{\"ok\":true,\"result\":true}")));
        stubFor(
                post(urlMatching(".*/sendMessage"))
                        .atPriority(Integer.MAX_VALUE)
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody(
                                                "{\"ok\":true,\"result\":{\"message_id\":1,\"chat\":{\"id\":123},\"date\":1234567890,\"text\":\"\"}}")));
    }

    @BeforeEach
    @Order(Ordered.LOWEST_PRECEDENCE)
    void setupBeforeEach() {
        configConnections();

        reset();
        resetAllRequests();
        resetAllScenarios();
        resetToDefault();
        setupWireMock();

        jdbcClient
                .sql(
                        "TRUNCATE TABLE telegram_bot_user,bot_chat,chat_shared_state,event,link_update,telegram_bot_message,shared_state_messages_mapping,link_update_bot_chats_mapping CASCADE")
                .update();
        jdbcClient
                .sql(
                        "TRUNCATE TABLE link_listener, scrapper_link, link_metadata, link_tag, link_metadata_tags_mapping CASCADE")
                .update();

        scrapper.refreshScope(); // Can not to refresh scopes, cause currently rerun, but let it be
        tgBot.refreshScope();
    }

    @AfterEach
    void teardownAfterEach() {
        tgBot.getBean(LinkTracerUserEventClient.class).stopListener();
    }

    @Timeout(100)
    @ParameterizedTest
    @ValueSource(
            strings = {
                "tbank://github.com/user/repo",
                "https://github.com/openclaw/openclaw/issues/56480",
                "https://stackoverflow.com/users/23469470/lehatr"
            })
    void trackSendsInvalidURLReceivesErrorReply(String invalidURL) {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackSendsInvalidURLReceivesErrorReply");

        var chatID =
                testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", invalidURL, "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3).containsOnlyOnce(TrackMessageHandler.INVALID_URL_REPLY);
    }

    @Timeout(100)
    @ParameterizedTest
    @ValueSource(strings = {"https://stackoverflow.com/questions/4568645", "https://github.com/openclaw/openclaw"})
    void trackSendsReceivesReply(String validURL) {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackSendsReceivesReply");

        var chatID =
                testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", validURL, "-"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses)
                .hasSize(3)
                .containsExactly(
                        TrackMessageHandler.BASIC_TRACK_REPLY,
                        TrackMessageHandler.BASIC_URL_REPLY,
                        TrackMessageHandler.BASIC_TAGS_REPLY);
    }

    @Timeout(100)
    @ParameterizedTest
    @ValueSource(strings = {"https://stackoverflow.com/questions/4568645", "https://github.com/openclaw/openclaw"})
    void trackSendsTwiceReceivesErrorReply(String validURL) {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackSendsTwiceReceivesErrorReply");

        var chatID =
                testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", validURL, "-"));
        testUtils.trackURL(
                new TelegramBotTestUtils.TrackURLRequest("tags_resieved", "tags_resieved2", validURL, "-", chatID));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(6, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(6).containsOnlyOnce(TrackMessageHandler.URL_ALREADY_TRACKED_REPLY);
    }

    @Timeout(100)
    @Test
    void listNoTrackedSendsReceivesBlankReply() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("listNoTrackedSendsReceivesBlankReply");

        var chatID = testUtils.writeMessageToBot(
                STARTED, "list_command_resieved", new TelegramBotTestUtils.Message("/list"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(1, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses).singleElement().isEqualTo(ListMessageHandler.NO_LINKS_TRACKED_URL_REPLY);
    }

    @Timeout(100)
    @Test
    void listSendsReceivesReply() {
        String url1 = "https://stackoverflow.com/questions/4568645";
        String url2 = "https://github.com/openclaw/openclaw";
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("listSendsReceivesReply");

        var chatID = testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", url1, "-"));
        testUtils.trackURL(
                new TelegramBotTestUtils.TrackURLRequest("tags_resieved", "tags_resieved2", url2, "-", chatID));
        testUtils.writeMessageToBot(
                STARTED, "list_command_resieved", new TelegramBotTestUtils.Message(chatID, "/list"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(7, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses)
                .hasSize(7)
                .asString()
                .containsOnlyOnce(ListMessageHandler.BASIC_REPLY)
                .containsOnlyOnce(url1)
                .containsOnlyOnce(url2);
    }

    @Timeout(100)
    @Test
    void listWithTagsSendsReceivesFilteredReply() {
        String url1 = "https://stackoverflow.com/questions/4568645";
        String url2 = "https://github.com/openclaw/openclaw";
        String tagStackOverflowToList = "tagStackOverflow";
        String tagGithub = "tagGithub";
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("listWithTagsSendsReceivesFilteredReply");

        var chatID = testUtils.trackURL(
                new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", url1, tagStackOverflowToList));
        testUtils.trackURL(
                new TelegramBotTestUtils.TrackURLRequest("tags_resieved", "tags_resieved2", url2, tagGithub, chatID));
        testUtils.writeMessageToBot(
                STARTED,
                "list_command_resieved",
                new TelegramBotTestUtils.Message(chatID, "/list " + tagStackOverflowToList));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(7, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses)
                .hasSize(7)
                .last()
                .asString()
                .containsOnlyOnce(ListMessageHandler.BASIC_REPLY)
                .containsOnlyOnce(url1)
                .containsOnlyOnce(tagStackOverflowToList)
                .doesNotContain(url2)
                .doesNotContain(tagGithub);
    }

    @Timeout(100)
    @Test
    void untrackSendsReceivesReplyAndRemovesLink() {
        String url = "https://stackoverflow.com/questions/4568645";
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("untrackSendsReceivesReplyAndRemovesLink");

        var chatID = testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", url, "-"));
        testUtils.writeMessageToBot(
                "tags_resieved", "untrack_command_resieved", new TelegramBotTestUtils.Message(chatID, "/untrack"));
        testUtils.writeMessageToBot(
                "untrack_command_resieved", "untrack_url_resieved", new TelegramBotTestUtils.Message(chatID, url));
        testUtils.writeMessageToBot(
                "untrack_url_resieved", "list_command_resieved", new TelegramBotTestUtils.Message(chatID, "/list"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(6, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses)
                .hasSize(6)
                .asString()
                .containsOnlyOnce(TrackMessageHandler.BASIC_TRACK_REPLY)
                .containsOnlyOnce(TrackMessageHandler.BASIC_TAGS_REPLY)
                .containsOnlyOnce(UntrackMessageHandler.BASIC_TRACK_REPLY)
                .containsOnlyOnce(UntrackMessageHandler.BASIC_URL_REPLY)
                .containsOnlyOnce(ListMessageHandler.NO_LINKS_TRACKED_URL_REPLY);
    }

    @Timeout(100)
    @Test
    void cancelTrackFlowSendsReceivesBlankReplyAndResetsState() {
        TelegramBotTestUtils testUtils =
                new TelegramBotTestUtils("cancelTrackFlowSendsReceivesBlankReplyAndResetsState");
        var chatID = TelegramBotTestUtils.getFreeChatID();

        testUtils.writeMessageToBot(
                STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(chatID, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved",
                "cancel_command_resieved",
                new TelegramBotTestUtils.Message(chatID, "/cancel"));
        testUtils.writeMessageToBot(
                "cancel_command_resieved", "list_command_resieved", new TelegramBotTestUtils.Message(chatID, "/list"));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(3, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses)
                .hasSize(3)
                .asString()
                .containsOnlyOnce(TrackMessageHandler.BASIC_TRACK_REPLY)
                .containsOnlyOnce(ListMessageHandler.NO_LINKS_TRACKED_URL_REPLY);
    }

    @Timeout(100)
    @Test
    void trackSendsReceivesReplyInSenderChat() {
        String url = "https://stackoverflow.com/questions/4568645";
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackSendsReceivesReplyInSenderChat");
        var chatID = TelegramBotTestUtils.getFreeChatID();

        stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/answers.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), APPLICATION_JSON_VALUE)
                        .withBodyFile("exampleStackOverflowGetAnswersResponse.json")));
        testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(STARTED, "tags_resieved", url, "-", chatID));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponses(4, List.of(chatID));

        assertThat(responses).isNotEmpty();
        assertThat(responses)
                .hasSize(4)
                .last()
                .asString()
                .matches(ScrapperUpdatesHandleService.BASIC_REPLY.replace("%s", ".*"))
                .containsOnlyOnce(url);
    }

    @Timeout(100)
    @Test
    void trackSendsNotReceivesReplyInNotSenderChat() {
        String url = "https://stackoverflow.com/questions/4568645";
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackSendsNotReceivesReplyInNotSenderChat");
        var chatIDSender = TelegramBotTestUtils.getFreeChatID();
        var chatIDNotSender = TelegramBotTestUtils.getFreeChatID();

        stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/answers.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader(HttpHeaderNames.CONTENT_TYPE.toString(), APPLICATION_JSON_VALUE)
                        .withBodyFile("exampleStackOverflowGetAnswersResponse.json")));
        testUtils.writeMessageToBot(STARTED, "start_command_resieved", new Message(chatIDSender, "/start"));
        testUtils.trackURL(new TelegramBotTestUtils.TrackURLRequest(
                "start_command_resieved", "tags_resieved", url, "-", chatIDNotSender));
        testUtils.repeatLastMessageLastState();
        var responses = testUtils.waitAndGetBotResponsesByChatID(10, List.of(chatIDSender, chatIDNotSender));

        assertThat(responses).isNotEmpty();
        assertThat(responses)
                .hasSize(2)
                .containsKeys(String.valueOf(chatIDSender), String.valueOf(chatIDNotSender))
                .extractingByKey(String.valueOf(chatIDNotSender), as(InstanceOfAssertFactories.STREAM))
                .hasSize(9); // All messages, but not start response to another chat
    }

    @Nested
    @DisplayName("DB tests")
    class DBTests {
        private List<String> publicBaseTableNames() {
            return jdbcClient.sql("""
                        SELECT table_name FROM information_schema.tables
                        WHERE table_schema = 'public' AND table_type = 'BASE TABLE'
                    """).query(String.class).list();
        }

        @Test
        void botMigrationTablesExist() {
            assertThat(publicBaseTableNames())
                    .contains(
                            "telegram_bot_user",
                            "bot_chat",
                            "chat_shared_state",
                            "event",
                            "link_update",
                            "telegram_bot_message",
                            "shared_state_messages_mapping",
                            "link_update_bot_chats_mapping");
        }

        @Test
        void scrapperMigrationTablesExist() {
            assertThat(publicBaseTableNames())
                    .contains(
                            "scrapper_link",
                            "link_listener",
                            "link_metadata",
                            "link_tag",
                            "link_metadata_tags_mapping");
        }
    }
}
