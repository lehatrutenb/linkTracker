package backend.academy.linktracker.scrapper.adapters.repository.inmem;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import java.net.URI;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinksRepository;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinkListenerRepository;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public class ScrappingLinksRepositoryInMemImpl implements ScrappingLinksRepository, ScrappingLinkListenerRepository {
    private final Set<ScrapperLink> scrapperLinks = new HashSet<>();
    private final Set<ScrapperLinkListener> scrapperLinkListeners = new HashSet<>();
    private long lastLinkID = 0;

    @Override
    public Collection<ScrapperLink> readAllScrapperLinks() {
        return scrapperLinks;
    }

    @Override
    public Optional<ScrapperLink> readScrapperLinkByID(ScrapperLinkID id) {
        return scrapperLinks.stream().filter(link -> link.getId().equals(id)).findAny();
    }

    @Override
    public Optional<ScrapperLink> readScrapperLinkByURI(URI uri) {
        return scrapperLinks.stream().filter(link -> link.getUri().equals(uri)).findAny();
    }

    @Override
    public Optional<ScrapperLinkID> readScrapperLinkIDByURI(URI uri) {
        return scrapperLinks.stream()
                .filter(link -> link.getUri().equals(uri))
                .map(ScrapperLink::getId)
                .findAny();
    }

    @Override
    public Collection<ScrapperLinkListener> readAllScrapperLinkListeners() {
        return scrapperLinkListeners;
    }

    @Override
    public Optional<ScrapperLinkListener> readScrapperLinkListener(long id) {
        return scrapperLinkListeners.stream()
            .filter(listener -> listener.listenerID() == id)
            .findAny();
    }

    @Override
    public ScrapperLink createScrapperLink(ScrapperLink scrapperLink) throws SQLException {
        if (scrapperLink.getId().id().isEmpty()) {
            scrapperLink.setId(new ScrapperLinkID(scrapperLink.getId().uri(), Optional.of(lastLinkID)));
            lastLinkID++;
        }
        if (scrapperLinks.stream().anyMatch(link -> link.getId().id().equals(scrapperLink.getId().id()))) {
            throw new SQLException("Repository already have entity with same id");
        }
        scrapperLinks.add(scrapperLink);
        return scrapperLink;
    }

    @Override
    public ScrapperLink updateScrapperLink(ScrapperLink scrapperLink) {
        var prevLink = scrapperLinks.stream()
                .filter(link -> scrapperLink.getId().equals(link.getId()))
                .findAny();
        if (prevLink.isEmpty()) {
            throw new IllegalStateException("ScrapperLink not found for update: " + scrapperLink.getId());
        }
        scrapperLinks.remove(prevLink.orElseThrow());
        scrapperLinks.add(scrapperLink);
        return scrapperLink;
    }

    @Override
    public void createScrapperLinkListener(ScrapperLinkListener scrapperLinkListener) {
        scrapperLinkListeners.add(scrapperLinkListener);
    }

    @Override
    public void deleteScrapperLink(ScrapperLinkID scrapperLinkID) {
        scrapperLinks.removeIf(link -> link.getId().equals(scrapperLinkID));
    }

    @Override
    public ScrapperLinkListener updateScrapperLinkListener(ScrapperLinkListener scrapperLinkListener) {
        readScrapperLinkListener(scrapperLinkListener.listenerID()).ifPresent(scrapperLinkListeners::remove);
        scrapperLinkListeners.add(scrapperLinkListener);
        return scrapperLinkListener;
    }

    @Override
    public void deleteScrapperLinkListenerByID(long id) {
        scrapperLinkListeners.removeIf(listener -> listener.listenerID() == id);
    }
}
