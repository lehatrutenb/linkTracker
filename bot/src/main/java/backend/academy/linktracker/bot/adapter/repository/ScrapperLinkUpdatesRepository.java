package backend.academy.linktracker.bot.adapter.repository;

import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.usecase.dto.generated.LinkUpdate;
import java.util.Optional;

public interface ScrapperLinkUpdatesRepository {
    Optional<LinkUpdate> getLinkUpdate(EventID id);

    void setLinkUpdate(EventID id, LinkUpdate linkUpdate);
}
