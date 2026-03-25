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
 * WebhookMarketplacePurchaseChanged
 */
@JsonTypeName("webhook-marketplace-purchase-changed")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookMarketplacePurchaseChanged {

    /**
     * Gets or Sets action
     */
    public enum ActionEnum {
        CHANGED("changed");

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

    private EnterpriseWebhooks enterprise;

    private SimpleInstallation installation;

    private WebhooksMarketplacePurchase marketplacePurchase;

    private OrganizationSimpleWebhooks organization;

    private MarketplacePurchase previousMarketplacePurchase;

    private RepositoryWebhooks repository;

    private SimpleUser sender;

    public WebhookMarketplacePurchaseChanged() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookMarketplacePurchaseChanged(
            ActionEnum action,
            String effectiveDate,
            WebhooksMarketplacePurchase marketplacePurchase,
            SimpleUser sender) {
        this.action = action;
        this.effectiveDate = effectiveDate;
        this.marketplacePurchase = marketplacePurchase;
        this.sender = sender;
    }

    public WebhookMarketplacePurchaseChanged action(ActionEnum action) {
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

    public WebhookMarketplacePurchaseChanged effectiveDate(String effectiveDate) {
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

    public WebhookMarketplacePurchaseChanged enterprise(EnterpriseWebhooks enterprise) {
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

    public WebhookMarketplacePurchaseChanged installation(SimpleInstallation installation) {
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

    public WebhookMarketplacePurchaseChanged marketplacePurchase(WebhooksMarketplacePurchase marketplacePurchase) {
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
    public WebhooksMarketplacePurchase getMarketplacePurchase() {
        return marketplacePurchase;
    }

    public void setMarketplacePurchase(WebhooksMarketplacePurchase marketplacePurchase) {
        this.marketplacePurchase = marketplacePurchase;
    }

    public WebhookMarketplacePurchaseChanged organization(OrganizationSimpleWebhooks organization) {
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

    public WebhookMarketplacePurchaseChanged previousMarketplacePurchase(
            MarketplacePurchase previousMarketplacePurchase) {
        this.previousMarketplacePurchase = previousMarketplacePurchase;
        return this;
    }

    /**
     * Get previousMarketplacePurchase
     * @return previousMarketplacePurchase
     */
    @Valid
    @Schema(name = "previous_marketplace_purchase", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("previous_marketplace_purchase")
    public MarketplacePurchase getPreviousMarketplacePurchase() {
        return previousMarketplacePurchase;
    }

    public void setPreviousMarketplacePurchase(MarketplacePurchase previousMarketplacePurchase) {
        this.previousMarketplacePurchase = previousMarketplacePurchase;
    }

    public WebhookMarketplacePurchaseChanged repository(RepositoryWebhooks repository) {
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

    public WebhookMarketplacePurchaseChanged sender(SimpleUser sender) {
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
        WebhookMarketplacePurchaseChanged webhookMarketplacePurchaseChanged = (WebhookMarketplacePurchaseChanged) o;
        return Objects.equals(this.action, webhookMarketplacePurchaseChanged.action)
                && Objects.equals(this.effectiveDate, webhookMarketplacePurchaseChanged.effectiveDate)
                && Objects.equals(this.enterprise, webhookMarketplacePurchaseChanged.enterprise)
                && Objects.equals(this.installation, webhookMarketplacePurchaseChanged.installation)
                && Objects.equals(this.marketplacePurchase, webhookMarketplacePurchaseChanged.marketplacePurchase)
                && Objects.equals(this.organization, webhookMarketplacePurchaseChanged.organization)
                && Objects.equals(
                        this.previousMarketplacePurchase, webhookMarketplacePurchaseChanged.previousMarketplacePurchase)
                && Objects.equals(this.repository, webhookMarketplacePurchaseChanged.repository)
                && Objects.equals(this.sender, webhookMarketplacePurchaseChanged.sender);
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
        sb.append("class WebhookMarketplacePurchaseChanged {\n");
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
