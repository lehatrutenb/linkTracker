package backend.academy.linktracker.bot.usecase;

import backend.academy.linktracker.bot.core.entity.BotChat;
import backend.academy.linktracker.bot.core.entity.Event;
import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
import backend.academy.linktracker.bot.core.port.BotChatEntityRepository;
import backend.academy.linktracker.bot.core.port.TelegramBotMessagesRepository;
import backend.academy.linktracker.bot.core.port.TelegramBotUserRepository;
import backend.academy.linktracker.bot.usecase.dto.generated.LinkUpdate;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.exception.RequestBodyFieldValidationException;
import backend.academy.linktracker.bot.usecase.mapper.TelegramUpdatesMapper;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.ScrapperUpdatesHandleService;
import backend.academy.linktracker.bot.usecase.service.TelegramBotMessagesOrderService;
import com.pengrad.telegrambot.model.Update;
import jakarta.annotation.PostConstruct;
import java.util.Collection;
import java.util.Optional;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.support.TransactionTemplate;

@Slf4j
@Service
@RequiredArgsConstructor
public class LinkTracerFacade {
    private final Lock processingLock = new ReentrantLock(true);

    private final ApplicationEventPublisher applicationEventPublisher;
    private final EventsStateWatcher eventsStateWatcher;
    private final TelegramBotMessagesOrderService messagesOrderService;
    private final BotChatEntityRepository botChatsRepository;
    private final TelegramBotUserRepository botUsersRepository;
    private final ScrapperUpdatesHandleService scrapperUpdatesHandleService;
    private final TelegramBotMessagesRepository botMessagesRepository;
    private final TransactionTemplate transactionTemplate;

    @PostConstruct
    void setIsolation() {
        transactionTemplate.setIsolationLevel(TransactionDefinition.ISOLATION_SERIALIZABLE);
    }

    public Optional<Integer> processLinkTrackerUpdates(Collection<Update> updates) {
        processingLock.lock();
        try {
            messagesOrderService.clear();
            updates.forEach(update ->
                    transactionTemplate.executeWithoutResult(status -> this.processLinkTrackerUpdate(update)));
            return eventsStateWatcher
                    .getNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType.LINK_TRACKER)
                    .map(Event::id)
                    .map(TelegramUpdatesMapper::mapUpdateId);
        } finally {
            processingLock.unlock();
        }
    }

    private void processLinkTrackerUpdate(Update update) {
        EventID eventId = TelegramUpdatesMapper.mapLinkTrackerUpdateId(update.updateId());
        TelegramBotMessage message = TelegramUpdatesMapper.map(update);

        if (eventsStateWatcher.toProcessEvent(eventId)) {
            if (messagesOrderService.toProcessMessage(message)) {
                log.atInfo()
                        .addKeyValue("message id", message.id())
                        .addKeyValue("chat id", message.chat().getId())
                        .log("Processing new message");
                if (botUsersRepository
                        .getTelegramBotUser(message.user().userId())
                        .isEmpty()) {
                    botUsersRepository.createTelegramBotUser(message.user());
                }
                if (botChatsRepository.getBotChat(message.chat().getId()).isEmpty()) {
                    botChatsRepository.createBotChat(new BotChat(message.chat().getId()));
                }
                message = botMessagesRepository.createMessage(message);
                eventsStateWatcher.markEventAsProcessing(eventId);
                var event = new LinkTracerNewMessageEvent(this, message, eventId);
                messagesOrderService.addProcessingMessage(message);
                applicationEventPublisher.publishEvent(event);
            }
        } else if (!eventsStateWatcher.isEventDone(eventId)) {
            messagesOrderService.addProcessingMessage(message);
        }
    }

    public void processScrapperUpdates(Collection<LinkUpdate> updates) throws RequestBodyFieldValidationException {
        processingLock.lock();
        try {
            updates.forEach(update -> transactionTemplate.executeWithoutResult(status -> {
                try {
                    this.processScrapperUpdate(update);
                } catch (RequestBodyFieldValidationException e) {
                    throw new RuntimeException(e);
                }
            }));
        } finally {
            processingLock.unlock();
        }
    }

    private void processScrapperUpdate(LinkUpdate update) throws RequestBodyFieldValidationException {
        EventID eventId = TelegramUpdatesMapper.mapScrapperUpdateId(
                update.getId().orElseThrow(() -> RequestBodyFieldValidationException.ofEmptyError("update", "id")));
        if (eventsStateWatcher.toProcessEvent(eventId)) {
            eventsStateWatcher.markEventAsProcessing(eventId);
            scrapperUpdatesHandleService.handle(TelegramUpdatesMapper.mapLinkUpdate(update), eventId);
        }
    }
}
