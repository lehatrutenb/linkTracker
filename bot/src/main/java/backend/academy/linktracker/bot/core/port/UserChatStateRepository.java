package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import java.util.Collection;
import java.util.Optional;

public interface UserChatStateRepository {
    Optional<ChatSharedState> readChatSharedState(BotChatID userChatID);
    void createChatSharedState(BotChatID chatID, ChatSharedState chatSharedState);
    ChatSharedState updateChatSharedState(BotChatID chatID, ChatSharedState chatSharedState);
    void deleteChatSharedState(BotChatID chatID);
}
