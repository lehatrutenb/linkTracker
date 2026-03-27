package backend.academy.linktracker.scrapper.core.entities;

import java.net.URI;

public record ScrapperLinkID(URI uri, long UUID) {} // TODO rm uuid from link id - that was needed for outer service ID unique responses, but no longer need
