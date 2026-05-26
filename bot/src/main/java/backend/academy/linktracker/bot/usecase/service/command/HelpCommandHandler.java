<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/services/commands/HelpCommandHandler.java
package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.services.TelegramBotMessagesOrderService;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;
========
package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.service.CommandsLoggingBuilder;
import backend.academy.linktracker.bot.usecase.service.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/service/command/HelpCommandHandler.java
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
    private final UserChatStateMachineConcurrentService commandsSharedStateService;
<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/services/commands/HelpCommandHandler.java
    private final BotChatMetaDataService replyServiceMatcher;
========
    private final LinkTracerTelegramBotClient linkTracerTelegramBotReplier;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/service/command/HelpCommandHandler.java

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/help")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        CommandsLoggingBuilder.buildLoggingMessage(message).log("Handle /help user command");

        commandsSharedStateService.setChatSharedState(message.chat().id(), new ChatSharedState());
        linkTracerTelegramBotReplier.sendMessage(message.chat().id().getNumericID(), addCommandsToReply(BASIC_REPLY));
        eventsStateWatcher.markEventAsDone(event.getEventID());
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
    public boolean supportsAsyncExecution() {
        return false;
    }
}
