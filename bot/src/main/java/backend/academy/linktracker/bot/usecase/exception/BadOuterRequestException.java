package backend.academy.linktracker.bot.usecase.exception;

import java.io.Serial;

public class BadOuterRequestException extends ConflictException {
    @Serial
    private static final long serialVersionUID = 1L;

    public BadOuterRequestException(String entity, String reason) {
        super(entity, reason);
    }

    @Override
    public String getUserDescription() {
        return String.format("Outer request to entity recieved bad request response");
    }
}
