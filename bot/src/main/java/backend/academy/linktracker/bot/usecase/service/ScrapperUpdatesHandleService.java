package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.entity.ScrapperLinkUpdate;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
import backend.academy.linktracker.bot.core.port.ScrapperLinkUpdatesRepository;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import jakarta.transaction.Transactional;
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
public
class ScrapperUpdatesHandleService { // TODO maybe finally rewrite as handler? I see, that there is some problems - but
    // it not that hard
    public static final String BASIC_REPLY =
            "Получено обновление по url: %s:\n%s"; // TODO check if it makes sense to move to storage

    private final EventsStateWatcher eventsStateWatcher;
    private final ScrapperLinkUpdatesRepository linkUpdatesRepository;
    private final Lock scrapperEventsProcessingLock = new ReentrantLock();
    private final LinkTracerTelegramBotClient telegramBotClient;

    @Transactional
    public void handle(ScrapperLinkUpdate update, EventID eventID) { // TODO surround with try cath finally to free lock
        if (!scrapperEventsProcessingLock.tryLock()) { // We are in processScrapperScheduledUpdates
            linkUpdatesRepository.createLinkUpdate(eventID, update);
            return;
        }

        try {
            var linkUpdateOptional = linkUpdatesRepository.readLinkUpdate(
                    eventID); // TODO may be just rm and handle repo error? dont really need trans here
            if (linkUpdateOptional.isPresent()) {
                log.atWarn().addKeyValue("event id", eventID).log("Attempt to handle link update event twice");
                update = linkUpdateOptional.orElseThrow();
            } else {
                update = linkUpdatesRepository.createLinkUpdate(eventID, update);
            }
            log.atInfo().addKeyValue("event id", eventID).log("Handle link update event");

            var handledUpdate = update;
            update.botChatIDS().forEach(chatId -> {
                telegramBotClient.sendMessage(
                        chatId.getNumericID(),
                        String.format(BASIC_REPLY, handledUpdate.url(), handledUpdate.description()));
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
                handle(linkUpdatesRepository.readLinkUpdate(event.id()).orElseThrow(), event.id()); // TODO add check
            });
        } finally {
            scrapperEventsProcessingLock.unlock();
        }
    }
}
