package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEvent;
import org.springframework.transaction.event.TransactionalApplicationListener;

@RequiredArgsConstructor
public abstract class GeneralCommandHandler<T extends ApplicationEvent> implements TransactionalApplicationListener<T> {
    protected final EventsStateWatcher eventsStateWatcher;
    protected final UserChatStateMachineConcurrentService commandsSharedStateService;
    protected final BotChatMetaDataService replyServiceMatcher;

    @Override
    public void onApplicationEvent(T event) {
        processEvent(event);
    }

    @Override
    public void addCallback(SynchronizationCallback callback) {}

    @Override
    public abstract void processEvent(T event);
}
