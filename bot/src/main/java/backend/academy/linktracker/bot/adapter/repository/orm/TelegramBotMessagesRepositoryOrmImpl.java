package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.adapter.entity.TelegramBotMessageEntity;
import backend.academy.linktracker.bot.core.entity.BotChatID;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.port.TelegramBotMessagesRepository;
import jakarta.transaction.Transactional;
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
    private final BotChatEntityRepositoryOrmInner botChatsRepository;
    private final TelegramBotUserRepositoryOrmInner botUsersRepository;

    @Override
    public Optional<TelegramBotMessage> readMessage(TelegramBotMessageID messageID) {
        return repository.findById(TelegramBotMessageEntity.getID(messageID)).map(TelegramBotMessageEntity::toDomain);
    }

    @Override
    public Optional<TelegramBotMessage> readLastMessageInChat(BotChatID telegramBotChatID) {
        return repository
                .findByMessageIDOrderByDateDesc(BotChatEntity.getID(telegramBotChatID))
                .map(TelegramBotMessageEntity::toDomain);
    }

    @Override
    public TelegramBotMessage createMessage(TelegramBotMessage message) {
        var entity = new TelegramBotMessageEntity(message);
        entity.setChat(botChatsRepository.getReferenceById(
                BotChatEntity.getID(message.chat().getId())));
        entity.setUser(botUsersRepository.getReferenceById(message.user().userId()));
        return repository.save(entity).toDomain();
    }

    @Override
    @Transactional
    public TelegramBotMessage updateMessage(TelegramBotMessage message) {
        return repository.save(new TelegramBotMessageEntity(message)).toDomain();
    }

    @Override
    public void deleteMessage(TelegramBotMessageID messageID) {
        repository.deleteById(TelegramBotMessageEntity.getID(messageID));
    }
}
