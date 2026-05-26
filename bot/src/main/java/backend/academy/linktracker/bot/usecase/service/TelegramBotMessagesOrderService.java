package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.core.entity.BotChatID;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import java.util.HashSet;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TelegramBotMessagesOrderService {
    private final Set<BotChatID> processingMessages = new HashSet<>();

    public boolean toProcessMessage(TelegramBotMessage message) {
        return !processingMessages.contains(message.chat().getId());
    }

    public void addProcessingMessage(TelegramBotMessage message) {
        if (processingMessages.contains(message.chat().getId())) {
            log.atError()
                    .addKeyValue("message id", message.id())
                    .log("Currently processing 2 messages for the same chat");
            throw new IllegalStateException("Currently processing 2 messages for the same chat");
        }
        processingMessages.add(message.chat().getId());
    }

    public void clear() {
        processingMessages.clear();
    }
}
