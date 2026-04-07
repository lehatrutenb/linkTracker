package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * Timeline Line Commented Event
 */
@Schema(name = "timeline-line-commented-event", description = "Timeline Line Commented Event")
@JsonTypeName("timeline-line-commented-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TimelineLineCommentedEvent {

    private Optional<String> event = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    @Valid
    private List<@Valid PullRequestReviewComment> comments = new ArrayList<>();

    public TimelineLineCommentedEvent event(String event) {
        this.event = Optional.ofNullable(event);
        return this;
    }

    /**
     * Get event
     * @return event
     */
    @Schema(name = "event", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("event")
    public Optional<String> getEvent() {
        return event;
    }

    public void setEvent(Optional<String> event) {
        this.event = event;
    }

    public TimelineLineCommentedEvent nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public TimelineLineCommentedEvent comments(List<@Valid PullRequestReviewComment> comments) {
        this.comments = comments;
        return this;
    }

    public TimelineLineCommentedEvent addCommentsItem(PullRequestReviewComment commentsItem) {
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
    @Valid
    @Schema(name = "comments", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("comments")
    public List<@Valid PullRequestReviewComment> getComments() {
        return comments;
    }

    public void setComments(List<@Valid PullRequestReviewComment> comments) {
        this.comments = comments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimelineLineCommentedEvent timelineLineCommentedEvent = (TimelineLineCommentedEvent) o;
        return Objects.equals(this.event, timelineLineCommentedEvent.event)
                && Objects.equals(this.nodeId, timelineLineCommentedEvent.nodeId)
                && Objects.equals(this.comments, timelineLineCommentedEvent.comments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(event, nodeId, comments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimelineLineCommentedEvent {\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    comments: ").append(toIndentedString(comments)).append("\n");
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
