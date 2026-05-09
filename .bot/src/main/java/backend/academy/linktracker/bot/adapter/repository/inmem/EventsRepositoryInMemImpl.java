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
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
// @ConditionalOnProperty(
//    name = "app.data.access-type",
//    havingValue = "IN_MEM",
//    matchIfMissing = true
// )
@RequiredArgsConstructor
public class EventsRepositoryInMemImpl implements EventsRepository {
    Map<EventID, Event> events = new ConcurrentHashMap<>();
    final ApplicationContext applicationContext;

    @Override
    public Optional<Event> getEvent(EventID eventId) {
        return Optional.ofNullable(events.get(eventId));
    }

    @Override
    public Optional<EventID> getNumericFirstNotDoneEventByOwnerType(OwnerIDType type) {
        return events.entrySet().stream()
                .filter(eventIDEventEntry -> eventIDEventEntry.getKey().getOwnerIDType() == type)
                .filter(entry -> !entry.getValue().state().equals(EventState.DONE))
                .map(Map.Entry::getKey)
                .min(EventID::numericComparing);
    }

    @Override
    public Optional<EventID> getNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType type) {
        var firstNotDone = getNumericFirstNotDoneEventByOwnerType(type);
        if (firstNotDone.isEmpty()) {
            return events.keySet().stream()
                    .filter(id -> id.getOwnerIDType() == type)
                    .max(EventID::numericComparing);
        }
        return firstNotDone.flatMap(id -> events.keySet().stream()
                .filter(eventId -> eventId.numericComparing(id) < 0)
                .max(EventID::numericComparing));
    }

    @Override
    public Collection<Event> getEventsByOwnerTypeAndEventStateWhereUpdatedAtLessThan(
            OwnerIDType ownerIDType, EventState eventState, Instant maxUpdatedAt) {
        return events.values().stream()
                .filter(event -> event.state() == eventState)
                .filter(event -> event.id().getOwnerIDType() == ownerIDType)
                .filter(event -> event.updatedAt().isBefore(maxUpdatedAt))
                .toList();
    }

    @Override
    public void updateEvent(Event event) {
        events.put(event.id(), event);
    }

    @Override
    public void insertEvent(Event event) {
        updateEvent(event);
    }
}
