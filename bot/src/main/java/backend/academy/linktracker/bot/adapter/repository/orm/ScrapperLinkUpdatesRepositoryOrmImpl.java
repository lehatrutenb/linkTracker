package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.EventIDEntity;
import backend.academy.linktracker.bot.adapter.entity.LinkUpdateEntity;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.entities.LinkUpdateID;
import backend.academy.linktracker.bot.core.port.ScrapperLinkUpdatesRepository;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
@RequiredArgsConstructor
public class ScrapperLinkUpdatesRepositoryOrmImpl implements ScrapperLinkUpdatesRepository {
    private final ScrapperLinkUpdatesRepositoryOrmInner repository;

    @Override
    public Optional<LinkUpdate> getLinkUpdate(EventID id) {
        return repository.getLinkUpdate(new EventIDEntity(id)).map(LinkUpdateEntity::toDomain);
    }

    @Override
    public Optional<LinkUpdate> getLinkUpdate(LinkUpdateID id) {
        return repository.findById(LinkUpdateEntity.getID(id)).map(LinkUpdateEntity::toDomain);
    }

    @Override
    public void addLinkUpdate(EventID eventID, LinkUpdate linkUpdate) {
        repository.save(new LinkUpdateEntity(linkUpdate, eventID));
    }
}
