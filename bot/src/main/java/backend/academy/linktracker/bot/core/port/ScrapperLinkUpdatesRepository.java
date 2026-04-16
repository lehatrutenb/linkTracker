package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkUpdate;
import java.util.Optional;

public interface ScrapperLinkUpdatesRepository {
    Optional<LinkUpdate> getLinkUpdate(EventID id);

    void setLinkUpdate(EventID id, LinkUpdate linkUpdate);
}
