package backend.academy.linktracker.scrapper.usecase.wrapper;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.usecase.dto.ScrapperLinkUpdateEvent;
import java.net.URI;
import java.time.Instant;
import java.util.Collection;
import org.apache.commons.lang3.tuple.Pair;

public interface OuterServiceScrapper {
    Pair<Collection<ScrapperLinkUpdateEvent>, Instant> scrap(URI uri, Instant since);

    boolean checkCanScrap(ScrapperLink link);
}
