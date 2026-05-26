package backend.academy.linktracker.bot.adapter.repository.inmem;

import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.entity.LinkUpdateID;
import backend.academy.linktracker.bot.core.entity.ScrapperLinkUpdate;
import backend.academy.linktracker.bot.core.port.ScrapperLinkUpdatesRepository;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "IN_MEM")
public class ScrapperLinkUpdatesRepositoryInMemImpl implements ScrapperLinkUpdatesRepository {
    private final Map<LinkUpdateID, ScrapperLinkUpdate> linkUpdates = new HashMap<>();
    private final Map<EventID, ScrapperLinkUpdate> linkUpdatesByEventID = new HashMap<>();
    private final Map<LinkUpdateID, EventID> eventIDByLinkUpdateID = new HashMap<>();

    @Override
    public Optional<ScrapperLinkUpdate> readLinkUpdate(EventID id) {
        return Optional.ofNullable(linkUpdatesByEventID.get(id));
    }

    @Override
    public Optional<ScrapperLinkUpdate> readLinkUpdate(LinkUpdateID id) {
        return Optional.ofNullable(linkUpdates.get(id));
    }

    @Override
    public ScrapperLinkUpdate createLinkUpdate(EventID eventID, ScrapperLinkUpdate linkUpdate) {
        linkUpdates.put(linkUpdate.id(), linkUpdate);
        linkUpdatesByEventID.put(eventID, linkUpdate);
        eventIDByLinkUpdateID.put(linkUpdate.id(), eventID);
        return linkUpdate;
    }

    @Override
    public ScrapperLinkUpdate updateLinkUpdate(EventID eventID, ScrapperLinkUpdate linkUpdate) {
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
