<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/services/TelegramBotMessagesOrderService.java
package backend.academy.linktracker.bot.usecase.services;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
========
package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/service/TelegramBotMessagesOrderService.java
import java.util.HashSet;
import java.util.Set;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@RefreshScope
public class TelegramBotMessagesOrderService {
<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/services/TelegramBotMessagesOrderService.java
    // private final TelegramBotMessagesRepository messagesRepository; # TODO am i really longer need it?
    private final Set<BotChatID> processingMessages = new HashSet<>();
========
    private final Set<TelegramBotChatID> processingMessages = new HashSet<>();
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/service/TelegramBotMessagesOrderService.java

    public boolean toProcessMessage(TelegramBotMessage message) {
        return !processingMessages.contains(message.chat().id());
    }

    public void addProcessingMessage(TelegramBotMessage message) {
        if (processingMessages.contains(message.chat().id())) {
            log.atError().addKeyValue("message id", message.id()).log("Attempt to add processing message twice");
            throw new IllegalStateException("Attempt to add processing message twice");
        }
        processingMessages.add(message.chat().id());
    }

    public void clear() {
        processingMessages.clear();
    }
}
