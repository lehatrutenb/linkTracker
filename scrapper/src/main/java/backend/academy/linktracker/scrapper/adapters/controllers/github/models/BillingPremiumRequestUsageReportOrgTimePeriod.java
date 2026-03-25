package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * BillingPremiumRequestUsageReportOrgTimePeriod
 */
@JsonTypeName("billing_premium_request_usage_report_org_timePeriod")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BillingPremiumRequestUsageReportOrgTimePeriod {

    private Long year;

    private Long month;

    private Long day;

    public BillingPremiumRequestUsageReportOrgTimePeriod() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public BillingPremiumRequestUsageReportOrgTimePeriod(Long year) {
        this.year = year;
    }

    public BillingPremiumRequestUsageReportOrgTimePeriod year(Long year) {
        this.year = year;
        return this;
    }

    /**
     * The year for the usage report.
     * @return year
     */
    @NotNull
    @Schema(name = "year", description = "The year for the usage report.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("year")
    public Long getYear() {
        return year;
    }

    public void setYear(Long year) {
        this.year = year;
    }

    public BillingPremiumRequestUsageReportOrgTimePeriod month(Long month) {
        this.month = month;
        return this;
    }

    /**
     * The month for the usage report.
     * @return month
     */
    @Schema(
            name = "month",
            description = "The month for the usage report.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("month")
    public Long getMonth() {
        return month;
    }

    public void setMonth(Long month) {
        this.month = month;
    }

    public BillingPremiumRequestUsageReportOrgTimePeriod day(Long day) {
        this.day = day;
        return this;
    }

    /**
     * The day for the usage report.
     * @return day
     */
    @Schema(
            name = "day",
            description = "The day for the usage report.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("day")
    public Long getDay() {
        return day;
    }

    public void setDay(Long day) {
        this.day = day;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BillingPremiumRequestUsageReportOrgTimePeriod billingPremiumRequestUsageReportOrgTimePeriod =
                (BillingPremiumRequestUsageReportOrgTimePeriod) o;
        return Objects.equals(this.year, billingPremiumRequestUsageReportOrgTimePeriod.year)
                && Objects.equals(this.month, billingPremiumRequestUsageReportOrgTimePeriod.month)
                && Objects.equals(this.day, billingPremiumRequestUsageReportOrgTimePeriod.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BillingPremiumRequestUsageReportOrgTimePeriod {\n");
        sb.append("    year: ").append(toIndentedString(year)).append("\n");
        sb.append("    month: ").append(toIndentedString(month)).append("\n");
        sb.append("    day: ").append(toIndentedString(day)).append("\n");
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
