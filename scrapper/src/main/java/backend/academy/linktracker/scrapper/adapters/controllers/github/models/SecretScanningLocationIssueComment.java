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
 * Represents an &#39;issue_comment&#39; secret scanning location type. This location type shows that a secret was detected in a comment on an issue.
 */
@Schema(
        name = "secret-scanning-location-issue-comment",
        description =
                "Represents an 'issue_comment' secret scanning location type. This location type shows that a secret was detected in a comment on an issue.")
@JsonTypeName("secret-scanning-location-issue-comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationIssueComment
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private URI issueCommentUrl;

    public SecretScanningLocationIssueComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationIssueComment(URI issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    public SecretScanningLocationIssueComment issueCommentUrl(URI issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
        return this;
    }

    /**
     * The API URL to get the issue comment where the secret was detected.
     * @return issueCommentUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "issue_comment_url",
            example = "https://api.github.com/repos/octocat/Hello-World/issues/comments/1081119451",
            description = "The API URL to get the issue comment where the secret was detected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("issue_comment_url")
    public URI getIssueCommentUrl() {
        return issueCommentUrl;
    }

    public void setIssueCommentUrl(URI issueCommentUrl) {
        this.issueCommentUrl = issueCommentUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationIssueComment secretScanningLocationIssueComment = (SecretScanningLocationIssueComment) o;
        return Objects.equals(this.issueCommentUrl, secretScanningLocationIssueComment.issueCommentUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(issueCommentUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationIssueComment {\n");
        sb.append("    issueCommentUrl: ")
                .append(toIndentedString(issueCommentUrl))
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
