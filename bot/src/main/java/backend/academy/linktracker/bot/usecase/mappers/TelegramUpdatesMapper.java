package backend.academy.linktracker.bot.usecase.mappers;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.TelegramBotChat;
import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.entities.TelegramBotUser;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.User;
import java.time.Instant;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TelegramUpdatesMapper {
    public static TelegramBotMessage map(Update update) {
        var message = update.message();
        return new TelegramBotMessage(
                message.text() == null ? "" : message.text(),
                mapMessageID(update),
                mapInstant(message.date()),
                mapToChat(update),
                map(message.from()));
    }

    public static Instant mapInstant(long epochSec) {
        return Instant.ofEpochSecond(epochSec);
    }

    public static EventID mapScrapperUpdateId(Long id) {
        return new EventID(id, OwnerIDType.SCRAPPER);
    }

    public static EventID mapLinkTrackerUpdateId(Integer id) {
        return new EventID(Long.valueOf(id), OwnerIDType.LINK_TRACKER);
    }

    public static int mapUpdateId(EventID id) {
        return Math.toIntExact(id.getRawId());
    }

    public static TelegramBotChatID mapChatId(Update update) {
        return new TelegramBotChatID(update.message().chat().id());
    }

    public static TelegramBotChatID mapScrapperChatId(Long scrapperChatID) {
        return new TelegramBotChatID(scrapperChatID);
    }

    public static TelegramBotMessageID mapMessageID(Update update) {
        return new TelegramBotMessageID(update.message().messageId(), mapChatId(update));
    }

    public static TelegramBotUser map(User user) {
        return new TelegramBotUser(user.id(), user.username(), user.firstName(), user.isBot());
    }

    public static TelegramBotChat mapToChat(Update update) {
        return new TelegramBotChat(
                mapChatId(update), map(update.message().chat().type()));
    }

    public static TelegramBotChat.Type map(Chat.Type chatType) {
        return TelegramBotChat.Type.valueOf(chatType.name().toUpperCase());
    }
}
