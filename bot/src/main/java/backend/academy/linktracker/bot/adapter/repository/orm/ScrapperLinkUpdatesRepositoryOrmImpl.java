package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.EventIDEntity;
import backend.academy.linktracker.bot.adapter.entity.LinkUpdateEntity;
import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.entity.LinkUpdateID;
import backend.academy.linktracker.bot.core.entity.ScrapperLinkUpdate;
import backend.academy.linktracker.bot.core.port.ScrapperLinkUpdatesRepository;
import jakarta.transaction.Transactional;
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
    public Optional<ScrapperLinkUpdate> readLinkUpdate(EventID id) {
        return repository.readLinkUpdate(new EventIDEntity(id)).map(LinkUpdateEntity::toDomain);
    }

    @Override
    public Optional<ScrapperLinkUpdate> readLinkUpdate(LinkUpdateID id) {
        return repository.findById(LinkUpdateEntity.getID(id)).map(LinkUpdateEntity::toDomain);
    }

    @Override
    public ScrapperLinkUpdate createLinkUpdate(EventID eventID, ScrapperLinkUpdate linkUpdate) {
        return repository.save(new LinkUpdateEntity(linkUpdate, eventID)).toDomain();
    }

    @Override
    @Transactional
    public ScrapperLinkUpdate updateLinkUpdate(EventID eventID, ScrapperLinkUpdate linkUpdate) {
        return repository.save(new LinkUpdateEntity(linkUpdate, eventID)).toDomain();
    }

    @Override
    public void deleteLinkUpdate(LinkUpdateID id) {
        repository.deleteById(LinkUpdateEntity.getID(id));
    }
}
