package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entity.BotChatID;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessageID;
import java.util.Optional;

public interface TelegramBotMessagesRepository {
    Optional<TelegramBotMessage> readMessage(TelegramBotMessageID messageID);

    Optional<TelegramBotMessage> readLastMessageInChat(BotChatID telegramBotChatID);

    TelegramBotMessage createMessage(TelegramBotMessage message);

    TelegramBotMessage updateMessage(TelegramBotMessage message);

    void deleteMessage(TelegramBotMessageID messageID);
}
