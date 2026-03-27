package backend.academy.linktracker.scrapper.usecases.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class NotFoundException extends DomainException {
    private final String entityName;
    private final String id;

    public NotFoundException(String entityName, String id) {
        super(String.format("Entity `%s` with id `%s` not found", entityName, id));
        this.entityName = entityName;
        this.id = id;
    }
}
