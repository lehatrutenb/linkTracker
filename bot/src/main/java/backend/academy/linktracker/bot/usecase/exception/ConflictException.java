package backend.academy.linktracker.bot.usecase.exception;

import java.io.Serial;
import lombok.Getter;

@Getter
public class ConflictException extends DomainException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ConflictException(String entity, String reason) {
        super(String.format("Entity `%s` has conflict with reason: `%s`", entity, reason));
    }

    @Override
    public String getUserDescription() {
        return String.format("Requested entity has conflict");
    }
}
