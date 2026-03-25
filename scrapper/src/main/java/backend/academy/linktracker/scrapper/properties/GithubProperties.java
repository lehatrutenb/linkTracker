package backend.academy.linktracker.scrapper.properties;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.github")
@Component
@Validated
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class GithubProperties {

    @NotEmpty
    private String token;

    @NotEmpty
    private String userAgent;

    @Min(0)
    private int maxRequestsBeforeCalmDown = 3;

    @Min(1)
    private int apiPageSize = 1000;

    @NotNull
    private URI apiRoot = URI.create("https://api.github.com");

    @NotNull
    private URI githubRoot = URI.create("https://github.com");
}
