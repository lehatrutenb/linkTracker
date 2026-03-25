package backend.academy.linktracker.scrapper.usecases.services;

import backend.academy.linktracker.scrapper.common.TimeUtils;
import backend.academy.linktracker.scrapper.usecases.wrappers.OuterServiceScrapper;
import java.time.Instant;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleUpdatesOnLinksService {
    private final List<OuterServiceScrapper> scrappers;
    private Instant lastTimeCalled = Instant.MIN;
    private final TimeUtils timeUtils;
    private final ScrappingLinkListenersService linkListenersService;
    private final ScrappedUpdatesPublishService publishService;

    @Scheduled(fixedDelayString = "#{@scrapperGlobalProperties.scrappingFixedRate.toMillis()}")
    public void scrapUpdates() {
        var linksToListen = linkListenersService.getAllListeningLinks();
        scrappers.forEach(scrapper -> {
            var toScrap = linksToListen.stream()
                    .filter(link -> scrapper.checkCanScrap(link.uri()))
                    .toList();

            toScrap.forEach(link -> {
                var updates = scrapper.scrap(link.uri(), link.updatedAt());
                publishService.publishUpdates(updates.getLeft(), link);
                linkListenersService.setFreshUpdatedTag(
                        link, updates.getRight()); // Set new time only after successful send
            });
        });
        lastTimeCalled = timeUtils.now();
    }
}
