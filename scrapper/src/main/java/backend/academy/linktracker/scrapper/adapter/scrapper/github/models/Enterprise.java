package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * An enterprise on GitHub.
 */
@Schema(name = "Enterprise", description = "An enterprise on GitHub.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Enterprise implements GitHubAppOwner {

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private URI htmlUrl;

    private JsonNullable<URI> websiteUrl = JsonNullable.<URI>undefined();

    private Long id;

    private String nodeId;

    private String name;

    private String slug;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    private URI avatarUrl;

    public Enterprise() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Enterprise(
            URI htmlUrl,
            Long id,
            String nodeId,
            String name,
            String slug,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            URI avatarUrl) {
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.nodeId = nodeId;
        this.name = name;
        this.slug = slug;
        this.createdAt = JsonNullable.of(createdAt);
        this.updatedAt = JsonNullable.of(updatedAt);
        this.avatarUrl = avatarUrl;
    }

    public Enterprise description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * A short description of the enterprise.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A short description of the enterprise.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public Enterprise htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public Enterprise websiteUrl(URI websiteUrl) {
        this.websiteUrl = JsonNullable.of(websiteUrl);
        return this;
    }

    /**
     * The enterprise's website URL.
     * @return websiteUrl
     */
    @Valid
    @Schema(
            name = "website_url",
            description = "The enterprise's website URL.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("website_url")
    public JsonNullable<URI> getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(JsonNullable<URI> websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public Enterprise id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the enterprise
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            description = "Unique identifier of the enterprise",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Enterprise nodeId(String nodeId) {
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

    public Enterprise name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the enterprise.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The name of the enterprise.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Enterprise slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * The slug url identifier for the enterprise.
     * @return slug
     */
    @NotNull
    @Schema(
            name = "slug",
            description = "The slug url identifier for the enterprise.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public Enterprise createdAt(OffsetDateTime createdAt) {
        this.createdAt = JsonNullable.of(createdAt);
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
    public JsonNullable<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public Enterprise updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
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
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Enterprise avatarUrl(URI avatarUrl) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Enterprise enterprise = (Enterprise) o;
        return equalsNullable(this.description, enterprise.description)
                && Objects.equals(this.htmlUrl, enterprise.htmlUrl)
                && equalsNullable(this.websiteUrl, enterprise.websiteUrl)
                && Objects.equals(this.id, enterprise.id)
                && Objects.equals(this.nodeId, enterprise.nodeId)
                && Objects.equals(this.name, enterprise.name)
                && Objects.equals(this.slug, enterprise.slug)
                && Objects.equals(this.createdAt, enterprise.createdAt)
                && Objects.equals(this.updatedAt, enterprise.updatedAt)
                && Objects.equals(this.avatarUrl, enterprise.avatarUrl);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(description),
                htmlUrl,
                hashCodeNullable(websiteUrl),
                id,
                nodeId,
                name,
                slug,
                createdAt,
                updatedAt,
                avatarUrl);
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
        sb.append("class Enterprise {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
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
