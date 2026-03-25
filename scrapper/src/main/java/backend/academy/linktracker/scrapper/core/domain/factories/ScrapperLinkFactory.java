package backend.academy.linktracker.scrapper.core.domain.factories;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import cn.hutool.core.lang.Snowflake;
import java.net.URI;
import java.time.Instant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ScrapperLinkFactory {
    private final Snowflake snowflake;

    private ScrapperLinkID createScrapperLinkID(URI uri) {
        return new ScrapperLinkID(uri, snowflake.nextId());
    }

    public ScrapperLink createScrapperLink(URI uri, Instant updatedAt) {
        return new ScrapperLink(createScrapperLinkID(uri), uri, updatedAt);
    }
}
