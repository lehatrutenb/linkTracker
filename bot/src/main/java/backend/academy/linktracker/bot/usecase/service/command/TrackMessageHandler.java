package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enumeration.ChatCommandFlowState;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.exception.BadOuterRequestException;
import backend.academy.linktracker.bot.usecase.exception.ConflictException;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@CommandHandler(command = "/track")
public class TrackMessageHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    public static final String BASIC_TRACK_REPLY =
            "Введите github repo/stackoverflow question ссылку которую вы хотите отслеживать";
    // sense to move to
    // storage
    public static final String BASIC_TAGS_REPLY =
            "Ссылка принята к отслеживанию"; // TODO check if it makes sense to move to storage
    public static final String BASIC_URL_REPLY = "Введите теги к данной ссылке разделённые запятыми";
    public static final String INVALID_URL_REPLY = "Полученная ссылка не поддерживается к отслеживанию";
    public static final String URL_ALREADY_TRACKED_REPLY = "Данная ссылка уже отслеживается. Отпишитесь для начала";

    private final ScrapperUpdatesService scrapper;
    private final CancelMessageHandler cancelMessageHandler;
    private final LinkTracerTelegramBotClient telegramBotClient;

    public TrackMessageHandler(
            EventsStateWatcher eventsStateWatcher,
            UserChatStateMachineConcurrentService commandsSharedStateService,
            ScrapperUpdatesService scrapper,
            CancelMessageHandler cancelMessageHandler,
            LinkTracerTelegramBotClient telegramBotClient) { // TODO :(
        super(eventsStateWatcher, commandsSharedStateService);
        this.scrapper = scrapper;
        this.cancelMessageHandler = cancelMessageHandler;
        this.telegramBotClient = telegramBotClient;
    }

    public void handleTags(LinkTracerNewMessageEvent event) {
        TelegramBotMessage message = event.getMessage();
        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().getId());

        if (!sharedState.getProcessingCommand().equals("/track")) {
            return;
        }

        log.atInfo().log("Handle tags for /track command");

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

        eventsStateWatcher.markEventAsDone(event.getEventID());
    }

    public void handleUrlSet(LinkTracerNewMessageEvent event, TelegramBotMessage message, ChatSharedState sharedState) {
        commandsSharedStateService.setChatSharedState(
                message.chat().getId(), sharedState.withProcessingCommandStep(1).withProcessingMessage(message));
        telegramBotClient.sendMessage(message.chat().getId().getNumericID(), BASIC_URL_REPLY);
    }

    public void handleTagsSet(
            LinkTracerNewMessageEvent event, TelegramBotMessage message, ChatSharedState sharedState) {
        var tags =
                Arrays.stream(message.message().split(",")).map(String::strip).toList();
        try {
            scrapper.trackLink(
                    event.getMessage().chat().getId(),
                    sharedState.getProcessingMessages().getLast().message(),
                    tags,
                    List.of()); // TODO add check on empty proc msgs
            commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());
            telegramBotClient.sendMessage(message.chat().getId().getNumericID(), BASIC_TAGS_REPLY);
        } catch (BadOuterRequestException e) {
            telegramBotClient.sendMessage(message.chat().getId().getNumericID(), INVALID_URL_REPLY);
        } catch (ConflictException e) {
            telegramBotClient.sendMessage(message.chat().getId().getNumericID(), URL_ALREADY_TRACKED_REPLY);
        } catch (Exception e) {
            log.atError().setCause(e).log("Failed to handle /track tags");
            cancelMessageHandler.processBotError(event, true);
        } finally {
            eventsStateWatcher.markEventAsDone(event.getEventID());
        }
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

        log.atInfo().log("Handle /track user message");

        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().getId());

        commandsSharedStateService.setChatSharedState(
                message.chat().getId(),
                sharedState
                        .withCommandFlowState(ChatCommandFlowState.WAITING_USER_INPUT)
                        .withProcessingCommand("/track")
                        .withProcessingCommandStep(0));
        telegramBotClient.sendMessage(message.chat().getId().getNumericID(), BASIC_TRACK_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }
}
