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
 * WebhookSponsorshipPendingCancellation
 */
@JsonTypeName("webhook-sponsorship-pending-cancellation")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookSponsorshipPendingCancellation {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        PENDING_CANCELLATION("pending_cancellation");

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

    private Optional<String> effectiveDate = Optional.empty();

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private Optional<RepositoryWebhooks> repository = Optional.empty();

    private SimpleUser sender;

    private WebhooksSponsorship sponsorship;

    public WebhookSponsorshipPendingCancellation() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookSponsorshipPendingCancellation(
            ActionEnum action, SimpleUser sender, WebhooksSponsorship sponsorship) {
        this.action = action;
        this.sender = sender;
        this.sponsorship = sponsorship;
    }

    public WebhookSponsorshipPendingCancellation action(ActionEnum action) {
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

    public WebhookSponsorshipPendingCancellation effectiveDate(String effectiveDate) {
        this.effectiveDate = Optional.ofNullable(effectiveDate);
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
    public Optional<String> getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Optional<String> effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public WebhookSponsorshipPendingCancellation enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookSponsorshipPendingCancellation installation(SimpleInstallation installation) {
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

    public WebhookSponsorshipPendingCancellation organization(OrganizationSimpleWebhooks organization) {
        this.organization = Optional.ofNullable(organization);
        return this;
    }

    /**
     * Get organization
     * @return organization
     */
    @Valid
    @Schema(name = "organization", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization")
    public Optional<OrganizationSimpleWebhooks> getOrganization() {
        return organization;
    }

    public void setOrganization(Optional<OrganizationSimpleWebhooks> organization) {
        this.organization = organization;
    }

    public WebhookSponsorshipPendingCancellation repository(RepositoryWebhooks repository) {
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

    public WebhookSponsorshipPendingCancellation sender(SimpleUser sender) {
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

    public WebhookSponsorshipPendingCancellation sponsorship(WebhooksSponsorship sponsorship) {
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
        WebhookSponsorshipPendingCancellation webhookSponsorshipPendingCancellation =
                (WebhookSponsorshipPendingCancellation) o;
        return Objects.equals(this.action, webhookSponsorshipPendingCancellation.action)
                && Objects.equals(this.effectiveDate, webhookSponsorshipPendingCancellation.effectiveDate)
                && Objects.equals(this.enterprise, webhookSponsorshipPendingCancellation.enterprise)
                && Objects.equals(this.installation, webhookSponsorshipPendingCancellation.installation)
                && Objects.equals(this.organization, webhookSponsorshipPendingCancellation.organization)
                && Objects.equals(this.repository, webhookSponsorshipPendingCancellation.repository)
                && Objects.equals(this.sender, webhookSponsorshipPendingCancellation.sender)
                && Objects.equals(this.sponsorship, webhookSponsorshipPendingCancellation.sponsorship);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action, effectiveDate, enterprise, installation, organization, repository, sender, sponsorship);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookSponsorshipPendingCancellation {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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
