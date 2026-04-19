package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import java.util.Optional;

public interface UserChatStateRepository {
    Optional<ChatSharedState> getChatSharedState(BotChatID userChatID);

    void upsertChatSharedState(BotChatID chatID, ChatSharedState chatSharedState);
}
