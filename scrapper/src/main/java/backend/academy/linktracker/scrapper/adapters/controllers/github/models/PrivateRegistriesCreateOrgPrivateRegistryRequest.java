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
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PrivateRegistriesCreateOrgPrivateRegistryRequest
 */
@JsonTypeName("private_registries_create_org_private_registry_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PrivateRegistriesCreateOrgPrivateRegistryRequest {

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

    private String username = null;

    private Boolean replacesBase = false;

    private String encryptedValue;

    private String keyId;

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

    public PrivateRegistriesCreateOrgPrivateRegistryRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PrivateRegistriesCreateOrgPrivateRegistryRequest(
            RegistryTypeEnum registryType, URI url, String encryptedValue, String keyId, VisibilityEnum visibility) {
        this.registryType = registryType;
        this.url = url;
        this.encryptedValue = encryptedValue;
        this.keyId = keyId;
        this.visibility = visibility;
    }

    public PrivateRegistriesCreateOrgPrivateRegistryRequest registryType(RegistryTypeEnum registryType) {
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

    public PrivateRegistriesCreateOrgPrivateRegistryRequest url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The URL of the private registry.
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", description = "The URL of the private registry.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public PrivateRegistriesCreateOrgPrivateRegistryRequest username(String username) {
        this.username = username;
        return this;
    }

    /**
     * The username to use when authenticating with the private registry. This field should be omitted if the private registry does not require a username for authentication.
     * @return username
     */
    @Schema(
            name = "username",
            description =
                    "The username to use when authenticating with the private registry. This field should be omitted if the private registry does not require a username for authentication.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public PrivateRegistriesCreateOrgPrivateRegistryRequest replacesBase(Boolean replacesBase) {
        this.replacesBase = replacesBase;
        return this;
    }

    /**
     * Whether this private registry should replace the base registry (e.g., npmjs.org for npm, rubygems.org for rubygems). When set to `true`, Dependabot will only use this registry and will not fall back to the public registry. When set to `false` (default), Dependabot will use this registry for scoped packages but may fall back to the public registry for other packages.
     * @return replacesBase
     */
    @Schema(
            name = "replaces_base",
            description =
                    "Whether this private registry should replace the base registry (e.g., npmjs.org for npm, rubygems.org for rubygems). When set to `true`, Dependabot will only use this registry and will not fall back to the public registry. When set to `false` (default), Dependabot will use this registry for scoped packages but may fall back to the public registry for other packages.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("replaces_base")
    public Boolean getReplacesBase() {
        return replacesBase;
    }

    public void setReplacesBase(Boolean replacesBase) {
        this.replacesBase = replacesBase;
    }

    public PrivateRegistriesCreateOrgPrivateRegistryRequest encryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
        return this;
    }

    /**
     * The value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get private registries public key for an organization](https://docs.github.com/rest/private-registries/organization-configurations#get-private-registries-public-key-for-an-organization) endpoint.
     * @return encryptedValue
     */
    @NotNull
    @Pattern(regexp = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{4})$")
    @Schema(
            name = "encrypted_value",
            description =
                    "The value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get private registries public key for an organization](https://docs.github.com/rest/private-registries/organization-configurations#get-private-registries-public-key-for-an-organization) endpoint.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("encrypted_value")
    public String getEncryptedValue() {
        return encryptedValue;
    }

    public void setEncryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    public PrivateRegistriesCreateOrgPrivateRegistryRequest keyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * The ID of the key you used to encrypt the secret.
     * @return keyId
     */
    @NotNull
    @Schema(
            name = "key_id",
            description = "The ID of the key you used to encrypt the secret.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key_id")
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public PrivateRegistriesCreateOrgPrivateRegistryRequest visibility(VisibilityEnum visibility) {
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

    public PrivateRegistriesCreateOrgPrivateRegistryRequest selectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public PrivateRegistriesCreateOrgPrivateRegistryRequest addSelectedRepositoryIdsItem(
            Long selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * An array of repository IDs that can access the organization private registry. You can only provide a list of repository IDs when `visibility` is set to `selected`. You can manage the list of selected repositories using the [Update a private registry for an organization](https://docs.github.com/rest/private-registries/organization-configurations#update-a-private-registry-for-an-organization) endpoint. This field should be omitted if `visibility` is set to `all` or `private`.
     * @return selectedRepositoryIds
     */
    @Schema(
            name = "selected_repository_ids",
            description =
                    "An array of repository IDs that can access the organization private registry. You can only provide a list of repository IDs when `visibility` is set to `selected`. You can manage the list of selected repositories using the [Update a private registry for an organization](https://docs.github.com/rest/private-registries/organization-configurations#update-a-private-registry-for-an-organization) endpoint. This field should be omitted if `visibility` is set to `all` or `private`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repository_ids")
    public List<Long> getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    public void setSelectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivateRegistriesCreateOrgPrivateRegistryRequest privateRegistriesCreateOrgPrivateRegistryRequest =
                (PrivateRegistriesCreateOrgPrivateRegistryRequest) o;
        return Objects.equals(this.registryType, privateRegistriesCreateOrgPrivateRegistryRequest.registryType)
                && Objects.equals(this.url, privateRegistriesCreateOrgPrivateRegistryRequest.url)
                && Objects.equals(this.username, privateRegistriesCreateOrgPrivateRegistryRequest.username)
                && Objects.equals(this.replacesBase, privateRegistriesCreateOrgPrivateRegistryRequest.replacesBase)
                && Objects.equals(this.encryptedValue, privateRegistriesCreateOrgPrivateRegistryRequest.encryptedValue)
                && Objects.equals(this.keyId, privateRegistriesCreateOrgPrivateRegistryRequest.keyId)
                && Objects.equals(this.visibility, privateRegistriesCreateOrgPrivateRegistryRequest.visibility)
                && Objects.equals(
                        this.selectedRepositoryIds,
                        privateRegistriesCreateOrgPrivateRegistryRequest.selectedRepositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                registryType, url, username, replacesBase, encryptedValue, keyId, visibility, selectedRepositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateRegistriesCreateOrgPrivateRegistryRequest {\n");
        sb.append("    registryType: ").append(toIndentedString(registryType)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    replacesBase: ").append(toIndentedString(replacesBase)).append("\n");
        sb.append("    encryptedValue: ")
                .append(toIndentedString(encryptedValue))
                .append("\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    visibility: ").append(toIndentedString(visibility)).append("\n");
        sb.append("    selectedRepositoryIds: ")
                .append(toIndentedString(selectedRepositoryIds))
                .append("\n");
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
