package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ActionsCreateOrUpdateEnvironmentSecretRequest
 */
@JsonTypeName("actions_create_or_update_environment_secret_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCreateOrUpdateEnvironmentSecretRequest {

    private String encryptedValue;

    private String keyId;

    public ActionsCreateOrUpdateEnvironmentSecretRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsCreateOrUpdateEnvironmentSecretRequest(String encryptedValue, String keyId) {
        this.encryptedValue = encryptedValue;
        this.keyId = keyId;
    }

    public ActionsCreateOrUpdateEnvironmentSecretRequest encryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
        return this;
    }

    /**
     * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an environment public key](https://docs.github.com/rest/actions/secrets#get-an-environment-public-key) endpoint.
     * @return encryptedValue
     */
    @NotNull
    @Pattern(regexp = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{4})$")
    @Schema(
            name = "encrypted_value",
            description =
                    "Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get an environment public key](https://docs.github.com/rest/actions/secrets#get-an-environment-public-key) endpoint.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("encrypted_value")
    public String getEncryptedValue() {
        return encryptedValue;
    }

    public void setEncryptedValue(String encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    public ActionsCreateOrUpdateEnvironmentSecretRequest keyId(String keyId) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsCreateOrUpdateEnvironmentSecretRequest actionsCreateOrUpdateEnvironmentSecretRequest =
                (ActionsCreateOrUpdateEnvironmentSecretRequest) o;
        return Objects.equals(this.encryptedValue, actionsCreateOrUpdateEnvironmentSecretRequest.encryptedValue)
                && Objects.equals(this.keyId, actionsCreateOrUpdateEnvironmentSecretRequest.keyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptedValue, keyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCreateOrUpdateEnvironmentSecretRequest {\n");
        sb.append("    encryptedValue: ")
                .append(toIndentedString(encryptedValue))
                .append("\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
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
