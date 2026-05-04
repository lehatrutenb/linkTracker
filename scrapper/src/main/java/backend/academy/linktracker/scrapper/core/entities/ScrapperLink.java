package backend.academy.linktracker.scrapper.core.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import java.net.URI;
import java.time.Instant;
import java.util.Optional;


@Getter
@Setter
@AllArgsConstructor
public class ScrapperLink {
    private ScrapperLinkID id;
    private URI uri;
    private Instant updatedAt;
}
