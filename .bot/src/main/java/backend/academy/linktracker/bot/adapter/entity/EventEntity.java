package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import jakarta.persistence.EmbeddedId;
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
    @EmbeddedId
    private EventIDEntity id;

    @Enumerated(EnumType.STRING)
    private EventState state;

    private Instant updatedAt;

    @Version
    private Long version;

    public Event toDomain() {
        return new Event(id.toDomain(), state, updatedAt);
    }

    public EventEntity(Event event) {
        id = new EventIDEntity(event.id());
        state = event.state();
        updatedAt = event.updatedAt();
    }
}
