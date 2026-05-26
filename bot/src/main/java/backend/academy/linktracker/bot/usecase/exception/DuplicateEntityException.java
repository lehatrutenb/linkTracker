package backend.academy.linktracker.bot.usecase.exception;

import java.io.Serial;

public class DuplicateEntityException extends ConflictException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DuplicateEntityException(Class<?> entity, String id) {
        super(entity.getSimpleName(), String.format("has same entities with id `%s`", id));
    }

    @Override
    public String getUserDescription() {
        return "Attempt to create duplicate entities";
    }
}
