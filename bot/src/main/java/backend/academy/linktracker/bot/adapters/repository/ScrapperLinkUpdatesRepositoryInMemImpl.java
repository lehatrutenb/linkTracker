package backend.academy.linktracker.bot.adapters.repository;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.usecases.dtos.LinkUpdate;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
public class ScrapperLinkUpdatesRepositoryInMemImpl implements ScrapperLinkUpdatesRepository {
    private final Map<EventID, LinkUpdate> linkUpdates = new HashMap<>();

    @Override
    public Optional<LinkUpdate> getLinkUpdate(EventID id) {
        return Optional.ofNullable(linkUpdates.get(id));
    }

    @Override
    public void setLinkUpdate(EventID id, LinkUpdate linkUpdate) {
        linkUpdates.put(id, linkUpdate);
    }
}
