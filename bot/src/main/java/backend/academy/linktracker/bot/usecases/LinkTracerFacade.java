package backend.academy.linktracker.bot.usecases;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.mappers.TelegramUpdatesMapper;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecases.services.TelegramBotMessagesService;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.MessageId;
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
    private final TelegramBotMessagesService messagesService;

    // Need transactional here not to be inconsistent between event and message states
    public void processUpdates(Collection<Update> updates, Qualifier replyServiceQualifier) {
        updates.forEach(update -> {
            EventID eventId = TelegramUpdatesMapper.mapUpdateId(update.updateId());
            if (eventsStateWatcher.toProcessEvent(eventId)) {
                TelegramBotMessage message = TelegramUpdatesMapper.map(update);
                if (messagesService.toProcessMessage(message)) {
                    eventsStateWatcher.markEventAsProcessing(eventId);
                    var event = new LinkTracerNewMessageEvent(
                            this, message, replyServiceQualifier, eventId);
                    applicationEventPublisher.publishEvent(event);
                }
            }
        });
    }
}
