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
 * Unlabeled Issue Event
 */
@Schema(name = "unlabeled-issue-event", description = "Unlabeled Issue Event")
@JsonTypeName("unlabeled-issue-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UnlabeledIssueEvent {

    private Long id;

    private String nodeId;

    private String url;

    private SimpleUser actor;

    private String event;

    private JsonNullable<String> commitId = JsonNullable.<String>undefined();

    private JsonNullable<String> commitUrl = JsonNullable.<String>undefined();

    private String createdAt;

    private JsonNullable<NullableIntegration> performedViaGithubApp = JsonNullable.<NullableIntegration>undefined();

    private LabeledIssueEventLabel label;

    public UnlabeledIssueEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UnlabeledIssueEvent(
            Long id,
            String nodeId,
            String url,
            SimpleUser actor,
            String event,
            String commitId,
            String commitUrl,
            String createdAt,
            NullableIntegration performedViaGithubApp,
            LabeledIssueEventLabel label) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.actor = actor;
        this.event = event;
        this.commitId = JsonNullable.of(commitId);
        this.commitUrl = JsonNullable.of(commitUrl);
        this.createdAt = createdAt;
        this.performedViaGithubApp = JsonNullable.of(performedViaGithubApp);
        this.label = label;
    }

    public UnlabeledIssueEvent id(Long id) {
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

    public UnlabeledIssueEvent nodeId(String nodeId) {
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

    public UnlabeledIssueEvent url(String url) {
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

    public UnlabeledIssueEvent actor(SimpleUser actor) {
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

    public UnlabeledIssueEvent event(String event) {
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

    public UnlabeledIssueEvent commitId(String commitId) {
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

    public UnlabeledIssueEvent commitUrl(String commitUrl) {
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

    public UnlabeledIssueEvent createdAt(String createdAt) {
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

    public UnlabeledIssueEvent performedViaGithubApp(NullableIntegration performedViaGithubApp) {
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

    public UnlabeledIssueEvent label(LabeledIssueEventLabel label) {
        this.label = label;
        return this;
    }

    /**
     * Get label
     * @return label
     */
    @NotNull
    @Valid
    @Schema(name = "label", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("label")
    public LabeledIssueEventLabel getLabel() {
        return label;
    }

    public void setLabel(LabeledIssueEventLabel label) {
        this.label = label;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UnlabeledIssueEvent unlabeledIssueEvent = (UnlabeledIssueEvent) o;
        return Objects.equals(this.id, unlabeledIssueEvent.id)
                && Objects.equals(this.nodeId, unlabeledIssueEvent.nodeId)
                && Objects.equals(this.url, unlabeledIssueEvent.url)
                && Objects.equals(this.actor, unlabeledIssueEvent.actor)
                && Objects.equals(this.event, unlabeledIssueEvent.event)
                && Objects.equals(this.commitId, unlabeledIssueEvent.commitId)
                && Objects.equals(this.commitUrl, unlabeledIssueEvent.commitUrl)
                && Objects.equals(this.createdAt, unlabeledIssueEvent.createdAt)
                && Objects.equals(this.performedViaGithubApp, unlabeledIssueEvent.performedViaGithubApp)
                && Objects.equals(this.label, unlabeledIssueEvent.label);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, nodeId, url, actor, event, commitId, commitUrl, createdAt, performedViaGithubApp, label);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UnlabeledIssueEvent {\n");
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
        sb.append("    label: ").append(toIndentedString(label)).append("\n");
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
