package backend.academy.linktracker.bot.usecases.exceptions;

import java.io.Serial;

public abstract class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String message) {
        super(message);
    }

    public abstract String getUserDescription();
}
