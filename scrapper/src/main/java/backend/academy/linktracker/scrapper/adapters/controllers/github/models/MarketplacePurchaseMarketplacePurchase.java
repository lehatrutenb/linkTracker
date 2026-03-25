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
 * MarketplacePurchaseMarketplacePurchase
 */
@JsonTypeName("marketplace_purchase_marketplace_purchase")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MarketplacePurchaseMarketplacePurchase {

    private String billingCycle;

    private String nextBillingDate = null;

    private Boolean isInstalled;

    private Long unitCount = null;

    private Boolean onFreeTrial;

    private String freeTrialEndsOn = null;

    private String updatedAt;

    private MarketplaceListingPlan plan;

    public MarketplacePurchaseMarketplacePurchase billingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }

    /**
     * Get billingCycle
     * @return billingCycle
     */
    @Schema(name = "billing_cycle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("billing_cycle")
    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public MarketplacePurchaseMarketplacePurchase nextBillingDate(String nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
        return this;
    }

    /**
     * Get nextBillingDate
     * @return nextBillingDate
     */
    @Schema(name = "next_billing_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("next_billing_date")
    public String getNextBillingDate() {
        return nextBillingDate;
    }

    public void setNextBillingDate(String nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    public MarketplacePurchaseMarketplacePurchase isInstalled(Boolean isInstalled) {
        this.isInstalled = isInstalled;
        return this;
    }

    /**
     * Get isInstalled
     * @return isInstalled
     */
    @Schema(name = "is_installed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_installed")
    public Boolean getIsInstalled() {
        return isInstalled;
    }

    public void setIsInstalled(Boolean isInstalled) {
        this.isInstalled = isInstalled;
    }

    public MarketplacePurchaseMarketplacePurchase unitCount(Long unitCount) {
        this.unitCount = unitCount;
        return this;
    }

    /**
     * Get unitCount
     * @return unitCount
     */
    @Schema(name = "unit_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("unit_count")
    public Long getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(Long unitCount) {
        this.unitCount = unitCount;
    }

    public MarketplacePurchaseMarketplacePurchase onFreeTrial(Boolean onFreeTrial) {
        this.onFreeTrial = onFreeTrial;
        return this;
    }

    /**
     * Get onFreeTrial
     * @return onFreeTrial
     */
    @Schema(name = "on_free_trial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("on_free_trial")
    public Boolean getOnFreeTrial() {
        return onFreeTrial;
    }

    public void setOnFreeTrial(Boolean onFreeTrial) {
        this.onFreeTrial = onFreeTrial;
    }

    public MarketplacePurchaseMarketplacePurchase freeTrialEndsOn(String freeTrialEndsOn) {
        this.freeTrialEndsOn = freeTrialEndsOn;
        return this;
    }

    /**
     * Get freeTrialEndsOn
     * @return freeTrialEndsOn
     */
    @Schema(name = "free_trial_ends_on", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("free_trial_ends_on")
    public String getFreeTrialEndsOn() {
        return freeTrialEndsOn;
    }

    public void setFreeTrialEndsOn(String freeTrialEndsOn) {
        this.freeTrialEndsOn = freeTrialEndsOn;
    }

    public MarketplacePurchaseMarketplacePurchase updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public MarketplacePurchaseMarketplacePurchase plan(MarketplaceListingPlan plan) {
        this.plan = plan;
        return this;
    }

    /**
     * Get plan
     * @return plan
     */
    @Valid
    @Schema(name = "plan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("plan")
    public MarketplaceListingPlan getPlan() {
        return plan;
    }

    public void setPlan(MarketplaceListingPlan plan) {
        this.plan = plan;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketplacePurchaseMarketplacePurchase marketplacePurchaseMarketplacePurchase =
                (MarketplacePurchaseMarketplacePurchase) o;
        return Objects.equals(this.billingCycle, marketplacePurchaseMarketplacePurchase.billingCycle)
                && Objects.equals(this.nextBillingDate, marketplacePurchaseMarketplacePurchase.nextBillingDate)
                && Objects.equals(this.isInstalled, marketplacePurchaseMarketplacePurchase.isInstalled)
                && Objects.equals(this.unitCount, marketplacePurchaseMarketplacePurchase.unitCount)
                && Objects.equals(this.onFreeTrial, marketplacePurchaseMarketplacePurchase.onFreeTrial)
                && Objects.equals(this.freeTrialEndsOn, marketplacePurchaseMarketplacePurchase.freeTrialEndsOn)
                && Objects.equals(this.updatedAt, marketplacePurchaseMarketplacePurchase.updatedAt)
                && Objects.equals(this.plan, marketplacePurchaseMarketplacePurchase.plan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                billingCycle, nextBillingDate, isInstalled, unitCount, onFreeTrial, freeTrialEndsOn, updatedAt, plan);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MarketplacePurchaseMarketplacePurchase {\n");
        sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
        sb.append("    nextBillingDate: ")
                .append(toIndentedString(nextBillingDate))
                .append("\n");
        sb.append("    isInstalled: ").append(toIndentedString(isInstalled)).append("\n");
        sb.append("    unitCount: ").append(toIndentedString(unitCount)).append("\n");
        sb.append("    onFreeTrial: ").append(toIndentedString(onFreeTrial)).append("\n");
        sb.append("    freeTrialEndsOn: ")
                .append(toIndentedString(freeTrialEndsOn))
                .append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
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
