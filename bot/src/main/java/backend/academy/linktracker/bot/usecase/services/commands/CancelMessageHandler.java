package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.ChatSharedState;
import backend.academy.linktracker.bot.core.entities.CommandHandler;
import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalApplicationListener;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Service
@CommandHandler(command = "/cancel")
public class CancelMessageHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY = "";
    private static final String ERROR_REPLY = "Не получилось выполнить указанную команду из-за внутренней ошибки";

    public CancelMessageHandler(EventsStateWatcher eventsStateWatcher, UserChatStateMachineConcurrentService commandsSharedStateService, BotChatMetaDataService replyServiceMatcher) {
        super(eventsStateWatcher, commandsSharedStateService, replyServiceMatcher);
    }

    @Override
    public void processEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/cancel")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        log.atInfo()
                .addKeyValue("chat id", message.chat().getId())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle /cancel user command");

        commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());
        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }


    public void processBotError(LinkTracerNewMessageEvent event, boolean sendClientMessage) {
        TelegramBotMessage message = event.getMessage();
        log.atInfo()
                .addKeyValue("chat id", message.chat().getId())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle bot internal error");

        commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());

        if (sendClientMessage) {
            replyServiceMatcher
                    .getReplyService(event.getMessage().chat().getId())
                    .orElseThrow()
                    .sendMessage(message.chat().getId().getNumericID(), ERROR_REPLY);
        }
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }
}
