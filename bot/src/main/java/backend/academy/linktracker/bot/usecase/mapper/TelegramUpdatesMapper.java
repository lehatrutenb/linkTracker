package backend.academy.linktracker.bot.usecase.mapper;

import backend.academy.linktracker.bot.core.entity.BotChat;
import backend.academy.linktracker.bot.core.entity.BotChatID;
import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.entity.LinkUpdateID;
import backend.academy.linktracker.bot.core.entity.ScrapperLinkUpdate;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.entity.TelegramBotUser;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
import backend.academy.linktracker.bot.usecase.dto.generated.LinkUpdate;
import backend.academy.linktracker.bot.usecase.exception.RequestBodyFieldValidationException;
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
        return new EventID(id, OwnerIDType.SCRAPPER);
    }

    public static EventID mapLinkTrackerUpdateId(Integer id) {
        if (id == null) {
            throw new IllegalArgumentException("Update ID is null");
        }
        return new EventID(Long.valueOf(id), OwnerIDType.LINK_TRACKER);
    }

    public static LinkUpdateID mapLinkUpdateID(long id) {
        return new LinkUpdateID(id);
    }

    public static ScrapperLinkUpdate mapLinkUpdate(LinkUpdate request) throws RequestBodyFieldValidationException {
        return new ScrapperLinkUpdate(
                mapLinkUpdateID(request.getId()
                        .orElseThrow(() -> RequestBodyFieldValidationException.ofEmptyError("update", "id"))),
                request.getUrl().orElseThrow(() -> RequestBodyFieldValidationException.ofEmptyError("update", "url")),
                request.getDescription().orElse(""),
                request.getTgChatIds().stream()
                        .map(chatId -> mapBotChatID(chatId.longValue()))
                        .toList());
    }

    public static int mapUpdateId(EventID id) {
        if (id == null) {
            throw new IllegalArgumentException("Event ID is null");
        }
        return Math.toIntExact(id.getRawId());
    }

    public static BotChatID mapBotChatID(Update update) {
        if (update == null) {
            throw new IllegalArgumentException("Update is null");
        }
        if (update.message().chat() == null) {
            throw new IllegalArgumentException("Chat is null");
        }
        if (update.message().chat().id() == null) {
            throw new IllegalArgumentException("Chat ID is null");
        }
        return mapBotChatID(update.message().chat().id());
    }

    public static BotChatID mapBotChatID(long id) {
        return new BotChatID(id);
    }

    public static BotChatID mapScrapperChatId(Long scrapperChatID) {
        if (scrapperChatID == null) {
            throw new IllegalArgumentException("Scrapper chat ID is null");
        }
        return new BotChatID(scrapperChatID);
    }

    public static TelegramBotMessageID mapMessageID(Update update) {
        if (update == null) {
            throw new IllegalArgumentException("Update is null");
        }
        if (update.message().messageId() == null) {
            throw new IllegalArgumentException("Message ID is null");
        }
        return new TelegramBotMessageID(update.message().messageId(), mapBotChatID(update));
    }

    public static TelegramBotUser map(User user) {
        if (user == null) {
            throw new IllegalArgumentException("User is null");
        }
        return new TelegramBotUser(user.id(), user.username(), user.firstName(), user.isBot());
    }

    public static BotChat mapToChat(Update update) {
        if (update == null) {
            throw new IllegalArgumentException("Update is null");
        }
        return new BotChat(mapBotChatID(update));
    }
}
