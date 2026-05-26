package backend.academy.linktracker.scrapper.usecase.service;

import backend.academy.linktracker.scrapper.adapter.repository.ScrappingLinksRepository;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;
import backend.academy.linktracker.scrapper.usecase.exception.DuplicateEntityException;
import backend.academy.linktracker.scrapper.usecase.exception.ListenerNotFoundException;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ScrappingLinkListenerService {
    private final ScrappingLinkListenerRepository listenerRepository;

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void addLinkListener(long id, ScrapperLinkListenerType listenerType) {
        if (getLinkListener(id).isPresent()) {
            throw new DuplicateEntityException(ScrapperLinkListener.class, String.valueOf(id));
        }
        listenerRepository.createScrapperLinkListener(new ScrapperLinkListener(id, listenerType));
    }

    public void deleteLinkListener(ScrapperLinkListener listener) {
        listenerRepository.deleteScrapperLinkListenerByID(listener.listenerID());
    }

    public Optional<ScrapperLinkListener> getLinkListener(long id) {
        return listenerRepository.readScrapperLinkListener(id);
    }

    public ScrapperLinkListener getLinkListenerOrThrow(Long id, ScrapperLinkListenerType listenerType) {
        return listenerRepository
                .readScrapperLinkListener(id)
                .orElseThrow(() -> new ListenerNotFoundException(id, listenerType));
    }
}
