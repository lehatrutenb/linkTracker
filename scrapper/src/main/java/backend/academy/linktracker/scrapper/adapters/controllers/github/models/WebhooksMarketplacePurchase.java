package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhooksMarketplacePurchase
 */
@JsonTypeName("webhooks_marketplace_purchase")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksMarketplacePurchase {

    private WebhooksMarketplacePurchaseAccount account;

    private String billingCycle;

    private String freeTrialEndsOn = null;

    private String nextBillingDate = null;

    private Boolean onFreeTrial;

    private WebhooksMarketplacePurchasePlan plan;

    private Long unitCount;

    public WebhooksMarketplacePurchase() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksMarketplacePurchase(
            WebhooksMarketplacePurchaseAccount account,
            String billingCycle,
            String freeTrialEndsOn,
            String nextBillingDate,
            Boolean onFreeTrial,
            WebhooksMarketplacePurchasePlan plan,
            Long unitCount) {
        this.account = account;
        this.billingCycle = billingCycle;
        this.freeTrialEndsOn = freeTrialEndsOn;
        this.nextBillingDate = nextBillingDate;
        this.onFreeTrial = onFreeTrial;
        this.plan = plan;
        this.unitCount = unitCount;
    }

    public WebhooksMarketplacePurchase account(WebhooksMarketplacePurchaseAccount account) {
        this.account = account;
        return this;
    }

    /**
     * Get account
     * @return account
     */
    @NotNull
    @Valid
    @Schema(name = "account", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("account")
    public WebhooksMarketplacePurchaseAccount getAccount() {
        return account;
    }

    public void setAccount(WebhooksMarketplacePurchaseAccount account) {
        this.account = account;
    }

    public WebhooksMarketplacePurchase billingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }

    /**
     * Get billingCycle
     * @return billingCycle
     */
    @NotNull
    @Schema(name = "billing_cycle", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("billing_cycle")
    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public WebhooksMarketplacePurchase freeTrialEndsOn(String freeTrialEndsOn) {
        this.freeTrialEndsOn = freeTrialEndsOn;
        return this;
    }

    /**
     * Get freeTrialEndsOn
     * @return freeTrialEndsOn
     */
    @NotNull
    @Schema(name = "free_trial_ends_on", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("free_trial_ends_on")
    public String getFreeTrialEndsOn() {
        return freeTrialEndsOn;
    }

    public void setFreeTrialEndsOn(String freeTrialEndsOn) {
        this.freeTrialEndsOn = freeTrialEndsOn;
    }

    public WebhooksMarketplacePurchase nextBillingDate(String nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
        return this;
    }

    /**
     * Get nextBillingDate
     * @return nextBillingDate
     */
    @NotNull
    @Schema(name = "next_billing_date", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("next_billing_date")
    public String getNextBillingDate() {
        return nextBillingDate;
    }

    public void setNextBillingDate(String nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    public WebhooksMarketplacePurchase onFreeTrial(Boolean onFreeTrial) {
        this.onFreeTrial = onFreeTrial;
        return this;
    }

    /**
     * Get onFreeTrial
     * @return onFreeTrial
     */
    @NotNull
    @Schema(name = "on_free_trial", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("on_free_trial")
    public Boolean getOnFreeTrial() {
        return onFreeTrial;
    }

    public void setOnFreeTrial(Boolean onFreeTrial) {
        this.onFreeTrial = onFreeTrial;
    }

    public WebhooksMarketplacePurchase plan(WebhooksMarketplacePurchasePlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get plan
     * @return plan
     */
    @NotNull
    @Valid
    @Schema(name = "plan", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("plan")
    public WebhooksMarketplacePurchasePlan getPlan() {
        return plan;
    }

    public void setPlan(WebhooksMarketplacePurchasePlan plan) {
        this.plan = plan;
    }

    public WebhooksMarketplacePurchase unitCount(Long unitCount) {
        this.unitCount = unitCount;
        return this;
    }

    /**
     * Get unitCount
     * @return unitCount
     */
    @NotNull
    @Schema(name = "unit_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("unit_count")
    public Long getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(Long unitCount) {
        this.unitCount = unitCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksMarketplacePurchase webhooksMarketplacePurchase = (WebhooksMarketplacePurchase) o;
        return Objects.equals(this.account, webhooksMarketplacePurchase.account)
                && Objects.equals(this.billingCycle, webhooksMarketplacePurchase.billingCycle)
                && Objects.equals(this.freeTrialEndsOn, webhooksMarketplacePurchase.freeTrialEndsOn)
                && Objects.equals(this.nextBillingDate, webhooksMarketplacePurchase.nextBillingDate)
                && Objects.equals(this.onFreeTrial, webhooksMarketplacePurchase.onFreeTrial)
                && Objects.equals(this.plan, webhooksMarketplacePurchase.plan)
                && Objects.equals(this.unitCount, webhooksMarketplacePurchase.unitCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, billingCycle, freeTrialEndsOn, nextBillingDate, onFreeTrial, plan, unitCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksMarketplacePurchase {\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
        sb.append("    freeTrialEndsOn: ")
                .append(toIndentedString(freeTrialEndsOn))
                .append("\n");
        sb.append("    nextBillingDate: ")
                .append(toIndentedString(nextBillingDate))
                .append("\n");
        sb.append("    onFreeTrial: ").append(toIndentedString(onFreeTrial)).append("\n");
        sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
        sb.append("    unitCount: ").append(toIndentedString(unitCount)).append("\n");
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
