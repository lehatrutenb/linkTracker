package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.EventIDEntity;
import backend.academy.linktracker.bot.adapter.entity.LinkUpdateEntity;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.entities.LinkUpdateID;
import backend.academy.linktracker.bot.core.port.ScrapperLinkUpdatesRepository;
import jakarta.transaction.Transactional;
import java.util.Collection;
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
    public Collection<LinkUpdate> readAllLinkUpdates() {
        return repository.findAll().stream().map(LinkUpdateEntity::toDomain).toList();
    }

    @Override
    public Optional<LinkUpdate> readLinkUpdate(EventID id) {
        return repository.readLinkUpdate(new EventIDEntity(id)).map(LinkUpdateEntity::toDomain);
    }

    @Override
    public Optional<LinkUpdate> readLinkUpdate(LinkUpdateID id) {
        return repository.findById(LinkUpdateEntity.getID(id)).map(LinkUpdateEntity::toDomain);
    }

    @Override
    public LinkUpdate createLinkUpdate(EventID eventID, LinkUpdate linkUpdate) {
        return repository.save(new LinkUpdateEntity(linkUpdate, eventID)).toDomain();
    }

    @Override
    @Transactional
    public LinkUpdate updateLinkUpdate(EventID eventID, LinkUpdate linkUpdate) {
        var addEntity = new LinkUpdateEntity(linkUpdate, eventID);
        var curEntity = repository.getReferenceById(LinkUpdateEntity.getID(linkUpdate.id()));
        addEntity.setVersion(curEntity.getVersion());
        return repository.save(addEntity).toDomain();
    }

    @Override
    public void deleteLinkUpdateByID(LinkUpdateID id) {
        repository.deleteById(LinkUpdateEntity.getID(id));
    }
}