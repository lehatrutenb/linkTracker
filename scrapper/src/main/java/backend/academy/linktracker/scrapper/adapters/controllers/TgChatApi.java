package backend.academy.linktracker.scrapper.adapters.controllers;

import backend.academy.linktracker.scrapper.usecases.ScrapperFacade;
import backend.academy.linktracker.scrapper.usecases.dtos.ApiErrorResponse;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;

@Validated
@Tag(name = "tg-chat", description = "the tg-chat API")
@Controller
@RequiredArgsConstructor
/**
 * Public methods and fields started with `_` for testing purposes only.
 * Do not use in production code.
 */
public class TgChatApi {
    private final ScrapperFacade scrapperFacade;

    private Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    public static final String _PATH_TG_CHAT_ID_DELETE = "/tg-chat/{id}";
    /**
     * DELETE /tg-chat/{id} : Удалить чат
     *
     * @param id  (required)
     * @return Чат успешно удалён (status code 200)
     *         or Некорректные параметры запроса (status code 400)
     *         or Чат не существует (status code 404)
     */
    @Operation(
            operationId = "tgChatIdDelete",
            summary = "Удалить чат",
            responses = {
                @ApiResponse(responseCode = "200", description = "Чат успешно удалён"),
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
            method = RequestMethod.DELETE,
            value = TgChatApi._PATH_TG_CHAT_ID_DELETE,
            produces = {"application/json"})
    public ResponseEntity<Void> tgChatIdDelete(
            @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id")
                    Long id) {
        scrapperFacade.deleteTgChat(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    public static final String _PATH_TG_CHAT_ID_POST = "/tg-chat/{id}";
    /**
     * POST /tg-chat/{id} : Зарегистрировать чат
     *
     * @param id  (required)
     * @return Чат зарегистрирован (status code 200)
     *         or Некорректные параметры запроса (status code 400)
     *         or Чат уже существует (status code 409)
     */
    @Operation(
            operationId = "tgChatIdPost",
            summary = "Зарегистрировать чат",
            responses = {
                @ApiResponse(responseCode = "200", description = "Чат зарегистрирован"),
                @ApiResponse(
                        responseCode = "400",
                        description = "Некорректные параметры запроса",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ApiErrorResponse.class))
                        }),
                @ApiResponse(
                        responseCode = "409",
                        description = "Чат уже существует",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ApiErrorResponse.class))
                        })
            })
    @RequestMapping(
            method = RequestMethod.POST,
            value = TgChatApi._PATH_TG_CHAT_ID_POST,
            produces = {"application/json"})
    public ResponseEntity<Void> tgChatIdPost(
            @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id")
                    Long id) {
        scrapperFacade.addTgChat(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
