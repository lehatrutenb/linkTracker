package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * OrgsCreateInvitationRequest
 */
@JsonTypeName("orgs_create_invitation_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsCreateInvitationRequest {

    private Optional<Long> inviteeId = Optional.empty();

    private Optional<String> email = Optional.empty();

    /**
     * The role for the new member.   * `admin` - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.    * `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.    * `billing_manager` - Non-owner organization members with ability to manage the billing settings of your organization.   * `reinstate` - The previous role assigned to the invitee before they were removed from your organization. Can be one of the roles listed above. Only works if the invitee was previously part of your organization.
     */
    public enum RoleEnum {
        ADMIN("admin"),

        DIRECT_MEMBER("direct_member"),

        BILLING_MANAGER("billing_manager"),

        REINSTATE("reinstate");

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

    private Optional<RoleEnum> role = Optional.of(RoleEnum.DIRECT_MEMBER);

    @Valid
    private List<Long> teamIds = new ArrayList<>();

    public OrgsCreateInvitationRequest inviteeId(Long inviteeId) {
        this.inviteeId = Optional.ofNullable(inviteeId);
        return this;
    }

    /**
     * **Required unless you provide `email`**. GitHub user ID for the person you are inviting.
     * @return inviteeId
     */
    @Schema(
            name = "invitee_id",
            description = "**Required unless you provide `email`**. GitHub user ID for the person you are inviting.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("invitee_id")
    public Optional<Long> getInviteeId() {
        return inviteeId;
    }

    public void setInviteeId(Optional<Long> inviteeId) {
        this.inviteeId = inviteeId;
    }

    public OrgsCreateInvitationRequest email(String email) {
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * **Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an existing GitHub user.
     * @return email
     */
    @Schema(
            name = "email",
            description =
                    "**Required unless you provide `invitee_id`**. Email address of the person you are inviting, which can be an existing GitHub user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public OrgsCreateInvitationRequest role(RoleEnum role) {
        this.role = Optional.ofNullable(role);
        return this;
    }

    /**
     * The role for the new member.   * `admin` - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.    * `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.    * `billing_manager` - Non-owner organization members with ability to manage the billing settings of your organization.   * `reinstate` - The previous role assigned to the invitee before they were removed from your organization. Can be one of the roles listed above. Only works if the invitee was previously part of your organization.
     * @return role
     */
    @Schema(
            name = "role",
            description =
                    "The role for the new member.   * `admin` - Organization owners with full administrative rights to the organization and complete access to all repositories and teams.    * `direct_member` - Non-owner organization members with ability to see other members and join teams by invitation.    * `billing_manager` - Non-owner organization members with ability to manage the billing settings of your organization.   * `reinstate` - The previous role assigned to the invitee before they were removed from your organization. Can be one of the roles listed above. Only works if the invitee was previously part of your organization.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("role")
    public Optional<RoleEnum> getRole() {
        return role;
    }

    public void setRole(Optional<RoleEnum> role) {
        this.role = role;
    }

    public OrgsCreateInvitationRequest teamIds(List<Long> teamIds) {
        this.teamIds = teamIds;
        return this;
    }

    public OrgsCreateInvitationRequest addTeamIdsItem(Long teamIdsItem) {
        if (this.teamIds == null) {
            this.teamIds = new ArrayList<>();
        }
        this.teamIds.add(teamIdsItem);
        return this;
    }

    /**
     * Specify IDs for the teams you want to invite new members to.
     * @return teamIds
     */
    @Schema(
            name = "team_ids",
            description = "Specify IDs for the teams you want to invite new members to.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("team_ids")
    public List<Long> getTeamIds() {
        return teamIds;
    }

    public void setTeamIds(List<Long> teamIds) {
        this.teamIds = teamIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrgsCreateInvitationRequest orgsCreateInvitationRequest = (OrgsCreateInvitationRequest) o;
        return Objects.equals(this.inviteeId, orgsCreateInvitationRequest.inviteeId)
                && Objects.equals(this.email, orgsCreateInvitationRequest.email)
                && Objects.equals(this.role, orgsCreateInvitationRequest.role)
                && Objects.equals(this.teamIds, orgsCreateInvitationRequest.teamIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(inviteeId, email, role, teamIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsCreateInvitationRequest {\n");
        sb.append("    inviteeId: ").append(toIndentedString(inviteeId)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    teamIds: ").append(toIndentedString(teamIds)).append("\n");
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
