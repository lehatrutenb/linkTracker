package backend.academy.linktracker.scrapper.core.port;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import java.net.URI;
import java.util.Collection;
import java.util.Optional;

public interface ScrappingLinksRepository {
    Collection<ScrapperLink> readAllScrapperLinks();
    Optional<ScrapperLink> readScrapperLinkByURI(URI uri);
    Optional<ScrapperLink> readScrapperLinkByID(ScrapperLinkID id);
    Optional<ScrapperLinkID> readScrapperLinkIDByURI(URI uri);
    ScrapperLink createScrapperLink(ScrapperLink scrapperLink);
    ScrapperLink updateScrapperLink(ScrapperLink scrapperLink);
    void deleteScrapperLink(ScrapperLinkID scrapperLinkID);
}
