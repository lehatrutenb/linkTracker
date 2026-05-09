package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.entities.LinkUpdateID;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkUpdateRequest;
import backend.academy.linktracker.bot.usecase.mappers.TelegramUpdatesMapper;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
@Setter
@NoArgsConstructor
@Table(name = "link_update")
@Entity
public class LinkUpdateEntity {
    @Id
    private Long id;

    @Embedded
    private EventIDEntity eventID;

    private String url;
    private String description;

    @OneToMany
    @JoinTable(
        name = "link_update_bot_chats_mapping",
        joinColumns = @JoinColumn(name = "link_update_id"),
        inverseJoinColumns = @JoinColumn(name = "bot_chat_id"))
    private List<BotChatEntity> tgChatIDs;

    @Version
    private Long version;

    public LinkUpdateEntity(LinkUpdate linkUpdate) {
        id = getID(linkUpdate.id());
        url = linkUpdate.url().toString();
        description = linkUpdate.description();
    }

    public LinkUpdate toDomain() {
        try {
            return new LinkUpdate(TelegramUpdatesMapper.mapLinkUpdateID(id), new URI(url), description, tgChatIDs.stream().map(BotChatEntity::toDomainID).toList());
        } catch (URISyntaxException e) {
            log.error("LinkUpdateEntity contains corrupted URI value");
            throw new RuntimeException(e);
        }
    }

    public static long getID(LinkUpdateID id) {
        return id.getId();
    }
}
