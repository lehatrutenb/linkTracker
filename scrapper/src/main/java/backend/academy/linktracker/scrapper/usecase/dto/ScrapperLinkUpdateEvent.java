package backend.academy.linktracker.scrapper.usecase.dto;

import java.net.URI;

public record ScrapperLinkUpdateEvent(URI uri, ScrapperLinkUpdateEventDescription description) {}
