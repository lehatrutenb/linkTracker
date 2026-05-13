package backend.academy.linktracker.bot.adapter.repository;

import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
public class ReplyServiceMatcherRepositoryConcurrentInMemImpl implements ReplyServiceMatcherRepository {
    private final Map<String, String> replyServiceQualifiers = new HashMap<>();

    @Override
    public Optional<String> getReplyServiceQualifier(TelegramBotChatID chatID) {
        return Optional.ofNullable(replyServiceQualifiers.get(chatID.getID()));
    }

    @Override
    public void setReplyServiceQualifier(TelegramBotChatID chatID, String replyServiceQualifier) {
        replyServiceQualifiers.put(chatID.getID(), replyServiceQualifier);
    }
}
