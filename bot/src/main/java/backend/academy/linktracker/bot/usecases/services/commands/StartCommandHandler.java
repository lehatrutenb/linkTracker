package backend.academy.linktracker.bot.usecases.services.commands;

import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.LinkTracerMessage;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/start")
public class StartCommandHandler {
    private static final String BASIC_REPLY =
            "Добро пожаловать! Используйте /help, чтобы посмотреть доступные команды.";

    private final EventsStateWatcher eventsStateWatcher;
    private final ApplicationContext applicationContext;

    @EventListener(condition = "#event.getMessage().message().strip().equals('/start')")
    public void handle(LinkTracerNewMessageEvent event) {
        LinkTracerMessage message = event.getMessage();
        log.atInfo()
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.messageId())
                .addKeyValue("message date", message.date())
                .log("Handle /start user command");

        event.getReplyService(applicationContext).sendMessage(message.chat().id(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }
}
