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
 * ReposUpdateInvitationRequest
 */
@JsonTypeName("repos_update_invitation_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposUpdateInvitationRequest {

    /**
     * The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`, `triage`, and `admin`.
     */
    public enum PermissionsEnum {
        READ("read"),

        WRITE("write"),

        MAINTAIN("maintain"),

        TRIAGE("triage"),

        ADMIN("admin");

        private final String value;

        PermissionsEnum(String value) {
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
        public static PermissionsEnum fromValue(String value) {
            for (PermissionsEnum b : PermissionsEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private PermissionsEnum permissions;

    public ReposUpdateInvitationRequest permissions(PermissionsEnum permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`, `triage`, and `admin`.
     * @return permissions
     */
    @Schema(
            name = "permissions",
            description =
                    "The permissions that the associated user will have on the repository. Valid values are `read`, `write`, `maintain`, `triage`, and `admin`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public PermissionsEnum getPermissions() {
        return permissions;
    }

    public void setPermissions(PermissionsEnum permissions) {
        this.permissions = permissions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposUpdateInvitationRequest reposUpdateInvitationRequest = (ReposUpdateInvitationRequest) o;
        return Objects.equals(this.permissions, reposUpdateInvitationRequest.permissions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(permissions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposUpdateInvitationRequest {\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
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
