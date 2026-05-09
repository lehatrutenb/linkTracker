package backend.academy.linktracker.bot.adapter.repository.selfmanaged;

import backend.academy.linktracker.bot.adapter.entity.EventEntity;
import backend.academy.linktracker.bot.adapter.entity.EventIDEntity;
import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.core.port.EventsRepository;
import java.sql.Timestamp;
import java.time.Instant;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "SQL")
@Primary
@RequiredArgsConstructor
public class EventsRepositorySelfManagedImpl implements EventsRepository {
    private final JdbcClient client;

    @Override
    public Optional<Event> getEvent(EventID eventId) {
        return client.sql("SELECT * FROM event WHERE id = :id")
                .param("id", EventIDEntity.getID(eventId))
                .query(EventEntity.class)
                .optional()
                .map(EventEntity::toDomain);
    }

    @Override
    public Optional<EventID> getNumericFirstNotDoneEventByOwnerType(OwnerIDType type) {
        return client.sql(
                        "SELECT * FROM event WHERE owner_id_type = :owner_id_type AND state <> :done_state ORDER BY id ASC LIMIT 1")
                .param("owner_id_type", type.toString())
                .param("done_state", EventState.DONE.toString())
                .query(EventEntity.class)
                .optional()
                .map(EventEntity::toDomain)
                .map(Event::id);
    }

    @Override
    public Optional<EventID> getNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType type) {
        return client.sql("SELECT * FROM event \n" + "WHERE owner_id_type = :owner_id_type \n"
                        + "  AND state = :done_state\n"
                        + "  AND NOT EXISTS (\n"
                        + "    SELECT 1 FROM event e2 \n"
                        + "    WHERE e2.owner_id_type = :owner_id_type \n"
                        + "      AND e2.state <> :done_state \n"
                        + "      AND e2.id < event.id\n"
                        + "  )\n"
                        + "ORDER BY id DESC \n"
                        + "LIMIT 1;")
                .param("owner_id_type", type.toString())
                .param("done_state", EventState.DONE.toString())
                .query(EventEntity.class)
                .optional()
                .map(EventEntity::toDomain)
                .map(Event::id);
    }

    @Override
    public Collection<Event> getEventsByOwnerTypeAndEventStateWhereUpdatedAtLessThan(
            OwnerIDType ownerIDType, EventState eventState, Instant maxUpdatedAt) {
        return client
                .sql(
                        "SELECT * FROM event WHERE owner_id_type = :owner_id_type AND state = :state AND updated_at < :max_updated_at")
                .param("owner_id_type", ownerIDType.toString())
                .param("state", EventState.DONE.toString())
                .param("max_updated_at", Timestamp.from(maxUpdatedAt)) // TODO check if timestamp is fine enough
                .query(EventEntity.class)
                .list()
                .stream()
                .map(EventEntity::toDomain)
                .toList();
    }

    @Override
    public void updateEvent(Event event) {
        var entity = new EventEntity(event);
        client.sql("UPDATE event SET owner_id_type=:owner_id_type,state=:state,updated_at=:updated_at WHERE id = :id")
                .param("owner_id_type", entity.getId().getOwnerIDType().toString())
                .param("state", entity.getState().toString())
                .param("updated_at", Timestamp.from(entity.getUpdatedAt()))
                .param("id", entity.getId())
                .update();
    }

    @Override
    public void insertEvent(Event event) {
        var entity = new EventEntity(event);
        client.sql("INSERT INTO event (id,owner_id_type,state,updated_at) VALUES (:id,:owner_id_type,:state,:updated_at)")
            .param("owner_id_type", entity.getId().getOwnerIDType().toString())
            .param("state", entity.getState().toString())
            .param("updated_at", Timestamp.from(entity.getUpdatedAt()))
            .param("id", entity.getId())
            .update();
    }
}
