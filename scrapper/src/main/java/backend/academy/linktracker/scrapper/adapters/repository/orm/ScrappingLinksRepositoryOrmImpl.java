package backend.academy.linktracker.scrapper.adapters.repository.orm;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinksRepository;
import jakarta.transaction.Transactional;

import java.net.URI;
import java.sql.SQLException;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkEntity;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkIDEntity;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
@RequiredArgsConstructor
public class ScrappingLinksRepositoryOrmImpl implements ScrappingLinksRepository {
    private final ScrappingLinksRepositoryOrmInner repository;

    @Override
    public Collection<ScrapperLink> readAllScrapperLinks() {
        return repository.findAll().stream()
            .map(ScrapperLinkEntity::toDomain)
            .toList();
    }

    @Override
    public Optional<ScrapperLink> readScrapperLinkByURI(URI uri) {
        return repository.findById_linkURI(uri.toString()).map(ScrapperLinkEntity::toDomain);
    }

    @Override
    public Optional<ScrapperLink> readScrapperLinkByID(ScrapperLinkID id) {
        return repository.findById(new ScrapperLinkIDEntity(id))
            .map(ScrapperLinkEntity::toDomain);
    }

    @Override
    public Optional<ScrapperLinkID> readScrapperLinkIDByURI(URI uri) {
        return repository.findById_linkURI(uri.toString()).map(ScrapperLinkEntity::toDomain).map(ScrapperLink::getId);
    }

    @Override
    public ScrapperLink createScrapperLink(ScrapperLink scrapperLink) throws SQLException {
        return repository.save(new ScrapperLinkEntity(scrapperLink)).toDomain();
    }

    @Override
    @Transactional
    public ScrapperLink updateScrapperLink(ScrapperLink scrapperLink) {
        ScrapperLinkEntity curEntity = repository.getReferenceById(new ScrapperLinkIDEntity(scrapperLink.getId()));
        ScrapperLinkEntity addEntity = new ScrapperLinkEntity(scrapperLink);
        addEntity.setVersion(curEntity.getVersion());
        repository.save(addEntity);
        return addEntity.toDomain();
    }

    @Override
    public void deleteScrapperLink(ScrapperLinkID scrapperLinkID) {
        repository.deleteById(new ScrapperLinkIDEntity(scrapperLinkID));
    }
}
