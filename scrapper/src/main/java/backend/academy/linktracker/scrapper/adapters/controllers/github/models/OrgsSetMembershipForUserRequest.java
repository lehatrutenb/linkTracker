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
 * OrgsSetMembershipForUserRequest
 */
@JsonTypeName("orgs_set_membership_for_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsSetMembershipForUserRequest {

    /**
     * The role to give the user in the organization. Can be one of:    * `admin` - The user will become an owner of the organization.    * `member` - The user will become a non-owner member of the organization.
     */
    public enum RoleEnum {
        ADMIN("admin"),

        MEMBER("member");

        private final String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String value) {
            for (RoleEnum b : RoleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RoleEnum role = RoleEnum.MEMBER;

    public OrgsSetMembershipForUserRequest role(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * The role to give the user in the organization. Can be one of:    * `admin` - The user will become an owner of the organization.    * `member` - The user will become a non-owner member of the organization.
     * @return role
     */
    @Schema(
            name = "role",
            description =
                    "The role to give the user in the organization. Can be one of:    * `admin` - The user will become an owner of the organization.    * `member` - The user will become a non-owner member of the organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("role")
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsSetMembershipForUserRequest orgsSetMembershipForUserRequest = (OrgsSetMembershipForUserRequest) o;
        return Objects.equals(this.role, orgsSetMembershipForUserRequest.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsSetMembershipForUserRequest {\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
