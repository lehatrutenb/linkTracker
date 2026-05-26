<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/exceptions/ValidationException.java
package backend.academy.linktracker.bot.usecase.exceptions;
========
package backend.academy.linktracker.bot.usecase.exception;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/exception/ValidationException.java

import java.io.Serial;
import lombok.Getter;

@Getter
public abstract class ValidationException extends DomainException {
    @Serial
    private static final long serialVersionUID = 1L;

    private final String entityName;
    private final String param;
    private final String value;
    private final String reason;

    public ValidationException(String entityName, String param, String reason, String value) {
        super(String.format(
                "Entity `%s` has invalid param `%s` found with value `%s`, because `%s`",
                entityName, param, value, reason));
        this.entityName = entityName;
        this.param = param;
        this.value = value;
        this.reason = reason;
    }

    public ValidationException(
            String entityName,
            String param,
            String reason) { // Just not to forget that there can be some sensible value
        super(String.format("Entity %s has invalid param %s found with value ***, because `%s`", entityName, param));
        this.entityName = entityName;
        this.param = param;
        this.value = "***";
        this.reason = reason;
    }
}
