package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Private registry configuration for an organization
 */
@Schema(
        name = "org-private-registry-configuration-with-selected-repositories",
        description = "Private registry configuration for an organization")
@JsonTypeName("org-private-registry-configuration-with-selected-repositories")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgPrivateRegistryConfigurationWithSelectedRepositories {

    private String name;

    /**
     * The registry type.
     */
    public enum RegistryTypeEnum {
        MAVEN_REPOSITORY("maven_repository"),

        NUGET_FEED("nuget_feed"),

        GOPROXY_SERVER("goproxy_server"),

        NPM_REGISTRY("npm_registry"),

        RUBYGEMS_SERVER("rubygems_server"),

        CARGO_REGISTRY("cargo_registry"),

        COMPOSER_REPOSITORY("composer_repository"),

        DOCKER_REGISTRY("docker_registry"),

        GIT_SOURCE("git_source"),

        HELM_REGISTRY("helm_registry"),

        HEX_ORGANIZATION("hex_organization"),

        HEX_REPOSITORY("hex_repository"),

        PUB_REPOSITORY("pub_repository"),

        PYTHON_INDEX("python_index"),

        TERRAFORM_REGISTRY("terraform_registry");

        private final String value;

        RegistryTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static RegistryTypeEnum fromValue(String value) {
            for (RegistryTypeEnum b : RegistryTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RegistryTypeEnum registryType;

    private URI url;

    private String username;

    private Boolean replacesBase = false;

    /**
     * Which type of organization repositories have access to the private registry. `selected` means only the repositories specified by `selected_repository_ids` can access the private registry.
     */
    public enum VisibilityEnum {
        ALL("all"),

        PRIVATE("private"),

        SELECTED("selected");

        private final String value;

        VisibilityEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static VisibilityEnum fromValue(String value) {
            for (VisibilityEnum b : VisibilityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private VisibilityEnum visibility;

    @Valid
    private List<Long> selectedRepositoryIds = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    public OrgPrivateRegistryConfigurationWithSelectedRepositories() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgPrivateRegistryConfigurationWithSelectedRepositories(
            String name,
            RegistryTypeEnum registryType,
            VisibilityEnum visibility,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.name = name;
        this.registryType = registryType;
        this.visibility = visibility;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public OrgPrivateRegistryConfigurationWithSelectedRepositories name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the private registry configuration.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "MAVEN_REPOSITORY_SECRET",
            description = "The name of the private registry configuration.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OrgPrivateRegistryConfigurationWithSelectedRepositories registryType(RegistryTypeEnum registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * The registry type.
     * @return registryType
     */
    @NotNull
    @Schema(name = "registry_type", description = "The registry type.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("registry_type")
    public RegistryTypeEnum getRegistryType() {
        return registryType;
    }

    public void setRegistryType(RegistryTypeEnum registryType) {
        this.registryType = registryType;
    }

    public OrgPrivateRegistryConfigurationWithSelectedRepositories url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The URL of the private registry.
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            description = "The URL of the private registry.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public OrgPrivateRegistryConfigurationWithSelectedRepositories username(String username) {
        this.username = username;
        return this;
    }

    /**
     * The username to use when authenticating with the private registry.
     * @return username
     */
    @Schema(
            name = "username",
            example = "monalisa",
            description = "The username to use when authenticating with the private registry.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public OrgPrivateRegistryConfigurationWithSelectedRepositories replacesBase(Boolean replacesBase) {
        this.replacesBase = replacesBase;
        return this;
    }

    /**
     * Whether this private registry replaces the base registry (e.g., npmjs.org for npm, rubygems.org for rubygems). When `true`, Dependabot will only use this registry and will not fall back to the public registry. When `false` (default), Dependabot will use this registry for scoped packages but may fall back to the public registry for other packages.
     * @return replacesBase
     */
    @Schema(
            name = "replaces_base",
            description =
                    "Whether this private registry replaces the base registry (e.g., npmjs.org for npm, rubygems.org for rubygems). When `true`, Dependabot will only use this registry and will not fall back to the public registry. When `false` (default), Dependabot will use this registry for scoped packages but may fall back to the public registry for other packages.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("replaces_base")
    public Boolean getReplacesBase() {
        return replacesBase;
    }

    public void setReplacesBase(Boolean replacesBase) {
        this.replacesBase = replacesBase;
    }

    public OrgPrivateRegistryConfigurationWithSelectedRepositories visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Which type of organization repositories have access to the private registry. `selected` means only the repositories specified by `selected_repository_ids` can access the private registry.
     * @return visibility
     */
    @NotNull
    @Schema(
            name = "visibility",
            description =
                    "Which type of organization repositories have access to the private registry. `selected` means only the repositories specified by `selected_repository_ids` can access the private registry.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public OrgPrivateRegistryConfigurationWithSelectedRepositories selectedRepositoryIds(
            List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public OrgPrivateRegistryConfigurationWithSelectedRepositories addSelectedRepositoryIdsItem(
            Long selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * An array of repository IDs that can access the organization private registry when `visibility` is set to `selected`.
     * @return selectedRepositoryIds
     */
    @Schema(
            name = "selected_repository_ids",
            description =
                    "An array of repository IDs that can access the organization private registry when `visibility` is set to `selected`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repository_ids")
    public List<Long> getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    public void setSelectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    public OrgPrivateRegistryConfigurationWithSelectedRepositories createdAt(OffsetDateTime createdAt) {
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

    public OrgPrivateRegistryConfigurationWithSelectedRepositories updatedAt(OffsetDateTime updatedAt) {
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
        OrgPrivateRegistryConfigurationWithSelectedRepositories
                orgPrivateRegistryConfigurationWithSelectedRepositories =
                        (OrgPrivateRegistryConfigurationWithSelectedRepositories) o;
        return Objects.equals(this.name, orgPrivateRegistryConfigurationWithSelectedRepositories.name)
                && Objects.equals(
                        this.registryType, orgPrivateRegistryConfigurationWithSelectedRepositories.registryType)
                && Objects.equals(this.url, orgPrivateRegistryConfigurationWithSelectedRepositories.url)
                && Objects.equals(this.username, orgPrivateRegistryConfigurationWithSelectedRepositories.username)
                && Objects.equals(
                        this.replacesBase, orgPrivateRegistryConfigurationWithSelectedRepositories.replacesBase)
                && Objects.equals(this.visibility, orgPrivateRegistryConfigurationWithSelectedRepositories.visibility)
                && Objects.equals(
                        this.selectedRepositoryIds,
                        orgPrivateRegistryConfigurationWithSelectedRepositories.selectedRepositoryIds)
                && Objects.equals(this.createdAt, orgPrivateRegistryConfigurationWithSelectedRepositories.createdAt)
                && Objects.equals(this.updatedAt, orgPrivateRegistryConfigurationWithSelectedRepositories.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                registryType,
                url,
                username,
                replacesBase,
                visibility,
                selectedRepositoryIds,
                createdAt,
                updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgPrivateRegistryConfigurationWithSelectedRepositories {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    replacesBase: ").append(toIndentedString(replacesBase)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    selectedRepositoryIds: ")
                .append(toIndentedString(selectedRepositoryIds))
                .append("\n");
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
