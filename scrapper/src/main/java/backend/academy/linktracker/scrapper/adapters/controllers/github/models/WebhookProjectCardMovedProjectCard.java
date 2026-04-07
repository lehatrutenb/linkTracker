package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.net.URI;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookProjectCardMovedProjectCard
 */
@JsonTypeName("webhook_project_card_moved_project_card")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookProjectCardMovedProjectCard {

    private JsonNullable<BigDecimal> afterId = JsonNullable.<BigDecimal>undefined();

    private Boolean archived;

    private Long columnId;

    private String columnUrl;

    private Optional<URI> contentUrl = Optional.empty();

    private String createdAt;

    private JsonNullable<WebhookProjectCardMovedProjectCardAllOfCreator> creator =
            JsonNullable.<WebhookProjectCardMovedProjectCardAllOfCreator>undefined();

    private Long id;

    private String nodeId;

    private JsonNullable<String> note = JsonNullable.<String>undefined();

    private String projectUrl;

    private String updatedAt;

    private String url;

    public WebhookProjectCardMovedProjectCard() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookProjectCardMovedProjectCard(
            BigDecimal afterId,
            Boolean archived,
            Long columnId,
            String columnUrl,
            String createdAt,
            WebhookProjectCardMovedProjectCardAllOfCreator creator,
            Long id,
            String nodeId,
            String note,
            String projectUrl,
            String updatedAt,
            String url) {
        this.afterId = JsonNullable.of(afterId);
        this.archived = archived;
        this.columnId = columnId;
        this.columnUrl = columnUrl;
        this.createdAt = createdAt;
        this.creator = JsonNullable.of(creator);
        this.id = id;
        this.nodeId = nodeId;
        this.note = JsonNullable.of(note);
        this.projectUrl = projectUrl;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public WebhookProjectCardMovedProjectCard afterId(BigDecimal afterId) {
        this.afterId = JsonNullable.of(afterId);
        return this;
    }

    /**
     * Get afterId
     * @return afterId
     */
    @NotNull
    @Valid
    @Schema(name = "after_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("after_id")
    public JsonNullable<BigDecimal> getAfterId() {
        return afterId;
    }

    public void setAfterId(JsonNullable<BigDecimal> afterId) {
        this.afterId = afterId;
    }

    public WebhookProjectCardMovedProjectCard archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Get archived
     * @return archived
     */
    @NotNull
    @Schema(name = "archived", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public WebhookProjectCardMovedProjectCard columnId(Long columnId) {
        this.columnId = columnId;
        return this;
    }

    /**
     * Get columnId
     * @return columnId
     */
    @NotNull
    @Schema(name = "column_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("column_id")
    public Long getColumnId() {
        return columnId;
    }

    public void setColumnId(Long columnId) {
        this.columnId = columnId;
    }

    public WebhookProjectCardMovedProjectCard columnUrl(String columnUrl) {
        this.columnUrl = columnUrl;
        return this;
    }

    /**
     * Get columnUrl
     * @return columnUrl
     */
    @NotNull
    @Schema(name = "column_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("column_url")
    public String getColumnUrl() {
        return columnUrl;
    }

    public void setColumnUrl(String columnUrl) {
        this.columnUrl = columnUrl;
    }

    public WebhookProjectCardMovedProjectCard contentUrl(URI contentUrl) {
        this.contentUrl = Optional.ofNullable(contentUrl);
        return this;
    }

    /**
     * Get contentUrl
     * @return contentUrl
     */
    @Valid
    @Schema(name = "content_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("content_url")
    public Optional<URI> getContentUrl() {
        return contentUrl;
    }

    public void setContentUrl(Optional<URI> contentUrl) {
        this.contentUrl = contentUrl;
    }

    public WebhookProjectCardMovedProjectCard createdAt(String createdAt) {
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

    public WebhookProjectCardMovedProjectCard creator(WebhookProjectCardMovedProjectCardAllOfCreator creator) {
        this.creator = JsonNullable.of(creator);
        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    @NotNull
    @Valid
    @Schema(name = "creator", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creator")
    public JsonNullable<WebhookProjectCardMovedProjectCardAllOfCreator> getCreator() {
        return creator;
    }

    public void setCreator(JsonNullable<WebhookProjectCardMovedProjectCardAllOfCreator> creator) {
        this.creator = creator;
    }

    public WebhookProjectCardMovedProjectCard id(Long id) {
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

    public WebhookProjectCardMovedProjectCard nodeId(String nodeId) {
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

    public WebhookProjectCardMovedProjectCard note(String note) {
        this.note = JsonNullable.of(note);
        return this;
    }

    /**
     * Get note
     * @return note
     */
    @NotNull
    @Schema(name = "note", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("note")
    public JsonNullable<String> getNote() {
        return note;
    }

    public void setNote(JsonNullable<String> note) {
        this.note = note;
    }

    public WebhookProjectCardMovedProjectCard projectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
        return this;
    }

    /**
     * Get projectUrl
     * @return projectUrl
     */
    @NotNull
    @Schema(name = "project_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("project_url")
    public String getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(String projectUrl) {
        this.projectUrl = projectUrl;
    }

    public WebhookProjectCardMovedProjectCard updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhookProjectCardMovedProjectCard url(String url) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookProjectCardMovedProjectCard webhookProjectCardMovedProjectCard = (WebhookProjectCardMovedProjectCard) o;
        return Objects.equals(this.afterId, webhookProjectCardMovedProjectCard.afterId)
                && Objects.equals(this.archived, webhookProjectCardMovedProjectCard.archived)
                && Objects.equals(this.columnId, webhookProjectCardMovedProjectCard.columnId)
                && Objects.equals(this.columnUrl, webhookProjectCardMovedProjectCard.columnUrl)
                && Objects.equals(this.contentUrl, webhookProjectCardMovedProjectCard.contentUrl)
                && Objects.equals(this.createdAt, webhookProjectCardMovedProjectCard.createdAt)
                && Objects.equals(this.creator, webhookProjectCardMovedProjectCard.creator)
                && Objects.equals(this.id, webhookProjectCardMovedProjectCard.id)
                && Objects.equals(this.nodeId, webhookProjectCardMovedProjectCard.nodeId)
                && Objects.equals(this.note, webhookProjectCardMovedProjectCard.note)
                && Objects.equals(this.projectUrl, webhookProjectCardMovedProjectCard.projectUrl)
                && Objects.equals(this.updatedAt, webhookProjectCardMovedProjectCard.updatedAt)
                && Objects.equals(this.url, webhookProjectCardMovedProjectCard.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                afterId,
                archived,
                columnId,
                columnUrl,
                contentUrl,
                createdAt,
                creator,
                id,
                nodeId,
                note,
                projectUrl,
                updatedAt,
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookProjectCardMovedProjectCard {\n");
        sb.append("    afterId: ").append(toIndentedString(afterId)).append("\n");
        sb.append("    archived: ").append(toIndentedString(archived)).append("\n");
        sb.append("    columnId: ").append(toIndentedString(columnId)).append("\n");
        sb.append("    columnUrl: ").append(toIndentedString(columnUrl)).append("\n");
        sb.append("    contentUrl: ").append(toIndentedString(contentUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    note: ").append(toIndentedString(note)).append("\n");
        sb.append("    projectUrl: ").append(toIndentedString(projectUrl)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
