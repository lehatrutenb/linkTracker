package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "bot_chat") // TODO rename tables to have prefix linktracker_?
@Entity
@NoArgsConstructor
@Inheritance(strategy = InheritanceType.JOINED)
public class BotChatEntity {
    @Id
    private long id;

    private String replyService;

    @Version
    private Long version;

    public BotChatEntity(BotChat botChat) {
        id = getID(botChat.getId());
        replyService = botChat.getReplyService();
    }

    public static long getID(BotChatID id) {
        return id.getNumericID();
    }

    public BotChat toDomain() {
        return new BotChat(toDomainID(), replyService);
    }

    public BotChatID toDomainID() {
        return new BotChatID(id);
    }
}
