package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@CommandHandler(command = "/ignore", showToUser = false)
@Profile("test")
public class IgnoreCommandHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {

    public IgnoreCommandHandler(
            EventsStateWatcher eventsStateWatcher, UserChatStateMachineConcurrentService commandsSharedStateService) {
        super(eventsStateWatcher, commandsSharedStateService);
    }

    @Override
    public void processEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/ignore")) {
            return;
        }
        log.atInfo().log("Handle /ignore user command");

        // Not update shared state to have real stub event
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }
}
