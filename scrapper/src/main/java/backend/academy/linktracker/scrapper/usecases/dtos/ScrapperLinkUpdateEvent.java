package backend.academy.linktracker.scrapper.usecases.dtos;

import java.net.URI;

public record ScrapperLinkUpdateEvent(URI uri, ScrapperLinkUpdateEventDescription description) {}
