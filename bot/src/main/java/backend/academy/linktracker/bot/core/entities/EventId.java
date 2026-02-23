package backend.academy.linktracker.bot.core.entities;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

public record EventId(String id) implements Serializable {
    public int numericComparing(@NotNull EventId o) {
        return Long.valueOf(id).compareTo(Long.valueOf(o.id()));
    }
}
