package backend.academy.linktracker.scrapper.adapters.repository.selfmanaged;

import backend.academy.linktracker.scrapper.adapters.entity.ScrapperLinkListenerEntity;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinkListenerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Repository;
import java.util.Collection;
import java.util.Optional;

@RefreshScope
@Repository
@Primary
@RequiredArgsConstructor
@ConditionalOnProperty(name = "app.data.access-type", havingValue = "SQL")
public class ScrapperLinkListenerRepositorySelfManagedImpl implements ScrappingLinkListenerRepository {
    private final JdbcClient client;

    @Override
    public Collection<ScrapperLinkListener> readAllScrapperLinkListeners() {
        return client.sql("SELECT * FROM link_listener")
            .query(ScrapperLinkListenerEntity.class)
            .list()
            .stream()
            .map(ScrapperLinkListenerEntity::toDomain)
            .toList();
    }

    @Override
    public Optional<ScrapperLinkListener> readScrapperLinkListener(long id) {
        return client.sql("SELECT * FROM link_listener WHERE id = :id")
            .param("id", id)
            .query(ScrapperLinkListenerEntity.class)
            .optional()
            .map(ScrapperLinkListenerEntity::toDomain);
    }

    @Override
    public void createScrapperLinkListener(ScrapperLinkListener scrapperLinkListener) {
        var entity = new ScrapperLinkListenerEntity(scrapperLinkListener);
        client.sql("INSERT INTO link_listener (id, type) VALUES (:id, :type)")
            .param("id", entity.getId())
            .param("type", entity.getType().toString())
            .update();
    }

    @Override
    public ScrapperLinkListener updateScrapperLinkListener(ScrapperLinkListener scrapperLinkListener) {
        client.sql("UPDATE link_listener SET type = :type WHERE id = :id")
            .param("id", scrapperLinkListener.listenerID())
            .param("type", scrapperLinkListener.listenerType().toString())
            .update();
        return scrapperLinkListener;
    }

    @Override
    public void deleteScrapperLinkListenerByID(long id) {
        client.sql("DELETE FROM link_listener WHERE id = :id")
            .param("id", id)
            .update();
    }
}
