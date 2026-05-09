package backend.academy.linktracker.bot.adapter.repository.selfmanaged;

import java.util.Optional;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

import backend.academy.linktracker.bot.adapter.entity.TelegramBotUserEntity;
import backend.academy.linktracker.bot.core.entities.TelegramBotUser;
import backend.academy.linktracker.bot.core.port.TelegramBotUserRepository;
import lombok.RequiredArgsConstructor;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "SQL")
@Primary
@RequiredArgsConstructor
public class TelegramBotUserRepositorySelfManagedImpl implements TelegramBotUserRepository {
    private final JdbcClient client;

    @Override
    public Optional<TelegramBotUser> getTelegramBotUser(long userID) {
        return client.sql("SELECT * FROM telegram_bot_user WHERE id = :id")
            .param("id", userID)
            .query(TelegramBotUserEntity.class)
            .optional()
            .map(TelegramBotUserEntity::toDomain);
    }

    @Override
    public TelegramBotUser createTelegramBotUser(TelegramBotUser telegramBotUser) {
        var entity = new TelegramBotUserEntity(telegramBotUser);
        return client.sql("INSERT INTO telegram_bot_user (id, user_name, first_name, is_bot) VALUES (:id, :user_name, :first_name, :is_bot) RETURNING *")
            .param("id", entity.getId())
            .param("user_name", entity.getUserName())
            .param("first_name", entity.getFirstName())
            .param("is_bot", entity.isBot())
            .query(TelegramBotUserEntity.class)
            .single()
            .toDomain();
    }

    @Override
    public TelegramBotUser updateTelegramBotUser(TelegramBotUser telegramBotUser) {
        var entity = new TelegramBotUserEntity(telegramBotUser);
        return client.sql("""
            UPDATE telegram_bot_user
            SET
                user_name = :user_name,
                first_name = :first_name,
                is_bot = :is_bot
            WHERE
                id = :id RETURNING *
            """)
            .param("id", entity.getId())
            .param("user_name", entity.getUserName())
            .param("first_name", entity.getFirstName())
            .param("is_bot", entity.isBot())
            .query(TelegramBotUserEntity.class)
            .single()
            .toDomain();
    }

    @Override
    public void deleteTelegramBotUser(long userID) {
        client.sql("DELETE FROM telegram_bot_user WHERE id = :id")
            .param("id", userID)
            .update();
    }

}
