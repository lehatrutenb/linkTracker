<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/services/commands/UnknownCommandHandler.java
package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
========
package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.service.CommandsLoggingBuilder;
import backend.academy.linktracker.bot.usecase.service.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/service/command/UnknownCommandHandler.java
import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@Order(Ordered.HIGHEST_PRECEDENCE)
public class UnknownCommandHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY =
            "Неизвестная команда. Воспользуйтесь /help, чтобы посмотреть список доступных команд.";

    private final EventsStateWatcher eventsStateWatcher;
    private final CommandsMetaDataService commandsMetaDataService;
<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/services/commands/UnknownCommandHandler.java
    private final ApplicationContext applicationContext;
    private final BotChatMetaDataService replyServiceMatcher;
========
    private final LinkTracerTelegramBotClient linkTracerTelegramBotReplier;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/service/command/UnknownCommandHandler.java

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
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

        CommandsLoggingBuilder.buildLoggingMessage(message).log("Handle unknown user command");

        linkTracerTelegramBotReplier.sendMessage(message.chat().id().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
