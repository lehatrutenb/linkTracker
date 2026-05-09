package backend.academy.linktracker.scrapper.usecase.service;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.property.ScrapperGlobalProperties;
import backend.academy.linktracker.scrapper.usecase.wrapper.OuterServiceScrapper;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ScheduleUpdatesOnLinksService {
    private final int WAIT_FOR_TERMINATION_TIMEOUT_SECONDS = 1;
    private final List<OuterServiceScrapper> scrappers;
    private final ScrappingLinkService linkListenersService;
    private final ScrappedUpdatesPublishService publishService;
    private ExecutorService executorService;
    private final AtomicInteger runningTasks = new AtomicInteger(0);

    @Autowired
    public void setExecutorService(ScrapperGlobalProperties globalProperties) {
        executorService = Executors.newFixedThreadPool(globalProperties.getParallelScrappersAmount());
    }

    @Scheduled(fixedDelayString = "${app.global.scrapping-fixed-rate}")
    public void scrapUpdates() {
        var linksToListen = linkListenersService.getAllListeningLinks();
        linksToListen.forEach(link -> executorService.submit(() -> scrapOneLink(link)));
        while (runningTasks.get() > 0) {
            try {
                Thread.sleep(WAIT_FOR_TERMINATION_TIMEOUT_SECONDS * 1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }
    }

    public void scrapOneLink(ScrapperLink link) { // Scrappers fine work concurrenty so no risk
        runningTasks.incrementAndGet();

        try {
            var scrapper = scrappers.stream().filter(srp -> srp.checkCanScrap(link)).findFirst().orElseThrow(); // Should check before that link is scrappable so current state will be broken on on such found
            var updates = scrapper.scrap(link.getUri(), link.getUpdatedAt());
            publishService.publishUpdates(updates.getLeft(), link);
            linkListenersService.setFreshUpdatedTag(
                link, updates.getRight()); // Set new time only after successful send
        } catch (Exception e) {
            log.error("Error scraping updates for link: {}", link.getUri(), e);
        } finally {
            runningTasks.decrementAndGet();
        }
    }

    public Collection<OuterServiceScrapper> getLinkScrappers(ScrapperLink link) {
        return scrappers.stream()
                .filter(scrapper -> scrapper.checkCanScrap(link))
                .toList();
    }
}
