package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * DiscussionCategory
 */
@JsonTypeName("discussion_category")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DiscussionCategory {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private String description;

    private String emoji;

    private Long id;

    private Boolean isAnswerable;

    private String name;

    private String nodeId;

    private Long repositoryId;

    private String slug;

    private String updatedAt;

    public DiscussionCategory() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DiscussionCategory(
            OffsetDateTime createdAt,
            String description,
            String emoji,
            Long id,
            Boolean isAnswerable,
            String name,
            Long repositoryId,
            String slug,
            String updatedAt) {
        this.createdAt = createdAt;
        this.description = description;
        this.emoji = emoji;
        this.id = id;
        this.isAnswerable = isAnswerable;
        this.name = name;
        this.repositoryId = repositoryId;
        this.slug = slug;
        this.updatedAt = updatedAt;
    }

    public DiscussionCategory createdAt(OffsetDateTime createdAt) {
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

    public DiscussionCategory description(String description) {
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

    public DiscussionCategory emoji(String emoji) {
        this.emoji = emoji;
        return this;
    }

    /**
     * Get emoji
     * @return emoji
     */
    @NotNull
    @Schema(name = "emoji", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("emoji")
    public String getEmoji() {
        return emoji;
    }

    public void setEmoji(String emoji) {
        this.emoji = emoji;
    }

    public DiscussionCategory id(Long id) {
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

    public DiscussionCategory isAnswerable(Boolean isAnswerable) {
        this.isAnswerable = isAnswerable;
        return this;
    }

    /**
     * Get isAnswerable
     * @return isAnswerable
     */
    @NotNull
    @Schema(name = "is_answerable", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("is_answerable")
    public Boolean getIsAnswerable() {
        return isAnswerable;
    }

    public void setIsAnswerable(Boolean isAnswerable) {
        this.isAnswerable = isAnswerable;
    }

    public DiscussionCategory name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiscussionCategory nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public DiscussionCategory repositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
        return this;
    }

    /**
     * Get repositoryId
     * @return repositoryId
     */
    @NotNull
    @Schema(name = "repository_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_id")
    public Long getRepositoryId() {
        return repositoryId;
    }

    public void setRepositoryId(Long repositoryId) {
        this.repositoryId = repositoryId;
    }

    public DiscussionCategory slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @NotNull
    @Schema(name = "slug", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public DiscussionCategory updatedAt(String updatedAt) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DiscussionCategory discussionCategory = (DiscussionCategory) o;
        return Objects.equals(this.createdAt, discussionCategory.createdAt)
                && Objects.equals(this.description, discussionCategory.description)
                && Objects.equals(this.emoji, discussionCategory.emoji)
                && Objects.equals(this.id, discussionCategory.id)
                && Objects.equals(this.isAnswerable, discussionCategory.isAnswerable)
                && Objects.equals(this.name, discussionCategory.name)
                && Objects.equals(this.nodeId, discussionCategory.nodeId)
                && Objects.equals(this.repositoryId, discussionCategory.repositoryId)
                && Objects.equals(this.slug, discussionCategory.slug)
                && Objects.equals(this.updatedAt, discussionCategory.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                createdAt, description, emoji, id, isAnswerable, name, nodeId, repositoryId, slug, updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DiscussionCategory {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    emoji: ").append(toIndentedString(emoji)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isAnswerable: ").append(toIndentedString(isAnswerable)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    repositoryId: ").append(toIndentedString(repositoryId)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
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
