package backend.academy.linktracker.scrapper.usecases.services;

import backend.academy.linktracker.scrapper.core.port.ScrappingLinkMetaDataRepository;
import backend.academy.linktracker.scrapper.core.entities.ScrapperFatLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaData;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import backend.academy.linktracker.scrapper.usecases.dtos.models.AddLinkRequest;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ScrapperLinkMetaDataService {
    private final ScrappingLinkMetaDataRepository metaDataRepository;

    public ScrapperFatLink addMetaData(AddLinkRequest addLinkRequest, Long listenerID, ScrapperLink scrapperLink) {
        var metaData = new ScrapperLinkMetaData(
                new ScrapperLinkMetaDataID(scrapperLink.getId(), listenerID),
                addLinkRequest.getTags(),
                addLinkRequest.getFilters());
        metaDataRepository.createLinkMetaData(metaData);
        return new ScrapperFatLink(scrapperLink, metaData);
    }

    public Optional<ScrapperFatLink> enrichWithMetaData(
            ScrapperLink scrapperLink,
            ScrapperLinkListener listener) { // Not return not to mark that copy may happen inside
        var metaData = metaDataRepository.readLinkMetaData(
                new ScrapperLinkMetaDataID(scrapperLink.getId(), listener.listenerID()));
        if (metaData.isEmpty()) {
            log.atError()
                    .addKeyValue("link", scrapperLink)
                    .addKeyValue("listenerID", listener)
                    .log("Failed to match link with meta data");
            return Optional.empty();
        }
        return Optional.of(new ScrapperFatLink(scrapperLink, metaData.orElseThrow()));
    }

    public List<ScrapperFatLink> enrichWithMetaData(
            Collection<ScrapperLink> scrapperLinks,
            ScrapperLinkListener listener) { // Not return not to mark that copy may happen inside
        return scrapperLinks.stream()
                .flatMap(link -> enrichWithMetaData(link, listener).stream())
                .toList();
    }
}
