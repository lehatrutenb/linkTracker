package backend.academy.linktracker.bot.adapters.repository;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import java.util.Optional;

public interface UserChatStateRepository {
    Optional<ChatSharedState> getChatSharedState(TelegramBotChatID userChatID);

    void setChatSharedState(TelegramBotChatID userChatID, ChatSharedState commandFlowState);
}
