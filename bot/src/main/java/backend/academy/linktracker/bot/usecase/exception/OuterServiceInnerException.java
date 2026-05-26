package backend.academy.linktracker.bot.usecase.exception;

import backend.academy.linktracker.bot.usecase.dto.generated.ApiErrorResponse;
import java.io.Serial;

public class OuterServiceInnerException extends DomainException {

    @Serial
    private static final long serialVersionUID = 1L;

    public OuterServiceInnerException(ApiErrorResponse response) {
        super(response.getDescription().orElse(""));
    }

    @Override
    public String getUserDescription() {
        return "Outer service inner exception occured";
    }
}
