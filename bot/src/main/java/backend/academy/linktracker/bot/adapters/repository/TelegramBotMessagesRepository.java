package backend.academy.linktracker.bot.adapters.repository;

import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import java.util.Optional;

public interface TelegramBotMessagesRepository {
    Optional<TelegramBotMessage> getMessage(TelegramBotMessageID messageID);

    Optional<TelegramBotMessage> getLastMessageInChat(TelegramBotChatID telegramBotChatID);

    void setMessage(TelegramBotMessage message);
}
