package backend.academy.linktracker.bot.adapters.controllers;

import com.pengrad.telegrambot.response.SendResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ResponseExceptionHandler {
    public void handle(SendResponse response) {
        log.atWarn()
                .addKeyValue("error code", response.errorCode())
                .addKeyValue("description", response.description())
                .log("Failed to send response");
    }
}
