package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import java.util.Collection;
import java.util.Optional;

public interface TelegramBotMessagesRepository {
    Collection<TelegramBotMessage> readAllMessages();
    Optional<TelegramBotMessage> readMessage(TelegramBotMessageID messageID);
    Optional<TelegramBotMessage> readLastMessageInChat(BotChatID telegramBotChatID);
    TelegramBotMessage createMessage(TelegramBotMessage message);
    TelegramBotMessage updateMessage(TelegramBotMessage message);
    void deleteMessageByID(TelegramBotMessageID messageID);
}