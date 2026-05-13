package backend.academy.linktracker.scrapper.usecase.service;

import backend.academy.linktracker.scrapper.adapter.client.TelegramBotUpdatesHTTPClient;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.usecase.dto.LinkUpdate;
import backend.academy.linktracker.scrapper.usecase.dto.ScrapperLinkUpdateEvent;
import cn.hutool.core.lang.Snowflake;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScrappedUpdatesPublishService {
    private final ScrappingLinkService linkListenersService;
    private final TelegramBotUpdatesHTTPClient updatesClient;
    private final Snowflake
            updateIDGenerator; // TODO Currently just used to set unique IDS, later should be used by repo inside
    // scrapper not to loose updates

    void publishUpdates(Collection<ScrapperLinkUpdateEvent> updateEvents, ScrapperLink link) {
        var linkListeners = linkListenersService.getListenersOfLink(link.id());
        updateEvents.forEach(update -> {
            updatesClient.publishUpdate(new LinkUpdate()
                    .id(updateIDGenerator.nextId())
                    .url(link.uri())
                    .description(update.description().description())
                    .tgChatIds(linkListeners.stream()
                            .map(listener -> Long.valueOf(listener.listenerID()))
                            .toList()));
        });
    }
}
