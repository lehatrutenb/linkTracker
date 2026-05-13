package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.adapter.controller.UpdatesScrapperHTTPController;
import backend.academy.linktracker.bot.core.entity.TelegramBotChatID;
import backend.academy.linktracker.bot.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.bot.usecase.dto.generated.ApiErrorResponse;
import backend.academy.linktracker.bot.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.bot.usecase.dto.generated.ListLinksResponse;
import backend.academy.linktracker.bot.usecase.dto.generated.RemoveLinkRequest;
import io.github.resilience4j.core.functions.Either;
import java.net.URI;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScrapperUpdatesService {
    private final UpdatesScrapperHTTPController scrapperHTTPClient;

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
