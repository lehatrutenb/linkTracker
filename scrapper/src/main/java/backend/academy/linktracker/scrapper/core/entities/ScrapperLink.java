package backend.academy.linktracker.scrapper.core.entities;

import java.net.URI;
import java.time.Instant;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class ScrapperLink {
    private ScrapperLinkID id;
    private URI uri;
    private Instant updatedAt;
}
