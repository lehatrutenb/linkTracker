<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/services/ScrapperUpdatesHandleService.java
package backend.academy.linktracker.bot.usecase.services;

import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.entities.LinkUpdate;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.core.port.ScrapperLinkUpdatesRepository;
import backend.academy.linktracker.bot.usecase.mappers.TelegramUpdatesMapper;
========
package backend.academy.linktracker.bot.usecase.service;

import backend.academy.linktracker.bot.adapter.client.LinkTracerTelegramBotClient;
import backend.academy.linktracker.bot.adapter.repository.ScrapperLinkUpdatesRepository;
import backend.academy.linktracker.bot.core.entity.EventID;
import backend.academy.linktracker.bot.core.enumeration.OwnerIDType;
import backend.academy.linktracker.bot.usecase.dto.generated.LinkUpdate;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/service/ScrapperUpdatesHandleService.java
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
@RefreshScope
@SuppressFBWarnings(
        "VA_FORMAT_STRING_USES_NEWLINE") // ignored warning cause assertj matches not works correctly with %n
public class ScrapperUpdatesHandleService {
    // it not that hard
    public static final String BASIC_REPLY = "Получено обновление по url: %s:\n%s";

    private final EventsStateWatcher eventsStateWatcher;
    private final ScrapperLinkUpdatesRepository linkUpdatesRepository;
<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/services/ScrapperUpdatesHandleService.java
    private final BotChatMetaDataService replyServiceMatcher;
========
    private final LinkTracerTelegramBotClient linkTracerTelegramBotReplier;
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/service/ScrapperUpdatesHandleService.java
    private final Lock scrapperEventsProcessingLock = new ReentrantLock();

    public void handle(LinkUpdate update, EventID eventID) {
        if (!scrapperEventsProcessingLock.tryLock()) { // We are in processScrapperScheduledUpdates
            linkUpdatesRepository.addLinkUpdate(eventID, update);
            return;
        }

        try {
            var linkUpdateOptional = linkUpdatesRepository.getLinkUpdate(eventID); // TODO may be just rm and handle repo error? dont really need trans here
            if (linkUpdateOptional.isPresent()) {
                log.atWarn().addKeyValue("event id", eventID).log("Attempt to handle link update event twice");
                return;
            }
            linkUpdatesRepository.addLinkUpdate(eventID, update);
            log.atInfo().addKeyValue("event id", eventID).log("Handle link update event");

<<<<<<<< HEAD:.bot/src/main/java/backend/academy/linktracker/bot/usecase/services/ScrapperUpdatesHandleService.java
            update.botChatIDS().forEach(chatId -> {
                var replyService = replyServiceMatcher.getReplyService(chatId);
                if (replyService.isEmpty()) {
                    log.atWarn().addKeyValue("event id", eventID).log("Found no replier service for such event");
                    eventsStateWatcher.markEventAsSkipped(eventID);
                    return;
                }
                replyService
                        .orElseThrow()
                        .sendMessage(chatId.getNumericID(), String.format(_BASIC_REPLY, update.url(), update.description()));
========
            update.getTgChatIds().forEach(chatId -> {
                linkTracerTelegramBotReplier.sendMessage(
                        chatId, String.format(BASIC_REPLY, update.getUrl(), update.getDescription()));
>>>>>>>> HW2:bot/src/main/java/backend/academy/linktracker/bot/usecase/service/ScrapperUpdatesHandleService.java
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
