package backend.academy.linktracker.scrapper.usecases.exceptions;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import java.net.URI;

public class LinkNotFoundException extends NotFoundException {
    public LinkNotFoundException(URI link) {
        super(ScrapperLink.class.getSimpleName(), link.toString());
    }

    @Override
    public String getUserDescription() {
        return "Link not found";
    }
}
