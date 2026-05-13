package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.adapter.repository.UserChatStateRepository;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserChatStateMachineConcurrentService {
    private final UserChatStateRepository userChatStateRepository;

    public synchronized void setChatSharedState(TelegramBotChatID userChatID, ChatSharedState chatSharedState) {
        userChatStateRepository.setChatSharedState(userChatID, chatSharedState);
    }

    public synchronized ChatSharedState getChatSharedState(TelegramBotChatID userChatID) {
        var state = userChatStateRepository.getChatSharedState(userChatID);
        if (state.isEmpty()) {
            state = Optional.of(new ChatSharedState());
            setChatSharedState(userChatID, state.orElseThrow());
        }
        return state.orElseThrow();
    }
}
