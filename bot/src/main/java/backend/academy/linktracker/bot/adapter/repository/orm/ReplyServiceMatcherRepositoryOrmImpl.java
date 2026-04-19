package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.port.ReplyServiceMatcherRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@RefreshScope
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
@Repository
@RequiredArgsConstructor
public class ReplyServiceMatcherRepositoryOrmImpl implements ReplyServiceMatcherRepository {
    private final ReplyServiceMatcherRepositoryOrmInner repository;

    @Override
    public Optional<BotChat> getBotChat(BotChatID chatID) {
        return repository.findById(BotChatEntity.getID(chatID)).map(BotChatEntity::toDomain);
    }

    @Override
    public void addBotChat(BotChat botChat) {
        repository.save(new BotChatEntity(botChat));
    }
}
