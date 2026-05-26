package backend.academy.linktracker.scrapper.adapter.controller;

import backend.academy.linktracker.scrapper.usecase.ScrapperFacade;
import backend.academy.linktracker.scrapper.usecase.dto.generated.AddLinkRequest;
import backend.academy.linktracker.scrapper.usecase.dto.generated.ApiErrorResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.LinkResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.ListLinksResponse;
import backend.academy.linktracker.scrapper.usecase.dto.generated.RemoveLinkRequest;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Validated
@Tag(name = "links", description = "the links API")
@Controller
@RequiredArgsConstructor
public class LinksApiController {
    private final ScrapperFacade scrapperFacade;

    public static final String PATH_LINKS_DELETE = "/links";
    /**
     * DELETE /links : Убрать отслеживание ссылки
     *
     * @param tgChatId  (required)
     * @param removeLinkRequest  (required)
     * @return Ссылка успешно убрана (status code 200)
     *         or Некорректные параметры запроса (status code 400)
     *         or Чат не существует или ссылка не найдена (status code 404)
     */
    @Operation(
            operationId = "linksDelete",
            summary = "Убрать отслеживание ссылки",
            responses = {
                @ApiResponse(
                        responseCode = "200",
                        description = "Ссылка успешно убрана",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = LinkResponse.class))
                        }),
                @ApiResponse(
                        responseCode = "400",
                        description = "Некорректные параметры запроса",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ApiErrorResponse.class))
                        }),
                @ApiResponse(
                        responseCode = "404",
                        description = "Чат не существует или ссылка не найдена",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ApiErrorResponse.class))
                        })
            })
    @RequestMapping(
            method = RequestMethod.DELETE,
            value = PATH_LINKS_DELETE,
            produces = {"application/json"},
            consumes = {"application/json"})
    public ResponseEntity<LinkResponse> linksDelete(
            @NotNull
                    @Parameter(name = "Tg-Chat-Id", description = "", required = true, in = ParameterIn.HEADER)
                    @RequestHeader(value = "Tg-Chat-Id", required = true)
                    Long tgChatId,
            @Parameter(name = "RemoveLinkRequest", description = "", required = true) @Valid @RequestBody
                    RemoveLinkRequest removeLinkRequest) {
        scrapperFacade.deleteLinkScheduling(removeLinkRequest, tgChatId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public static final String PATH_LINKS_GET = "/links";
    /**
     * GET /links : Получить все отслеживаемые ссылки
     *
     * @param tgChatId  (required)
     * @return Ссылки успешно получены (status code 200)
     *         or Некорректные параметры запроса (status code 400)
     *         or Чат не существует (status code 404)
     */
    @Operation(
            operationId = "linksGet",
            summary = "Получить все отслеживаемые ссылки",
            responses = {
                @ApiResponse(
                        responseCode = "200",
                        description = "Ссылки успешно получены",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ListLinksResponse.class))
                        }),
                @ApiResponse(
                        responseCode = "400",
                        description = "Некорректные параметры запроса",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ApiErrorResponse.class))
                        }),
                @ApiResponse(
                        responseCode = "404",
                        description = "Чат не существует",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ApiErrorResponse.class))
                        })
            })
    @RequestMapping(
            method = RequestMethod.GET,
            value = PATH_LINKS_GET,
            produces = {"application/json"})
    public ResponseEntity<ListLinksResponse> linksGet(
            @NotNull
                    @Parameter(name = "Tg-Chat-Id", description = "", required = true, in = ParameterIn.HEADER)
                    @RequestHeader(value = "Tg-Chat-Id", required = true)
                    Long tgChatId) {
        return new ResponseEntity<>(scrapperFacade.getSchedulingLinks(tgChatId), HttpStatus.OK);
    }

    public static final String PATH_LINKS_POST = "/links";
    /**
     * POST /links : Добавить отслеживание ссылки
     *
     * @param tgChatId  (required)
     * @param addLinkRequest  (required)
     * @return Ссылка успешно добавлена (status code 200)
     *         or Некорректные параметры запроса (status code 400)
     *         or Чат не существует (status code 404)
     *         or Ссылка уже отслеживается (status code 409)
     */
    @Operation(
            operationId = "linksPost",
            summary = "Добавить отслеживание ссылки",
            responses = {
                @ApiResponse(
                        responseCode = "200",
                        description = "Ссылка успешно добавлена",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = LinkResponse.class))
                        }),
                @ApiResponse(
                        responseCode = "400",
                        description = "Некорректные параметры запроса",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ApiErrorResponse.class))
                        }),
                @ApiResponse(
                        responseCode = "404",
                        description = "Чат не существует",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ApiErrorResponse.class))
                        }),
                @ApiResponse(
                        responseCode = "409",
                        description = "Ссылка уже отслеживается",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ApiErrorResponse.class))
                        })
            })
    @RequestMapping(
            method = RequestMethod.POST,
            value = PATH_LINKS_POST,
            produces = {"application/json"},
            consumes = {"application/json"})
    public ResponseEntity<LinkResponse> linksPost(
            @NotNull
                    @Parameter(name = "Tg-Chat-Id", description = "", required = true, in = ParameterIn.HEADER)
                    @RequestHeader(value = "Tg-Chat-Id", required = true)
                    Long tgChatId,
            @Parameter(name = "AddLinkRequest", description = "", required = true) @Valid @RequestBody
                    AddLinkRequest addLinkRequest) {
        return new ResponseEntity<>(scrapperFacade.scheduleLink(addLinkRequest, tgChatId), HttpStatus.OK);
    }
}
