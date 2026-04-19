package backend.academy.linktracker.bot.core.entities;

import java.io.Serial;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TelegramBotChat extends BotChat implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

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
