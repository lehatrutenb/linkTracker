package backend.academy.linktracker.scrapper.adapters.entity;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Instant;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import java.util.Optional;

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

    @Version
    private Long version;

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
