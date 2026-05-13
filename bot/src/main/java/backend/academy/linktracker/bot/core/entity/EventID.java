package backend.academy.linktracker.bot.core.entity;

import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
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

    private final String id;

    @Getter
    private final OwnerIDType ownerIDType;

    public String getId() {
        return ownerIDType + ":" + id;
    }

    public String getRawId() {
        return id;
    }

    public int numericComparing(@NotNull EventID o) {
        return Long.valueOf(id).compareTo(Long.valueOf(o.id));
    }
}
