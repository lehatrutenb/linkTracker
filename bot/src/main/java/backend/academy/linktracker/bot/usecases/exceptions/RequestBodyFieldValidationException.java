package backend.academy.linktracker.bot.usecases.exceptions;

import java.io.Serial;
import lombok.Getter;

public class RequestBodyFieldValidationException extends ValidationException {
    @Serial
    private static final long serialVersionUID = 1L;

    private enum Description {
        EMPTY_ERROR("Request body has not set all required fields"),
        INVALID_VALUE_ERROR("Request body has invalid fields");

        @Getter
        private final String description;

        Description(String description) {
            this.description = description;
        }
    }

    private final Description description;

    private RequestBodyFieldValidationException(
            String objectName, String reason, String value, Description description) {
        super("Link tracker update service", objectName, reason, value);
        this.description = description;
    }

    public static RequestBodyFieldValidationException ofEmptyError(String objectName, String fieldName) {
        return new RequestBodyFieldValidationException(
                objectName, "Required field `" + fieldName + "` is empty", "empty", Description.EMPTY_ERROR);
    }

    @Override
    public String getUserDescription() {
        return description.getDescription();
    }
}
