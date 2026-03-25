package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * UsersCreateGpgKeyForAuthenticatedUserRequest
 */
@JsonTypeName("users_create_gpg_key_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UsersCreateGpgKeyForAuthenticatedUserRequest {

    private String name;

    private String armoredPublicKey;

    public UsersCreateGpgKeyForAuthenticatedUserRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UsersCreateGpgKeyForAuthenticatedUserRequest(String armoredPublicKey) {
        this.armoredPublicKey = armoredPublicKey;
    }

    public UsersCreateGpgKeyForAuthenticatedUserRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * A descriptive name for the new key.
     * @return name
     */
    @Schema(
            name = "name",
            description = "A descriptive name for the new key.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UsersCreateGpgKeyForAuthenticatedUserRequest armoredPublicKey(String armoredPublicKey) {
        this.armoredPublicKey = armoredPublicKey;
        return this;
    }

    /**
     * A GPG key in ASCII-armored format.
     * @return armoredPublicKey
     */
    @NotNull
    @Schema(
            name = "armored_public_key",
            description = "A GPG key in ASCII-armored format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("armored_public_key")
    public String getArmoredPublicKey() {
        return armoredPublicKey;
    }

    public void setArmoredPublicKey(String armoredPublicKey) {
        this.armoredPublicKey = armoredPublicKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsersCreateGpgKeyForAuthenticatedUserRequest usersCreateGpgKeyForAuthenticatedUserRequest =
                (UsersCreateGpgKeyForAuthenticatedUserRequest) o;
        return Objects.equals(this.name, usersCreateGpgKeyForAuthenticatedUserRequest.name)
                && Objects.equals(this.armoredPublicKey, usersCreateGpgKeyForAuthenticatedUserRequest.armoredPublicKey);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, armoredPublicKey);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersCreateGpgKeyForAuthenticatedUserRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    armoredPublicKey: ")
                .append(toIndentedString(armoredPublicKey))
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
