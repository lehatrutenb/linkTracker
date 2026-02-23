package backend.academy.linktracker.bot.usecases.services;

import backend.academy.linktracker.bot.core.entities.CommandHandler;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.request.SetMyCommands;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TelegramBotInitStateSetterService {
    private static final String DEFAULT_BLANK_DESCRIPTION_REPLACE = "-";

    private final TelegramBot telegramBot;
    private final CommandsMetaDataService commandsMetaDataService;

    @PostConstruct
    public void initState() {
        var commands = commandsMetaDataService.getCommandList().stream()
                .map(TelegramBotInitStateSetterService::mapToTgBotCommand)
                .toArray(BotCommand[]::new);
        var response = telegramBot.execute(new SetMyCommands(commands));
        if (!response.isOk()) {
            log.atWarn()
                    .addKeyValue("error", response.errorCode())
                    .addKeyValue("description", response.description())
                    .log("Failed to set bot commands");
        }
    }

    public static BotCommand mapToTgBotCommand(CommandHandler commandHandler) {
        return new BotCommand(commandHandler.command(), handleBlankDescription(commandHandler.shortDescription()));
    }

    public static String handleBlankDescription(String commandDescription) {
        return commandDescription.isBlank() ? DEFAULT_BLANK_DESCRIPTION_REPLACE : commandDescription;
    }
}
