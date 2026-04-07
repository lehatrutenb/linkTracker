package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.Pattern;
import java.util.Objects;
import java.util.Optional;

/**
 * DependabotCreateOrUpdateRepoSecretRequest
 */
@JsonTypeName("dependabot_create_or_update_repo_secret_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotCreateOrUpdateRepoSecretRequest {

    private Optional<
                    @Pattern(
                            regexp = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{4})$")
                    String>
            encryptedValue = Optional.empty();

    private Optional<String> keyId = Optional.empty();

    public DependabotCreateOrUpdateRepoSecretRequest encryptedValue(String encryptedValue) {
        this.encryptedValue = Optional.ofNullable(encryptedValue);
        return this;
    }

    /**
     * Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get a repository public key](https://docs.github.com/rest/dependabot/secrets#get-a-repository-public-key) endpoint.
     * @return encryptedValue
     */
    @Schema(
            name = "encrypted_value",
            description =
                    "Value for your secret, encrypted with [LibSodium](https://libsodium.gitbook.io/doc/bindings_for_other_languages) using the public key retrieved from the [Get a repository public key](https://docs.github.com/rest/dependabot/secrets#get-a-repository-public-key) endpoint.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("encrypted_value")
    public Optional<
                    @Pattern(
                            regexp = "^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{4})$")
                    String>
            getEncryptedValue() {
        return encryptedValue;
    }

    public void setEncryptedValue(Optional<String> encryptedValue) {
        this.encryptedValue = encryptedValue;
    }

    public DependabotCreateOrUpdateRepoSecretRequest keyId(String keyId) {
        this.keyId = Optional.ofNullable(keyId);
        return this;
    }

    /**
     * ID of the key you used to encrypt the secret.
     * @return keyId
     */
    @Schema(
            name = "key_id",
            description = "ID of the key you used to encrypt the secret.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("key_id")
    public Optional<String> getKeyId() {
        return keyId;
    }

    public void setKeyId(Optional<String> keyId) {
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
        DependabotCreateOrUpdateRepoSecretRequest dependabotCreateOrUpdateRepoSecretRequest =
                (DependabotCreateOrUpdateRepoSecretRequest) o;
        return Objects.equals(this.encryptedValue, dependabotCreateOrUpdateRepoSecretRequest.encryptedValue)
                && Objects.equals(this.keyId, dependabotCreateOrUpdateRepoSecretRequest.keyId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(encryptedValue, keyId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotCreateOrUpdateRepoSecretRequest {\n");
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
