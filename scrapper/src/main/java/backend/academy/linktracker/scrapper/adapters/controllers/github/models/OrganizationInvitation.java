package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Organization Invitation
 */
@Schema(name = "organization-invitation", description = "Organization Invitation")
@JsonTypeName("organization-invitation")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrganizationInvitation {

    private Long id;

    private JsonNullable<String> login = JsonNullable.<String>undefined();

    private JsonNullable<String> email = JsonNullable.<String>undefined();

    private String role;

    private String createdAt;

    private JsonNullable<String> failedAt = JsonNullable.<String>undefined();

    private JsonNullable<String> failedReason = JsonNullable.<String>undefined();

    private SimpleUser inviter;

    private Long teamCount;

    private String nodeId;

    private String invitationTeamsUrl;

    private Optional<String> invitationSource = Optional.empty();

    public OrganizationInvitation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrganizationInvitation(
            Long id,
            String login,
            String email,
            String role,
            String createdAt,
            SimpleUser inviter,
            Long teamCount,
            String nodeId,
            String invitationTeamsUrl) {
        this.id = id;
        this.login = JsonNullable.of(login);
        this.email = JsonNullable.of(email);
        this.role = role;
        this.createdAt = createdAt;
        this.inviter = inviter;
        this.teamCount = teamCount;
        this.nodeId = nodeId;
        this.invitationTeamsUrl = invitationTeamsUrl;
    }

    public OrganizationInvitation id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OrganizationInvitation login(String login) {
        this.login = JsonNullable.of(login);
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @NotNull
    @Schema(name = "login", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("login")
    public JsonNullable<String> getLogin() {
        return login;
    }

    public void setLogin(JsonNullable<String> login) {
        this.login = login;
    }

    public OrganizationInvitation email(String email) {
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @NotNull
    @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public JsonNullable<String> getEmail() {
        return email;
    }

    public void setEmail(JsonNullable<String> email) {
        this.email = email;
    }

    public OrganizationInvitation role(String role) {
        this.role = role;
        return this;
    }

    /**
     * Get role
     * @return role
     */
    @NotNull
    @Schema(name = "role", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("role")
    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public OrganizationInvitation createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public OrganizationInvitation failedAt(String failedAt) {
        this.failedAt = JsonNullable.of(failedAt);
        return this;
    }

    /**
     * Get failedAt
     * @return failedAt
     */
    @Schema(name = "failed_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("failed_at")
    public JsonNullable<String> getFailedAt() {
        return failedAt;
    }

    public void setFailedAt(JsonNullable<String> failedAt) {
        this.failedAt = failedAt;
    }

    public OrganizationInvitation failedReason(String failedReason) {
        this.failedReason = JsonNullable.of(failedReason);
        return this;
    }

    /**
     * Get failedReason
     * @return failedReason
     */
    @Schema(name = "failed_reason", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("failed_reason")
    public JsonNullable<String> getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(JsonNullable<String> failedReason) {
        this.failedReason = failedReason;
    }

    public OrganizationInvitation inviter(SimpleUser inviter) {
        this.inviter = inviter;
        return this;
    }

    /**
     * Get inviter
     * @return inviter
     */
    @NotNull
    @Valid
    @Schema(name = "inviter", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("inviter")
    public SimpleUser getInviter() {
        return inviter;
    }

    public void setInviter(SimpleUser inviter) {
        this.inviter = inviter;
    }

    public OrganizationInvitation teamCount(Long teamCount) {
        this.teamCount = teamCount;
        return this;
    }

    /**
     * Get teamCount
     * @return teamCount
     */
    @NotNull
    @Schema(name = "team_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("team_count")
    public Long getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(Long teamCount) {
        this.teamCount = teamCount;
    }

    public OrganizationInvitation nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(
            name = "node_id",
            example = "\"MDIyOk9yZ2FuaXphdGlvbkludml0YXRpb24x\"",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public OrganizationInvitation invitationTeamsUrl(String invitationTeamsUrl) {
        this.invitationTeamsUrl = invitationTeamsUrl;
        return this;
    }

    /**
     * Get invitationTeamsUrl
     * @return invitationTeamsUrl
     */
    @NotNull
    @Schema(
            name = "invitation_teams_url",
            example = "\"https://api.github.com/organizations/16/invitations/1/teams\"",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("invitation_teams_url")
    public String getInvitationTeamsUrl() {
        return invitationTeamsUrl;
    }

    public void setInvitationTeamsUrl(String invitationTeamsUrl) {
        this.invitationTeamsUrl = invitationTeamsUrl;
    }

    public OrganizationInvitation invitationSource(String invitationSource) {
        this.invitationSource = Optional.ofNullable(invitationSource);
        return this;
    }

    /**
     * Get invitationSource
     * @return invitationSource
     */
    @Schema(name = "invitation_source", example = "\"member\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("invitation_source")
    public Optional<String> getInvitationSource() {
        return invitationSource;
    }

    public void setInvitationSource(Optional<String> invitationSource) {
        this.invitationSource = invitationSource;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        OrganizationInvitation organizationInvitation = (OrganizationInvitation) o;
        return Objects.equals(this.id, organizationInvitation.id)
                && Objects.equals(this.login, organizationInvitation.login)
                && Objects.equals(this.email, organizationInvitation.email)
                && Objects.equals(this.role, organizationInvitation.role)
                && Objects.equals(this.createdAt, organizationInvitation.createdAt)
                && equalsNullable(this.failedAt, organizationInvitation.failedAt)
                && equalsNullable(this.failedReason, organizationInvitation.failedReason)
                && Objects.equals(this.inviter, organizationInvitation.inviter)
                && Objects.equals(this.teamCount, organizationInvitation.teamCount)
                && Objects.equals(this.nodeId, organizationInvitation.nodeId)
                && Objects.equals(this.invitationTeamsUrl, organizationInvitation.invitationTeamsUrl)
                && Objects.equals(this.invitationSource, organizationInvitation.invitationSource);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                id,
                login,
                email,
                role,
                createdAt,
                hashCodeNullable(failedAt),
                hashCodeNullable(failedReason),
                inviter,
                teamCount,
                nodeId,
                invitationTeamsUrl,
                invitationSource);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrganizationInvitation {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    inviter: ").append(toIndentedString(inviter)).append("\n");
        sb.append("    teamCount: ").append(toIndentedString(teamCount)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    invitationTeamsUrl: ")
                .append(toIndentedString(invitationTeamsUrl))
                .append("\n");
        sb.append("    invitationSource: ")
                .append(toIndentedString(invitationSource))
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
