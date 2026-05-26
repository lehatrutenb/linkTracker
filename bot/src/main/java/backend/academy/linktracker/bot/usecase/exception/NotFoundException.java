package backend.academy.linktracker.bot.usecase.exception;

import java.io.Serial;
import lombok.Getter;

@Getter
public class NotFoundException extends DomainException {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String entityName;
    private final String id;

    public NotFoundException(String entityName, String id) {
        super(String.format("Entity `%s` with id `%s` not found", entityName, id));
        this.entityName = entityName;
        this.id = id;
    }

    @Override
    public String getUserDescription() {
        return String.format("Requested not found entity", entityName, id);
    }
}
