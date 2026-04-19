package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import java.util.Optional;

public interface TelegramBotMessagesRepository {
    Optional<TelegramBotMessage> getMessage(TelegramBotMessageID messageID);

    Optional<TelegramBotMessage> getLastMessageInChat(BotChatID telegramBotChatID);

    TelegramBotMessage addMessage(TelegramBotMessage message);
}
