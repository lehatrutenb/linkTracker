package backend.academy.linktracker.scrapper.adapters.repository.inmem;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaData;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import java.util.Collection;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinkMetaDataRepository;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;
import backend.academy.linktracker.scrapper.core.port.ScrappingLinkListenerRepository;
import lombok.RequiredArgsConstructor;

@Repository
@RefreshScope
@RequiredArgsConstructor
public class ScrappingLinkMetaDataRepositoryInMemImpl implements ScrappingLinkMetaDataRepository {
    Set<ScrapperLinkMetaData> metaDatas = new HashSet<>();
    private final ScrappingLinksRepositoryInMemImpl linksRepository;
    private final ScrappingLinkListenerRepository listenerRepository;

    @Override
    public Optional<ScrapperLinkMetaData> readLinkMetaData(ScrapperLinkMetaDataID metaDataID) {
        return metaDatas.stream()
                .filter(metaData -> metaData.id().equals(metaDataID))
                .findAny();
    }

    @Override
    public Collection<ScrapperLinkMetaData> readAllLinkMetaData() {
        return metaDatas;
    }

    @Override
    public void createLinkMetaData(ScrapperLinkMetaData metaData) {
        metaDatas.add(metaData);
    }

    @Override
    public ScrapperLinkMetaData updateLinkMetaData(ScrapperLinkMetaData metaData) {
        metaDatas.removeIf(data -> data.id().equals(metaData.id()));
        metaDatas.add(metaData);
        return metaData;
    }

    @Override
    public void deleteLinkMetaData(ScrapperLinkMetaDataID linkMetaDataID) {
        metaDatas.removeIf(metaData -> metaData.id().equals(linkMetaDataID));
    }

    @Override
    public Collection<ScrapperLink> readAllListenningLinks(long scrapperLinkListenerID) {
        return metaDatas.stream()
                .filter(metaData -> metaData.id().listenerID() == scrapperLinkListenerID)
                .map(ScrapperLinkMetaData::id)
                .map(ScrapperLinkMetaDataID::linkID)
                .map(linksRepository::readScrapperLinkByID)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
    }

    @Override
    public Collection<ScrapperLinkListener> readScrapperLinkListeners(ScrapperLinkID linkID) {
        return metaDatas.stream()
                .filter(metaData -> metaData.id().linkID().equals(linkID))
                .map(ScrapperLinkMetaData::id)
                .map(ScrapperLinkMetaDataID::listenerID)
                .map(listenerID -> listenerRepository.readScrapperLinkListener(listenerID.longValue()))
                .filter(Optional::isPresent)
                .map(Optional::get)
                .toList();
    }
}
