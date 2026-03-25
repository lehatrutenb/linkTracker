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
 * The status of a commit.
 */
@Schema(name = "status", description = "The status of a commit.")
@JsonTypeName("status")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Status {

    private String url;

    private String avatarUrl = null;

    private Long id;

    private String nodeId;

    private String state;

    private String description = null;

    private String targetUrl = null;

    private String context;

    private String createdAt;

    private String updatedAt;

    private NullableSimpleUser creator = null;

    public Status() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Status(
            String url,
            String avatarUrl,
            Long id,
            String nodeId,
            String state,
            String description,
            String targetUrl,
            String context,
            String createdAt,
            String updatedAt,
            NullableSimpleUser creator) {
        this.url = url;
        this.avatarUrl = avatarUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.state = state;
        this.description = description;
        this.targetUrl = targetUrl;
        this.context = context;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.creator = creator;
    }

    public Status url(String url) {
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

    public Status avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @NotNull
    @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Status id(Long id) {
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

    public Status nodeId(String nodeId) {
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

    public Status state(String state) {
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

    public Status description(String description) {
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

    public Status targetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
        return this;
    }

    /**
     * Get targetUrl
     * @return targetUrl
     */
    @NotNull
    @Schema(name = "target_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("target_url")
    public String getTargetUrl() {
        return targetUrl;
    }

    public void setTargetUrl(String targetUrl) {
        this.targetUrl = targetUrl;
    }

    public Status context(String context) {
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

    public Status createdAt(String createdAt) {
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

    public Status updatedAt(String updatedAt) {
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

    public Status creator(NullableSimpleUser creator) {
        this.creator = creator;
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
    public NullableSimpleUser getCreator() {
        return creator;
    }

    public void setCreator(NullableSimpleUser creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Status status = (Status) o;
        return Objects.equals(this.url, status.url)
                && Objects.equals(this.avatarUrl, status.avatarUrl)
                && Objects.equals(this.id, status.id)
                && Objects.equals(this.nodeId, status.nodeId)
                && Objects.equals(this.state, status.state)
                && Objects.equals(this.description, status.description)
                && Objects.equals(this.targetUrl, status.targetUrl)
                && Objects.equals(this.context, status.context)
                && Objects.equals(this.createdAt, status.createdAt)
                && Objects.equals(this.updatedAt, status.updatedAt)
                && Objects.equals(this.creator, status.creator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                url, avatarUrl, id, nodeId, state, description, targetUrl, context, createdAt, updatedAt, creator);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Status {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    targetUrl: ").append(toIndentedString(targetUrl)).append("\n");
        sb.append("    context: ").append(toIndentedString(context)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
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
