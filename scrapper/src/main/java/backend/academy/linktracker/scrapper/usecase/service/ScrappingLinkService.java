package backend.academy.linktracker.scrapper.usecase.service;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaData;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinkMetaDataRepository;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinksRepository;
import backend.academy.linktracker.scrapper.property.ScrapperGlobalProperties;
import backend.academy.linktracker.scrapper.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecase.exception.DuplicateEntityException;
import backend.academy.linktracker.scrapper.usecase.exception.LinkNotFoundException;
import java.net.URI;
import java.time.Instant;
import java.util.Collection;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Slf4j
@Service
@RequiredArgsConstructor
public class ScrappingLinkService {
    private final ScrappingLinksRepository linksRepository;
    private final ScrappingLinkMetaDataRepository metaDataRepository;
    private final ScrapperGlobalProperties globalProperties;

    @Transactional(isolation = Isolation.REPEATABLE_READ)
    public ScrapperLinkMetaData deleteLinkForLinkListener(ScrapperLinkMetaDataID metaDataID) {
        var metaData = metaDataRepository.readLinkMetaData(metaDataID);
        if (metaData.isEmpty()) {
            throw new LinkNotFoundException(metaDataID.linkID().uri());
        }
        metaDataRepository.deleteLinkMetaData(
                metaDataID); // TODO won't work if run in parallel - need to do as atomic op
        if (metaDataRepository.readScrapperLinkListeners(metaDataID.linkID()).isEmpty()) {
            linksRepository.deleteScrapperLink(metaDataID.linkID());
        }
        // TODO Currently dont need, but its better to use some scheduling task for it, not check on every request
        return metaData.orElseThrow();
    }

    @Transactional
    public ScrapperLink addLinkToListen(AddLinkRequest addLinkRequest, ScrapperLinkListener listener) {
        var link = new ScrapperLink(
                new ScrapperLinkID(addLinkRequest.getLink().orElseThrow()),
                addLinkRequest.getLink().orElseThrow(),
                globalProperties.getDefaultLinkCreationDate());
        if (linksRepository.readScrapperLinkIDByURI(link.getUri()).isEmpty()) {
            link = linksRepository.createScrapperLink(link);
        } else {
            link = linksRepository.readScrapperLinkByURI(link.getUri()).orElseThrow();
        }
        if (metaDataRepository.readScrapperLinkListeners(link.getId()).contains(listener)) {
            throw new DuplicateEntityException(ScrapperLink.class, link.getUri().toString());
        }
        return link;
    }

    public Optional<ScrapperLink> getLink(URI uri) {
        return linksRepository.readScrapperLinkByURI(uri);
    }

    public Optional<ScrapperLinkID> readScrapperLinkIDByURI(URI uri) {
        return linksRepository.readScrapperLinkIDByURI(uri);
    }

    public ScrapperLinkID getScrapperLinkIDByURI(URI uri) {
        return readScrapperLinkIDByURI(uri).orElseThrow(() -> new LinkNotFoundException(uri));
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
