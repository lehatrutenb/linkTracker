package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import java.util.Optional;

public interface ReplyServiceMatcherRepository {
    Optional<String> getReplyServiceQualifier(TelegramBotChatID chatID);

    void setReplyServiceQualifier(TelegramBotChatID chatID, String replyServiceQualifier);
}
