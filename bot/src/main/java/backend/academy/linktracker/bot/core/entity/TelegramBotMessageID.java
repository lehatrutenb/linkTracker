package backend.academy.linktracker.bot.core.entity;

import java.io.Serial;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.jetbrains.annotations.NotNull;
import org.jspecify.annotations.Nullable;

@AllArgsConstructor
@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
public class TelegramBotMessageID implements Serializable, Comparable<TelegramBotMessageID> {
    @Serial
    private static final long serialVersionUID = 1L;

    @Nullable
    @Getter
    private Long techID;

    private final long id;

    @Getter
    private final BotChatID chatID;

    public long getForChatUniqueId() {
        return id;
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
