package backend.academy.linktracker.bot.adapter.repository.selfmanaged;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.adapter.entity.ChatSharedStateEntity;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.port.UserChatStateRepository;
import jakarta.transaction.Transactional;
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
public class UserChatStateRepositorySelfManagedImpl implements UserChatStateRepository {
    private final JdbcClient client;

    @Override
    public Optional<ChatSharedState> getChatSharedState(BotChatID chatID) {
        return client.sql("SELECT * FROM chat_shared_state WHERE id = :id")
                .param("id", BotChatEntity.getID(chatID))
                .query(ChatSharedStateEntity.class)
                .optional()
                .map(ChatSharedStateEntity::toDomain);
    }

    @Override
    @Transactional
    public void upsertChatSharedState(BotChatID chatID, ChatSharedState chatSharedState) {
        var entity = new ChatSharedStateEntity(chatID, chatSharedState);
        if (getChatSharedState(chatID).isPresent()) {
            client.sql(
                            "UPDATE chat_shared_state SET id=:id,command_flow_state=:command_flow_state,processing_command=:processing_command,processing_command_step=:processing_command_step")
                    .param("id", entity.getId())
                    .param("command_flow_state", entity.getCommandFlowState().toString())
                    .param("processing_command", entity.getProcessingCommand())
                    .param("processing_command_step", entity.getProcessingCommandStep())
                    .update();
            return;
        }
        client.sql(
                        "INSERT INTO chat_shared_state (id,command_flow_state,processing_command,processing_command_step) VALUES (:id,:command_flow_state,:processing_command,:processing_command_step)")
                .param("id", entity.getId())
                .param("command_flow_state", entity.getCommandFlowState().toString())
                .param("processing_command", entity.getProcessingCommand())
                .param("processing_command_step", entity.getProcessingCommandStep())
                .update();
    }
}
