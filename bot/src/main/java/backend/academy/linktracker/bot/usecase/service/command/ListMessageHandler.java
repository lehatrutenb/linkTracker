package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.core.entity.LinkTag;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.dto.generated.ListLinksResponse;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.exception.NotFoundException;
import backend.academy.linktracker.bot.usecase.service.CommandsLoggingBuilder;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import java.util.Arrays;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/list")
public class ListMessageHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    public static final String BASIC_REPLY = "Список отслеживаемых ссылок:\n";
    public static final String NO_LINKS_TRACKED_URL_REPLY = "В данный момент ссылки не отслеживаются";

    private final EventsStateWatcher eventsStateWatcher;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;
    private final ScrapperUpdatesService updatesService;
    private final CancelMessageHandler cancelMessageHandler;
    private final LinkTracerTelegramBotClient linkTracerTelegramBotReplier;

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/list")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        CommandsLoggingBuilder.buildLoggingMessage(message).log("Handle /list user command");

        commandsSharedStateService.setChatSharedState(message.chat().id(), new ChatSharedState());
        // Skip command to get tag
        var tag = Arrays.stream(message.message().strip().split(" "))
                .skip(1)
                .findFirst()
                .map(LinkTag::new);

        try {
            var response = updatesService.listLinks(message.chat().id());
            linkTracerTelegramBotReplier.sendMessage(message.chat().id().getNumericID(), getReply(response, tag));
        } catch (NotFoundException e) {
            linkTracerTelegramBotReplier.sendMessage(
                    event.getMessage().chat().id().getNumericID(), NO_LINKS_TRACKED_URL_REPLY);
        } catch (Exception e) {
            cancelMessageHandler.onBotError(event, true);
        } finally {
            eventsStateWatcher.markEventAsDone(event.getEventID());
        }
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
    public boolean supportsAsyncExecution() {
        return false;
    }
}
