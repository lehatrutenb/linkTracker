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
 * BillingUsageReport
 */
@JsonTypeName("billing-usage-report")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BillingUsageReport {

    @Valid
    private List<@Valid BillingUsageReportUsageItemsInner> usageItems = new ArrayList<>();

    public BillingUsageReport usageItems(List<@Valid BillingUsageReportUsageItemsInner> usageItems) {
        this.usageItems = usageItems;
        return this;
    }

    public BillingUsageReport addUsageItemsItem(BillingUsageReportUsageItemsInner usageItemsItem) {
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
    @Valid
    @Schema(name = "usageItems", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("usageItems")
    public List<@Valid BillingUsageReportUsageItemsInner> getUsageItems() {
        return usageItems;
    }

    public void setUsageItems(List<@Valid BillingUsageReportUsageItemsInner> usageItems) {
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
        BillingUsageReport billingUsageReport = (BillingUsageReport) o;
        return Objects.equals(this.usageItems, billingUsageReport.usageItems);
    }

    @Override
    public int hashCode() {
        return Objects.hash(usageItems);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingUsageReport {\n");
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
