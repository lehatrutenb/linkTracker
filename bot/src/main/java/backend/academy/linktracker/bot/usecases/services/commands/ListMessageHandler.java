package backend.academy.linktracker.bot.usecases.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.LinkTag;
import backend.academy.linktracker.bot.core.entities.TelegramBotChatID;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecases.services.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecases.services.UserChatStateMachineConcurrentService;
import java.util.Arrays;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.logging.log4j.util.Strings;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/list")
public class ListMessageHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY = "Список отслеживаемых ссылок:\n";

    private final EventsStateWatcher eventsStateWatcher;
    private final ApplicationContext applicationContext;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;
    private final ScrapperUpdatesService updatesService;

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
        event.getReplyService(applicationContext)
                .sendMessage(
                        message.chat().id().getNumericID(),
                        BASIC_REPLY + getFormattedLinks(message.chat().id(), tag));
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }

    public String getFormattedLinks(TelegramBotChatID chatID, Optional<LinkTag> tag) {
        var links = updatesService.listLinks(chatID).getLinks();
        if (tag.isPresent()) {
            links = links.stream()
                    .filter(link -> link.getTags().contains(tag.orElseThrow().tag()))
                    .toList();
        }
        return String.join(
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
