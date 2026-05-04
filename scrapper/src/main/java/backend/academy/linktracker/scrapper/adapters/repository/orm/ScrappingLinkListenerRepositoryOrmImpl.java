package backend.academy.linktracker.scrapper.adapters.repository.orm;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkListenerEntity;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinkListenerRepository;
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
public class ScrappingLinkListenerRepositoryOrmImpl implements ScrappingLinkListenerRepository {
    private final ScrappingLinkListenerRepositoryOrmInner repository;

    @Override
    public Collection<ScrapperLinkListener> readAllScrapperLinkListeners() {
        return repository.findAll().stream().map(ScrapperLinkListenerEntity::toDomain).toList();
    }

    @Override
    public Optional<ScrapperLinkListener> readScrapperLinkListener(long id) {
        return repository.findById(id).map(ScrapperLinkListenerEntity::toDomain);
    }

    @Override
    public void createScrapperLinkListener(ScrapperLinkListener scrapperLinkListener) {
        repository.save(new ScrapperLinkListenerEntity(scrapperLinkListener));
    }

    @Override
    @Transactional
    public ScrapperLinkListener updateScrapperLinkListener(ScrapperLinkListener scrapperLinkListener) {
        var addEntity = new ScrapperLinkListenerEntity(scrapperLinkListener);
        var curEntity = repository.getReferenceById(addEntity.getId());
        addEntity.setVersion(curEntity.getVersion());
        repository.save(addEntity);
        return addEntity.toDomain();
    }

    @Override
    public void deleteScrapperLinkListenerByID(long id) {
        repository.deleteById(id);
    }
}
