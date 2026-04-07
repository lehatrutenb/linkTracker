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
 * MarketplacePurchaseMarketplacePendingChange
 */
@JsonTypeName("marketplace_purchase_marketplace_pending_change")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MarketplacePurchaseMarketplacePendingChange {

    private Optional<Boolean> isInstalled = Optional.empty();

    private Optional<String> effectiveDate = Optional.empty();

    private JsonNullable<Long> unitCount = JsonNullable.<Long>undefined();

    private Optional<Long> id = Optional.empty();

    private Optional<MarketplaceListingPlan> plan = Optional.empty();

    public MarketplacePurchaseMarketplacePendingChange isInstalled(Boolean isInstalled) {
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

    public MarketplacePurchaseMarketplacePendingChange effectiveDate(String effectiveDate) {
        this.effectiveDate = Optional.ofNullable(effectiveDate);
        return this;
    }

    /**
     * Get effectiveDate
     * @return effectiveDate
     */
    @Schema(name = "effective_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("effective_date")
    public Optional<String> getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Optional<String> effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public MarketplacePurchaseMarketplacePendingChange unitCount(Long unitCount) {
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

    public MarketplacePurchaseMarketplacePendingChange id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public MarketplacePurchaseMarketplacePendingChange plan(MarketplaceListingPlan plan) {
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
        MarketplacePurchaseMarketplacePendingChange marketplacePurchaseMarketplacePendingChange =
                (MarketplacePurchaseMarketplacePendingChange) o;
        return Objects.equals(this.isInstalled, marketplacePurchaseMarketplacePendingChange.isInstalled)
                && Objects.equals(this.effectiveDate, marketplacePurchaseMarketplacePendingChange.effectiveDate)
                && equalsNullable(this.unitCount, marketplacePurchaseMarketplacePendingChange.unitCount)
                && Objects.equals(this.id, marketplacePurchaseMarketplacePendingChange.id)
                && Objects.equals(this.plan, marketplacePurchaseMarketplacePendingChange.plan);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(isInstalled, effectiveDate, hashCodeNullable(unitCount), id, plan);
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
        sb.append("class MarketplacePurchaseMarketplacePendingChange {\n");
        sb.append("    isInstalled: ").append(toIndentedString(isInstalled)).append("\n");
        sb.append("    effectiveDate: ").append(toIndentedString(effectiveDate)).append("\n");
        sb.append("    unitCount: ").append(toIndentedString(unitCount)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
