package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ActionsCreateOrUpdateOrgSecretRequest
 */
@JsonTypeName("actions_create_or_update_org_secret_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCreateOrUpdateOrgSecretRequest {

    private String encryptedValue;

    private String keyId;

    /**
     * Which type of organization repositories have access to the organization secret. `selected` means only the repositories specified by `selected_repository_ids` can access the secret.
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

    public ActionsCreateOrUpdateOrgSecretRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsCreateOrUpdateOrgSecretRequest(String encryptedValue, String keyId, VisibilityEnum visibility) {
        this.encryptedValue = encryptedValue;
        this.keyId = keyId;
        this.visibility = visibility;
    }

    public ActionsCreateOrUpdateOrgSecretRequest encryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
        return this;
    }

    /**
     * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an organization public key](https://docs.github.com/rest/actions/secrets#get-an-organization-public-key) endpoint.
     * @return encryptedValue
     */
    @NotNull
    @Pattern(regexp = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{4})$")
    @Schema(
            name = "encrypted_value",
            description =
                    "Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an organization public key](https://docs.github.com/rest/actions/secrets#get-an-organization-public-key) endpoint.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("encrypted_value")
    public String getEncryptedValue() {
        return encryptedValue;
    }

    public void setEncryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    public ActionsCreateOrUpdateOrgSecretRequest keyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * ID of the key you used to encrypt the secret.
     * @return keyId
     */
    @NotNull
    @Schema(
            name = "key_id",
            description = "ID of the key you used to encrypt the secret.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key_id")
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public ActionsCreateOrUpdateOrgSecretRequest visibility(VisibilityEnum visibility) {
        this.visibility = visibility;
        return this;
    }

    /**
     * Which type of organization repositories have access to the organization secret. `selected` means only the repositories specified by `selected_repository_ids` can access the secret.
     * @return visibility
     */
    @NotNull
    @Schema(
            name = "visibility",
            description =
                    "Which type of organization repositories have access to the organization secret. `selected` means only the repositories specified by `selected_repository_ids` can access the secret.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("visibility")
    public VisibilityEnum getVisibility() {
        return visibility;
    }

    public void setVisibility(VisibilityEnum visibility) {
        this.visibility = visibility;
    }

    public ActionsCreateOrUpdateOrgSecretRequest selectedRepositoryIds(List<Long> selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public ActionsCreateOrUpdateOrgSecretRequest addSelectedRepositoryIdsItem(Long selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List selected repositories for an organization secret](https://docs.github.com/rest/actions/secrets#list-selected-repositories-for-an-organization-secret), [Set selected repositories for an organization secret](https://docs.github.com/rest/actions/secrets#set-selected-repositories-for-an-organization-secret), and [Remove selected repository from an organization secret](https://docs.github.com/rest/actions/secrets#remove-selected-repository-from-an-organization-secret) endpoints.
     * @return selectedRepositoryIds
     */
    @Schema(
            name = "selected_repository_ids",
            description =
                    "An array of repository ids that can access the organization secret. You can only provide a list of repository ids when the `visibility` is set to `selected`. You can manage the list of selected repositories using the [List selected repositories for an organization secret](https://docs.github.com/rest/actions/secrets#list-selected-repositories-for-an-organization-secret), [Set selected repositories for an organization secret](https://docs.github.com/rest/actions/secrets#set-selected-repositories-for-an-organization-secret), and [Remove selected repository from an organization secret](https://docs.github.com/rest/actions/secrets#remove-selected-repository-from-an-organization-secret) endpoints.",
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
        ActionsCreateOrUpdateOrgSecretRequest actionsCreateOrUpdateOrgSecretRequest =
                (ActionsCreateOrUpdateOrgSecretRequest) o;
        return Objects.equals(this.encryptedValue, actionsCreateOrUpdateOrgSecretRequest.encryptedValue)
                && Objects.equals(this.keyId, actionsCreateOrUpdateOrgSecretRequest.keyId)
                && Objects.equals(this.visibility, actionsCreateOrUpdateOrgSecretRequest.visibility)
                && Objects.equals(
                        this.selectedRepositoryIds, actionsCreateOrUpdateOrgSecretRequest.selectedRepositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptedValue, keyId, visibility, selectedRepositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCreateOrUpdateOrgSecretRequest {\n");
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
