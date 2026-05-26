package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.entity.LinkUpdateID;
import backend.academy.linktracker.bot.core.entity.ScrapperLinkUpdate;
import java.util.Optional;

public interface ScrapperLinkUpdatesRepository {
    Optional<ScrapperLinkUpdate> readLinkUpdate(EventID id);

    Optional<ScrapperLinkUpdate> readLinkUpdate(LinkUpdateID id);

    ScrapperLinkUpdate createLinkUpdate(EventID eventID, ScrapperLinkUpdate linkUpdate);

    ScrapperLinkUpdate updateLinkUpdate(EventID eventID, ScrapperLinkUpdate linkUpdate);

    void deleteLinkUpdate(LinkUpdateID id);
}
