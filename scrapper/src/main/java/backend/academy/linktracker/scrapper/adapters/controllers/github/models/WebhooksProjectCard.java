package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhooksProjectCard
 */
@JsonTypeName("webhooks_project_card")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksProjectCard {

    private JsonNullable<Long> afterId = JsonNullable.<Long>undefined();

    private Boolean archived;

    private Long columnId;

    private URI columnUrl;

    private Optional<URI> contentUrl = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private JsonNullable<User> creator = JsonNullable.<User>undefined();

    private Long id;

    private String nodeId;

    private JsonNullable<String> note = JsonNullable.<String>undefined();

    private URI projectUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    public WebhooksProjectCard() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksProjectCard(
            Boolean archived,
            Long columnId,
            URI columnUrl,
            OffsetDateTime createdAt,
            User creator,
            Long id,
            String nodeId,
            String note,
            URI projectUrl,
            OffsetDateTime updatedAt,
            URI url) {
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

    public WebhooksProjectCard afterId(Long afterId) {
        this.afterId = JsonNullable.of(afterId);
        return this;
    }

    /**
     * Get afterId
     * @return afterId
     */
    @Schema(name = "after_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("after_id")
    public JsonNullable<Long> getAfterId() {
        return afterId;
    }

    public void setAfterId(JsonNullable<Long> afterId) {
        this.afterId = afterId;
    }

    public WebhooksProjectCard archived(Boolean archived) {
        this.archived = archived;
        return this;
    }

    /**
     * Whether or not the card is archived
     * @return archived
     */
    @NotNull
    @Schema(
            name = "archived",
            description = "Whether or not the card is archived",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public WebhooksProjectCard columnId(Long columnId) {
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

    public WebhooksProjectCard columnUrl(URI columnUrl) {
        this.columnUrl = columnUrl;
        return this;
    }

    /**
     * Get columnUrl
     * @return columnUrl
     */
    @NotNull
    @Valid
    @Schema(name = "column_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("column_url")
    public URI getColumnUrl() {
        return columnUrl;
    }

    public void setColumnUrl(URI columnUrl) {
        this.columnUrl = columnUrl;
    }

    public WebhooksProjectCard contentUrl(URI contentUrl) {
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

    public WebhooksProjectCard createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public WebhooksProjectCard creator(User creator) {
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
    public JsonNullable<User> getCreator() {
        return creator;
    }

    public void setCreator(JsonNullable<User> creator) {
        this.creator = creator;
    }

    public WebhooksProjectCard id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The project card's ID
     * @return id
     */
    @NotNull
    @Schema(name = "id", description = "The project card's ID", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhooksProjectCard nodeId(String nodeId) {
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

    public WebhooksProjectCard note(String note) {
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

    public WebhooksProjectCard projectUrl(URI projectUrl) {
        this.projectUrl = projectUrl;
        return this;
    }

    /**
     * Get projectUrl
     * @return projectUrl
     */
    @NotNull
    @Valid
    @Schema(name = "project_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("project_url")
    public URI getProjectUrl() {
        return projectUrl;
    }

    public void setProjectUrl(URI projectUrl) {
        this.projectUrl = projectUrl;
    }

    public WebhooksProjectCard updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhooksProjectCard url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
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
        WebhooksProjectCard webhooksProjectCard = (WebhooksProjectCard) o;
        return equalsNullable(this.afterId, webhooksProjectCard.afterId)
                && Objects.equals(this.archived, webhooksProjectCard.archived)
                && Objects.equals(this.columnId, webhooksProjectCard.columnId)
                && Objects.equals(this.columnUrl, webhooksProjectCard.columnUrl)
                && Objects.equals(this.contentUrl, webhooksProjectCard.contentUrl)
                && Objects.equals(this.createdAt, webhooksProjectCard.createdAt)
                && Objects.equals(this.creator, webhooksProjectCard.creator)
                && Objects.equals(this.id, webhooksProjectCard.id)
                && Objects.equals(this.nodeId, webhooksProjectCard.nodeId)
                && Objects.equals(this.note, webhooksProjectCard.note)
                && Objects.equals(this.projectUrl, webhooksProjectCard.projectUrl)
                && Objects.equals(this.updatedAt, webhooksProjectCard.updatedAt)
                && Objects.equals(this.url, webhooksProjectCard.url);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(afterId),
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

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksProjectCard {\n");
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
