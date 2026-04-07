package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookOrganizationMemberRemoved
 */
@JsonTypeName("webhook-organization-member-removed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookOrganizationMemberRemoved {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        MEMBER_REMOVED("member_removed");

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

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private WebhooksMembership membership;

    private OrganizationSimpleWebhooks organization;

    private Optional<RepositoryWebhooks> repository = Optional.empty();

    private SimpleUser sender;

    public WebhookOrganizationMemberRemoved() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookOrganizationMemberRemoved(
            ActionEnum action,
            WebhooksMembership membership,
            OrganizationSimpleWebhooks organization,
            SimpleUser sender) {
        this.action = action;
        this.membership = membership;
        this.organization = organization;
        this.sender = sender;
    }

    public WebhookOrganizationMemberRemoved action(ActionEnum action) {
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

    public WebhookOrganizationMemberRemoved enterprise(EnterpriseWebhooks enterprise) {
        this.enterprise = Optional.ofNullable(enterprise);
        return this;
    }

    /**
     * Get enterprise
     * @return enterprise
     */
    @Valid
    @Schema(name = "enterprise", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise")
    public Optional<EnterpriseWebhooks> getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Optional<EnterpriseWebhooks> enterprise) {
        this.enterprise = enterprise;
    }

    public WebhookOrganizationMemberRemoved installation(SimpleInstallation installation) {
        this.installation = Optional.ofNullable(installation);
        return this;
    }

    /**
     * Get installation
     * @return installation
     */
    @Valid
    @Schema(name = "installation", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("installation")
    public Optional<SimpleInstallation> getInstallation() {
        return installation;
    }

    public void setInstallation(Optional<SimpleInstallation> installation) {
        this.installation = installation;
    }

    public WebhookOrganizationMemberRemoved membership(WebhooksMembership membership) {
        this.membership = membership;
        return this;
    }

    /**
     * Get membership
     * @return membership
     */
    @NotNull
    @Valid
    @Schema(name = "membership", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("membership")
    public WebhooksMembership getMembership() {
        return membership;
    }

    public void setMembership(WebhooksMembership membership) {
        this.membership = membership;
    }

    public WebhookOrganizationMemberRemoved organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookOrganizationMemberRemoved repository(RepositoryWebhooks repository) {
        this.repository = Optional.ofNullable(repository);
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public Optional<RepositoryWebhooks> getRepository() {
        return repository;
    }

    public void setRepository(Optional<RepositoryWebhooks> repository) {
        this.repository = repository;
    }

    public WebhookOrganizationMemberRemoved sender(SimpleUser sender) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookOrganizationMemberRemoved webhookOrganizationMemberRemoved = (WebhookOrganizationMemberRemoved) o;
        return Objects.equals(this.action, webhookOrganizationMemberRemoved.action)
                && Objects.equals(this.enterprise, webhookOrganizationMemberRemoved.enterprise)
                && Objects.equals(this.installation, webhookOrganizationMemberRemoved.installation)
                && Objects.equals(this.membership, webhookOrganizationMemberRemoved.membership)
                && Objects.equals(this.organization, webhookOrganizationMemberRemoved.organization)
                && Objects.equals(this.repository, webhookOrganizationMemberRemoved.repository)
                && Objects.equals(this.sender, webhookOrganizationMemberRemoved.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(action, enterprise, installation, membership, organization, repository, sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookOrganizationMemberRemoved {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    membership: ").append(toIndentedString(membership)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
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
