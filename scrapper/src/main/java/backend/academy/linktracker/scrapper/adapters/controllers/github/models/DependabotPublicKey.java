package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The public key used for setting Dependabot Secrets.
 */
@Schema(name = "dependabot-public-key", description = "The public key used for setting Dependabot Secrets.")
@JsonTypeName("dependabot-public-key")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotPublicKey {

    private String keyId;

    private String key;

    public DependabotPublicKey() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependabotPublicKey(String keyId, String key) {
        this.keyId = keyId;
        this.key = key;
    }

    public DependabotPublicKey keyId(String keyId) {
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
            example = "1234567",
            description = "The identifier for the key.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key_id")
    public String getKeyId() {
        return keyId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public DependabotPublicKey key(String key) {
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
            example = "hBT5WZEj8ZoOv6TYJsfWq7MxTEQopZO5/IT3ZCVQPzs=",
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
        DependabotPublicKey dependabotPublicKey = (DependabotPublicKey) o;
        return Objects.equals(this.keyId, dependabotPublicKey.keyId)
                && Objects.equals(this.key, dependabotPublicKey.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(keyId, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotPublicKey {\n");
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
