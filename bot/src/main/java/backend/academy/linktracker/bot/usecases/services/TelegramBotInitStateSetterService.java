package backend.academy.linktracker.bot.usecases.services;

import backend.academy.linktracker.bot.core.entities.CommandHandler;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.request.SetMyCommands;
import com.pengrad.telegrambot.response.BaseResponse;
import java.time.Duration;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class TelegramBotInitStateSetterService {
    private static final String DEFAULT_BLANK_DESCRIPTION_REPLACE = "-";
    private static final int DEFAULT_RETRY_AMT = 5;
    private static final Duration DEFAULT_RETRY_PERIOD = Duration.ofSeconds(3);

    private final TelegramBot telegramBot;
    private final CommandsMetaDataService commandsMetaDataService;
    private boolean isStateInited = false;

    // Not using postConstruct cause its really hard to test it
    @Scheduled(fixedDelayString = "#{@telegramLinkTrackerProperties.initStateTrySetFixedRate}")
    public void initState() {
        if (isStateInited) {
            return;
        }

        var commands = commandsMetaDataService.getUserCommandList().stream()
                .map(TelegramBotInitStateSetterService::mapToTgBotCommand)
                .toArray(BotCommand[]::new);
        Optional<BaseResponse> response = Optional.empty();
        for (int retryInd = 0; retryInd < DEFAULT_RETRY_AMT; retryInd++) {
            response = Optional.of(telegramBot.execute(new SetMyCommands(commands)));
            if (response.orElseThrow().isOk()) {
                break;
            }
            Thread.yield();
            try {
                Thread.sleep(DEFAULT_RETRY_PERIOD);
            } catch (InterruptedException e) {
                log.error("Interrupted initial stage of commands setting of telegram link tracker bot");
                throw new RuntimeException(e);
            }
        }
        if (!response.orElseThrow().isOk()) {
            log.atWarn()
                    .addKeyValue("error", response.orElseThrow().errorCode())
                    .addKeyValue("description", response.orElseThrow().description())
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
