package backend.academy.linktracker.bot.core.entities;

import java.io.Serializable;
import java.time.Instant;

public record TelegramBotMessage(
        String message, TelegramBotMessageID id, Instant date, TelegramBotChat chat, TelegramBotUser user)
        implements Serializable {}
