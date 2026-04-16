package backend.academy.linktracker.bot.adapter.repository.inmem;

import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import backend.academy.linktracker.bot.core.port.ReplyServiceMatcherRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
// @ConditionalOnProperty(
//    name = "app.data.access-type",
//    havingValue = "IN_MEM",
//    matchIfMissing = true
// )
public class ReplyServiceMatcherRepositoryInMemImpl implements ReplyServiceMatcherRepository {
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
