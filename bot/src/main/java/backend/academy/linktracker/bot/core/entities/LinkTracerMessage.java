package backend.academy.linktracker.bot.core.entities;

import java.time.Instant;

public record LinkTracerMessage(
    String message,
    long messageId,
    Instant date,
    LinkTracerChat chat,
    LinkTracerUser user
) {
}
