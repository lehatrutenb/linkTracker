package backend.academy.linktracker.bot.core.port;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.entities.LinkUpdateID;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkUpdateRequest;
import java.util.Optional;

public interface ScrapperLinkUpdatesRepository {
    Optional<LinkUpdate> getLinkUpdate(EventID id);
    Optional<LinkUpdate> getLinkUpdate(LinkUpdateID id);

    void addLinkUpdate(EventID eventID, LinkUpdate linkUpdate);
}
