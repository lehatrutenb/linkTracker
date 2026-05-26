package backend.academy.linktracker.bot.adapter.controller;

import backend.academy.linktracker.bot.property.UpdatedScrapperApiProperties;
import backend.academy.linktracker.bot.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.bot.usecase.dto.generated.ApiErrorResponse;
import backend.academy.linktracker.bot.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.bot.usecase.dto.generated.ListLinksResponse;
import backend.academy.linktracker.bot.usecase.dto.generated.RemoveLinkRequest;
import backend.academy.linktracker.bot.usecase.exception.BadOuterRequestException;
import backend.academy.linktracker.bot.usecase.exception.ConflictException;
import backend.academy.linktracker.bot.usecase.exception.DomainException;
import backend.academy.linktracker.bot.usecase.exception.NotFoundException;
import backend.academy.linktracker.bot.usecase.exception.OuterServiceInnerException;
import java.util.function.Supplier;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;
import org.springframework.web.client.RestClient;
import org.springframework.web.client.RestClientException;

@Slf4j
@Component
@RefreshScope
public class UpdatesScrapperHTTPController {
    private UpdatedScrapperApiProperties configuration;
    private RestClient restClient;
    private static final String TG_CHAT_ID_HEADER = "Tg-Chat-Id";

    public UpdatesScrapperHTTPController(UpdatedScrapperApiProperties configuration) {
        this.configuration = configuration;
        restClient = RestClient.create(configuration.getApiPath());
    }

    public void registerChat(String chatID) throws DomainException {
        doRequest(
                () -> restClient
                        .post()
                        .uri(uriBuilder -> uriBuilder
                                .path(configuration.getPaths().getAddChat())
                                .build(chatID))
                        .retrieve()
                        .toBodilessEntity(),
                "registerChat");
    }

    public void deleteChat(String chatID) throws DomainException {
        doRequest(
                () -> restClient
                        .delete()
                        .uri(uriBuilder -> uriBuilder
                                .path(configuration.getPaths().getDeleteChat())
                                .build(chatID))
                        .retrieve()
                        .toBodilessEntity(),
                "deleteChat");
    }

    public ListLinksResponse listLinks(String chatID) throws DomainException {
        return doRequest(
                () -> restClient
                        .get()
                        .uri(configuration.getPaths().getListLinks())
                        .header(TG_CHAT_ID_HEADER, chatID)
                        .retrieve()
                        .toEntity(ListLinksResponse.class),
                "listLinks");
    }

    public LinkResponse trackLink(String chatID, AddLinkRequest request) throws DomainException {
        return doRequest(
                () -> restClient
                        .post()
                        .uri(configuration.getPaths().getTrackLink())
                        .header(TG_CHAT_ID_HEADER, chatID)
                        .body(request)
                        .retrieve()
                        .toEntity(LinkResponse.class),
                "trackLink");
    }

    public LinkResponse untrackLink(String chatID, RemoveLinkRequest request) throws DomainException {
        return doRequest(
                () -> restClient
                        .method(
                                HttpMethod
                                        .DELETE) // Can't use .delete() cause it is not really accepted decision to use
                        // body in delete requests
                        .uri(configuration.getPaths().getUntrackLink())
                        .header(TG_CHAT_ID_HEADER, chatID)
                        .body(request)
                        .retrieve()
                        .toEntity(LinkResponse.class),
                "untrackLink");
    }

    public <T> T doRequest(Supplier<ResponseEntity<T>> request, String entityName) throws DomainException {

        try {
            return request.get().getBody();
        } catch (HttpClientErrorException exception) {
            MDC.put("status text", exception.getStatusText());
            MDC.put("status code", String.valueOf(exception.getStatusCode().value()));
            MDC.put("message", exception.getMessage());
            ApiErrorResponse response = exception.getResponseBodyAs(ApiErrorResponse.class);
            switch (exception.getStatusCode()) {
                case HttpStatus.BAD_REQUEST:
                    throw new BadOuterRequestException(
                            entityName, response.getDescription().orElse(""));
                case HttpStatus.NOT_FOUND:
                    throw new NotFoundException(
                            entityName, response.getDescription().orElse(""));
                case HttpStatus.CONFLICT:
                    throw new ConflictException(
                            entityName, response.getDescription().orElse(""));
                default:
                    throw new RuntimeException(exception);
            }
        } catch (HttpServerErrorException exception) {
            MDC.put("status text", exception.getStatusText());
            MDC.put("status code", String.valueOf(exception.getStatusCode().value()));
            MDC.put("message", exception.getMessage());
            throw new OuterServiceInnerException(exception.getResponseBodyAs(ApiErrorResponse.class));
        } catch (RestClientException exception) {
            MDC.put("message", exception.getMessage());
            throw new RuntimeException(exception);
        } finally {
            log.atError().log("Got error response from scrapper");
            MDC.clear();
        }
    }
}
