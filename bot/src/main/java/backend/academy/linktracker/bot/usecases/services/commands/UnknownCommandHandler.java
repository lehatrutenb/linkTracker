package backend.academy.linktracker.bot.usecases.services.commands;

import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.services.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import java.util.Arrays;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
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
            "Неизвестная команда. Воспользуйтесь /help, чтобы посмотреть список доступных команд."; // TODO check if it
    // makes sense to
    // move to storage

    private final EventsStateWatcher eventsStateWatcher;
    private final CommandsMetaDataService commandsMetaDataService;
    private final ApplicationContext applicationContext;

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

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle unknown user command");

        event.getReplyService(applicationContext)
                .sendMessage(message.chat().id().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
