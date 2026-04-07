package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * BillingPremiumRequestUsageReportOrgTimePeriod
 */
@JsonTypeName("billing_premium_request_usage_report_org_timePeriod")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BillingPremiumRequestUsageReportOrgTimePeriod {

    private Long year;

    private Optional<Long> month = Optional.empty();

    private Optional<Long> day = Optional.empty();

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
        this.month = Optional.ofNullable(month);
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
    public Optional<Long> getMonth() {
        return month;
    }

    public void setMonth(Optional<Long> month) {
        this.month = month;
    }

    public BillingPremiumRequestUsageReportOrgTimePeriod day(Long day) {
        this.day = Optional.ofNullable(day);
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
    public Optional<Long> getDay() {
        return day;
    }

    public void setDay(Optional<Long> day) {
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
