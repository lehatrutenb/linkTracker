package backend.academy.linktracker.bot.adapters.repository;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import java.util.Optional;

public interface EventsRepository {
    Optional<Event> getEvent(EventID eventId);

    Optional<EventID> getNumericFirstNotDoneEvent();

    Optional<EventID> getNumericLastOfPrefixOfDone();

    void updateEvent(Event event); // TODO is it fine to use core event structure there?
}
