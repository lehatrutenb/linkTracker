package backend.academy.linktracker.bot.usecase.service.command;

import backend.academy.linktracker.bot.core.entity.ChatSharedState;
import backend.academy.linktracker.bot.core.entity.CommandHandler;
import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import backend.academy.linktracker.bot.usecase.event.LinkTracerNewMessageEvent;
import backend.academy.linktracker.bot.usecase.service.BotChatMetaDataService;
import backend.academy.linktracker.bot.usecase.service.EventsStateWatcher;
import backend.academy.linktracker.bot.usecase.service.UserChatStateMachineConcurrentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@CommandHandler(command = "/cancel")
public class CancelMessageHandler extends GeneralCommandHandler<LinkTracerNewMessageEvent> {
    public static final String BASIC_REPLY = "";
    public static final String ERROR_REPLY = "Не получилось выполнить указанную команду из-за внутренней ошибки";

    public CancelMessageHandler(
            EventsStateWatcher eventsStateWatcher,
            UserChatStateMachineConcurrentService commandsSharedStateService,
            BotChatMetaDataService replyServiceMatcher) {
        super(eventsStateWatcher, commandsSharedStateService, replyServiceMatcher);
    }

    @Override
    public void processEvent(LinkTracerNewMessageEvent event) {
        if (!event.getMessage().message().strip().startsWith("/cancel")) {
            return;
        }
        TelegramBotMessage message = event.getMessage();
        log.atInfo().log("Handle /cancel user command");

        commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());
        replyServiceMatcher
                .getReplyService(event.getMessage().chat().getId())
                .orElseThrow()
                .sendMessage(message.chat().getId().getNumericID(), BASIC_REPLY);
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }

    public void processBotError(LinkTracerNewMessageEvent event, boolean sendClientMessage) {
        TelegramBotMessage message = event.getMessage();
        log.atError().log("Handle bot internal error");

        commandsSharedStateService.setChatSharedState(message.chat().getId(), new ChatSharedState());

        if (sendClientMessage) {
            replyServiceMatcher
                    .getReplyService(event.getMessage().chat().getId())
                    .orElseThrow()
                    .sendMessage(message.chat().getId().getNumericID(), ERROR_REPLY);
        }
        eventsStateWatcher.markEventAsDone(event.getEventID());
    }
}
