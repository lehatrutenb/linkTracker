package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.core.entity.LinkTag;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.dto.generated.ListLinksResponse;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.exception.NotFoundException;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import java.util.Arrays;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@CommandHandler(command = "/list")
public class ListMessageHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    public static final String BASIC_REPLY = "Список отслеживаемых ссылок:\n";
    public static final String NO_LINKS_TRACKED_URL_REPLY = "В данный момент ссылки не отслеживаются";

    private final ScrapperUpdatesService updatesService;
    private final CancelMessageHandler cancelMessageHandler;
    private final LinkTracerTelegramBotClient telegramBotClient;

    public ListMessageHandler(
            EventsStateWatcher eventsStateWatcher,
            UserChatStateMachineConcurrentService commandsSharedStateService,
            ScrapperUpdatesService updatesService,
            CancelMessageHandler cancelMessageHandler,
            LinkTracerTelegramBotClient telegramBotClient) {
        super(eventsStateWatcher, commandsSharedStateService);
        this.updatesService = updatesService;
        this.cancelMessageHandler = cancelMessageHandler;
        this.telegramBotClient = telegramBotClient;
    }

    public String getReply(ListLinksResponse response, Optional<LinkTag> tag) {
        var links = response.getLinks();
        if (links.isEmpty()) {
            return NO_LINKS_TRACKED_URL_REPLY;
        }
        if (tag.isPresent()) {
            links = links.stream()
                    .filter(link -> link.getTags().contains(tag.orElseThrow().tag()))
                    .toList();
        }
        return BASIC_REPLY
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
        log.atInfo().log("Handle /list user command");

        commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());
        // Skip command to get tag
        var tag = Arrays.stream(message.message().strip().split(" "))
                .skip(1)
                .findFirst()
                .map(LinkTag::new);

        try {
            var response = updatesService.listLinks(message.chat().getId());
            telegramBotClient.sendMessage(message.chat().getId().getNumericID(), getReply(response, tag));
        } catch (NotFoundException e) {
            telegramBotClient.sendMessage(message.chat().getId().getNumericID(), NO_LINKS_TRACKED_URL_REPLY);
        } catch (Exception e) {
            cancelMessageHandler.processBotError(event, true);
        } finally {
            eventsStateWatcher.markEventAsDone(event.getEventID());
        }
    }
}
