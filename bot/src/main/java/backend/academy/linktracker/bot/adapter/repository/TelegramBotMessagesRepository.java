package backend.academy.linktracker.bot.adapter.repository;

import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessageID;
import java.util.Optional;

public interface TelegramBotMessagesRepository {
    Optional<TelegramBotMessage> getMessage(TelegramBotMessageID messageID);

    Optional<TelegramBotMessage> getLastMessageInChat(TelegramBotChatID telegramBotChatID);

    void setMessage(TelegramBotMessage message);
}
