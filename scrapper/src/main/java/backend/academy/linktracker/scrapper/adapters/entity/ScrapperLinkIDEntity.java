package backend.academy.linktracker.scrapper.adapters.entity;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import java.io.Serial;
import java.io.Serializable;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Optional;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Embeddable
@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
public class ScrapperLinkIDEntity implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "link_id_gen")
    @SequenceGenerator(name = "link_id_gen", sequenceName = "link_id_seq", allocationSize = 10)
    @Column(name = "link_id")
    private Long linkID;

    @Column(name = "link_uri")
    private String linkURI;

    public ScrapperLinkIDEntity(ScrapperLinkID id) {
        this.linkID = getID(id).orElse(null);
        this.linkURI = id.uri().toString();
    }

    public static Optional<Long> getID(ScrapperLinkID id) {
        return id.id();
    }

    public ScrapperLinkID toDomain() {
        try {
            return new ScrapperLinkID(new URI(linkURI), Optional.of(linkID));
        } catch (URISyntaxException e) {
            log.error("Attempt to transform incorrect uri to inner objects fields");
            throw new RuntimeException(e);
        }
    }
}
