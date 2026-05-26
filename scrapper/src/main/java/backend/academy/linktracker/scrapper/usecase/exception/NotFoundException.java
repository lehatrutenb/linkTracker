<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/exceptions/NotFoundException.java
package backend.academy.linktracker.bot.usecase.exceptions;
========
package backend.academy.linktracker.scrapper.usecase.exception;
>>>>>>>> HW2:scrapper/src/main/java/backend/academy/linktracker/scrapper/usecase/exception/NotFoundException.java

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
