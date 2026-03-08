package backend.academy.linktracker.bot.core.entities;

import backend.academy.linktracker.bot.core.enums.ChatCommandFlowState;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
// Currently can be record, but globally will have more complex logic
public class ChatSharedState {
    @Getter
    private final ChatCommandFlowState commandFlowState;
    @Getter
    private final String processingCommand;

    public ChatSharedState() {
        this(ChatCommandFlowState.INITIAL, "");
    }
}
