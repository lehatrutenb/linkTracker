package backend.academy.linktracker.scrapper.usecases.mappers;

import backend.academy.linktracker.scrapper.core.entities.ScrapperFatLink;
import backend.academy.linktracker.scrapper.usecases.dtos.models.LinkResponse;
import backend.academy.linktracker.scrapper.usecases.dtos.models.ListLinksResponse;
import java.util.Collection;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LinksApiMapper {
    public ListLinksResponse map(Collection<ScrapperFatLink> scrapperLink) {
        return new ListLinksResponse()
                .size(scrapperLink.size())
                .links(scrapperLink.stream().map(LinksApiMapper::map).toList());
    }

    public LinkResponse map(ScrapperFatLink scrapperLink) {
        return new LinkResponse()
                .id(scrapperLink.link().id().UUID())
                .url(scrapperLink.link().uri())
                .tags(scrapperLink.metaData().tags())
                .filters(scrapperLink.metaData().filters());
    }
}
