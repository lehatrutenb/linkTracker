package backend.academy.linktracker.bot.adapter.repository.inmem;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import backend.academy.linktracker.bot.core.port.TelegramBotMessagesRepository;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
public class TelegramBotMessagesRepositoryInMemImpl implements TelegramBotMessagesRepository {
    private final Map<String, TelegramBotMessage> messageRepo = new HashMap<>();
    private long lastMessageInd = 0;

    @Override
    public Collection<TelegramBotMessage> readAllMessages() {
        return messageRepo.values();
    }

    @Override
    public Optional<TelegramBotMessage> readMessage(TelegramBotMessageID messageID) {
        return Optional.ofNullable(messageRepo.get(messageID.getUniqueId()));
    }

    @Override
    public Optional<TelegramBotMessage> readLastMessageInChat(BotChatID telegramBotChatID) {
        return messageRepo.values().stream()
                .filter(message -> message.chat().getId().equals(telegramBotChatID))
                .max(Comparator.comparing(message -> message.chat().getId().getID()));
    }

    @Override
    public TelegramBotMessage createMessage(TelegramBotMessage message) {
        messageRepo.put(message.id().getUniqueId(), message);
        lastMessageInd++;
        return new TelegramBotMessage(
                message.message(),
                new TelegramBotMessageID(lastMessageInd, message.id().getChatID()),
                message.date(),
                message.chat(),
                message.user());
    }

    @Override
    public TelegramBotMessage updateMessage(TelegramBotMessage message) {
        messageRepo.put(message.id().getUniqueId(), message);
        return message;
    }

    @Override
    public void deleteMessageByID(TelegramBotMessageID messageID) {
        messageRepo.remove(messageID.getUniqueId());
    }
}