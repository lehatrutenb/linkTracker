package backend.academy.linktracker.scrapper.core.entities;

import java.net.URI;
import java.time.Instant;

public record ScrapperLink(ScrapperLinkID id, URI uri, Instant updatedAt) {}
