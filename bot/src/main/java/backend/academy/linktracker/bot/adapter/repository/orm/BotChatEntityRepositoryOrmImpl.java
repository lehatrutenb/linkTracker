package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.core.entity.BotChat;
import backend.academy.linktracker.bot.core.entity.BotChatID;
import backend.academy.linktracker.bot.core.port.BotChatEntityRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
public class BotChatEntityRepositoryOrmImpl implements BotChatEntityRepository {
    private final BotChatEntityRepositoryOrmInner repository;

    @Override
    public Optional<BotChat> getBotChat(BotChatID chatID) {
        return repository.findById(BotChatEntity.getID(chatID)).map(BotChatEntity::toDomain);
    }

    @Override
    public BotChat createBotChat(BotChat botChat) {
        return repository.save(new BotChatEntity(botChat)).toDomain();
    }

    @Override
    public BotChat updateBotChat(BotChat botChat) {
        return repository.save(new BotChatEntity(botChat)).toDomain();
    }

    @Override
    public void deleteBotChat(BotChatID chatID) {
        repository.deleteById(BotChatEntity.getID(chatID));
    }
}
