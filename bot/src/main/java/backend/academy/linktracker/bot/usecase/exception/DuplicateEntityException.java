<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/exceptions/DuplicateEntityException.java
package backend.academy.linktracker.bot.usecase.exceptions;
========
package backend.academy.linktracker.bot.usecase.exception;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/exception/DuplicateEntityException.java

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
