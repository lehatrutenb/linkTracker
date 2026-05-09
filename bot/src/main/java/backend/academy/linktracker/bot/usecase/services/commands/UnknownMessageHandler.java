package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enums.ChatCommandFlowState;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Service;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

@Slf4j
@Service
public class UnknownMessageHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY =
            "В данный момент произвольное сообщение не ожидалось. Воспользуйтесь /help, чтобы посмотреть список доступных команд."; // TODO check if it makes sense to move to storage

    public UnknownMessageHandler(EventsStateWatcher eventsStateWatcher, UserChatStateMachineConcurrentService commandsSharedStateService, BotChatMetaDataService replyServiceMatcher) {
        super(eventsStateWatcher, commandsSharedStateService, replyServiceMatcher);
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    @Override
    public void processEvent(LinkTracerNewMessageEvent event) {
        if (event.getMessage().message().strip().startsWith("/")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();

        if (commandsSharedStateService
                        .getChatSharedState(message.chat().getId())
                        .getCommandFlowState()
                == ChatCommandFlowState.WAITING_USER_INPUT) {
            return;
        }

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().getId())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle unexpected user message");

        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }
}
