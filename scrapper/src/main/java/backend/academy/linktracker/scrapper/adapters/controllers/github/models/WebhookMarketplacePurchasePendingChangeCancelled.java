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
 * WebhookMarketplacePurchasePendingChangeCancelled
 */
@JsonTypeName("webhook-marketplace-purchase-pending-change-cancelled")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMarketplacePurchasePendingChangeCancelled {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        PENDING_CHANGE_CANCELLED("pending_change_cancelled");

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

    private String effectiveDate;

    private Optional<EnterpriseWebhooks> enterprise = Optional.empty();

    private Optional<SimpleInstallation> installation = Optional.empty();

    private MarketplacePurchase2 marketplacePurchase;

    private Optional<OrganizationSimpleWebhooks> organization = Optional.empty();

    private Optional<WebhooksPreviousMarketplacePurchase> previousMarketplacePurchase = Optional.empty();

    private Optional<RepositoryWebhooks> repository = Optional.empty();

    private SimpleUser sender;

    public WebhookMarketplacePurchasePendingChangeCancelled() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookMarketplacePurchasePendingChangeCancelled(
            ActionEnum action, String effectiveDate, MarketplacePurchase2 marketplacePurchase, SimpleUser sender) {
        this.action = action;
        this.effectiveDate = effectiveDate;
        this.marketplacePurchase = marketplacePurchase;
        this.sender = sender;
    }

    public WebhookMarketplacePurchasePendingChangeCancelled action(ActionEnum action) {
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

    public WebhookMarketplacePurchasePendingChangeCancelled effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Get effectiveDate
     * @return effectiveDate
     */
    @NotNull
    @Schema(name = "effective_date", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("effective_date")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public WebhookMarketplacePurchasePendingChangeCancelled enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookMarketplacePurchasePendingChangeCancelled installation(SimpleInstallation installation) {
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

    public WebhookMarketplacePurchasePendingChangeCancelled marketplacePurchase(
            MarketplacePurchase2 marketplacePurchase) {
        this.marketplacePurchase = marketplacePurchase;
        return this;
    }

    /**
     * Get marketplacePurchase
     * @return marketplacePurchase
     */
    @NotNull
    @Valid
    @Schema(name = "marketplace_purchase", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("marketplace_purchase")
    public MarketplacePurchase2 getMarketplacePurchase() {
        return marketplacePurchase;
    }

    public void setMarketplacePurchase(MarketplacePurchase2 marketplacePurchase) {
        this.marketplacePurchase = marketplacePurchase;
    }

    public WebhookMarketplacePurchasePendingChangeCancelled organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookMarketplacePurchasePendingChangeCancelled previousMarketplacePurchase(
            WebhooksPreviousMarketplacePurchase previousMarketplacePurchase) {
        this.previousMarketplacePurchase = Optional.ofNullable(previousMarketplacePurchase);
        return this;
    }

    /**
     * Get previousMarketplacePurchase
     * @return previousMarketplacePurchase
     */
    @Valid
    @Schema(name = "previous_marketplace_purchase", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("previous_marketplace_purchase")
    public Optional<WebhooksPreviousMarketplacePurchase> getPreviousMarketplacePurchase() {
        return previousMarketplacePurchase;
    }

    public void setPreviousMarketplacePurchase(
            Optional<WebhooksPreviousMarketplacePurchase> previousMarketplacePurchase) {
        this.previousMarketplacePurchase = previousMarketplacePurchase;
    }

    public WebhookMarketplacePurchasePendingChangeCancelled repository(RepositoryWebhooks repository) {
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

    public WebhookMarketplacePurchasePendingChangeCancelled sender(SimpleUser sender) {
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
        WebhookMarketplacePurchasePendingChangeCancelled webhookMarketplacePurchasePendingChangeCancelled =
                (WebhookMarketplacePurchasePendingChangeCancelled) o;
        return Objects.equals(this.action, webhookMarketplacePurchasePendingChangeCancelled.action)
                && Objects.equals(this.effectiveDate, webhookMarketplacePurchasePendingChangeCancelled.effectiveDate)
                && Objects.equals(this.enterprise, webhookMarketplacePurchasePendingChangeCancelled.enterprise)
                && Objects.equals(this.installation, webhookMarketplacePurchasePendingChangeCancelled.installation)
                && Objects.equals(
                        this.marketplacePurchase, webhookMarketplacePurchasePendingChangeCancelled.marketplacePurchase)
                && Objects.equals(this.organization, webhookMarketplacePurchasePendingChangeCancelled.organization)
                && Objects.equals(
                        this.previousMarketplacePurchase,
                        webhookMarketplacePurchasePendingChangeCancelled.previousMarketplacePurchase)
                && Objects.equals(this.repository, webhookMarketplacePurchasePendingChangeCancelled.repository)
                && Objects.equals(this.sender, webhookMarketplacePurchasePendingChangeCancelled.sender);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                action,
                effectiveDate,
                enterprise,
                installation,
                marketplacePurchase,
                organization,
                previousMarketplacePurchase,
                repository,
                sender);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookMarketplacePurchasePendingChangeCancelled {\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    enterprise: ").append(toIndentedString(enterprise)).append("\n");
        sb.append("    installation: ").append(toIndentedString(installation)).append("\n");
        sb.append("    marketplacePurchase: ")
                .append(toIndentedString(marketplacePurchase))
                .append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    previousMarketplacePurchase: ")
                .append(toIndentedString(previousMarketplacePurchase))
                .append("\n");
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
