package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.enums.ChatCommandFlowState;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Version;
import java.util.List;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@RequiredArgsConstructor
@Entity
public class ChatSharedStateEntity {
    @Id
    private long id;

    @Enumerated(EnumType.STRING)
    private ChatCommandFlowState commandFlowState;

    private String processingCommand;
    private int processingCommandStep;

    @OneToMany
    @JoinTable(
            name = "shared_state_messages_mapping",
            joinColumns = @JoinColumn(name = "shared_state_id"),
            inverseJoinColumns = @JoinColumn(name = "message_id"))
    private List<TelegramBotMessageEntity> telegramBotMessages;

    @Version
    private Long version;

    public ChatSharedState toDomain() {
        return new ChatSharedState(
                commandFlowState,
                processingCommand,
                processingCommandStep,
                telegramBotMessages.stream()
                        .map(TelegramBotMessageEntity::toDomain)
                        .toList());
    }

    public ChatSharedStateEntity(ChatSharedState state) {
        commandFlowState = state.getCommandFlowState();
        processingCommand = state.getProcessingCommand();
        processingCommandStep = state.getProcessingCommandStep();
        telegramBotMessages = state.getProcessingMessages().stream()
                .map(TelegramBotMessageEntity::new)
                .toList();
    }
}
