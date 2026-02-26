package backend.academy.linktracker.bot.properties;

import jakarta.validation.constraints.NotEmpty;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.convert.DurationUnit;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.telegram.link.tracker")
@Validated
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Component
public class TelegramLinkTrackerProperties {

    @NotEmpty
    @URL
    private String url;

    @NotEmpty
    private String token;

    @DurationUnit(ChronoUnit.MILLIS)
    private Duration updateListenerSleep = Duration.ofSeconds(1);

    @DurationUnit(ChronoUnit.MILLIS)
    private Duration initStateTrySetFixedRate = Duration.ofSeconds(1);

    private long maxMessagesBatchSize = 100;

    private boolean debug;
}
