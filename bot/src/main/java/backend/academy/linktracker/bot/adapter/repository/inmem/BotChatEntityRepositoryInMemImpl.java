package backend.academy.linktracker.bot.adapter.repository.inmem;

import backend.academy.linktracker.bot.core.entity.BotChat;
import backend.academy.linktracker.bot.core.entity.BotChatID;
import backend.academy.linktracker.bot.core.port.BotChatEntityRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "IN_MEM")
public class BotChatEntityRepositoryInMemImpl implements BotChatEntityRepository {
    private final Map<String, BotChat> replyServiceQualifiers = new HashMap<>();

    @Override
    public Optional<BotChat> getBotChat(BotChatID chatID) {
        return Optional.ofNullable(replyServiceQualifiers.get(chatID.getID()));
    }

    @Override
    public BotChat createBotChat(BotChat botChat) {
        replyServiceQualifiers.put(botChat.getId().getID(), botChat);
        return botChat;
    }

    @Override
    public BotChat updateBotChat(BotChat botChat) {
        replyServiceQualifiers.put(botChat.getId().getID(), botChat);
        return botChat;
    }

    @Override
    public void deleteBotChat(BotChatID chatID) {
        replyServiceQualifiers.remove(chatID.getID());
    }
}
