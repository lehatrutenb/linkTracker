package backend.academy.linktracker.bot.property;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.global")
@Validated
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Component
public class BotGlobalProperties {
    long sharedStateGroup = 1;
}
