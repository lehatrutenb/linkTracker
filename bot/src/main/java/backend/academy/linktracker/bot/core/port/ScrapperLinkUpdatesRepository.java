package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.entities.LinkUpdateID;
import java.util.Collection;
import java.util.Optional;

public interface ScrapperLinkUpdatesRepository {
    Collection<LinkUpdate> readAllLinkUpdates();
    Optional<LinkUpdate> readLinkUpdate(EventID id);
    Optional<LinkUpdate> readLinkUpdate(LinkUpdateID id);
    LinkUpdate createLinkUpdate(EventID eventID, LinkUpdate linkUpdate);
    LinkUpdate updateLinkUpdate(EventID eventID, LinkUpdate linkUpdate);
    void deleteLinkUpdateByID(LinkUpdateID id);
}