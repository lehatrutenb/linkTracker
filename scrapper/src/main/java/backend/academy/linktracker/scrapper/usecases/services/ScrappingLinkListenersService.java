package backend.academy.linktracker.scrapper.usecases.services;

import backend.academy.linktracker.scrapper.adapters.repositories.ScrappingLinksRepository;
import backend.academy.linktracker.scrapper.core.domain.factories.ScrapperLinkFactory;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.usecases.dtos.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecases.dtos.RemoveLinkRequest;
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
public class ScrappingLinkListenersService {
    private final ScrappingLinksRepository linksRepository;
    private final ScrapperLinkFactory scrapperLinkFactory;

    public void addLinkListener(String id) {
        linksRepository.addScrapperLinkListener(new ScrapperLinkListener(id));
    }

    public void deleteLinkListener(String id) {
        linksRepository.deleteScrapperLinkListener(new ScrapperLinkListener(id));
    }

    public void deleteLinkForLinkListener(RemoveLinkRequest removeLinkRequest, String listenerID) {
        var linkID = linksRepository.getScrapperLinkIDByURI(removeLinkRequest.getLink());
        if (linkID.isEmpty()) {
            log.atWarn().addKeyValue("linkID", linkID).log("Attempt to remove non scheduling link");
            return;
        }
        linksRepository.deleteScrapperLinkListenerLink(
                new ScrapperLinkListener(listenerID),
                linkID.orElseThrow()); // TODO won't work if run in parallel - need to do as atomic op
        if (linksRepository.getScrapperLinkListeners(linkID.orElseThrow()).isEmpty()) {
            linksRepository.deleteScrapperLink(linkID.orElseThrow());
        }
    }

    public ScrapperLink addLinkToListen(AddLinkRequest addLinkRequest, String listenerID) {
        var link = scrapperLinkFactory.createScrapperLink(
                addLinkRequest.getLink(), Instant.EPOCH); // Not min cause cant format to date string in request it
        try {
            linksRepository.addScrapperLink(link);
        } catch (SQLException _) { // TODO recheck
        }
        linksRepository.addLinkToScrapperLinkListener(new ScrapperLinkListener(listenerID), link.id());
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
