<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/adapter/controller/LinkTracerUserEventController.java
package backend.academy.linktracker.bot.adapter.controller;
========
package backend.academy.linktracker.bot.adapter.client;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/adapter/client/LinkTracerUserEventClient.java

import backend.academy.linktracker.bot.usecase.LinkTracerFacade;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import jakarta.annotation.PostConstruct;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
@RefreshScope
public class LinkTracerUserEventClient implements UpdatesListener {
    private final TelegramBot telegramBot;
    private final LinkTracerFacade linkTracerFacade;

    @PostConstruct
    private void setEventListener() {
        telegramBot.setUpdatesListener(this);
    }

    @Override
    public int process(List<Update> list) {
        var lastProcessedID = linkTracerFacade.processLinkTrackerUpdates(list);
        return lastProcessedID.orElse(CONFIRMED_UPDATES_NONE);
    }
}
