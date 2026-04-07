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
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * WebhooksProjectColumn
 */
@JsonTypeName("webhooks_project_column")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksProjectColumn {

    private JsonNullable<Long> afterId = JsonNullable.<Long>undefined();

    private URI cardsUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private Long id;

    private String name;

    private String nodeId;

    private URI projectUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    public WebhooksProjectColumn() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksProjectColumn(
            URI cardsUrl,
            OffsetDateTime createdAt,
            Long id,
            String name,
            String nodeId,
            URI projectUrl,
            OffsetDateTime updatedAt,
            URI url) {
        this.cardsUrl = cardsUrl;
        this.createdAt = createdAt;
        this.id = id;
        this.name = name;
        this.nodeId = nodeId;
        this.projectUrl = projectUrl;
        this.updatedAt = updatedAt;
        this.url = url;
    }

    public WebhooksProjectColumn afterId(Long afterId) {
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

    public WebhooksProjectColumn cardsUrl(URI cardsUrl) {
        this.cardsUrl = cardsUrl;
        return this;
    }

    /**
     * Get cardsUrl
     * @return cardsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "cards_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cards_url")
    public URI getCardsUrl() {
        return cardsUrl;
    }

    public void setCardsUrl(URI cardsUrl) {
        this.cardsUrl = cardsUrl;
    }

    public WebhooksProjectColumn createdAt(OffsetDateTime createdAt) {
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

    public WebhooksProjectColumn id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * The unique identifier of the project column
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "The unique identifier of the project column",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhooksProjectColumn name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the project column
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "Name of the project column", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhooksProjectColumn nodeId(String nodeId) {
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

    public WebhooksProjectColumn projectUrl(URI projectUrl) {
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

    public WebhooksProjectColumn updatedAt(OffsetDateTime updatedAt) {
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

    public WebhooksProjectColumn url(URI url) {
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
        WebhooksProjectColumn webhooksProjectColumn = (WebhooksProjectColumn) o;
        return equalsNullable(this.afterId, webhooksProjectColumn.afterId)
                && Objects.equals(this.cardsUrl, webhooksProjectColumn.cardsUrl)
                && Objects.equals(this.createdAt, webhooksProjectColumn.createdAt)
                && Objects.equals(this.id, webhooksProjectColumn.id)
                && Objects.equals(this.name, webhooksProjectColumn.name)
                && Objects.equals(this.nodeId, webhooksProjectColumn.nodeId)
                && Objects.equals(this.projectUrl, webhooksProjectColumn.projectUrl)
                && Objects.equals(this.updatedAt, webhooksProjectColumn.updatedAt)
                && Objects.equals(this.url, webhooksProjectColumn.url);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(afterId), cardsUrl, createdAt, id, name, nodeId, projectUrl, updatedAt, url);
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
        sb.append("class WebhooksProjectColumn {\n");
        sb.append("    afterId: ").append(toIndentedString(afterId)).append("\n");
        sb.append("    cardsUrl: ").append(toIndentedString(cardsUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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
