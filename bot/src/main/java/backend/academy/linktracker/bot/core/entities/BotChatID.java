package backend.academy.linktracker.bot.core.entities;

import java.io.Serial;
import java.io.Serializable;
import lombok.EqualsAndHashCode;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@EqualsAndHashCode
@ToString
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
