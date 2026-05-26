package backend.academy.linktracker.bot.usecase.exception;

import java.io.Serial;

public abstract class DomainException extends Exception {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String message) {
        super(message);
    }

    public abstract String getUserDescription();
}
