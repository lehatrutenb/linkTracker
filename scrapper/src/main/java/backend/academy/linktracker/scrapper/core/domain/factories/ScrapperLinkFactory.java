package backend.academy.linktracker.scrapper.core.domain.factories;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import com.google.common.hash.Hashing;
import java.net.URI;
import java.nio.charset.StandardCharsets;
import java.time.Instant;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class ScrapperLinkFactory {
    private ScrapperLinkID createScrapperLinkID(URI uri) {
        return new ScrapperLinkID(
                uri,
                Hashing.sha256()
                        .hashString(uri.toASCIIString(), StandardCharsets.US_ASCII)
                        .asLong());
    }

    public ScrapperLink createScrapperLink(URI uri, Instant updatedAt) {
        return new ScrapperLink(createScrapperLinkID(uri), uri, updatedAt);
    }
}
