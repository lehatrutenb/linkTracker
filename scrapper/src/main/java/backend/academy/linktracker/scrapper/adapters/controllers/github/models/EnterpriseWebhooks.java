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
 * An enterprise on GitHub. Webhook payloads contain the &#x60;enterprise&#x60; property when the webhook is configured on an enterprise account or an organization that&#39;s part of an enterprise account. For more information, see \&quot;[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts).\&quot;
 */
@Schema(
        name = "enterprise-webhooks",
        description =
                "An enterprise on GitHub. Webhook payloads contain the `enterprise` property when the webhook is configured on an enterprise account or an organization that's part of an enterprise account. For more information, see \"[About enterprise accounts](https://docs.github.com/admin/overview/about-enterprise-accounts).\"")
@JsonTypeName("enterprise-webhooks")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnterpriseWebhooks {

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

    public EnterpriseWebhooks() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnterpriseWebhooks(
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

    public EnterpriseWebhooks description(String description) {
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

    public EnterpriseWebhooks htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/enterprises/octo-business",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public EnterpriseWebhooks websiteUrl(URI websiteUrl) {
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

    public EnterpriseWebhooks id(Long id) {
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
            example = "42",
            description = "Unique identifier of the enterprise",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnterpriseWebhooks nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDEwOlJlcG9zaXRvcnkxMjk2MjY5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public EnterpriseWebhooks name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the enterprise.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Octo Business",
            description = "The name of the enterprise.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseWebhooks slug(String slug) {
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
            example = "octo-business",
            description = "The slug url identifier for the enterprise.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public EnterpriseWebhooks createdAt(OffsetDateTime createdAt) {
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2019-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public JsonNullable<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public EnterpriseWebhooks updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2019-01-26T19:14:43Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public EnterpriseWebhooks avatarUrl(URI avatarUrl) {
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
        EnterpriseWebhooks enterpriseWebhooks = (EnterpriseWebhooks) o;
        return equalsNullable(this.description, enterpriseWebhooks.description)
                && Objects.equals(this.htmlUrl, enterpriseWebhooks.htmlUrl)
                && equalsNullable(this.websiteUrl, enterpriseWebhooks.websiteUrl)
                && Objects.equals(this.id, enterpriseWebhooks.id)
                && Objects.equals(this.nodeId, enterpriseWebhooks.nodeId)
                && Objects.equals(this.name, enterpriseWebhooks.name)
                && Objects.equals(this.slug, enterpriseWebhooks.slug)
                && Objects.equals(this.createdAt, enterpriseWebhooks.createdAt)
                && Objects.equals(this.updatedAt, enterpriseWebhooks.updatedAt)
                && Objects.equals(this.avatarUrl, enterpriseWebhooks.avatarUrl);
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
        sb.append("class EnterpriseWebhooks {\n");
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
