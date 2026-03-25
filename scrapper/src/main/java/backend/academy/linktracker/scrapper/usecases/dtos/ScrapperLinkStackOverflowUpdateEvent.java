package backend.academy.linktracker.scrapper.usecases.dtos;

public record ScrapperLinkStackOverflowUpdateEvent(String questionID, ScrapperLinkUpdateEventDescription description) {}
