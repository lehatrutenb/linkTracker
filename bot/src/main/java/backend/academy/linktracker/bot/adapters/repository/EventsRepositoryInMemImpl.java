package backend.academy.linktracker.bot.adapters.repository;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Repository;

@Repository
public class EventsRepositoryInMemImpl implements EventsRepository {
    Map<EventID, Event> events = new ConcurrentHashMap<>();

    @Override
    public Optional<Event> getEvent(EventID eventId) {
        return Optional.ofNullable(events.get(eventId));
    }

    @Override
    public Optional<EventID> getNumericFirstNotDoneEvent() {
        return events.entrySet().stream()
                .filter(entry -> !entry.getValue().state().equals(EventState.DONE))
                .map(Map.Entry::getKey)
                .min(EventID::numericComparing);
    }

    @Override
    public Optional<EventID> getNumericLastOfPrefixOfDone() {
        var firstNotDone = getNumericFirstNotDoneEvent();
        return firstNotDone.flatMap(id -> events.keySet().stream()
                .filter(eventId -> eventId.numericComparing(id) < 0)
                .max(EventID::numericComparing));
    }

    @Override
    public void updateEvent(Event event) {
        events.put(event.id(), event);
    }
}
