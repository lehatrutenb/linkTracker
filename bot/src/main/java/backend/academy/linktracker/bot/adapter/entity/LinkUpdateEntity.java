package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.usecase.dtos.models.LinkUpdate;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Version;
import java.net.URI;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class LinkUpdateEntity {
    @Id
    private Long id;

    private String url;
    private String description;
    private List<Long> tgChatIDs;

    @Version
    private Long version;

    public LinkUpdateEntity(LinkUpdate linkUpdate) {
        id = linkUpdate.getId().orElseThrow();
        url = linkUpdate.getUrl().orElseThrow().toString();
        description = linkUpdate.getDescription().orElseThrow();
        tgChatIDs = linkUpdate.getTgChatIds();
    }

    public LinkUpdate toDomain() {
        return new LinkUpdate()
                .id(id)
                .url(URI.create(url))
                .description(description)
                .tgChatIds(tgChatIDs);
    }
}
