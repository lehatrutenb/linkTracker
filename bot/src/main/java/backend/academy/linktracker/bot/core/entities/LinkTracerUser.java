package backend.academy.linktracker.bot.core.entities;

public record LinkTracerUser(
    long userId,
    String userName,
    String firstName,
    boolean isBot
) {
}
