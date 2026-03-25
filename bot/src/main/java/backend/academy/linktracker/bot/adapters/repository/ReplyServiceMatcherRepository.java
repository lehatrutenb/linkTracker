package backend.academy.linktracker.bot.adapters.repository;

import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import java.util.Optional;

public interface ReplyServiceMatcherRepository {
    Optional<String> getReplyServiceQualifier(TelegramBotChatID chatID);

    void setReplyServiceQualifier(TelegramBotChatID chatID, String replyServiceQualifier);
}
