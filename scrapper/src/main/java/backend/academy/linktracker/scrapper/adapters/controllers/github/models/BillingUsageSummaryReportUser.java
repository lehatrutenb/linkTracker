package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * BillingUsageSummaryReportUser
 */
@JsonTypeName("billing-usage-summary-report-user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BillingUsageSummaryReportUser {

    private BillingPremiumRequestUsageReportOrgTimePeriod timePeriod;

    private String user;

    private Optional<String> repository = Optional.empty();

    private Optional<String> product = Optional.empty();

    private Optional<String> sku = Optional.empty();

    @Valid
    private List<@Valid BillingUsageSummaryReportOrgUsageItemsInner> usageItems = new ArrayList<>();

    public BillingUsageSummaryReportUser() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BillingUsageSummaryReportUser(
            BillingPremiumRequestUsageReportOrgTimePeriod timePeriod,
            String user,
            List<@Valid BillingUsageSummaryReportOrgUsageItemsInner> usageItems) {
        this.timePeriod = timePeriod;
        this.user = user;
        this.usageItems = usageItems;
    }

    public BillingUsageSummaryReportUser timePeriod(BillingPremiumRequestUsageReportOrgTimePeriod timePeriod) {
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

    public BillingUsageSummaryReportUser user(String user) {
        this.user = user;
        return this;
    }

    /**
     * The unique identifier of the user.
     * @return user
     */
    @NotNull
    @Schema(
            name = "user",
            description = "The unique identifier of the user.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public BillingUsageSummaryReportUser repository(String repository) {
        this.repository = Optional.ofNullable(repository);
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
    public Optional<String> getRepository() {
        return repository;
    }

    public void setRepository(Optional<String> repository) {
        this.repository = repository;
    }

    public BillingUsageSummaryReportUser product(String product) {
        this.product = Optional.ofNullable(product);
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
    public Optional<String> getProduct() {
        return product;
    }

    public void setProduct(Optional<String> product) {
        this.product = product;
    }

    public BillingUsageSummaryReportUser sku(String sku) {
        this.sku = Optional.ofNullable(sku);
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
    public Optional<String> getSku() {
        return sku;
    }

    public void setSku(Optional<String> sku) {
        this.sku = sku;
    }

    public BillingUsageSummaryReportUser usageItems(
            List<@Valid BillingUsageSummaryReportOrgUsageItemsInner> usageItems) {
        this.usageItems = usageItems;
        return this;
    }

    public BillingUsageSummaryReportUser addUsageItemsItem(BillingUsageSummaryReportOrgUsageItemsInner usageItemsItem) {
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
        BillingUsageSummaryReportUser billingUsageSummaryReportUser = (BillingUsageSummaryReportUser) o;
        return Objects.equals(this.timePeriod, billingUsageSummaryReportUser.timePeriod)
                && Objects.equals(this.user, billingUsageSummaryReportUser.user)
                && Objects.equals(this.repository, billingUsageSummaryReportUser.repository)
                && Objects.equals(this.product, billingUsageSummaryReportUser.product)
                && Objects.equals(this.sku, billingUsageSummaryReportUser.sku)
                && Objects.equals(this.usageItems, billingUsageSummaryReportUser.usageItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timePeriod, user, repository, product, sku, usageItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingUsageSummaryReportUser {\n");
        sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
