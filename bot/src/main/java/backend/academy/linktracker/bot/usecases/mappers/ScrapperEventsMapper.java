package backend.academy.linktracker.bot.usecases.mappers;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;

public class ScrapperEventsMapper {
    public static EventID mapScrapperUpdateId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Update ID is null");
        }
        return new EventID(id.toString(), OwnerIDType.SCRAPPER);
    }
}
