package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * TeamsAddOrUpdateRepoPermissionsInOrgRequest
 */
@JsonTypeName("teams_add_or_update_repo_permissions_in_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamsAddOrUpdateRepoPermissionsInOrgRequest {

    private String permission;

    public TeamsAddOrUpdateRepoPermissionsInOrgRequest permission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * The permission to grant the team on this repository. We accept the following permissions to be set: `pull`, `triage`, `push`, `maintain`, `admin` and you can also specify a custom repository role name, if the owning organization has defined any. If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
     * @return permission
     */
    @Schema(
            name = "permission",
            description =
                    "The permission to grant the team on this repository. We accept the following permissions to be set: `pull`, `triage`, `push`, `maintain`, `admin` and you can also specify a custom repository role name, if the owning organization has defined any. If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TeamsAddOrUpdateRepoPermissionsInOrgRequest teamsAddOrUpdateRepoPermissionsInOrgRequest =
                (TeamsAddOrUpdateRepoPermissionsInOrgRequest) o;
        return Objects.equals(this.permission, teamsAddOrUpdateRepoPermissionsInOrgRequest.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamsAddOrUpdateRepoPermissionsInOrgRequest {\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
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
