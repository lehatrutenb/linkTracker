package backend.academy.linktracker.scrapper.adapter.repository;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaData;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Repository;

@Repository
@RefreshScope
public class ScrappingLinkMetaDataRepositoryInMemImpl implements ScrappingLinkMetaDataRepository {
    Set<ScrapperLinkMetaData> metaDatas = new HashSet<>();

    @Override
    public Optional<ScrapperLinkMetaData> getLinkMetaData(ScrapperLinkMetaDataID metaDataID) {
        return metaDatas.stream()
                .filter(metaData -> metaData.id().equals(metaDataID))
                .findAny();
    }

    @Override
    public void addLinkMetaData(ScrapperLinkMetaData metaData) {
        metaDatas.add(metaData);
    }

    @Override
    public void updateLinkMetaData(ScrapperLinkMetaData metaData) {
        metaDatas.removeIf(data -> data.id().equals(metaData.id()));
    }
}
