package backend.academy.linktracker.scrapper.usecase;

import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;
import backend.academy.linktracker.scrapper.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.ListLinksResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.RemoveLinkRequest;
import backend.academy.linktracker.scrapper.usecase.exception.ScrappingURIValidationException;
import backend.academy.linktracker.scrapper.usecase.mapper.LinksApiMapper;
import backend.academy.linktracker.scrapper.usecase.service.ScheduleUpdatesOnLinksService;
import backend.academy.linktracker.scrapper.usecase.service.ScrapperLinkMetaDataService;
import backend.academy.linktracker.scrapper.usecase.service.ScrappingLinkListenerService;
import backend.academy.linktracker.scrapper.usecase.service.ScrappingLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@RefreshScope
public class ScrapperFacade {
    private final ScrappingLinkService linksService;
    private final ScrappingLinkListenerService linkListenersService;
    private final ScrapperLinkMetaDataService metaDataService;
    private final ScheduleUpdatesOnLinksService scheduleLinksService;

    public void deleteLinkScheduling(RemoveLinkRequest request, Long tgChatID) {
        var listener = linkListenersService.getLinkListener(
                tgChatID.toString(), ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        var link = linksService.getScrapperLinkIDByURI(request.getLink().orElseThrow());
        linksService.deleteLinkForLinkListener(link, listener);
    }

    public ListLinksResponse getSchedulingLinks(Long tgChatID) {
        var listener = linkListenersService.getLinkListener(
                tgChatID.toString(), ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        return LinksApiMapper.map(
                metaDataService.enrichWithMetaData(linksService.getAllListeningLinks(listener), listener));
    }

    public LinkResponse scheduleLink(AddLinkRequest addLinkRequest, Long tgChatID) {
        var listener = linkListenersService.getLinkListener(
                tgChatID.toString(), ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        var link = linksService.addLinkToListen(addLinkRequest, listener);
        if (scheduleLinksService.getLinkScrappers(link).isEmpty()) {
            throw new ScrappingURIValidationException(link.uri());
        }
        return LinksApiMapper.map(metaDataService.addMetaData(addLinkRequest, tgChatID, link));
    }

    public void deleteTgChat(Long tgChatID) {
        linkListenersService.deleteLinkListener(linkListenersService.getLinkListener(
                tgChatID.toString(), ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER));
    }

    public void addTgChat(Long tgChatID) {
        linkListenersService.addLinkListener(tgChatID.toString(), ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
    }
}
