package backend.academy.linktracker.scrapper.usecase.mapper;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LinkListenersMapper {
    public ScrapperLinkListener map(Long chatID, ScrapperLinkListenerType listenerType) {
        if (chatID == null) {
            throw new IllegalArgumentException("Chat ID is null");
        }
        return new ScrapperLinkListener(chatID.toString(), listenerType);
    }
}
