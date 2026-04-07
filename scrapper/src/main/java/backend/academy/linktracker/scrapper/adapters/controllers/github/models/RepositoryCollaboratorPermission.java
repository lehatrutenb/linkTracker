package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Repository Collaborator Permission
 */
@Schema(name = "repository-collaborator-permission", description = "Repository Collaborator Permission")
@JsonTypeName("repository-collaborator-permission")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryCollaboratorPermission {

    private String permission;

    private String roleName;

    private JsonNullable<NullableCollaborator> user = JsonNullable.<NullableCollaborator>undefined();

    public RepositoryCollaboratorPermission() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryCollaboratorPermission(String permission, String roleName, NullableCollaborator user) {
        this.permission = permission;
        this.roleName = roleName;
        this.user = JsonNullable.of(user);
    }

    public RepositoryCollaboratorPermission permission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    @NotNull
    @Schema(name = "permission", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public RepositoryCollaboratorPermission roleName(String roleName) {
        this.roleName = roleName;
        return this;
    }

    /**
     * Get roleName
     * @return roleName
     */
    @NotNull
    @Schema(name = "role_name", example = "admin", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public RepositoryCollaboratorPermission user(NullableCollaborator user) {
        this.user = JsonNullable.of(user);
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public JsonNullable<NullableCollaborator> getUser() {
        return user;
    }

    public void setUser(JsonNullable<NullableCollaborator> user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryCollaboratorPermission repositoryCollaboratorPermission = (RepositoryCollaboratorPermission) o;
        return Objects.equals(this.permission, repositoryCollaboratorPermission.permission)
                && Objects.equals(this.roleName, repositoryCollaboratorPermission.roleName)
                && Objects.equals(this.user, repositoryCollaboratorPermission.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission, roleName, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryCollaboratorPermission {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
