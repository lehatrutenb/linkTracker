package backend.academy.linktracker.scrapper.property;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.validation.annotation.Validated;

@ConfigurationProperties(prefix = "app.stackoverflow")
@Validated
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
public class StackoverflowProperties {

    @NotEmpty
    private String key;

    @NotEmpty
    private String accessToken;

    @NotNull
    private URI apiRoot = URI.create("https://api.stackexchange.com");

    @NotNull
    private URI stackOverflowRoot = URI.create("https://stackoverflow.com");

    @Min(0)
    private int maxRequestsBeforeCalmDown = 3;

    @Max(100)
    @Min(1)
    private int apiPageSize = 100;

    @NotEmpty
    private String apiVersion = "2.3";
}
