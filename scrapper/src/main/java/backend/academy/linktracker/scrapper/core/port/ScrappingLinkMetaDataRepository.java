package backend.academy.linktracker.scrapper.core.port;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaData;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import java.util.Collection;
import java.util.Optional;

public interface ScrappingLinkMetaDataRepository {
    Optional<ScrapperLinkMetaData> readLinkMetaData(ScrapperLinkMetaDataID metaDataID);
    void createLinkMetaData(ScrapperLinkMetaData metaData);
    ScrapperLinkMetaData updateLinkMetaData(ScrapperLinkMetaData metaData);
    void deleteLinkMetaData(ScrapperLinkMetaDataID linkMetaDataID);
    Collection<ScrapperLink> readAllListenningLinks(long scrapperLinkListenerID);
    Collection<ScrapperLinkListener> readScrapperLinkListeners(ScrapperLinkID linkID);
}
