package backend.academy.linktracker.bot.usecases.services;

import backend.academy.linktracker.bot.adapters.controllers.UpdatesScrapperHTTPClient;
import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import backend.academy.linktracker.bot.usecases.dtos.AddLinkRequest;
import backend.academy.linktracker.bot.usecases.dtos.LinkResponse;
import backend.academy.linktracker.bot.usecases.dtos.ListLinksResponse;
import backend.academy.linktracker.bot.usecases.dtos.RemoveLinkRequest;
import java.net.URI;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScrapperUpdatesService {
    private final UpdatesScrapperHTTPClient scrapperHTTPClient;

    public void registerChat(TelegramBotChatID chatID) {
        scrapperHTTPClient.registerChat(chatID.getID());
    }

    public void deleteChat(TelegramBotChatID chatID) {
        scrapperHTTPClient.deleteChat(chatID.getID());
    }

    public ListLinksResponse listLinks(TelegramBotChatID chatID) {
        return scrapperHTTPClient.listLinks(chatID.getID());
    }

    public LinkResponse trackLink(TelegramBotChatID chatID, String link, List<String> tags, List<String> filters) {
        registerChat(chatID);
        return scrapperHTTPClient.trackLink(
                chatID.getID(),
                new AddLinkRequest().link(URI.create(link)).tags(tags).filters(filters)); // TODO add uri check
    }

    public LinkResponse untrackLink(TelegramBotChatID chatID, String link) {
        return scrapperHTTPClient.untrackLink(chatID.getID(), new RemoveLinkRequest().link(URI.create(link)));
    }
}
