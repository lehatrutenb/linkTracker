package backend.academy.linktracker.scrapper;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.get;
import static com.github.tomakehurst.wiremock.client.WireMock.reset;
import static com.github.tomakehurst.wiremock.client.WireMock.resetAllRequests;
import static com.github.tomakehurst.wiremock.client.WireMock.resetAllScenarios;
import static com.github.tomakehurst.wiremock.client.WireMock.resetToDefault;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import backend.academy.linktracker.scrapper.testutil.ScrapperTestUtil;
import backend.academy.linktracker.scrapper.usecase.ScrapperFacade;
import backend.academy.linktracker.scrapper.usecase.dto.ScrapperLinkUpdateEvent;
import backend.academy.linktracker.scrapper.usecase.dto.ScrapperLinkUpdateEventDescription;
import backend.academy.linktracker.scrapper.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.RemoveLinkRequest;
import backend.academy.linktracker.scrapper.usecase.service.ScheduleUpdatesOnLinksService;
import backend.academy.linktracker.scrapper.usecase.service.ScrappedUpdatesPublishService;
import java.net.URI;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import lombok.SneakyThrows;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.ArgumentCaptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.simple.JdbcClient;
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
@EnableWireMock
@Testcontainers
@ActiveProfiles({"test", "nonSchedulingTest"})
public class ScrapperIntegrationTest {
    private static final String DEFAULT_LINK = "https://github.com/openclaw/openclaw";
    private static final String GITHUB_LINK = "https://github.com/openclaw/openclaw";
    private static final String STACKOVERFLOW_LINK = "https://stackoverflow.com/questions/4568645";
    private static final AddLinkRequest ADD_DEFAULT_LINK_REQUEST = new AddLinkRequest().link(URI.create(DEFAULT_LINK));
    private static final RemoveLinkRequest DELETE_DEFAULT_LINK_REQUEST =
            new RemoveLinkRequest().link(URI.create(DEFAULT_LINK));

    private static RestClient restClient;

    @Container
    @ServiceConnection
    private static final PostgreSQLContainer postgres = new PostgreSQLContainer("postgres:18-alpine");

    @BeforeAll
    static void setupBeforeAll(@Value("${local.server.port}") String linkTrackerAppPort) {
        restClient = RestClient.create("http://localhost:" + linkTrackerAppPort);
    }

    @BeforeEach
    void setupBeforeEach(@Value("${local.server.port}") String linkTrackerAppPort) {
        reset();
        resetAllRequests();
        resetAllScenarios();
        resetToDefault();
    }

    @AfterEach
    void teardownAfterEach() {
        reset();
        resetAllRequests();
        resetAllScenarios();
        resetToDefault();
    }

