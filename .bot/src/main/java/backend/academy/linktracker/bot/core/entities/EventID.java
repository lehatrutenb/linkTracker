package backend.academy.linktracker.bot.core.entities;

import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import java.io.Serial;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
@EqualsAndHashCode
public class EventID implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final Long id;

    @Getter
    private final OwnerIDType ownerIDType;

    public String getId() {
        return ownerIDType + ":" + id;
    }

    public Long getRawId() {
        return id;
    }

    public int numericComparing(@NotNull EventID o) {
        return id.compareTo(o.id);
    }
}
