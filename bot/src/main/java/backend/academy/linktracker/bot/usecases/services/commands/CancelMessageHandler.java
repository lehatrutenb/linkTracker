package backend.academy.linktracker.bot.usecases.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecases.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecases.services.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/cancel")
public class CancelMessageHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY = "";
    private static final String ERROR_REPLY = "Не получилось выполнить указанную команду из-за внутренней ошибки";

    private final EventsStateWatcher eventsStateWatcher;
    private final ApplicationContext applicationContext;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/cancel")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        log.atInfo()
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle /cancel user command");

        commandsSharedStateService.setChatSharedState(message.chat().id(), new ChatSharedState());
        event.getReplyService(applicationContext)
                .sendMessage(message.chat().id().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }

    public void onBotError(LinkTracerNewMessageEvent event, boolean sendClientMessage) {
        TelegramBotMessage message = event.getMessage();
        log.atInfo()
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle bot internal error");

        commandsSharedStateService.setChatSharedState(message.chat().id(), new ChatSharedState());

        if (sendClientMessage) {
            event.getReplyService(applicationContext)
                    .sendMessage(message.chat().id().getNumericID(), ERROR_REPLY);
        }
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
