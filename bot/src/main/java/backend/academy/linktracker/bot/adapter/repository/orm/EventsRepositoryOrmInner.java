package backend.academy.linktracker.bot.adapter.repository.orm;

import backend.academy.linktracker.bot.adapter.entity.EventEntity;
import backend.academy.linktracker.bot.adapter.entity.EventIDEntity;
import backend.academy.linktracker.bot.core.enums.EventState;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import java.time.Instant;
import java.util.List;
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
public interface EventsRepositoryOrmInner extends JpaRepository<EventEntity, EventIDEntity> {
    Optional<EventEntity> findByEventIDOwnerIDTypeAndStateNotOrderByIdAsc(OwnerIDType ownerIDType, EventState notState);

    @Query("""
            SELECT e FROM EventEntity e\s
            WHERE e.eventID.ownerIDType = :ownerIDType\s
              AND e.state = :state
              AND NOT EXISTS (
                  SELECT 1 FROM EventEntity e2\s
                  WHERE e2.eventID.ownerIDType = :ownerIDType\s
                    AND e2.state <> :state\s
                    AND e2.eventID.id < e.eventID.id
              )
            ORDER BY e.eventID.id DESC
           """)
    List<EventEntity> getNumericLastOfPrefixOfDoneByOwnerIdTypeAndState(
            @Param("ownerIDType") OwnerIDType ownerIDType, @Param("state") EventState state);

    List<EventEntity> findAllByEventIDOwnerIDTypeAndStateAndUpdatedAtLessThan(
            OwnerIDType ownerIDType, EventState state, Instant updatedAt);
}
