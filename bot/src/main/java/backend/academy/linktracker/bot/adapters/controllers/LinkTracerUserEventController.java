package backend.academy.linktracker.bot.adapters.controllers;

import backend.academy.linktracker.bot.usecases.LinkTracerFacade;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import jakarta.annotation.PostConstruct;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
public class LinkTracerUserEventController implements UpdatesListener {
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
