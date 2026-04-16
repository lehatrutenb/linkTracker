package backend.academy.linktracker.bot.usecase.events;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import java.io.Serial;
import java.io.Serializable;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

public class LinkTracerNewMessageEvent extends ApplicationEvent implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L; // Set such version to fit linters

    @Getter
    private final TelegramBotMessage message;

    @Getter
    private final EventID eventId;

    public LinkTracerNewMessageEvent(Object source, TelegramBotMessage message, EventID eventId) {
        super(source);
        this.message = message;
        this.eventId = eventId;
    }
}
