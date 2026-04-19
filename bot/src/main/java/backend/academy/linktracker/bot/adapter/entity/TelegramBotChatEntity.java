package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotChat;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "telegram_bot_chat")
@Entity
@NoArgsConstructor
public class TelegramBotChatEntity extends BotChatEntity {
    @Enumerated(EnumType.STRING)
    private TelegramBotChat.Type type;

    public TelegramBotChatEntity(TelegramBotChat chat) {
        super(chat);
        type = chat.getType();
    }

    public TelegramBotChat toDomain() {
        return new TelegramBotChat(toDomainID(), getReplyService(), type);
    }

    public BotChatID toDomainID() {
        return new BotChatID(getId());
    }
}
