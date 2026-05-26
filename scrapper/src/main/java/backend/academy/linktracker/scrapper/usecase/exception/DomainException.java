<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/exceptions/DomainException.java
package backend.academy.linktracker.bot.usecase.exceptions;
========
package backend.academy.linktracker.scrapper.usecase.exception;
>>>>>>>> HW2:scrapper/src/main/java/backend/academy/linktracker/scrapper/usecase/exception/DomainException.java

import java.io.Serial;

public abstract class DomainException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public DomainException(String message) {
        super(message);
    }

    public abstract String getUserDescription();
}
