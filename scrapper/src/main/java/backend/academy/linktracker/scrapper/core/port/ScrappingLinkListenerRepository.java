package backend.academy.linktracker.scrapper.core.port;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import java.util.Optional;

public interface ScrappingLinkListenerRepository {
    Optional<ScrapperLinkListener> readScrapperLinkListener(long id);

    void createScrapperLinkListener(ScrapperLinkListener scrapperLinkListener);

    ScrapperLinkListener updateScrapperLinkListener(ScrapperLinkListener scrapperLinkListener);

    void deleteScrapperLinkListenerByID(long id);
}
