package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.TelegramBotChatEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotMessageEntity;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.port.TelegramBotMessagesRepository;
import jakarta.transaction.Transactional;
import java.util.Collection;
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
    public Collection<TelegramBotMessage> readAllMessages() {
        return repository.findAll().stream().map(TelegramBotMessageEntity::toDomain).toList();
    }

    @Override
    public Optional<TelegramBotMessage> readMessage(TelegramBotMessageID messageID) {
        return repository.findById(TelegramBotMessageEntity.getID(messageID)).map(TelegramBotMessageEntity::toDomain);
    }

    @Override
    public Optional<TelegramBotMessage> readLastMessageInChat(BotChatID telegramBotChatID) {
        return repository
                .findByIdOrderByDateDesc(TelegramBotChatEntity.getID(telegramBotChatID))
                .map(TelegramBotMessageEntity::toDomain);
    }

    @Override
    public TelegramBotMessage createMessage(TelegramBotMessage message) {
        return repository.save(new TelegramBotMessageEntity(message)).toDomain();
    }

    @Override
    @Transactional
    public TelegramBotMessage updateMessage(TelegramBotMessage message) {
        var addEntity = new TelegramBotMessageEntity(message);
        var curEntity = repository.getReferenceById(TelegramBotMessageEntity.getID(message.id()));
        addEntity.setVersion(curEntity.getVersion());
        return repository.save(addEntity).toDomain();
    }

    @Override
    public void deleteMessageByID(TelegramBotMessageID messageID) {
        repository.deleteById(TelegramBotMessageEntity.getID(messageID));
    }
}