package backend.academy.linktracker.bot.usecases.services;

import backend.academy.linktracker.bot.adapters.repository.TelegramBotMessagesRepository;
import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class TelegramBotMessagesService {
    private final TelegramBotMessagesRepository messagesRepository;

    public boolean toProcessMessage(TelegramBotMessage message) {
        return messagesRepository.getLastMessageInChat(message.chat().id())
            .filter(lastMessage -> !lastMessage.id().getNextMessageID().equals(message.id()))
            .isEmpty();
    }

    public void addProcessedMessage(TelegramBotMessage message) {
        messagesRepository.setMessage(message);
    }
}
