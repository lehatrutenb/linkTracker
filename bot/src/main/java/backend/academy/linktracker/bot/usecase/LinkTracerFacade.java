package backend.academy.linktracker.bot.usecase;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkUpdate;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.exceptions.RequestBodyFieldValidationException;
import backend.academy.linktracker.bot.usecase.mappers.TelegramUpdatesMapper;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.ReplyServiceMatcherService;
import backend.academy.linktracker.bot.usecase.services.ScrapperUpdatesHandleService;
import backend.academy.linktracker.bot.usecase.services.TelegramBotMessagesOrderService;
import com.pengrad.telegrambot.model.Update;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LinkTracerFacade {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final EventsStateWatcher eventsStateWatcher;
    private final TelegramBotMessagesOrderService messagesOrderService;
    private final ReplyServiceMatcherService replyServiceMatcher;
    private final ScrapperUpdatesHandleService scrapperUpdatesHandleService;

    // Need transactional here not to be inconsistent between event and message states

    /**
     *
     * @param updates
     * @param replyServiceQualifier
     * @return last fully processed eventID on prefix if exists such
     */
    public Optional<Integer> processLinkTrackerUpdates(Collection<Update> updates, Qualifier replyServiceQualifier) {
        updates.stream().filter(update -> update.message() != null).forEach(update -> {
            EventID eventId = TelegramUpdatesMapper.mapLinkTrackerUpdateId(update.updateId());
            TelegramBotMessage message = TelegramUpdatesMapper.map(update);
            if (eventsStateWatcher.toProcessEvent(eventId)) {
                if (messagesOrderService.toProcessMessage(message)) {
                    replyServiceMatcher.setReplyService(message.chat().id(), replyServiceQualifier);
                    eventsStateWatcher.markEventAsProcessing(eventId);
                    var event = new LinkTracerNewMessageEvent(this, message, eventId);
                    applicationEventPublisher.publishEvent(event);
                }
            } else if (!eventsStateWatcher.isEventDone(eventId)) {
                // We currently do some staff with that event
                messagesOrderService.addProcessingMessage(message);
            }
        });
        messagesOrderService.clear();
        return eventsStateWatcher
                .getNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType.LINK_TRACKER)
                .map(TelegramUpdatesMapper::mapUpdateId);
    }

    public void processScrapperUpdates(Collection<LinkUpdate> updates) {
        updates.forEach(update -> {
            EventID eventId = TelegramUpdatesMapper.mapScrapperUpdateId(
                    update.getId().orElseThrow(() -> RequestBodyFieldValidationException.ofEmptyError("update", "id")));
            if (eventsStateWatcher.toProcessEvent(eventId)) {
                eventsStateWatcher.markEventAsProcessing(eventId);
                scrapperUpdatesHandleService.handle(update, eventId);
            }
        });
    }
}
