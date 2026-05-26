<<<<<<<< HEAD:bot/src/main/java/backend/academy/linktracker/bot/adapter/controller/ResponseExceptionHandler.java
package backend.academy.linktracker.bot.adapter.controller;
========
package backend.academy.linktracker.bot.adapter.exception;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/adapter/exception/ResponseExceptionHandler.java

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
