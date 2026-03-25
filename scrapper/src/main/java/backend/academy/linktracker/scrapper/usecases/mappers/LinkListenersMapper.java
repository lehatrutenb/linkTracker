package backend.academy.linktracker.scrapper.usecases.mappers;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import lombok.experimental.UtilityClass;

@UtilityClass
public class LinkListenersMapper {
    public ScrapperLinkListener map(Long chatID) {
        return new ScrapperLinkListener(chatID.toString());
    }
}
