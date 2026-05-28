package backend.academy.linktracker.scrapper.adapter.repository.orm;

import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkEntity;
import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkIDEntity;
import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkListenerEntity;
import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkMetaDataEntity;
import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkMetaDataEntity.ScrapperLinkMetaDataIDEntity;
import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkMetaDataEntity.TagEntity;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaData;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinkMetaDataRepository;
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
public class ScrappingLinkMetaDataRepositoryOrmImpl implements ScrappingLinkMetaDataRepository {
    private final ScrappingLinkMetaDataRepositoryOrmInner repository;
    private final ScrappingLinkTagsRepositoryOrmInner tagsRepository;

    @Override
    public Optional<ScrapperLinkMetaData> readLinkMetaData(ScrapperLinkMetaDataID metaDataID) {
        return repository
                .findById(new ScrapperLinkMetaDataIDEntity(metaDataID))
                .map(ScrapperLinkMetaDataEntity::toDomain);
    }

    @Override
    public void createLinkMetaData(ScrapperLinkMetaData metaData) {
        var entity = new ScrapperLinkMetaDataEntity(metaData);
        entity.getTags().forEach(tag -> {
            tagsRepository.save(new TagEntity(tag.getName()));
        });
        repository.save(entity);
    }

    @Override
    @Transactional
    public ScrapperLinkMetaData updateLinkMetaData(ScrapperLinkMetaData metaData) {
        ScrapperLinkMetaDataEntity addEntity = new ScrapperLinkMetaDataEntity(metaData);
        repository.save(addEntity);
        return addEntity.toDomain();
    }

    @Override
    public void deleteLinkMetaData(ScrapperLinkMetaDataID linkMetaDataID) {
        repository.deleteById(new ScrapperLinkMetaDataIDEntity(linkMetaDataID));
    }

    @Override
    public Collection<ScrapperLink> readAllListenningLinks(long scrapperLinkListenerID) {
        return repository.readAllListenningLinks(scrapperLinkListenerID).stream()
                .map(ScrapperLinkEntity::toDomain)
                .toList();
    }

    @Override
    public Collection<ScrapperLinkListener> readScrapperLinkListeners(ScrapperLinkID linkID) {
        return repository.readScrapperLinkListeners(new ScrapperLinkIDEntity(linkID)).stream()
                .map(ScrapperLinkListenerEntity::toDomain)
                .toList();
    }
}
