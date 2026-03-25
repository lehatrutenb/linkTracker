package backend.academy.linktracker.scrapper.usecases;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLinkListener;
import backend.academy.linktracker.scrapper.usecases.dtos.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecases.dtos.LinkResponse;
import backend.academy.linktracker.scrapper.usecases.dtos.ListLinksResponse;
import backend.academy.linktracker.scrapper.usecases.dtos.RemoveLinkRequest;
import backend.academy.linktracker.scrapper.usecases.mappers.LinkListenersMapper;
import backend.academy.linktracker.scrapper.usecases.mappers.LinksApiMapper;
import backend.academy.linktracker.scrapper.usecases.services.ScrapperLinkMetaDataService;
import backend.academy.linktracker.scrapper.usecases.services.ScrappingLinkListenersService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tools.jackson.databind.json.JsonMapper;

@Service
@RequiredArgsConstructor
public class ScrapperFacade {
    private final ScrappingLinkListenersService linkListenerService;
    private final ScrapperLinkMetaDataService metaDataService;
    private final JsonMapper jsonMapper;

    public void deleteLinkScheduling(RemoveLinkRequest request, Long tgChatID) {
        linkListenerService.deleteLinkForLinkListener(request, tgChatID.toString());
    }

    public ListLinksResponse getSchedulingLinks(Long tgChatID) {
        ScrapperLinkListener listener = LinkListenersMapper.map(tgChatID);
        return LinksApiMapper.map(
                metaDataService.enrichWithMetaData(linkListenerService.getAllListeningLinks(listener), listener));
    }

    public LinkResponse scheduleLink(AddLinkRequest addLinkRequest, Long tgChatID) {
        var link = linkListenerService.addLinkToListen(addLinkRequest, tgChatID.toString());
        return LinksApiMapper.map(metaDataService.addMetaData(addLinkRequest, tgChatID, link));
    }

    public void deleteTgChat(Long tgChatID) {
        linkListenerService.deleteLinkListener(tgChatID.toString());
    }

    public void addTgChat(Long tgChatID) {
        linkListenerService.addLinkListener(tgChatID.toString());
    }
}
