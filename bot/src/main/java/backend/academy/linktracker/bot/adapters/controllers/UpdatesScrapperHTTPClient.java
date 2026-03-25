package backend.academy.linktracker.bot.adapters.controllers;

import backend.academy.linktracker.bot.properties.UpdatedScrapperApiProperties;
import backend.academy.linktracker.bot.usecases.dtos.AddLinkRequest;
import backend.academy.linktracker.bot.usecases.dtos.LinkResponse;
import backend.academy.linktracker.bot.usecases.dtos.ListLinksResponse;
import backend.academy.linktracker.bot.usecases.dtos.RemoveLinkRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
public class UpdatesScrapperHTTPClient {
    private UpdatedScrapperApiProperties configuration;
    private RestClient restClient;
    private static final String TG_CHAT_ID_HEADER = "Tg-Chat-Id";

    public UpdatesScrapperHTTPClient(UpdatedScrapperApiProperties configuration) {
        this.configuration = configuration;
        restClient = RestClient.create(configuration.getApiPath());
    }

    public void registerChat(String chatID) {
        var response = restClient
                .post()
                .uri(uriBuilder ->
                        uriBuilder.path(configuration.getPaths().getAddChat()).build(chatID))
                .retrieve()
                .toBodilessEntity();
    }

    public void deleteChat(String chatID) {
        var response = restClient
                .delete()
                .uri(uriBuilder -> uriBuilder
                        .path(configuration.getPaths().getDeleteChat())
                        .build(chatID))
                .retrieve()
                .toBodilessEntity();
    }

    public ListLinksResponse listLinks(String chatID) {
        var response = restClient
                .get()
                .uri(configuration.getPaths().getListLinks())
                .header(TG_CHAT_ID_HEADER, chatID)
                .retrieve()
                .toEntity(ListLinksResponse.class);
        return response.getBody();
    }

    public LinkResponse trackLink(String chatID, AddLinkRequest request) {
        var response = restClient
                .post()
                .uri(uriBuilder ->
                        uriBuilder.path(configuration.getPaths().getTrackLink()).build())
                .header(TG_CHAT_ID_HEADER, chatID)
                .body(request)
                .retrieve()
                .toEntity(LinkResponse.class);
        return response.getBody();
    }

    public LinkResponse untrackLink(String chatID, RemoveLinkRequest request) {
        var response = restClient
                .post()
                .uri(uriBuilder -> uriBuilder
                        .path(configuration.getPaths().getUntrackLink())
                        .build())
                .header(TG_CHAT_ID_HEADER, chatID)
                .body(request)
                .retrieve()
                .toEntity(LinkResponse.class);
        return response.getBody();
    }
}
