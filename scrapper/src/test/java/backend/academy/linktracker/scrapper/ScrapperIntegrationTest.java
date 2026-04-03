package backend.academy.linktracker.scrapper;

import backend.academy.linktracker.bot.adapters.controllers.UpdatesApi;
import backend.academy.linktracker.bot.testutils.TelegramBotTestUtils;
import backend.academy.linktracker.scrapper.adapters.controllers.LinksApi;
import backend.academy.linktracker.scrapper.adapters.controllers.TgChatApi;
import backend.academy.linktracker.scrapper.usecases.dtos.ListLinksResponse;
import com.github.tomakehurst.wiremock.client.WireMock;
import org.assertj.core.api.WithAssertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
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
import java.net.URI;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.function.Supplier;

import static com.github.tomakehurst.wiremock.client.WireMock.aResponse;
import static com.github.tomakehurst.wiremock.client.WireMock.post;
import static com.github.tomakehurst.wiremock.client.WireMock.postRequestedFor;
import static com.github.tomakehurst.wiremock.client.WireMock.stubFor;
import static com.github.tomakehurst.wiremock.client.WireMock.urlMatching;
import static com.github.tomakehurst.wiremock.client.WireMock.verify;
import static com.github.tomakehurst.wiremock.stubbing.Scenario.STARTED;
import static org.assertj.core.api.Assertions.as;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
@ActiveProfiles("test")
@EnableWireMock
@DirtiesContext(
    classMode =
        DirtiesContext.ClassMode
            .AFTER_EACH_TEST_METHOD) // TODO check if really need
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

        var responseChatRegister = restClient.method(HttpMethod.POST)
            .uri(TgChatApi._PATH_TG_CHAT_ID_POST, chatID)
            .retrieve()
            .toBodilessEntity();
        var responseLinkAdd = restClient.method(HttpMethod.POST)
            .uri(LinksApi._PATH_LINKS_POST)
            .header(tgChatHeaderName, chatID)
            .contentType(MediaType.APPLICATION_JSON)
            .body(bodyLinkAdd)
            .retrieve()
            .toBodilessEntity();
        var responseLinkList = restClient.method(HttpMethod.GET)
            .uri(LinksApi._PATH_LINKS_GET, link)
            .header(tgChatHeaderName, chatID)
            .retrieve()
            .toEntity(ListLinksResponse.class);

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getBody().getLinks())
            .hasSize(1)
            .first().extracting("url").isEqualTo(URI.create(link));
    }

    @Test
    @Timeout(10)
    void deleteListeningLinkSendsReceivesEmptyListeningLinks() {
        String chatID = "1";
        String link = "https://github.com/openclaw/openclaw";
        String tgChatHeaderName = "Tg-Chat-Id";
        String bodyLinkAdd = String.format("{\"link\":\"%s\"}", link);
        String bodyLinkDelete = bodyLinkAdd;

        var responseChatRegister = restClient.method(HttpMethod.POST)
            .uri(TgChatApi._PATH_TG_CHAT_ID_POST, chatID)
            .retrieve()
            .toBodilessEntity();
        var responseLinkAdd = restClient.method(HttpMethod.POST)
            .uri(LinksApi._PATH_LINKS_POST)
            .header(tgChatHeaderName, chatID)
            .contentType(MediaType.APPLICATION_JSON)
            .body(bodyLinkAdd)
            .retrieve()
            .toBodilessEntity();
        var responseLinkDelete = restClient.method(HttpMethod.DELETE)
            .uri(LinksApi._PATH_LINKS_DELETE)
            .header(tgChatHeaderName, chatID)
            .contentType(MediaType.APPLICATION_JSON)
            .body(bodyLinkDelete)
            .retrieve()
            .toBodilessEntity();
        var responseLinkList = restClient.method(HttpMethod.GET)
            .uri(LinksApi._PATH_LINKS_GET, link)
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

        var responseChatRegister = restClient.method(HttpMethod.POST)
            .uri(TgChatApi._PATH_TG_CHAT_ID_POST, chatID)
            .retrieve()
            .toBodilessEntity();
        var responseLinkAdd = restClient.method(HttpMethod.POST)
            .uri(LinksApi._PATH_LINKS_POST)
            .header(tgChatHeaderName, chatID)
            .contentType(MediaType.APPLICATION_JSON)
            .body(bodyLinkAdd)
            .retrieve()
            .toBodilessEntity();
        assertThatThrownBy(() -> restClient.method(HttpMethod.DELETE)
            .uri(LinksApi._PATH_LINKS_DELETE)
            .header(tgChatHeaderName, deleteChatID)
            .contentType(MediaType.APPLICATION_JSON)
            .body(bodyLinkDelete)
            .retrieve()
            .toBodilessEntity()
        );
        var responseLinkList = restClient.method(HttpMethod.GET)
            .uri(LinksApi._PATH_LINKS_GET, link)
            .header(tgChatHeaderName, chatID)
            .retrieve()
            .toEntity(ListLinksResponse.class);

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkList.getBody().getLinks())
            .hasSize(1)
            .first().extracting("url").isEqualTo(URI.create(link));
    }

    @Test
    @Timeout(10)
    void listenLinkForNonExistingChatSendsReceivesError() {
        String chatID = "1";
        String nonExistingChatID = "999";
        String link = "https://github.com/openclaw/openclaw";
        String tgChatHeaderName = "Tg-Chat-Id";
        String bodyLinkAdd = String.format("{\"link\":\"%s\"}", link);

        var responseChatRegister = restClient.method(HttpMethod.POST)
            .uri(TgChatApi._PATH_TG_CHAT_ID_POST, chatID)
            .retrieve()
            .toBodilessEntity();
        assertThatThrownBy(() -> restClient.method(HttpMethod.POST)
            .uri(LinksApi._PATH_LINKS_POST)
            .header(tgChatHeaderName, nonExistingChatID)
            .contentType(MediaType.APPLICATION_JSON)
            .body(bodyLinkAdd)
            .retrieve()
            .toBodilessEntity()
        );

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    @Timeout(10)
    void listenLinkForDeletedChatSendsReceivesError() {
        String chatID = "1";
        String link = "https://github.com/openclaw/openclaw";
        String tgChatHeaderName = "Tg-Chat-Id";
        String bodyLinkAdd = String.format("{\"link\":\"%s\"}", link);

        var responseChatRegister = restClient.method(HttpMethod.POST)
            .uri(TgChatApi._PATH_TG_CHAT_ID_POST, chatID)
            .retrieve()
            .toBodilessEntity();
        var responseLinkAdd = restClient.method(HttpMethod.POST)
            .uri(LinksApi._PATH_LINKS_POST)
            .header(tgChatHeaderName, chatID)
            .contentType(MediaType.APPLICATION_JSON)
            .body(bodyLinkAdd)
            .retrieve()
            .toBodilessEntity();
        var responseChatDelete = restClient.method(HttpMethod.DELETE)
            .uri(TgChatApi._PATH_TG_CHAT_ID_DELETE, chatID)
            .retrieve()
            .toBodilessEntity();
        assertThatThrownBy(() -> restClient.method(HttpMethod.GET)
            .uri(LinksApi._PATH_LINKS_GET, link)
            .header(tgChatHeaderName, chatID)
            .retrieve()
            .toEntity(ListLinksResponse.class)
        );

        assertThat(responseChatRegister.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseLinkAdd.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(responseChatDelete.getStatusCode()).isEqualTo(HttpStatus.OK);
    }

    @Test
    @Timeout(10)
    void deleteNonExistingChatSendsReceivesError() {
        String chatID = "1";

        assertThatThrownBy(() -> restClient.method(HttpMethod.DELETE)
            .uri(TgChatApi._PATH_TG_CHAT_ID_DELETE, chatID)
            .retrieve()
            .toBodilessEntity()
        );
    }
}
