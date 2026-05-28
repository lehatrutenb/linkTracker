package backend.academy.linktracker.scrapper.adapter.repository.selfmanaged;

import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkEntity;
import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkListenerEntity;
import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkMetaDataEntity;
import backend.academy.linktracker.scrapper.adapter.entity.ScrapperLinkMetaDataEntity.ScrapperLinkMetaDataIDEntity;
import backend.academy.linktracker.scrapper.adapter.rowmapper.ScrapperLinkEntityRowMapper;
import backend.academy.linktracker.scrapper.adapter.rowmapper.ScrapperLinkMetaDataEntityRowMapper;
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
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;

@RequiredArgsConstructor
@Repository
@RefreshScope
@Primary
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "SQL")
public class ScrappingMetaDataRepositorySelfManagedImpl implements ScrappingLinkMetaDataRepository {
    private final JdbcClient client;

    @Override
    public Optional<ScrapperLinkMetaData> readLinkMetaData(ScrapperLinkMetaDataID metaDataID) {
        ScrapperLinkMetaDataIDEntity id = new ScrapperLinkMetaDataIDEntity(metaDataID);
        var res = client
                .sql("""
            SELECT lm.*, lmtm.tag_name
            FROM link_metadata lm
            LEFT JOIN link_metadata_tags_mapping lmtm ON lm.link_id = lmtm.link_id AND lm.listener_id = lmtm.listener_id
            WHERE lm.link_id = :link_id AND lm.listener_id = :listener_id
            """) // Left join cause we may not have tags, but still have mapping link<->listener
                .param("link_id", id.getLinkID().getLinkID())
                .param("listener_id", id.getListenerID())
                .query(new ScrapperLinkMetaDataEntityRowMapper())
                .stream()
                .findFirst()
                .map(ScrapperLinkMetaDataEntity::toDomain);

        return res;
    }

    @Override
    @Transactional
    public void createLinkMetaData(ScrapperLinkMetaData metaData) {
        var entity = new ScrapperLinkMetaDataEntity(metaData);
        client.sql(
                        "INSERT INTO link_metadata (link_id, listener_id, link_uri) VALUES (:link_id, :listener_id, :link_uri)")
                .param("link_id", entity.getId().getLinkID().getLinkID())
                .param("listener_id", entity.getId().getListenerID())
                .param("link_uri", entity.getId().getLinkID().getLinkURI())
                .update();

        for (var tag : entity.getTags()) {
            client.sql("INSERT INTO link_tag(name) VALUES (:tag) ON CONFLICT (name) DO NOTHING")
                    .param("tag", tag.getName())
                    .update();

            client.sql(
                            "INSERT INTO link_metadata_tags_mapping(link_id, link_uri, listener_id, tag_name) VALUES (:link_id, :link_uri, :listener_id, :tag)")
                    .param("link_id", entity.getId().getLinkID().getLinkID())
                    .param("link_uri", entity.getId().getLinkID().getLinkURI())
                    .param("listener_id", entity.getId().getListenerID())
                    .param("tag", tag.getName())
                    .update();
        }
    }

    @Override
    @Transactional
    public ScrapperLinkMetaData updateLinkMetaData(ScrapperLinkMetaData metaData) {
        var entity = new ScrapperLinkMetaDataEntity(metaData);
        client.sql(
                        "UPDATE link_metadata SET link_uri = :link_uri WHERE link_id = :link_id AND listener_id = :listener_id RETURNING *")
                .param("link_id", entity.getId().getLinkID().getLinkID())
                .param("listener_id", entity.getId().getListenerID())
                .param("link_uri", entity.getId().getLinkID().getLinkURI())
                .update();

        client.sql("DELETE FROM link_metadata_tags_mapping WHERE link_id = :link_id AND listener_id = :listener_id")
                .param("link_id", entity.getId().getLinkID().getLinkID())
                .param("listener_id", entity.getId().getListenerID())
                .update();

        for (var tag : entity.getTags()) {
            client.sql("INSERT INTO link_tag(name) VALUES (:tag) ON CONFLICT (name) DO NOTHING")
                    .param("tag", tag.getName())
                    .update();

            client.sql(
                            "INSERT INTO link_metadata_tags_mapping(link_id, link_uri, listener_id, tag_name) VALUES (:link_id, :link_uri, :listener_id, :tag) RETURNING *")
                    .param("link_id", entity.getId().getLinkID().getLinkID())
                    .param("link_uri", entity.getId().getLinkID().getLinkURI())
                    .param("listener_id", entity.getId().getListenerID())
                    .param("tag", tag.getName())
                    .update();
        }
        return readLinkMetaData(metaData.id()).orElseThrow();
    }

    @Override
    public void deleteLinkMetaData(ScrapperLinkMetaDataID linkMetaDataID) {
        ScrapperLinkMetaDataIDEntity id = new ScrapperLinkMetaDataIDEntity(linkMetaDataID);
        client.sql("DELETE FROM link_metadata WHERE link_id = :link_id AND listener_id = :listener_id")
                .param("link_id", id.getLinkID().getLinkID())
                .param("listener_id", id.getListenerID())
                .update();
    }

    @Override
    public Collection<ScrapperLink> readAllListenningLinks(long scrapperLinkListenerID) {
        return client
                .sql("""
                SELECT sl.*
                FROM scrapper_link sl
                INNER JOIN link_metadata lm ON sl.link_id = lm.link_id
                WHERE lm.listener_id = :listener_id
                """)
                .param("listener_id", scrapperLinkListenerID)
                .query(new ScrapperLinkEntityRowMapper())
                .stream()
                .map(ScrapperLinkEntity::toDomain)
                .toList();
    }

    @Override
    public Collection<ScrapperLinkListener> readScrapperLinkListeners(ScrapperLinkID linkID) {
        return client
                .sql("""
                SELECT ll.*
                FROM link_listener ll
                INNER JOIN link_metadata lm ON ll.id = lm.listener_id
                WHERE lm.link_id = :link_id
                """)
                .param("link_id", linkID.id().orElseThrow())
                .query(ScrapperLinkListenerEntity.class)
                .stream()
                .map(ScrapperLinkListenerEntity::toDomain)
                .toList();
    }
}
