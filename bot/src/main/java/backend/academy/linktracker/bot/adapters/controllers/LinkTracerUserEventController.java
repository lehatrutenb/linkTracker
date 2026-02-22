package backend.academy.linktracker.bot.adapters.controllers;

import backend.academy.linktracker.bot.adapters.repository.EventsRepository;
import backend.academy.linktracker.bot.properties.TelegramLinkTrackerProperties;
import backend.academy.linktracker.bot.usecases.LinkTracerFacade;
import backend.academy.linktracker.bot.usecases.mappers.TelegramUpdatesMapper;
import backend.academy.linktracker.bot.usecases.services.EventsStateWatcher;
import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.UpdatesListener;
import com.pengrad.telegrambot.model.Update;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Controller;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class LinkTracerUserEventController implements UpdatesListener {
    private final TelegramBot telegramBot;
    private final LinkTracerFacade linkTracerFacade;
    private final LinkTracerReplier linkTracerReplier;
    private final TelegramLinkTrackerProperties trackerProperties;
    private final EventsStateWatcher eventsStateWatcher;

    @PostConstruct
    private void setEventListener() {
        telegramBot.setUpdatesListener(this);
    }

    @Override
    public int process(List<Update> list) {
        linkTracerFacade.processUpdates(list, linkTracerReplier);
        return eventsStateWatcher.getNumericLastOfPrefixOfDone().map(TelegramUpdatesMapper::mapUpdateId).orElse(UpdatesListener.CONFIRMED_UPDATES_NONE);
    }
}
