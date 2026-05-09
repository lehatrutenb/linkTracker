package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.services.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.TelegramBotMessagesOrderService;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Service
@CommandHandler(command = "/help", shortDescription = "возвращает список с описанием существующих команд")
public class HelpCommandHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY = "Вот список доступных команд:" + System.lineSeparator();
    private static final String BASIC_COMMAND_DESCRIPTION_SEPARATOR = " - ";

    private final CommandsMetaDataService commandsMetaDataService;
    private final TelegramBotMessagesOrderService messagesService;

    public HelpCommandHandler(EventsStateWatcher eventsStateWatcher, UserChatStateMachineConcurrentService commandsSharedStateService, BotChatMetaDataService replyServiceMatcher, CommandsMetaDataService commandsMetaDataService, TelegramBotMessagesOrderService messagesService) {
        super(eventsStateWatcher, commandsSharedStateService, replyServiceMatcher);
        this.commandsMetaDataService = commandsMetaDataService;
        this.messagesService = messagesService;
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
        log.atInfo()
                .addKeyValue("chat id", message.chat().getId())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle /help user command");

        commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());
        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), addCommandsToReply(BASIC_REPLY));
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }
}
