package backend.academy.linktracker.bot.adapter.repository;

import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
import java.util.Optional;

public interface UserChatStateRepository {
    Optional<ChatSharedState> getChatSharedState(TelegramBotChatID userChatID);

    void setChatSharedState(TelegramBotChatID userChatID, ChatSharedState commandFlowState);
}
