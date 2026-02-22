package backend.academy.linktracker.bot.usecases.dtos;

import com.pengrad.telegrambot.model.Chat;
import java.time.Instant;

public record LinkTracerRawMessage(
    long id,
    Chat.Type type,
    long userId,
    String userName,
    String firstName,
    boolean isBot,
    String message,
    long messageId,
    Instant date
) {
}
