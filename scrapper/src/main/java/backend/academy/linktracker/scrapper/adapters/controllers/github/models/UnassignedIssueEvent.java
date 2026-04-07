package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Unassigned Issue Event
 */
@Schema(name = "unassigned-issue-event", description = "Unassigned Issue Event")
@JsonTypeName("unassigned-issue-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UnassignedIssueEvent {

    private Long id;

    private String nodeId;

    private String url;

    private SimpleUser actor;

    private String event;

    private JsonNullable<String> commitId = JsonNullable.<String>undefined();

    private JsonNullable<String> commitUrl = JsonNullable.<String>undefined();

    private String createdAt;

    private JsonNullable<NullableIntegration> performedViaGithubApp = JsonNullable.<NullableIntegration>undefined();

    private SimpleUser assignee;

    private SimpleUser assigner;

    public UnassignedIssueEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UnassignedIssueEvent(
            Long id,
            String nodeId,
            String url,
            SimpleUser actor,
            String event,
            String commitId,
            String commitUrl,
            String createdAt,
            NullableIntegration performedViaGithubApp,
            SimpleUser assignee,
            SimpleUser assigner) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.actor = actor;
        this.event = event;
        this.commitId = JsonNullable.of(commitId);
        this.commitUrl = JsonNullable.of(commitUrl);
        this.createdAt = createdAt;
        this.performedViaGithubApp = JsonNullable.of(performedViaGithubApp);
        this.assignee = assignee;
        this.assigner = assigner;
    }

    public UnassignedIssueEvent id(Long id) {
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

    public UnassignedIssueEvent nodeId(String nodeId) {
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

    public UnassignedIssueEvent url(String url) {
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

    public UnassignedIssueEvent actor(SimpleUser actor) {
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

    public UnassignedIssueEvent event(String event) {
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

    public UnassignedIssueEvent commitId(String commitId) {
        this.commitId = JsonNullable.of(commitId);
        return this;
    }

    /**
     * Get commitId
     * @return commitId
     */
    @NotNull
    @Schema(name = "commit_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_id")
    public JsonNullable<String> getCommitId() {
        return commitId;
    }

    public void setCommitId(JsonNullable<String> commitId) {
        this.commitId = commitId;
    }

    public UnassignedIssueEvent commitUrl(String commitUrl) {
        this.commitUrl = JsonNullable.of(commitUrl);
        return this;
    }

    /**
     * Get commitUrl
     * @return commitUrl
     */
    @NotNull
    @Schema(name = "commit_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("commit_url")
    public JsonNullable<String> getCommitUrl() {
        return commitUrl;
    }

    public void setCommitUrl(JsonNullable<String> commitUrl) {
        this.commitUrl = commitUrl;
    }

    public UnassignedIssueEvent createdAt(String createdAt) {
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

    public UnassignedIssueEvent performedViaGithubApp(NullableIntegration performedViaGithubApp) {
        this.performedViaGithubApp = JsonNullable.of(performedViaGithubApp);
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
    public JsonNullable<NullableIntegration> getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(JsonNullable<NullableIntegration> performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public UnassignedIssueEvent assignee(SimpleUser assignee) {
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

    public UnassignedIssueEvent assigner(SimpleUser assigner) {
        this.assigner = assigner;
        return this;
    }

    /**
     * Get assigner
     * @return assigner
     */
    @NotNull
    @Valid
    @Schema(name = "assigner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("assigner")
    public SimpleUser getAssigner() {
        return assigner;
    }

    public void setAssigner(SimpleUser assigner) {
        this.assigner = assigner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnassignedIssueEvent unassignedIssueEvent = (UnassignedIssueEvent) o;
        return Objects.equals(this.id, unassignedIssueEvent.id)
                && Objects.equals(this.nodeId, unassignedIssueEvent.nodeId)
                && Objects.equals(this.url, unassignedIssueEvent.url)
                && Objects.equals(this.actor, unassignedIssueEvent.actor)
                && Objects.equals(this.event, unassignedIssueEvent.event)
                && Objects.equals(this.commitId, unassignedIssueEvent.commitId)
                && Objects.equals(this.commitUrl, unassignedIssueEvent.commitUrl)
                && Objects.equals(this.createdAt, unassignedIssueEvent.createdAt)
                && Objects.equals(this.performedViaGithubApp, unassignedIssueEvent.performedViaGithubApp)
                && Objects.equals(this.assignee, unassignedIssueEvent.assignee)
                && Objects.equals(this.assigner, unassignedIssueEvent.assigner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                url,
                actor,
                event,
                commitId,
                commitUrl,
                createdAt,
                performedViaGithubApp,
                assignee,
                assigner);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnassignedIssueEvent {\n");
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
        sb.append("    assigner: ").append(toIndentedString(assigner)).append("\n");
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
