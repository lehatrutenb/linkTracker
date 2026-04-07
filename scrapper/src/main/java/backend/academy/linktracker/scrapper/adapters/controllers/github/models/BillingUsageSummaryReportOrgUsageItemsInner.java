package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;

/**
 * BillingUsageSummaryReportOrgUsageItemsInner
 */
@JsonTypeName("billing_usage_summary_report_org_usageItems_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BillingUsageSummaryReportOrgUsageItemsInner {

    private String product;

    private String sku;

    private String unitType;

    private BigDecimal pricePerUnit;

    private BigDecimal grossQuantity;

    private BigDecimal grossAmount;

    private BigDecimal discountQuantity;

    private BigDecimal discountAmount;

    private BigDecimal netQuantity;

    private BigDecimal netAmount;

    public BillingUsageSummaryReportOrgUsageItemsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BillingUsageSummaryReportOrgUsageItemsInner(
            String product,
            String sku,
            String unitType,
            BigDecimal pricePerUnit,
            BigDecimal grossQuantity,
            BigDecimal grossAmount,
            BigDecimal discountQuantity,
            BigDecimal discountAmount,
            BigDecimal netQuantity,
            BigDecimal netAmount) {
        this.product = product;
        this.sku = sku;
        this.unitType = unitType;
        this.pricePerUnit = pricePerUnit;
        this.grossQuantity = grossQuantity;
        this.grossAmount = grossAmount;
        this.discountQuantity = discountQuantity;
        this.discountAmount = discountAmount;
        this.netQuantity = netQuantity;
        this.netAmount = netAmount;
    }

    public BillingUsageSummaryReportOrgUsageItemsInner product(String product) {
        this.product = product;
        return this;
    }

    /**
     * Product name.
     * @return product
     */
    @NotNull
    @Schema(name = "product", description = "Product name.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("product")
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BillingUsageSummaryReportOrgUsageItemsInner sku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * SKU name.
     * @return sku
     */
    @NotNull
    @Schema(name = "sku", description = "SKU name.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BillingUsageSummaryReportOrgUsageItemsInner unitType(String unitType) {
        this.unitType = unitType;
        return this;
    }

    /**
     * Unit type of the usage line item.
     * @return unitType
     */
    @NotNull
    @Schema(
            name = "unitType",
            description = "Unit type of the usage line item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("unitType")
    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    public BillingUsageSummaryReportOrgUsageItemsInner pricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
        return this;
    }

    /**
     * Price per unit of the usage line item.
     * @return pricePerUnit
     */
    @NotNull
    @Valid
    @Schema(
            name = "pricePerUnit",
            description = "Price per unit of the usage line item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("pricePerUnit")
    public BigDecimal getPricePerUnit() {
        return pricePerUnit;
    }

    public void setPricePerUnit(BigDecimal pricePerUnit) {
        this.pricePerUnit = pricePerUnit;
    }

    public BillingUsageSummaryReportOrgUsageItemsInner grossQuantity(BigDecimal grossQuantity) {
        this.grossQuantity = grossQuantity;
        return this;
    }

    /**
     * Gross quantity of the usage line item.
     * @return grossQuantity
     */
    @NotNull
    @Valid
    @Schema(
            name = "grossQuantity",
            description = "Gross quantity of the usage line item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("grossQuantity")
    public BigDecimal getGrossQuantity() {
        return grossQuantity;
    }

    public void setGrossQuantity(BigDecimal grossQuantity) {
        this.grossQuantity = grossQuantity;
    }

    public BillingUsageSummaryReportOrgUsageItemsInner grossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
        return this;
    }

    /**
     * Gross amount of the usage line item.
     * @return grossAmount
     */
    @NotNull
    @Valid
    @Schema(
            name = "grossAmount",
            description = "Gross amount of the usage line item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("grossAmount")
    public BigDecimal getGrossAmount() {
        return grossAmount;
    }

    public void setGrossAmount(BigDecimal grossAmount) {
        this.grossAmount = grossAmount;
    }

    public BillingUsageSummaryReportOrgUsageItemsInner discountQuantity(BigDecimal discountQuantity) {
        this.discountQuantity = discountQuantity;
        return this;
    }

    /**
     * Discount quantity of the usage line item.
     * @return discountQuantity
     */
    @NotNull
    @Valid
    @Schema(
            name = "discountQuantity",
            description = "Discount quantity of the usage line item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("discountQuantity")
    public BigDecimal getDiscountQuantity() {
        return discountQuantity;
    }

    public void setDiscountQuantity(BigDecimal discountQuantity) {
        this.discountQuantity = discountQuantity;
    }

    public BillingUsageSummaryReportOrgUsageItemsInner discountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
        return this;
    }

    /**
     * Discount amount of the usage line item.
     * @return discountAmount
     */
    @NotNull
    @Valid
    @Schema(
            name = "discountAmount",
            description = "Discount amount of the usage line item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("discountAmount")
    public BigDecimal getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(BigDecimal discountAmount) {
        this.discountAmount = discountAmount;
    }

    public BillingUsageSummaryReportOrgUsageItemsInner netQuantity(BigDecimal netQuantity) {
        this.netQuantity = netQuantity;
        return this;
    }

    /**
     * Net quantity of the usage line item.
     * @return netQuantity
     */
    @NotNull
    @Valid
    @Schema(
            name = "netQuantity",
            description = "Net quantity of the usage line item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("netQuantity")
    public BigDecimal getNetQuantity() {
        return netQuantity;
    }

    public void setNetQuantity(BigDecimal netQuantity) {
        this.netQuantity = netQuantity;
    }

    public BillingUsageSummaryReportOrgUsageItemsInner netAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
        return this;
    }

    /**
     * Net amount of the usage line item.
     * @return netAmount
     */
    @NotNull
    @Valid
    @Schema(
            name = "netAmount",
            description = "Net amount of the usage line item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("netAmount")
    public BigDecimal getNetAmount() {
        return netAmount;
    }

    public void setNetAmount(BigDecimal netAmount) {
        this.netAmount = netAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingUsageSummaryReportOrgUsageItemsInner billingUsageSummaryReportOrgUsageItemsInner =
                (BillingUsageSummaryReportOrgUsageItemsInner) o;
        return Objects.equals(this.product, billingUsageSummaryReportOrgUsageItemsInner.product)
                && Objects.equals(this.sku, billingUsageSummaryReportOrgUsageItemsInner.sku)
                && Objects.equals(this.unitType, billingUsageSummaryReportOrgUsageItemsInner.unitType)
                && Objects.equals(this.pricePerUnit, billingUsageSummaryReportOrgUsageItemsInner.pricePerUnit)
                && Objects.equals(this.grossQuantity, billingUsageSummaryReportOrgUsageItemsInner.grossQuantity)
                && Objects.equals(this.grossAmount, billingUsageSummaryReportOrgUsageItemsInner.grossAmount)
                && Objects.equals(this.discountQuantity, billingUsageSummaryReportOrgUsageItemsInner.discountQuantity)
                && Objects.equals(this.discountAmount, billingUsageSummaryReportOrgUsageItemsInner.discountAmount)
                && Objects.equals(this.netQuantity, billingUsageSummaryReportOrgUsageItemsInner.netQuantity)
                && Objects.equals(this.netAmount, billingUsageSummaryReportOrgUsageItemsInner.netAmount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                product,
                sku,
                unitType,
                pricePerUnit,
                grossQuantity,
                grossAmount,
                discountQuantity,
                discountAmount,
                netQuantity,
                netAmount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingUsageSummaryReportOrgUsageItemsInner {\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
        sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
        sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
        sb.append("    grossQuantity: ").append(toIndentedString(grossQuantity)).append("\n");
        sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
        sb.append("    discountQuantity: ")
                .append(toIndentedString(discountQuantity))
                .append("\n");
        sb.append("    discountAmount: ")
                .append(toIndentedString(discountAmount))
                .append("\n");
        sb.append("    netQuantity: ").append(toIndentedString(netQuantity)).append("\n");
        sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
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
