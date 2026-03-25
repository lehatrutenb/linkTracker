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
 * Represents a &#39;pull_request_comment&#39; secret scanning location type. This location type shows that a secret was detected in a comment on a pull request.
 */
@Schema(
        name = "secret-scanning-location-pull-request-comment",
        description =
                "Represents a 'pull_request_comment' secret scanning location type. This location type shows that a secret was detected in a comment on a pull request.")
@JsonTypeName("secret-scanning-location-pull-request-comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationPullRequestComment
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private URI pullRequestCommentUrl;

    public SecretScanningLocationPullRequestComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationPullRequestComment(URI pullRequestCommentUrl) {
        this.pullRequestCommentUrl = pullRequestCommentUrl;
    }

    public SecretScanningLocationPullRequestComment pullRequestCommentUrl(URI pullRequestCommentUrl) {
        this.pullRequestCommentUrl = pullRequestCommentUrl;
        return this;
    }

    /**
     * The API URL to get the pull request comment where the secret was detected.
     * @return pullRequestCommentUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "pull_request_comment_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451",
            description = "The API URL to get the pull request comment where the secret was detected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pull_request_comment_url")
    public URI getPullRequestCommentUrl() {
        return pullRequestCommentUrl;
    }

    public void setPullRequestCommentUrl(URI pullRequestCommentUrl) {
        this.pullRequestCommentUrl = pullRequestCommentUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationPullRequestComment secretScanningLocationPullRequestComment =
                (SecretScanningLocationPullRequestComment) o;
        return Objects.equals(
                this.pullRequestCommentUrl, secretScanningLocationPullRequestComment.pullRequestCommentUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pullRequestCommentUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationPullRequestComment {\n");
        sb.append("    pullRequestCommentUrl: ")
                .append(toIndentedString(pullRequestCommentUrl))
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
