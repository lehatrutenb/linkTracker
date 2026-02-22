package backend.academy.linktracker.bot.adapters.controllers;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.request.BaseRequest;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LinkTracerReplier {
    private final TelegramBot telegramBot;
    private final ResponseExceptionHandler responseExceptionHandler;

    public void sendMessage(long charId, String message) {
        var request = new SendMessage(charId, message);
        SendResponse response = telegramBot.execute(request); // TODO rewrite with callbacl to exc handler
        if (!response.isOk()) {
            responseExceptionHandler.handle(response);
        }
    }
}
