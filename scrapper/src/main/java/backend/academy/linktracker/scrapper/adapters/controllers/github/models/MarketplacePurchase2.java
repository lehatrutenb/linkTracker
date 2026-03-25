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
 * MarketplacePurchase2
 */
@JsonTypeName("Marketplace_Purchase_2")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MarketplacePurchase2 {

    private WebhooksMarketplacePurchaseAccount account;

    private String billingCycle;

    private Object freeTrialEndsOn = null;

    private String nextBillingDate = null;

    private Boolean onFreeTrial;

    private WebhooksPreviousMarketplacePurchasePlan plan;

    private Long unitCount;

    public MarketplacePurchase2() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MarketplacePurchase2(
            WebhooksMarketplacePurchaseAccount account,
            String billingCycle,
            Object freeTrialEndsOn,
            String nextBillingDate,
            Boolean onFreeTrial,
            WebhooksPreviousMarketplacePurchasePlan plan,
            Long unitCount) {
        this.account = account;
        this.billingCycle = billingCycle;
        this.freeTrialEndsOn = freeTrialEndsOn;
        this.nextBillingDate = nextBillingDate;
        this.onFreeTrial = onFreeTrial;
        this.plan = plan;
        this.unitCount = unitCount;
    }

    public MarketplacePurchase2 account(WebhooksMarketplacePurchaseAccount account) {
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

    public MarketplacePurchase2 billingCycle(String billingCycle) {
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

    public MarketplacePurchase2 freeTrialEndsOn(Object freeTrialEndsOn) {
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
    public Object getFreeTrialEndsOn() {
        return freeTrialEndsOn;
    }

    public void setFreeTrialEndsOn(Object freeTrialEndsOn) {
        this.freeTrialEndsOn = freeTrialEndsOn;
    }

    public MarketplacePurchase2 nextBillingDate(String nextBillingDate) {
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

    public MarketplacePurchase2 onFreeTrial(Boolean onFreeTrial) {
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

    public MarketplacePurchase2 plan(WebhooksPreviousMarketplacePurchasePlan plan) {
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
    public WebhooksPreviousMarketplacePurchasePlan getPlan() {
        return plan;
    }

    public void setPlan(WebhooksPreviousMarketplacePurchasePlan plan) {
        this.plan = plan;
    }

    public MarketplacePurchase2 unitCount(Long unitCount) {
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
        MarketplacePurchase2 marketplacePurchase2 = (MarketplacePurchase2) o;
        return Objects.equals(this.account, marketplacePurchase2.account)
                && Objects.equals(this.billingCycle, marketplacePurchase2.billingCycle)
                && Objects.equals(this.freeTrialEndsOn, marketplacePurchase2.freeTrialEndsOn)
                && Objects.equals(this.nextBillingDate, marketplacePurchase2.nextBillingDate)
                && Objects.equals(this.onFreeTrial, marketplacePurchase2.onFreeTrial)
                && Objects.equals(this.plan, marketplacePurchase2.plan)
                && Objects.equals(this.unitCount, marketplacePurchase2.unitCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(account, billingCycle, freeTrialEndsOn, nextBillingDate, onFreeTrial, plan, unitCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketplacePurchase2 {\n");
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
