package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.TelegramBotChat;
import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@NoArgsConstructor
public class TelegramBotChatEntity {
    @Id
    private long id;

    @Enumerated(EnumType.STRING)
    private TelegramBotChat.Type type;

    @Version
    private Long version;

    public TelegramBotChatEntity(TelegramBotChat chat) {
        id = getID(chat.id());
        type = chat.type();
    }

    public static long getID(TelegramBotChatID id) {
        return id.getNumericID();
    }

    public TelegramBotChat toDomain() {
        return new TelegramBotChat(toDomainID(), type);
    }

    public TelegramBotChatID toDomainID() {
        return new TelegramBotChatID(id);
    }
}
