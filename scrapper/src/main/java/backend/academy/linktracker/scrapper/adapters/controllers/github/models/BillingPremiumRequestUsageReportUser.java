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
 * BillingPremiumRequestUsageReportUser
 */
@JsonTypeName("billing-premium-request-usage-report-user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BillingPremiumRequestUsageReportUser {

    private BillingPremiumRequestUsageReportOrgTimePeriod timePeriod;

    private String user;

    private Optional<String> product = Optional.empty();

    private Optional<String> model = Optional.empty();

    @Valid
    private List<@Valid BillingPremiumRequestUsageReportOrgUsageItemsInner> usageItems = new ArrayList<>();

    public BillingPremiumRequestUsageReportUser() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BillingPremiumRequestUsageReportUser(
            BillingPremiumRequestUsageReportOrgTimePeriod timePeriod,
            String user,
            List<@Valid BillingPremiumRequestUsageReportOrgUsageItemsInner> usageItems) {
        this.timePeriod = timePeriod;
        this.user = user;
        this.usageItems = usageItems;
    }

    public BillingPremiumRequestUsageReportUser timePeriod(BillingPremiumRequestUsageReportOrgTimePeriod timePeriod) {
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

    public BillingPremiumRequestUsageReportUser user(String user) {
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

    public BillingPremiumRequestUsageReportUser product(String product) {
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

    public BillingPremiumRequestUsageReportUser model(String model) {
        this.model = Optional.ofNullable(model);
        return this;
    }

    /**
     * The model for the usage report.
     * @return model
     */
    @Schema(
            name = "model",
            description = "The model for the usage report.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("model")
    public Optional<String> getModel() {
        return model;
    }

    public void setModel(Optional<String> model) {
        this.model = model;
    }

    public BillingPremiumRequestUsageReportUser usageItems(
            List<@Valid BillingPremiumRequestUsageReportOrgUsageItemsInner> usageItems) {
        this.usageItems = usageItems;
        return this;
    }

    public BillingPremiumRequestUsageReportUser addUsageItemsItem(
            BillingPremiumRequestUsageReportOrgUsageItemsInner usageItemsItem) {
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
    public List<@Valid BillingPremiumRequestUsageReportOrgUsageItemsInner> getUsageItems() {
        return usageItems;
    }

    public void setUsageItems(List<@Valid BillingPremiumRequestUsageReportOrgUsageItemsInner> usageItems) {
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
        BillingPremiumRequestUsageReportUser billingPremiumRequestUsageReportUser =
                (BillingPremiumRequestUsageReportUser) o;
        return Objects.equals(this.timePeriod, billingPremiumRequestUsageReportUser.timePeriod)
                && Objects.equals(this.user, billingPremiumRequestUsageReportUser.user)
                && Objects.equals(this.product, billingPremiumRequestUsageReportUser.product)
                && Objects.equals(this.model, billingPremiumRequestUsageReportUser.model)
                && Objects.equals(this.usageItems, billingPremiumRequestUsageReportUser.usageItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timePeriod, user, product, model, usageItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPremiumRequestUsageReportUser {\n");
        sb.append("    timePeriod: ").append(toIndentedString(timePeriod)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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
