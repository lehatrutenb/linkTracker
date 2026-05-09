package backend.academy.linktracker.bot.adapter.controller;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Qualifier("LinkTracerTelegramBotReplier")
public class LinkTracerTelegramBotReplier {
    private final TelegramBot telegramBot;
    private final ResponseExceptionHandler responseExceptionHandler;

    public void sendMessage(long chatID, String message) {
        var request = new SendMessage(chatID, message);
        SendResponse response = telegramBot.execute(request); // TODO rewrite with callback to exc handler
        if (!response.isOk()) {
            responseExceptionHandler.handle(response);
        }
    }
}
