package backend.academy.linktracker.bot.core.entity;

import java.io.Serializable;

public record TelegramBotUser(long userId, String userName, String firstName, boolean isBot) implements Serializable {}
