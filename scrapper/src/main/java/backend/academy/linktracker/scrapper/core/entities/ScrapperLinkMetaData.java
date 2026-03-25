package backend.academy.linktracker.scrapper.core.entities;

import java.util.List;

public record ScrapperLinkMetaData(ScrapperLinkMetaDataID id, List<String> tags, List<String> filters) {}
