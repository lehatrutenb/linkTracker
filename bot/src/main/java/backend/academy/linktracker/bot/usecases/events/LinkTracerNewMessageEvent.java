package backend.academy.linktracker.bot.usecases.events;

import backend.academy.linktracker.bot.adapters.controllers.LinkTracerTelegramBotReplier;
import backend.academy.linktracker.bot.core.entities.EventId;
import backend.academy.linktracker.bot.core.entities.LinkTracerMessage;
import java.io.Serial;
import java.io.Serializable;
import java.util.Map;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationEvent;

public class LinkTracerNewMessageEvent extends ApplicationEvent implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L; // Set such version to fit linters

    @Getter
    private final LinkTracerMessage message;

    @Getter
    private final String replyServiceQualifier; // Used additional qualifier logic to fit many input controllers

    @Getter
    private final EventId eventId;

    public LinkTracerNewMessageEvent(
            Object source, LinkTracerMessage message, Qualifier replyServiceQualifier, EventId eventId) {
        super(source);
        this.message = message;
        this.replyServiceQualifier = replyServiceQualifier.value();
        this.eventId = eventId;
    }

    public LinkTracerTelegramBotReplier getReplyService(ApplicationContext applicationContext) {
        return (LinkTracerTelegramBotReplier)
                applicationContext.getBeansWithAnnotation(Qualifier.class).entrySet().stream()
                        .filter(bean -> applicationContext
                                .findAnnotationOnBean(bean.getKey(), Qualifier.class)
                                .value()
                                .equals(replyServiceQualifier))
                        .map(Map.Entry::getValue)
                        .findAny()
                        .orElseThrow();
    }
}
