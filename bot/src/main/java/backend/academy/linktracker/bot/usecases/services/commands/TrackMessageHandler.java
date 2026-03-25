package backend.academy.linktracker.bot.usecases.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enums.ChatCommandFlowState;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecases.services.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecases.services.UserChatStateMachineConcurrentService;
import java.util.Arrays;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/track")
public class TrackMessageHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    private static final String BASIC_TRACK_REPLY =
            "Введите github repo/stackoverflow question ссылку которую вы хотите отслеживать"; // TODO check if it makes
    // sense to move to
    // storage
    private static final String BASIC_TAGS_REPLY =
            "Ссылка принята к отслеживанию"; // TODO check if it makes sense to move to storage
    private static final String BASIC_URL_REPLY = "Введите теги к данной ссылке разделённые запятыми";

    private final EventsStateWatcher eventsStateWatcher;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;
    private final ApplicationContext applicationContext;
    private final ScrapperUpdatesService scrapper;

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/")) {
            handleTags(event);
        }
        if (!event.getMessage().message().strip().startsWith("/track")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle /track user message");

        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().id());

        commandsSharedStateService.setChatSharedState(
                message.chat().id(),
                sharedState
                        .withCommandFlowState(ChatCommandFlowState.WAITING_USER_INPUT)
                        .withProcessingCommand("/track")
                        .withProcessingCommandStep(0));
        event.getReplyService(applicationContext)
                .sendMessage(message.chat().id().getNumericID(), BASIC_TRACK_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }

    public void handleTags(LinkTracerNewMessageEvent event) {
        TelegramBotMessage message = event.getMessage();
        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().id());

        if (!sharedState.getProcessingCommand().equals("/track")) {
            return;
        }

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle tags for /track command");

        if (sharedState.getCommandFlowState() != ChatCommandFlowState.WAITING_USER_INPUT) {
            log.warn("Suspiciously got not waiting flow state in command handler");
            return;
        }

        switch (sharedState.getProcessingCommandStep()) { // TODO make enum with steps
            case 0:
                handleUrlSet(event, message, sharedState);
                break;
            case 1:
                handleTagsSet(event, message, sharedState);
                break;
            default:
                throw new IllegalArgumentException("Got unexpected processing command step");
        }

        eventsStateWatcher.markEventAsDone(event.getEventId());
    }

    private void handleUrlSet(
            LinkTracerNewMessageEvent event, TelegramBotMessage message, ChatSharedState sharedState) {
        commandsSharedStateService.setChatSharedState(
                message.chat().id(), sharedState.withProcessingCommandStep(1).withProcessingMessage(message));
        event.getReplyService(applicationContext)
                .sendMessage(message.chat().id().getNumericID(), BASIC_URL_REPLY);
    }

    private void handleTagsSet(
            LinkTracerNewMessageEvent event, TelegramBotMessage message, ChatSharedState sharedState) {
        var tags =
                Arrays.stream(message.message().split(",")).map(String::strip).toList();
        scrapper.trackLink(
                event.getMessage().chat().id(),
                sharedState.getProcessingMessages().getLast().message(),
                tags,
                List.of()); // TODO add check on empty proc msgs
        commandsSharedStateService.setChatSharedState(message.chat().id(), new ChatSharedState());
        event.getReplyService(applicationContext)
                .sendMessage(message.chat().id().getNumericID(), BASIC_TAGS_REPLY);
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
