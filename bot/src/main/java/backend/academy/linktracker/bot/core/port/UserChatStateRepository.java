package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entity.BotChatID;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import java.util.Optional;

public interface UserChatStateRepository {
    Optional<ChatSharedState> readChatSharedState(BotChatID userChatID);

    void createChatSharedState(BotChatID chatID, ChatSharedState chatSharedState);

    ChatSharedState updateChatSharedState(BotChatID chatID, ChatSharedState chatSharedState);

    void deleteChatSharedState(BotChatID chatID);
}
