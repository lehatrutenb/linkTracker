package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * An item belonging to a project
 */
@Schema(name = "projects-v2-item-simple", description = "An item belonging to a project")
@JsonTypeName("projects-v2-item-simple")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2ItemSimple {

    private BigDecimal id;

    private String nodeId;

    private ProjectsV2ItemSimpleContent content;

    private ProjectsV2ItemContentType contentType;

    private SimpleUser creator;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime archivedAt = null;

    private URI projectUrl;

    private URI itemUrl;

    public ProjectsV2ItemSimple() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2ItemSimple(
            BigDecimal id,
            ProjectsV2ItemContentType contentType,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime archivedAt) {
        this.id = id;
        this.contentType = contentType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archivedAt = archivedAt;
    }

    public ProjectsV2ItemSimple id(BigDecimal id) {
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

    public ProjectsV2ItemSimple nodeId(String nodeId) {
        this.nodeId = nodeId;
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
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public ProjectsV2ItemSimple content(ProjectsV2ItemSimpleContent content) {
        this.content = content;
        return this;
    }

    /**
     * Get content
     * @return content
     */
    @Valid
    @Schema(name = "content", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content")
    public ProjectsV2ItemSimpleContent getContent() {
        return content;
    }

    public void setContent(ProjectsV2ItemSimpleContent content) {
        this.content = content;
    }

    public ProjectsV2ItemSimple contentType(ProjectsV2ItemContentType contentType) {
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

    public ProjectsV2ItemSimple creator(SimpleUser creator) {
        this.creator = creator;
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    @Valid
    @Schema(name = "creator", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("creator")
    public SimpleUser getCreator() {
        return creator;
    }

    public void setCreator(SimpleUser creator) {
        this.creator = creator;
    }

    public ProjectsV2ItemSimple createdAt(OffsetDateTime createdAt) {
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

    public ProjectsV2ItemSimple updatedAt(OffsetDateTime updatedAt) {
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

    public ProjectsV2ItemSimple archivedAt(OffsetDateTime archivedAt) {
        this.archivedAt = archivedAt;
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
    public OffsetDateTime getArchivedAt() {
        return archivedAt;
    }

    public void setArchivedAt(OffsetDateTime archivedAt) {
        this.archivedAt = archivedAt;
    }

    public ProjectsV2ItemSimple projectUrl(URI projectUrl) {
        this.projectUrl = projectUrl;
        return this;
    }

    /**
     * The URL of the project this item belongs to.
     * @return projectUrl
     */
    @Valid
    @Schema(
            name = "project_url",
            description = "The URL of the project this item belongs to.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("project_url")
    public URI getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(URI projectUrl) {
        this.projectUrl = projectUrl;
    }

    public ProjectsV2ItemSimple itemUrl(URI itemUrl) {
        this.itemUrl = itemUrl;
        return this;
    }

    /**
     * The URL of the item in the project.
     * @return itemUrl
     */
    @Valid
    @Schema(
            name = "item_url",
            description = "The URL of the item in the project.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("item_url")
    public URI getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(URI itemUrl) {
        this.itemUrl = itemUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2ItemSimple projectsV2ItemSimple = (ProjectsV2ItemSimple) o;
        return Objects.equals(this.id, projectsV2ItemSimple.id)
                && Objects.equals(this.nodeId, projectsV2ItemSimple.nodeId)
                && Objects.equals(this.content, projectsV2ItemSimple.content)
                && Objects.equals(this.contentType, projectsV2ItemSimple.contentType)
                && Objects.equals(this.creator, projectsV2ItemSimple.creator)
                && Objects.equals(this.createdAt, projectsV2ItemSimple.createdAt)
                && Objects.equals(this.updatedAt, projectsV2ItemSimple.updatedAt)
                && Objects.equals(this.archivedAt, projectsV2ItemSimple.archivedAt)
                && Objects.equals(this.projectUrl, projectsV2ItemSimple.projectUrl)
                && Objects.equals(this.itemUrl, projectsV2ItemSimple.itemUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id, nodeId, content, contentType, creator, createdAt, updatedAt, archivedAt, projectUrl, itemUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2ItemSimple {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
        sb.append("    projectUrl: ").append(toIndentedString(projectUrl)).append("\n");
        sb.append("    itemUrl: ").append(toIndentedString(itemUrl)).append("\n");
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
