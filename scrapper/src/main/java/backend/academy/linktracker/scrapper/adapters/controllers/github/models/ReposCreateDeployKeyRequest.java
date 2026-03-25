package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ReposCreateDeployKeyRequest
 */
@JsonTypeName("repos_create_deploy_key_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateDeployKeyRequest {

    private String title;

    private String key;

    private Boolean readOnly;

    public ReposCreateDeployKeyRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateDeployKeyRequest(String key) {
        this.key = key;
    }

    public ReposCreateDeployKeyRequest title(String title) {
        this.title = title;
        return this;
    }

    /**
     * A name for the key.
     * @return title
     */
    @Schema(name = "title", description = "A name for the key.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ReposCreateDeployKeyRequest key(String key) {
        this.key = key;
        return this;
    }

    /**
     * The contents of the key.
     * @return key
     */
    @NotNull
    @Schema(name = "key", description = "The contents of the key.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("key")
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ReposCreateDeployKeyRequest readOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * If `true`, the key will only be able to read repository contents. Otherwise, the key will be able to read and write.      Deploy keys with write access can perform the same actions as an organization member with admin access, or a collaborator on a personal repository. For more information, see \"[Repository permission levels for an organization](https://docs.github.com/articles/repository-permission-levels-for-an-organization/)\" and \"[Permission levels for a user account repository](https://docs.github.com/articles/permission-levels-for-a-user-account-repository/).\"
     * @return readOnly
     */
    @Schema(
            name = "read_only",
            description =
                    "If `true`, the key will only be able to read repository contents. Otherwise, the key will be able to read and write.      Deploy keys with write access can perform the same actions as an organization member with admin access, or a collaborator on a personal repository. For more information, see \"[Repository permission levels for an organization](https://docs.github.com/articles/repository-permission-levels-for-an-organization/)\" and \"[Permission levels for a user account repository](https://docs.github.com/articles/permission-levels-for-a-user-account-repository/).\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("read_only")
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateDeployKeyRequest reposCreateDeployKeyRequest = (ReposCreateDeployKeyRequest) o;
        return Objects.equals(this.title, reposCreateDeployKeyRequest.title)
                && Objects.equals(this.key, reposCreateDeployKeyRequest.key)
                && Objects.equals(this.readOnly, reposCreateDeployKeyRequest.readOnly);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, key, readOnly);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateDeployKeyRequest {\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
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
