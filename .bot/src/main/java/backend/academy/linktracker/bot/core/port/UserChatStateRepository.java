package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import java.util.Optional;

public interface UserChatStateRepository {
    Optional<ChatSharedState> getChatSharedState(BotChatID userChatID);

    void setChatSharedState(BotChatID userChatID, ChatSharedState commandFlowState);
}
