package backend.academy.linktracker.bot.adapter.repository;

import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
import java.util.Optional;

public interface ReplyServiceMatcherRepository {
    Optional<String> getReplyServiceQualifier(TelegramBotChatID chatID);

    void setReplyServiceQualifier(TelegramBotChatID chatID, String replyServiceQualifier);
}
