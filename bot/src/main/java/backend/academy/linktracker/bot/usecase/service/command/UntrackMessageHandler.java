package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enumeration.ChatCommandFlowState;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.exception.NotFoundException;
import backend.academy.linktracker.bot.usecase.service.CommandsLoggingBuilder;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/untrack")
public class UntrackMessageHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    public static final String BASIC_TRACK_REPLY =
            "Введите github repo/stackoverflow question ссылку которую вы хотите перестать отслеживать";
    public static final String BASIC_URL_REPLY = "Ссылка больше не будет отслеживаться";
    public static final String UNTRACKED_URL_REPLY = "Ссылка ранее не отслеживалась";

    private final EventsStateWatcher eventsStateWatcher;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;
    private final ScrapperUpdatesService scrapper;
    private final CancelMessageHandler cancelMessageHandler;
    private final LinkTracerTelegramBotClient linkTracerTelegramBotReplier;

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/")) {
            handleURL(event);
        }
        if (!event.getMessage().message().strip().startsWith("/untrack")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();

        CommandsLoggingBuilder.buildLoggingMessage(message).log("Handle /untrack user message");

        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().id());

        commandsSharedStateService.setChatSharedState(
                message.chat().id(),
                sharedState
                        .withCommandFlowState(ChatCommandFlowState.WAITING_USER_INPUT)
                        .withProcessingCommand("/untrack")
                        .withProcessingCommandStep(0));
        linkTracerTelegramBotReplier.sendMessage(message.chat().id().getNumericID(), BASIC_TRACK_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }

    public void handleURL(LinkTracerNewMessageEvent event) {
        TelegramBotMessage message = event.getMessage();
        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().id());

        if (!sharedState.getProcessingCommand().equals("/untrack")) {
            return;
        }

        CommandsLoggingBuilder.buildLoggingMessage(message).log("Handle URL for /untrack command");

        if (sharedState.getCommandFlowState() != ChatCommandFlowState.WAITING_USER_INPUT) {
            log.warn("Suspiciously got not waiting flow state in command handler");
            return;
        }

        handleUrlSet(event, message);
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }

    private void handleUrlSet(LinkTracerNewMessageEvent event, TelegramBotMessage message) {
        try {
            scrapper.untrackLink(event.getMessage().chat().id(), message.message());
            commandsSharedStateService.setChatSharedState(message.chat().id(), new ChatSharedState());
            linkTracerTelegramBotReplier.sendMessage(message.chat().id().getNumericID(), BASIC_URL_REPLY);
        } catch (NotFoundException e) {
            linkTracerTelegramBotReplier.sendMessage(message.chat().id().getNumericID(), UNTRACKED_URL_REPLY);
        } catch (Exception e) {
            cancelMessageHandler.onBotError(event, true);
        } finally {
            eventsStateWatcher.markEventAsDone(event.getEventID());
        }
    }
}
