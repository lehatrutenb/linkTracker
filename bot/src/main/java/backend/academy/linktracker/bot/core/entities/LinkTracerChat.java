package backend.academy.linktracker.bot.core.entities;

import com.pengrad.telegrambot.model.Chat;
import java.io.Serializable;

public record LinkTracerChat(long id, Chat.Type type) implements Serializable {}
