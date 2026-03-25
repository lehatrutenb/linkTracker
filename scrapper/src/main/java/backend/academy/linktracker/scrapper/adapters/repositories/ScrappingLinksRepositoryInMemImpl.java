package backend.academy.linktracker.scrapper.adapters.repositories;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import java.net.URI;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import org.apache.commons.lang3.tuple.Pair;
import org.springframework.stereotype.Repository;

@Repository
public class ScrappingLinksRepositoryInMemImpl implements ScrappingLinksRepository {
    private final Set<ScrapperLink> scrapperLinks = new HashSet<>();
    private final Set<ScrapperLinkListener> scrapperLinkListeners = new HashSet<>();
    private final Collection<Pair<ScrapperLinkID, ScrapperLinkListener>> linksWithListenersMap = new ArrayList<>();

    @Override
    public Collection<ScrapperLink> getAllScrapperLinks() {
        return scrapperLinks;
    }

    @Override
    public Collection<ScrapperLink> getAllScrapperLinks(ScrapperLinkListener linkListener) {
        var linkIDs = linksWithListenersMap.stream()
                .filter(pair -> pair.getRight().equals(linkListener))
                .map(Pair::getLeft)
                .collect(Collectors.toUnmodifiableSet());

        return scrapperLinks.stream()
                .filter(link -> linkIDs.contains(link.id()))
                .toList();
    }

    @Override
    public Collection<ScrapperLinkListener> getScrapperLinkListeners(ScrapperLinkID scrapperLink) {
        return linksWithListenersMap.stream()
                .filter(pair -> pair.getLeft().equals(scrapperLink))
                .map(Pair::getRight)
                .toList();
    }

    @Override
    public Optional<ScrapperLink> getScrapperLinkByURI(URI uri) {
        return scrapperLinks.stream().filter(link -> link.uri().equals(uri)).findAny();
    }

    @Override
    public Optional<ScrapperLinkID> getScrapperLinkIDByURI(URI uri) {
        return scrapperLinks.stream()
                .filter(link -> link.uri().equals(uri))
                .map(ScrapperLink::id)
                .findAny();
    }

    @Override
    public void addScrapperLink(ScrapperLink scrapperLink) throws SQLException {
        if (scrapperLinks.stream().anyMatch(link -> link.id().equals(scrapperLink.id()))) {
            throw new SQLException("Repository already have entity with same id");
        }
        scrapperLinks.add(scrapperLink);
    }

    @Override
    public void updateScrapperLink(ScrapperLink scrapperLink) {
        var prevLink = scrapperLinks.stream()
                .filter(link -> scrapperLink.id().equals(link.id()))
                .findAny();
        if (prevLink.isEmpty()) {
            throw new RuntimeException("Failed to update link cause no such link exists");
        }
        scrapperLinks.remove(prevLink.get());
        scrapperLinks.add(scrapperLink);
    }

    @Override
    public void addScrapperLinkListener(ScrapperLinkListener scrapperLinkListener) {
        scrapperLinkListeners.add(scrapperLinkListener);
    }

    @Override
    public void addLinkToScrapperLinkListener(ScrapperLinkListener scrapperLinkListener, ScrapperLinkID scrapperLink) {
        linksWithListenersMap.add(Pair.of(scrapperLink, scrapperLinkListener));
    }

    @Override
    public void deleteScrapperLink(ScrapperLinkID scrapperLinkID) {
        scrapperLinks.removeIf(link -> link.id().equals(scrapperLinkID));
    }

    @Override
    public void deleteScrapperLinkListener(ScrapperLinkListener scrapperLinkListener) {
        scrapperLinkListeners.remove(scrapperLinkListener);
    }

    @Override
    public void deleteScrapperLinkListenerLink(ScrapperLinkListener scrapperLinkListener, ScrapperLinkID scrapperLink) {
        linksWithListenersMap.remove(Pair.of(scrapperLink, scrapperLinkListener));
    }
}
