package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ApiInsightsTimeStatsInner
 */
@JsonTypeName("api_insights_time_stats_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiInsightsTimeStatsInner {

    private String timestamp;

    private Long totalRequestCount;

    private Long rateLimitedRequestCount;

    public ApiInsightsTimeStatsInner timestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     */
    @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public ApiInsightsTimeStatsInner totalRequestCount(Long totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
        return this;
    }

    /**
     * Get totalRequestCount
     * @return totalRequestCount
     */
    @Schema(name = "total_request_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_request_count")
    public Long getTotalRequestCount() {
        return totalRequestCount;
    }

    public void setTotalRequestCount(Long totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
    }

    public ApiInsightsTimeStatsInner rateLimitedRequestCount(Long rateLimitedRequestCount) {
        this.rateLimitedRequestCount = rateLimitedRequestCount;
        return this;
    }

    /**
     * Get rateLimitedRequestCount
     * @return rateLimitedRequestCount
     */
    @Schema(name = "rate_limited_request_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rate_limited_request_count")
    public Long getRateLimitedRequestCount() {
        return rateLimitedRequestCount;
    }

    public void setRateLimitedRequestCount(Long rateLimitedRequestCount) {
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
        ApiInsightsTimeStatsInner apiInsightsTimeStatsInner = (ApiInsightsTimeStatsInner) o;
        return Objects.equals(this.timestamp, apiInsightsTimeStatsInner.timestamp)
                && Objects.equals(this.totalRequestCount, apiInsightsTimeStatsInner.totalRequestCount)
                && Objects.equals(this.rateLimitedRequestCount, apiInsightsTimeStatsInner.rateLimitedRequestCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, totalRequestCount, rateLimitedRequestCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiInsightsTimeStatsInner {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
