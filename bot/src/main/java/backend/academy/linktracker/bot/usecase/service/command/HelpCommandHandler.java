package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.service.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.service.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@CommandHandler(command = "/help", shortDescription = "возвращает список с описанием существующих команд")
public class HelpCommandHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY = "Вот список доступных команд:" + System.lineSeparator();
    private static final String BASIC_COMMAND_DESCRIPTION_SEPARATOR = " - ";

    private final CommandsMetaDataService commandsMetaDataService;
    private final LinkTracerTelegramBotClient telegramBotClient;

    public HelpCommandHandler(
            EventsStateWatcher eventsStateWatcher,
            UserChatStateMachineConcurrentService commandsSharedStateService,
            BotChatMetaDataService replyServiceMatcher,
            CommandsMetaDataService commandsMetaDataService,
            LinkTracerTelegramBotClient telegramBotClient) {
        super(eventsStateWatcher, commandsSharedStateService, replyServiceMatcher);
        this.commandsMetaDataService = commandsMetaDataService;
        this.telegramBotClient = telegramBotClient;
    }

    private static void addCommand(StringBuilder stringBuilder, CommandHandler commandHandler) {
        stringBuilder.append(commandHandler.command());
        if (!commandHandler.shortDescription().isBlank()) {
            stringBuilder.append(BASIC_COMMAND_DESCRIPTION_SEPARATOR);
            stringBuilder.append(commandHandler.shortDescription());
        }
        stringBuilder.append(System.lineSeparator());
    }

    public String addCommandsToReply(String reply) {
        StringBuilder stringBuilder = new StringBuilder(reply);
        commandsMetaDataService
                .getUserCommandList()
                .forEach(commandHandler -> addCommand(stringBuilder, commandHandler));
        return stringBuilder.toString();
    }

    @Override
    public void processEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/help")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        log.atInfo().log("Handle /help user command");

        commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());
        telegramBotClient.sendMessage(message.chat().getId().getNumericID(), addCommandsToReply(BASIC_REPLY));
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }
}
