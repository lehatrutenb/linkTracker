package backend.academy.linktracker.scrapper.usecase.dto;

public record ScrapperLinkStackOverflowUpdateEvent(String questionID, ScrapperLinkUpdateEventDescription description) {}
