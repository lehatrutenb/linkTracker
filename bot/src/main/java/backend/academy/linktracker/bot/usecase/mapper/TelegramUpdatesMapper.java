package backend.academy.linktracker.bot.usecase.mapper;

import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.entity.TelegramBotChat;
import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.entity.TelegramBotUser;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.User;
import java.time.Instant;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TelegramUpdatesMapper {
    public static TelegramBotMessage map(Update update) {
        var message = update.message();
        if (message == null) {
            throw new IllegalArgumentException("Message is null");
        }
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
        if (id == null) {
            throw new IllegalArgumentException("Update ID is null");
        }
        return new EventID(id.toString(), OwnerIDType.SCRAPPER);
    }

    public static EventID mapLinkTrackerUpdateId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("Update ID is null");
        }
        return new EventID(id.toString(), OwnerIDType.LINK_TRACKER);
    }

    public static int mapUpdateId(EventID id) {
        if (id == null) {
            throw new IllegalArgumentException("Event ID is null");
        }
        return Integer.parseInt(id.getRawId());
    }

    public static TelegramBotChatID mapChatId(Update update) {
        if (update == null) {
            throw new IllegalArgumentException("Update is null");
        }
        if (update.message().chat() == null) {
            throw new IllegalArgumentException("Chat is null");
        }
        if (update.message().chat().id() == null) {
            throw new IllegalArgumentException("Chat ID is null");
        }
        return new TelegramBotChatID(update.message().chat().id());
    }

    public static TelegramBotChatID mapScrapperChatId(Long scrapperChatID) {
        if (scrapperChatID == null) {
            throw new IllegalArgumentException("Scrapper chat ID is null");
        }
        return new TelegramBotChatID(scrapperChatID);
    }

    public static TelegramBotMessageID mapMessageID(Update update) {
        if (update == null) {
            throw new IllegalArgumentException("Update is null");
        }
        if (update.message().messageId() == null) {
            throw new IllegalArgumentException("Message ID is null");
        }
        if (mapChatId(update) == null) {
            throw new IllegalArgumentException("Chat ID is null");
        }
        return new TelegramBotMessageID(update.message().messageId(), mapChatId(update));
    }

    public static TelegramBotUser map(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User is null");
        }
        return new TelegramBotUser(user.id(), user.username(), user.firstName(), user.isBot());
    }

    public static TelegramBotChat mapToChat(Update update) {
        if (update == null) {
            throw new IllegalArgumentException("Update is null");
        }
        if (update.message().chat().type() == null) {
            throw new IllegalArgumentException("Chat type is null");
        }
        return new TelegramBotChat(mapChatId(update), update.message().chat().type());
    }
}
