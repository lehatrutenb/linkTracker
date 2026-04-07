package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;

/**
 * Represents a &#39;pull_request_body&#39; secret scanning location type. This location type shows that a secret was detected in the body of a pull request.
 */
@Schema(
        name = "secret-scanning-location-pull-request-body",
        description =
                "Represents a 'pull_request_body' secret scanning location type. This location type shows that a secret was detected in the body of a pull request.")
@JsonTypeName("secret-scanning-location-pull-request-body")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationPullRequestBody
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private URI pullRequestBodyUrl;

    public SecretScanningLocationPullRequestBody() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationPullRequestBody(URI pullRequestBodyUrl) {
        this.pullRequestBodyUrl = pullRequestBodyUrl;
    }

    public SecretScanningLocationPullRequestBody pullRequestBodyUrl(URI pullRequestBodyUrl) {
        this.pullRequestBodyUrl = pullRequestBodyUrl;
        return this;
    }

    /**
     * The API URL to get the pull request where the secret was detected.
     * @return pullRequestBodyUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "pull_request_body_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/2846",
            description = "The API URL to get the pull request where the secret was detected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_body_url")
    public URI getPullRequestBodyUrl() {
        return pullRequestBodyUrl;
    }

    public void setPullRequestBodyUrl(URI pullRequestBodyUrl) {
        this.pullRequestBodyUrl = pullRequestBodyUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationPullRequestBody secretScanningLocationPullRequestBody =
                (SecretScanningLocationPullRequestBody) o;
        return Objects.equals(this.pullRequestBodyUrl, secretScanningLocationPullRequestBody.pullRequestBodyUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pullRequestBodyUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationPullRequestBody {\n");
        sb.append("    pullRequestBodyUrl: ")
                .append(toIndentedString(pullRequestBodyUrl))
                .append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
