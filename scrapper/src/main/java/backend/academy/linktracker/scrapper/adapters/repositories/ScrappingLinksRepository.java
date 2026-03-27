package backend.academy.linktracker.scrapper.adapters.repositories;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import java.net.URI;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Optional;

public interface ScrappingLinksRepository {
    Collection<ScrapperLink> getAllScrapperLinks();

    Collection<ScrapperLink> getAllScrapperLinks(ScrapperLinkListener scrapperLinkListener);

    Collection<ScrapperLinkListener> getScrapperLinkListeners(ScrapperLinkID scrapperLink);

    Optional<ScrapperLink> getScrapperLinkByURI(URI uri);

    Optional<ScrapperLinkID> getScrapperLinkIDByURI(URI uri);

    Optional<ScrapperLinkListener> getScrapperLinkListener(String id);

    void addScrapperLink(ScrapperLink scrapperLink) throws SQLException;

    Optional<ScrapperLink> updateScrapperLink(ScrapperLink scrapperLink);

    void addScrapperLinkListener(ScrapperLinkListener scrapperLinkListener);

    void addLinkToScrapperLinkListener(ScrapperLinkListener scrapperLinkListener, ScrapperLinkID scrapperLink);

    void deleteScrapperLink(ScrapperLinkID scrapperLinkID);

    void deleteScrapperLinkListener(ScrapperLinkListener scrapperLinkListener);

    void deleteScrapperLinkListenerLink(ScrapperLinkListener scrapperLinkListener, ScrapperLinkID scrapperLink);
}
