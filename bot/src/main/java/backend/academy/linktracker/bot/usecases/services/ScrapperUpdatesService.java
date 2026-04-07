package backend.academy.linktracker.bot.usecases.services;

import backend.academy.linktracker.bot.adapters.controllers.UpdatesScrapperHTTPClient;
import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import backend.academy.linktracker.bot.usecases.dtos.models.AddLinkRequest;
import backend.academy.linktracker.bot.usecases.dtos.models.ApiErrorResponse;
import backend.academy.linktracker.bot.usecases.dtos.models.LinkResponse;
import backend.academy.linktracker.bot.usecases.dtos.models.ListLinksResponse;
import backend.academy.linktracker.bot.usecases.dtos.models.RemoveLinkRequest;
import io.github.resilience4j.core.functions.Either;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScrapperUpdatesService {
    private final UpdatesScrapperHTTPClient scrapperHTTPClient;

    public Optional<ApiErrorResponse> registerChat(TelegramBotChatID chatID) {
        return scrapperHTTPClient.registerChat(chatID.getID());
    }

    public Optional<ApiErrorResponse> deleteChat(TelegramBotChatID chatID) {
        return scrapperHTTPClient.deleteChat(chatID.getID());
    }

    public Either<ListLinksResponse, ApiErrorResponse> listLinks(TelegramBotChatID chatID) {
        return scrapperHTTPClient.listLinks(chatID.getID());
    }

    public Either<LinkResponse, ApiErrorResponse> trackLink(
            TelegramBotChatID chatID, String link, List<String> tags, List<String> filters) {
        registerChat(chatID);
        return scrapperHTTPClient.trackLink(
                chatID.getID(),
                new AddLinkRequest().link(URI.create(link)).tags(tags).filters(filters)); // TODO add uri check
    }

    public Either<LinkResponse, ApiErrorResponse> untrackLink(TelegramBotChatID chatID, String link) {
        return scrapperHTTPClient.untrackLink(chatID.getID(), new RemoveLinkRequest().link(URI.create(link)));
    }
}
