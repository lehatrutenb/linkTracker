package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CampaignSummaryAlertStats
 */
@JsonTypeName("campaign_summary_alert_stats")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CampaignSummaryAlertStats {

    private Long openCount;

    private Long closedCount;

    private Long inProgressCount;

    public CampaignSummaryAlertStats() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CampaignSummaryAlertStats(Long openCount, Long closedCount, Long inProgressCount) {
        this.openCount = openCount;
        this.closedCount = closedCount;
        this.inProgressCount = inProgressCount;
    }

    public CampaignSummaryAlertStats openCount(Long openCount) {
        this.openCount = openCount;
        return this;
    }

    /**
     * The number of open alerts
     * @return openCount
     */
    @NotNull
    @Schema(name = "open_count", description = "The number of open alerts", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("open_count")
    public Long getOpenCount() {
        return openCount;
    }

    public void setOpenCount(Long openCount) {
        this.openCount = openCount;
    }

    public CampaignSummaryAlertStats closedCount(Long closedCount) {
        this.closedCount = closedCount;
        return this;
    }

    /**
     * The number of closed alerts
     * @return closedCount
     */
    @NotNull
    @Schema(
            name = "closed_count",
            description = "The number of closed alerts",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("closed_count")
    public Long getClosedCount() {
        return closedCount;
    }

    public void setClosedCount(Long closedCount) {
        this.closedCount = closedCount;
    }

    public CampaignSummaryAlertStats inProgressCount(Long inProgressCount) {
        this.inProgressCount = inProgressCount;
        return this;
    }

    /**
     * The number of in-progress alerts
     * @return inProgressCount
     */
    @NotNull
    @Schema(
            name = "in_progress_count",
            description = "The number of in-progress alerts",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("in_progress_count")
    public Long getInProgressCount() {
        return inProgressCount;
    }

    public void setInProgressCount(Long inProgressCount) {
        this.inProgressCount = inProgressCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CampaignSummaryAlertStats campaignSummaryAlertStats = (CampaignSummaryAlertStats) o;
        return Objects.equals(this.openCount, campaignSummaryAlertStats.openCount)
                && Objects.equals(this.closedCount, campaignSummaryAlertStats.closedCount)
                && Objects.equals(this.inProgressCount, campaignSummaryAlertStats.inProgressCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(openCount, closedCount, inProgressCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CampaignSummaryAlertStats {\n");
        sb.append("    openCount: ").append(toIndentedString(openCount)).append("\n");
        sb.append("    closedCount: ").append(toIndentedString(closedCount)).append("\n");
        sb.append("    inProgressCount: ")
                .append(toIndentedString(inProgressCount))
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
