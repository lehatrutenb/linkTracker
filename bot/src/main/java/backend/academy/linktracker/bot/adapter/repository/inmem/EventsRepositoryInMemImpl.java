package backend.academy.linktracker.bot.adapter.repository.inmem;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.core.port.EventsRepository;
import java.time.Instant;
import java.util.Collection;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
@RequiredArgsConstructor
public class EventsRepositoryInMemImpl implements EventsRepository {
    Map<EventID, Event> events = new ConcurrentHashMap<>();

    @Override
    public Optional<Event> readEvent(EventID eventId) {
        return Optional.ofNullable(events.get(eventId));
    }

    @Override
    public Optional<Event> readNumericFirstNotDoneEventByOwnerType(OwnerIDType type) {
        return events.entrySet().stream()
                .filter(eventIDEventEntry -> eventIDEventEntry.getKey().getOwnerIDType() == type)
                .filter(entry -> !entry.getValue().state().equals(EventState.DONE))
                .min((entry1, entry2) -> entry1.getKey().numericComparing(entry2.getKey()))
                .map(Map.Entry::getValue);
    }

    @Override
    public Optional<Event> readNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType type) {
        var firstNotDone = readNumericFirstNotDoneEventByOwnerType(type);
        if (firstNotDone.isEmpty()) {
            return events.entrySet().stream()
                    .filter(id -> id.getKey().getOwnerIDType() == type)
                    .max((entry1, entry2) -> entry1.getKey().numericComparing(entry2.getKey()))
                    .map(Map.Entry::getValue);
        }
        return firstNotDone
                .flatMap(id -> events.entrySet().stream()
                        .filter(eventId -> eventId.getKey().numericComparing(id.id()) < 0)
                        .max((entry1, entry2) -> entry1.getKey().numericComparing(entry2.getKey())))
                .map(Map.Entry::getValue);
    }

    @Override
    public Collection<Event> readEventsByOwnerTypeAndEventStateWhereUpdatedAtLessThan(
            OwnerIDType ownerIDType, EventState eventState, Instant maxUpdatedAt) {
        return events.values().stream()
                .filter(event -> event.state() == eventState)
                .filter(event -> event.id().getOwnerIDType() == ownerIDType)
                .filter(event -> event.updatedAt().isBefore(maxUpdatedAt))
                .toList();
    }

    @Override
    public Event updateEvent(Event event) {
        events.put(event.id(), event);
        return event;
    }

    @Override
    public void createEvent(Event event) {
        updateEvent(event);
    }

    @Override
    public void deleteEvent(EventID eventID) {
        events.remove(eventID);
    }
}
