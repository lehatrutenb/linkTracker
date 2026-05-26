package backend.academy.linktracker.scrapper.usecase;

import backend.academy.linktracker.scrapper.core.entities.ScrapperFatLink;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkMetaDataID;
import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;
import backend.academy.linktracker.scrapper.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.ListLinksResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.RemoveLinkRequest;
import backend.academy.linktracker.scrapper.usecase.exception.LinkNotFoundException;
import backend.academy.linktracker.scrapper.usecase.exception.ScrappingURIValidationException;
import backend.academy.linktracker.scrapper.usecase.mapper.LinksApiMapper;
import backend.academy.linktracker.scrapper.usecase.service.ScheduleUpdatesOnLinksService;
import backend.academy.linktracker.scrapper.usecase.service.ScrapperLinkMetaDataService;
import backend.academy.linktracker.scrapper.usecase.service.ScrappingLinkListenerService;
import backend.academy.linktracker.scrapper.usecase.service.ScrappingLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;
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

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public LinkResponse deleteLinkScheduling(RemoveLinkRequest request, Long tgChatID) {
        var listener =
                linkListenersService.getLinkListenerOrThrow(tgChatID, ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        var uri = request.getLink().orElseThrow();
        var linkID = linksService.getScrapperLinkIDByURI(uri);
        var link = linksService.getLink(uri).orElseThrow(() -> new LinkNotFoundException(uri));
        var metaData =
                linksService.deleteLinkForLinkListener(new ScrapperLinkMetaDataID(linkID, listener.listenerID()));
        return LinksApiMapper.map(new ScrapperFatLink(link, metaData));
    }

    public ListLinksResponse getSchedulingLinks(Long tgChatID) {
        var listener =
                linkListenersService.getLinkListenerOrThrow(tgChatID, ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        return LinksApiMapper.map(
                metaDataService.enrichWithMetaData(linksService.getAllListeningLinks(listener), listener));
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public LinkResponse scheduleLink(AddLinkRequest addLinkRequest, Long tgChatID) {
        var listener =
                linkListenersService.getLinkListenerOrThrow(tgChatID, ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        var link = linksService.addLinkToListen(addLinkRequest, listener);
        if (scheduleLinksService.getLinkScrappers(link).isEmpty()) {
            throw new ScrappingURIValidationException(link.getUri());
        }
        return LinksApiMapper.map(metaDataService.addMetaData(addLinkRequest, tgChatID, link));
    }

    @Transactional(isolation = Isolation.SERIALIZABLE)
    public void deleteTgChat(Long tgChatID) {
        linkListenersService.deleteLinkListener(
                linkListenersService.getLinkListenerOrThrow(tgChatID, ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER));
    }

    public void addTgChat(Long tgChatID) {
        linkListenersService.addLinkListener(tgChatID, ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
    }
}
