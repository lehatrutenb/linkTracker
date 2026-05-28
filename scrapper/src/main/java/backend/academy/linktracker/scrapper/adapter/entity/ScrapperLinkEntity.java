package backend.academy.linktracker.scrapper.adapter.entity;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Entity
@Table(name = "scrapper_link")
@Getter
@Setter
@NoArgsConstructor
public class ScrapperLinkEntity {
    @EmbeddedId
    private ScrapperLinkIDEntity id;

    private Instant updatedAt;

    public ScrapperLinkEntity(ScrapperLink link) {
        id = new ScrapperLinkIDEntity(link.getId());
        updatedAt = link.getUpdatedAt();
    }

    public ScrapperLink toDomain() {
        try {
            return new ScrapperLink(id.toDomain(), new URI(id.getLinkURI()), updatedAt);
        } catch (URISyntaxException e) {
            log.error("Attempt to transform incorrect uri to inner objects fields");
            throw new RuntimeException(e);
        }
    }
}
