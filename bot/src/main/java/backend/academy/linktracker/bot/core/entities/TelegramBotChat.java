package backend.academy.linktracker.bot.core.entities;

import java.io.Serializable;

public record TelegramBotChat(TelegramBotChatID id, Type type) implements Serializable {
    public enum Type {
        PRIVATE,
        GROUP,
        SUPERGROUP,
        CHANNEL
    }
}
