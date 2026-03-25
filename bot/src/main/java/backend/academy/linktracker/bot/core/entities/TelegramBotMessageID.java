package backend.academy.linktracker.bot.core.entities;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import org.jetbrains.annotations.NotNull;

@RequiredArgsConstructor
@EqualsAndHashCode
public class TelegramBotMessageID implements Serializable, Comparable<TelegramBotMessageID> {
    private final long id;
    private final TelegramBotChatID chatID;

    public String getForChatUniqueId() {
        return String.valueOf(id);
    }

    public String getUniqueId() {
        return chatID.getID() + "/" + id;
    }

    public TelegramBotMessageID getNextMessageID() {
        return new TelegramBotMessageID(id + 1, chatID);
    }

    @Override
    public int compareTo(@NotNull TelegramBotMessageID o) {
        return Long.compare(id, o.id);
    }
}
