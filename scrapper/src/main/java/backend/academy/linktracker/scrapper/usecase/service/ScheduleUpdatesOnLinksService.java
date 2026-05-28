package backend.academy.linktracker.scrapper.usecase.service;

import backend.academy.linktracker.scrapper.core.entities.ScrapperLink;
import backend.academy.linktracker.scrapper.usecase.wrapper.OuterServiceScrapper;
import java.util.Collection;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class ScheduleUpdatesOnLinksService {
    private final List<OuterServiceScrapper> scrappers;
    private final ScrappingLinkService linkListenersService;
    private final ScrappedUpdatesPublishService publishService;

    @Scheduled(fixedDelayString = "${app.global.scrapping-fixed-rate}")
    public void scrapUpdates() {
        var linksToListen = linkListenersService.getAllListeningLinks();
        scrappers.forEach(scrapper -> {
            var toScrap = linksToListen.stream().filter(scrapper::checkCanScrap).toList();

            toScrap.forEach(link -> {
                try {
                    var updates = scrapper.scrap(link.getUri(), link.getUpdatedAt());
                    publishService.publishUpdates(updates.getLeft(), link);
                    linkListenersService.setFreshUpdatedTag(
                            link, updates.getRight()); // Set new time only after successful send
                } catch (Exception e) {
                    log.error("Error scraping updates for link: {}", link.getUri(), e);
                }
            });
        });
    }

    public Collection<OuterServiceScrapper> getLinkScrappers(ScrapperLink link) {
        return scrappers.stream()
                .filter(scrapper -> scrapper.checkCanScrap(link))
                .toList();
    }
}
