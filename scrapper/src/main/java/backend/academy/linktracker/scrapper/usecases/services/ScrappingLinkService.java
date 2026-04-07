package backend.academy.linktracker.scrapper.usecases.services;

import backend.academy.linktracker.scrapper.adapters.repositories.ScrappingLinksRepository;
import backend.academy.linktracker.scrapper.core.domain.factories.ScrapperLinkFactory;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.usecases.dtos.models.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecases.exceptions.DuplicateEntityException;
import java.net.URI;
import java.sql.SQLException;
import java.time.Instant;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
// TODO USE mapper not new ScrapperLinkListener(listenerID)
public class ScrappingLinkService {
    private final ScrappingLinksRepository linksRepository;
    private final ScrapperLinkFactory scrapperLinkFactory;

    public void deleteLinkForLinkListener(ScrapperLinkID linkID, ScrapperLinkListener listener) {
        linksRepository.deleteScrapperLinkListenerLink(
                listener, linkID); // TODO won't work if run in parallel - need to do as atomic op
        if (linksRepository.getScrapperLinkListeners(linkID).isEmpty()) {
            linksRepository.deleteScrapperLink(linkID);
        }
    }

    public ScrapperLink addLinkToListen(AddLinkRequest addLinkRequest, ScrapperLinkListener listener) {
        var link = scrapperLinkFactory.createScrapperLink(
                addLinkRequest.getLink().orElseThrow(),
                Instant.EPOCH); // Not min cause cant format to date string in request it
        if (getListenersOfLink(link.id()).contains(listener)) {
            throw new DuplicateEntityException(
                    ScrapperLink.class, link.id().uri().toString());
        }
        try {
            linksRepository.addScrapperLink(link);
        } catch (SQLException _) { // TODO recheck
            log.error("Got SQL exception");
        }
        linksRepository.addLinkToScrapperLinkListener(listener, link.id());
        return link;
    }

    public Optional<ScrapperLink> getLink(URI uri) {
        return linksRepository.getScrapperLinkByURI(uri);
    }

    public Collection<ScrapperLinkListener> getListenersOfLink(ScrapperLinkID scrapperLinkID) {
        return linksRepository.getScrapperLinkListeners(scrapperLinkID);
    }

    public void setFreshUpdatedTag(ScrapperLink scrapperLink, Instant updatedAt) {
        linksRepository.updateScrapperLink(new ScrapperLink(scrapperLink.id(), scrapperLink.uri(), updatedAt));
    }

    public Collection<ScrapperLink> getAllListeningLinks() {
        return linksRepository.getAllScrapperLinks();
    }

    public Collection<ScrapperLink> getAllListeningLinks(ScrapperLinkListener linkListener) {
        return linksRepository.getAllScrapperLinks(linkListener);
    }
}
