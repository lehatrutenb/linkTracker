package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * An item belonging to a project
 */
@Schema(name = "projects-v2-item-with-content", description = "An item belonging to a project")
@JsonTypeName("projects-v2-item-with-content")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ProjectsV2ItemWithContent {

    private BigDecimal id;

    private Optional<String> nodeId = Optional.empty();

    private Optional<URI> projectUrl = Optional.empty();

    private ProjectsV2ItemContentType contentType;

    @Valid
    private JsonNullable<Map<String, Object>> content = JsonNullable.<Map<String, Object>>undefined();

    private Optional<SimpleUser> creator = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> archivedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<URI> itemUrl = JsonNullable.<URI>undefined();

    @Valid
    private List<Map<String, Object>> fields = new ArrayList<>();

    public ProjectsV2ItemWithContent() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ProjectsV2ItemWithContent(
            BigDecimal id,
            ProjectsV2ItemContentType contentType,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime archivedAt) {
        this.id = id;
        this.contentType = contentType;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archivedAt = JsonNullable.of(archivedAt);
    }

    public ProjectsV2ItemWithContent id(BigDecimal id) {
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

    public ProjectsV2ItemWithContent nodeId(String nodeId) {
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

    public ProjectsV2ItemWithContent projectUrl(URI projectUrl) {
        this.projectUrl = Optional.ofNullable(projectUrl);
        return this;
    }

    /**
     * The API URL of the project that contains this item.
     * @return projectUrl
     */
    @Valid
    @Schema(
            name = "project_url",
            example = "https://api.github.com/users/monalisa/2/projectsV2/3",
            description = "The API URL of the project that contains this item.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("project_url")
    public Optional<URI> getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(Optional<URI> projectUrl) {
        this.projectUrl = projectUrl;
    }

    public ProjectsV2ItemWithContent contentType(ProjectsV2ItemContentType contentType) {
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

    public ProjectsV2ItemWithContent content(Map<String, Object> content) {
        this.content = JsonNullable.of(content);
        return this;
    }

    public ProjectsV2ItemWithContent putContentItem(String key, Object contentItem) {
        if (this.content == null || !this.content.isPresent()) {
            this.content = JsonNullable.of(new HashMap<>());
        }
        this.content.get().put(key, contentItem);
        return this;
    }

    /**
     * The content of the item, which varies by content type.
     * @return content
     */
    @Schema(
            name = "content",
            description = "The content of the item, which varies by content type.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content")
    public JsonNullable<Map<String, Object>> getContent() {
        return content;
    }

    public void setContent(JsonNullable<Map<String, Object>> content) {
        this.content = content;
    }

    public ProjectsV2ItemWithContent creator(SimpleUser creator) {
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

    public ProjectsV2ItemWithContent createdAt(OffsetDateTime createdAt) {
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

    public ProjectsV2ItemWithContent updatedAt(OffsetDateTime updatedAt) {
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

    public ProjectsV2ItemWithContent archivedAt(OffsetDateTime archivedAt) {
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

    public ProjectsV2ItemWithContent itemUrl(URI itemUrl) {
        this.itemUrl = JsonNullable.of(itemUrl);
        return this;
    }

    /**
     * The API URL of this item.
     * @return itemUrl
     */
    @Valid
    @Schema(
            name = "item_url",
            example = "https://api.github.com/users/monalisa/2/projectsV2/items/3",
            description = "The API URL of this item.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("item_url")
    public JsonNullable<URI> getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(JsonNullable<URI> itemUrl) {
        this.itemUrl = itemUrl;
    }

    public ProjectsV2ItemWithContent fields(List<Map<String, Object>> fields) {
        this.fields = fields;
        return this;
    }

    public ProjectsV2ItemWithContent addFieldsItem(Map<String, Object> fieldsItem) {
        if (this.fields == null) {
            this.fields = new ArrayList<>();
        }
        this.fields.add(fieldsItem);
        return this;
    }

    /**
     * The fields and values associated with this item.
     * @return fields
     */
    @Valid
    @Schema(
            name = "fields",
            description = "The fields and values associated with this item.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fields")
    public List<Map<String, Object>> getFields() {
        return fields;
    }

    public void setFields(List<Map<String, Object>> fields) {
        this.fields = fields;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ProjectsV2ItemWithContent projectsV2ItemWithContent = (ProjectsV2ItemWithContent) o;
        return Objects.equals(this.id, projectsV2ItemWithContent.id)
                && Objects.equals(this.nodeId, projectsV2ItemWithContent.nodeId)
                && Objects.equals(this.projectUrl, projectsV2ItemWithContent.projectUrl)
                && Objects.equals(this.contentType, projectsV2ItemWithContent.contentType)
                && equalsNullable(this.content, projectsV2ItemWithContent.content)
                && Objects.equals(this.creator, projectsV2ItemWithContent.creator)
                && Objects.equals(this.createdAt, projectsV2ItemWithContent.createdAt)
                && Objects.equals(this.updatedAt, projectsV2ItemWithContent.updatedAt)
                && Objects.equals(this.archivedAt, projectsV2ItemWithContent.archivedAt)
                && equalsNullable(this.itemUrl, projectsV2ItemWithContent.itemUrl)
                && Objects.equals(this.fields, projectsV2ItemWithContent.fields);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                nodeId,
                projectUrl,
                contentType,
                hashCodeNullable(content),
                creator,
                createdAt,
                updatedAt,
                archivedAt,
                hashCodeNullable(itemUrl),
                fields);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectsV2ItemWithContent {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    projectUrl: ").append(toIndentedString(projectUrl)).append("\n");
        sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
        sb.append("    itemUrl: ").append(toIndentedString(itemUrl)).append("\n");
        sb.append("    fields: ").append(toIndentedString(fields)).append("\n");
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
