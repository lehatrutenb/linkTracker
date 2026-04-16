package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enums.ChatCommandFlowState;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.ReplyServiceMatcherService;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;
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
public class UnknownMessageHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY =
            "В данный момент произвольное сообщение не ожидалось. Воспользуйтесь /help, чтобы посмотреть список доступных команд."; // TODO check if it makes sense to move to storage

    private final EventsStateWatcher eventsStateWatcher;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;
    private final ApplicationContext applicationContext;
    private final ReplyServiceMatcherService replyServiceMatcher;

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (event.getMessage().message().strip().startsWith("/")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();

        if (commandsSharedStateService.getChatSharedState(message.chat().id()).getCommandFlowState()
                == ChatCommandFlowState.WAITING_USER_INPUT) {
            return;
        }

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle unexpected user message");

        replyServiceMatcher
                .getReplyService(event.getMessage().chat().id())
                .orElseThrow()
                .sendMessage(message.chat().id().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
