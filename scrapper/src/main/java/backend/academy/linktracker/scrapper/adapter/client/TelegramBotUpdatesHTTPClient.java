package backend.academy.linktracker.scrapper.adapter.client;

import backend.academy.linktracker.scrapper.property.ScrapperTelegramBotLinkTrackerProperties;
import backend.academy.linktracker.scrapper.usecase.dto.LinkUpdate;
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

    public synchronized void publishUpdate(LinkUpdate linkUpdate) {
        restClient
                .post()
                .uri(trackerProperties.getPaths().getUpdates())
                .body(linkUpdate)
                .retrieve()
                .toBodilessEntity();
    }
}
