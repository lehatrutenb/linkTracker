package backend.academy.linktracker.bot.usecase;

import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
import backend.academy.linktracker.bot.usecase.dto.generated.LinkUpdate;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.exception.RequestBodyFieldValidationException;
import backend.academy.linktracker.bot.usecase.mapper.ScrapperEventsMapper;
import backend.academy.linktracker.bot.usecase.mapper.TelegramUpdatesMapper;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.ScrapperUpdatesHandleService;
import backend.academy.linktracker.bot.usecase.service.TelegramBotMessagesOrderService;
import com.pengrad.telegrambot.model.Update;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class LinkTracerFacade {
    private final ApplicationEventPublisher applicationEventPublisher;
    private final EventsStateWatcher eventsStateWatcher;
    private final TelegramBotMessagesOrderService messagesOrderService;
    private final ScrapperUpdatesHandleService scrapperUpdatesHandleService;

    // Need transactional here not to be inconsistent between event and message states

    /**
     *
     * @param updates
     * @return last fully processed eventID on prefix if exists such
     */
    public Optional<Integer> processLinkTrackerUpdates(Collection<Update> updates) {
        updates.stream().forEach(update -> {
            EventID eventId = TelegramUpdatesMapper.mapLinkTrackerUpdateId(update.updateId());
            TelegramBotMessage message = TelegramUpdatesMapper.map(update);
            if (eventsStateWatcher.toProcessEvent(eventId)) {
                if (messagesOrderService.toProcessMessage(message)) {
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

    public void processScrapperUpdates(Collection<LinkUpdate> updates) throws RequestBodyFieldValidationException {
        for (var update : updates) {
            EventID eventId = ScrapperEventsMapper.mapScrapperUpdateId(
                    update.getId().orElseThrow(() -> RequestBodyFieldValidationException.ofEmptyError("update", "id")));
            if (eventsStateWatcher.toProcessEvent(eventId)) {
                eventsStateWatcher.markEventAsProcessing(eventId);
                scrapperUpdatesHandleService.handle(update, eventId);
            }
        }
    }
}
