package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.core.enumeration.ChatCommandFlowState;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.service.CommandsLoggingBuilder;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
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
            "В данный момент произвольное сообщение не ожидалось. Воспользуйтесь /help, чтобы посмотреть список доступных команд.";

    private final EventsStateWatcher eventsStateWatcher;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;
    private final LinkTracerTelegramBotClient linkTracerTelegramBotReplier;

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

        CommandsLoggingBuilder.buildLoggingMessage(message).log("Handle unexpected user message");

        linkTracerTelegramBotReplier.sendMessage(message.chat().id().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
