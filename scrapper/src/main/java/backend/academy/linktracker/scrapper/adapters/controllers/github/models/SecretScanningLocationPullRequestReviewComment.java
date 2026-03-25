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
 * Represents a &#39;pull_request_review_comment&#39; secret scanning location type. This location type shows that a secret was detected in a review comment on a pull request.
 */
@Schema(
        name = "secret-scanning-location-pull-request-review-comment",
        description =
                "Represents a 'pull_request_review_comment' secret scanning location type. This location type shows that a secret was detected in a review comment on a pull request.")
@JsonTypeName("secret-scanning-location-pull-request-review-comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationPullRequestReviewComment
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private URI pullRequestReviewCommentUrl;

    public SecretScanningLocationPullRequestReviewComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationPullRequestReviewComment(URI pullRequestReviewCommentUrl) {
        this.pullRequestReviewCommentUrl = pullRequestReviewCommentUrl;
    }

    public SecretScanningLocationPullRequestReviewComment pullRequestReviewCommentUrl(URI pullRequestReviewCommentUrl) {
        this.pullRequestReviewCommentUrl = pullRequestReviewCommentUrl;
        return this;
    }

    /**
     * The API URL to get the pull request review comment where the secret was detected.
     * @return pullRequestReviewCommentUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "pull_request_review_comment_url",
            example = "https://api.github.com/repos/octocat/Hello-World/pulls/comments/12",
            description = "The API URL to get the pull request review comment where the secret was detected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_review_comment_url")
    public URI getPullRequestReviewCommentUrl() {
        return pullRequestReviewCommentUrl;
    }

    public void setPullRequestReviewCommentUrl(URI pullRequestReviewCommentUrl) {
        this.pullRequestReviewCommentUrl = pullRequestReviewCommentUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationPullRequestReviewComment secretScanningLocationPullRequestReviewComment =
                (SecretScanningLocationPullRequestReviewComment) o;
        return Objects.equals(
                this.pullRequestReviewCommentUrl,
                secretScanningLocationPullRequestReviewComment.pullRequestReviewCommentUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pullRequestReviewCommentUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationPullRequestReviewComment {\n");
        sb.append("    pullRequestReviewCommentUrl: ")
                .append(toIndentedString(pullRequestReviewCommentUrl))
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
