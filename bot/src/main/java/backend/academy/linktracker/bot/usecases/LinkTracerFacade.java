package backend.academy.linktracker.bot.usecases;

import backend.academy.linktracker.bot.adapters.controllers.LinkTracerReplier;
import backend.academy.linktracker.bot.core.entities.EventId;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.mappers.TelegramUpdatesMapper;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import com.pengrad.telegrambot.model.Update;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import java.util.Collection;

@Service
@RequiredArgsConstructor
public class LinkTracerFacade {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final EventsStateWatcher eventsStateWatcher;

    public void processUpdates(Collection<Update> updates, LinkTracerReplier replier) {
        updates.forEach(update -> {
            EventId eventId = TelegramUpdatesMapper.mapUpdateId(update.updateId());
            if (eventsStateWatcher.toProcessEvent(eventId)) {
                eventsStateWatcher.markEventAsProcessing(eventId);
                applicationEventPublisher.publishEvent(new LinkTracerNewMessageEvent(this, TelegramUpdatesMapper.map(update), replier, eventId));
            }
        });
    }
}
