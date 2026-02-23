package backend.academy.linktracker.bot.adapters.repository;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventId;
import backend.academy.linktracker.bot.core.enums.EventState;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class EventsRepositoryInMemImpl implements EventsRepository {
    Map<EventId, Event> events = new ConcurrentHashMap<>();

    @Override
    public Optional<Event> getEvent(EventId eventId) {
        return Optional.ofNullable(events.get(eventId));
    }

    @Override
    public Optional<EventId> getNumericFirstNotDoneEvent() {
        return events.entrySet().stream()
                .filter(entry -> !entry.getValue().state().equals(EventState.DONE))
                .map(Map.Entry::getKey)
                .min(EventId::numericComparing);
    }

    @Override
    public Optional<EventId> getNumericLastOfPrefixOfDone() {
        var firstNotDone = getNumericFirstNotDoneEvent();
        return firstNotDone.flatMap(id -> events.keySet().stream()
                .filter(eventId -> eventId.numericComparing(id) < 0)
                .max(EventId::numericComparing));
    }

    @Override
    public void updateEvent(Event event) {
        events.put(event.id(), event);
    }
}
