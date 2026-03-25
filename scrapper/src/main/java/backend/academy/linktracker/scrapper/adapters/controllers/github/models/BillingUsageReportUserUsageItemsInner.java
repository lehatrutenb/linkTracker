package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.Objects;

/**
 * BillingUsageReportUserUsageItemsInner
 */
@JsonTypeName("billing_usage_report_user_usageItems_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BillingUsageReportUserUsageItemsInner {

    private String date;

    private String product;

    private String sku;

    private Long quantity;

    private String unitType;

    private BigDecimal pricePerUnit;

    private BigDecimal grossAmount;

    private BigDecimal discountAmount;

    private BigDecimal netAmount;

    private String repositoryName;

    public BillingUsageReportUserUsageItemsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BillingUsageReportUserUsageItemsInner(
            String date,
            String product,
            String sku,
            Long quantity,
            String unitType,
            BigDecimal pricePerUnit,
            BigDecimal grossAmount,
            BigDecimal discountAmount,
            BigDecimal netAmount) {
        this.date = date;
        this.product = product;
        this.sku = sku;
        this.quantity = quantity;
        this.unitType = unitType;
        this.pricePerUnit = pricePerUnit;
        this.grossAmount = grossAmount;
        this.discountAmount = discountAmount;
        this.netAmount = netAmount;
    }

    public BillingUsageReportUserUsageItemsInner date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Date of the usage line item.
     * @return date
     */
    @NotNull
    @Schema(name = "date", description = "Date of the usage line item.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public BillingUsageReportUserUsageItemsInner product(String product) {
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

    public BillingUsageReportUserUsageItemsInner sku(String sku) {
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

    public BillingUsageReportUserUsageItemsInner quantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Quantity of the usage line item.
     * @return quantity
     */
    @NotNull
    @Schema(
            name = "quantity",
            description = "Quantity of the usage line item.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("quantity")
    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public BillingUsageReportUserUsageItemsInner unitType(String unitType) {
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

    public BillingUsageReportUserUsageItemsInner pricePerUnit(BigDecimal pricePerUnit) {
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

    public BillingUsageReportUserUsageItemsInner grossAmount(BigDecimal grossAmount) {
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

    public BillingUsageReportUserUsageItemsInner discountAmount(BigDecimal discountAmount) {
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

    public BillingUsageReportUserUsageItemsInner netAmount(BigDecimal netAmount) {
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

    public BillingUsageReportUserUsageItemsInner repositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
        return this;
    }

    /**
     * Name of the repository.
     * @return repositoryName
     */
    @Schema(
            name = "repositoryName",
            description = "Name of the repository.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repositoryName")
    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingUsageReportUserUsageItemsInner billingUsageReportUserUsageItemsInner =
                (BillingUsageReportUserUsageItemsInner) o;
        return Objects.equals(this.date, billingUsageReportUserUsageItemsInner.date)
                && Objects.equals(this.product, billingUsageReportUserUsageItemsInner.product)
                && Objects.equals(this.sku, billingUsageReportUserUsageItemsInner.sku)
                && Objects.equals(this.quantity, billingUsageReportUserUsageItemsInner.quantity)
                && Objects.equals(this.unitType, billingUsageReportUserUsageItemsInner.unitType)
                && Objects.equals(this.pricePerUnit, billingUsageReportUserUsageItemsInner.pricePerUnit)
                && Objects.equals(this.grossAmount, billingUsageReportUserUsageItemsInner.grossAmount)
                && Objects.equals(this.discountAmount, billingUsageReportUserUsageItemsInner.discountAmount)
                && Objects.equals(this.netAmount, billingUsageReportUserUsageItemsInner.netAmount)
                && Objects.equals(this.repositoryName, billingUsageReportUserUsageItemsInner.repositoryName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                date,
                product,
                sku,
                quantity,
                unitType,
                pricePerUnit,
                grossAmount,
                discountAmount,
                netAmount,
                repositoryName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingUsageReportUserUsageItemsInner {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
        sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
        sb.append("    unitType: ").append(toIndentedString(unitType)).append("\n");
        sb.append("    pricePerUnit: ").append(toIndentedString(pricePerUnit)).append("\n");
        sb.append("    grossAmount: ").append(toIndentedString(grossAmount)).append("\n");
        sb.append("    discountAmount: ")
                .append(toIndentedString(discountAmount))
                .append("\n");
        sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
        sb.append("    repositoryName: ")
                .append(toIndentedString(repositoryName))
                .append("\n");
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
