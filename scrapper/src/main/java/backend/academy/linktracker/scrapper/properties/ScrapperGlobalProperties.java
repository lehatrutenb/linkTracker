package backend.academy.linktracker.scrapper.properties;

import jakarta.validation.constraints.NotNull;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.global")
@Validated
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Component
public class ScrapperGlobalProperties {
    @NotNull
    @DurationUnit(ChronoUnit.MILLIS)
    private Duration scrappingFixedRate = Duration.ofSeconds(10);

    boolean debugMode = true;

    long rateLimitWarningProcs = 10;
    long rateLimitDebugModeRefuseProcs = 25;
}
