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
 * PrivateRegistriesUpdateOrgPrivateRegistryRequest
 */
@JsonTypeName("private_registries_update_org_private_registry_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PrivateRegistriesUpdateOrgPrivateRegistryRequest {

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

    public PrivateRegistriesUpdateOrgPrivateRegistryRequest registryType(RegistryTypeEnum registryType) {
        this.registryType = registryType;
        return this;
    }

    /**
     * The registry type.
     * @return registryType
     */
    @Schema(name = "registry_type", description = "The registry type.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("registry_type")
    public RegistryTypeEnum getRegistryType() {
        return registryType;
    }

    public void setRegistryType(RegistryTypeEnum registryType) {
        this.registryType = registryType;
    }

    public PrivateRegistriesUpdateOrgPrivateRegistryRequest url(URI url) {
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

    public PrivateRegistriesUpdateOrgPrivateRegistryRequest username(String username) {
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

    public PrivateRegistriesUpdateOrgPrivateRegistryRequest replacesBase(Boolean replacesBase) {
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

    public PrivateRegistriesUpdateOrgPrivateRegistryRequest encryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
        return this;
    }

    /**
     * The value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get private registries public key for an organization](https://docs.github.com/rest/private-registries/organization-configurations#get-private-registries-public-key-for-an-organization) endpoint.
     * @return encryptedValue
     */
    @Pattern(regexp = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{4})$")
    @Schema(
            name = "encrypted_value",
            description =
                    "The value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get private registries public key for an organization](https://docs.github.com/rest/private-registries/organization-configurations#get-private-registries-public-key-for-an-organization) endpoint.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("encrypted_value")
    public String getEncryptedValue() {
        return encryptedValue;
    }

    public void setEncryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    public PrivateRegistriesUpdateOrgPrivateRegistryRequest keyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * The ID of the key you used to encrypt the secret.
     * @return keyId
     */
    @Schema(
            name = "key_id",
            description = "The ID of the key you used to encrypt the secret.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("key_id")
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public PrivateRegistriesUpdateOrgPrivateRegistryRequest visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Which type of organization repositories have access to the private registry. `selected` means only the repositories specified by `selected_repository_ids` can access the private registry.
     * @return visibility
     */
    @Schema(
            name = "visibility",
            description =
                    "Which type of organization repositories have access to the private registry. `selected` means only the repositories specified by `selected_repository_ids` can access the private registry.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public PrivateRegistriesUpdateOrgPrivateRegistryRequest selectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public PrivateRegistriesUpdateOrgPrivateRegistryRequest addSelectedRepositoryIdsItem(
            Long selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * An array of repository IDs that can access the organization private registry. You can only provide a list of repository IDs when `visibility` is set to `selected`. This field should be omitted if `visibility` is set to `all` or `private`.
     * @return selectedRepositoryIds
     */
    @Schema(
            name = "selected_repository_ids",
            description =
                    "An array of repository IDs that can access the organization private registry. You can only provide a list of repository IDs when `visibility` is set to `selected`. This field should be omitted if `visibility` is set to `all` or `private`.",
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
        PrivateRegistriesUpdateOrgPrivateRegistryRequest privateRegistriesUpdateOrgPrivateRegistryRequest =
                (PrivateRegistriesUpdateOrgPrivateRegistryRequest) o;
        return Objects.equals(this.registryType, privateRegistriesUpdateOrgPrivateRegistryRequest.registryType)
                && Objects.equals(this.url, privateRegistriesUpdateOrgPrivateRegistryRequest.url)
                && Objects.equals(this.username, privateRegistriesUpdateOrgPrivateRegistryRequest.username)
                && Objects.equals(this.replacesBase, privateRegistriesUpdateOrgPrivateRegistryRequest.replacesBase)
                && Objects.equals(this.encryptedValue, privateRegistriesUpdateOrgPrivateRegistryRequest.encryptedValue)
                && Objects.equals(this.keyId, privateRegistriesUpdateOrgPrivateRegistryRequest.keyId)
                && Objects.equals(this.visibility, privateRegistriesUpdateOrgPrivateRegistryRequest.visibility)
                && Objects.equals(
                        this.selectedRepositoryIds,
                        privateRegistriesUpdateOrgPrivateRegistryRequest.selectedRepositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                registryType, url, username, replacesBase, encryptedValue, keyId, visibility, selectedRepositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateRegistriesUpdateOrgPrivateRegistryRequest {\n");
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
