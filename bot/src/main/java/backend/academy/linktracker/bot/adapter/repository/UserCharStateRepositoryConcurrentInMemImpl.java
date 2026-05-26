<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/adapter/repository/inmem/UserCharStateRepositoryConcurrentInMemImpl.java
package backend.academy.linktracker.bot.adapter.repository.inmem;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.port.UserChatStateRepository;
========
package backend.academy.linktracker.bot.adapter.repository;

import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/adapter/repository/UserCharStateRepositoryConcurrentInMemImpl.java
import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
public class UserCharStateRepositoryConcurrentInMemImpl implements UserChatStateRepository {
    private final ConcurrentMap<String, ChatSharedState> currentCommandFlowStates = new ConcurrentHashMap<>();

    @Override
    public Optional<ChatSharedState> getChatSharedState(BotChatID userChatID) {
        return Optional.ofNullable(currentCommandFlowStates.get(userChatID.getID()));
    }

    @Override
    public void setChatSharedState(BotChatID userChatID, ChatSharedState chatSharedState) {
        currentCommandFlowStates.put(userChatID.getID(), chatSharedState);
    }
}
