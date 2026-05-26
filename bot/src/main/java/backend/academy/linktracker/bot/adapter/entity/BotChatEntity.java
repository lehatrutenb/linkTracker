package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entity.BotChat;
import backend.academy.linktracker.bot.core.entity.BotChatID;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "bot_chat") // TODO rename tables to have prefix linktracker_?
@Entity
@NoArgsConstructor
public class BotChatEntity {
    @Id
    private long id;

    private String replyService;

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
