package backend.academy.linktracker.bot.adapter.repository.selfmanaged;

import backend.academy.linktracker.bot.adapter.entity.BotChatEntity;
import backend.academy.linktracker.bot.adapter.entity.EventIDEntity;
import backend.academy.linktracker.bot.adapter.entity.LinkUpdateEntity;
import backend.academy.linktracker.bot.adapter.rowmapper.LinkUpdateEntityRowMapper;
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
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@RefreshScope
@Repository
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "SQL")
@Primary
@RequiredArgsConstructor
public class ScrapperLinkUpdatesRepositorySelfManagedImpl implements ScrapperLinkUpdatesRepository {
    private final JdbcClient client;

    @Override
    public Optional<ScrapperLinkUpdate> readLinkUpdate(EventID id) {
        return client
                .sql("""
                SELECT *
                FROM link_update lu
                LEFT JOIN link_update_bot_chats_mapping m ON lu.id = m.link_update_id
                INNER JOIN bot_chat bc ON m.bot_chat_id = bc.id
                WHERE lu.event_id = :event_id AND lu.event_owner_id_type = :event_owner_id_type
                """)
                .param("event_id", EventIDEntity.getID(id))
                .param("event_owner_id_type", id.getOwnerIDType().toString())
                .query(new LinkUpdateEntityRowMapper())
                .stream()
                .findFirst()
                .map(LinkUpdateEntity::toDomain);
    }

    @Override
    public Optional<ScrapperLinkUpdate> readLinkUpdate(LinkUpdateID id) {
        return client.sql("""
                SELECT *
                FROM link_update lu
                LEFT JOIN link_update_bot_chats_mapping m ON lu.id = m.link_update_id
                INNER JOIN bot_chat bc ON m.bot_chat_id = bc.id
                WHERE lu.id = :id
                """).param("id", LinkUpdateEntity.getID(id)).query(new LinkUpdateEntityRowMapper()).stream()
                .findFirst()
                .map(LinkUpdateEntity::toDomain);
    }

    @Override
    @Transactional
    public ScrapperLinkUpdate createLinkUpdate(EventID eventID, ScrapperLinkUpdate linkUpdate) {
        var entity = new LinkUpdateEntity(linkUpdate, eventID);
        client.sql("""
            INSERT INTO link_update
                (id,event_id,event_owner_id_type,url,description)
            VALUES
                (:id,:event_id,:event_owner_id_type,:url,:description)
            """)
                .param("id", entity.getId())
                .param("event_id", EventIDEntity.getID(eventID))
                .param("event_owner_id_type", eventID.getOwnerIDType().toString())
                .param("url", entity.getUrl())
                .param("description", entity.getDescription())
                .update();

        linkUpdate.botChatIDS().forEach(botChatID -> client.sql("""
            INSERT INTO link_update_bot_chats_mapping
                (link_update_id,bot_chat_id)
            VALUES (:link_update_id,:bot_chat_id)
                ON CONFLICT (link_update_id,bot_chat_id) DO NOTHING
            """)
                .param("link_update_id", entity.getId())
                .param("bot_chat_id", BotChatEntity.getID(botChatID))
                .update());
        return readLinkUpdate(eventID).orElseThrow();
    }

    @Override
    @Transactional
    public ScrapperLinkUpdate updateLinkUpdate(EventID eventID, ScrapperLinkUpdate linkUpdate) {
        var entity = new LinkUpdateEntity(linkUpdate, eventID);
        var updatedEntity = client
                .sql("""
            WITH updated AS (
                UPDATE link_update
                SET event_id = :event_id, event_owner_id_type = :event_owner_id_type, url = :url, description = :description
                WHERE id = :id
                RETURNING *
            )
            SELECT * FROM updated
            LEFT JOIN link_update_bot_chats_mapping m ON updated.id = m.link_update_id
            INNER JOIN bot_chat bc ON m.bot_chat_id = bc.id
            """)
                .param("id", entity.getId())
                .param("event_id", EventIDEntity.getID(eventID))
                .param("event_owner_id_type", eventID.getOwnerIDType().toString())
                .param("url", entity.getUrl())
                .param("description", entity.getDescription())
                .query(new LinkUpdateEntityRowMapper())
                .stream()
                .findFirst()
                .map(LinkUpdateEntity::toDomain)
                .orElseThrow();

        client.sql("DELETE FROM link_update_bot_chats_mapping WHERE link_update_id = :link_update_id")
                .param("link_update_id", entity.getId())
                .update();
        linkUpdate.botChatIDS().forEach(botChatID -> client.sql(
                        "INSERT INTO link_update_bot_chats_mapping (link_update_id,bot_chat_id) VALUES (:link_update_id,:bot_chat_id)")
                .param("link_update_id", entity.getId())
                .param("bot_chat_id", BotChatEntity.getID(botChatID))
                .update());
        return updatedEntity;
    }

    @Override
    public void deleteLinkUpdate(LinkUpdateID id) {
        client.sql("DELETE FROM link_update WHERE id = :id")
                .param("id", LinkUpdateEntity.getID(id))
                .update();
    }
}
