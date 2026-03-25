package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest
 */
@JsonTypeName("codespaces_create_or_update_secret_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest {

    private String encryptedValue;

    private String keyId;

    @Valid
    private List<CodespacesCreateOrUpdateSecretForAuthenticatedUserRequestSelectedRepositoryIdsInner>
            selectedRepositoryIds = new ArrayList<>();

    public CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest(String keyId) {
        this.keyId = keyId;
    }

    public CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest encryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
        return this;
    }

    /**
     * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get the public key for the authenticated user](https://docs.github.com/rest/codespaces/secrets#get-public-key-for-the-authenticated-user) endpoint.
     * @return encryptedValue
     */
    @Pattern(regexp = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{4})$")
    @Schema(
            name = "encrypted_value",
            description =
                    "Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get the public key for the authenticated user](https://docs.github.com/rest/codespaces/secrets#get-public-key-for-the-authenticated-user) endpoint.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("encrypted_value")
    public String getEncryptedValue() {
        return encryptedValue;
    }

    public void setEncryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    public CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest keyId(String keyId) {
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

    public CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest selectedRepositoryIds(
            List<CodespacesCreateOrUpdateSecretForAuthenticatedUserRequestSelectedRepositoryIdsInner>
                    selectedRepositoryIds) {
        this.selectedRepositoryIds = selectedRepositoryIds;
        return this;
    }

    public CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest addSelectedRepositoryIdsItem(
            CodespacesCreateOrUpdateSecretForAuthenticatedUserRequestSelectedRepositoryIdsInner
                    selectedRepositoryIdsItem) {
        if (this.selectedRepositoryIds == null) {
            this.selectedRepositoryIds = new ArrayList<>();
        }
        this.selectedRepositoryIds.add(selectedRepositoryIdsItem);
        return this;
    }

    /**
     * An array of repository ids that can access the user secret. You can manage the list of selected repositories using the [List selected repositories for a user secret](https://docs.github.com/rest/codespaces/secrets#list-selected-repositories-for-a-user-secret), [Set selected repositories for a user secret](https://docs.github.com/rest/codespaces/secrets#set-selected-repositories-for-a-user-secret), and [Remove a selected repository from a user secret](https://docs.github.com/rest/codespaces/secrets#remove-a-selected-repository-from-a-user-secret) endpoints.
     * @return selectedRepositoryIds
     */
    @Valid
    @Schema(
            name = "selected_repository_ids",
            description =
                    "An array of repository ids that can access the user secret. You can manage the list of selected repositories using the [List selected repositories for a user secret](https://docs.github.com/rest/codespaces/secrets#list-selected-repositories-for-a-user-secret), [Set selected repositories for a user secret](https://docs.github.com/rest/codespaces/secrets#set-selected-repositories-for-a-user-secret), and [Remove a selected repository from a user secret](https://docs.github.com/rest/codespaces/secrets#remove-a-selected-repository-from-a-user-secret) endpoints.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("selected_repository_ids")
    public List<CodespacesCreateOrUpdateSecretForAuthenticatedUserRequestSelectedRepositoryIdsInner>
            getSelectedRepositoryIds() {
        return selectedRepositoryIds;
    }

    public void setSelectedRepositoryIds(
            List<CodespacesCreateOrUpdateSecretForAuthenticatedUserRequestSelectedRepositoryIdsInner>
                    selectedRepositoryIds) {
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
        CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest
                codespacesCreateOrUpdateSecretForAuthenticatedUserRequest =
                        (CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest) o;
        return Objects.equals(
                        this.encryptedValue, codespacesCreateOrUpdateSecretForAuthenticatedUserRequest.encryptedValue)
                && Objects.equals(this.keyId, codespacesCreateOrUpdateSecretForAuthenticatedUserRequest.keyId)
                && Objects.equals(
                        this.selectedRepositoryIds,
                        codespacesCreateOrUpdateSecretForAuthenticatedUserRequest.selectedRepositoryIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptedValue, keyId, selectedRepositoryIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodespacesCreateOrUpdateSecretForAuthenticatedUserRequest {\n");
        sb.append("    encryptedValue: ")
                .append(toIndentedString(encryptedValue))
                .append("\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
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
