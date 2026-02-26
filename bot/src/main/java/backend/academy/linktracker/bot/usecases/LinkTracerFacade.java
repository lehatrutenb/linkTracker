package backend.academy.linktracker.bot.usecases;

import backend.academy.linktracker.bot.core.entities.EventId;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.mappers.TelegramUpdatesMapper;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import com.pengrad.telegrambot.model.Update;
import java.util.Collection;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkTracerFacade {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final EventsStateWatcher eventsStateWatcher;

    public void processUpdates(Collection<Update> updates, Qualifier replyServiceQualifier) {
        updates.forEach(update -> {
            EventId eventId = TelegramUpdatesMapper.mapUpdateId(update.updateId());
            if (eventsStateWatcher.toProcessEvent(eventId)) {
                eventsStateWatcher.markEventAsProcessing(eventId);
                var event = new LinkTracerNewMessageEvent(
                        this, TelegramUpdatesMapper.map(update), replyServiceQualifier, eventId);
                applicationEventPublisher.publishEvent(event);
            }
        });
    }
}
