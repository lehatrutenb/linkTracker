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
 * MarketplacePurchaseMarketplacePendingChange
 */
@JsonTypeName("marketplace_purchase_marketplace_pending_change")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MarketplacePurchaseMarketplacePendingChange {

    private Boolean isInstalled;

    private String effectiveDate;

    private Long unitCount = null;

    private Long id;

    private MarketplaceListingPlan plan;

    public MarketplacePurchaseMarketplacePendingChange isInstalled(Boolean isInstalled) {
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

    public MarketplacePurchaseMarketplacePendingChange effectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
        return this;
    }

    /**
     * Get effectiveDate
     * @return effectiveDate
     */
    @Schema(name = "effective_date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("effective_date")
    public String getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(String effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public MarketplacePurchaseMarketplacePendingChange unitCount(Long unitCount) {
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

    public MarketplacePurchaseMarketplacePendingChange id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MarketplacePurchaseMarketplacePendingChange plan(MarketplaceListingPlan plan) {
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
        MarketplacePurchaseMarketplacePendingChange marketplacePurchaseMarketplacePendingChange =
                (MarketplacePurchaseMarketplacePendingChange) o;
        return Objects.equals(this.isInstalled, marketplacePurchaseMarketplacePendingChange.isInstalled)
                && Objects.equals(this.effectiveDate, marketplacePurchaseMarketplacePendingChange.effectiveDate)
                && Objects.equals(this.unitCount, marketplacePurchaseMarketplacePendingChange.unitCount)
                && Objects.equals(this.id, marketplacePurchaseMarketplacePendingChange.id)
                && Objects.equals(this.plan, marketplacePurchaseMarketplacePendingChange.plan);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isInstalled, effectiveDate, unitCount, id, plan);
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
