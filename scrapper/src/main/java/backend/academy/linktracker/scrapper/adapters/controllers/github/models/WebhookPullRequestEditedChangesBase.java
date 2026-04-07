package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * WebhookPullRequestEditedChangesBase
 */
@JsonTypeName("webhook_pull_request_edited_changes_base")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestEditedChangesBase {

    private WebhookDiscussionCommentEditedChangesBody ref;

    private WebhookDiscussionCommentEditedChangesBody sha;

    public WebhookPullRequestEditedChangesBase() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPullRequestEditedChangesBase(
            WebhookDiscussionCommentEditedChangesBody ref, WebhookDiscussionCommentEditedChangesBody sha) {
        this.ref = ref;
        this.sha = sha;
    }

    public WebhookPullRequestEditedChangesBase ref(WebhookDiscussionCommentEditedChangesBody ref) {
        this.ref = ref;
        return this;
    }

    /**
     * Get ref
     * @return ref
     */
    @NotNull
    @Valid
    @Schema(name = "ref", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ref")
    public WebhookDiscussionCommentEditedChangesBody getRef() {
        return ref;
    }

    public void setRef(WebhookDiscussionCommentEditedChangesBody ref) {
        this.ref = ref;
    }

    public WebhookPullRequestEditedChangesBase sha(WebhookDiscussionCommentEditedChangesBody sha) {
        this.sha = sha;
        return this;
    }

    /**
     * Get sha
     * @return sha
     */
    @NotNull
    @Valid
    @Schema(name = "sha", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sha")
    public WebhookDiscussionCommentEditedChangesBody getSha() {
        return sha;
    }

    public void setSha(WebhookDiscussionCommentEditedChangesBody sha) {
        this.sha = sha;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPullRequestEditedChangesBase webhookPullRequestEditedChangesBase =
                (WebhookPullRequestEditedChangesBase) o;
        return Objects.equals(this.ref, webhookPullRequestEditedChangesBase.ref)
                && Objects.equals(this.sha, webhookPullRequestEditedChangesBase.sha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ref, sha);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestEditedChangesBase {\n");
        sb.append("    ref: ").append(toIndentedString(ref)).append("\n");
        sb.append("    sha: ").append(toIndentedString(sha)).append("\n");
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
