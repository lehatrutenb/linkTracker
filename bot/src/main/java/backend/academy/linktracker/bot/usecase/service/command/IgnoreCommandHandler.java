package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.service.CommandsLoggingBuilder;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/ignore", showToUser = false)
@Profile("test")
public class IgnoreCommandHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    private final EventsStateWatcher eventsStateWatcher;
    private final ApplicationContext applicationContext;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/ignore")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        CommandsLoggingBuilder.buildLoggingMessage(message).log("Handle /ignore user command");

        // Not update shared state to have real stub event
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
