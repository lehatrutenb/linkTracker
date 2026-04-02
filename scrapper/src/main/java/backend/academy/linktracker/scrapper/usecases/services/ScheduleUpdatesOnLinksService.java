package backend.academy.linktracker.scrapper.usecases.services;

import backend.academy.linktracker.scrapper.common.TimeUtils;
import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.usecases.wrappers.OuterServiceScrapper;
import java.time.Instant;
import java.util.Collection;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ScheduleUpdatesOnLinksService {
    private final List<OuterServiceScrapper> scrappers;
    private Instant lastTimeCalled = Instant.MIN;
    private final TimeUtils timeUtils;
    private final ScrappingLinkService linkListenersService;
    private final ScrappedUpdatesPublishService publishService;

    @Scheduled(fixedDelayString = "#{@scrapperGlobalProperties.scrappingFixedRate.toMillis()}")
    public void scrapUpdates() {
        var linksToListen = linkListenersService.getAllListeningLinks();
        scrappers.forEach(scrapper -> {
            var toScrap = linksToListen.stream()
                    .filter(scrapper::checkCanScrap)
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

    public Collection<OuterServiceScrapper> getLinkScrappers(ScrapperLink link) {
        return scrappers.stream().filter(scrapper -> scrapper.checkCanScrap(link)).toList();
    }
}
