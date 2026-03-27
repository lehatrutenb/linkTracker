package backend.academy.linktracker.scrapper.usecases.exceptions;

import lombok.Getter;
import lombok.Setter;

public class DuplicateEntityException extends ConflictException {
    public DuplicateEntityException(Class<?> entity, String id) {
        super(entity.getSimpleName(), String.format("has same entities with id `%s`", id));
    }

    @Override
    public String getUserDescription() {
        return "Attempt to create duplicate entities";
    }
}
