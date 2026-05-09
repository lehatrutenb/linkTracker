package backend.academy.linktracker.scrapper.adapters.repository.selfmanaged;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinksRepository;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkEntity;
import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkIDEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import java.net.URI;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Collection;
import java.util.Optional;
import java.util.stream.Collectors;
import backend.academy.linktracker.scrapper.adapters.rowmapper.ScrapperLinkEntityRowMapper;

@RefreshScope
@Repository
@Primary
@RequiredArgsConstructor
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "SQL")
public class ScrappingLinksRepositorySelfManagedImpl implements ScrappingLinksRepository {
    private final JdbcClient client;

    @Override
    public Collection<ScrapperLink> readAllScrapperLinks() {
        return client.sql("SELECT * FROM scrapper_link")
            .query(new ScrapperLinkEntityRowMapper())
            .list()
            .stream()
            .map(ScrapperLinkEntity::toDomain)
            .collect(Collectors.toList());
    }

    @Override
    public Optional<ScrapperLink> readScrapperLinkByURI(URI uri) {
        return client.sql("SELECT * FROM scrapper_link WHERE link_uri = :link_uri")   
            .param("link_uri", uri.toString())
            .query(new ScrapperLinkEntityRowMapper())
            .optional()
            .map(ScrapperLinkEntity::toDomain);
    }

    @Override
    public Optional<ScrapperLink> readScrapperLinkByID(ScrapperLinkID id) {
        return client.sql("SELECT * FROM scrapper_link WHERE link_id = :link_id")
            .param("link_id", id.id().orElseThrow())
            .query(new ScrapperLinkEntityRowMapper())
            .optional()
            .map(ScrapperLinkEntity::toDomain);
    }

    @Override
    public Optional<ScrapperLinkID> readScrapperLinkIDByURI(URI uri) {
        return client.sql("SELECT * FROM scrapper_link WHERE link_uri = :link_uri")
            .param("link_uri", uri.toString())
            .query(new ScrapperLinkEntityRowMapper())
            .optional()
            .map(ScrapperLinkEntity::toDomain)
            .map(ScrapperLink::getId);
    }

    @Override
    public ScrapperLink createScrapperLink(ScrapperLink scrapperLink) {
        var entity = new ScrapperLinkEntity(scrapperLink);
        return client.sql("INSERT INTO scrapper_link (link_id, link_uri, updated_at) VALUES (nextval('link_id_seq'), :link_uri, :updated_at) RETURNING *")
            .param("link_uri", entity.getId().getLinkURI())
            .param("updated_at", Timestamp.from(scrapperLink.getUpdatedAt()))
            .query(new ScrapperLinkEntityRowMapper())
            .single()
            .toDomain();
    }

    @Override
    public ScrapperLink updateScrapperLink(ScrapperLink scrapperLink) {
        var entity = new ScrapperLinkEntity(scrapperLink);
        return client.sql("UPDATE scrapper_link SET link_uri = :link_uri, updated_at = :updated_at WHERE link_id = :link_id RETURNING *")
            .param("link_id", entity.getId().getLinkID())
            .param("link_uri", entity.getId().getLinkURI())
            .param("updated_at", Timestamp.from(scrapperLink.getUpdatedAt()))
            .query(new ScrapperLinkEntityRowMapper())
            .single()
            .toDomain();
    }

    @Override
    public void deleteScrapperLink(ScrapperLinkID scrapperLinkID) {
        client.sql("DELETE FROM scrapper_link WHERE link_id = :link_id")
            .param("link_id", ScrapperLinkIDEntity.getID(scrapperLinkID).orElseThrow())
            .update();
    }
}
