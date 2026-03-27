package backend.academy.linktracker.scrapper.usecases.exceptions;

import lombok.Getter;

@Getter
public abstract class ConflictException extends DomainException {
    private final String entity;
    private final String reason;

    public ConflictException(String entity, String reason) {
        super(String.format("Entity `%s` has conflict with reason: `%s`", entity, reason));
        this.entity = entity;
        this.reason = reason;
    }
}
