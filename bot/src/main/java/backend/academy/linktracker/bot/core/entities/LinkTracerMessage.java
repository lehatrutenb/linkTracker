package backend.academy.linktracker.bot.core.entities;

import java.io.Serializable;
import java.time.Instant;

public record LinkTracerMessage(String message, long messageId, Instant date, LinkTracerChat chat, LinkTracerUser user)
        implements Serializable {}
