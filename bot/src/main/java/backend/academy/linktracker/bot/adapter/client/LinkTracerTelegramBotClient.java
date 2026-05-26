package backend.academy.linktracker.bot.adapter.client;

import backend.academy.linktracker.bot.adapter.exception.ResponseExceptionHandler;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier(LinkTracerTelegramBotClient.QUALIFIER)
public class LinkTracerTelegramBotClient {
    public static final String QUALIFIER = "LinkTracerTelegramBotClient";
    private final TelegramBot telegramBot;
    private final ResponseExceptionHandler responseExceptionHandler;

    public void sendMessage(long chatId, String message) {
        var request = new SendMessage(chatId, message);
        SendResponse response = telegramBot.execute(request);
        if (!response.isOk()) {
            responseExceptionHandler.handle(response);
        }
    }
}
