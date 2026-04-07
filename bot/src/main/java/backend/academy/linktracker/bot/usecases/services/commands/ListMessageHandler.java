package backend.academy.linktracker.bot.usecases.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.LinkTag;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecases.dtos.models.ApiErrorResponse;
import backend.academy.linktracker.bot.usecases.dtos.models.ListLinksResponse;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecases.services.ReplyServiceMatcherService;
import backend.academy.linktracker.bot.usecases.services.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecases.services.UserChatStateMachineConcurrentService;
import java.util.Arrays;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * Public methods and fields started with `_` for testing purposes only.
 * Do not use in production code.
 */
@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/list")
public class ListMessageHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    public static final String _BASIC_REPLY = "Список отслеживаемых ссылок:\n";
    public static final String _NO_LINKS_TRACKED_URL_REPLY = "В данный момент ссылки не отслеживаются";

    private final EventsStateWatcher eventsStateWatcher;
    private final ApplicationContext applicationContext;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;
    private final ScrapperUpdatesService updatesService;
    private final CancelMessageHandler cancelMessageHandler;
    private final ReplyServiceMatcherService replyServiceMatcher;

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/list")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        log.atInfo()
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle /list user command");

        commandsSharedStateService.setChatSharedState(message.chat().id(), new ChatSharedState());
        // Skip command to get tag
        var tag = Arrays.stream(message.message().strip().split(" "))
                .skip(1)
                .findFirst()
                .map(LinkTag::new);

        var response = updatesService.listLinks(message.chat().id());
        if (response.isRight()) {
            handleErrorScrapperResponse(event, response.get());
            return;
        }

        replyServiceMatcher
                .getReplyService(event.getMessage().chat().id())
                .orElseThrow()
                .sendMessage(message.chat().id().getNumericID(), getReply(response.getLeft(), tag));
        eventsStateWatcher.markEventAsDone(event.getEventId());
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

    @Override
    public boolean supportsAsyncExecution() {
        return false;
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
                    .getReplyService(event.getMessage().chat().id())
                    .orElseThrow()
                    .sendMessage(event.getMessage().chat().id().getNumericID(), reply);
        }
        cancelMessageHandler.onBotError(event, reply.isBlank());
    }
}
