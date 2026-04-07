package backend.academy.linktracker.scrapper.usecases.exceptions;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import java.io.Serial;
import java.net.URI;

public class LinkNotFoundException extends NotFoundException {
    @Serial
    private static final long serialVersionUID = 1L;

    public LinkNotFoundException(URI link) {
        super(ScrapperLink.class.getSimpleName(), link.toString());
    }

    @Override
    public String getUserDescription() {
        return "Link not found";
    }
}
