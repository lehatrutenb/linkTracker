package backend.academy.linktracker.scrapper.property;

import backend.academy.linktracker.properties.RefreshScopeProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.telegram.link.tracker")
@Validated
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Component
@RefreshScopeProperty // TODO make somehow not dependant on bot app - may be move to shared utils
public class ScrapperTelegramBotLinkTrackerProperties {
    @NotEmpty
    @URL
    private String apiPath;

    @Valid
    @NotNull
    private Paths paths;

    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    public static class Paths {
        @NotNull
        private URI updates;
    }
}
