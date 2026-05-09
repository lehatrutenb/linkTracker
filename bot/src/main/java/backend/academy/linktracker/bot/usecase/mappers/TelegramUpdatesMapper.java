package backend.academy.linktracker.bot.usecase.mappers;

import backend.academy.linktracker.bot.core.entities.BotChat;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.entities.LinkUpdateID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.entities.TelegramBotUser;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkUpdateRequest;
import backend.academy.linktracker.bot.usecase.exceptions.RequestBodyFieldValidationException;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.User;
import java.time.Instant;
import lombok.experimental.UtilityClass;
import org.springframework.beans.factory.annotation.Qualifier;

@UtilityClass
public class TelegramUpdatesMapper {
    public static TelegramBotMessage map(Update update, Qualifier replyServiceQualifier) {
        var message = update.message();
        return new TelegramBotMessage(
                message.text() == null ? "" : message.text(),
                mapMessageID(update),
                mapInstant(message.date()),
                mapToChat(update, replyServiceQualifier),
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

    public static LinkUpdateID mapLinkUpdateID(long id) {
        return new LinkUpdateID(id);
    }

    public static LinkUpdate mapLinkUpdateRequest(LinkUpdateRequest request) {
        return new LinkUpdate(
                mapLinkUpdateID(request.getId()
                        .orElseThrow(() -> RequestBodyFieldValidationException.ofEmptyError("update", "id"))),
                request.getUrl().orElseThrow(() -> RequestBodyFieldValidationException.ofEmptyError("update", "url")),
                request.getDescription().orElse(""),
                request.getTgChatIds().stream()
                        .map(chatId -> mapBotChatID(chatId.longValue()))
                        .toList());
    }

    public static int mapUpdateId(EventID id) {
        return Math.toIntExact(id.getRawId());
    }

    public static BotChatID mapBotChatID(Update update) {
        return mapBotChatID(update.message().chat().id());
    }

    public static BotChatID mapBotChatID(long id) {
        return new BotChatID(id);
    }

    public static BotChatID mapScrapperChatId(Long scrapperChatID) {
        return new BotChatID(scrapperChatID);
    }

    public static TelegramBotMessageID mapMessageID(Update update) {
        return new TelegramBotMessageID(update.message().messageId(), mapBotChatID(update));
    }

    public static TelegramBotUser map(User user) {
        return new TelegramBotUser(user.id(), user.username(), user.firstName(), user.isBot());
    }

    public static BotChat mapToChat(Update update, Qualifier replyServiceQualifier) {
        return new BotChat(mapBotChatID(update), replyServiceQualifier.value());
    }
}
