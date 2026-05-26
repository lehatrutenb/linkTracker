package backend.academy.linktracker.scrapper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import backend.academy.linktracker.scrapper.adapter.controller.LinksApiController;
import backend.academy.linktracker.scrapper.adapter.controller.TgChatApiController;
import backend.academy.linktracker.scrapper.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecase.dto.generated.ListLinksResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.RemoveLinkRequest;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import org.assertj.core.api.ThrowableAssert.ThrowingCallable;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.context.scope.refresh.RefreshScope;
import org.springframework.context.annotation.Import;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestClient;
import org.wiremock.spring.EnableWireMock;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
@ActiveProfiles("test")
@EnableWireMock
public class ScrapperIntegrationTest {

    private static final String TG_CHAT_HEADER_NAME = "Tg-Chat-Id";
    private static final String DEFAULT_CHAT_ID = "1";
    private static final String DEFAULT_LINK = "https://github.com/openclaw/openclaw";
    private static final String GITHUB_LINK = "https://github.com/openclaw/openclaw";
    private static final String STACKOVERFLOW_LINK = "https://stackoverflow.com/questions/4568645";
    private static final AddLinkRequest ADD_DEFAULT_LINK_REQUEST = new AddLinkRequest().link(URI.create(DEFAULT_LINK));
    private static final RemoveLinkRequest DELETE_DEFAULT_LINK_REQUEST =
            new RemoveLinkRequest().link(URI.create(DEFAULT_LINK));

    private RestClient restClient;

    @Autowired
    private RefreshScope refreshScope;

    @BeforeEach
    void setupBeforeEach(@Value("${local.server.port}") String linkTrackerAppPort) {
        restClient = RestClient.create("http://localhost:" + linkTrackerAppPort);
    }

    @AfterEach
    void setupAfterEach() {
        refreshScope.refreshAll();
    }

