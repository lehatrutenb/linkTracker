package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.adapter.repository.EventsRepository;
import backend.academy.linktracker.bot.core.entity.Event;
import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.enumeration.EventState;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
import backend.academy.linktracker.bot.property.TelegramLinkTrackerProperties;
import java.time.Instant;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// We don't need any stateful disk repo to handle events states cause tg TODO recheck
@Service
@RequiredArgsConstructor
public class EventsStateWatcher {
    private final EventsRepository eventsRepository;
    private final TelegramLinkTrackerProperties telegramLinkTrackerProperties;

    public boolean toProcessEvent(EventID eventId) {
        var event = eventsRepository.getEvent(eventId);
        return event.isEmpty()
                || event.orElseThrow()
                        .state()
                        .equals(EventState.NOT_INITED); // TODO add new initiation of events processing on timeout
    }

    public boolean isEventDone(EventID eventId) {
        var event = eventsRepository.getEvent(eventId);
        return event.isPresent() && event.orElseThrow().state().equals(EventState.DONE);
    }

    public void markEventAsDone(EventID eventId) {
        eventsRepository.updateEvent(new Event(eventId, EventState.DONE, now()));
    }

    public void markEventAsSkipped(EventID eventId) {
        eventsRepository.updateEvent(new Event(eventId, EventState.SKIPPED, now()));
    }

    public void markEventAsProcessing(EventID eventId) {
        eventsRepository.updateEvent(new Event(eventId, EventState.PROCESSING, now()));
    }

    public Collection<Event> getElderlyProcessingEvents(OwnerIDType ownerIDType) {
        return eventsRepository.getEventsByOwnerTypeAndEventStateWhereUpdatedAtLessThan(
                ownerIDType,
                EventState.PROCESSING,
                now().minus(telegramLinkTrackerProperties.getUpdateNotifierBeforeRetry()));
    }

    public Optional<EventID> getNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType type) {
        return eventsRepository.getNumericLastOfPrefixOfDoneByOwnerType(type);
    }

    private Instant now() {
        return Instant.now();
    }
}
