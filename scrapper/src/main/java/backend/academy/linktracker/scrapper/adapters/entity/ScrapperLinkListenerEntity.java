package backend.academy.linktracker.scrapper.adapters.entity;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "link_listener")
@Getter
@Setter
@NoArgsConstructor
public class ScrapperLinkListenerEntity {
    @Id
    private long id;

    @Enumerated(value = EnumType.STRING)
    private ScrapperLinkListenerType type;

    public ScrapperLinkListenerEntity(ScrapperLinkListener listener) {
        id = getID(listener);
        type = listener.listenerType();
    }

    public static long getID(ScrapperLinkListener listener) {
        return listener.listenerID();
    }

    public ScrapperLinkListener toDomain() {
        return new ScrapperLinkListener(id, type);
    }
}
