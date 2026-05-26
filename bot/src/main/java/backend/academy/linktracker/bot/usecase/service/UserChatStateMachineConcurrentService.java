<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/services/UserChatStateMachineConcurrentService.java
package backend.academy.linktracker.bot.usecase.services;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.port.UserChatStateRepository;
========
package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.adapter.repository.UserChatStateRepository;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/service/UserChatStateMachineConcurrentService.java
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserChatStateMachineConcurrentService {
    private final UserChatStateRepository userChatStateRepository;

    public synchronized void setChatSharedState(BotChatID userChatID, ChatSharedState chatSharedState) {
        userChatStateRepository.setChatSharedState(userChatID, chatSharedState);
    }

    public synchronized ChatSharedState getChatSharedState(BotChatID userChatID) {
        var state = userChatStateRepository.getChatSharedState(userChatID);
        if (state.isEmpty()) {
            state = Optional.of(new ChatSharedState());
            setChatSharedState(userChatID, state.orElseThrow());
        }
        return state.orElseThrow();
    }
}
