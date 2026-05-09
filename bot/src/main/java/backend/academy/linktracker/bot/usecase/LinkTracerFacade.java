package backend.academy.linktracker.bot.usecase;

import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.core.port.BotChatEntityRepository;
import backend.academy.linktracker.bot.core.port.TelegramBotMessagesRepository;
import backend.academy.linktracker.bot.core.port.TelegramBotUserRepository;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkUpdateRequest;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.exceptions.RequestBodyFieldValidationException;
import backend.academy.linktracker.bot.usecase.mappers.TelegramUpdatesMapper;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.ScrapperUpdatesHandleService;
import backend.academy.linktracker.bot.usecase.services.TelegramBotMessagesOrderService;
import com.pengrad.telegrambot.model.Update;
import jakarta.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.support.TransactionTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class LinkTracerFacade {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final EventsStateWatcher eventsStateWatcher;
    private final TelegramBotMessagesOrderService messagesOrderService;
    private final BotChatEntityRepository botChatsRepository;
    private final TelegramBotUserRepository botUsersRepository;
    private final ScrapperUpdatesHandleService scrapperUpdatesHandleService;
    private final TelegramBotMessagesRepository botMessagesRepository;
    private final TransactionTemplate transactionTemplate;

    // Need transactional here not to be inconsistent between event and message states
    /**
     *
     * @param updates
     * @param replyServiceQualifier
     * @return last fully processed eventID on prefix if exists such
     */
    public Optional<Integer> processLinkTrackerUpdates(Collection<Update> updates, Qualifier replyServiceQualifier) {
        messagesOrderService.clear();
        updates.stream().filter(update -> update.message() != null).forEach(update -> {
            transactionTemplate.executeWithoutResult(
                    status -> this.processLinkTrackerUpdate(update, replyServiceQualifier));
        });
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
                log.atInfo()
                        .addKeyValue("message id", message.id())
                        .addKeyValue("chat id", message.chat().getId())
                        .log("Processing new message");
                if (botUsersRepository
                        .getTelegramBotUser(message.user().userId())
                        .isEmpty()) {
                    botUsersRepository.createTelegramBotUser(
                            message.user()); // Globally user info may change, but we do not really depents on such
                    // changes
                }
                if (botChatsRepository.getBotChat(message.chat().getId()).isEmpty()) {
                    botChatsRepository.createBotChat(
                            new BotChat(message.chat().getId(), replyServiceQualifier.value())); // TODO map in mapper
                }
                message = botMessagesRepository.createMessage(message);
                eventsStateWatcher.markEventAsProcessing(eventId);
                var event = new LinkTracerNewMessageEvent(this, message, eventId);
                messagesOrderService.addProcessingMessage(message);
                // Run in new transaction to be consistent with listeners
                applicationEventPublisher.publishEvent(event);
            }
        } else if (!eventsStateWatcher.isEventDone(eventId)) {
            // We currently do some staff with that event
            messagesOrderService.addProcessingMessage(message);
        }
    }

    public void processScrapperUpdates(Collection<LinkUpdateRequest> updates) {
        updates.forEach(update -> {
            transactionTemplate.executeWithoutResult(status -> processScrapperUpdate(update));
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
