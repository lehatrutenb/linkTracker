package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enums.ChatCommandFlowState;
import backend.academy.linktracker.bot.usecase.dtos.models.ApiErrorResponse;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.ReplyServiceMatcherService;
import backend.academy.linktracker.bot.usecase.services.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/untrack")
public class UntrackMessageHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    private static final String BASIC_TRACK_REPLY =
            "Введите github repo/stackoverflow question ссылку которую вы хотите перестать отслеживать"; // TODO check
    // if it makes
    // sense to
    // move to
    // storage
    private static final String BASIC_URL_REPLY = "Ссылка больше не будет отслеживаться";
    private static final String UNTRACKED_URL_REPLY = "Ссылка ранее не отслеживалась";

    private final EventsStateWatcher eventsStateWatcher;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;
    private final ApplicationContext applicationContext;
    private final ScrapperUpdatesService scrapper;
    private final CancelMessageHandler cancelMessageHandler;
    private final ReplyServiceMatcherService replyServiceMatcher;

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/")) {
            handleURL(event);
        }
        if (!event.getMessage().message().strip().startsWith("/untrack")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle /untrack user message");

        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().id());

        commandsSharedStateService.setChatSharedState(
                message.chat().id(),
                sharedState
                        .withCommandFlowState(ChatCommandFlowState.WAITING_USER_INPUT)
                        .withProcessingCommand("/untrack")
                        .withProcessingCommandStep(0));
        replyServiceMatcher
                .getReplyService(event.getMessage().chat().id())
                .orElseThrow()
                .sendMessage(message.chat().id().getNumericID(), BASIC_TRACK_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }

    public void handleURL(LinkTracerNewMessageEvent event) {
        TelegramBotMessage message = event.getMessage();
        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().id());

        if (!sharedState.getProcessingCommand().equals("/untrack")) {
            return;
        }

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().id())
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

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }

    private void handleUrlSet(LinkTracerNewMessageEvent event, TelegramBotMessage message) {
        var response = scrapper.untrackLink(event.getMessage().chat().id(), message.message());
        if (response.isRight()) {
            handleErrorScrapperResponse(event, response.get());
            return;
        }
        commandsSharedStateService.setChatSharedState(message.chat().id(), new ChatSharedState());
        replyServiceMatcher
                .getReplyService(event.getMessage().chat().id())
                .orElseThrow()
                .sendMessage(message.chat().id().getNumericID(), BASIC_URL_REPLY);
    }

    public void handleErrorScrapperResponse(LinkTracerNewMessageEvent event, ApiErrorResponse response) {
        // It was hard decision to use http codes inside business - but alternatives are hard to implement
        String reply =
                switch (HttpStatus.resolve(
                        Integer.parseInt(response.getCode().orElse(HttpStatus.INTERNAL_SERVER_ERROR.toString())))) {
                    case HttpStatus.NOT_FOUND -> UNTRACKED_URL_REPLY;
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
