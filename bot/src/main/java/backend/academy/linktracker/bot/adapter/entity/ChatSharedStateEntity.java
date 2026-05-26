package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entity.BotChatID;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.enumeration.ChatCommandFlowState;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "chat_shared_state")
@Entity
@NoArgsConstructor
public class ChatSharedStateEntity {
    @Id
    private long id;

    @Enumerated(EnumType.STRING)
    private ChatCommandFlowState commandFlowState;

    private String processingCommand;
    private int processingCommandStep;

    // cascade = {CascadeType.PERSIST, CascadeType.MERGE}
    @ManyToMany // But in real is OneToMany - just JPA can't handle JoinTable with OneToMany
    @JoinTable(
            name = "shared_state_messages_mapping",
            joinColumns = @JoinColumn(name = "shared_state_id"),
            inverseJoinColumns = @JoinColumn(name = "message_id"))
    private List<TelegramBotMessageEntity> telegramBotMessages = List.of(); // Prevent nulls

    public ChatSharedState toDomain() {
        return new ChatSharedState(
                commandFlowState,
                processingCommand,
                processingCommandStep,
                telegramBotMessages.stream()
                        .map(TelegramBotMessageEntity::toDomain)
                        .toList());
    }

    public ChatSharedStateEntity(BotChatID chatID, ChatSharedState state) {
        id = chatID.getNumericID();
        commandFlowState = state.getCommandFlowState();
        processingCommand = state.getProcessingCommand();
        processingCommandStep = state.getProcessingCommandStep();
        telegramBotMessages = state.getProcessingMessages().stream()
                .map(TelegramBotMessageEntity::new)
                .toList();
    }

    public static long getID(BotChatID chatID) {
        return BotChatEntity.getID(chatID);
    }
}
