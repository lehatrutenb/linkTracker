package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.EventIDEntity;
import backend.academy.linktracker.bot.adapter.entity.LinkUpdateEntity;
import java.util.Optional;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@RefreshScope
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "ORM")
@Primary
@Repository
public interface ScrapperLinkUpdatesRepositoryOrmInner extends JpaRepository<LinkUpdateEntity, Long> {
    @Query("""
        SELECT lu
        FROM LinkUpdateEntity lu
        WHERE lu.eventID.id = :#{#id.id} AND lu.eventID.ownerIDType = :#{#id.ownerIDType}
        """)
    Optional<LinkUpdateEntity> readLinkUpdate(@Param("id") EventIDEntity id);
}
