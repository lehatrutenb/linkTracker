package backend.academy.linktracker.scrapper.usecase.dto;

import java.time.Instant;

public record ScrapperLinkStackOverflowUpdateEvent(
        String questionID, ScrapperLinkUpdateEventDescription description, Instant lastActivityDate) {}
