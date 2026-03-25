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
 * Represents a &#39;discussion_comment&#39; secret scanning location type. This location type shows that a secret was detected in a comment on a discussion.
 */
@Schema(
        name = "secret-scanning-location-discussion-comment",
        description =
                "Represents a 'discussion_comment' secret scanning location type. This location type shows that a secret was detected in a comment on a discussion.")
@JsonTypeName("secret-scanning-location-discussion-comment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecretScanningLocationDiscussionComment
        implements NullableSecretScanningFirstDetectedLocation, SecretScanningLocationDetails {

    private URI discussionCommentUrl;

    public SecretScanningLocationDiscussionComment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SecretScanningLocationDiscussionComment(URI discussionCommentUrl) {
        this.discussionCommentUrl = discussionCommentUrl;
    }

    public SecretScanningLocationDiscussionComment discussionCommentUrl(URI discussionCommentUrl) {
        this.discussionCommentUrl = discussionCommentUrl;
        return this;
    }

    /**
     * The API URL to get the discussion comment where the secret was detected.
     * @return discussionCommentUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "discussion_comment_url",
            example = "https://github.com/community/community/discussions/39082#discussioncomment-4158232",
            description = "The API URL to get the discussion comment where the secret was detected.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("discussion_comment_url")
    public URI getDiscussionCommentUrl() {
        return discussionCommentUrl;
    }

    public void setDiscussionCommentUrl(URI discussionCommentUrl) {
        this.discussionCommentUrl = discussionCommentUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecretScanningLocationDiscussionComment secretScanningLocationDiscussionComment =
                (SecretScanningLocationDiscussionComment) o;
        return Objects.equals(this.discussionCommentUrl, secretScanningLocationDiscussionComment.discussionCommentUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(discussionCommentUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecretScanningLocationDiscussionComment {\n");
        sb.append("    discussionCommentUrl: ")
                .append(toIndentedString(discussionCommentUrl))
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
