package backend.academy.linktracker.bot.usecase.exceptions;

import java.io.Serial;
import lombok.Getter;

@Getter
public abstract class NotFoundException extends DomainException {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String entityName;
    private final String id;

    public NotFoundException(String entityName, String id) {
        super(String.format("Entity `%s` with id `%s` not found", entityName, id));
        this.entityName = entityName;
        this.id = id;
    }
}
