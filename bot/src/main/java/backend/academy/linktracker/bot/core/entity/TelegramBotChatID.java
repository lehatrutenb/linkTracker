package backend.academy.linktracker.bot.core.entity;

import java.io.Serial;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@EqualsAndHashCode
public class BotChatID implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private final long id;

    public String getID() {
        return String.valueOf(id);
    }

    public long getNumericID() {
        return id;
    }
}
