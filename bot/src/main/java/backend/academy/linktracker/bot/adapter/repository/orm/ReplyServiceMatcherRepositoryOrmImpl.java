package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.port.ReplyServiceMatcherRepository;
import jakarta.transaction.Transactional;

import java.util.Collection;
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
    public Collection<BotChat> readAllBotChats() {
        return repository.findAll().stream().map(BotChatEntity::toDomain).toList();
    }

    @Override
    public Optional<BotChat> readBotChat(BotChatID chatID) {
        return repository.findById(BotChatEntity.getID(chatID)).map(BotChatEntity::toDomain);
    }

    @Override
    public void createBotChat(BotChat botChat) {
        repository.save(new BotChatEntity(botChat));
    }

    @Override
    @Transactional
    public BotChat updateBotChat(BotChat botChat) {
        var addEntity = new BotChatEntity(botChat);
        var curEntity = repository.getReferenceById(addEntity.getId());
        addEntity.setVersion(curEntity.getVersion());
        return repository.save(addEntity).toDomain();
    }

    @Override
    public void deleteBotChatByID(BotChatID chatID) {
        repository.deleteById(BotChatEntity.getID(chatID));
    }
}