package backend.academy.linktracker.scrapper.usecases.exceptions;

import java.io.Serial;
import java.net.URI;

public class ScrappingURIValidationException extends ValidationException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ScrappingURIValidationException(URI uri) {
        super("Scrapping services", "URI", "No scrapper expect such URI", uri.toString());
    }

    @Override
    public String getUserDescription() {
        return "URI is invalid";
    }
}
