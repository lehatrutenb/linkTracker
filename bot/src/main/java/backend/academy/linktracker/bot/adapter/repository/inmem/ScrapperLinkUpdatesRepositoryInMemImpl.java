package backend.academy.linktracker.bot.adapter.repository.inmem;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.port.ScrapperLinkUpdatesRepository;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkUpdate;
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
