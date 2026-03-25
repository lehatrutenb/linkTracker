package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookPullRequestReviewThreadUnresolvedThread
 */
@JsonTypeName("webhook_pull_request_review_thread_unresolved_thread")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestReviewThreadUnresolvedThread {

    @Valid
    private List<@Valid PullRequestReviewComment2> comments = new ArrayList<>();

    private String nodeId;

    public WebhookPullRequestReviewThreadUnresolvedThread() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPullRequestReviewThreadUnresolvedThread(
            List<@Valid PullRequestReviewComment2> comments, String nodeId) {
        this.comments = comments;
        this.nodeId = nodeId;
    }

    public WebhookPullRequestReviewThreadUnresolvedThread comments(List<@Valid PullRequestReviewComment2> comments) {
        this.comments = comments;
        return this;
    }

    public WebhookPullRequestReviewThreadUnresolvedThread addCommentsItem(PullRequestReviewComment2 commentsItem) {
        if (this.comments == null) {
            this.comments = new ArrayList<>();
        }
        this.comments.add(commentsItem);
        return this;
    }

    /**
     * Get comments
     * @return comments
     */
    @NotNull
    @Valid
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comments")
    public List<@Valid PullRequestReviewComment2> getComments() {
        return comments;
    }

    public void setComments(List<@Valid PullRequestReviewComment2> comments) {
        this.comments = comments;
    }

    public WebhookPullRequestReviewThreadUnresolvedThread nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookPullRequestReviewThreadUnresolvedThread webhookPullRequestReviewThreadUnresolvedThread =
                (WebhookPullRequestReviewThreadUnresolvedThread) o;
        return Objects.equals(this.comments, webhookPullRequestReviewThreadUnresolvedThread.comments)
                && Objects.equals(this.nodeId, webhookPullRequestReviewThreadUnresolvedThread.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestReviewThreadUnresolvedThread {\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
