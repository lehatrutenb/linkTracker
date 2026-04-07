package backend.academy.linktracker.scrapper.usecases.exceptions;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;
import java.io.Serial;

public class ListenerNotFoundException extends NotFoundException {
    @Serial
    private static final long serialVersionUID = 1L;

    public ListenerNotFoundException(String listenerID, ScrapperLinkListenerType listenerType) {
        super(ScrapperLinkListener.class.getSimpleName() + " of " + listenerType.name(), listenerID);
    }

    @Override
    public String getUserDescription() {
        return "Listener not found";
    }
}
