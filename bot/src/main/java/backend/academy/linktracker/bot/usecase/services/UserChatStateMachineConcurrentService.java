package backend.academy.linktracker.bot.usecase.services;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.port.UserChatStateRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class UserChatStateMachineConcurrentService {
    private final UserChatStateRepository userChatStateRepository;

    @Transactional
    public synchronized void setChatSharedState(BotChatID userChatID, ChatSharedState chatSharedState) {
        /*var newMessages = new ArrayList<TelegramBotMessage>();
        for (var message : chatSharedState.getProcessingMessages()) {
            newMessages.add(botMessagesRepository.createMessage(message));
        }
        chatSharedState.setProcessingMessages(newMessages);*/
        // TODO RM WAS BAD IDEA TO CREATE SUCH CREATION POLICY
        if (userChatStateRepository.readChatSharedState(userChatID).isPresent()) {
            userChatStateRepository.updateChatSharedState(userChatID, chatSharedState);
        } else {
            userChatStateRepository.createChatSharedState(userChatID, chatSharedState);
        }
    }

    public synchronized ChatSharedState getChatSharedState(BotChatID userChatID) {
        var state = userChatStateRepository.readChatSharedState(userChatID);
        if (state.isEmpty()) {
            state = Optional.of(new ChatSharedState());
            setChatSharedState(userChatID, state.orElseThrow());
        }
        return state.orElseThrow();
    }
}
