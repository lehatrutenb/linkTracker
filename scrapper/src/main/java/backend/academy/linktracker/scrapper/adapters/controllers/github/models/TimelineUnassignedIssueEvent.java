package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Timeline Unassigned Issue Event
 */
@Schema(name = "timeline-unassigned-issue-event", description = "Timeline Unassigned Issue Event")
@JsonTypeName("timeline-unassigned-issue-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TimelineUnassignedIssueEvent {

    private Long id;

    private String nodeId;

    private String url;

    private SimpleUser actor;

    private String event;

    private String commitId = null;

    private String commitUrl = null;

    private String createdAt;

    private NullableIntegration performedViaGithubApp = null;

    private SimpleUser assignee;

    public TimelineUnassignedIssueEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TimelineUnassignedIssueEvent(
            Long id,
            String nodeId,
            String url,
            SimpleUser actor,
            String event,
            String commitId,
            String commitUrl,
            String createdAt,
            NullableIntegration performedViaGithubApp,
            SimpleUser assignee) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.actor = actor;
        this.event = event;
        this.commitId = commitId;
        this.commitUrl = commitUrl;
        this.createdAt = createdAt;
        this.performedViaGithubApp = performedViaGithubApp;
        this.assignee = assignee;
    }

    public TimelineUnassignedIssueEvent id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TimelineUnassignedIssueEvent nodeId(String nodeId) {
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

    public TimelineUnassignedIssueEvent url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public TimelineUnassignedIssueEvent actor(SimpleUser actor) {
        this.actor = actor;
        return this;
    }

    /**
     * Get actor
     * @return actor
     */
    @NotNull
    @Valid
    @Schema(name = "actor", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("actor")
    public SimpleUser getActor() {
        return actor;
    }

    public void setActor(SimpleUser actor) {
        this.actor = actor;
    }

    public TimelineUnassignedIssueEvent event(String event) {
        this.event = event;
        return this;
    }

    /**
     * Get event
     * @return event
     */
    @NotNull
    @Schema(name = "event", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("event")
    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public TimelineUnassignedIssueEvent commitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Get commitId
     * @return commitId
     */
    @NotNull
    @Schema(name = "commit_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public String getCommitId() {
        return commitId;
    }

    public void setCommitId(String commitId) {
        this.commitId = commitId;
    }

    public TimelineUnassignedIssueEvent commitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
        return this;
    }

    /**
     * Get commitUrl
     * @return commitUrl
     */
    @NotNull
    @Schema(name = "commit_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_url")
    public String getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(String commitUrl) {
        this.commitUrl = commitUrl;
    }

    public TimelineUnassignedIssueEvent createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public TimelineUnassignedIssueEvent performedViaGithubApp(NullableIntegration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
        return this;
    }

    /**
     * Get performedViaGithubApp
     * @return performedViaGithubApp
     */
    @NotNull
    @Valid
    @Schema(name = "performed_via_github_app", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("performed_via_github_app")
    public NullableIntegration getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(NullableIntegration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public TimelineUnassignedIssueEvent assignee(SimpleUser assignee) {
        this.assignee = assignee;
        return this;
    }

    /**
     * Get assignee
     * @return assignee
     */
    @NotNull
    @Valid
    @Schema(name = "assignee", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assignee")
    public SimpleUser getAssignee() {
        return assignee;
    }

    public void setAssignee(SimpleUser assignee) {
        this.assignee = assignee;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TimelineUnassignedIssueEvent timelineUnassignedIssueEvent = (TimelineUnassignedIssueEvent) o;
        return Objects.equals(this.id, timelineUnassignedIssueEvent.id)
                && Objects.equals(this.nodeId, timelineUnassignedIssueEvent.nodeId)
                && Objects.equals(this.url, timelineUnassignedIssueEvent.url)
                && Objects.equals(this.actor, timelineUnassignedIssueEvent.actor)
                && Objects.equals(this.event, timelineUnassignedIssueEvent.event)
                && Objects.equals(this.commitId, timelineUnassignedIssueEvent.commitId)
                && Objects.equals(this.commitUrl, timelineUnassignedIssueEvent.commitUrl)
                && Objects.equals(this.createdAt, timelineUnassignedIssueEvent.createdAt)
                && Objects.equals(this.performedViaGithubApp, timelineUnassignedIssueEvent.performedViaGithubApp)
                && Objects.equals(this.assignee, timelineUnassignedIssueEvent.assignee);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, nodeId, url, actor, event, commitId, commitUrl, createdAt, performedViaGithubApp, assignee);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimelineUnassignedIssueEvent {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    actor: ").append(toIndentedString(actor)).append("\n");
        sb.append("    event: ").append(toIndentedString(event)).append("\n");
        sb.append("    commitId: ").append(toIndentedString(commitId)).append("\n");
        sb.append("    commitUrl: ").append(toIndentedString(commitUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    performedViaGithubApp: ")
                .append(toIndentedString(performedViaGithubApp))
                .append("\n");
        sb.append("    assignee: ").append(toIndentedString(assignee)).append("\n");
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
