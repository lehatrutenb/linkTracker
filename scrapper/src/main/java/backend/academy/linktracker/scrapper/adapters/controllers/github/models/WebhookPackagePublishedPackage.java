package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * Information about the package.
 */
@Schema(name = "webhook_package_published_package", description = "Information about the package.")
@JsonTypeName("webhook_package_published_package")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookPackagePublishedPackage {

    private String createdAt = null;

    private String description = null;

    private String ecosystem;

    private URI htmlUrl;

    private Long id;

    private String name;

    private String namespace;

    private User owner = null;

    private String packageType;

    private WebhookPackagePublishedPackagePackageVersion packageVersion = null;

    private WebhookPackagePublishedPackageRegistry registry = null;

    private String updatedAt = null;

    public WebhookPackagePublishedPackage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookPackagePublishedPackage(
            String createdAt,
            String description,
            String ecosystem,
            URI htmlUrl,
            Long id,
            String name,
            String namespace,
            User owner,
            String packageType,
            WebhookPackagePublishedPackagePackageVersion packageVersion,
            WebhookPackagePublishedPackageRegistry registry,
            String updatedAt) {
        this.createdAt = createdAt;
        this.description = description;
        this.ecosystem = ecosystem;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.namespace = namespace;
        this.owner = owner;
        this.packageType = packageType;
        this.packageVersion = packageVersion;
        this.registry = registry;
        this.updatedAt = updatedAt;
    }

    public WebhookPackagePublishedPackage createdAt(String createdAt) {
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

    public WebhookPackagePublishedPackage description(String description) {
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

    public WebhookPackagePublishedPackage ecosystem(String ecosystem) {
        this.ecosystem = ecosystem;
        return this;
    }

    /**
     * Get ecosystem
     * @return ecosystem
     */
    @NotNull
    @Schema(name = "ecosystem", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ecosystem")
    public String getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    public WebhookPackagePublishedPackage htmlUrl(URI htmlUrl) {
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

    public WebhookPackagePublishedPackage id(Long id) {
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

    public WebhookPackagePublishedPackage name(String name) {
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

    public WebhookPackagePublishedPackage namespace(String namespace) {
        this.namespace = namespace;
        return this;
    }

    /**
     * Get namespace
     * @return namespace
     */
    @NotNull
    @Schema(name = "namespace", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("namespace")
    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public WebhookPackagePublishedPackage owner(User owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Get owner
     * @return owner
     */
    @NotNull
    @Valid
    @Schema(name = "owner", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owner")
    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public WebhookPackagePublishedPackage packageType(String packageType) {
        this.packageType = packageType;
        return this;
    }

    /**
     * Get packageType
     * @return packageType
     */
    @NotNull
    @Schema(name = "package_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("package_type")
    public String getPackageType() {
        return packageType;
    }

    public void setPackageType(String packageType) {
        this.packageType = packageType;
    }

    public WebhookPackagePublishedPackage packageVersion(WebhookPackagePublishedPackagePackageVersion packageVersion) {
        this.packageVersion = packageVersion;
        return this;
    }

    /**
     * Get packageVersion
     * @return packageVersion
     */
    @NotNull
    @Valid
    @Schema(name = "package_version", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("package_version")
    public WebhookPackagePublishedPackagePackageVersion getPackageVersion() {
        return packageVersion;
    }

    public void setPackageVersion(WebhookPackagePublishedPackagePackageVersion packageVersion) {
        this.packageVersion = packageVersion;
    }

    public WebhookPackagePublishedPackage registry(WebhookPackagePublishedPackageRegistry registry) {
        this.registry = registry;
        return this;
    }

    /**
     * Get registry
     * @return registry
     */
    @NotNull
    @Valid
    @Schema(name = "registry", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("registry")
    public WebhookPackagePublishedPackageRegistry getRegistry() {
        return registry;
    }

    public void setRegistry(WebhookPackagePublishedPackageRegistry registry) {
        this.registry = registry;
    }

    public WebhookPackagePublishedPackage updatedAt(String updatedAt) {
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
        WebhookPackagePublishedPackage webhookPackagePublishedPackage = (WebhookPackagePublishedPackage) o;
        return Objects.equals(this.createdAt, webhookPackagePublishedPackage.createdAt)
                && Objects.equals(this.description, webhookPackagePublishedPackage.description)
                && Objects.equals(this.ecosystem, webhookPackagePublishedPackage.ecosystem)
                && Objects.equals(this.htmlUrl, webhookPackagePublishedPackage.htmlUrl)
                && Objects.equals(this.id, webhookPackagePublishedPackage.id)
                && Objects.equals(this.name, webhookPackagePublishedPackage.name)
                && Objects.equals(this.namespace, webhookPackagePublishedPackage.namespace)
                && Objects.equals(this.owner, webhookPackagePublishedPackage.owner)
                && Objects.equals(this.packageType, webhookPackagePublishedPackage.packageType)
                && Objects.equals(this.packageVersion, webhookPackagePublishedPackage.packageVersion)
                && Objects.equals(this.registry, webhookPackagePublishedPackage.registry)
                && Objects.equals(this.updatedAt, webhookPackagePublishedPackage.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                createdAt,
                description,
                ecosystem,
                htmlUrl,
                id,
                name,
                namespace,
                owner,
                packageType,
                packageVersion,
                registry,
                updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookPackagePublishedPackage {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ecosystem: ").append(toIndentedString(ecosystem)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    packageType: ").append(toIndentedString(packageType)).append("\n");
        sb.append("    packageVersion: ")
                .append(toIndentedString(packageVersion))
                .append("\n");
        sb.append("    registry: ").append(toIndentedString(registry)).append("\n");
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
