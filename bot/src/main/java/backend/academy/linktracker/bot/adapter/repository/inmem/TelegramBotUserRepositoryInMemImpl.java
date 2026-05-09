package backend.academy.linktracker.bot.adapter.repository.inmem;

import backend.academy.linktracker.bot.core.entities.TelegramBotUser;
import backend.academy.linktracker.bot.core.port.TelegramBotUserRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
public class TelegramBotUserRepositoryInMemImpl implements TelegramBotUserRepository {
    private final Map<Long, TelegramBotUser> telegramBotUsers = new HashMap<>();

    @Override
    public Optional<TelegramBotUser> getTelegramBotUser(long userID) {
        return Optional.ofNullable(telegramBotUsers.get(userID));
    }

    @Override
    public TelegramBotUser createTelegramBotUser(TelegramBotUser telegramBotUser) {
        telegramBotUsers.put(telegramBotUser.userId(), telegramBotUser);
        return telegramBotUser;
    }

    @Override
    public TelegramBotUser updateTelegramBotUser(TelegramBotUser telegramBotUser) {
        telegramBotUsers.put(telegramBotUser.userId(), telegramBotUser);
        return telegramBotUser;
    }

    @Override
    public void deleteTelegramBotUser(long userID) {
        telegramBotUsers.remove(userID);
    }
}
