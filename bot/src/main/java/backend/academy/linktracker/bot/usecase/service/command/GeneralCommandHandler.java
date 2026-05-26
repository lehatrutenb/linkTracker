package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.service.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import org.slf4j.MDC;
import org.springframework.context.ApplicationEvent;
import org.springframework.transaction.event.TransactionalApplicationListener;

@RequiredArgsConstructor
public abstract class GeneralCommandHandler<T extends ApplicationEvent> implements TransactionalApplicationListener<T> {
    protected final EventsStateWatcher eventsStateWatcher;
    protected final UserChatStateMachineConcurrentService commandsSharedStateService;
    protected final BotChatMetaDataService replyServiceMatcher;

    @Override
    public void onApplicationEvent(T event) {
        if (event instanceof LinkTracerNewMessageEvent message) {
            MDC.put(
                    "chat id",
                    String.valueOf(message.getMessage().chat().getId().getNumericID()));
            MDC.put("message id", message.getMessage().id().toString());
            MDC.put("message date", message.getMessage().date().toString());
        }
        try {
            processEvent(event);
        } finally {
            MDC.clear();
        }
    }

    @Override
    public void addCallback(SynchronizationCallback callback) {}

    @Override
    public abstract void processEvent(T event);
}
