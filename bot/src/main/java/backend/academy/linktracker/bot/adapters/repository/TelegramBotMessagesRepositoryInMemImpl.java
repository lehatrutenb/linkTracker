package backend.academy.linktracker.bot.adapters.repository;

import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessageID;
import org.springframework.stereotype.Repository;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class TelegramBotMessagesRepositoryInMemImpl implements TelegramBotMessagesRepository {
    private final Map<String, TelegramBotMessage> messageRepo = new HashMap<>();

    @Override
    public Optional<TelegramBotMessage> getMessage(TelegramBotMessageID messageID) {
        return Optional.ofNullable(messageRepo.get(messageID.getUniqueId()));
    }

    @Override
    public Optional<TelegramBotMessage> getLastMessageInChat(TelegramBotChatID telegramBotChatID) {
        return messageRepo.values().stream()
            .filter(message -> message.chat().id().equals(telegramBotChatID))
            .max(Comparator.comparing(message -> message.chat().id().getID()));
    }

    @Override
    public void setMessage(TelegramBotMessage message) {
        messageRepo.put(message.id().getUniqueId(), message);
    }
}
