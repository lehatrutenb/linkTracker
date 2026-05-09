package backend.academy.linktracker.bot.adapter.repository.inmem;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.entities.LinkUpdateID;
import backend.academy.linktracker.bot.core.port.ScrapperLinkUpdatesRepository;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkUpdateRequest;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
// @ConditionalOnProperty(
//    name = "app.data.access-type",
//    havingValue = "IN_MEM",
//    matchIfMissing = true
// )
public class ScrapperLinkUpdatesRepositoryInMemImpl implements ScrapperLinkUpdatesRepository {
    private final Map<LinkUpdateID, LinkUpdate> linkUpdates = new HashMap<>();
    private final Map<EventID, LinkUpdate> linkUpdatesByEventID = new HashMap<>();

    @Override
    public Optional<LinkUpdate> getLinkUpdate(EventID id) {
        return Optional.ofNullable(linkUpdatesByEventID.get(id));
    }

    @Override
    public Optional<LinkUpdate> getLinkUpdate(LinkUpdateID id) {
        return Optional.ofNullable(linkUpdates.get(id));
    }

    @Override
    public void addLinkUpdate(EventID eventID, LinkUpdate linkUpdate) {
        linkUpdates.put(linkUpdate.id(), linkUpdate);
        linkUpdatesByEventID.put(eventID, linkUpdate);
    }
}
