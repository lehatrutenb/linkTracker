package backend.academy.linktracker.bot.usecases.services.commands;

import backend.academy.linktracker.bot.core.entities.CommandsSharedState;
import backend.academy.linktracker.bot.core.entities.LinkTracerMessage;
import backend.academy.linktracker.bot.core.enums.CurrentCommandFlowState;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.services.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UnknownMessageHandler {
    private static final String BASIC_REPLY =
            "В данный момент произвольное сообщение не ожидалось. Воспользуйтесь /help, чтобы посмотреть список доступных команд."; // TODO check if it makes sense to move to storage

    private final EventsStateWatcher eventsStateWatcher;
    private final CommandsMetaDataService commandsMetaDataService;
    private final CommandsSharedState commandsSharedState;
    private final ApplicationContext applicationContext;

    @EventListener(condition = "!#event.getMessage().message().strip().startsWith('/')")
    public void handle(LinkTracerNewMessageEvent event) {
        LinkTracerMessage message = event.getMessage();

        if (commandsSharedState.getCommandFlowState() == CurrentCommandFlowState.WAITING_USER_INPUT) {
            return;
        }

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.messageId())
                .addKeyValue("message date", message.date())
                .log("Handle unexpected user message");

        event.getReplyService(applicationContext).sendMessage(message.chat().id(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }
}
