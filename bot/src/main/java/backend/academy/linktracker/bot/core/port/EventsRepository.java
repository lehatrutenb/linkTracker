package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
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
