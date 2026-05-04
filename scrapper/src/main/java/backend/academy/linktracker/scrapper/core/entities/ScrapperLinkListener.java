package backend.academy.linktracker.scrapper.core.entities;

import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;

public record ScrapperLinkListener(long listenerID, ScrapperLinkListenerType listenerType) {}
