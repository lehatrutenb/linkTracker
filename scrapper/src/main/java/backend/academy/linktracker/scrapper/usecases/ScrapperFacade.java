package backend.academy.linktracker.scrapper.usecases;

import backend.academy.linktracker.scrapper.adapters.repositories.ScrappingLinksRepository;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.core.enums.ScrapperLinkListenerType;
import backend.academy.linktracker.scrapper.usecases.dtos.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecases.dtos.LinkResponse;
import backend.academy.linktracker.scrapper.usecases.dtos.ListLinksResponse;
import backend.academy.linktracker.scrapper.usecases.dtos.RemoveLinkRequest;
import backend.academy.linktracker.scrapper.usecases.exceptions.LinkNotFoundException;
import backend.academy.linktracker.scrapper.usecases.exceptions.ListenerNotFoundException;
import backend.academy.linktracker.scrapper.usecases.exceptions.ScrappingURIValidationException;
import backend.academy.linktracker.scrapper.usecases.mappers.LinkListenersMapper;
import backend.academy.linktracker.scrapper.usecases.mappers.LinksApiMapper;
import backend.academy.linktracker.scrapper.usecases.services.ScheduleUpdatesOnLinksService;
import backend.academy.linktracker.scrapper.usecases.services.ScrapperLinkMetaDataService;
import backend.academy.linktracker.scrapper.usecases.services.ScrappingLinkListenerService;
import backend.academy.linktracker.scrapper.usecases.services.ScrappingLinkService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tools.jackson.databind.json.JsonMapper;

@Service
@RequiredArgsConstructor
public class ScrapperFacade {
    private final ScrappingLinkService linksService;
    private final ScrappingLinkListenerService linkListenersService;
    private final ScrapperLinkMetaDataService metaDataService;
    private final ScheduleUpdatesOnLinksService scheduleLinksService;

    private final ScrappingLinksRepository linksRepository; // TODO rm and move to stateful mapper

    public void deleteLinkScheduling(RemoveLinkRequest request, Long tgChatID) {
        var listener = linkListenersService.getLinkListenerOrThrow(tgChatID.toString(), ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        var link = linksRepository.getScrapperLinkIDByURI(request.getLink())
            .orElseThrow(() -> new LinkNotFoundException(request.getLink()));
        linksService.deleteLinkForLinkListener(link, listener);
    }

    public ListLinksResponse getSchedulingLinks(Long tgChatID) {
        var listener = linkListenersService.getLinkListenerOrThrow(tgChatID.toString(), ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        return LinksApiMapper.map(
                metaDataService.enrichWithMetaData(linksService.getAllListeningLinks(listener), listener));
    }

    public LinkResponse scheduleLink(AddLinkRequest addLinkRequest, Long tgChatID) {
        var listener = linkListenersService.getLinkListenerOrThrow(tgChatID.toString(), ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
        var link = linksService.addLinkToListen(addLinkRequest, listener);
        if (scheduleLinksService.getLinkScrappers(link).isEmpty()) {
            throw new ScrappingURIValidationException(link.uri());
        }
        return LinksApiMapper.map(metaDataService.addMetaData(addLinkRequest, tgChatID, link));
    }

    public void deleteTgChat(Long tgChatID) {
        linkListenersService.deleteLinkListener(
            linkListenersService.getLinkListenerOrThrow(tgChatID.toString(), ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER)
        );
    }

    public void addTgChat(Long tgChatID) {
        linkListenersService.addLinkListener(tgChatID.toString(), ScrapperLinkListenerType.TELEGRAM_CHAT_LISTENER);
    }
}