    @Nested
    class ScrapperApiTests {
        @Timeout(100)
        @ParameterizedTest
        @ValueSource(strings = {DEFAULT_LINK, GITHUB_LINK, STACKOVERFLOW_LINK})
        void registerChatLinkListenLinkGetSendsReceivesThatLink(String link) {
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            AddLinkRequest addLinkRequest = new AddLinkRequest().link(URI.create(link));

            var responseChatRegister = scrapperTestUtil.registerChat();
            var responseLinkAdd = scrapperTestUtil.addLink(addLinkRequest);
            var responseLinkList = scrapperTestUtil.getLinks();

            assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertLinkResponse(responseLinkAdd, URI.create(link), List.of());
            assertThat(responseLinkList.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertThat(responseLinkList.getBody().getLinks())
                    .hasSize(1)
                    .first()
                    .extracting("url")
                    .isEqualTo(Optional.of(URI.create(link)));
        }

        @Test
        @Timeout(100)
        void deleteListeningLinkSendsReceivesEmptyListeningLinks() {
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);

            var responseChatRegister = scrapperTestUtil.registerChat();
            var responseLinkAdd = scrapperTestUtil.addLink(ADD_DEFAULT_LINK_REQUEST);
            var responseLinkDelete = scrapperTestUtil.deleteLink(DELETE_DEFAULT_LINK_REQUEST);
            var responseLinkList = scrapperTestUtil.getLinks();

            assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertLinkResponse(responseLinkAdd, URI.create(DEFAULT_LINK), List.of());
            assertLinkResponse(responseLinkDelete, URI.create(DEFAULT_LINK), List.of());
            assertThat(responseLinkList.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertThat(responseLinkList.getBody().getLinks()).isEmpty();
        }

        @Test
        @Timeout(100)
        void deleteLinkFromNonExistingChatSendsReceivesError() {
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            ScrapperTestUtil scrapperTestUtilNoLinkAdd = new ScrapperTestUtil(restClient);

            var responseChatRegister = scrapperTestUtil.registerChat();
            var responseChatRegisterNoLinkAdd = scrapperTestUtilNoLinkAdd.registerChat();
            var responseLinkAdd = scrapperTestUtil.addLink(ADD_DEFAULT_LINK_REQUEST);
            var responseLinkList = scrapperTestUtil.getLinks();
            assertApiError(
                    () -> scrapperTestUtilNoLinkAdd.deleteLink(DELETE_DEFAULT_LINK_REQUEST), HttpStatus.NOT_FOUND);
            scrapperTestUtil = new ScrapperTestUtil(restClient);

            assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertThat(responseChatRegisterNoLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertLinkResponse(responseLinkAdd, URI.create(DEFAULT_LINK), List.of());
            assertThat(responseLinkList.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertThat(responseLinkList.getBody().getLinks())
                    .hasSize(1)
                    .first()
                    .extracting("url")
                    .isEqualTo(Optional.of(URI.create(DEFAULT_LINK)));
        }

        @Test
        @Timeout(100)
        void listenLinkForNonExistingChatSendsReceivesError() {
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            ScrapperTestUtil scrapperTestUtilNoRegister = new ScrapperTestUtil(restClient);

            var responseChatRegister = scrapperTestUtil.registerChat();

            assertApiError(() -> scrapperTestUtilNoRegister.addLink(ADD_DEFAULT_LINK_REQUEST), HttpStatus.NOT_FOUND);
            assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        }

        @Test
        @Timeout(100)
        void listenLinkForDeletedChatSendsReceivesError() {
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);

            var responseChatRegister = scrapperTestUtil.registerChat();
            var responseLinkAdd = scrapperTestUtil.addLink(ADD_DEFAULT_LINK_REQUEST);
            var responseChatDelete = scrapperTestUtil.deleteChat();

            assertApiError(() -> scrapperTestUtil.getLinks(), HttpStatus.NOT_FOUND);
            assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertLinkResponse(responseLinkAdd, URI.create(DEFAULT_LINK), List.of());
            assertThat(responseChatDelete.getStatusCode()).isEqualTo(HttpStatus.OK);
        }

        @Test
        @Timeout(100)
        void deleteNonExistingChatSendsReceivesError() {
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            assertApiError(() -> scrapperTestUtil.deleteChat(), HttpStatus.NOT_FOUND);
        }

        @Test
        @Timeout(100)
        void addMultipleLinksToSameChatSends() {
            AddLinkRequest stackOverflowRequest = new AddLinkRequest().link(URI.create(STACKOVERFLOW_LINK));
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);

            var responseChatRegister = scrapperTestUtil.registerChat();
            var responseLinkAdd = scrapperTestUtil.addLink(ADD_DEFAULT_LINK_REQUEST);
            var responseLinkAdd2 = scrapperTestUtil.addLink(stackOverflowRequest);
            var responseLinkList = scrapperTestUtil.getLinks();

            assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertLinkResponse(responseLinkAdd, URI.create(DEFAULT_LINK), List.of());
            assertLinkResponse(responseLinkAdd2, URI.create(STACKOVERFLOW_LINK), List.of());
            assertThat(responseLinkList.getBody().getLinks())
                    .hasSize(2)
                    .extracting(link -> link.getUrl().orElseThrow())
                    .containsExactlyInAnyOrder(URI.create(DEFAULT_LINK), URI.create(STACKOVERFLOW_LINK));
        }

        @Test
        @Timeout(100)
        void addSameLinkToMultipleChatsSends() {
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            ScrapperTestUtil scrapperTestUtilSecondChat = new ScrapperTestUtil(restClient);

            var responseChatRegister = scrapperTestUtil.registerChat();
            var responseSecondChatRegister = scrapperTestUtilSecondChat.registerChat();
            var responseLinkAdd = scrapperTestUtil.addLink(ADD_DEFAULT_LINK_REQUEST);
            var responseSecondLinkAdd = scrapperTestUtilSecondChat.addLink(ADD_DEFAULT_LINK_REQUEST);
            var responseLinkList = scrapperTestUtil.getLinks();
            var responseSecondLinkList = scrapperTestUtilSecondChat.getLinks();

            assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertThat(responseSecondChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertLinkResponse(responseLinkAdd, URI.create(DEFAULT_LINK), List.of());
            assertLinkResponse(responseSecondLinkAdd, URI.create(DEFAULT_LINK), List.of());
            assertThat(responseLinkList.getBody().getLinks())
                    .hasSize(1)
                    .first()
                    .extracting("url")
                    .isEqualTo(Optional.of(URI.create(DEFAULT_LINK)));
            assertThat(responseSecondLinkList.getBody().getLinks())
                    .hasSize(1)
                    .first()
                    .extracting("url")
                    .isEqualTo(Optional.of(URI.create(DEFAULT_LINK)));
        }

        @Test
        @Timeout(100)
        void invalidLinkSendsReceivesError() {
            AddLinkRequest invalidLinkRequest = new AddLinkRequest().link(URI.create("invalid-link"));
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);

            scrapperTestUtil.registerChat();

            assertApiError(() -> scrapperTestUtil.addLink(invalidLinkRequest), HttpStatus.BAD_REQUEST);
        }

        @Test
        @Timeout(100)
        void duplicateLinkSendsReceivesError() {
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);

            var responseChatRegister = scrapperTestUtil.registerChat();
            var responseLinkAdd = scrapperTestUtil.addLink(ADD_DEFAULT_LINK_REQUEST);

            assertApiError(() -> scrapperTestUtil.addLink(ADD_DEFAULT_LINK_REQUEST), HttpStatus.CONFLICT);
            assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertLinkResponse(responseLinkAdd, URI.create(DEFAULT_LINK), List.of());
        }

