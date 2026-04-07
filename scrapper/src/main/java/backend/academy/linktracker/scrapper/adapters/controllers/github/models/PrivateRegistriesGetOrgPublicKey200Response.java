package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * PrivateRegistriesGetOrgPublicKey200Response
 */
@JsonTypeName("private_registries_get_org_public_key_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PrivateRegistriesGetOrgPublicKey200Response {

    private String keyId;

    private String key;

    public PrivateRegistriesGetOrgPublicKey200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PrivateRegistriesGetOrgPublicKey200Response(String keyId, String key) {
        this.keyId = keyId;
        this.key = key;
    }

    public PrivateRegistriesGetOrgPublicKey200Response keyId(String keyId) {
        this.keyId = keyId;
        return this;
    }

    /**
     * The identifier for the key.
     * @return keyId
     */
    @NotNull
    @Schema(
            name = "key_id",
            example = "012345678912345678",
            description = "The identifier for the key.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key_id")
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public PrivateRegistriesGetOrgPublicKey200Response key(String key) {
        this.key = key;
        return this;
    }

    /**
     * The Base64 encoded public key.
     * @return key
     */
    @NotNull
    @Schema(
            name = "key",
            example = "2Sg8iYjAxxmI2LvUXpJjkYrMxURPc8r+dB7TJyvv1234",
            description = "The Base64 encoded public key.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivateRegistriesGetOrgPublicKey200Response privateRegistriesGetOrgPublicKey200Response =
                (PrivateRegistriesGetOrgPublicKey200Response) o;
        return Objects.equals(this.keyId, privateRegistriesGetOrgPublicKey200Response.keyId)
                && Objects.equals(this.key, privateRegistriesGetOrgPublicKey200Response.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrivateRegistriesGetOrgPublicKey200Response {\n");
        sb.append("    keyId: ").append(toIndentedString(keyId)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
