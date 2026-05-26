package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.TelegramBotUserEntity;
import backend.academy.linktracker.bot.core.entity.TelegramBotUser;
import backend.academy.linktracker.bot.core.port.TelegramBotUserRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
@RequiredArgsConstructor
public class TelegramBotUserRepositoryOrmImpl implements TelegramBotUserRepository {
    private final TelegramBotUserRepositoryOrmInner repository;

    @Override
    public Optional<TelegramBotUser> getTelegramBotUser(long userID) {
        return repository.findById(userID).map(TelegramBotUserEntity::toDomain);
    }

    @Override
    public TelegramBotUser createTelegramBotUser(TelegramBotUser telegramBotUser) {
        return repository.save(new TelegramBotUserEntity(telegramBotUser)).toDomain();
    }

    @Override
    public TelegramBotUser updateTelegramBotUser(TelegramBotUser telegramBotUser) {
        return repository.save(new TelegramBotUserEntity(telegramBotUser)).toDomain();
    }

    @Override
    public void deleteTelegramBotUser(long userID) {
        repository.deleteById(userID);
    }
}
