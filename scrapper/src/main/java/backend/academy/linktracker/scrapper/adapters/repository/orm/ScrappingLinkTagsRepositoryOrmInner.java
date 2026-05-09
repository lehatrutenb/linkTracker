package backend.academy.linktracker.scrapper.adapters.repository.orm;

import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkMetaDataEntity.TagEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@RefreshScope
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
@Repository
public interface ScrappingLinkTagsRepositoryOrmInner extends JpaRepository<TagEntity, String> {}
