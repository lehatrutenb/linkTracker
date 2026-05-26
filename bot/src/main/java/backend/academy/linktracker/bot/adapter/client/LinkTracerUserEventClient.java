package backend.academy.linktracker.bot.adapter.client;

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
public class LinkTracerUserEventClient implements UpdatesListener {
    private final TelegramBot telegramBot;
    private final LinkTracerFacade linkTracerFacade;

    @PostConstruct
    private void setEventListener() {
        startListener();
    }

    public void startListener() {
        telegramBot.setUpdatesListener(this);
    }

    public void stopListener() {
        telegramBot.removeGetUpdatesListener();
    }

    @Override
    public int process(List<Update> list) {
        var lastProcessedID = linkTracerFacade.processLinkTrackerUpdates(list);
        return lastProcessedID.orElse(CONFIRMED_UPDATES_NONE);
    }
}
