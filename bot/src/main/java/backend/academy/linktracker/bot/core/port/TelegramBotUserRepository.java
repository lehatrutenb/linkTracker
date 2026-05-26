package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entity.TelegramBotUser;
import java.util.Optional;

public interface TelegramBotUserRepository {
    Optional<TelegramBotUser> getTelegramBotUser(long userID);

    TelegramBotUser createTelegramBotUser(TelegramBotUser telegramBotUser);

    TelegramBotUser updateTelegramBotUser(TelegramBotUser telegramBotUser);

    void deleteTelegramBotUser(long userID);
}
