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
import backend.academy.linktracker.bot.adapter.controller.LinkTrackerUserEventController;
import backend.academy.linktracker.bot.testutil.TelegramBotTestUtils;
import backend.academy.linktracker.bot.usecase.services.ScrapperUpdatesHandleService;
import backend.academy.linktracker.bot.usecase.services.commands.ListMessageHandler;
import backend.academy.linktracker.bot.usecase.services.commands.TrackMessageHandler;
import backend.academy.linktracker.scrapper.ScrapperApplication;
import java.util.List;
import java.util.Map;
import lombok.SneakyThrows;
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
    @RegisterExtension
    static SharedPostgresContainer postgresContainer = new SharedPostgresContainer();

    @Autowired
    private JdbcClient jdbcClient;

    @RegisterExtension
    static StatefulApplicationTestExtension tgBot =
            new DatasourcedApplicationTestExtension(BotApplication.class, postgresContainer, "--server.port=0");

    @RegisterExtension
    static StatefulApplicationTestExtension scrapper =
            new DatasourcedApplicationTestExtension(ScrapperApplication.class, postgresContainer, "--server.port=0");

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
                .atPriority(1)
                .willReturn(aResponse().withStatus(200).withBody("{\"ok\":true,\"result\":true}")));
        stubFor(
                post(urlMatching(".*/sendMessage"))
                        .atPriority(1)
                        .willReturn(
                                aResponse()
                                        .withStatus(200)
                                        .withBody(
                                                "{\"ok\":true,\"result\":{\"message_id\":1,\"chat\":{\"id\":123},\"date\":1234567890,\"text\":\"\"}}")));
    }

    @BeforeEach
    @SneakyThrows
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
        tgBot.getBean(LinkTrackerUserEventController.class).stopListener();
    }

    @Timeout(10)
    @ParameterizedTest
    @ValueSource(
            strings = {
                "tbank://github.com/user/repo",
                "https://github.com/openclaw/openclaw/issues/56480",
                "https://stackoverflow.com/users/23469470/lehatr"
            })
    void trackSendsInvalidURLReceivesErrorReply(String invalidURL) {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackSendsInvalidURLReceivesErrorReply");

        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(1, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(2, invalidURL));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(3, "-"));
        testUtils.repeatLastMessage("tags_resieved", "tags_resieved", 4);
        var responses = testUtils.waitAndGetBotResponses(3);

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(3).containsOnlyOnce(TrackMessageHandler._INVALID_URL_REPLY);
    }

    @Timeout(10)
    @ParameterizedTest
    @ValueSource(strings = {"https://stackoverflow.com/questions/4568645", "https://github.com/openclaw/openclaw"})
    void trackSendsReceivesReply(String validURL) {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackSendsReceivesReply");

        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(1, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(2, validURL));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(3, "-"));
        testUtils.repeatLastMessage("tags_resieved", "tags_resieved", 4);
        var responses = testUtils.waitAndGetBotResponses(3);

        assertThat(responses).isNotEmpty();
        assertThat(responses)
                .hasSize(3)
                .containsExactly(
                        TrackMessageHandler._BASIC_TRACK_REPLY,
                        TrackMessageHandler._BASIC_URL_REPLY,
                        TrackMessageHandler._BASIC_TAGS_REPLY);
    }

    @Timeout(10)
    @ParameterizedTest
    @ValueSource(strings = {"https://stackoverflow.com/questions/4568645", "https://github.com/openclaw/openclaw"})
    void trackSendsTwiceReceivesErrorReply(String validURL) {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackSendsTwiceReceivesErrorReply");

        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(1, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(2, validURL));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(3, "-"));
        testUtils.writeMessageToBot(
                "tags_resieved", "track_command_resieved2", new TelegramBotTestUtils.Message(4, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved2", "url_resieved2", new TelegramBotTestUtils.Message(5, validURL));
        testUtils.writeMessageToBot("url_resieved2", "tags_resieved2", new TelegramBotTestUtils.Message(6, "-"));
        testUtils.repeatLastMessage("tags_resieved2", "tags_resieved2", 7);
        var responses = testUtils.waitAndGetBotResponses(6);

        assertThat(responses).isNotEmpty();
        assertThat(responses).hasSize(6).containsOnlyOnce(TrackMessageHandler._URL_ALREADY_TRACKED_REPLY);
    }

    @Timeout(10)
    @Test
    void listNoTrackedSendsReceivesBlankReply() {
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("listNoTrackedSendsReceivesBlankReply");

        testUtils.writeMessageToBot(STARTED, "list_command_resieved", new TelegramBotTestUtils.Message(1, "/list"));
        testUtils.repeatLastMessage("list_command_resieved", "list_command_resieved", 2);
        var responses = testUtils.waitAndGetBotResponses(1);

        assertThat(responses).isNotEmpty();
        assertThat(responses).singleElement().isEqualTo(ListMessageHandler._NO_LINKS_TRACKED_URL_REPLY);
    }

    @SneakyThrows
    @Timeout(10)
    @Test
    void listSendsReceivesReply() {
        String url1 = "https://stackoverflow.com/questions/4568645";
        String url2 = "https://github.com/openclaw/openclaw";
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("listSendsReceivesReply");

        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(1, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(2, url1));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(3, "-"));
        testUtils.writeMessageToBot(
                "tags_resieved", "track_command_resieved2", new TelegramBotTestUtils.Message(4, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved2", "url_resieved2", new TelegramBotTestUtils.Message(5, url2));
        testUtils.writeMessageToBot("url_resieved2", "tags_resieved2", new TelegramBotTestUtils.Message(6, "-"));
        testUtils.writeMessageToBot(
                "tags_resieved2", "list_command_resieved", new TelegramBotTestUtils.Message(7, "/list"));
        testUtils.repeatLastMessage("list_command_resieved", "list_command_resieved", 8);
        var responses = testUtils.waitAndGetBotResponses(7);

        assertThat(responses).isNotEmpty();
        assertThat(assertThat(responses).hasSize(7).last().actual())
                .containsOnlyOnce(ListMessageHandler._BASIC_REPLY)
                .containsOnlyOnce(url1)
                .containsOnlyOnce(url2);
    }

    @SneakyThrows
    @Timeout(10)
    @Test
    void listWithTagsSendsReceivesFilteredReply() {
        String url1 = "https://stackoverflow.com/questions/4568645";
        String url2 = "https://github.com/openclaw/openclaw";
        String tagStackOverflowToList = "tagStackOverflow";
        String tagGithub = "tagGithub";
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("listWithTagsSendsReceivesFilteredReply");

        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(1, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(2, url1));
        testUtils.writeMessageToBot(
                "url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(3, tagStackOverflowToList));
        testUtils.writeMessageToBot(
                "tags_resieved", "track_command_resieved2", new TelegramBotTestUtils.Message(4, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved2", "url_resieved2", new TelegramBotTestUtils.Message(5, url2));
        testUtils.writeMessageToBot("url_resieved2", "tags_resieved2", new TelegramBotTestUtils.Message(6, tagGithub));
        testUtils.writeMessageToBot(
                "tags_resieved2",
                "list_command_resieved",
                new TelegramBotTestUtils.Message(7, "/list " + tagStackOverflowToList));
        testUtils.repeatLastMessage("list_command_resieved", "list_command_resieved", 8);
        var responses = testUtils.waitAndGetBotResponses(7);

        assertThat(responses).isNotEmpty();
        assertThat(assertThat(responses).hasSize(7).last().actual())
                .containsOnlyOnce(ListMessageHandler._BASIC_REPLY)
                .containsOnlyOnce(url1)
                .containsOnlyOnce(tagStackOverflowToList)
                .doesNotContain(url2)
                .doesNotContain(tagGithub);
    }

    @Timeout(10)
    @Test
    void trackSendsReceivesReplyInSenderChat() {
        String url = "https://stackoverflow.com/questions/4568645"; // TODO Add github too
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackSendsReceivesReplyInSenderChat");

        stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/answers.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", APPLICATION_JSON_VALUE)
                        .withBodyFile("exampleStackOverflowGetAnswersResponse.json")));
        testUtils.writeMessageToBot(STARTED, "track_command_resieved", new TelegramBotTestUtils.Message(1, "/track"));
        testUtils.writeMessageToBot("track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(2, url));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(3, "-"));
        testUtils.repeatLastMessage("tags_resieved", "tags_resieved", 4);
        var responses = testUtils.waitAndGetBotResponses(4);

        assertThat(responses).isNotEmpty();
        assertThat(assertThat(responses).hasSize(4).last().actual())
                .matches(ScrapperUpdatesHandleService._BASIC_REPLY.replace("%s", ".*"))
                .containsOnlyOnce(url);
    }

    @Timeout(10)
    @Test
    void trackSendsNotReceivesReplyInNotSenderChat() {
        String url = "https://stackoverflow.com/questions/4568645";
        TelegramBotTestUtils testUtils = new TelegramBotTestUtils("trackSendsNotReceivesReplyInNotSenderChat");

        stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/answers.*"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", APPLICATION_JSON_VALUE)
                        .withBodyFile("exampleStackOverflowGetAnswersResponse.json")));
        testUtils.writeMessageToBot(
                STARTED, "start_command_resieved", new TelegramBotTestUtils.Message(2, 1, "/start"));
        testUtils.writeMessageToBot(
                "start_command_resieved", "track_command_resieved", new TelegramBotTestUtils.Message(1, 2, "/track"));
        testUtils.writeMessageToBot(
                "track_command_resieved", "url_resieved", new TelegramBotTestUtils.Message(1, 3, url));
        testUtils.writeMessageToBot("url_resieved", "tags_resieved", new TelegramBotTestUtils.Message(1, 4, "-"));
        testUtils.repeatLastMessage("tags_resieved", "tags_resieved", 5);
        var responses = testUtils.waitAndGetBotResponsesByChatID(10);

        assertThat(responses).isNotEmpty();
        assertThat(responses)
                .hasSize(2)
                .containsKeys("1", "2")
                .extractingByKey("2", as(InstanceOfAssertFactories.STREAM))
                .hasSize(1);
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
