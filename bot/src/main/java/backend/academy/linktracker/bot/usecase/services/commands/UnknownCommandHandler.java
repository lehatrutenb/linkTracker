package backend.academy.linktracker.bot.usecase.services.commands;

import backend.academy.linktracker.bot.core.entities.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.events.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.services.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.services.CommandsMetaDataService;
import backend.academy.linktracker.bot.usecase.services.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.services.UserChatStateMachineConcurrentService;

import java.util.Arrays;
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
public class UnknownCommandHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    private static final String BASIC_REPLY =
            "Неизвестная команда. Воспользуйтесь /help, чтобы посмотреть список доступных команд."; // TODO check if it
    // makes sense to
    // move to storage

    private final CommandsMetaDataService commandsMetaDataService;

    public UnknownCommandHandler(EventsStateWatcher eventsStateWatcher, CommandsMetaDataService commandsMetaDataService, BotChatMetaDataService replyServiceMatcher, UserChatStateMachineConcurrentService commandsSharedStateService) {
        super(eventsStateWatcher, commandsSharedStateService, replyServiceMatcher);
        this.commandsMetaDataService = commandsMetaDataService;
    }

    @Override
    public int getOrder() {
        return Ordered.HIGHEST_PRECEDENCE;
    }

    @Override
    public void processEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        if (commandsMetaDataService
                .getCommandHandlerByCommand(
                        Arrays.stream(message.message().strip().split(" "))
                                .findFirst()
                                .orElseThrow())
                .isPresent()) {
            return;
        }

        log.atInfo() // TODO Check how to move such logging to shared part
                .addKeyValue("chat id", message.chat().getId())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date())
                .log("Handle unknown user command");

        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventId());
    }
}
