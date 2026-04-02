package backend.academy.linktracker.scrapper.adapters.controllers;

import backend.academy.linktracker.scrapper.properties.ScrapperTelegramBotLinkTrackerProperties;
import backend.academy.linktracker.scrapper.usecases.dtos.LinkUpdate;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClient;

@Component
@RefreshScope
public class TelegramBotUpdatesHTTPClient {
    private ScrapperTelegramBotLinkTrackerProperties trackerProperties;
    private RestClient restClient;

    public TelegramBotUpdatesHTTPClient(ScrapperTelegramBotLinkTrackerProperties trackerProperties) {
        this.trackerProperties = trackerProperties;
        restClient = RestClient.create(trackerProperties.getApiPath());
    }

    public void publishUpdate(LinkUpdate linkUpdate) {
        var response = restClient
                .post()
                .uri(trackerProperties.getPaths().getUpdates())
                .body(linkUpdate)
                .retrieve()
                .toBodilessEntity();
    }
}
