package backend.academy.linktracker.bot.adapter.entity;

import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.entities.LinkUpdateID;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.usecase.mappers.TelegramUpdatesMapper;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.SequenceGenerator;
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
    @AttributeOverrides({ // TODO any better solution? I need to split cur id field and it
        @AttributeOverride(name = "id", column = @Column(name = "event_id")),
        @AttributeOverride(name = "ownerIDType", column = @Column(name = "event_owner_id_type")),
    })
    private EventIDEntity eventID;

    private String url;
    private String description;

    @ElementCollection
    @CollectionTable(
            name = "link_update_bot_chats_mapping",
            joinColumns = @JoinColumn(name = "link_update_id"))
    @Column(name = "bot_chat_id")
    private List<Long> tgChatIDs;

    public LinkUpdateEntity(LinkUpdate linkUpdate, EventID eventID) {
        this.eventID = new EventIDEntity(eventID);
        id = getID(linkUpdate.id());
        tgChatIDs = linkUpdate.botChatIDS().stream().map(BotChatEntity::getID).toList();
        url = linkUpdate.url().toString();
        description = linkUpdate.description();
    }

    public LinkUpdate toDomain() {
        try {
            return new LinkUpdate(
                    TelegramUpdatesMapper.mapLinkUpdateID(id),
                    new URI(url),
                    description,
                    tgChatIDs.stream().map(BotChatID::new).toList());
        } catch (URISyntaxException e) {
            log.error("LinkUpdateEntity contains corrupted URI value");
            throw new RuntimeException(e);
        }
    }

    public static long getID(LinkUpdateID id) {
        return id.getId();
    }
}
