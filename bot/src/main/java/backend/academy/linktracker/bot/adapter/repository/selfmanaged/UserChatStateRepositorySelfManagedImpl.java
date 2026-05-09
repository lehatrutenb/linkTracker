package backend.academy.linktracker.bot.adapter.repository.selfmanaged;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.adapter.entity.ChatSharedStateEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotMessageEntity;
import backend.academy.linktracker.bot.adapter.rowmapper.ChatSharedStateRowMapper;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.port.UserChatStateRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "SQL")
@Primary
@RequiredArgsConstructor
public class UserChatStateRepositorySelfManagedImpl implements UserChatStateRepository {
    private final JdbcClient client;

    @Override
    public Optional<ChatSharedState> readChatSharedState(BotChatID chatID) { // shared_state_messages_mapping
        return client.sql("""
                SELECT cs.*, tm.*, bc.*, tu.* FROM chat_shared_state cs
                LEFT JOIN shared_state_messages_mapping m ON cs.id = m.shared_state_id
                LEFT JOIN telegram_bot_message tm ON m.message_id = tm.message_id
                LEFT JOIN bot_chat bc ON tm.chat_id = bc.id
                LEFT JOIN telegram_bot_user tu ON tm.user_id = tu.id
                WHERE cs.id = :id
                """)
                .param("id", BotChatEntity.getID(chatID))
                .query(new ChatSharedStateRowMapper())
                .stream()
                .findFirst()
                .map(ChatSharedStateEntity::toDomain);
    }

    @Override
    @Transactional
    public void createChatSharedState(BotChatID chatID, ChatSharedState chatSharedState) {
        var entity = new ChatSharedStateEntity(chatID, chatSharedState);
        client.sql("""
                INSERT INTO chat_shared_state 
                    (id,command_flow_state,processing_command,processing_command_step)
                VALUES
                    (:id,:command_flow_state,:processing_command,:processing_command_step)
                """)
                .param("id", ChatSharedStateEntity.getID(chatID))
                .param("command_flow_state", entity.getCommandFlowState().toString())
                .param("processing_command", entity.getProcessingCommand())
                .param("processing_command_step", entity.getProcessingCommandStep())
                .update();
        
        chatSharedState.getProcessingMessages().forEach(message -> {
            client.sql("INSERT INTO shared_state_messages_mapping (shared_state_id,message_id) VALUES (:shared_state_id,:message_id)")
                .param("shared_state_id", entity.getId())
                .param("message_id", TelegramBotMessageEntity.getID(message.id()))
                .update();
        });
    }

    @Override
    @Transactional
    public ChatSharedState updateChatSharedState(BotChatID chatID, ChatSharedState chatSharedState) {
        var entity = new ChatSharedStateEntity(chatID, chatSharedState);
        var updatedEntity = client.sql("""
                WITH updated AS (
                UPDATE chat_shared_state 
                    SET
                        command_flow_state=:command_flow_state,processing_command=:processing_command,processing_command_step=:processing_command_step
                    WHERE
                        id=:id
                    RETURNING *
                )
                SELECT updated.*, tm.*, bc.*, tu.* FROM updated
                LEFT JOIN shared_state_messages_mapping m ON updated.id = m.shared_state_id
                LEFT JOIN telegram_bot_message tm ON m.message_id = tm.message_id
                LEFT JOIN bot_chat bc ON tm.chat_id = bc.id
                LEFT JOIN telegram_bot_user tu ON tm.user_id = tu.id
                """)
                .param("id", entity.getId())
                .param("command_flow_state", entity.getCommandFlowState().toString())
                .param("processing_command", entity.getProcessingCommand())
                .param("processing_command_step", entity.getProcessingCommandStep())
                .query(new ChatSharedStateRowMapper())
                .stream()
                .findFirst()
                .map(ChatSharedStateEntity::toDomain)
                .orElseThrow();
        
        client.sql("DELETE FROM shared_state_messages_mapping WHERE shared_state_id = :shared_state_id")
                .param("shared_state_id", ChatSharedStateEntity.getID(chatID))
                .update();
        
        chatSharedState.getProcessingMessages().forEach(message -> {
            client.sql("INSERT INTO shared_state_messages_mapping (shared_state_id,message_id) VALUES (:shared_state_id,:message_id)")
                .param("shared_state_id", ChatSharedStateEntity.getID(chatID))
                .param("message_id", TelegramBotMessageEntity.getID(message.id()))
                .update();
        });

        return updatedEntity;
    }

    @Override
    public void deleteChatSharedState(BotChatID chatID) {
        client.sql("DELETE FROM chat_shared_state WHERE id = :id")
                .param("id", BotChatEntity.getID(chatID))
                .update();
    }
}