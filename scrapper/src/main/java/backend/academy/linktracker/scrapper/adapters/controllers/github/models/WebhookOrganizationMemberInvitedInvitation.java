package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The invitation for the user or email if the action is &#x60;member_invited&#x60;.
 */
@Schema(
        name = "webhook_organization_member_invited_invitation",
        description = "The invitation for the user or email if the action is `member_invited`.")
@JsonTypeName("webhook_organization_member_invited_invitation")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookOrganizationMemberInvitedInvitation {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private JsonNullable<String> email = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> failedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<String> failedReason = JsonNullable.<String>undefined();

    private BigDecimal id;

    private URI invitationTeamsUrl;

    private JsonNullable<User> inviter = JsonNullable.<User>undefined();

    private JsonNullable<String> login = JsonNullable.<String>undefined();

    private String nodeId;

    private String role;

    private BigDecimal teamCount;

    private Optional<String> invitationSource = Optional.empty();

    public WebhookOrganizationMemberInvitedInvitation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookOrganizationMemberInvitedInvitation(
            OffsetDateTime createdAt,
            String email,
            OffsetDateTime failedAt,
            String failedReason,
            BigDecimal id,
            URI invitationTeamsUrl,
            User inviter,
            String login,
            String nodeId,
            String role,
            BigDecimal teamCount) {
        this.createdAt = createdAt;
        this.email = JsonNullable.of(email);
        this.failedAt = JsonNullable.of(failedAt);
        this.failedReason = JsonNullable.of(failedReason);
        this.id = id;
        this.invitationTeamsUrl = invitationTeamsUrl;
        this.inviter = JsonNullable.of(inviter);
        this.login = JsonNullable.of(login);
        this.nodeId = nodeId;
        this.role = role;
        this.teamCount = teamCount;
    }

    public WebhookOrganizationMemberInvitedInvitation createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookOrganizationMemberInvitedInvitation email(String email) {
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

    public WebhookOrganizationMemberInvitedInvitation failedAt(OffsetDateTime failedAt) {
        this.failedAt = JsonNullable.of(failedAt);
        return this;
    }

    /**
     * Get failedAt
     * @return failedAt
     */
    @NotNull
    @Valid
    @Schema(name = "failed_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("failed_at")
    public JsonNullable<OffsetDateTime> getFailedAt() {
        return failedAt;
    }

    public void setFailedAt(JsonNullable<OffsetDateTime> failedAt) {
        this.failedAt = failedAt;
    }

    public WebhookOrganizationMemberInvitedInvitation failedReason(String failedReason) {
        this.failedReason = JsonNullable.of(failedReason);
        return this;
    }

    /**
     * Get failedReason
     * @return failedReason
     */
    @NotNull
    @Schema(name = "failed_reason", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("failed_reason")
    public JsonNullable<String> getFailedReason() {
        return failedReason;
    }

    public void setFailedReason(JsonNullable<String> failedReason) {
        this.failedReason = failedReason;
    }

    public WebhookOrganizationMemberInvitedInvitation id(BigDecimal id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Valid
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public WebhookOrganizationMemberInvitedInvitation invitationTeamsUrl(URI invitationTeamsUrl) {
        this.invitationTeamsUrl = invitationTeamsUrl;
        return this;
    }

    /**
     * Get invitationTeamsUrl
     * @return invitationTeamsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "invitation_teams_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("invitation_teams_url")
    public URI getInvitationTeamsUrl() {
        return invitationTeamsUrl;
    }

    public void setInvitationTeamsUrl(URI invitationTeamsUrl) {
        this.invitationTeamsUrl = invitationTeamsUrl;
    }

    public WebhookOrganizationMemberInvitedInvitation inviter(User inviter) {
        this.inviter = JsonNullable.of(inviter);
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
    public JsonNullable<User> getInviter() {
        return inviter;
    }

    public void setInviter(JsonNullable<User> inviter) {
        this.inviter = inviter;
    }

    public WebhookOrganizationMemberInvitedInvitation login(String login) {
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

    public WebhookOrganizationMemberInvitedInvitation nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public WebhookOrganizationMemberInvitedInvitation role(String role) {
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

    public WebhookOrganizationMemberInvitedInvitation teamCount(BigDecimal teamCount) {
        this.teamCount = teamCount;
        return this;
    }

    /**
     * Get teamCount
     * @return teamCount
     */
    @NotNull
    @Valid
    @Schema(name = "team_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("team_count")
    public BigDecimal getTeamCount() {
        return teamCount;
    }

    public void setTeamCount(BigDecimal teamCount) {
        this.teamCount = teamCount;
    }

    public WebhookOrganizationMemberInvitedInvitation invitationSource(String invitationSource) {
        this.invitationSource = Optional.ofNullable(invitationSource);
        return this;
    }

    /**
     * Get invitationSource
     * @return invitationSource
     */
    @Schema(name = "invitation_source", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        WebhookOrganizationMemberInvitedInvitation webhookOrganizationMemberInvitedInvitation =
                (WebhookOrganizationMemberInvitedInvitation) o;
        return Objects.equals(this.createdAt, webhookOrganizationMemberInvitedInvitation.createdAt)
                && Objects.equals(this.email, webhookOrganizationMemberInvitedInvitation.email)
                && Objects.equals(this.failedAt, webhookOrganizationMemberInvitedInvitation.failedAt)
                && Objects.equals(this.failedReason, webhookOrganizationMemberInvitedInvitation.failedReason)
                && Objects.equals(this.id, webhookOrganizationMemberInvitedInvitation.id)
                && Objects.equals(
                        this.invitationTeamsUrl, webhookOrganizationMemberInvitedInvitation.invitationTeamsUrl)
                && Objects.equals(this.inviter, webhookOrganizationMemberInvitedInvitation.inviter)
                && Objects.equals(this.login, webhookOrganizationMemberInvitedInvitation.login)
                && Objects.equals(this.nodeId, webhookOrganizationMemberInvitedInvitation.nodeId)
                && Objects.equals(this.role, webhookOrganizationMemberInvitedInvitation.role)
                && Objects.equals(this.teamCount, webhookOrganizationMemberInvitedInvitation.teamCount)
                && Objects.equals(this.invitationSource, webhookOrganizationMemberInvitedInvitation.invitationSource);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                createdAt,
                email,
                failedAt,
                failedReason,
                id,
                invitationTeamsUrl,
                inviter,
                login,
                nodeId,
                role,
                teamCount,
                invitationSource);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookOrganizationMemberInvitedInvitation {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    failedAt: ").append(toIndentedString(failedAt)).append("\n");
        sb.append("    failedReason: ").append(toIndentedString(failedReason)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    invitationTeamsUrl: ")
                .append(toIndentedString(invitationTeamsUrl))
                .append("\n");
        sb.append("    inviter: ").append(toIndentedString(inviter)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    teamCount: ").append(toIndentedString(teamCount)).append("\n");
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
