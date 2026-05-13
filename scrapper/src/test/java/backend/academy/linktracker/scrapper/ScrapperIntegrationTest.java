package backend.academy.linktracker.scrapper;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

import backend.academy.linktracker.scrapper.adapter.controller.LinksApiController;
import backend.academy.linktracker.scrapper.adapter.controller.TgChatApiController;
import backend.academy.linktracker.scrapper.usecase.dto.generated.ListLinksResponse;
import com.github.tomakehurst.wiremock.client.WireMock;
import java.net.URI;
import java.util.Optional;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
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
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_EACH_TEST_METHOD) // Need cause have state
public class ScrapperIntegrationTest {
    RestClient restClient;

    @BeforeEach
    void setupScrapperClient(@Value("${local.server.port}") String linkTrackerAppPort) {
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
    void registerChatLinkListenLinkGetSendsReceivesThatLink() {
        String chatID = "1";
        String link = "https://github.com/openclaw/openclaw";
        String tgChatHeaderName = "Tg-Chat-Id";
        String bodyLinkAdd = String.format("{\"link\":\"%s\"}", link);

        var responseChatRegister = restClient
                .method(HttpMethod.POST)
                .uri(TgChatApiController._PATH_TG_CHAT_ID_POST, chatID)
                .retrieve()
                .toBodilessEntity();
        var responseLinkAdd = restClient
                .method(HttpMethod.POST)
                .uri(LinksApiController._PATH_LINKS_POST)
                .header(tgChatHeaderName, chatID)
                .contentType(MediaType.APPLICATION_JSON)
                .body(bodyLinkAdd)
                .retrieve()
                .toBodilessEntity();
        var responseLinkList = restClient
                .method(HttpMethod.GET)
                .uri(LinksApiController._PATH_LINKS_GET, link)
                .header(tgChatHeaderName, chatID)
                .retrieve()
                .toEntity(ListLinksResponse.class);

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
        String chatID = "1";
        String link = "https://github.com/openclaw/openclaw";
        String tgChatHeaderName = "Tg-Chat-Id";
        String bodyLinkAdd = String.format("{\"link\":\"%s\"}", link);
        String bodyLinkDelete = bodyLinkAdd;

        var responseChatRegister = restClient
                .method(HttpMethod.POST)
                .uri(TgChatApiController._PATH_TG_CHAT_ID_POST, chatID)
                .retrieve()
                .toBodilessEntity();
        var responseLinkAdd = restClient
                .method(HttpMethod.POST)
                .uri(LinksApiController._PATH_LINKS_POST)
                .header(tgChatHeaderName, chatID)
                .contentType(MediaType.APPLICATION_JSON)
                .body(bodyLinkAdd)
                .retrieve()
                .toBodilessEntity();
        var responseLinkDelete = restClient
                .method(HttpMethod.DELETE)
                .uri(LinksApiController._PATH_LINKS_DELETE)
                .header(tgChatHeaderName, chatID)
                .contentType(MediaType.APPLICATION_JSON)
                .body(bodyLinkDelete)
                .retrieve()
                .toBodilessEntity();
        var responseLinkList = restClient
                .method(HttpMethod.GET)
                .uri(LinksApiController._PATH_LINKS_GET, link)
                .header(tgChatHeaderName, chatID)
                .retrieve()
                .toEntity(ListLinksResponse.class);

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkDelete.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getBody().getLinks()).isEmpty();
    }

    @Test
    @Timeout(10)
    void deleteLinkFromNonExistingChatSendsReceivesError() {
        String chatID = "1";
        String deleteChatID = "999";
        String link = "https://github.com/openclaw/openclaw";
        String tgChatHeaderName = "Tg-Chat-Id";
        String bodyLinkAdd = String.format("{\"link\":\"%s\"}", link);
        String bodyLinkDelete = bodyLinkAdd;

        var responseChatRegister = restClient
                .method(HttpMethod.POST)
                .uri(TgChatApiController._PATH_TG_CHAT_ID_POST, chatID)
                .retrieve()
                .toBodilessEntity();
        var responseLinkAdd = restClient
                .method(HttpMethod.POST)
                .uri(LinksApiController._PATH_LINKS_POST)
                .header(tgChatHeaderName, chatID)
                .contentType(MediaType.APPLICATION_JSON)
                .body(bodyLinkAdd)
                .retrieve()
                .toBodilessEntity();
        assertThatThrownBy(() -> restClient
                .method(HttpMethod.DELETE)
                .uri(LinksApiController._PATH_LINKS_DELETE)
                .header(tgChatHeaderName, deleteChatID)
                .contentType(MediaType.APPLICATION_JSON)
                .body(bodyLinkDelete)
                .retrieve()
                .toBodilessEntity());
        var responseLinkList = restClient
                .method(HttpMethod.GET)
                .uri(LinksApiController._PATH_LINKS_GET, link)
                .header(tgChatHeaderName, chatID)
                .retrieve()
                .toEntity(ListLinksResponse.class);

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
    void listenLinkForNonExistingChatSendsReceivesError() {
        String chatID = "1";
        String nonExistingChatID = "999";
        String link = "https://github.com/openclaw/openclaw";
        String tgChatHeaderName = "Tg-Chat-Id";
        String bodyLinkAdd = String.format("{\"link\":\"%s\"}", link);

        var responseChatRegister = restClient
                .method(HttpMethod.POST)
                .uri(TgChatApiController._PATH_TG_CHAT_ID_POST, chatID)
                .retrieve()
                .toBodilessEntity();
        assertThatThrownBy(() -> restClient
                .method(HttpMethod.POST)
                .uri(LinksApiController._PATH_LINKS_POST)
                .header(tgChatHeaderName, nonExistingChatID)
                .contentType(MediaType.APPLICATION_JSON)
                .body(bodyLinkAdd)
                .retrieve()
                .toBodilessEntity());

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    @Timeout(10)
    void listenLinkForDeletedChatSendsReceivesError() {
        String chatID = "1";
        String link = "https://github.com/openclaw/openclaw";
        String tgChatHeaderName = "Tg-Chat-Id";
        String bodyLinkAdd = String.format("{\"link\":\"%s\"}", link);

        var responseChatRegister = restClient
                .method(HttpMethod.POST)
                .uri(TgChatApiController._PATH_TG_CHAT_ID_POST, chatID)
                .retrieve()
                .toBodilessEntity();
        var responseLinkAdd = restClient
                .method(HttpMethod.POST)
                .uri(LinksApiController._PATH_LINKS_POST)
                .header(tgChatHeaderName, chatID)
                .contentType(MediaType.APPLICATION_JSON)
                .body(bodyLinkAdd)
                .retrieve()
                .toBodilessEntity();
        var responseChatDelete = restClient
                .method(HttpMethod.DELETE)
                .uri(TgChatApiController._PATH_TG_CHAT_ID_DELETE, chatID)
                .retrieve()
                .toBodilessEntity();
        assertThatThrownBy(() -> restClient
                .method(HttpMethod.GET)
                .uri(LinksApiController._PATH_LINKS_GET, link)
                .header(tgChatHeaderName, chatID)
                .retrieve()
                .toEntity(ListLinksResponse.class));

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseChatDelete.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    @Timeout(10)
    void deleteNonExistingChatSendsReceivesError() {
        String chatID = "1";

        assertThatThrownBy(() -> restClient
                .method(HttpMethod.DELETE)
                .uri(TgChatApiController._PATH_TG_CHAT_ID_DELETE, chatID)
                .retrieve()
                .toBodilessEntity());
    }
}
