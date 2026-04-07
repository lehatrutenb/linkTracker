package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MarketplacePurchaseMarketplacePurchase
 */
@JsonTypeName("marketplace_purchase_marketplace_purchase")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MarketplacePurchaseMarketplacePurchase {

    private Optional<String> billingCycle = Optional.empty();

    private JsonNullable<String> nextBillingDate = JsonNullable.<String>undefined();

    private Optional<Boolean> isInstalled = Optional.empty();

    private JsonNullable<Long> unitCount = JsonNullable.<Long>undefined();

    private Optional<Boolean> onFreeTrial = Optional.empty();

    private JsonNullable<String> freeTrialEndsOn = JsonNullable.<String>undefined();

    private Optional<String> updatedAt = Optional.empty();

    private Optional<MarketplaceListingPlan> plan = Optional.empty();

    public MarketplacePurchaseMarketplacePurchase billingCycle(String billingCycle) {
        this.billingCycle = Optional.ofNullable(billingCycle);
        return this;
    }

    /**
     * Get billingCycle
     * @return billingCycle
     */
    @Schema(name = "billing_cycle", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("billing_cycle")
    public Optional<String> getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(Optional<String> billingCycle) {
        this.billingCycle = billingCycle;
    }

    public MarketplacePurchaseMarketplacePurchase nextBillingDate(String nextBillingDate) {
        this.nextBillingDate = JsonNullable.of(nextBillingDate);
        return this;
    }

    /**
     * Get nextBillingDate
     * @return nextBillingDate
     */
    @Schema(name = "next_billing_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("next_billing_date")
    public JsonNullable<String> getNextBillingDate() {
        return nextBillingDate;
    }

    public void setNextBillingDate(JsonNullable<String> nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    public MarketplacePurchaseMarketplacePurchase isInstalled(Boolean isInstalled) {
        this.isInstalled = Optional.ofNullable(isInstalled);
        return this;
    }

    /**
     * Get isInstalled
     * @return isInstalled
     */
    @Schema(name = "is_installed", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_installed")
    public Optional<Boolean> getIsInstalled() {
        return isInstalled;
    }

    public void setIsInstalled(Optional<Boolean> isInstalled) {
        this.isInstalled = isInstalled;
    }

    public MarketplacePurchaseMarketplacePurchase unitCount(Long unitCount) {
        this.unitCount = JsonNullable.of(unitCount);
        return this;
    }

    /**
     * Get unitCount
     * @return unitCount
     */
    @Schema(name = "unit_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("unit_count")
    public JsonNullable<Long> getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(JsonNullable<Long> unitCount) {
        this.unitCount = unitCount;
    }

    public MarketplacePurchaseMarketplacePurchase onFreeTrial(Boolean onFreeTrial) {
        this.onFreeTrial = Optional.ofNullable(onFreeTrial);
        return this;
    }

    /**
     * Get onFreeTrial
     * @return onFreeTrial
     */
    @Schema(name = "on_free_trial", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("on_free_trial")
    public Optional<Boolean> getOnFreeTrial() {
        return onFreeTrial;
    }

    public void setOnFreeTrial(Optional<Boolean> onFreeTrial) {
        this.onFreeTrial = onFreeTrial;
    }

    public MarketplacePurchaseMarketplacePurchase freeTrialEndsOn(String freeTrialEndsOn) {
        this.freeTrialEndsOn = JsonNullable.of(freeTrialEndsOn);
        return this;
    }

    /**
     * Get freeTrialEndsOn
     * @return freeTrialEndsOn
     */
    @Schema(name = "free_trial_ends_on", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("free_trial_ends_on")
    public JsonNullable<String> getFreeTrialEndsOn() {
        return freeTrialEndsOn;
    }

    public void setFreeTrialEndsOn(JsonNullable<String> freeTrialEndsOn) {
        this.freeTrialEndsOn = freeTrialEndsOn;
    }

    public MarketplacePurchaseMarketplacePurchase updatedAt(String updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<String> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public MarketplacePurchaseMarketplacePurchase plan(MarketplaceListingPlan plan) {
        this.plan = Optional.ofNullable(plan);
        return this;
    }

    /**
     * Get plan
     * @return plan
     */
    @Valid
    @Schema(name = "plan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("plan")
    public Optional<MarketplaceListingPlan> getPlan() {
        return plan;
    }

    public void setPlan(Optional<MarketplaceListingPlan> plan) {
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
                && equalsNullable(this.nextBillingDate, marketplacePurchaseMarketplacePurchase.nextBillingDate)
                && Objects.equals(this.isInstalled, marketplacePurchaseMarketplacePurchase.isInstalled)
                && equalsNullable(this.unitCount, marketplacePurchaseMarketplacePurchase.unitCount)
                && Objects.equals(this.onFreeTrial, marketplacePurchaseMarketplacePurchase.onFreeTrial)
                && equalsNullable(this.freeTrialEndsOn, marketplacePurchaseMarketplacePurchase.freeTrialEndsOn)
                && Objects.equals(this.updatedAt, marketplacePurchaseMarketplacePurchase.updatedAt)
                && Objects.equals(this.plan, marketplacePurchaseMarketplacePurchase.plan);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                billingCycle,
                hashCodeNullable(nextBillingDate),
                isInstalled,
                hashCodeNullable(unitCount),
                onFreeTrial,
                hashCodeNullable(freeTrialEndsOn),
                updatedAt,
                plan);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
