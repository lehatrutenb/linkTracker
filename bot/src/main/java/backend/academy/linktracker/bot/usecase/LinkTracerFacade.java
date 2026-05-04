package backend.academy.linktracker.bot.usecase;

import backend.academy.linktracker.bot.common.TransactionHandler;
import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkUpdateRequest;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.exceptions.RequestBodyFieldValidationException;
import backend.academy.linktracker.bot.usecase.mappers.TelegramUpdatesMapper;
import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
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
import org.springframework.context.annotation.Lazy;
import jakarta.transaction.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class LinkTracerFacade {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final EventsStateWatcher eventsStateWatcher;
    private final TelegramBotMessagesOrderService messagesOrderService;
    private final BotChatMetaDataService replyServiceMatcher;
    private final ScrapperUpdatesHandleService scrapperUpdatesHandleService;
    private final TransactionHandler transactionHandler; // Also may use trick with same class entity inside, but that looks better

    // Need transactional here not to be inconsistent between event and message states
    /**
     *
     * @param updates
     * @param replyServiceQualifier
     * @return last fully processed eventID on prefix if exists such
     */
    public Optional<Integer> processLinkTrackerUpdates(Collection<Update> updates, Qualifier replyServiceQualifier) {
        updates.stream().filter(update -> update.message() != null).forEach(update -> {
            transactionHandler.runInNewTransaction(() -> this.processLinkTrackerUpdate(update, replyServiceQualifier));
        });
        messagesOrderService.clear();
        return eventsStateWatcher
                .getNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType.LINK_TRACKER)
                .map(Event::id)
                .map(TelegramUpdatesMapper::mapUpdateId);
    }

    @Transactional
    private void processLinkTrackerUpdate(Update update, Qualifier replyServiceQualifier) {
        EventID eventId = TelegramUpdatesMapper.mapLinkTrackerUpdateId(update.updateId());
        TelegramBotMessage message = TelegramUpdatesMapper.map(update, replyServiceQualifier);
        if (eventsStateWatcher.toProcessEvent(eventId)) {
            if (messagesOrderService.toProcessMessage(message)) {
                replyServiceMatcher.createBotChat(
                        new BotChat(message.chat().getId(), replyServiceQualifier.value())); // TODO map in mapper
                eventsStateWatcher.markEventAsProcessing(eventId);
                var event = new LinkTracerNewMessageEvent(this, message, eventId);
                applicationEventPublisher.publishEvent(event);
            }
        } else if (!eventsStateWatcher.isEventDone(eventId)) {
            // We currently do some staff with that event
            messagesOrderService.addProcessingMessage(message);
        }
    }

    public void processScrapperUpdates(Collection<LinkUpdateRequest> updates) {
        updates.forEach(update -> {
            transactionHandler.runInNewTransaction(() -> processScrapperUpdate(update));
        });
    }

    @Transactional
    private void processScrapperUpdate(LinkUpdateRequest update) {
        EventID eventId = TelegramUpdatesMapper.mapScrapperUpdateId(
                update.getId().orElseThrow(() -> RequestBodyFieldValidationException.ofEmptyError("update", "id")));
        if (eventsStateWatcher.toProcessEvent(eventId)) {
            eventsStateWatcher.markEventAsProcessing(eventId);
            scrapperUpdatesHandleService.handle(TelegramUpdatesMapper.mapLinkUpdateRequest(update), eventId);
        }
    }
}
