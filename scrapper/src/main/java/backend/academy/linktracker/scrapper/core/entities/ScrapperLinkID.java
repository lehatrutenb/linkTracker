package backend.academy.linktracker.scrapper.core.entities;

import java.net.URI;
import java.util.Optional;

// TODO rewrite all generated ids to optional?
public record ScrapperLinkID(URI uri, Optional<Long> id) {
    public ScrapperLinkID(URI uri) {
        this(uri, Optional.empty());
    }
}
