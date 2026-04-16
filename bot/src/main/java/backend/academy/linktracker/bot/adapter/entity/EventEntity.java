package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import java.time.Instant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Table(name = "event")
@Entity
@Getter
@Setter
public class EventEntity {
    // @Id
    // @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "event_id_gen")
    // @SequenceGenerator(name = "event_id_gen", sequenceName = "event_id_seq", allocationSize = 1)
    // private Long techID;
    @Id
    private long id;

    @Enumerated(EnumType.STRING)
    private OwnerIDType ownerIDType;

    @Enumerated(EnumType.STRING)
    private EventState state;

    private Instant updatedAt;

    @Version
    private Long version;

    public Event toDomain() {
        return new Event(new EventID(id, ownerIDType), state, updatedAt);
    }

    public EventEntity(Event event) {
        id = getID(event.id());
        ownerIDType = event.id().getOwnerIDType();
        state = event.state();
        updatedAt = event.updatedAt();
    }

    public static long getID(EventID id) {
        return id.getRawId();
    }
}
