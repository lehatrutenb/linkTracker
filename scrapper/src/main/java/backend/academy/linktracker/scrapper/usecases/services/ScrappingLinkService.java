package backend.academy.linktracker.scrapper.usecases.services;

import backend.academy.linktracker.scrapper.core.port.ScrappingLinksRepository;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinkMetaDataRepository;
import backend.academy.linktracker.scrapper.usecases.dtos.models.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecases.exceptions.DuplicateEntityException;
import jakarta.transaction.Transactional;

import java.net.URI;
import java.sql.SQLException;
import java.time.Instant;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaData;

@Slf4j
@Service
@RequiredArgsConstructor
// TODO USE mapper not new ScrapperLinkListener(listenerID)
public class ScrappingLinkService {
    private final ScrappingLinksRepository linksRepository;
    private final ScrappingLinkMetaDataRepository metaDataRepository;

    public void deleteLinkForLinkListener(ScrapperLinkMetaDataID metaDataID) {
        metaDataRepository.deleteLinkMetaData(metaDataID); // TODO won't work if run in parallel - need to do as atomic op
        /*if (listenerRepository.readScrapperLinkListener(linkID).isEmpty()) {
            linksRepository.deleteScrapperLink(linkID);
        }*/ // TODO Currently dont need, but its better to use some scheduling task for it, not check on every request
    }

    @Transactional
    public ScrapperLink addLinkToListen(AddLinkRequest addLinkRequest, ScrapperLinkListener listener) {
        var link = new ScrapperLink(
                new ScrapperLinkID(addLinkRequest.getLink().orElseThrow()),
                addLinkRequest.getLink().orElseThrow(),
                Instant.EPOCH); // Not min, but epoch cause cant format to date string in request it
        if (linksRepository.readScrapperLinkIDByURI(link.getUri()).isEmpty()) {
            link = linksRepository.createScrapperLink(link);
        } else {
            link = linksRepository.readScrapperLinkByURI(link.getUri()).orElseThrow();
        }
        if (metaDataRepository.readScrapperLinkListeners(link.getId()).contains(listener)) {
            throw new DuplicateEntityException(
                    ScrapperLink.class, link.getUri().toString());
        }
        return link;
    }

    public Optional<ScrapperLink> getLink(URI uri) {
        return linksRepository.readScrapperLinkByURI(uri);
    }

    public Collection<ScrapperLinkListener> getListenersOfLink(ScrapperLinkID scrapperLinkID) {
        return metaDataRepository.readScrapperLinkListeners(scrapperLinkID);
    }

    public void setFreshUpdatedTag(ScrapperLink scrapperLink, Instant updatedAt) {
        linksRepository.updateScrapperLink(new ScrapperLink(scrapperLink.getId(), scrapperLink.getUri(), updatedAt));
    }

    public Collection<ScrapperLink> getAllListeningLinks() {
        return linksRepository.readAllScrapperLinks();
    }

    public Collection<ScrapperLink> getAllListeningLinks(ScrapperLinkListener linkListener) {
        return metaDataRepository.readAllListenningLinks(linkListener.listenerID());
    }
}
