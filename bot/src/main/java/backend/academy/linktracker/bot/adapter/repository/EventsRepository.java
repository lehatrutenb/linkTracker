<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/core/port/EventsRepository.java
package backend.academy.linktracker.bot.core.port;
========
package backend.academy.linktracker.bot.adapter.repository;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/adapter/repository/EventsRepository.java

import backend.academy.linktracker.bot.core.entity.Event;
import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.enumeration.EventState;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
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
<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/core/port/EventsRepository.java

    void insertEvent(Event event);
========
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/adapter/repository/EventsRepository.java
}
