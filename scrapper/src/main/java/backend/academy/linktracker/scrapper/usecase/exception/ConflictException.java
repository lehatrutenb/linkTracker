<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/exceptions/ConflictException.java
package backend.academy.linktracker.bot.usecase.exceptions;
========
package backend.academy.linktracker.scrapper.usecase.exception;
>>>>>>>> HW2:scrapper/src/main/java/backend/academy/linktracker/scrapper/usecase/exception/ConflictException.java

import java.io.Serial;
import lombok.Getter;

@Getter
public abstract class ConflictException extends DomainException {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String entity;
    private final String reason;

    public ConflictException(String entity, String reason) {
        super(String.format("Entity `%s` has conflict with reason: `%s`", entity, reason));
        this.entity = entity;
        this.reason = reason;
    }
}
