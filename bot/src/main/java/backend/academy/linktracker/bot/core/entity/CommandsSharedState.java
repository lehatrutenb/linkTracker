package backend.academy.linktracker.bot.core.entity;

/*
/* *
 * Commands shared class to handle shared state in parallel requests
 * /
@Component
@Scope("singleton")
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
*/
