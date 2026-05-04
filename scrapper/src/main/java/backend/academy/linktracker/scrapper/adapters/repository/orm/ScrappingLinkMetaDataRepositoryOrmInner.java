package backend.academy.linktracker.scrapper.adapters.repository.orm;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkMetaDataEntity;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkMetaDataEntity.ScrapperLinkMetaDataIDEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkEntity;
import org.springframework.data.jpa.repository.Query;
import java.util.List;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkListenerEntity;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkIDEntity;

@RefreshScope
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
@Repository
public interface ScrappingLinkMetaDataRepositoryOrmInner extends JpaRepository<ScrapperLinkMetaDataEntity, ScrapperLinkMetaDataIDEntity> {
    @Query("SELECT sl FROM ScrapperLinkEntity sl INNER JOIN ScrapperLinkMetaDataEntity lme ON sl.id = lme.id.linkID WHERE lme.id.listenerID = :scrapperLinkListenerID")
    public List<ScrapperLinkEntity> readAllListenningLinks(long scrapperLinkListenerID);

    @Query("SELECT ll FROM ScrapperLinkListenerEntity ll INNER JOIN ScrapperLinkMetaDataEntity lme ON ll.id = lme.id.listenerID WHERE lme.id.linkID = :linkID")
    public List<ScrapperLinkListenerEntity> readScrapperLinkListeners(ScrapperLinkIDEntity linkID);
}
