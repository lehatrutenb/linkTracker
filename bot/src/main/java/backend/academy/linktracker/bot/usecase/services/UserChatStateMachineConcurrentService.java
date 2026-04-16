package backend.academy.linktracker.bot.usecase.services;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import backend.academy.linktracker.bot.core.port.UserChatStateRepository;
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
