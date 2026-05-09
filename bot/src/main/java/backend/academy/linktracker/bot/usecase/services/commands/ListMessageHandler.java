package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.LinkTag;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.dtos.models.ListLinksResponse;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.services.ErrorMessageHandler;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;
import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
    private final ErrorMessageHandler errorMessageHandler;

    public ListMessageHandler(
            EventsStateWatcher eventsStateWatcher,
            UserChatStateMachineConcurrentService commandsSharedStateService,
            BotChatMetaDataService replyServiceMatcher,
            ScrapperUpdatesService updatesService,
            ErrorMessageHandler errorMessageHandler) {
        super(eventsStateWatcher, commandsSharedStateService, replyServiceMatcher);
        this.updatesService = updatesService;
        this.errorMessageHandler = errorMessageHandler;
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
            errorMessageHandler.handleErrorScrapperResponse(
                    event, response.get(), Map.of(HttpStatus.NOT_FOUND, _NO_LINKS_TRACKED_URL_REPLY));
            return;
        }

        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), getReply(response.getLeft(), tag));
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }
}
