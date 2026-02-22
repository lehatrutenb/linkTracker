package backend.academy.linktracker.bot.usecases.events;

import backend.academy.linktracker.bot.adapters.controllers.LinkTracerReplier;
import backend.academy.linktracker.bot.core.entities.EventId;
import backend.academy.linktracker.bot.core.entities.LinkTracerMessage;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class LinkTracerNewMessageEvent extends ApplicationEvent {
    @Getter
    private final LinkTracerMessage message;
    @Getter
    private final LinkTracerReplier replier;
    @Getter
    private final EventId eventId;

    public LinkTracerNewMessageEvent(Object source, LinkTracerMessage message, LinkTracerReplier replier, EventId eventId) {
        super(source);
        this.message = message;
        this.replier = replier;
        this.eventId = eventId;
    }
}
