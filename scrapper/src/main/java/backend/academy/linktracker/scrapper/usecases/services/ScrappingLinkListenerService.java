package backend.academy.linktracker.scrapper.usecases.services;

import backend.academy.linktracker.scrapper.adapters.repositories.ScrappingLinksRepository;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;
import backend.academy.linktracker.scrapper.usecases.exceptions.DuplicateEntityException;
import backend.academy.linktracker.scrapper.usecases.exceptions.ListenerNotFoundException;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScrappingLinkListenerService {
    private final ScrappingLinksRepository linksRepository;

    public void addLinkListener(String id, ScrapperLinkListenerType listenerType) {
        if (getLinkListener(id).isPresent()) {
            throw new DuplicateEntityException(ScrapperLinkListener.class, id);
        }
        linksRepository.addScrapperLinkListener(new ScrapperLinkListener(id, listenerType));
    }

    public void deleteLinkListener(ScrapperLinkListener listener) {
        linksRepository.deleteScrapperLinkListener(listener);
    }

    public Optional<ScrapperLinkListener> getLinkListener(String id) {
        return linksRepository.getScrapperLinkListener(id);
    }

    public ScrapperLinkListener getLinkListener(String id, ScrapperLinkListenerType listenerType) {
        return linksRepository
                .getScrapperLinkListener(id)
                .orElseThrow(() -> new ListenerNotFoundException(id, listenerType));
    }
}
