package backend.academy.linktracker.bot.usecases.services;

import backend.academy.linktracker.bot.adapters.repository.EventsRepository;
import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventId;
import backend.academy.linktracker.bot.core.enums.EventState;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

// We don't need any stateful disk repo to handle events states cause tg
@Service
@RequiredArgsConstructor
public class EventsStateWatcher {
    private final EventsRepository eventsRepository;

    public boolean toProcessEvent(EventId eventId) {
        var event = eventsRepository.getEvent(eventId);
        return event.isEmpty() || event.get().state().equals(EventState.NOT_INITED); // TODO add new initiation of events processing on timeout
    }

    public void markEventAsDone(EventId eventId) {
        eventsRepository.updateEvent(new Event(eventId, EventState.DONE));
    }

    public void markEventAsProcessing(EventId eventId) {
        eventsRepository.updateEvent(new Event(eventId, EventState.PROCESSING));
    }

    public Optional<EventId> getNumericLastOfPrefixOfDone() {
        return eventsRepository.getNumericLastOfPrefixOfDone();
    }
}
