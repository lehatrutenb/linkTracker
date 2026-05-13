package backend.academy.linktracker.bot.usecases.events;

import backend.academy.linktracker.bot.core.entities.EventId;
import backend.academy.linktracker.bot.core.entities.LinkTracerMessage;
import java.io.Serial;
import java.io.Serializable;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class LinkTracerNewMessageEvent extends ApplicationEvent implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L; // Set such version to fit linters

    @Getter
    private final LinkTracerMessage message;

    @Getter
    private final EventId eventId;

    public LinkTracerNewMessageEvent(Object source, LinkTracerMessage message, EventId eventId) {
        super(source);
        this.message = message;
        this.eventId = eventId;
    }
}
