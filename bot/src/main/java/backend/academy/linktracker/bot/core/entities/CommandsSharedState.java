package backend.academy.linktracker.bot.core.entities;

import backend.academy.linktracker.bot.core.enums.CurrentCommandFlowState;
import org.springframework.stereotype.Component;

/**
 * Commands shared class to handle shared state in parallel requests
 */
@Component
public class CommandsSharedState {
    private CurrentCommandFlowState commandFlowState;

    public synchronized boolean setCommandFlowState(CurrentCommandFlowState newCommandFlowState) {
        if (commandFlowState == CurrentCommandFlowState.WAITING_USER_INPUT
                && newCommandFlowState == CurrentCommandFlowState.WAITING_USER_INPUT) {
            return false;
        }
        commandFlowState = newCommandFlowState;
        return true;
    }

    public synchronized CurrentCommandFlowState getCommandFlowState() {
        return commandFlowState;
    }
}
