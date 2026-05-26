package backend.academy.linktracker.scrapper.usecase.service;

import backend.academy.linktracker.scrapper.property.ScrapperGlobalProperties;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ScrapperRateLimitService {
    private final ScrapperGlobalProperties globalProperties;
    private Instant nextAcceptRequestsTime = Instant.MIN;

    public boolean isReachedRateLimit() {
        if (nextAcceptRequestsTime.isAfter(Instant.now())) {
            log.error("Scrapper is using too much requests - refusing request");
            return true;
        }
        return false;
    }

    public void setUpdateRateLimitData(Optional<Long> quoutaMax, Optional<Long> quotaRemaining) {
        long procsUsed = (quoutaMax.orElseThrow() - quotaRemaining.orElseThrow()) / (quoutaMax.orElseThrow() / 100);
        if (procsUsed > globalProperties.getRateLimitWarningProcs()) {
            log.atWarn().addKeyValue("used API rate procs", procsUsed).log("Scrapper is using too much requests");
        }
        if (procsUsed > globalProperties.getRateLimitDebugModeRefuseProcs() && globalProperties.isDebugMode()) {
            log.atError()
                    .addKeyValue("used API rate procs", procsUsed)
                    .log("Scrapper is using too much requests - next requests will be refused");
            var newAcceptTime = Instant.now().plus(Duration.ofHours(1));
            if (newAcceptTime.isAfter(nextAcceptRequestsTime)) {
                nextAcceptRequestsTime = newAcceptTime;
            }
        }
    }
}
