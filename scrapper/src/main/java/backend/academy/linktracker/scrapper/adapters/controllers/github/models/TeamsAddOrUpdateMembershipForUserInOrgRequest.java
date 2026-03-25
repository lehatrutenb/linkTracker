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
 * TeamsAddOrUpdateMembershipForUserInOrgRequest
 */
@JsonTypeName("teams_add_or_update_membership_for_user_in_org_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamsAddOrUpdateMembershipForUserInOrgRequest {

    /**
     * The role that this user should have in the team.
     */
    public enum RoleEnum {
        MEMBER("member"),

        MAINTAINER("maintainer");

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

    public TeamsAddOrUpdateMembershipForUserInOrgRequest role(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * The role that this user should have in the team.
     * @return role
     */
    @Schema(
            name = "role",
            description = "The role that this user should have in the team.",
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
        TeamsAddOrUpdateMembershipForUserInOrgRequest teamsAddOrUpdateMembershipForUserInOrgRequest =
                (TeamsAddOrUpdateMembershipForUserInOrgRequest) o;
        return Objects.equals(this.role, teamsAddOrUpdateMembershipForUserInOrgRequest.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(role);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamsAddOrUpdateMembershipForUserInOrgRequest {\n");
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
