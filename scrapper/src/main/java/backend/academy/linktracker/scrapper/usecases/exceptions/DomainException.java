package backend.academy.linktracker.scrapper.usecases.exceptions;

public abstract class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }

    public abstract String getUserDescription();
}
