package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * Represents a &#39;pull_request_review&#39; secret scanning location type. This location type shows that a secret was detected in a review on a pull request.
 */
@Schema(
        name = "secret-scanning-location-pull-request-review",
        description =
                "Represents a 'pull_request_review' secret scanning location type. This location type shows that a secret was detected in a review on a pull request.")
@JsonTypeName("secret-scanning-location-pull-request-review")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationPullRequestReview
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private URI pullRequestReviewUrl;

    public SecretScanningLocationPullRequestReview() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationPullRequestReview(URI pullRequestReviewUrl) {
        this.pullRequestReviewUrl = pullRequestReviewUrl;
    }

    public SecretScanningLocationPullRequestReview pullRequestReviewUrl(URI pullRequestReviewUrl) {
        this.pullRequestReviewUrl = pullRequestReviewUrl;
        return this;
    }

    /**
     * The API URL to get the pull request review where the secret was detected.
     * @return pullRequestReviewUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "pull_request_review_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/2846/reviews/80",
            description = "The API URL to get the pull request review where the secret was detected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_review_url")
    public URI getPullRequestReviewUrl() {
        return pullRequestReviewUrl;
    }

    public void setPullRequestReviewUrl(URI pullRequestReviewUrl) {
        this.pullRequestReviewUrl = pullRequestReviewUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationPullRequestReview secretScanningLocationPullRequestReview =
                (SecretScanningLocationPullRequestReview) o;
        return Objects.equals(this.pullRequestReviewUrl, secretScanningLocationPullRequestReview.pullRequestReviewUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pullRequestReviewUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationPullRequestReview {\n");
        sb.append("    pullRequestReviewUrl: ")
                .append(toIndentedString(pullRequestReviewUrl))
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
