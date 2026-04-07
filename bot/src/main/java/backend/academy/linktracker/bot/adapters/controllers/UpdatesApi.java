package backend.academy.linktracker.bot.adapters.controllers;

import backend.academy.linktracker.bot.usecases.LinkTracerFacade;
import backend.academy.linktracker.bot.usecases.dtos.models.ApiErrorResponse;
import backend.academy.linktracker.bot.usecases.dtos.models.LinkUpdate;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.validation.Valid;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Public methods and fields started with `_` for testing purposes only.
 * Do not use in production code.
 */
@Validated
@Tag(name = "updates", description = "the updates API")
@RequiredArgsConstructor
@Controller
public class UpdatesApi {
    private final LinkTracerFacade facade;

    public static final String _PATH_UPDATES_POST = "/updates";
    /**
     * POST /updates : Отправить обновление
     *
     * @param linkUpdate  (required)
     * @return Обновление обработано (status code 200)
     *         or Некорректные параметры запроса (status code 400)
     */
    @Operation(
            operationId = "updatesPost",
            summary = "Отправить обновление",
            responses = {
                @ApiResponse(responseCode = "200", description = "Обновление обработано"),
                @ApiResponse(
                        responseCode = "400",
                        description = "Некорректные параметры запроса",
                        content = {
                            @Content(
                                    mediaType = "application/json",
                                    schema = @Schema(implementation = ApiErrorResponse.class))
                        })
            })
    @RequestMapping(
            method = RequestMethod.POST,
            value = _PATH_UPDATES_POST,
            produces = {"application/json"},
            consumes = {"application/json"})
    public ResponseEntity<Void> updatesPost(
            @Parameter(name = "LinkUpdate", description = "", required = true) @Valid @RequestBody
                    LinkUpdate linkUpdate) {
        facade.processScrapperUpdates(List.of(linkUpdate));
        return new ResponseEntity<>(HttpStatus.OK); // TODO No error handling
    }
}
