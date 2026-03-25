package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookOrganizationMemberInvited
 */
@JsonTypeName("webhook-organization-member-invited")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookOrganizationMemberInvited {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        MEMBER_INVITED("member_invited");

        private final String value;

        ActionEnum(String value) {
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
        public static ActionEnum fromValue(String value) {
            for (ActionEnum b : ActionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ActionEnum action;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private WebhookOrganizationMemberInvitedInvitation invitation;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    private WebhooksUser user = null;

    public WebhookOrganizationMemberInvited() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookOrganizationMemberInvited(
            ActionEnum action,
            WebhookOrganizationMemberInvitedInvitation invitation,
            OrganizationSimpleWebhooks organization,
            SimpleUser sender) {
        this.action = action;
        this.invitation = invitation;
        this.organization = organization;
        this.sender = sender;
    }

    public WebhookOrganizationMemberInvited action(ActionEnum action) {
        this.action = action;
        return this;
    }

    /**
     * Get action
     * @return action
     */
    @NotNull
    @Schema(name = "action", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("action")
    public ActionEnum getAction() {
        return action;
    }

    public void setAction(ActionEnum action) {
        this.action = action;
    }

    public WebhookOrganizationMemberInvited enterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = enterprise;
        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    @Valid
    @Schema(name = "enterprise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise")
    public EnterpriseWebhooks getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = enterprise;
    }

    public WebhookOrganizationMemberInvited installation(SimpleInstallation installation) {
        this.installation = installation;
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public SimpleInstallation getInstallation() {
        return installation;
    }

    public void setInstallation(SimpleInstallation installation) {
        this.installation = installation;
    }

    public WebhookOrganizationMemberInvited invitation(WebhookOrganizationMemberInvitedInvitation invitation) {
        this.invitation = invitation;
        return this;
    }

    /**
     * Get invitation
     * @return invitation
     */
    @NotNull
    @Valid
    @Schema(name = "invitation", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("invitation")
    public WebhookOrganizationMemberInvitedInvitation getInvitation() {
        return invitation;
    }

    public void setInvitation(WebhookOrganizationMemberInvitedInvitation invitation) {
        this.invitation = invitation;
    }

    public WebhookOrganizationMemberInvited organization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @NotNull
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization")
    public OrganizationSimpleWebhooks getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
    }

    public WebhookOrganizationMemberInvited repository(RepositoryWebhooks repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public RepositoryWebhooks getRepository() {
        return repository;
    }

    public void setRepository(RepositoryWebhooks repository) {
        this.repository = repository;
    }

    public WebhookOrganizationMemberInvited sender(SimpleUser sender) {
        this.sender = sender;
        return this;
    }

    /**
     * Get sender
     * @return sender
     */
    @NotNull
    @Valid
    @Schema(name = "sender", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sender")
    public SimpleUser getSender() {
        return sender;
    }

    public void setSender(SimpleUser sender) {
        this.sender = sender;
    }

    public WebhookOrganizationMemberInvited user(WebhooksUser user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user")
    public WebhooksUser getUser() {
        return user;
    }

    public void setUser(WebhooksUser user) {
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
        WebhookOrganizationMemberInvited webhookOrganizationMemberInvited = (WebhookOrganizationMemberInvited) o;
        return Objects.equals(this.action, webhookOrganizationMemberInvited.action)
                && Objects.equals(this.enterprise, webhookOrganizationMemberInvited.enterprise)
                && Objects.equals(this.installation, webhookOrganizationMemberInvited.installation)
                && Objects.equals(this.invitation, webhookOrganizationMemberInvited.invitation)
                && Objects.equals(this.organization, webhookOrganizationMemberInvited.organization)
                && Objects.equals(this.repository, webhookOrganizationMemberInvited.repository)
                && Objects.equals(this.sender, webhookOrganizationMemberInvited.sender)
                && Objects.equals(this.user, webhookOrganizationMemberInvited.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enterprise, installation, invitation, organization, repository, sender, user);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookOrganizationMemberInvited {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    invitation: ").append(toIndentedString(invitation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
