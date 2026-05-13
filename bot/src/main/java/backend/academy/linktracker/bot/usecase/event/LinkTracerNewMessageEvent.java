package backend.academy.linktracker.bot.usecase.event;

import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
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
    private final EventID eventID;

    public LinkTracerNewMessageEvent(Object source, TelegramBotMessage message, EventID eventID) {
        super(source);
        this.message = message;
        this.eventID = eventID;
    }
}
