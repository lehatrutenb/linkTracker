package backend.academy.linktracker.bot.usecase.mapper;

import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;

public class ScrapperEventsMapper {
    public static EventID mapScrapperUpdateId(Long id) {
        if (id == null) {
            throw new IllegalArgumentException("Update ID is null");
        }
        return new EventID(id.toString(), OwnerIDType.SCRAPPER);
    }
}
