package backend.academy.linktracker.bot.usecases.services;

import backend.academy.linktracker.bot.adapters.repository.ScrapperLinkUpdatesRepository;
import backend.academy.linktracker.bot.core.entities.EventID;
import backend.academy.linktracker.bot.core.enums.OwnerIDType;
import backend.academy.linktracker.bot.usecases.dtos.LinkUpdate;
import backend.academy.linktracker.bot.usecases.mappers.TelegramUpdatesMapper;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class ScrapperUpdatesHandleService {
    private static final String BASIC_REPLY =
            "Получено обновление по url: %s:\n%s"; // TODO check if it makes sense to move to storage

    private final EventsStateWatcher eventsStateWatcher;
    private final ScrapperLinkUpdatesRepository linkUpdatesRepository;
    private final ReplyServiceMatcher replyServiceMatcher;
    private final Lock scrapperEventsProcessingLock = new ReentrantLock();

    public void handle(LinkUpdate update, EventID eventID) { // TODO surround with try cath finally to free lock
        if (!scrapperEventsProcessingLock.tryLock()) { // We are in processScrapperScheduledUpdates
            linkUpdatesRepository.setLinkUpdate(eventID, update);
            return;
        }

        var linkUpdateOptional = linkUpdatesRepository.getLinkUpdate(eventID);
        if (linkUpdateOptional.isPresent()) {
            log.atWarn().addKeyValue("event id", eventID).log("Attempt to handle link update event twice");
            scrapperEventsProcessingLock.unlock();
            return;
        }
        linkUpdatesRepository.setLinkUpdate(eventID, update);
        log.atInfo().addKeyValue("event id", eventID).log("Handle link update event");

        update.getTgChatIds().forEach(chatId -> {
            var replyService = replyServiceMatcher.getReplyService(TelegramUpdatesMapper.mapScrapperChatId(chatId));
            if (replyService.isEmpty()) {
                log.atWarn().addKeyValue("event id", eventID).log("Found no replier service for such event");
                eventsStateWatcher.markEventAsSkipped(eventID);
                scrapperEventsProcessingLock.unlock();
                return;
            }
            replyService
                    .orElseThrow()
                    .sendMessage(chatId, String.format(BASIC_REPLY, update.getUrl(), update.getDescription()));
        });
        eventsStateWatcher.markEventAsDone(
                eventID); // TODO currently may repeat message twice cause may process only part of chats - but let it
        // currently be

        scrapperEventsProcessingLock.unlock();
    }

    @Scheduled(fixedDelayString = "#{@telegramLinkTrackerProperties.initStateTrySetFixedRate}")
    public void processScrapperScheduledUpdates() {
        scrapperEventsProcessingLock.lock();
        eventsStateWatcher.getElderlyProcessingEvents(OwnerIDType.SCRAPPER).forEach(event -> {
            if (eventsStateWatcher.toProcessEvent(event.id())) {
                handle(linkUpdatesRepository.getLinkUpdate(event.id()).orElseThrow(), event.id()); // TODO add check
            }
        });
        scrapperEventsProcessingLock.unlock();
    }
}
