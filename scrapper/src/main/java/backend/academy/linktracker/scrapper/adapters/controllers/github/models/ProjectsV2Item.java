package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * An item belonging to a project
 */
@Schema(name = "projects-v2-item", description = "An item belonging to a project")
@JsonTypeName("projects-v2-item")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2Item {

    private BigDecimal id;

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> projectNodeId = Optional.empty();

    private String contentNodeId;

    private ProjectsV2ItemContentType contentType;

    private Optional<SimpleUser> creator = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> archivedAt = JsonNullable.<OffsetDateTime>undefined();

    public ProjectsV2Item() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2Item(
            BigDecimal id,
            String contentNodeId,
            ProjectsV2ItemContentType contentType,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime archivedAt) {
        this.id = id;
        this.contentNodeId = contentNodeId;
        this.contentType = contentType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archivedAt = JsonNullable.of(archivedAt);
    }

    public ProjectsV2Item id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the project item.
     * @return id
     */
    @NotNull
    @Valid
    @Schema(
            name = "id",
            description = "The unique identifier of the project item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public ProjectsV2Item nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * The node ID of the project item.
     * @return nodeId
     */
    @Schema(
            name = "node_id",
            description = "The node ID of the project item.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public ProjectsV2Item projectNodeId(String projectNodeId) {
        this.projectNodeId = Optional.ofNullable(projectNodeId);
        return this;
    }

    /**
     * The node ID of the project that contains this item.
     * @return projectNodeId
     */
    @Schema(
            name = "project_node_id",
            description = "The node ID of the project that contains this item.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("project_node_id")
    public Optional<String> getProjectNodeId() {
        return projectNodeId;
    }

    public void setProjectNodeId(Optional<String> projectNodeId) {
        this.projectNodeId = projectNodeId;
    }

    public ProjectsV2Item contentNodeId(String contentNodeId) {
        this.contentNodeId = contentNodeId;
        return this;
    }

    /**
     * The node ID of the content represented by this item.
     * @return contentNodeId
     */
    @NotNull
    @Schema(
            name = "content_node_id",
            description = "The node ID of the content represented by this item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content_node_id")
    public String getContentNodeId() {
        return contentNodeId;
    }

    public void setContentNodeId(String contentNodeId) {
        this.contentNodeId = contentNodeId;
    }

    public ProjectsV2Item contentType(ProjectsV2ItemContentType contentType) {
        this.contentType = contentType;
        return this;
    }

    /**
     * Get contentType
     * @return contentType
     */
    @NotNull
    @Valid
    @Schema(name = "content_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("content_type")
    public ProjectsV2ItemContentType getContentType() {
        return contentType;
    }

    public void setContentType(ProjectsV2ItemContentType contentType) {
        this.contentType = contentType;
    }

    public ProjectsV2Item creator(SimpleUser creator) {
        this.creator = Optional.ofNullable(creator);
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    @Valid
    @Schema(name = "creator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("creator")
    public Optional<SimpleUser> getCreator() {
        return creator;
    }

    public void setCreator(Optional<SimpleUser> creator) {
        this.creator = creator;
    }

    public ProjectsV2Item createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time when the item was created.
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the item was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ProjectsV2Item updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time when the item was last updated.
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "updated_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the item was last updated.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProjectsV2Item archivedAt(OffsetDateTime archivedAt) {
        this.archivedAt = JsonNullable.of(archivedAt);
        return this;
    }

    /**
     * The time when the item was archived.
     * @return archivedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "archived_at",
            example = "2022-04-28T12:00Z",
            description = "The time when the item was archived.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archived_at")
    public JsonNullable<OffsetDateTime> getArchivedAt() {
        return archivedAt;
    }

    public void setArchivedAt(JsonNullable<OffsetDateTime> archivedAt) {
        this.archivedAt = archivedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2Item projectsV2Item = (ProjectsV2Item) o;
        return Objects.equals(this.id, projectsV2Item.id)
                && Objects.equals(this.nodeId, projectsV2Item.nodeId)
                && Objects.equals(this.projectNodeId, projectsV2Item.projectNodeId)
                && Objects.equals(this.contentNodeId, projectsV2Item.contentNodeId)
                && Objects.equals(this.contentType, projectsV2Item.contentType)
                && Objects.equals(this.creator, projectsV2Item.creator)
                && Objects.equals(this.createdAt, projectsV2Item.createdAt)
                && Objects.equals(this.updatedAt, projectsV2Item.updatedAt)
                && Objects.equals(this.archivedAt, projectsV2Item.archivedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, nodeId, projectNodeId, contentNodeId, contentType, creator, createdAt, updatedAt, archivedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2Item {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    projectNodeId: ").append(toIndentedString(projectNodeId)).append("\n");
        sb.append("    contentNodeId: ").append(toIndentedString(contentNodeId)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
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
