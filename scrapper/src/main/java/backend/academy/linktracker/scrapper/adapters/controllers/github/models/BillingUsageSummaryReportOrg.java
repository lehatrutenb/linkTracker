package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * BillingUsageSummaryReportOrg
 */
@JsonTypeName("billing-usage-summary-report-org")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BillingUsageSummaryReportOrg {

    private BillingPremiumRequestUsageReportOrgTimePeriod timePeriod;

    private String organization;

    private String repository;

    private String product;

    private String sku;

    @Valid
    private List<@Valid BillingUsageSummaryReportOrgUsageItemsInner> usageItems = new ArrayList<>();

    public BillingUsageSummaryReportOrg() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BillingUsageSummaryReportOrg(
            BillingPremiumRequestUsageReportOrgTimePeriod timePeriod,
            String organization,
            List<@Valid BillingUsageSummaryReportOrgUsageItemsInner> usageItems) {
        this.timePeriod = timePeriod;
        this.organization = organization;
        this.usageItems = usageItems;
    }

    public BillingUsageSummaryReportOrg timePeriod(BillingPremiumRequestUsageReportOrgTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
        return this;
    }

    /**
     * Get timePeriod
     * @return timePeriod
     */
    @NotNull
    @Valid
    @Schema(name = "timePeriod", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("timePeriod")
    public BillingPremiumRequestUsageReportOrgTimePeriod getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(BillingPremiumRequestUsageReportOrgTimePeriod timePeriod) {
        this.timePeriod = timePeriod;
    }

    public BillingUsageSummaryReportOrg organization(String organization) {
        this.organization = organization;
        return this;
    }

    /**
     * The unique identifier of the organization.
     * @return organization
     */
    @NotNull
    @Schema(
            name = "organization",
            description = "The unique identifier of the organization.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organization")
    public String getOrganization() {
        return organization;
    }

    public void setOrganization(String organization) {
        this.organization = organization;
    }

    public BillingUsageSummaryReportOrg repository(String repository) {
        this.repository = repository;
        return this;
    }

    /**
     * The name of the repository for the usage report.
     * @return repository
     */
    @Schema(
            name = "repository",
            description = "The name of the repository for the usage report.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repository")
    public String getRepository() {
        return repository;
    }

    public void setRepository(String repository) {
        this.repository = repository;
    }

    public BillingUsageSummaryReportOrg product(String product) {
        this.product = product;
        return this;
    }

    /**
     * The product for the usage report.
     * @return product
     */
    @Schema(
            name = "product",
            description = "The product for the usage report.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("product")
    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BillingUsageSummaryReportOrg sku(String sku) {
        this.sku = sku;
        return this;
    }

    /**
     * The SKU for the usage report.
     * @return sku
     */
    @Schema(
            name = "sku",
            description = "The SKU for the usage report.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("sku")
    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public BillingUsageSummaryReportOrg usageItems(
            List<@Valid BillingUsageSummaryReportOrgUsageItemsInner> usageItems) {
        this.usageItems = usageItems;
        return this;
    }

    public BillingUsageSummaryReportOrg addUsageItemsItem(BillingUsageSummaryReportOrgUsageItemsInner usageItemsItem) {
        if (this.usageItems == null) {
            this.usageItems = new ArrayList<>();
        }
        this.usageItems.add(usageItemsItem);
        return this;
    }

    /**
     * Get usageItems
     * @return usageItems
     */
    @NotNull
    @Valid
    @Schema(name = "usageItems", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("usageItems")
    public List<@Valid BillingUsageSummaryReportOrgUsageItemsInner> getUsageItems() {
        return usageItems;
    }

    public void setUsageItems(List<@Valid BillingUsageSummaryReportOrgUsageItemsInner> usageItems) {
        this.usageItems = usageItems;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingUsageSummaryReportOrg billingUsageSummaryReportOrg = (BillingUsageSummaryReportOrg) o;
        return Objects.equals(this.timePeriod, billingUsageSummaryReportOrg.timePeriod)
                && Objects.equals(this.organization, billingUsageSummaryReportOrg.organization)
                && Objects.equals(this.repository, billingUsageSummaryReportOrg.repository)
                && Objects.equals(this.product, billingUsageSummaryReportOrg.product)
                && Objects.equals(this.sku, billingUsageSummaryReportOrg.sku)
                && Objects.equals(this.usageItems, billingUsageSummaryReportOrg.usageItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timePeriod, organization, repository, product, sku, usageItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingUsageSummaryReportOrg {\n");
        sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
        sb.append("    organization: ").append(toIndentedString(organization)).append("\n");
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
        sb.append("    usageItems: ").append(toIndentedString(usageItems)).append("\n");
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
