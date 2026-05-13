package backend.academy.linktracker.scrapper.property;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.snowflake")
@Validated
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class SnowflakeProperties {
    private final long workerID = 1;
    private final long datacenterID = 1;
}
