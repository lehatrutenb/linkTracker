package backend.academy.linktracker.bot.adapter.repository.selfmanaged;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotChatEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotMessageEntity;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.port.TelegramBotMessagesRepository;
import java.sql.Timestamp;
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
public class TelegramBotMessagesRepositorySelfManagedImpl implements TelegramBotMessagesRepository {
    private final JdbcClient client;

    @Override
    public Collection<TelegramBotMessage> readAllMessages() {
        return client.sql("""
                        SELECT
                        me.tech_id as tech_id,
                        me.id as id,
                        me.message as message,
                        me.date as date,
                        tbc.type as type,
                        bc.reply_service as reply_service,
                        bc.id as chat_id,
                        bu.id as user_id,
                        bu.first_name as first_name,
                        bu.last_name as last_name,
                        bu.username as username,
                        bu.version as user_version
                        FROM telegram_bot_message me
                        INNER JOIN bot_chat bc ON me.chat_id = bc.id
                        INNER JOIN telegram_bot_chat tbc ON me.chat_id = tbc.id
                        INNER JOIN telegram_bot_user bu ON me.user_id = bu.id
                        """)
                .query(TelegramBotMessageEntity.class)
                .list()
                .stream()
                .map(TelegramBotMessageEntity::toDomain)
                .toList();
    }

    @Override
    public Optional<TelegramBotMessage> readMessage(TelegramBotMessageID messageID) {
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
    public Optional<TelegramBotMessage> readLastMessageInChat(
            BotChatID chatID) { // TODO should i use pure native or can use some jpa deps sugar?
        return client.sql("""
                SELECT
                me.tech_id as tech_id,
                me.id as id,
                me.message as message,
                me.date as date,
                tbc.type as type,
                bc.reply_service as reply_service,
                bc.id as chat_id,
                bu.id as user_id,
                bu.first_name as first_name,
                bu.last_name as last_name,
                bu.username as username,
                bu.version as user_version
                FROM telegram_bot_message me
                INNER JOIN bot_chat bc ON me.chat_id = bc.id
                INNER JOIN telegram_bot_chat tbc ON me.chat_id = tbc.id
                INNER JOIN telegram_bot_user bu ON me.user_id = bu.id
                WHERE me.chat_id = :chat_id
                ORDER BY me.date DESC
                LIMIT 1
                """)
                .param("chat_id", TelegramBotChatEntity.getID(chatID))
                .query(TelegramBotMessageEntity.class)
                .optional()
                .map(TelegramBotMessageEntity::toDomain);
    }

    @Override
    public TelegramBotMessage createMessage(TelegramBotMessage message) {
        long chatId = BotChatEntity.getID(message.chat().getId());
        long userId = message.user().userId();
        Long techId = client.sql(
                        """
                        INSERT INTO telegram_bot_message (id, message, date, chat_id, user_id)
                        VALUES (:id, :message, :date, :chat_id, :user_id)
                        RETURNING tech_id
                        """)
                .param("id", TelegramBotMessageEntity.getID(message.id()))
                .param("message", message.message())
                .param("date", Timestamp.from(message.date()))
                .param("chat_id", chatId)
                .param("user_id", userId)
                .query(Long.class)
                .single();
        var newId = new TelegramBotMessageID(techId, TelegramBotMessageEntity.getID(message.id()), message.chat().getId());
        return new TelegramBotMessage(message.message(), newId, message.date(), message.chat(), message.user());
    }

    @Override
    public TelegramBotMessage updateMessage(TelegramBotMessage message) {
        return client.sql(
                        """
                        UPDATE telegram_bot_message
                        SET message = :message, date = :date, chat_id = :chat_id, user_id = :user_id
                        WHERE tech_id = :tech_id
                        RETURNING *
                        """)
                .param("tech_id", message.id().getTechID())
                .param("message", message.message())
                .param("date", Timestamp.from(message.date()))
                .param("chat_id", BotChatEntity.getID(message.chat().getId()))
                .param("user_id", message.user().userId())
                .query(TelegramBotMessageEntity.class)
                .single()
                .toDomain();
    }

    @Override
    public void deleteMessageByID(TelegramBotMessageID messageID) {
        client.sql("DELETE FROM telegram_bot_message WHERE tech_id = :tech_id")
                .param("tech_id", messageID.getTechID())
                .update();
    }
}
