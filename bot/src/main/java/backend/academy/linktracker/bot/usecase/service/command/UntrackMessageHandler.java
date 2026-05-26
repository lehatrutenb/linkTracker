package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enumeration.ChatCommandFlowState;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.exception.NotFoundException;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.ScrapperUpdatesService;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@CommandHandler(command = "/untrack")
public class UntrackMessageHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    public static final String BASIC_TRACK_REPLY =
            "Введите github repo/stackoverflow question ссылку которую вы хотите перестать отслеживать";
    public static final String BASIC_URL_REPLY = "Ссылка больше не будет отслеживаться";
    public static final String UNTRACKED_URL_REPLY = "Ссылка ранее не отслеживалась";

    private final ScrapperUpdatesService scrapper;
    private final CancelMessageHandler cancelMessageHandler;
    private final LinkTracerTelegramBotClient telegramBotClient;

    public UntrackMessageHandler(
            EventsStateWatcher eventsStateWatcher,
            UserChatStateMachineConcurrentService commandsSharedStateService,
            ScrapperUpdatesService scrapper,
            CancelMessageHandler cancelMessageHandler,
            LinkTracerTelegramBotClient telegramBotClient) { // TODO :(
        super(eventsStateWatcher, commandsSharedStateService, null);
        this.scrapper = scrapper;
        this.cancelMessageHandler = cancelMessageHandler;
        this.telegramBotClient = telegramBotClient;
    }

    public void handleURL(LinkTracerNewMessageEvent event) {
        TelegramBotMessage message = event.getMessage();
        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().getId());

        if (!sharedState.getProcessingCommand().equals("/untrack")) {
            return;
        }

        log.atInfo().log("Handle URL for /untrack command");

        if (sharedState.getCommandFlowState() != ChatCommandFlowState.WAITING_USER_INPUT) {
            log.warn("Suspiciously got not waiting flow state in command handler");
            return;
        }

        handleUrlSet(event, message);
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }

    private void handleUrlSet(LinkTracerNewMessageEvent event, TelegramBotMessage message) {
        try {
            scrapper.untrackLink(event.getMessage().chat().getId(), message.message());
            commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());
            telegramBotClient.sendMessage(message.chat().getId().getNumericID(), BASIC_URL_REPLY);
        } catch (NotFoundException e) {
            telegramBotClient.sendMessage(message.chat().getId().getNumericID(), UNTRACKED_URL_REPLY);
        } catch (Exception e) {
            cancelMessageHandler.processBotError(event, true);
        } finally {
            eventsStateWatcher.markEventAsDone(event.getEventID());
        }
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

        log.atInfo().log("Handle /untrack user message");

        var sharedState =
                commandsSharedStateService.getChatSharedState(message.chat().getId());

        commandsSharedStateService.setChatSharedState(
                message.chat().getId(),
                sharedState
                        .withCommandFlowState(ChatCommandFlowState.WAITING_USER_INPUT)
                        .withProcessingCommand("/untrack")
                        .withProcessingCommandStep(0));
        telegramBotClient.sendMessage(message.chat().getId().getNumericID(), BASIC_TRACK_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }
}
