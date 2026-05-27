package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.service.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class UnknownCommandHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY =
            "Неизвестная команда. Воспользуйтесь /help, чтобы посмотреть список доступных команд."; // TODO check if it
    // makes sense to
    // move to storage

    private final CommandsMetaDataService commandsMetaDataService;
    private final LinkTracerTelegramBotClient telegramBotClient;

    public UnknownCommandHandler(
            EventsStateWatcher eventsStateWatcher,
            UserChatStateMachineConcurrentService commandsSharedStateService,
            CommandsMetaDataService commandsMetaDataService,
            LinkTracerTelegramBotClient telegramBotClient) {
        super(eventsStateWatcher, commandsSharedStateService);
        this.commandsMetaDataService = commandsMetaDataService;
        this.telegramBotClient = telegramBotClient;
    }

    @Override
    public int getOrder() {
        return HIGHEST_PRECEDENCE;
    }

    @Override
    public void processEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        if (commandsMetaDataService
                .getCommandHandlerByCommand(
                        Arrays.stream(message.message().strip().split(" "))
                                .findFirst()
                                .orElseThrow())
                .isPresent()) {
            return;
        }

        log.atInfo() // TODO Check how to move such logging to shared part
                .log("Handle unknown user command");

        telegramBotClient.sendMessage(message.chat().getId().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }
}
