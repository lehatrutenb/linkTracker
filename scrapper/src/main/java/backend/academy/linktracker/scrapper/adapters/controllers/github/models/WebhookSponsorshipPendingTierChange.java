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
 * WebhookSponsorshipPendingTierChange
 */
@JsonTypeName("webhook-sponsorship-pending-tier-change")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSponsorshipPendingTierChange {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        PENDING_TIER_CHANGE("pending_tier_change");

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

    private WebhooksChanges8 changes;

    private String effectiveDate;

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private OrganizationSimpleWebhooks organization;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    private WebhooksSponsorship sponsorship;

    public WebhookSponsorshipPendingTierChange() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookSponsorshipPendingTierChange(
            ActionEnum action, WebhooksChanges8 changes, SimpleUser sender, WebhooksSponsorship sponsorship) {
        this.action = action;
        this.changes = changes;
        this.sender = sender;
        this.sponsorship = sponsorship;
    }

    public WebhookSponsorshipPendingTierChange action(ActionEnum action) {
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

    public WebhookSponsorshipPendingTierChange changes(WebhooksChanges8 changes) {
        this.changes = changes;
        return this;
    }

    /**
     * Get changes
     * @return changes
     */
    @NotNull
    @Valid
    @Schema(name = "changes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("changes")
    public WebhooksChanges8 getChanges() {
        return changes;
    }

    public void setChanges(WebhooksChanges8 changes) {
        this.changes = changes;
    }

    public WebhookSponsorshipPendingTierChange effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * The `pending_cancellation` and `pending_tier_change` event types will include the date the cancellation or tier change will take effect.
     * @return effectiveDate
     */
    @Schema(
            name = "effective_date",
            description =
                    "The `pending_cancellation` and `pending_tier_change` event types will include the date the cancellation or tier change will take effect.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("effective_date")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public WebhookSponsorshipPendingTierChange enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookSponsorshipPendingTierChange installation(SimpleInstallation installation) {
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

    public WebhookSponsorshipPendingTierChange organization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public OrganizationSimpleWebhooks getOrganization() {
        return organization;
    }

    public void setOrganization(OrganizationSimpleWebhooks organization) {
        this.organization = organization;
    }

    public WebhookSponsorshipPendingTierChange repository(RepositoryWebhooks repository) {
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

    public WebhookSponsorshipPendingTierChange sender(SimpleUser sender) {
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

    public WebhookSponsorshipPendingTierChange sponsorship(WebhooksSponsorship sponsorship) {
        this.sponsorship = sponsorship;
        return this;
    }

    /**
     * Get sponsorship
     * @return sponsorship
     */
    @NotNull
    @Valid
    @Schema(name = "sponsorship", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sponsorship")
    public WebhooksSponsorship getSponsorship() {
        return sponsorship;
    }

    public void setSponsorship(WebhooksSponsorship sponsorship) {
        this.sponsorship = sponsorship;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookSponsorshipPendingTierChange webhookSponsorshipPendingTierChange =
                (WebhookSponsorshipPendingTierChange) o;
        return Objects.equals(this.action, webhookSponsorshipPendingTierChange.action)
                && Objects.equals(this.changes, webhookSponsorshipPendingTierChange.changes)
                && Objects.equals(this.effectiveDate, webhookSponsorshipPendingTierChange.effectiveDate)
                && Objects.equals(this.enterprise, webhookSponsorshipPendingTierChange.enterprise)
                && Objects.equals(this.installation, webhookSponsorshipPendingTierChange.installation)
                && Objects.equals(this.organization, webhookSponsorshipPendingTierChange.organization)
                && Objects.equals(this.repository, webhookSponsorshipPendingTierChange.repository)
                && Objects.equals(this.sender, webhookSponsorshipPendingTierChange.sender)
                && Objects.equals(this.sponsorship, webhookSponsorshipPendingTierChange.sponsorship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                changes,
                effectiveDate,
                enterprise,
                installation,
                organization,
                repository,
                sender,
                sponsorship);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSponsorshipPendingTierChange {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    changes: ").append(toIndentedString(changes)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    sender: ").append(toIndentedString(sender)).append("\n");
        sb.append("    sponsorship: ").append(toIndentedString(sponsorship)).append("\n");
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
