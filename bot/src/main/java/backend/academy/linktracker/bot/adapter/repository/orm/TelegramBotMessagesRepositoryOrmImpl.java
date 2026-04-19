package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.TelegramBotChatEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotMessageEntity;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.port.TelegramBotMessagesRepository;
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
public class TelegramBotMessagesRepositoryOrmImpl implements TelegramBotMessagesRepository {
    private final TelegramBotMessagesRepositoryOrmInner repository;

    @Override
    public Optional<TelegramBotMessage> getMessage(TelegramBotMessageID messageID) {
        return repository.findById(TelegramBotMessageEntity.getID(messageID)).map(TelegramBotMessageEntity::toDomain);
    }

    @Override
    public Optional<TelegramBotMessage> getLastMessageInChat(BotChatID telegramBotChatID) {
        return repository
                .findByIdOrderByDateDesc(TelegramBotChatEntity.getID(telegramBotChatID))
                .map(TelegramBotMessageEntity::toDomain);
    }

    @Override
    public TelegramBotMessage addMessage(TelegramBotMessage message) {
        return repository.save(new TelegramBotMessageEntity(message)).toDomain();
    }
}
