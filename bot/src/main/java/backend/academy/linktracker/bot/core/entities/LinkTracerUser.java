package backend.academy.linktracker.bot.core.entities;

import java.io.Serializable;

public record LinkTracerUser(long userId, String userName, String firstName, boolean isBot) implements Serializable {}
