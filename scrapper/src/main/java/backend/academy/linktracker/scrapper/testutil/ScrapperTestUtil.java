package backend.academy.linktracker.scrapper.testutil;

import backend.academy.linktracker.scrapper.adapter.controller.LinksApiController;
import backend.academy.linktracker.scrapper.adapter.controller.TgChatApiController;
import backend.academy.linktracker.scrapper.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.ListLinksResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.RemoveLinkRequest;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

public class ScrapperTestUtil {
    private static final String TG_CHAT_HEADER_NAME = "Tg-Chat-Id";

    private RestClient restClient;
    private static AtomicLong globalChatID = new AtomicLong(0);
    private long chatID;

    public ScrapperTestUtil(RestClient restClient) {
        this.restClient = restClient;
        this.chatID = globalChatID.incrementAndGet();
    }

    public ResponseEntity<Void> registerChat(long chatID) {
        return restClient
                .method(HttpMethod.POST)
                .uri(TgChatApiController.PATH_TG_CHAT_ID_POST, Long.toString(chatID))
                .retrieve()
                .toBodilessEntity();
    }

    public ResponseEntity<Void> registerChat() {
        return registerChat(chatID);
    }

    public ResponseEntity<Void> deleteChat(long chatID) {
        return restClient
                .method(HttpMethod.DELETE)
                .uri(TgChatApiController.PATH_TG_CHAT_ID_DELETE, Long.toString(chatID))
                .retrieve()
                .toBodilessEntity();
    }

    public ResponseEntity<Void> deleteChat() {
        return deleteChat(chatID);
    }

    public ResponseEntity<LinkResponse> addLink(long chatID, AddLinkRequest addLinkRequest) {
        return restClient
                .method(HttpMethod.POST)
                .uri(LinksApiController.PATH_LINKS_POST)
                .header(TG_CHAT_HEADER_NAME, Long.toString(chatID))
                .contentType(MediaType.APPLICATION_JSON)
                .body(addLinkRequest)
                .retrieve()
                .toEntity(LinkResponse.class);
    }

    public ResponseEntity<LinkResponse> addLink(AddLinkRequest addLinkRequest) {
        return addLink(chatID, addLinkRequest);
    }

    public ResponseEntity<LinkResponse> deleteLink(long chatID, RemoveLinkRequest removeLinkRequest) {
        return restClient
                .method(HttpMethod.DELETE)
                .uri(LinksApiController.PATH_LINKS_DELETE)
                .header(TG_CHAT_HEADER_NAME, Long.toString(chatID))
                .contentType(MediaType.APPLICATION_JSON)
                .body(removeLinkRequest)
                .retrieve()
                .toEntity(LinkResponse.class);
    }

    public ResponseEntity<LinkResponse> deleteLink(RemoveLinkRequest removeLinkRequest) {
        return deleteLink(chatID, removeLinkRequest);
    }

    public ResponseEntity<ListLinksResponse> getLinks(long chatID) {
        return restClient
                .method(HttpMethod.GET)
                .uri(LinksApiController.PATH_LINKS_GET)
                .header(TG_CHAT_HEADER_NAME, Long.toString(chatID))
                .retrieve()
                .toEntity(ListLinksResponse.class);
    }

    public ResponseEntity<ListLinksResponse> getLinks() {
        return getLinks(chatID);
    }
}
