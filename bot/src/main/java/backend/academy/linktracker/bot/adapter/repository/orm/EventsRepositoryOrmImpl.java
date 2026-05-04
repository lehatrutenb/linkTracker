package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.EventEntity;
import backend.academy.linktracker.bot.adapter.entity.EventIDEntity;
import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.core.port.EventsRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.time.Instant;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
@RequiredArgsConstructor
public class EventsRepositoryOrmImpl implements EventsRepository {
    private final EventsRepositoryOrmInner repository;

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public Collection<Event> readAllEvents() {
        return repository.findAll().stream().map(EventEntity::toDomain).toList();
    }

    @Override
    public Optional<Event> readEvent(EventID eventId) {
        return repository.findById(new EventIDEntity(eventId)).map(EventEntity::toDomain);
    }

    @Override
    public Optional<Event> readNumericFirstNotDoneEventByOwnerType(OwnerIDType type) {
        return repository
                .findByEventIDOwnerIDTypeAndStateNotOrderByIdAsc(type, EventState.DONE)
                .map(EventEntity::toDomain);
    }

    @Override
    public Optional<Event> readNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType type) {
        return repository.getNumericLastOfPrefixOfDoneByOwnerIdTypeAndState(type, EventState.DONE).stream()
                .findFirst()
                .map(EventEntity::toDomain);
    }

    @Override
    public Collection<Event> readEventsByOwnerTypeAndEventStateWhereUpdatedAtLessThan(
            OwnerIDType type, EventState state, Instant updateAt) {
        return repository.findAllByEventIDOwnerIDTypeAndStateAndUpdatedAtLessThan(type, state, updateAt).stream()
                .map(EventEntity::toDomain)
                .toList();
    }

    @Override
    @Transactional
    public Event updateEvent(Event event) {
        EventEntity curEntity =
                repository.getReferenceById(new EventIDEntity(event.id())); // Not to dirty core with outer fields
        EventEntity addEntity = new EventEntity(event);
        addEntity.setVersion(curEntity.getVersion());
        return entityManager.merge(addEntity).toDomain();
    }

    @Override
    public void createEvent(Event event) {
        repository.save(new EventEntity(event));
    }

    @Override
    public void deleteEventByID(EventID eventID) {
        repository.deleteById(new EventIDEntity(eventID));
    }
}
