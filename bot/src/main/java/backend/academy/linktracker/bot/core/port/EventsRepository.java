package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entity.Event;
import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.enumeration.EventState;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
import java.time.Instant;
import java.util.Collection;
import java.util.Optional;

public interface EventsRepository {
    Optional<Event> readEvent(EventID eventId);

    Optional<Event> readNumericFirstNotDoneEventByOwnerType(OwnerIDType type);

    Optional<Event> readNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType type);

    Collection<Event> readEventsByOwnerTypeAndEventStateWhereUpdatedAtLessThan(
            OwnerIDType ownerIDType, EventState eventState, Instant updateAt);

    void createEvent(Event event);

    Event updateEvent(Event event);

    void deleteEvent(EventID eventID);
}
