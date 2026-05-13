package backend.academy.linktracker.bot.adapters.controllers;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkTracerTelegramBotReplier {
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
