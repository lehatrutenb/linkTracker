package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enums.ChatCommandFlowState;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.services.ErrorMessageHandler;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

/**
 * Public methods and fields started with `_` for testing purposes only.
 * Do not use in production code.
 */
@Slf4j
@Service
@CommandHandler(command = "/track")
public class TrackMessageHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    public static final String _BASIC_TRACK_REPLY =
            "Введите github repo/stackoverflow question ссылку которую вы хотите отслеживать";
    // sense to move to
    // storage
    public static final String _BASIC_TAGS_REPLY =
            "Ссылка принята к отслеживанию"; // TODO check if it makes sense to move to storage
    public static final String _BASIC_URL_REPLY = "Введите теги к данной ссылке разделённые запятыми";
    public static final String _INVALID_URL_REPLY = "Полученная ссылка не поддерживается к отслеживанию";
    public static final String _URL_ALREADY_TRACKED_REPLY = "Данная ссылка уже отслеживается. Отпишитесь для начала";

    private final ScrapperUpdatesService scrapper;
    private final ErrorMessageHandler errorMessageHandler;

    public TrackMessageHandler(
            EventsStateWatcher eventsStateWatcher,
            UserChatStateMachineConcurrentService commandsSharedStateService,
            BotChatMetaDataService replyServiceMatcher,
            ScrapperUpdatesService scrapper,
            ErrorMessageHandler errorMessageHandler) { // TODO :(
        super(eventsStateWatcher, commandsSharedStateService, replyServiceMatcher);
        this.scrapper = scrapper;
        this.errorMessageHandler = errorMessageHandler;
    }

    public void handleTags(LinkTracerNewMessageEvent event) {
        TelegramBotMessage message = event.getMessage();
        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().getId());

        if (!sharedState.getProcessingCommand().equals("/track")) {
            return;
        }

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().getId())
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

    public void handleUrlSet(LinkTracerNewMessageEvent event, TelegramBotMessage message, ChatSharedState sharedState) {
        commandsSharedStateService.setChatSharedState(
                message.chat().getId(), sharedState.withProcessingCommandStep(1).withProcessingMessage(message));
        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), _BASIC_URL_REPLY);
    }

    public void handleTagsSet(
            LinkTracerNewMessageEvent event, TelegramBotMessage message, ChatSharedState sharedState) {
        var tags =
                Arrays.stream(message.message().split(",")).map(String::strip).toList();
        var response = scrapper.trackLink(
                event.getMessage().chat().getId(),
                sharedState.getProcessingMessages().getLast().message(),
                tags,
                List.of()); // TODO add check on empty proc msgs
        if (response.isRight()) {
            errorMessageHandler.handleErrorScrapperResponse(
                    event,
                    response.get(),
                    Map.of(
                            HttpStatus.CONFLICT,
                            _URL_ALREADY_TRACKED_REPLY,
                            HttpStatus.BAD_REQUEST,
                            _INVALID_URL_REPLY));
            return;
        }
        commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());
        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), _BASIC_TAGS_REPLY);
    }

    @Override
    public void processEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/")) {
            handleTags(event);
        }
        if (!event.getMessage().message().strip().startsWith("/track")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().getId())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle /track user message");

        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().getId());

        commandsSharedStateService.setChatSharedState(
                message.chat().getId(),
                sharedState
                        .withCommandFlowState(ChatCommandFlowState.WAITING_USER_INPUT)
                        .withProcessingCommand("/track")
                        .withProcessingCommandStep(0));
        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), _BASIC_TRACK_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }
}
