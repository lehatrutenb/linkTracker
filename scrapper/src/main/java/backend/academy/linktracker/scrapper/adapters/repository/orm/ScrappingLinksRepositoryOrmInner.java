package backend.academy.linktracker.scrapper.adapters.repository.orm;

import org.springframework.data.jpa.repository.JpaRepository;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkEntity;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkIDEntity;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@RefreshScope
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
@Repository
public interface ScrappingLinksRepositoryOrmInner extends JpaRepository<ScrapperLinkEntity, ScrapperLinkIDEntity> {
    Optional<ScrapperLinkEntity> findById_linkURI(String uri);
}
