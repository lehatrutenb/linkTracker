package backend.academy.linktracker.bot.usecases.mappers;

import backend.academy.linktracker.bot.core.entities.EventId;
import backend.academy.linktracker.bot.core.entities.LinkTracerChat;
import backend.academy.linktracker.bot.core.entities.LinkTracerMessage;
import backend.academy.linktracker.bot.core.entities.LinkTracerUser;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Update;
import com.pengrad.telegrambot.model.User;
import java.time.Instant;
import lombok.experimental.UtilityClass;

@UtilityClass
public class TelegramUpdatesMapper {
    public static LinkTracerMessage map(Update update) {
        var message = update.message();
        return new LinkTracerMessage(
                message.text(),
                message.messageId(),
                mapInstant(message.date()),
                map(message.chat()),
                map(message.from()));
    }

    public static Instant mapInstant(long epochSec) {
        return Instant.ofEpochSecond(epochSec);
    }

    public static EventId mapUpdateId(Integer id) {
        return new EventId(id.toString());
    }

    public static Integer mapUpdateId(EventId id) {
        return Integer.valueOf(id.id());
    }

    public static LinkTracerUser map(User user) {
        return new LinkTracerUser(user.id(), user.username(), user.firstName(), user.isBot());
    }

    public static LinkTracerChat map(Chat chat) {
        return new LinkTracerChat(chat.id(), chat.type());
    }
}
