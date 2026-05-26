<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/dtos/LinkTracerRawMessage.java
package backend.academy.linktracker.bot.usecase.dtos;
========
package backend.academy.linktracker.bot.usecase.dto;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/dto/LinkTracerRawMessage.java

import com.pengrad.telegrambot.model.Chat;
import java.time.Instant;

public record LinkTracerRawMessage(
        long id,
        Chat.Type type,
        long userId,
        String userName,
        String firstName,
        boolean isBot,
        String message,
        long messageId,
        Instant date) {}
