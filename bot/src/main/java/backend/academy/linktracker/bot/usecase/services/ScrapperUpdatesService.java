package backend.academy.linktracker.bot.usecase.services;

import backend.academy.linktracker.bot.adapter.controller.UpdatesScrapperHTTPClient;
import backend.academy.linktracker.bot.core.entities.BotChatID;
import backend.academy.linktracker.bot.usecase.dtos.models.AddLinkRequest;
import backend.academy.linktracker.bot.usecase.dtos.models.ApiErrorResponse;
import backend.academy.linktracker.bot.usecase.dtos.models.LinkResponse;
import backend.academy.linktracker.bot.usecase.dtos.models.ListLinksResponse;
import backend.academy.linktracker.bot.usecase.dtos.models.RemoveLinkRequest;
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

    public Optional<ApiErrorResponse> registerChat(BotChatID chatID) {
        return scrapperHTTPClient.registerChat(chatID.getID());
    }

    public Optional<ApiErrorResponse> deleteChat(BotChatID chatID) {
        return scrapperHTTPClient.deleteChat(chatID.getID());
    }

    public Either<ListLinksResponse, ApiErrorResponse> listLinks(BotChatID chatID) {
        return scrapperHTTPClient.listLinks(chatID.getID());
    }

    public Either<LinkResponse, ApiErrorResponse> trackLink(
            BotChatID chatID, String link, List<String> tags, List<String> filters) {
        registerChat(chatID);
        return scrapperHTTPClient.trackLink(
                chatID.getID(),
                new AddLinkRequest().link(URI.create(link)).tags(tags).filters(filters)); // TODO add uri check
    }

    public Either<LinkResponse, ApiErrorResponse> untrackLink(BotChatID chatID, String link) {
        return scrapperHTTPClient.untrackLink(chatID.getID(), new RemoveLinkRequest().link(URI.create(link)));
    }
}
