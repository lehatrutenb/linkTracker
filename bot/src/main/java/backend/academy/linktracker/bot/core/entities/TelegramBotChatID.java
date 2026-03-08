package backend.academy.linktracker.bot.core.entities;

import lombok.RequiredArgsConstructor;
import java.io.Serializable;

@RequiredArgsConstructor
public class TelegramBotChatID implements Serializable {
    private final long id;

    public String getID() {
        return String.valueOf(id);
    }

    public long getNumericID() {
        return id;
    }
}
