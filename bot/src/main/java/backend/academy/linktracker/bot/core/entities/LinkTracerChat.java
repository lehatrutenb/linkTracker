package backend.academy.linktracker.bot.core.entities;

import com.pengrad.telegrambot.model.Chat;

public record LinkTracerChat(
    long id,
    Chat.Type type
) {
}