        @Test
        @Timeout(100)
        void deleteNonExistingLinkSendsReceivesError() {
            RemoveLinkRequest nonExistingLinkRequest = new RemoveLinkRequest().link(URI.create(STACKOVERFLOW_LINK));
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);

            var responseChatRegister = scrapperTestUtil.registerChat();

            assertApiError(() -> scrapperTestUtil.deleteLink(nonExistingLinkRequest), HttpStatus.NOT_FOUND);
            assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        }

        @Test
        @Timeout(100)
        void addLinkWithTagsSendsReceivesThem() {
            List<String> tags = List.of("tag1", "tag2");
            AddLinkRequest addLinkRequest =
                    new AddLinkRequest().link(URI.create(DEFAULT_LINK)).tags(tags);
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);

            var responseChatRegister = scrapperTestUtil.registerChat();
            var responseLinkAdd = scrapperTestUtil.addLink(addLinkRequest);
            var responseLinkList = scrapperTestUtil.getLinks();

            assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
            assertLinkResponse(responseLinkAdd, URI.create(DEFAULT_LINK), tags);
            assertThat(responseLinkList.getBody().getLinks()).hasSize(1).first().satisfies(link -> {
                assertThat(link.getUrl()).isEqualTo(Optional.of(URI.create(DEFAULT_LINK)));
                assertThat(link.getTags()).containsExactlyElementsOf(tags);
                assertThat(link.getFilters()).isEmpty();
            });
        }
    }

    @Nested
    class UpdatesOnLinksTests {
        @Autowired
        private ScrapperFacade facade;

        @Autowired
        private ScheduleUpdatesOnLinksService scheduleUpdatesOnLinksService;

        @MockitoBean
        private ScrappedUpdatesPublishService publishService;

        @Autowired
        private JdbcClient jdbcClient;

        @BeforeEach
        void setupBeforeEach() {
            jdbcClient
                    .sql(
                            "TRUNCATE TABLE link_listener, scrapper_link, link_metadata, link_tag, link_metadata_tags_mapping CASCADE")
                    .update();
        }

        @Test
        @SneakyThrows
        @Timeout(100)
        void listenStackOverflowLinkGetAnswersUpdatesOnIt() {
            String link = "https://stackoverflow.com/questions/4568645";
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            long chatID = scrapperTestUtil.getFreeChatID();
            var author = "moinudin";
            var questionText = "Printing 1 to 1000 without loop or conditionals";
            var answerText = "Using system commands:\r\n\r\n    system(&quot;/usr/bin/seq 1000&quot;);";
            ArgumentCaptor<Collection<ScrapperLinkUpdateEvent>> updateEventsCaptor =
                    ArgumentCaptor.forClass(Collection.class);

            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/answers.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withBodyFile("exampleStackOverflowGetAnswerResponse.json")));
            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/comments.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withBody(
                                    "{\"items\":[],\"has_more\":false,\"quota_max\":10000,\"quota_remaining\":9999}")));
            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*"))
                    .atPriority(Integer.MAX_VALUE)
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withBodyFile("exampleStackOverflowQuestionDescriptionResponse.json")));

            facade.addTgChat(chatID);
            facade.scheduleLink(new AddLinkRequest().link(URI.create(link)), chatID);
            scheduleUpdatesOnLinksService.scrapUpdates();

            verify(publishService).publishUpdates(updateEventsCaptor.capture(), any());
            Collection<ScrapperLinkUpdateEvent> published = updateEventsCaptor.getValue();
            assertThat(published).hasSize(1);
            assertThat(published)
                    .first()
                    .extracting(ScrapperLinkUpdateEvent::description)
                    .extracting(ScrapperLinkUpdateEventDescription::description)
                    .asString()
                    .contains(author, answerText, questionText);
        }

        @Test
        @SneakyThrows
        @Timeout(100)
        void listenStackOverflowLinkGetCommentsUpdatesOnIt() {
            String link = "https://stackoverflow.com/questions/4568645";
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            long chatID = scrapperTestUtil.getFreeChatID();
            var author = "metamatt";
            var questionText = "Printing 1 to 1000 without loop or conditionals";
            var commentText = "The question is lame, but the answers are awesome.";
            ArgumentCaptor<Collection<ScrapperLinkUpdateEvent>> updateEventsCaptor =
                    ArgumentCaptor.forClass(Collection.class);

            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/answers.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withBody(
                                    "{\"items\":[],\"has_more\":false,\"quota_max\":10000,\"quota_remaining\":9999}")));
            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/comments.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withBodyFile("exampleStackOverflowGetCommentResponse.json")));
            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*"))
                    .atPriority(Integer.MAX_VALUE)
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withBodyFile("exampleStackOverflowQuestionDescriptionResponse.json")));

            facade.addTgChat(chatID);
            facade.scheduleLink(new AddLinkRequest().link(URI.create(link)), chatID);
            scheduleUpdatesOnLinksService.scrapUpdates();

            verify(publishService).publishUpdates(updateEventsCaptor.capture(), any());
            Collection<ScrapperLinkUpdateEvent> published = updateEventsCaptor.getValue();
            assertThat(published).hasSize(1);
            assertThat(published)
                    .first()
                    .extracting(ScrapperLinkUpdateEvent::description)
                    .extracting(ScrapperLinkUpdateEventDescription::description)
                    .asString()
                    .contains(author, commentText, questionText);
        }

        @Test
        @SneakyThrows
        @Timeout(100)
        void listenGitHubLinkGetPushUpdatesOnIt() {
            String link = "https://github.com/openclaw/openclaw";
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            long chatID = scrapperTestUtil.getFreeChatID();
            var author = "steipete";
            var eventType = "PushEvent";
            ArgumentCaptor<Collection<ScrapperLinkUpdateEvent>> updateEventsCaptor =
                    ArgumentCaptor.forClass(Collection.class);

            stubFor(get(urlMatching(".*/repos/.*/.*/events.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withHeader("ETag", "8b45ee17f8c441fb728bf4a0ba4627dc56f5e30e0cae65a4af921a4e78ce2bd1")
                            .withHeader(
                                    "Link",
                                    "<https://api.github.com/repositories/1103012935/events?per_page=5&page=1>; rel=\"last\"")
                            .withHeader("Last-Modified", "Sun, 10 May 2026 00:00:00 GMT")
                            .withHeader("X-RateLimit-Limit", "5000")
                            .withHeader("X-RateLimit-Remaining", "4999")
                            .withBodyFile("exampleGithubGetPushResponse.json")));

            facade.addTgChat(chatID);
            facade.scheduleLink(new AddLinkRequest().link(URI.create(link)), chatID);
            scheduleUpdatesOnLinksService.scrapUpdates();

            verify(publishService).publishUpdates(updateEventsCaptor.capture(), any());
            Collection<ScrapperLinkUpdateEvent> published = updateEventsCaptor.getValue();
            assertThat(published).hasSize(1);
            assertThat(published)
                    .first()
                    .extracting(ScrapperLinkUpdateEvent::description)
                    .extracting(ScrapperLinkUpdateEventDescription::description)
                    .asString()
                    .contains(author, eventType);
        }

        @Test
        @SneakyThrows
        @Timeout(100)
        void listenGitHubLinkGetIssueUpdatesOnIt() {
            String link = "https://github.com/openclaw/openclaw";
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            long chatID = scrapperTestUtil.getFreeChatID();
            var author = "milo-operator";
            var eventType = "IssuesEvent";
            var issueTitle =
                    "[Bug]: `message send --media` routes .mp4 through sendVideo and `--force-document` does not override";
            ArgumentCaptor<Collection<ScrapperLinkUpdateEvent>> updateEventsCaptor =
                    ArgumentCaptor.forClass(Collection.class);

            stubFor(get(urlMatching(".*/repos/.*/.*/events.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withHeader("ETag", "8b45ee17f8c441fb728bf4a0ba4627dc56f5e30e0cae65a4af921a4e78ce2bd1")
                            .withHeader(
                                    "Link",
                                    "<https://api.github.com/repositories/1103012935/events?per_page=5&page=1>; rel=\"last\"")
                            .withHeader("Last-Modified", "Sun, 10 May 2026 00:00:00 GMT")
                            .withHeader("X-RateLimit-Limit", "5000")
                            .withHeader("X-RateLimit-Remaining", "4999")
                            .withBodyFile("exampleGithubGetIssueResponse.json")));

            facade.addTgChat(chatID);
            facade.scheduleLink(new AddLinkRequest().link(URI.create(link)), chatID);
            scheduleUpdatesOnLinksService.scrapUpdates();

            verify(publishService).publishUpdates(updateEventsCaptor.capture(), any());
            Collection<ScrapperLinkUpdateEvent> published = updateEventsCaptor.getValue();
            assertThat(published).hasSize(1);
            assertThat(published)
                    .first()
                    .extracting(ScrapperLinkUpdateEvent::description)
                    .extracting(ScrapperLinkUpdateEventDescription::description)
                    .asString()
                    .contains(author, eventType, issueTitle);
        }

        @Test
        @SneakyThrows
        @Timeout(100)
        void listenGitHubLinkGetUnexpectedEventDoesNotPanic() {
            String link = "https://github.com/openclaw/openclaw";
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            long chatID = scrapperTestUtil.getFreeChatID();
            ArgumentCaptor<Collection<ScrapperLinkUpdateEvent>> updateEventsCaptor =
                    ArgumentCaptor.forClass(Collection.class);

            stubFor(get(urlMatching(".*/repos/.*/.*/events.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withHeader("ETag", "8b45ee17f8c441fb728bf4a0ba4627dc56f5e30e0cae65a4af921a4e78ce2bd1")
                            .withHeader(
                                    "Link",
                                    "<https://api.github.com/repositories/1103012935/events?per_page=5&page=1>; rel=\"last\"")
                            .withHeader("Last-Modified", "Sun, 10 May 2026 00:00:00 GMT")
                            .withHeader("X-RateLimit-Limit", "5000")
                            .withHeader("X-RateLimit-Remaining", "4999")
                            .withBodyFile("exampleGithubUnexpectedEventResponse.json")));

            facade.addTgChat(chatID);
            facade.scheduleLink(new AddLinkRequest().link(URI.create(link)), chatID);
            scheduleUpdatesOnLinksService.scrapUpdates();

            verify(publishService).publishUpdates(updateEventsCaptor.capture(), any());
            Collection<ScrapperLinkUpdateEvent> published = updateEventsCaptor.getValue();
            assertThat(published).isEmpty();
        }

        @Test
        @SneakyThrows
        @Timeout(100)
        void listenLinksGetCutPreviewTexts() {
            String linkStackOverflow = "https://stackoverflow.com/questions/4568645";
            String linkGitHub = "https://github.com/openclaw/openclaw";
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            long chatID = scrapperTestUtil.getFreeChatID();
            ArgumentCaptor<Collection<ScrapperLinkUpdateEvent>> updateEventsCaptor =
                    ArgumentCaptor.forClass(Collection.class);

            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/answers.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withBodyFile("exampleStackOverflowGetManyAnswersResponse.json")));
            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/comments.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withBodyFile("exampleStackOverflowGetManyCommentsResponse.json")));
            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*"))
                    .atPriority(Integer.MAX_VALUE)
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withBodyFile("exampleStackOverflowQuestionDescriptionResponse.json")));
            stubFor(get(urlMatching(".*/repos/.*/.*/events.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.OK.value())
                            .withHeader("Content-Type", MediaType.APPLICATION_JSON_VALUE)
                            .withHeader("ETag", "8b45ee17f8c441fb728bf4a0ba4627dc56f5e30e0cae65a4af921a4e78ce2bd1")
                            .withHeader(
                                    "Link",
                                    "<https://api.github.com/repositories/1103012935/events?per_page=5&page=1>; rel=\"last\"")
                            .withHeader("Last-Modified", "Sun, 10 May 2026 00:00:00 GMT")
                            .withHeader("X-RateLimit-Limit", "5000")
                            .withHeader("X-RateLimit-Remaining", "4999")
                            .withBodyFile("exampleGithubGetIssueReponseLongTitle.json")));

            facade.addTgChat(chatID);
            facade.scheduleLink(new AddLinkRequest().link(URI.create(linkStackOverflow)), chatID);
            facade.scheduleLink(new AddLinkRequest().link(URI.create(linkGitHub)), chatID);
            scheduleUpdatesOnLinksService.scrapUpdates();

            verify(publishService, times(2)).publishUpdates(updateEventsCaptor.capture(), any());
            var published = updateEventsCaptor.getAllValues().stream()
                    .flatMap(Collection::stream)
                    .map(ScrapperLinkUpdateEvent::description)
                    .map(ScrapperLinkUpdateEventDescription::description)
                    .filter(description -> description != null);
            assertThat(published)
                    .allSatisfy(description -> assertThat(description).doesNotContain("MUST BE CUT IN TESTS"));
        }

        @Test
        @SneakyThrows
        @Timeout(100)
        void listenLinksGetUnavailableResourcesNoPanic() {
            String linkStackOverflow = "https://stackoverflow.com/questions/4568645";
            String linkGitHub = "https://github.com/openclaw/openclaw";
            ScrapperTestUtil scrapperTestUtil = new ScrapperTestUtil(restClient);
            long chatID = scrapperTestUtil.getFreeChatID();

            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/answers.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
                            .withHeader("Content-Type", MediaType.TEXT_PLAIN_VALUE)
                            .withBody("resource unavailable")));
            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*/comments.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
                            .withHeader("Content-Type", MediaType.TEXT_PLAIN_VALUE)
                            .withBody("resource unavailable")));
            stubFor(get(urlMatching(".*/stack-overflow-api/.*/questions/.*"))
                    .atPriority(Integer.MAX_VALUE)
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
                            .withHeader("Content-Type", MediaType.TEXT_PLAIN_VALUE)
                            .withBody("resource unavailable")));
            stubFor(get(urlMatching(".*/repos/.*/.*/events.*"))
                    .willReturn(aResponse()
                            .withStatus(HttpStatus.SERVICE_UNAVAILABLE.value())
                            .withHeader("Content-Type", MediaType.TEXT_PLAIN_VALUE)
                            .withBody("resource unavailable")));

            facade.addTgChat(chatID);
            facade.scheduleLink(new AddLinkRequest().link(URI.create(linkStackOverflow)), chatID);
            facade.scheduleLink(new AddLinkRequest().link(URI.create(linkGitHub)), chatID);
            scheduleUpdatesOnLinksService.scrapUpdates();

            verify(publishService, times(2)).publishUpdates(any(), any());
        }
    }

    private void assertApiError(ThrowingCallable request, HttpStatus expectedStatus) {
        assertThatThrownBy(request).isInstanceOfSatisfying(HttpClientErrorException.class, exception -> {
            assertThat(exception.getStatusCode()).isEqualTo(expectedStatus);
        });
    }

    private void assertLinkResponse(ResponseEntity<LinkResponse> response, URI expectedUri, List<String> expectedTags) {
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getId()).isPresent();
        assertThat(response.getBody().getUrl()).contains(expectedUri);
        assertThat(response.getBody().getTags()).containsExactlyElementsOf(expectedTags);
        assertThat(response.getBody().getFilters()).isEmpty();
    }
}
