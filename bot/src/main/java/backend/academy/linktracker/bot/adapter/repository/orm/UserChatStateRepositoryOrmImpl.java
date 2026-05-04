package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.ChatSharedStateEntity;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.port.UserChatStateRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
@RequiredArgsConstructor
public class UserChatStateRepositoryOrmImpl implements UserChatStateRepository {
    private final UserChatStateRepositoryOrmInner repository;

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public Collection<ChatSharedState> readAllChatSharedStates() {
        return repository.findAll().stream().map(ChatSharedStateEntity::toDomain).toList();
    }

    @Override
    public Optional<ChatSharedState> readChatSharedState(BotChatID userChatID) {
        return repository.findById(ChatSharedStateEntity.getID(userChatID)).map(ChatSharedStateEntity::toDomain);
    }

    @Override
    public void createChatSharedState(BotChatID chatID, ChatSharedState chatSharedState) {
        repository.save(new ChatSharedStateEntity(chatID, chatSharedState));
    }

    @Override
    @Transactional
    public ChatSharedState updateChatSharedState(BotChatID chatID, ChatSharedState chatSharedState) {
        var addEntity = new ChatSharedStateEntity(chatID, chatSharedState);
        var curEntity = repository.getReferenceById(ChatSharedStateEntity.getID(chatID));
        addEntity.setVersion(curEntity.getVersion());
        return entityManager.merge(addEntity).toDomain();
    }

    @Override
    @Transactional
    public ChatSharedState upsertChatSharedState(BotChatID chatID, ChatSharedState chatSharedState) {
        var addEntity = new ChatSharedStateEntity(chatID, chatSharedState);
        var curEntity = repository.findById(ChatSharedStateEntity.getID(chatID));
        if (curEntity.isPresent()) {
            addEntity.setVersion(curEntity.orElseThrow().getVersion());
        }
        return repository.save(addEntity).toDomain();
    }

    @Override
    public void deleteChatSharedStateByID(BotChatID chatID) {
        repository.deleteById(ChatSharedStateEntity.getID(chatID));
    }
}