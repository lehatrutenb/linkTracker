package backend.academy.linktracker.bot.adapters.repository;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventId;
import java.util.Optional;

public interface EventsRepository {
    Optional<Event> getEvent(EventId eventId);

    Optional<EventId> getNumericFirstNotDoneEvent();

    Optional<EventId> getNumericLastOfPrefixOfDone();

    void updateEvent(Event event); // TODO is it fine to use core event structure there?
}
