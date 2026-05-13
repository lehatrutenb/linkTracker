package backend.academy.linktracker.bot.usecases.services;

import backend.academy.linktracker.bot.adapters.controllers.LinkTracerTelegramBotReplier;
import backend.academy.linktracker.bot.adapters.repository.ScrapperLinkUpdatesRepository;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.usecases.dtos.models.LinkUpdate;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

/**
 * Public methods and fields started with `_` for testing purposes only.
 * Do not use in production code.
 */
@Slf4j
@Service
@RequiredArgsConstructor
@SuppressFBWarnings(
        "VA_FORMAT_STRING_USES_NEWLINE") // ignored warning cause assertj matches not works correctly with %n
public class ScrapperUpdatesHandleService {
    // it not that hard
    public static final String _BASIC_REPLY = "Получено обновление по url: %s:\n%s";

    private final EventsStateWatcher eventsStateWatcher;
    private final ScrapperLinkUpdatesRepository linkUpdatesRepository;
    private final LinkTracerTelegramBotReplier linkTracerTelegramBotReplier;
    private final Lock scrapperEventsProcessingLock = new ReentrantLock();

    public void handle(LinkUpdate update, EventID eventID) {
        if (!scrapperEventsProcessingLock.tryLock()) { // We are in processScrapperScheduledUpdates
            linkUpdatesRepository.setLinkUpdate(eventID, update);
            return;
        }

        try {
            var linkUpdateOptional = linkUpdatesRepository.getLinkUpdate(eventID);
            if (linkUpdateOptional.isPresent()) {
                log.atWarn().addKeyValue("event id", eventID).log("Attempt to handle link update event twice");
                return;
            }
            linkUpdatesRepository.setLinkUpdate(eventID, update);
            log.atInfo().addKeyValue("event id", eventID).log("Handle link update event");

            update.getTgChatIds().forEach(chatId -> {
                linkTracerTelegramBotReplier.sendMessage(
                        chatId, String.format(_BASIC_REPLY, update.getUrl(), update.getDescription()));
            });
            eventsStateWatcher.markEventAsDone(
                    eventID); // TODO currently may repeat message twice cause may process only part of chats - but let
            // it
            // currently be
        } finally {
            scrapperEventsProcessingLock.unlock();
        }
    }

    @Scheduled(fixedDelayString = "${app.telegram.link.tracker.update-notifier-before-retry}")
    public void processScrapperScheduledUpdates() {
        scrapperEventsProcessingLock.lock();
        try {
            eventsStateWatcher.getElderlyProcessingEvents(OwnerIDType.SCRAPPER).forEach(event -> {
                if (eventsStateWatcher.toProcessEvent(event.id())) {
                    handle(linkUpdatesRepository.getLinkUpdate(event.id()).orElseThrow(), event.id()); // TODO add check
                }
            });
        } finally {
            scrapperEventsProcessingLock.unlock();
        }
    }
}
