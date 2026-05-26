<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/core/port/TelegramBotMessagesRepository.java
package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
========
package backend.academy.linktracker.bot.adapter.repository;

import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessageID;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/adapter/repository/TelegramBotMessagesRepository.java
import java.util.Optional;

public interface TelegramBotMessagesRepository {
    Optional<TelegramBotMessage> getMessage(TelegramBotMessageID messageID);

    Optional<TelegramBotMessage> getLastMessageInChat(BotChatID telegramBotChatID);

    void addMessage(TelegramBotMessage message);
}
