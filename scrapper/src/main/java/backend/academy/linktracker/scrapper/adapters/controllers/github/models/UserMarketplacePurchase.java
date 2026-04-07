package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * User Marketplace Purchase
 */
@Schema(name = "user-marketplace-purchase", description = "User Marketplace Purchase")
@JsonTypeName("user-marketplace-purchase")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UserMarketplacePurchase {

    private String billingCycle;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> nextBillingDate = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<Long> unitCount = JsonNullable.<Long>undefined();

    private Boolean onFreeTrial;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> freeTrialEndsOn = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    private MarketplaceAccount account;

    private MarketplaceListingPlan plan;

    public UserMarketplacePurchase() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UserMarketplacePurchase(
            String billingCycle,
            OffsetDateTime nextBillingDate,
            Long unitCount,
            Boolean onFreeTrial,
            OffsetDateTime freeTrialEndsOn,
            OffsetDateTime updatedAt,
            MarketplaceAccount account,
            MarketplaceListingPlan plan) {
        this.billingCycle = billingCycle;
        this.nextBillingDate = JsonNullable.of(nextBillingDate);
        this.unitCount = JsonNullable.of(unitCount);
        this.onFreeTrial = onFreeTrial;
        this.freeTrialEndsOn = JsonNullable.of(freeTrialEndsOn);
        this.updatedAt = JsonNullable.of(updatedAt);
        this.account = account;
        this.plan = plan;
    }

    public UserMarketplacePurchase billingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
        return this;
    }

    /**
     * Get billingCycle
     * @return billingCycle
     */
    @NotNull
    @Schema(name = "billing_cycle", example = "monthly", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("billing_cycle")
    public String getBillingCycle() {
        return billingCycle;
    }

    public void setBillingCycle(String billingCycle) {
        this.billingCycle = billingCycle;
    }

    public UserMarketplacePurchase nextBillingDate(OffsetDateTime nextBillingDate) {
        this.nextBillingDate = JsonNullable.of(nextBillingDate);
        return this;
    }

    /**
     * Get nextBillingDate
     * @return nextBillingDate
     */
    @NotNull
    @Valid
    @Schema(name = "next_billing_date", example = "2017-11-11T00:00Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("next_billing_date")
    public JsonNullable<OffsetDateTime> getNextBillingDate() {
        return nextBillingDate;
    }

    public void setNextBillingDate(JsonNullable<OffsetDateTime> nextBillingDate) {
        this.nextBillingDate = nextBillingDate;
    }

    public UserMarketplacePurchase unitCount(Long unitCount) {
        this.unitCount = JsonNullable.of(unitCount);
        return this;
    }

    /**
     * Get unitCount
     * @return unitCount
     */
    @NotNull
    @Schema(name = "unit_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("unit_count")
    public JsonNullable<Long> getUnitCount() {
        return unitCount;
    }

    public void setUnitCount(JsonNullable<Long> unitCount) {
        this.unitCount = unitCount;
    }

    public UserMarketplacePurchase onFreeTrial(Boolean onFreeTrial) {
        this.onFreeTrial = onFreeTrial;
        return this;
    }

    /**
     * Get onFreeTrial
     * @return onFreeTrial
     */
    @NotNull
    @Schema(name = "on_free_trial", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("on_free_trial")
    public Boolean getOnFreeTrial() {
        return onFreeTrial;
    }

    public void setOnFreeTrial(Boolean onFreeTrial) {
        this.onFreeTrial = onFreeTrial;
    }

    public UserMarketplacePurchase freeTrialEndsOn(OffsetDateTime freeTrialEndsOn) {
        this.freeTrialEndsOn = JsonNullable.of(freeTrialEndsOn);
        return this;
    }

    /**
     * Get freeTrialEndsOn
     * @return freeTrialEndsOn
     */
    @NotNull
    @Valid
    @Schema(name = "free_trial_ends_on", example = "2017-11-11T00:00Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("free_trial_ends_on")
    public JsonNullable<OffsetDateTime> getFreeTrialEndsOn() {
        return freeTrialEndsOn;
    }

    public void setFreeTrialEndsOn(JsonNullable<OffsetDateTime> freeTrialEndsOn) {
        this.freeTrialEndsOn = freeTrialEndsOn;
    }

    public UserMarketplacePurchase updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2017-11-02T01:12:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserMarketplacePurchase account(MarketplaceAccount account) {
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
    public MarketplaceAccount getAccount() {
        return account;
    }

    public void setAccount(MarketplaceAccount account) {
        this.account = account;
    }

    public UserMarketplacePurchase plan(MarketplaceListingPlan plan) {
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
        UserMarketplacePurchase userMarketplacePurchase = (UserMarketplacePurchase) o;
        return Objects.equals(this.billingCycle, userMarketplacePurchase.billingCycle)
                && Objects.equals(this.nextBillingDate, userMarketplacePurchase.nextBillingDate)
                && Objects.equals(this.unitCount, userMarketplacePurchase.unitCount)
                && Objects.equals(this.onFreeTrial, userMarketplacePurchase.onFreeTrial)
                && Objects.equals(this.freeTrialEndsOn, userMarketplacePurchase.freeTrialEndsOn)
                && Objects.equals(this.updatedAt, userMarketplacePurchase.updatedAt)
                && Objects.equals(this.account, userMarketplacePurchase.account)
                && Objects.equals(this.plan, userMarketplacePurchase.plan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                billingCycle, nextBillingDate, unitCount, onFreeTrial, freeTrialEndsOn, updatedAt, account, plan);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserMarketplacePurchase {\n");
        sb.append("    billingCycle: ").append(toIndentedString(billingCycle)).append("\n");
        sb.append("    nextBillingDate: ")
                .append(toIndentedString(nextBillingDate))
                .append("\n");
        sb.append("    unitCount: ").append(toIndentedString(unitCount)).append("\n");
        sb.append("    onFreeTrial: ").append(toIndentedString(onFreeTrial)).append("\n");
        sb.append("    freeTrialEndsOn: ")
                .append(toIndentedString(freeTrialEndsOn))
                .append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
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
