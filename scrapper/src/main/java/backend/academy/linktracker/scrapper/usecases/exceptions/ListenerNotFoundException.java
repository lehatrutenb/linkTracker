package backend.academy.linktracker.scrapper.usecases.exceptions;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;

public class ListenerNotFoundException extends NotFoundException {
    public ListenerNotFoundException(String listenerID, ScrapperLinkListenerType listenerType) {
        super(ScrapperLinkListener.class.getSimpleName() + " of " + listenerType.name(), listenerID);
    }

    @Override
    public String getUserDescription() {
        return "Listener not found";
    }
}
