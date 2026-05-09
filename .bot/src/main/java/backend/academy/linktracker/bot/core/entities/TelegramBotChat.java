package backend.academy.linktracker.bot.core.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Qualifier;
import java.io.Serializable;

@Getter
@Setter
public class TelegramBotChat extends BotChat implements Serializable {
    private final Type type;

    public TelegramBotChat(BotChatID botChatID, String replyService, Type type) {
        super(botChatID, replyService);
        this.type = type;
    }

    public enum Type {
        PRIVATE,
        GROUP,
        SUPERGROUP,
        CHANNEL
    }
}
