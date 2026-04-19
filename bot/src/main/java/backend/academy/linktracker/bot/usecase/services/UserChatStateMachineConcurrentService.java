package backend.academy.linktracker.bot.usecase.services;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.port.UserChatStateRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserChatStateMachineConcurrentService {
    private final UserChatStateRepository userChatStateRepository;

    public synchronized void setChatSharedState(BotChatID userChatID, ChatSharedState chatSharedState) {
        userChatStateRepository.upsertChatSharedState(userChatID, chatSharedState);
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
