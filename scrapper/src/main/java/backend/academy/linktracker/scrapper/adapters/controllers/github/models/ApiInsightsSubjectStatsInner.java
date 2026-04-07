package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ApiInsightsSubjectStatsInner
 */
@JsonTypeName("api_insights_subject_stats_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiInsightsSubjectStatsInner {

    private Optional<String> subjectType = Optional.empty();

    private Optional<String> subjectName = Optional.empty();

    private Optional<Long> subjectId = Optional.empty();

    private Optional<Long> totalRequestCount = Optional.empty();

    private Optional<Long> rateLimitedRequestCount = Optional.empty();

    private JsonNullable<String> lastRateLimitedTimestamp = JsonNullable.<String>undefined();

    private Optional<String> lastRequestTimestamp = Optional.empty();

    public ApiInsightsSubjectStatsInner subjectType(String subjectType) {
        this.subjectType = Optional.ofNullable(subjectType);
        return this;
    }

    /**
     * Get subjectType
     * @return subjectType
     */
    @Schema(name = "subject_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subject_type")
    public Optional<String> getSubjectType() {
        return subjectType;
    }

    public void setSubjectType(Optional<String> subjectType) {
        this.subjectType = subjectType;
    }

    public ApiInsightsSubjectStatsInner subjectName(String subjectName) {
        this.subjectName = Optional.ofNullable(subjectName);
        return this;
    }

    /**
     * Get subjectName
     * @return subjectName
     */
    @Schema(name = "subject_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subject_name")
    public Optional<String> getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(Optional<String> subjectName) {
        this.subjectName = subjectName;
    }

    public ApiInsightsSubjectStatsInner subjectId(Long subjectId) {
        this.subjectId = Optional.ofNullable(subjectId);
        return this;
    }

    /**
     * Get subjectId
     * @return subjectId
     */
    @Schema(name = "subject_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subject_id")
    public Optional<Long> getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Optional<Long> subjectId) {
        this.subjectId = subjectId;
    }

    public ApiInsightsSubjectStatsInner totalRequestCount(Long totalRequestCount) {
        this.totalRequestCount = Optional.ofNullable(totalRequestCount);
        return this;
    }

    /**
     * Get totalRequestCount
     * @return totalRequestCount
     */
    @Schema(name = "total_request_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_request_count")
    public Optional<Long> getTotalRequestCount() {
        return totalRequestCount;
    }

    public void setTotalRequestCount(Optional<Long> totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
    }

    public ApiInsightsSubjectStatsInner rateLimitedRequestCount(Long rateLimitedRequestCount) {
        this.rateLimitedRequestCount = Optional.ofNullable(rateLimitedRequestCount);
        return this;
    }

    /**
     * Get rateLimitedRequestCount
     * @return rateLimitedRequestCount
     */
    @Schema(name = "rate_limited_request_count", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("rate_limited_request_count")
    public Optional<Long> getRateLimitedRequestCount() {
        return rateLimitedRequestCount;
    }

    public void setRateLimitedRequestCount(Optional<Long> rateLimitedRequestCount) {
        this.rateLimitedRequestCount = rateLimitedRequestCount;
    }

    public ApiInsightsSubjectStatsInner lastRateLimitedTimestamp(String lastRateLimitedTimestamp) {
        this.lastRateLimitedTimestamp = JsonNullable.of(lastRateLimitedTimestamp);
        return this;
    }

    /**
     * Get lastRateLimitedTimestamp
     * @return lastRateLimitedTimestamp
     */
    @Schema(name = "last_rate_limited_timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_rate_limited_timestamp")
    public JsonNullable<String> getLastRateLimitedTimestamp() {
        return lastRateLimitedTimestamp;
    }

    public void setLastRateLimitedTimestamp(JsonNullable<String> lastRateLimitedTimestamp) {
        this.lastRateLimitedTimestamp = lastRateLimitedTimestamp;
    }

    public ApiInsightsSubjectStatsInner lastRequestTimestamp(String lastRequestTimestamp) {
        this.lastRequestTimestamp = Optional.ofNullable(lastRequestTimestamp);
        return this;
    }

    /**
     * Get lastRequestTimestamp
     * @return lastRequestTimestamp
     */
    @Schema(name = "last_request_timestamp", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("last_request_timestamp")
    public Optional<String> getLastRequestTimestamp() {
        return lastRequestTimestamp;
    }

    public void setLastRequestTimestamp(Optional<String> lastRequestTimestamp) {
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
                && equalsNullable(this.lastRateLimitedTimestamp, apiInsightsSubjectStatsInner.lastRateLimitedTimestamp)
                && Objects.equals(this.lastRequestTimestamp, apiInsightsSubjectStatsInner.lastRequestTimestamp);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                subjectType,
                subjectName,
                subjectId,
                totalRequestCount,
                rateLimitedRequestCount,
                hashCodeNullable(lastRateLimitedTimestamp),
                lastRequestTimestamp);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
