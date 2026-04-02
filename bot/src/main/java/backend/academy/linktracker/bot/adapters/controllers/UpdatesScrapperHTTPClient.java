package backend.academy.linktracker.bot.adapters.controllers;

import backend.academy.linktracker.bot.properties.UpdatedScrapperApiProperties;
import backend.academy.linktracker.bot.usecases.dtos.AddLinkRequest;
import backend.academy.linktracker.bot.usecases.dtos.ApiErrorResponse;
import backend.academy.linktracker.bot.usecases.dtos.LinkResponse;
import backend.academy.linktracker.bot.usecases.dtos.ListLinksResponse;
import backend.academy.linktracker.bot.usecases.dtos.RemoveLinkRequest;
import io.github.resilience4j.core.functions.Either;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

@Slf4j
@Component
@RefreshScope
// TODO is either fine in such context? Перейду чуть на русский - вот действительно интересный вопрос
// просто на конкретно java код я не мега насмотрен, но разница между использование ex vs Either/Optional
// в данном случае в том, что приходится везде прописывать эти контексты объекта, но мы меняем это
// на `линейность` потока исполнения - я чуть поспрашивал и мне сказали, что такое видели - но как будто не мега принято
public class UpdatesScrapperHTTPClient {
    private UpdatedScrapperApiProperties configuration;
    private RestClient restClient;
    private static final String TG_CHAT_ID_HEADER = "Tg-Chat-Id";

    public UpdatesScrapperHTTPClient(UpdatedScrapperApiProperties configuration) {
        this.configuration = configuration;
        restClient = RestClient.create(configuration.getApiPath());
    }

    public Optional<ApiErrorResponse> registerChat(String chatID) {
        return doRequestWithEmptyResult(() -> restClient
                .post()
                .uri(uriBuilder ->
                    uriBuilder.path(configuration.getPaths().getAddChat()).build(chatID))
                .retrieve()
                .toBodilessEntity(),
            List.of(HttpStatus.BAD_REQUEST, HttpStatus.CONFLICT)
        );
    }

    public Optional<ApiErrorResponse> deleteChat(String chatID) {
        return doRequestWithEmptyResult(() -> restClient
            .delete()
            .uri(uriBuilder -> uriBuilder
                .path(configuration.getPaths().getDeleteChat())
                .build(chatID))
            .retrieve()
            .toBodilessEntity(),
            List.of(HttpStatus.BAD_REQUEST, HttpStatus.NOT_FOUND)
        );
    }

    public Either<ListLinksResponse, ApiErrorResponse> listLinks(String chatID) {
        return doRequest(() -> restClient
            .get()
            .uri(configuration.getPaths().getListLinks())
            .header(TG_CHAT_ID_HEADER, chatID)
            .retrieve()
            .toEntity(ListLinksResponse.class),
            List.of(HttpStatus.BAD_REQUEST, HttpStatus.NOT_FOUND)
        );
    }

    public Either<LinkResponse, ApiErrorResponse> trackLink(String chatID, AddLinkRequest request) {
        return doRequest(() -> restClient
            .post()
            .uri(configuration.getPaths().getTrackLink())
            .header(TG_CHAT_ID_HEADER, chatID)
            .body(request)
            .retrieve()
            .toEntity(LinkResponse.class),
            List.of(HttpStatus.BAD_REQUEST, HttpStatus.NOT_FOUND, HttpStatus.CONFLICT)
        );
    }

    public Either<LinkResponse, ApiErrorResponse> untrackLink(String chatID, RemoveLinkRequest request) {
        return doRequest(() -> restClient
                .method(HttpMethod.DELETE) // Can't use .delete() cause it is not really accepted decision to use body in delete requests
                .uri(configuration.getPaths().getUntrackLink())
                .header(TG_CHAT_ID_HEADER, chatID)
                .body(request)
                .retrieve()
                .toEntity(LinkResponse.class),
            List.of(HttpStatus.BAD_REQUEST, HttpStatus.NOT_FOUND)
        );
    }

    public Optional<ApiErrorResponse> doRequestWithEmptyResult(Supplier<ResponseEntity<Void>> request, Collection<HttpStatus> expectedStatuses) {
        return Optional.ofNullable(doRequest(request, expectedStatuses).getOrNull());
    }

    public <T> Either<T, ApiErrorResponse> doRequest(Supplier<ResponseEntity<T>> request, Collection<HttpStatus> expectedStatuses) throws HttpServerErrorException {
        try {
            return Either.left(request.get().getBody());
        } catch (HttpClientErrorException exception) {
            if (!expectedStatuses.stream().map(HttpStatus::value).toList().contains(exception.getStatusCode().value())) {
                log.atError()
                    .addKeyValue("status text", exception.getStatusText())
                    .addKeyValue("status code", exception.getStatusCode())
                    .log("Got unexpected bad status code");
            }
            return Either.right(exception.getResponseBodyAs(ApiErrorResponse.class));
        }
    }
}
