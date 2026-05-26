package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.adapter.controller.UpdatesScrapperHTTPController;
import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
import backend.academy.linktracker.bot.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.bot.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.bot.usecase.dto.generated.ListLinksResponse;
import backend.academy.linktracker.bot.usecase.dto.generated.RemoveLinkRequest;
import backend.academy.linktracker.bot.usecase.exception.DomainException;
import java.net.URI;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ScrapperUpdatesService {
    private final UpdatesScrapperHTTPController scrapperHTTPClient;

    public void registerChat(TelegramBotChatID chatID) throws DomainException {
        scrapperHTTPClient.registerChat(chatID.getID());
    }

    public void deleteChat(TelegramBotChatID chatID) throws DomainException {
        scrapperHTTPClient.deleteChat(chatID.getID());
    }

    public ListLinksResponse listLinks(TelegramBotChatID chatID) throws DomainException {
        return scrapperHTTPClient.listLinks(chatID.getID());
    }

    public LinkResponse trackLink(TelegramBotChatID chatID, String link, List<String> tags, List<String> filters)
            throws DomainException {
        try {
            registerChat(chatID);
        } catch (DomainException e) {
            log.atDebug().addKeyValue("chat id", chatID.getID()).log("Failed to register chat");
        } // Do not care
        return scrapperHTTPClient.trackLink(
                chatID.getID(),
                new AddLinkRequest().link(URI.create(link)).tags(tags).filters(filters)); // TODO add uri check
    }

    public LinkResponse untrackLink(TelegramBotChatID chatID, String link) throws DomainException {
        return scrapperHTTPClient.untrackLink(chatID.getID(), new RemoveLinkRequest().link(URI.create(link)));
    }
}
