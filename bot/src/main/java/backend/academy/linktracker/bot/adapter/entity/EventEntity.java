package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
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
    private EventIDEntity eventID;

    @Enumerated(EnumType.STRING)
    private EventState state;

    private Instant updatedAt;

    public Event toDomain() {
        return new Event(eventID.toDomain(), state, updatedAt);
    }

    public EventEntity(Event event) {
        eventID = new EventIDEntity(event.id());
        state = event.state();
        updatedAt = event.updatedAt();
    }

    public void setId(long id) {
        if (this.eventID == null) {
            this.eventID = new EventIDEntity();
        }
        this.eventID.setId(id);
    }

    public void setOwnerIdType(OwnerIDType ownerIDType) {
        if (this.eventID == null) {
            this.eventID = new EventIDEntity();
        }
        this.eventID.setOwnerIDType(ownerIDType);
    }
}
