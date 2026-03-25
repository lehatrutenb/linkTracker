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
 * Converted Note to Issue Issue Event
 */
@Schema(name = "converted-note-to-issue-issue-event", description = "Converted Note to Issue Issue Event")
@JsonTypeName("converted-note-to-issue-issue-event")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ConvertedNoteToIssueIssueEvent {

    private Long id;

    private String nodeId;

    private String url;

    private SimpleUser actor;

    private String event;

    private String commitId = null;

    private String commitUrl = null;

    private String createdAt;

    private Integration performedViaGithubApp = null;

    private AddedToProjectIssueEventProjectCard projectCard;

    public ConvertedNoteToIssueIssueEvent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ConvertedNoteToIssueIssueEvent(
            Long id,
            String nodeId,
            String url,
            SimpleUser actor,
            String event,
            String commitId,
            String commitUrl,
            String createdAt,
            Integration performedViaGithubApp) {
        this.id = id;
        this.nodeId = nodeId;
        this.url = url;
        this.actor = actor;
        this.event = event;
        this.commitId = commitId;
        this.commitUrl = commitUrl;
        this.createdAt = createdAt;
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public ConvertedNoteToIssueIssueEvent id(Long id) {
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

    public ConvertedNoteToIssueIssueEvent nodeId(String nodeId) {
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

    public ConvertedNoteToIssueIssueEvent url(String url) {
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

    public ConvertedNoteToIssueIssueEvent actor(SimpleUser actor) {
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

    public ConvertedNoteToIssueIssueEvent event(String event) {
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

    public ConvertedNoteToIssueIssueEvent commitId(String commitId) {
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

    public ConvertedNoteToIssueIssueEvent commitUrl(String commitUrl) {
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

    public ConvertedNoteToIssueIssueEvent createdAt(String createdAt) {
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

    public ConvertedNoteToIssueIssueEvent performedViaGithubApp(Integration performedViaGithubApp) {
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
    public Integration getPerformedViaGithubApp() {
        return performedViaGithubApp;
    }

    public void setPerformedViaGithubApp(Integration performedViaGithubApp) {
        this.performedViaGithubApp = performedViaGithubApp;
    }

    public ConvertedNoteToIssueIssueEvent projectCard(AddedToProjectIssueEventProjectCard projectCard) {
        this.projectCard = projectCard;
        return this;
    }

    /**
     * Get projectCard
     * @return projectCard
     */
    @Valid
    @Schema(name = "project_card", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("project_card")
    public AddedToProjectIssueEventProjectCard getProjectCard() {
        return projectCard;
    }

    public void setProjectCard(AddedToProjectIssueEventProjectCard projectCard) {
        this.projectCard = projectCard;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConvertedNoteToIssueIssueEvent convertedNoteToIssueIssueEvent = (ConvertedNoteToIssueIssueEvent) o;
        return Objects.equals(this.id, convertedNoteToIssueIssueEvent.id)
                && Objects.equals(this.nodeId, convertedNoteToIssueIssueEvent.nodeId)
                && Objects.equals(this.url, convertedNoteToIssueIssueEvent.url)
                && Objects.equals(this.actor, convertedNoteToIssueIssueEvent.actor)
                && Objects.equals(this.event, convertedNoteToIssueIssueEvent.event)
                && Objects.equals(this.commitId, convertedNoteToIssueIssueEvent.commitId)
                && Objects.equals(this.commitUrl, convertedNoteToIssueIssueEvent.commitUrl)
                && Objects.equals(this.createdAt, convertedNoteToIssueIssueEvent.createdAt)
                && Objects.equals(this.performedViaGithubApp, convertedNoteToIssueIssueEvent.performedViaGithubApp)
                && Objects.equals(this.projectCard, convertedNoteToIssueIssueEvent.projectCard);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, nodeId, url, actor, event, commitId, commitUrl, createdAt, performedViaGithubApp, projectCard);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConvertedNoteToIssueIssueEvent {\n");
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
        sb.append("    projectCard: ").append(toIndentedString(projectCard)).append("\n");
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
