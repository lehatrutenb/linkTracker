package backend.academy.linktracker.bot.usecase.services;

import backend.academy.linktracker.bot.common.TimeUtils;
import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.core.port.EventsRepository;
import backend.academy.linktracker.bot.property.TelegramLinkTrackerProperties;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// We don't need any stateful disk repo to handle events states cause tg TODO recheck
@Service
@RequiredArgsConstructor
public class EventsStateWatcher {
    private final EventsRepository eventsRepository;
    private final TimeUtils timeUtils;
    private final TelegramLinkTrackerProperties telegramLinkTrackerProperties;

    public boolean toProcessEvent(EventID eventId) {
        var event = eventsRepository.readEvent(eventId);
        return event.isEmpty()
                || event.orElseThrow()
                        .state()
                        .equals(EventState.NOT_INITED); // TODO add new initiation of events processing on timeout
    }

    public boolean isEventDone(EventID eventId) {
        var event = eventsRepository.readEvent(eventId);
        return event.isPresent() && event.orElseThrow().state().equals(EventState.DONE);
    }

    public void markEventAsDone(EventID eventId) {
        eventsRepository.updateEvent(new Event(eventId, EventState.DONE, timeUtils.now()));
    }

    public void markEventAsSkipped(EventID eventId) {
        eventsRepository.updateEvent(new Event(eventId, EventState.SKIPPED, timeUtils.now()));
    }

    public void markEventAsProcessing(EventID eventId) {
        eventsRepository.createEvent(new Event(eventId, EventState.PROCESSING, timeUtils.now()));
    }

    public Collection<Event> getElderlyProcessingEvents(OwnerIDType ownerIDType) {
        return eventsRepository.readEventsByOwnerTypeAndEventStateWhereUpdatedAtLessThan(
                ownerIDType,
                EventState.PROCESSING,
                timeUtils.now().minus(telegramLinkTrackerProperties.getUpdateNotifierBeforeRetry()));
    }

    public Optional<Event> getNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType type) {
        return eventsRepository.readNumericLastOfPrefixOfDoneByOwnerType(type);
    }
}
