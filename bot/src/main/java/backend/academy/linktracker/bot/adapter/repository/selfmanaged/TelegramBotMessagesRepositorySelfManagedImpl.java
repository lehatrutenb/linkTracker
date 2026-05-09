package backend.academy.linktracker.bot.adapter.repository.selfmanaged;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotMessageEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotUserEntity;
import backend.academy.linktracker.bot.adapter.rowmapper.TelegramBotMessageEntityRowMapper;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.port.TelegramBotMessagesRepository;
import java.sql.Timestamp;
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
    public Optional<TelegramBotMessage> readMessage(TelegramBotMessageID messageID) {
        return client.sql("""
                SELECT
                me.message_id,
                me.local_chat_id,
                me.message,
                me.date,
                bc as chat,
                bu as user
                FROM telegram_bot_message me
                INNER JOIN bot_chat bc ON me.chat_id = bc.id
                INNER JOIN telegram_bot_user bu ON me.user_id = bu.id
                WHERE 
                    me.local_chat_id = :local_chat_id
                    AND me.chat_id = :chat_id
                """)
                .param("local_chat_id", messageID.getForChatUniqueId())
                .param("chat_id", BotChatEntity.getID(messageID.getChatID()))
                .query(new TelegramBotMessageEntityRowMapper())
                .optional()
                .map(TelegramBotMessageEntity::toDomain);
    }

    @Override
    public Optional<TelegramBotMessage> readLastMessageInChat(
            BotChatID chatID) { // TODO should i use pure native or can use some jpa deps sugar?
        return client.sql("""
                SELECT
                me.local_chat_id as local_chat_id,
                me.message_id as message_id,
                me.message as message,
                me.date as date,
                bc.reply_service as reply_service,
                bc.id as chat_id,
                bu.id as user_id,
                bu.first_name as first_name,
                bu.user_name as user_name,
                bu.is_bot as is_bot
                FROM telegram_bot_message me
                INNER JOIN bot_chat bc ON me.chat_id = bc.id
                INNER JOIN telegram_bot_user bu ON me.user_id = bu.id
                WHERE me.chat_id = :chat_id
                ORDER BY me.date DESC
                LIMIT 1
                """)
                .param("chat_id", BotChatEntity.getID(chatID))
                .query(new TelegramBotMessageEntityRowMapper())
                .optional()
                .map(TelegramBotMessageEntity::toDomain);
    }

    @Override
    public TelegramBotMessage createMessage(TelegramBotMessage message) {
        return client.sql("""
                        WITH inserted AS (
                            INSERT INTO telegram_bot_message (local_chat_id, message, date, chat_id, user_id)
                            VALUES (:local_chat_id, :message, :date, :chat_id, :user_id)
                            RETURNING *
                        )
                        SELECT
                            inserted.*,
                            bc.reply_service as reply_service,
                            bc.id as chat_id,
                            bu.id as user_id,
                            bu.first_name as first_name,
                            bu.user_name as user_name,
                            bu.is_bot as is_bot
                        FROM inserted
                        INNER JOIN bot_chat bc ON inserted.chat_id = bc.id
                        INNER JOIN telegram_bot_user bu ON inserted.user_id = bu.id
                        """)
                .param("local_chat_id", message.id().getForChatUniqueId())
                .param("message", message.message())
                .param("date", Timestamp.from(message.date()))
                .param("chat_id", BotChatEntity.getID(message.chat().getId()))
                .param("user_id", TelegramBotUserEntity.getID(message.user()))
                .query(new TelegramBotMessageEntityRowMapper())
                .single()
                .toDomain();
    }

    @Override
    public TelegramBotMessage updateMessage(TelegramBotMessage message) {
        return client.sql("""
                        UPDATE telegram_bot_message
                        SET message = :message, date = :date, chat_id = :chat_id, user_id = :user_id
                        WHERE message_id = :message_id
                        RETURNING *
                        """)
                .param("message_id", TelegramBotMessageEntity.getID(message.id()))
                .param("message", message.message())
                .param("date", Timestamp.from(message.date()))
                .param("chat_id", BotChatEntity.getID(message.chat().getId()))
                .param("user_id", message.user().userId())
                .query(new TelegramBotMessageEntityRowMapper())
                .single()
                .toDomain();
    }

    @Override
    public void deleteMessage(TelegramBotMessageID messageID) {
        client.sql("DELETE FROM telegram_bot_message WHERE message_id = :message_id")
                .param("message_id", TelegramBotMessageEntity.getID(messageID))
                .update();
    }
}
