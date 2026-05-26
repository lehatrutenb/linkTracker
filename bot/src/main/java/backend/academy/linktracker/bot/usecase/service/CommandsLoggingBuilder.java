package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.core.entity.TelegramBotMessage;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.spi.LoggingEventBuilder;

@UtilityClass
@Slf4j
public class CommandsLoggingBuilder {

    public static LoggingEventBuilder buildLoggingMessage(TelegramBotMessage message) {
        return log.atInfo()
                .addKeyValue("chat id", message.chat().id())
                .addKeyValue("message id", message.id())
                .addKeyValue("message date", message.date());
    }
}
