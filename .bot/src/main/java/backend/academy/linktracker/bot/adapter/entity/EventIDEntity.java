package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.Event;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.Instant;

@NoArgsConstructor
@Table(name = "event")
@Entity
@Getter
@Setter
@Embeddable
public class EventIDEntity {
    @Id
    private long id;

    @Enumerated(EnumType.STRING)
    private OwnerIDType ownerIDType;

    public static long getID(EventID id) {
        return id.getRawId();
    }

    public EventID toDomain() {
        return new EventID(id, ownerIDType);
    }

    public EventIDEntity(EventID id) {
        this.id = getID(id);
        ownerIDType = id.getOwnerIDType();
    }
}
