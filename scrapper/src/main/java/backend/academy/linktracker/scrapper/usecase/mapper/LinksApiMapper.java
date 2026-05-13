package backend.academy.linktracker.scrapper.usecase.mapper;

import backend.academy.linktracker.scrapper.core.entities.ScrapperFatLink;
import backend.academy.linktracker.scrapper.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.ListLinksResponse;
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
