package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookRegistryPackageUpdatedRegistryPackage
 */
@JsonTypeName("webhook_registry_package_updated_registry_package")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackageUpdatedRegistryPackage {

    private String createdAt;

    private JsonNullable<Object> description = JsonNullable.<Object>undefined();

    private String ecosystem;

    private String htmlUrl;

    private Long id;

    private String name;

    private String namespace;

    private WebhookRegistryPackagePublishedRegistryPackageOwner owner;

    private String packageType;

    private WebhookRegistryPackageUpdatedRegistryPackagePackageVersion packageVersion;

    private JsonNullable<Object> registry = JsonNullable.<Object>undefined();

    private String updatedAt;

    public WebhookRegistryPackageUpdatedRegistryPackage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRegistryPackageUpdatedRegistryPackage(
            String createdAt,
            Object description,
            String ecosystem,
            String htmlUrl,
            Long id,
            String name,
            String namespace,
            WebhookRegistryPackagePublishedRegistryPackageOwner owner,
            String packageType,
            WebhookRegistryPackageUpdatedRegistryPackagePackageVersion packageVersion,
            Object registry,
            String updatedAt) {
        this.createdAt = createdAt;
        this.description = JsonNullable.of(description);
        this.ecosystem = ecosystem;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.name = name;
        this.namespace = namespace;
        this.owner = owner;
        this.packageType = packageType;
        this.packageVersion = packageVersion;
        this.registry = JsonNullable.of(registry);
        this.updatedAt = updatedAt;
    }

    public WebhookRegistryPackageUpdatedRegistryPackage createdAt(String createdAt) {
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

    public WebhookRegistryPackageUpdatedRegistryPackage description(Object description) {
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
    public JsonNullable<Object> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<Object> description) {
        this.description = description;
    }

    public WebhookRegistryPackageUpdatedRegistryPackage ecosystem(String ecosystem) {
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

    public WebhookRegistryPackageUpdatedRegistryPackage htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookRegistryPackageUpdatedRegistryPackage id(Long id) {
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

    public WebhookRegistryPackageUpdatedRegistryPackage name(String name) {
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

    public WebhookRegistryPackageUpdatedRegistryPackage namespace(String namespace) {
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

    public WebhookRegistryPackageUpdatedRegistryPackage owner(
            WebhookRegistryPackagePublishedRegistryPackageOwner owner) {
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
    public WebhookRegistryPackagePublishedRegistryPackageOwner getOwner() {
        return owner;
    }

    public void setOwner(WebhookRegistryPackagePublishedRegistryPackageOwner owner) {
        this.owner = owner;
    }

    public WebhookRegistryPackageUpdatedRegistryPackage packageType(String packageType) {
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

    public WebhookRegistryPackageUpdatedRegistryPackage packageVersion(
            WebhookRegistryPackageUpdatedRegistryPackagePackageVersion packageVersion) {
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
    public WebhookRegistryPackageUpdatedRegistryPackagePackageVersion getPackageVersion() {
        return packageVersion;
    }

    public void setPackageVersion(WebhookRegistryPackageUpdatedRegistryPackagePackageVersion packageVersion) {
        this.packageVersion = packageVersion;
    }

    public WebhookRegistryPackageUpdatedRegistryPackage registry(Object registry) {
        this.registry = JsonNullable.of(registry);
        return this;
    }

    /**
     * Get registry
     * @return registry
     */
    @NotNull
    @Schema(name = "registry", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("registry")
    public JsonNullable<Object> getRegistry() {
        return registry;
    }

    public void setRegistry(JsonNullable<Object> registry) {
        this.registry = registry;
    }

    public WebhookRegistryPackageUpdatedRegistryPackage updatedAt(String updatedAt) {
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
        WebhookRegistryPackageUpdatedRegistryPackage webhookRegistryPackageUpdatedRegistryPackage =
                (WebhookRegistryPackageUpdatedRegistryPackage) o;
        return Objects.equals(this.createdAt, webhookRegistryPackageUpdatedRegistryPackage.createdAt)
                && Objects.equals(this.description, webhookRegistryPackageUpdatedRegistryPackage.description)
                && Objects.equals(this.ecosystem, webhookRegistryPackageUpdatedRegistryPackage.ecosystem)
                && Objects.equals(this.htmlUrl, webhookRegistryPackageUpdatedRegistryPackage.htmlUrl)
                && Objects.equals(this.id, webhookRegistryPackageUpdatedRegistryPackage.id)
                && Objects.equals(this.name, webhookRegistryPackageUpdatedRegistryPackage.name)
                && Objects.equals(this.namespace, webhookRegistryPackageUpdatedRegistryPackage.namespace)
                && Objects.equals(this.owner, webhookRegistryPackageUpdatedRegistryPackage.owner)
                && Objects.equals(this.packageType, webhookRegistryPackageUpdatedRegistryPackage.packageType)
                && Objects.equals(this.packageVersion, webhookRegistryPackageUpdatedRegistryPackage.packageVersion)
                && Objects.equals(this.registry, webhookRegistryPackageUpdatedRegistryPackage.registry)
                && Objects.equals(this.updatedAt, webhookRegistryPackageUpdatedRegistryPackage.updatedAt);
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
        sb.append("class WebhookRegistryPackageUpdatedRegistryPackage {\n");
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
