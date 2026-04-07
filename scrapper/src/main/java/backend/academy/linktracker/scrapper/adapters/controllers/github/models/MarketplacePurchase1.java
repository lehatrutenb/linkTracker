package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * MarketplacePurchase1
 */
@JsonTypeName("Marketplace_Purchase_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MarketplacePurchase1 {

    private WebhooksMarketplacePurchaseAccount account;

    private String billingCycle;

    private JsonNullable<String> freeTrialEndsOn = JsonNullable.<String>undefined();

    private JsonNullable<String> nextBillingDate = JsonNullable.<String>undefined();

    private Boolean onFreeTrial;

    private WebhooksPreviousMarketplacePurchasePlan plan;

    private Long unitCount;

    public MarketplacePurchase1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public MarketplacePurchase1(
            WebhooksMarketplacePurchaseAccount account,
            String billingCycle,
            String freeTrialEndsOn,
            Boolean onFreeTrial,
            WebhooksPreviousMarketplacePurchasePlan plan,
            Long unitCount) {
        this.account = account;
        this.billingCycle = billingCycle;
        this.freeTrialEndsOn = JsonNullable.of(freeTrialEndsOn);
        this.onFreeTrial = onFreeTrial;
        this.plan = plan;
        this.unitCount = unitCount;
    }

    public MarketplacePurchase1 account(WebhooksMarketplacePurchaseAccount account) {
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

    public MarketplacePurchase1 billingCycle(String billingCycle) {
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

    public MarketplacePurchase1 freeTrialEndsOn(String freeTrialEndsOn) {
        this.freeTrialEndsOn = JsonNullable.of(freeTrialEndsOn);
        return this;
    }

    /**
     * Get freeTrialEndsOn
     * @return freeTrialEndsOn
     */
    @NotNull
    @Schema(name = "free_trial_ends_on", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("free_trial_ends_on")
    public JsonNullable<String> getFreeTrialEndsOn() {
        return freeTrialEndsOn;
    }

    public void setFreeTrialEndsOn(JsonNullable<String> freeTrialEndsOn) {
        this.freeTrialEndsOn = freeTrialEndsOn;
    }

    public MarketplacePurchase1 nextBillingDate(String nextBillingDate) {
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

    public MarketplacePurchase1 onFreeTrial(Boolean onFreeTrial) {
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

    public MarketplacePurchase1 plan(WebhooksPreviousMarketplacePurchasePlan plan) {
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

    public MarketplacePurchase1 unitCount(Long unitCount) {
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
        MarketplacePurchase1 marketplacePurchase1 = (MarketplacePurchase1) o;
        return Objects.equals(this.account, marketplacePurchase1.account)
                && Objects.equals(this.billingCycle, marketplacePurchase1.billingCycle)
                && Objects.equals(this.freeTrialEndsOn, marketplacePurchase1.freeTrialEndsOn)
                && equalsNullable(this.nextBillingDate, marketplacePurchase1.nextBillingDate)
                && Objects.equals(this.onFreeTrial, marketplacePurchase1.onFreeTrial)
                && Objects.equals(this.plan, marketplacePurchase1.plan)
                && Objects.equals(this.unitCount, marketplacePurchase1.unitCount);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                account,
                billingCycle,
                freeTrialEndsOn,
                hashCodeNullable(nextBillingDate),
                onFreeTrial,
                plan,
                unitCount);
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
        sb.append("class MarketplacePurchase1 {\n");
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
