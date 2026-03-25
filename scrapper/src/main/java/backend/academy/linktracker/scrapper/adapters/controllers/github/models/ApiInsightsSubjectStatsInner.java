package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ApiInsightsSubjectStatsInner
 */
@JsonTypeName("api_insights_subject_stats_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiInsightsSubjectStatsInner {

    private String subjectType;

    private String subjectName;

    private Long subjectId;

    private Long totalRequestCount;

    private Long rateLimitedRequestCount;

    private String lastRateLimitedTimestamp = null;

    private String lastRequestTimestamp;

    public ApiInsightsSubjectStatsInner subjectType(String subjectType) {
        this.subjectType = subjectType;
        return this;
    }

    /**
     * Get subjectType
     * @return subjectType
     */
    @Schema(name = "subject_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subject_type")
    public String getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(String subjectType) {
        this.subjectType = subjectType;
    }

    public ApiInsightsSubjectStatsInner subjectName(String subjectName) {
        this.subjectName = subjectName;
        return this;
    }

    /**
     * Get subjectName
     * @return subjectName
     */
    @Schema(name = "subject_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subject_name")
    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public ApiInsightsSubjectStatsInner subjectId(Long subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    /**
     * Get subjectId
     * @return subjectId
     */
    @Schema(name = "subject_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subject_id")
    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public ApiInsightsSubjectStatsInner totalRequestCount(Long totalRequestCount) {
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

    public ApiInsightsSubjectStatsInner rateLimitedRequestCount(Long rateLimitedRequestCount) {
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

    public ApiInsightsSubjectStatsInner lastRateLimitedTimestamp(String lastRateLimitedTimestamp) {
        this.lastRateLimitedTimestamp = lastRateLimitedTimestamp;
        return this;
    }

    /**
     * Get lastRateLimitedTimestamp
     * @return lastRateLimitedTimestamp
     */
    @Schema(name = "last_rate_limited_timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_rate_limited_timestamp")
    public String getLastRateLimitedTimestamp() {
        return lastRateLimitedTimestamp;
    }

    public void setLastRateLimitedTimestamp(String lastRateLimitedTimestamp) {
        this.lastRateLimitedTimestamp = lastRateLimitedTimestamp;
    }

    public ApiInsightsSubjectStatsInner lastRequestTimestamp(String lastRequestTimestamp) {
        this.lastRequestTimestamp = lastRequestTimestamp;
        return this;
    }

    /**
     * Get lastRequestTimestamp
     * @return lastRequestTimestamp
     */
    @Schema(name = "last_request_timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_request_timestamp")
    public String getLastRequestTimestamp() {
        return lastRequestTimestamp;
    }

    public void setLastRequestTimestamp(String lastRequestTimestamp) {
        this.lastRequestTimestamp = lastRequestTimestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApiInsightsSubjectStatsInner apiInsightsSubjectStatsInner = (ApiInsightsSubjectStatsInner) o;
        return Objects.equals(this.subjectType, apiInsightsSubjectStatsInner.subjectType)
                && Objects.equals(this.subjectName, apiInsightsSubjectStatsInner.subjectName)
                && Objects.equals(this.subjectId, apiInsightsSubjectStatsInner.subjectId)
                && Objects.equals(this.totalRequestCount, apiInsightsSubjectStatsInner.totalRequestCount)
                && Objects.equals(this.rateLimitedRequestCount, apiInsightsSubjectStatsInner.rateLimitedRequestCount)
                && Objects.equals(this.lastRateLimitedTimestamp, apiInsightsSubjectStatsInner.lastRateLimitedTimestamp)
                && Objects.equals(this.lastRequestTimestamp, apiInsightsSubjectStatsInner.lastRequestTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                subjectType,
                subjectName,
                subjectId,
                totalRequestCount,
                rateLimitedRequestCount,
                lastRateLimitedTimestamp,
                lastRequestTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiInsightsSubjectStatsInner {\n");
        sb.append("    subjectType: ").append(toIndentedString(subjectType)).append("\n");
        sb.append("    subjectName: ").append(toIndentedString(subjectName)).append("\n");
        sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
        sb.append("    totalRequestCount: ")
                .append(toIndentedString(totalRequestCount))
                .append("\n");
        sb.append("    rateLimitedRequestCount: ")
                .append(toIndentedString(rateLimitedRequestCount))
                .append("\n");
        sb.append("    lastRateLimitedTimestamp: ")
                .append(toIndentedString(lastRateLimitedTimestamp))
                .append("\n");
        sb.append("    lastRequestTimestamp: ")
                .append(toIndentedString(lastRequestTimestamp))
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
