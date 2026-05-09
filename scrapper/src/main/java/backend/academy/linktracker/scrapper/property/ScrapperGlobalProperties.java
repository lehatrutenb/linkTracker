package backend.academy.linktracker.scrapper.property;

import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.global")
@Validated
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class ScrapperGlobalProperties {
    @NotNull
    @DurationUnit(ChronoUnit.MILLIS)
    private Duration scrappingFixedRate = Duration.ofSeconds(10);

    boolean debugMode = true;

    long rateLimitWarningProcs = 10;
    long rateLimitDebugModeRefuseProcs = 25;

    int parallelScrappersAmount = 5;

    long maxDescriptionLength = 200;

    @NotNull
    Instant defaultLinkCreationDate = Instant.EPOCH; // Not min, but epoch cause cant format to date string in request it
}
