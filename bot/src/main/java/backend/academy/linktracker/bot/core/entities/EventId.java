package backend.academy.linktracker.bot.core.entities;

import org.jetbrains.annotations.NotNull;

public record EventId(
    String id
) {
    public int numericComparing(@NotNull EventId o) {
        return Long.valueOf(id).compareTo(Long.valueOf(o.id()));
    }
}