    @Timeout(10)
    @ParameterizedTest
    @ValueSource(strings = {DEFAULT_LINK, GITHUB_LINK, STACKOVERFLOW_LINK})
    void registerChatLinkListenLinkGetSendsReceivesThatLink(String link) {
        AddLinkRequest addLinkRequest = new AddLinkRequest().link(URI.create(link));
        var responseChatRegister = registerChat(DEFAULT_CHAT_ID);
        var responseLinkAdd = addLink(DEFAULT_CHAT_ID, addLinkRequest);
        var responseLinkList = getLinks(DEFAULT_CHAT_ID);

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getBody().getLinks())
                .hasSize(1)
                .first()
                .extracting("url")
                .isEqualTo(Optional.of(URI.create(link)));
    }

    @Test
    @Timeout(10)
    void deleteListeningLinkSendsReceivesEmptyListeningLinks() {
        var responseChatRegister = registerChat(DEFAULT_CHAT_ID);
        var responseLinkAdd = addLinkDefault();
        var responseLinkDelete = deleteLinkDefault();
        var responseLinkList = getLinks(DEFAULT_CHAT_ID);

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkDelete.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getBody().getLinks()).isEmpty();
    }

    @Test
    @Timeout(10)
    void deleteLinkFromNonExistingChatSendsReceivesError() {
        String deleteChatID = "999";

        var responseChatRegister = registerChat(DEFAULT_CHAT_ID);
        var responseLinkAdd = addLinkDefault();
        assertApiError(() -> deleteLink(deleteChatID, DELETE_DEFAULT_LINK_REQUEST), HttpStatus.NOT_FOUND);
        var responseLinkList = getLinks(DEFAULT_CHAT_ID);

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getBody().getLinks())
                .hasSize(1)
                .first()
                .extracting("url")
                .isEqualTo(Optional.of(URI.create(DEFAULT_LINK)));
    }

    @Test
    @Timeout(10)
    void listenLinkForNonExistingChatSendsReceivesError() {
        String nonExistingChatID = "999";

        var responseChatRegister = registerChat(DEFAULT_CHAT_ID);

        assertApiError(() -> addLink(nonExistingChatID, ADD_DEFAULT_LINK_REQUEST), HttpStatus.NOT_FOUND);
        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    @Timeout(10)
    void listenLinkForDeletedChatSendsReceivesError() {
        var responseChatRegister = registerChat(DEFAULT_CHAT_ID);
        var responseLinkAdd = addLink(DEFAULT_CHAT_ID, ADD_DEFAULT_LINK_REQUEST);
        var responseChatDelete = deleteChat(DEFAULT_CHAT_ID);

        assertApiError(() -> getLinks(DEFAULT_CHAT_ID), HttpStatus.NOT_FOUND);
        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseChatDelete.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    @Timeout(10)
    void deleteNonExistingChatSendsReceivesError() {
        assertApiError(() -> deleteChat(DEFAULT_CHAT_ID), HttpStatus.NOT_FOUND);
    }

    @Test
    @Timeout(10)
    void addMultipleLinksToSameChatSends() {
        AddLinkRequest stackOverflowRequest = new AddLinkRequest().link(URI.create(STACKOVERFLOW_LINK));
        var responseChatRegister = registerChat(DEFAULT_CHAT_ID);
        var responseLinkAdd = addLinkDefault();
        var responseLinkAdd2 = addLink(DEFAULT_CHAT_ID, stackOverflowRequest);
        var responseLinkList = getLinks(DEFAULT_CHAT_ID);

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd2.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getBody().getLinks())
                .hasSize(2)
                .extracting(link -> link.getUrl().orElseThrow())
                .containsExactlyInAnyOrder(URI.create(DEFAULT_LINK), URI.create(STACKOVERFLOW_LINK));
    }

    @Test
    @Timeout(10)
    void addSameLinkToMultipleChatsSends() {
        String secondChatID = "2";

        var responseChatRegister = registerChat(DEFAULT_CHAT_ID);
        var responseSecondChatRegister = registerChat(secondChatID);
        var responseLinkAdd = addLinkDefault();
        var responseSecondLinkAdd = addLink(secondChatID, ADD_DEFAULT_LINK_REQUEST);
        var responseLinkList = getLinks(DEFAULT_CHAT_ID);
        var responseSecondLinkList = getLinks(secondChatID);

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseSecondChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseSecondLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
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
    @Timeout(10)
    void invalidLinkSendsReceivesError() {
        AddLinkRequest invalidLinkRequest = new AddLinkRequest().link(URI.create("invalid-link"));
        registerChat(DEFAULT_CHAT_ID);

        assertApiError(() -> addLink(DEFAULT_CHAT_ID, invalidLinkRequest), HttpStatus.BAD_REQUEST);
    }

    @Test
    @Timeout(10)
    void duplicateLinkSendsReceivesError() {
        var responseChatRegister = registerChat(DEFAULT_CHAT_ID);
        var responseLinkAdd = addLinkDefault();

        assertApiError(this::addLinkDefault, HttpStatus.CONFLICT);
        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    @Timeout(10)
    void deleteNonExistingLinkSendsReceivesError() {
        RemoveLinkRequest nonExistingLinkRequest = new RemoveLinkRequest().link(URI.create(STACKOVERFLOW_LINK));
        var responseChatRegister = registerChat(DEFAULT_CHAT_ID);

        assertApiError(() -> deleteLink(DEFAULT_CHAT_ID, nonExistingLinkRequest), HttpStatus.NOT_FOUND);
        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    @Timeout(10)
    void addLinkWithTagsAndFiltersSendsReceivesThem() {
        List<String> tags = List.of("tag1", "tag2");
        List<String> filters = List.of("filter1", "filter2");
        AddLinkRequest addLinkRequest =
                new AddLinkRequest().link(URI.create(DEFAULT_LINK)).tags(tags).filters(filters);

        var responseChatRegister = registerChat(DEFAULT_CHAT_ID);
        var responseLinkAdd = addLink(DEFAULT_CHAT_ID, addLinkRequest);
        var responseLinkList = getLinks(DEFAULT_CHAT_ID);

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getBody().getLinks()).hasSize(1).first().satisfies(link -> {
            assertThat(link.getUrl()).isEqualTo(Optional.of(URI.create(DEFAULT_LINK)));
            assertThat(link.getTags()).containsExactlyElementsOf(tags);
            assertThat(link.getFilters()).containsExactlyElementsOf(filters);
        });
    }

    private void assertApiError(ThrowingCallable request, HttpStatus expectedStatus) {
        assertThatThrownBy(request).isInstanceOfSatisfying(HttpClientErrorException.class, exception -> {
            assertThat(exception.getStatusCode()).isEqualTo(expectedStatus);
        });
    }

    private ResponseEntity<Void> registerChat(String chatID) {
        return restClient
                .method(HttpMethod.POST)
                .uri(TgChatApiController.PATH_TG_CHAT_ID_POST, chatID)
                .retrieve()
                .toBodilessEntity();
    }

    private ResponseEntity<Void> deleteChat(String chatID) {
        return restClient
                .method(HttpMethod.DELETE)
                .uri(TgChatApiController.PATH_TG_CHAT_ID_DELETE, chatID)
                .retrieve()
                .toBodilessEntity();
    }

    private ResponseEntity<Void> addLink(String chatID, AddLinkRequest addLinkRequest) {
        return restClient
                .method(HttpMethod.POST)
                .uri(LinksApiController.PATH_LINKS_POST)
                .header(TG_CHAT_HEADER_NAME, chatID)
                .contentType(MediaType.APPLICATION_JSON)
                .body(addLinkRequest)
                .retrieve()
                .toBodilessEntity();
    }

    private ResponseEntity<Void> deleteLink(String chatID, RemoveLinkRequest removeLinkRequest) {
        return restClient
                .method(HttpMethod.DELETE)
                .uri(LinksApiController.PATH_LINKS_DELETE)
                .header(TG_CHAT_HEADER_NAME, chatID)
                .contentType(MediaType.APPLICATION_JSON)
                .body(removeLinkRequest)
                .retrieve()
                .toBodilessEntity();
    }

    private ResponseEntity<Void> addLinkDefault() {
        return addLink(DEFAULT_CHAT_ID, ADD_DEFAULT_LINK_REQUEST);
    }

    private ResponseEntity<Void> deleteLinkDefault() {
        return deleteLink(DEFAULT_CHAT_ID, DELETE_DEFAULT_LINK_REQUEST);
    }

    private ResponseEntity<ListLinksResponse> getLinks(String chatID) {
        return restClient
                .method(HttpMethod.GET)
                .uri(LinksApiController.PATH_LINKS_GET)
                .header(TG_CHAT_HEADER_NAME, chatID)
                .retrieve()
                .toEntity(ListLinksResponse.class);
    }
}
