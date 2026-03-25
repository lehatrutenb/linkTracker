package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * UsersCreateSshSigningKeyForAuthenticatedUserRequest
 */
@JsonTypeName("users_create_ssh_signing_key_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UsersCreateSshSigningKeyForAuthenticatedUserRequest {

    private String title;

    private String key;

    public UsersCreateSshSigningKeyForAuthenticatedUserRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UsersCreateSshSigningKeyForAuthenticatedUserRequest(String key) {
        this.key = key;
    }

    public UsersCreateSshSigningKeyForAuthenticatedUserRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
     * A descriptive name for the new key.
     * @return title
     */
    @Schema(
            name = "title",
            example = "Personal MacBook Air",
            description = "A descriptive name for the new key.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public UsersCreateSshSigningKeyForAuthenticatedUserRequest key(String key) {
        this.key = key;
        return this;
    }

    /**
     * The public SSH key to add to your GitHub account. For more information, see \"[Checking for existing SSH keys](https://docs.github.com/authentication/connecting-to-github-with-ssh/checking-for-existing-ssh-keys).\"
     * @return key
     */
    @NotNull
    @Pattern(
            regexp =
                    "^ssh-(rsa|dss|ed25519) |^ecdsa-sha2-nistp(256|384|521) |^(sk-ssh-ed25519|sk-ecdsa-sha2-nistp256)@openssh.com ")
    @Schema(
            name = "key",
            description =
                    "The public SSH key to add to your GitHub account. For more information, see \"[Checking for existing SSH keys](https://docs.github.com/authentication/connecting-to-github-with-ssh/checking-for-existing-ssh-keys).\"",
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
        UsersCreateSshSigningKeyForAuthenticatedUserRequest usersCreateSshSigningKeyForAuthenticatedUserRequest =
                (UsersCreateSshSigningKeyForAuthenticatedUserRequest) o;
        return Objects.equals(this.title, usersCreateSshSigningKeyForAuthenticatedUserRequest.title)
                && Objects.equals(this.key, usersCreateSshSigningKeyForAuthenticatedUserRequest.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, key);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersCreateSshSigningKeyForAuthenticatedUserRequest {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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
