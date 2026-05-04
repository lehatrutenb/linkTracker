package backend.academy.linktracker.scrapper.usecases.mappers;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LinkListenersMapper {
    public ScrapperLinkListener map(Long chatID, ScrapperLinkListenerType listenerType) {
        return new ScrapperLinkListener(chatID, listenerType);
    }
}
