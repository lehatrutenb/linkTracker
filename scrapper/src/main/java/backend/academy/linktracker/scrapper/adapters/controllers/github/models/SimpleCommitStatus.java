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
 * SimpleCommitStatus
 */
@JsonTypeName("simple-commit-status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimpleCommitStatus {

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private Long id;

    private String nodeId;

    private String state;

    private String context;

    private JsonNullable<URI> targetUrl = JsonNullable.<URI>undefined();

    private JsonNullable<Boolean> required = JsonNullable.<Boolean>undefined();

    private JsonNullable<URI> avatarUrl = JsonNullable.<URI>undefined();

    private URI url;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public SimpleCommitStatus() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SimpleCommitStatus(
            String description,
            Long id,
            String nodeId,
            String state,
            String context,
            URI targetUrl,
            URI avatarUrl,
            URI url,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.description = JsonNullable.of(description);
        this.id = id;
        this.nodeId = nodeId;
        this.state = state;
        this.context = context;
        this.targetUrl = JsonNullable.of(targetUrl);
        this.avatarUrl = JsonNullable.of(avatarUrl);
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public SimpleCommitStatus description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public SimpleCommitStatus id(Long id) {
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

    public SimpleCommitStatus nodeId(String nodeId) {
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

    public SimpleCommitStatus state(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public SimpleCommitStatus context(String context) {
        this.context = context;
        return this;
    }

    /**
     * Get context
     * @return context
     */
    @NotNull
    @Schema(name = "context", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("context")
    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public SimpleCommitStatus targetUrl(URI targetUrl) {
        this.targetUrl = JsonNullable.of(targetUrl);
        return this;
    }

    /**
     * Get targetUrl
     * @return targetUrl
     */
    @NotNull
    @Valid
    @Schema(name = "target_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_url")
    public JsonNullable<URI> getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(JsonNullable<URI> targetUrl) {
        this.targetUrl = targetUrl;
    }

    public SimpleCommitStatus required(Boolean required) {
        this.required = JsonNullable.of(required);
        return this;
    }

    /**
     * Get required
     * @return required
     */
    @Schema(name = "required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required")
    public JsonNullable<Boolean> getRequired() {
        return required;
    }

    public void setRequired(JsonNullable<Boolean> required) {
        this.required = required;
    }

    public SimpleCommitStatus avatarUrl(URI avatarUrl) {
        this.avatarUrl = JsonNullable.of(avatarUrl);
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @NotNull
    @Valid
    @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("avatar_url")
    public JsonNullable<URI> getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(JsonNullable<URI> avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public SimpleCommitStatus url(URI url) {
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

    public SimpleCommitStatus createdAt(OffsetDateTime createdAt) {
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

    public SimpleCommitStatus updatedAt(OffsetDateTime updatedAt) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SimpleCommitStatus simpleCommitStatus = (SimpleCommitStatus) o;
        return Objects.equals(this.description, simpleCommitStatus.description)
                && Objects.equals(this.id, simpleCommitStatus.id)
                && Objects.equals(this.nodeId, simpleCommitStatus.nodeId)
                && Objects.equals(this.state, simpleCommitStatus.state)
                && Objects.equals(this.context, simpleCommitStatus.context)
                && Objects.equals(this.targetUrl, simpleCommitStatus.targetUrl)
                && equalsNullable(this.required, simpleCommitStatus.required)
                && Objects.equals(this.avatarUrl, simpleCommitStatus.avatarUrl)
                && Objects.equals(this.url, simpleCommitStatus.url)
                && Objects.equals(this.createdAt, simpleCommitStatus.createdAt)
                && Objects.equals(this.updatedAt, simpleCommitStatus.updatedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description,
                id,
                nodeId,
                state,
                context,
                targetUrl,
                hashCodeNullable(required),
                avatarUrl,
                url,
                createdAt,
                updatedAt);
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
        sb.append("class SimpleCommitStatus {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
