package backend.academy.linktracker.bot.core.entities;

import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public class TelegramBotChatID implements Serializable {
    private final long id;

    public String getID() {
        return String.valueOf(id);
    }

    public long getNumericID() {
        return id;
    }
}
