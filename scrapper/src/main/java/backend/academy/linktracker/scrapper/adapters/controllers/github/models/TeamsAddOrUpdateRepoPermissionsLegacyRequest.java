package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * TeamsAddOrUpdateRepoPermissionsLegacyRequest
 */
@JsonTypeName("teams_add_or_update_repo_permissions_legacy_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamsAddOrUpdateRepoPermissionsLegacyRequest {

    /**
     * The permission to grant the team on this repository. If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
     */
    public enum PermissionEnum {
        PULL("pull"),

        PUSH("push"),

        ADMIN("admin");

        private final String value;

        PermissionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PermissionEnum fromValue(String value) {
            for (PermissionEnum b : PermissionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PermissionEnum permission;

    public TeamsAddOrUpdateRepoPermissionsLegacyRequest permission(PermissionEnum permission) {
        this.permission = permission;
        return this;
    }

    /**
     * The permission to grant the team on this repository. If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.
     * @return permission
     */
    @Schema(
            name = "permission",
            description =
                    "The permission to grant the team on this repository. If no permission is specified, the team's `permission` attribute will be used to determine what permission to grant the team on this repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permission")
    public PermissionEnum getPermission() {
        return permission;
    }

    public void setPermission(PermissionEnum permission) {
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
        TeamsAddOrUpdateRepoPermissionsLegacyRequest teamsAddOrUpdateRepoPermissionsLegacyRequest =
                (TeamsAddOrUpdateRepoPermissionsLegacyRequest) o;
        return Objects.equals(this.permission, teamsAddOrUpdateRepoPermissionsLegacyRequest.permission);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permission);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamsAddOrUpdateRepoPermissionsLegacyRequest {\n");
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
