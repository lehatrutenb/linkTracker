package backend.academy.linktracker.bot.adapter.repository.selfmanaged;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.port.ReplyServiceMatcherRepository;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "SQL")
@Primary
@RequiredArgsConstructor
public class ReplyServiceMatcherRepositorySelfManagedImpl implements ReplyServiceMatcherRepository {
    private final JdbcClient client;

    @Override
    public Collection<BotChat> readAllBotChats() {
        return client.sql("SELECT * FROM bot_chat")
                .query(BotChatEntity.class)
                .list()
                .stream()
                .map(BotChatEntity::toDomain)
                .toList();
    }

    @Override
    public Optional<BotChat> readBotChat(BotChatID chatID) {
        return client.sql("SELECT * FROM bot_chat WHERE id = :id")
                .param("id", BotChatEntity.getID(chatID))
                .query(BotChatEntity.class)
                .optional()
                .map(BotChatEntity::toDomain);
    }

    @Override
    public void createBotChat(BotChat botChat) {
        var entity = new BotChatEntity(botChat);
        client.sql("INSERT INTO bot_chat (id,reply_service) VALUES (:id,:reply_service)")
                .param("id", entity.getId())
                .param("reply_service", entity.getReplyService())
                .update();
    }

    @Override
    public BotChat updateBotChat(BotChat botChat) {
        var entity = new BotChatEntity(botChat);
        return client.sql("UPDATE bot_chat SET reply_service = :reply_service WHERE id = :id RETURNING *")
                .param("id", entity.getId())
                .param("reply_service", entity.getReplyService())
                .query(BotChatEntity.class)
                .single()
                .toDomain();
    }

    @Override
    public void deleteBotChatByID(BotChatID chatID) {
        client.sql("DELETE FROM bot_chat WHERE id = :id")
                .param("id", BotChatEntity.getID(chatID))
                .update();
    }
}