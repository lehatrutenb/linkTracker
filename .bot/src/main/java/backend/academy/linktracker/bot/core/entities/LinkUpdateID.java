package backend.academy.linktracker.bot.core.entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import java.io.Serial;
import java.io.Serializable;

@RequiredArgsConstructor
@EqualsAndHashCode
public class LinkUpdateID implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @Getter
    private final long id;
}
