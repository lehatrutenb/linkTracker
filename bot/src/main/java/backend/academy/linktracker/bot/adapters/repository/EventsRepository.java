package backend.academy.linktracker.bot.adapters.repository;


import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventId;
import backend.academy.linktracker.bot.core.enums.EventState;
import java.util.Optional;

public interface EventsRepository {
    public Optional<Event> getEvent(EventId eventId);
    public Optional<EventId> getNumericFirstNotDoneEvent();
    public Optional<EventId> getNumericLastOfPrefixOfDone();
    public void updateEvent(Event event); // TODO is it fine to use core event structure there?
}
