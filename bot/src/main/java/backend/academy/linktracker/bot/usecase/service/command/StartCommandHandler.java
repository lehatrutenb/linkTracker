package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.service.CommandsLoggingBuilder;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@CommandHandler(command = "/start")
public class StartCommandHandler implements ApplicationListener<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY =
            "Добро пожаловать! Используйте /help, чтобы посмотреть доступные команды.";

    private final EventsStateWatcher eventsStateWatcher;
    private final UserChatStateMachineConcurrentService commandsSharedStateService;
    private final LinkTracerTelegramBotClient linkTracerTelegramBotReplier;

    @Override
    public void onApplicationEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/start")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        CommandsLoggingBuilder.buildLoggingMessage(message).log("Handle /start user command");

        commandsSharedStateService.setChatSharedState(message.chat().id(), new ChatSharedState());
        linkTracerTelegramBotReplier.sendMessage(message.chat().id().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }

    @Override
    public boolean supportsAsyncExecution() {
        return false;
    }
}
