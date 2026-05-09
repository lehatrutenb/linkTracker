package backend.academy.linktracker.bot.adapter.repository.selfmanaged;

import backend.academy.linktracker.bot.adapter.entity.EventIDEntity;
import backend.academy.linktracker.bot.adapter.entity.LinkUpdateEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotMessageEntity;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.port.TelegramBotMessagesRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "SQL")
@Primary
@RequiredArgsConstructor
public class TelegramBotMessagesRepositorySelfManagedImpl implements TelegramBotMessagesRepository {
    private final JdbcClient client;

    @Override
    public Optional<TelegramBotMessage> getMessage(TelegramBotMessageID messageID) {
        return client.sql("""
                SELECT
                me.tech_id,
                me.id,
                me.message,
                me.date,
                bc as chat,
                bu as user
                FROM telegram_bot_message me
                INNER JOIN telegram_bot_chat bc ON me.chat_id = bc.id
                INNER JOIN telegram_bot_user bu ON me.user_id = bu.id
                WHERE me.id = :id
                """)
            .param("id", TelegramBotMessageEntity.getID(messageID))
            .query(TelegramBotMessageEntity.class)
            .optional()
            .map(TelegramBotMessageEntity::toDomain);
    }

    @Override
    public Optional<TelegramBotMessage> getLastMessageInChat(BotChatID telegramBotChatID) {

    }

    @Override
    public void addMessage(TelegramBotMessage message) {

    }
}
