package backend.academy.linktracker.bot.usecases.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.services.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecases.services.TelegramBotMessagesOrderService;
import backend.academy.linktracker.bot.usecases.services.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/help", shortDescription = "возвращает список с описанием существующих команд")
public class HelpCommandHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY = "Вот список доступных команд:" + System.lineSeparator();
    private static final String BASIC_COMMAND_DESCRIPTION_SEPARATOR = " - ";

    private final EventsStateWatcher eventsStateWatcher;
    private final CommandsMetaDataService commandsMetaDataService;
    private final TelegramBotMessagesOrderService messagesService;
    private final ApplicationContext applicationContext;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/help")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        log.atInfo()
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle /help user command");

        commandsSharedStateService.setChatSharedState(message.chat().id(), new ChatSharedState());
        event.getReplyService(applicationContext)
                .sendMessage(message.chat().id().getNumericID(), addCommandsToReply(BASIC_REPLY));
        eventsStateWatcher.markEventAsDone(event.getEventId());
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
        commandsMetaDataService.getCommandList().forEach(commandHandler -> addCommand(stringBuilder, commandHandler));
        return stringBuilder.toString();
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
