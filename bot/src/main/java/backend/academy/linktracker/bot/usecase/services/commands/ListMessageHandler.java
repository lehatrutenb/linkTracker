package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.LinkTag;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.dtos.models.ApiErrorResponse;
import backend.academy.linktracker.bot.usecase.dtos.models.ListLinksResponse;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;
import java.util.Arrays;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

/**
 * Public methods and fields started with `_` for testing purposes only.
 * Do not use in production code.
 */
@Slf4j
@Service
@CommandHandler(command = "/list")
public class ListMessageHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    public static final String _BASIC_REPLY = "Список отслеживаемых ссылок:\n";
    public static final String _NO_LINKS_TRACKED_URL_REPLY = "В данный момент ссылки не отслеживаются";

    private final ScrapperUpdatesService updatesService;
    private final CancelMessageHandler cancelMessageHandler;

    public ListMessageHandler(EventsStateWatcher eventsStateWatcher, UserChatStateMachineConcurrentService commandsSharedStateService, BotChatMetaDataService replyServiceMatcher, ScrapperUpdatesService updatesService, CancelMessageHandler cancelMessageHandler) {
        super(eventsStateWatcher, commandsSharedStateService, replyServiceMatcher);
        this.updatesService = updatesService;
        this.cancelMessageHandler = cancelMessageHandler;
    }

    public String getReply(ListLinksResponse response, Optional<LinkTag> tag) {
        var links = response.getLinks();
        if (links.isEmpty()) {
            return _NO_LINKS_TRACKED_URL_REPLY;
        }
        if (tag.isPresent()) {
            links = links.stream()
                    .filter(link -> link.getTags().contains(tag.orElseThrow().tag()))
                    .toList();
        }
        return _BASIC_REPLY
                + String.join(
                        "\n",
                        links.stream()
                                .map(link -> link.getUrl() + " - " + Strings.join(link.getTags(), ','))
                                .toList());
    }

    public void handleErrorScrapperResponse(LinkTracerNewMessageEvent event, ApiErrorResponse response) {
        // It was hard decision to use http codes inside business - but alternatives are hard to implement
        String reply =
                switch (HttpStatus.resolve(
                        Integer.parseInt(response.getCode().orElse(HttpStatus.INTERNAL_SERVER_ERROR.toString())))) {
                    case HttpStatus.NOT_FOUND -> _NO_LINKS_TRACKED_URL_REPLY;
                    default -> "";
                };
        if (!reply.isBlank()) {
            replyServiceMatcher
                    .getReplyService(event.getMessage().chat().getId())
                    .orElseThrow()
                    .sendMessage(event.getMessage().chat().getId().getNumericID(), reply);
        }
        cancelMessageHandler.processBotError(event, reply.isBlank());
    }

    @Override
    public void processEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/list")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        log.atInfo()
                .addKeyValue("chat id", message.chat().getId())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle /list user command");

        commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());
        // Skip command to get tag
        var tag = Arrays.stream(message.message().strip().split(" "))
                .skip(1)
                .findFirst()
                .map(LinkTag::new);

        var response = updatesService.listLinks(message.chat().getId());
        if (response.isRight()) {
            handleErrorScrapperResponse(event, response.get());
            return;
        }

        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), getReply(response.getLeft(), tag));
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }
}
