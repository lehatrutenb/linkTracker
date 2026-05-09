package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import java.time.Instant;
import java.util.Collection;
import java.util.Optional;

public interface EventsRepository {
    Optional<Event> getEvent(EventID eventId);

    Optional<EventID> getNumericFirstNotDoneEventByOwnerType(OwnerIDType type);

    Optional<EventID> getNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType type);

    Collection<Event> getEventsByOwnerTypeAndEventStateWhereUpdatedAtLessThan(
            OwnerIDType ownerIDType, EventState eventState, Instant updateAt);

    void updateEvent(Event event);

    void insertEvent(Event event);
}
