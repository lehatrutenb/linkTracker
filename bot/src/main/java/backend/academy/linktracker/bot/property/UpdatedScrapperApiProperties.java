package backend.academy.linktracker.bot.property;

import backend.academy.linktracker.properties.RefreshScopeProperty;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.scrapper")
@Validated
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Component
@RefreshScopeProperty
public class UpdatedScrapperApiProperties {
    @NotNull
    private URI apiPath;

    @Valid
    @NotNull
    private Paths paths;

    @Getter
    @Setter
    @EqualsAndHashCode
    @NoArgsConstructor
    public static class Paths {
        @NotNull
        private String addChat;

        @NotNull
        private String deleteChat;

        @NotNull
        private String listLinks;

        @NotNull
        private String trackLink;

        @NotNull
        private String untrackLink;
    }
}
