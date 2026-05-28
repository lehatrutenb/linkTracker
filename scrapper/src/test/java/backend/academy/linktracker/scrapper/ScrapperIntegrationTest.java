package backend.academy.linktracker.scrapper;

import static com.github.tomakehurst.wiremock.client.WireMock.reset;
import static com.github.tomakehurst.wiremock.client.WireMock.resetAllRequests;
import static com.github.tomakehurst.wiremock.client.WireMock.resetAllScenarios;
import static com.github.tomakehurst.wiremock.client.WireMock.resetToDefault;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import backend.academy.linktracker.scrapper.testutil.ScrapperTestUtil;
import backend.academy.linktracker.scrapper.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.RemoveLinkRequest;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.testcontainers.service.connection.ServiceConnection;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
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
public class ScrapperIntegrationTest {
    private static final String DEFAULT_LINK = "https://github.com/openclaw/openclaw";
    private static final String GITHUB_LINK = "https://github.com/openclaw/openclaw";
    private static final String STACKOVERFLOW_LINK = "https://stackoverflow.com/questions/4568645";
    private static final AddLinkRequest ADD_DEFAULT_LINK_REQUEST = new AddLinkRequest().link(URI.create(DEFAULT_LINK));
    private static final RemoveLinkRequest DELETE_DEFAULT_LINK_REQUEST =
            new RemoveLinkRequest().link(URI.create(DEFAULT_LINK));

    private RestClient restClient;

    @Container
    @ServiceConnection
    private static final PostgreSQLContainer postgres = new PostgreSQLContainer("postgres:18-alpine");

    @BeforeAll
    void setupBeforeAll(@Value("${local.server.port}") String linkTrackerAppPort) {
        restClient = RestClient.create("http://localhost:" + linkTrackerAppPort);
    }

    @BeforeEach
    void setupBeforeEach() {
        reset();
        resetAllRequests();
        resetAllScenarios();
        resetToDefault();
    }

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
        assertApiError(() -> scrapperTestUtilNoLinkAdd.deleteLink(DELETE_DEFAULT_LINK_REQUEST), HttpStatus.NOT_FOUND);
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
