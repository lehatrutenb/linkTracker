package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.core.entity.CommandHandler;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.request.SetMyCommands;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TelegramBotInitStateSetterService {
    private static final String DEFAULT_BLANK_DESCRIPTION_REPLACE = "-";

    private final TelegramBot telegramBot;
    private final CommandsMetaDataService commandsMetaDataService;
    private boolean isStateInited = false;

    // Not using postConstruct cause its really hard to test it
    @Scheduled(fixedDelayString = "${app.telegram.link.tracker.init-state-try-set-fixed-rate}")
    public void initState() {
        if (isStateInited) {
            return;
        }

        var commands = commandsMetaDataService.getUserCommandList().stream()
                .map(TelegramBotInitStateSetterService::mapToTgBotCommand)
                .toArray(BotCommand[]::new);
        var response = telegramBot.execute(new SetMyCommands(commands));
        if (!response.isOk()) {
            log.atWarn()
                    .addKeyValue("error", response.errorCode())
                    .addKeyValue("description", response.description())
                    .log("Failed to set bot commands");
            return;
        }
        isStateInited = true;
    }

    public static BotCommand mapToTgBotCommand(CommandHandler commandHandler) {
        return new BotCommand(commandHandler.command(), handleBlankDescription(commandHandler.shortDescription()));
    }

    public static String handleBlankDescription(String commandDescription) {
        return commandDescription.isBlank() ? DEFAULT_BLANK_DESCRIPTION_REPLACE : commandDescription;
    }
}
