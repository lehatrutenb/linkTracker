package backend.academy.linktracker.scrapper.adapter.repository;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaData;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import java.util.Optional;

public interface ScrappingLinkMetaDataRepository {
    Optional<ScrapperLinkMetaData> getLinkMetaData(ScrapperLinkMetaDataID metaDataID);

    void addLinkMetaData(ScrapperLinkMetaData metaData);

    void updateLinkMetaData(ScrapperLinkMetaData metaData);
}
