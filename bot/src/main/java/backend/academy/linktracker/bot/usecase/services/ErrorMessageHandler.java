package backend.academy.linktracker.bot.usecase.services;

import backend.academy.linktracker.bot.usecase.dtos.models.ApiErrorResponse;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.commands.CancelMessageHandler;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ErrorMessageHandler {
    private final BotChatMetaDataService replyServiceMatcher;
    private final CancelMessageHandler cancelMessageHandler;

    public void handleErrorScrapperResponse(
            LinkTracerNewMessageEvent event, ApiErrorResponse response, Map<HttpStatus, String> errorMessages) {
        // It was hard decision to use http codes inside business - but alternatives are hard to implement
        String reply = errorMessages.get(
                HttpStatus.resolve(Integer.parseInt(response.getCode().orElse(""))));
        if (!reply.isBlank()) {
            replyServiceMatcher
                    .getReplyService(event.getMessage().chat().getId())
                    .orElseThrow()
                    .sendMessage(event.getMessage().chat().getId().getNumericID(), reply);
        }
        cancelMessageHandler.processBotError(event, reply.isBlank());
    }
}
