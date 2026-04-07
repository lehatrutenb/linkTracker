package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WebhookPullRequestReviewThreadResolvedThread
 */
@JsonTypeName("webhook_pull_request_review_thread_resolved_thread")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPullRequestReviewThreadResolvedThread {

    @Valid
    private List<@Valid PullRequestReviewComment1> comments = new ArrayList<>();

    private String nodeId;

    public WebhookPullRequestReviewThreadResolvedThread() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPullRequestReviewThreadResolvedThread(
            List<@Valid PullRequestReviewComment1> comments, String nodeId) {
        this.comments = comments;
        this.nodeId = nodeId;
    }

    public WebhookPullRequestReviewThreadResolvedThread comments(List<@Valid PullRequestReviewComment1> comments) {
        this.comments = comments;
        return this;
    }

    public WebhookPullRequestReviewThreadResolvedThread addCommentsItem(PullRequestReviewComment1 commentsItem) {
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
    public List<@Valid PullRequestReviewComment1> getComments() {
        return comments;
    }

    public void setComments(List<@Valid PullRequestReviewComment1> comments) {
        this.comments = comments;
    }

    public WebhookPullRequestReviewThreadResolvedThread nodeId(String nodeId) {
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
        WebhookPullRequestReviewThreadResolvedThread webhookPullRequestReviewThreadResolvedThread =
                (WebhookPullRequestReviewThreadResolvedThread) o;
        return Objects.equals(this.comments, webhookPullRequestReviewThreadResolvedThread.comments)
                && Objects.equals(this.nodeId, webhookPullRequestReviewThreadResolvedThread.nodeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(comments, nodeId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPullRequestReviewThreadResolvedThread {\n");
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
