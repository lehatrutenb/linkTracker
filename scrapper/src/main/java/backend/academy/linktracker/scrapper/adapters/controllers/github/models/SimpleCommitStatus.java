package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * SimpleCommitStatus
 */
@JsonTypeName("simple-commit-status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimpleCommitStatus {

    private String description = null;

    private Long id;

    private String nodeId;

    private String state;

    private String context;

    private URI targetUrl = null;

    private Boolean required = null;

    private URI avatarUrl = null;

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
        this.description = description;
        this.id = id;
        this.nodeId = nodeId;
        this.state = state;
        this.context = context;
        this.targetUrl = targetUrl;
        this.avatarUrl = avatarUrl;
        this.url = url;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public SimpleCommitStatus description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
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
        this.targetUrl = targetUrl;
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
    public URI getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(URI targetUrl) {
        this.targetUrl = targetUrl;
    }

    public SimpleCommitStatus required(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * Get required
     * @return required
     */
    @Schema(name = "required", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("required")
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public SimpleCommitStatus avatarUrl(URI avatarUrl) {
        this.avatarUrl = avatarUrl;
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
    public URI getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(URI avatarUrl) {
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
                && Objects.equals(this.required, simpleCommitStatus.required)
                && Objects.equals(this.avatarUrl, simpleCommitStatus.avatarUrl)
                && Objects.equals(this.url, simpleCommitStatus.url)
                && Objects.equals(this.createdAt, simpleCommitStatus.createdAt)
                && Objects.equals(this.updatedAt, simpleCommitStatus.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                description, id, nodeId, state, context, targetUrl, required, avatarUrl, url, createdAt, updatedAt);
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
