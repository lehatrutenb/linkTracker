package backend.academy.linktracker.bot.core.entity;

import com.pengrad.telegrambot.model.Chat;
import java.io.Serializable;

public record TelegramBotChat(TelegramBotChatID id, Chat.Type type) implements Serializable {}
