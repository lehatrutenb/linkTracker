package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Embeddable
@EqualsAndHashCode
public class EventIDEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "id")
    private long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "owner_id_type")
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
