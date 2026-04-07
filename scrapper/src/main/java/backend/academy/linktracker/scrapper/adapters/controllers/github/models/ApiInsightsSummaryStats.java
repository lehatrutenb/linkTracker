package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * API Insights usage summary stats for an organization
 */
@Schema(name = "api-insights-summary-stats", description = "API Insights usage summary stats for an organization")
@JsonTypeName("api-insights-summary-stats")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiInsightsSummaryStats {

    private Optional<Long> totalRequestCount = Optional.empty();

    private Optional<Long> rateLimitedRequestCount = Optional.empty();

    public ApiInsightsSummaryStats totalRequestCount(Long totalRequestCount) {
        this.totalRequestCount = Optional.ofNullable(totalRequestCount);
        return this;
    }

    /**
     * The total number of requests within the queried time period
     * @return totalRequestCount
     */
    @Schema(
            name = "total_request_count",
            description = "The total number of requests within the queried time period",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_request_count")
    public Optional<Long> getTotalRequestCount() {
        return totalRequestCount;
    }

    public void setTotalRequestCount(Optional<Long> totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
    }

    public ApiInsightsSummaryStats rateLimitedRequestCount(Long rateLimitedRequestCount) {
        this.rateLimitedRequestCount = Optional.ofNullable(rateLimitedRequestCount);
        return this;
    }

    /**
     * The total number of requests that were rate limited within the queried time period
     * @return rateLimitedRequestCount
     */
    @Schema(
            name = "rate_limited_request_count",
            description = "The total number of requests that were rate limited within the queried time period",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rate_limited_request_count")
    public Optional<Long> getRateLimitedRequestCount() {
        return rateLimitedRequestCount;
    }

    public void setRateLimitedRequestCount(Optional<Long> rateLimitedRequestCount) {
        this.rateLimitedRequestCount = rateLimitedRequestCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiInsightsSummaryStats apiInsightsSummaryStats = (ApiInsightsSummaryStats) o;
        return Objects.equals(this.totalRequestCount, apiInsightsSummaryStats.totalRequestCount)
                && Objects.equals(this.rateLimitedRequestCount, apiInsightsSummaryStats.rateLimitedRequestCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalRequestCount, rateLimitedRequestCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiInsightsSummaryStats {\n");
        sb.append("    totalRequestCount: ")
                .append(toIndentedString(totalRequestCount))
                .append("\n");
        sb.append("    rateLimitedRequestCount: ")
                .append(toIndentedString(rateLimitedRequestCount))
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
