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
    public Optional<Event> readEvent(EventID eventId) {
        return client.sql("""
                        SELECT
                        *
                        FROM event
                        WHERE id = :id AND owner_id_type = :owner_id_type
                        """)
                .param("id", EventIDEntity.getID(eventId))
                .param("owner_id_type", eventId.getOwnerIDType().toString())
                .query(EventEntity.class)
                .optional()
                .map(EventEntity::toDomain);
    }

    @Override
    public Optional<Event> readNumericFirstNotDoneEventByOwnerType(OwnerIDType type) {
        return client.sql(
                        "SELECT * FROM event WHERE owner_id_type = :owner_id_type AND state <> :done_state ORDER BY id ASC LIMIT 1")
                .param("owner_id_type", type.toString())
                .param("done_state", EventState.DONE.toString())
                .query(EventEntity.class)
                .optional()
                .map(EventEntity::toDomain);
    }

    @Override
    public Optional<Event> readNumericLastOfPrefixOfDoneByOwnerType(OwnerIDType type) {
        return client.sql("""
                        SELECT * FROM event WHERE owner_id_type = :owner_id_type
                        AND state = :done_state
                        AND NOT EXISTS (
                            SELECT 1 FROM event e2
                            WHERE e2.owner_id_type = :owner_id_type
                            AND e2.state <> :done_state
                            AND e2.id < event.id
                        )
                        ORDER BY id DESC
                        LIMIT 1
                        """)
                .param("owner_id_type", type.toString())
                .param("done_state", EventState.DONE.toString())
                .query(EventEntity.class)
                .optional()
                .map(EventEntity::toDomain);
    }

    @Override
    public Collection<Event> readEventsByOwnerTypeAndEventStateWhereUpdatedAtLessThan(
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
    public Event updateEvent(Event event) {
        var entity = new EventEntity(event);
        return client.sql(
                        "UPDATE event SET state=:state,updated_at=:updated_at WHERE id = :id AND owner_id_type = :owner_id_type RETURNING *")
                .param("owner_id_type", entity.getEventID().getOwnerIDType().toString())
                .param("state", entity.getState().toString())
                .param("updated_at", Timestamp.from(entity.getUpdatedAt()))
                .param("id", EventIDEntity.getID(event.id()))
                .query(EventEntity.class)
                .single()
                .toDomain();
    }

    @Override
    public void createEvent(Event event) {
        var entity = new EventEntity(event);
        client.sql(
                        "INSERT INTO event (id,owner_id_type,state,updated_at) VALUES (:id,:owner_id_type,:state,:updated_at)")
                .param("owner_id_type", entity.getEventID().getOwnerIDType().toString())
                .param("state", entity.getState().toString())
                .param("updated_at", Timestamp.from(entity.getUpdatedAt()))
                .param("id", EventIDEntity.getID(event.id()))
                .update();
    }

    @Override
    public void deleteEvent(EventID eventID) {
        client.sql("DELETE FROM event WHERE id = :id AND owner_id_type = :owner_id_type")
                .param("id", EventIDEntity.getID(eventID))
                .param("owner_id_type", eventID.getOwnerIDType().toString())
                .update();
    }
}
