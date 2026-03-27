package backend.academy.linktracker.scrapper.usecases.exceptions;

import java.net.URI;

public class ScrappingURIValidationException extends ValidationException {
    public ScrappingURIValidationException(URI uri) {
        super("Scrapping services", "URI", "No scrapper expect such URI", uri.toString());
    }

    @Override
    public String getUserDescription() {
        return "URI is invalid";
    }
}

