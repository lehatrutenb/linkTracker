package backend.academy.linktracker.bot.core.entities;

import backend.academy.linktracker.bot.core.enums.ChatCommandFlowState;
import java.util.ArrayList;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
// Currently can be record, but globally will have more complex logic
public class ChatSharedState {
    @Getter
    private final ChatCommandFlowState commandFlowState;

    @Getter
    private final String processingCommand;

    @Getter
    private final int processingCommandStep;

    @Getter
    @Setter
    private List<TelegramBotMessage> processingMessages;

    public ChatSharedState() {
        this(ChatCommandFlowState.INITIAL, "", 0, List.of());
    }

    public ChatSharedState withCommandFlowState(ChatCommandFlowState newCommandFlowState) {
        return new ChatSharedState(newCommandFlowState, processingCommand, processingCommandStep, processingMessages);
    }

    public ChatSharedState withProcessingCommand(String newProcessingCommand) {
        return new ChatSharedState(commandFlowState, newProcessingCommand, processingCommandStep, processingMessages);
    }

    public ChatSharedState withProcessingCommandStep(int newProcessingCommandStep) {
        return new ChatSharedState(commandFlowState, processingCommand, newProcessingCommandStep, processingMessages);
    }

    public ChatSharedState withProcessingMessage(TelegramBotMessage newMessage) {
        var newMessages = new ArrayList<>(processingMessages);
        newMessages.addLast(newMessage);
        return new ChatSharedState(commandFlowState, processingCommand, processingCommandStep, newMessages);
    }
}
