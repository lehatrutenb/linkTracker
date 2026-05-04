package backend.academy.linktracker.scrapper.usecases;

import backend.academy.linktracker.scrapper.core.port.ScrappingLinksRepository;
import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;
import backend.academy.linktracker.scrapper.usecases.dtos.models.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecases.dtos.models.LinkResponse;
import backend.academy.linktracker.scrapper.usecases.dtos.models.ListLinksResponse;
import backend.academy.linktracker.scrapper.usecases.dtos.models.RemoveLinkRequest;
import backend.academy.linktracker.scrapper.usecases.exceptions.LinkNotFoundException;
import backend.academy.linktracker.scrapper.usecases.exceptions.ScrappingURIValidationException;
import backend.academy.linktracker.scrapper.usecases.mappers.LinksApiMapper;
import backend.academy.linktracker.scrapper.usecases.services.ScheduleUpdatesOnLinksService;
import backend.academy.linktracker.scrapper.usecases.services.ScrapperLinkMetaDataService;
import backend.academy.linktracker.scrapper.usecases.services.ScrappingLinkListenerService;
import backend.academy.linktracker.scrapper.usecases.services.ScrappingLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkID;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@RefreshScope
public class ScrapperFacade {
    private final ScrappingLinkService linksService;
    private final ScrappingLinkListenerService linkListenersService;
    private final ScrapperLinkMetaDataService metaDataService;
    private final ScheduleUpdatesOnLinksService scheduleLinksService;
    private final ScrappingLinksRepository linksRepository; // TODO rm and move to stateful mapper

    public void deleteLinkScheduling(RemoveLinkRequest request, Long tgChatID) {
        var listener = linkListenersService.getLinkListenerOrThrow(
                tgChatID, ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        var link = linksRepository
                .readScrapperLinkIDByURI(request.getLink().orElseThrow())
                .orElseThrow(() -> new LinkNotFoundException(request.getLink().orElseThrow()));
        linksService.deleteLinkForLinkListener(new ScrapperLinkMetaDataID(new ScrapperLinkID(link.uri(), link.id()), listener.listenerID()));
    }

    public ListLinksResponse getSchedulingLinks(Long tgChatID) {
        var listener = linkListenersService.getLinkListenerOrThrow(
                tgChatID, ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        return LinksApiMapper.map(
                metaDataService.enrichWithMetaData(linksService.getAllListeningLinks(listener), listener));
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public LinkResponse scheduleLink(AddLinkRequest addLinkRequest, Long tgChatID) {
        var listener = linkListenersService.getLinkListenerOrThrow(
                tgChatID, ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        var link = linksService.addLinkToListen(addLinkRequest, listener);
        if (scheduleLinksService.getLinkScrappers(link).isEmpty()) {
            throw new ScrappingURIValidationException(link.getUri());
        }
        return LinksApiMapper.map(metaDataService.addMetaData(addLinkRequest, tgChatID, link));
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void deleteTgChat(Long tgChatID) {
        linkListenersService.deleteLinkListener(linkListenersService.getLinkListenerOrThrow(
                tgChatID, ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER));
    }

    public void addTgChat(Long tgChatID) {
        linkListenersService.addLinkListener(tgChatID, ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
    }
}
