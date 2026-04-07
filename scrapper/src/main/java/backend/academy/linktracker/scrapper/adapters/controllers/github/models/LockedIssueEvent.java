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
 * Locked Issue Event
 */
@Schema(name = "locked-issue-event", description = "Locked Issue Event")
@JsonTypeName("locked-issue-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class LockedIssueEvent {

    private Long id;

    private String nodeId;

    private String url;

    private SimpleUser actor;

    private String event;

    private JsonNullable<String> commitId = JsonNullable.<String>undefined();

    private JsonNullable<String> commitUrl = JsonNullable.<String>undefined();

    private String createdAt;

    private JsonNullable<NullableIntegration> performedViaGithubApp = JsonNullable.<NullableIntegration>undefined();

    private JsonNullable<String> lockReason = JsonNullable.<String>undefined();

    public LockedIssueEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public LockedIssueEvent(
            Long id,
            String nodeId,
            String url,
            SimpleUser actor,
            String event,
            String commitId,
            String commitUrl,
            String createdAt,
            NullableIntegration performedViaGithubApp,
            String lockReason) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.actor = actor;
        this.event = event;
        this.commitId = JsonNullable.of(commitId);
        this.commitUrl = JsonNullable.of(commitUrl);
        this.createdAt = createdAt;
        this.performedViaGithubApp = JsonNullable.of(performedViaGithubApp);
        this.lockReason = JsonNullable.of(lockReason);
    }

    public LockedIssueEvent id(Long id) {
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

    public LockedIssueEvent nodeId(String nodeId) {
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

    public LockedIssueEvent url(String url) {
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

    public LockedIssueEvent actor(SimpleUser actor) {
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

    public LockedIssueEvent event(String event) {
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

    public LockedIssueEvent commitId(String commitId) {
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

    public LockedIssueEvent commitUrl(String commitUrl) {
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

    public LockedIssueEvent createdAt(String createdAt) {
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

    public LockedIssueEvent performedViaGithubApp(NullableIntegration performedViaGithubApp) {
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

    public LockedIssueEvent lockReason(String lockReason) {
        this.lockReason = JsonNullable.of(lockReason);
        return this;
    }

    /**
     * Get lockReason
     * @return lockReason
     */
    @NotNull
    @Schema(name = "lock_reason", example = "\"off-topic\"", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("lock_reason")
    public JsonNullable<String> getLockReason() {
        return lockReason;
    }

    public void setLockReason(JsonNullable<String> lockReason) {
        this.lockReason = lockReason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LockedIssueEvent lockedIssueEvent = (LockedIssueEvent) o;
        return Objects.equals(this.id, lockedIssueEvent.id)
                && Objects.equals(this.nodeId, lockedIssueEvent.nodeId)
                && Objects.equals(this.url, lockedIssueEvent.url)
                && Objects.equals(this.actor, lockedIssueEvent.actor)
                && Objects.equals(this.event, lockedIssueEvent.event)
                && Objects.equals(this.commitId, lockedIssueEvent.commitId)
                && Objects.equals(this.commitUrl, lockedIssueEvent.commitUrl)
                && Objects.equals(this.createdAt, lockedIssueEvent.createdAt)
                && Objects.equals(this.performedViaGithubApp, lockedIssueEvent.performedViaGithubApp)
                && Objects.equals(this.lockReason, lockedIssueEvent.lockReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, nodeId, url, actor, event, commitId, commitUrl, createdAt, performedViaGithubApp, lockReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LockedIssueEvent {\n");
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
        sb.append("    lockReason: ").append(toIndentedString(lockReason)).append("\n");
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
