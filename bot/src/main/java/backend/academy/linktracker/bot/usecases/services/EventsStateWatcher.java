package backend.academy.linktracker.bot.usecases.services;

import backend.academy.linktracker.bot.adapters.repository.EventsRepository;
import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// We don't need any stateful disk repo to handle events states cause tg TODO recheck
@Service
@RequiredArgsConstructor
public class EventsStateWatcher {
    private final EventsRepository eventsRepository;

    public boolean toProcessEvent(EventID eventId) {
        var event = eventsRepository.getEvent(eventId);
        return event.isEmpty()
                || event.orElseThrow()
                        .state()
                        .equals(EventState.NOT_INITED); // TODO add new initiation of events processing on timeout
    }

    public void markEventAsDone(EventID eventId) {
        eventsRepository.updateEvent(new Event(eventId, EventState.DONE));
    }

    public void markEventAsProcessing(EventID eventId) {
        eventsRepository.updateEvent(new Event(eventId, EventState.PROCESSING));
    }

    public Optional<EventID> getNumericLastOfPrefixOfDone() {
        return eventsRepository.getNumericLastOfPrefixOfDone();
    }
}
