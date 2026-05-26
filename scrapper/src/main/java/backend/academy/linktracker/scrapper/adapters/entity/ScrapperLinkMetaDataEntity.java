package backend.academy.linktracker.scrapper.adapters.entity;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaData;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "link_metadata")
@Getter
@Setter
@NoArgsConstructor
public class ScrapperLinkMetaDataEntity {
    @EmbeddedId
    private ScrapperLinkMetaDataIDEntity id;

    @ManyToMany(cascade = {CascadeType.MERGE, CascadeType.REFRESH, CascadeType.DETACH}) // Not All to not delete tags
    @JoinTable(
            name = "link_metadata_tags_mapping",
            joinColumns = {
                @JoinColumn(name = "link_id"),
                @JoinColumn(name = "link_uri"),
                @JoinColumn(name = "listener_id")
            },
            inverseJoinColumns = @JoinColumn(name = "tag_name"))
    private List<TagEntity> tags;

    public ScrapperLinkMetaDataEntity(ScrapperLinkMetaData metaData) {
        id = getID(metaData);
        tags = metaData.tags().stream().map(TagEntity::new).toList();
    }

    public static ScrapperLinkMetaDataIDEntity getID(ScrapperLinkMetaData metaData) {
        return new ScrapperLinkMetaDataIDEntity(metaData.id());
    }

    public ScrapperLinkMetaData toDomain() {
        return new ScrapperLinkMetaData(
                id.toDomain(),
                tags == null ? List.of() : tags.stream().map(TagEntity::getName).toList(),
                List.of());
    }

    @Embeddable
    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    public static class ScrapperLinkMetaDataIDEntity {
        @AttributeOverrides({ // TODO any better solution? I need to split cur id field and it
            @AttributeOverride(name = "id", column = @Column(name = "link_id")),
            @AttributeOverride(name = "uri", column = @Column(name = "link_uri")),
        })
        private ScrapperLinkIDEntity linkID;

        @Column(name = "listener_id")
        private long listenerID;

        public ScrapperLinkMetaDataIDEntity(ScrapperLinkMetaDataID id) {
            linkID = new ScrapperLinkIDEntity(id.linkID());
            listenerID = id.listenerID();
        }

        public ScrapperLinkMetaDataID toDomain() {
            return new ScrapperLinkMetaDataID(linkID.toDomain(), listenerID);
        }
    }

    @NoArgsConstructor
    @Table(name = "link_tag")
    @Entity
    @Getter
    @Setter
    @EqualsAndHashCode
    public static
    class TagEntity { // We basically can have more complex struct or may just have generating id, but i think such
        // structure is easy solution in place where we do not really need to think
        @Id
        private String name;

        public TagEntity(String name) {
            this.name = name;
        }
    }
}
