package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.ChatSharedStateEntity;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.port.UserChatStateRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
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
    public Optional<ChatSharedState> getChatSharedState(BotChatID userChatID) {
        return repository.findById(ChatSharedStateEntity.getID(userChatID)).map(ChatSharedStateEntity::toDomain);
    }

    @Override
    @Transactional
    public void upsertChatSharedState(BotChatID chatID, ChatSharedState chatSharedState) {
        var addEntity = new ChatSharedStateEntity(chatID, chatSharedState);
        var curEntity = repository.findById(ChatSharedStateEntity.getID(chatID));
        if (curEntity.isPresent()) {
            addEntity.setVersion(curEntity.orElseThrow().getVersion());
        }
        repository.save(addEntity);
    }
}
