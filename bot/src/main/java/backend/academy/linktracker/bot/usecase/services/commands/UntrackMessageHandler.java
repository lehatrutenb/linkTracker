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
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@CommandHandler(command = "/untrack")
public class UntrackMessageHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    private static final String BASIC_TRACK_REPLY =
            "Введите github repo/stackoverflow question ссылку которую вы хотите перестать отслеживать"; // TODO check
    // if it makes
    // sense to
    // move to
    // storage
    private static final String BASIC_URL_REPLY = "Ссылка больше не будет отслеживаться";
    private static final String UNTRACKED_URL_REPLY = "Ссылка ранее не отслеживалась";

    private final ScrapperUpdatesService scrapper;
    private final ErrorMessageHandler errorMessageHandler;

    public UntrackMessageHandler(
            EventsStateWatcher eventsStateWatcher,
            UserChatStateMachineConcurrentService commandsSharedStateService,
            BotChatMetaDataService replyServiceMatcher,
            ScrapperUpdatesService scrapper,
            ErrorMessageHandler errorMessageHandler) { // TODO :(
        super(eventsStateWatcher, commandsSharedStateService, replyServiceMatcher);
        this.scrapper = scrapper;
        this.errorMessageHandler = errorMessageHandler;
    }

    public void handleURL(LinkTracerNewMessageEvent event) {
        TelegramBotMessage message = event.getMessage();
        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().getId());

        if (!sharedState.getProcessingCommand().equals("/untrack")) {
            return;
        }

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().getId())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle URL for /untrack command");

        if (sharedState.getCommandFlowState() != ChatCommandFlowState.WAITING_USER_INPUT) {
            log.warn("Suspiciously got not waiting flow state in command handler");
            return;
        }

        handleUrlSet(event, message);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }

    private void handleUrlSet(LinkTracerNewMessageEvent event, TelegramBotMessage message) {
        var response = scrapper.untrackLink(event.getMessage().chat().getId(), message.message());
        if (response.isRight()) {
            errorMessageHandler.handleErrorScrapperResponse(
                    event, response.get(), Map.of(HttpStatus.NOT_FOUND, UNTRACKED_URL_REPLY));
            return;
        }
        commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());
        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), BASIC_URL_REPLY);
    }

    @Override
    public void processEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/")) {
            handleURL(event);
        }
        if (!event.getMessage().message().strip().startsWith("/untrack")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().getId())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle /untrack user message");

        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().getId());

        commandsSharedStateService.setChatSharedState(
                message.chat().getId(),
                sharedState
                        .withCommandFlowState(ChatCommandFlowState.WAITING_USER_INPUT)
                        .withProcessingCommand("/untrack")
                        .withProcessingCommandStep(0));
        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), BASIC_TRACK_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }
}
