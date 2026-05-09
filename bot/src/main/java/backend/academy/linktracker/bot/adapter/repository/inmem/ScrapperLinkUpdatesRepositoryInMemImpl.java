package backend.academy.linktracker.bot.adapter.repository.inmem;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.entities.LinkUpdateID;
import backend.academy.linktracker.bot.core.port.ScrapperLinkUpdatesRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
public class ScrapperLinkUpdatesRepositoryInMemImpl implements ScrapperLinkUpdatesRepository {
    private final Map<LinkUpdateID, LinkUpdate> linkUpdates = new HashMap<>();
    private final Map<EventID, LinkUpdate> linkUpdatesByEventID = new HashMap<>();
    private final Map<LinkUpdateID, EventID> eventIDByLinkUpdateID = new HashMap<>();

    @Override
    public Optional<LinkUpdate> readLinkUpdate(EventID id) {
        return Optional.ofNullable(linkUpdatesByEventID.get(id));
    }

    @Override
    public Optional<LinkUpdate> readLinkUpdate(LinkUpdateID id) {
        return Optional.ofNullable(linkUpdates.get(id));
    }

    @Override
    public LinkUpdate createLinkUpdate(EventID eventID, LinkUpdate linkUpdate) {
        linkUpdates.put(linkUpdate.id(), linkUpdate);
        linkUpdatesByEventID.put(eventID, linkUpdate);
        eventIDByLinkUpdateID.put(linkUpdate.id(), eventID);
        return linkUpdate;
    }

    @Override
    public LinkUpdate updateLinkUpdate(EventID eventID, LinkUpdate linkUpdate) {
        linkUpdates.put(linkUpdate.id(), linkUpdate);
        linkUpdatesByEventID.put(eventID, linkUpdate);
        eventIDByLinkUpdateID.put(linkUpdate.id(), eventID);
        return linkUpdate;
    }

    @Override
    public void deleteLinkUpdate(LinkUpdateID id) {
        linkUpdates.remove(id);
        var eventID = eventIDByLinkUpdateID.remove(id);
        if (eventID != null) {
            linkUpdatesByEventID.remove(eventID);
        }
    }
}
