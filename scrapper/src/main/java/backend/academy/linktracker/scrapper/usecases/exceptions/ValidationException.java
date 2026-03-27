package backend.academy.linktracker.scrapper.usecases.exceptions;

import lombok.Getter;
import lombok.Setter;

@Getter
public abstract class ValidationException extends DomainException {
    private final String entityName;
    private final String param;
    private final String value;
    private final String reason;

    public ValidationException(String entityName, String param, String reason, String value) {
        super(String.format("Entity `%s` has invalid param `%s` not found with value `%s`, because `%s`", entityName, param, value, reason));
        this.entityName = entityName;
        this.param = param;
        this.value = value;
        this.reason = reason;
    }

    public ValidationException(String entityName, String param, String reason) { // Just not to forget that there can be some sensible value
        super(String.format("Entity %s has invalid param %s not found with value ***, because `%s`", entityName, param));
        this.entityName = entityName;
        this.param = param;
        this.value = "***";
        this.reason = reason;
    }
}
