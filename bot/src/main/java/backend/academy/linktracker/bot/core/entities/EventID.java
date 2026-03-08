package backend.academy.linktracker.bot.core.entities;

import java.io.Serializable;
import org.jetbrains.annotations.NotNull;

public record EventID(String id) implements Serializable {
    public int numericComparing(@NotNull EventID o) {
        return Long.valueOf(id).compareTo(Long.valueOf(o.id()));
    }
}
