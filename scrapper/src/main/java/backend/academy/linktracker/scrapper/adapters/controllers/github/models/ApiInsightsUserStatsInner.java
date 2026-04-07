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
 * ApiInsightsUserStatsInner
 */
@JsonTypeName("api_insights_user_stats_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiInsightsUserStatsInner {

    private Optional<String> actorType = Optional.empty();

    private Optional<String> actorName = Optional.empty();

    private Optional<Long> actorId = Optional.empty();

    private JsonNullable<Long> integrationId = JsonNullable.<Long>undefined();

    private JsonNullable<Long> oauthApplicationId = JsonNullable.<Long>undefined();

    private Optional<Long> totalRequestCount = Optional.empty();

    private Optional<Long> rateLimitedRequestCount = Optional.empty();

    private JsonNullable<String> lastRateLimitedTimestamp = JsonNullable.<String>undefined();

    private Optional<String> lastRequestTimestamp = Optional.empty();

    public ApiInsightsUserStatsInner actorType(String actorType) {
        this.actorType = Optional.ofNullable(actorType);
        return this;
    }

    /**
     * Get actorType
     * @return actorType
     */
    @Schema(name = "actor_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actor_type")
    public Optional<String> getActorType() {
        return actorType;
    }

    public void setActorType(Optional<String> actorType) {
        this.actorType = actorType;
    }

    public ApiInsightsUserStatsInner actorName(String actorName) {
        this.actorName = Optional.ofNullable(actorName);
        return this;
    }

    /**
     * Get actorName
     * @return actorName
     */
    @Schema(name = "actor_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actor_name")
    public Optional<String> getActorName() {
        return actorName;
    }

    public void setActorName(Optional<String> actorName) {
        this.actorName = actorName;
    }

    public ApiInsightsUserStatsInner actorId(Long actorId) {
        this.actorId = Optional.ofNullable(actorId);
        return this;
    }

    /**
     * Get actorId
     * @return actorId
     */
    @Schema(name = "actor_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actor_id")
    public Optional<Long> getActorId() {
        return actorId;
    }

    public void setActorId(Optional<Long> actorId) {
        this.actorId = actorId;
    }

    public ApiInsightsUserStatsInner integrationId(Long integrationId) {
        this.integrationId = JsonNullable.of(integrationId);
        return this;
    }

    /**
     * Get integrationId
     * @return integrationId
     */
    @Schema(name = "integration_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("integration_id")
    public JsonNullable<Long> getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(JsonNullable<Long> integrationId) {
        this.integrationId = integrationId;
    }

    public ApiInsightsUserStatsInner oauthApplicationId(Long oauthApplicationId) {
        this.oauthApplicationId = JsonNullable.of(oauthApplicationId);
        return this;
    }

    /**
     * Get oauthApplicationId
     * @return oauthApplicationId
     */
    @Schema(name = "oauth_application_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("oauth_application_id")
    public JsonNullable<Long> getOauthApplicationId() {
        return oauthApplicationId;
    }

    public void setOauthApplicationId(JsonNullable<Long> oauthApplicationId) {
        this.oauthApplicationId = oauthApplicationId;
    }

    public ApiInsightsUserStatsInner totalRequestCount(Long totalRequestCount) {
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

    public ApiInsightsUserStatsInner rateLimitedRequestCount(Long rateLimitedRequestCount) {
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

    public ApiInsightsUserStatsInner lastRateLimitedTimestamp(String lastRateLimitedTimestamp) {
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

    public ApiInsightsUserStatsInner lastRequestTimestamp(String lastRequestTimestamp) {
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
        ApiInsightsUserStatsInner apiInsightsUserStatsInner = (ApiInsightsUserStatsInner) o;
        return Objects.equals(this.actorType, apiInsightsUserStatsInner.actorType)
                && Objects.equals(this.actorName, apiInsightsUserStatsInner.actorName)
                && Objects.equals(this.actorId, apiInsightsUserStatsInner.actorId)
                && equalsNullable(this.integrationId, apiInsightsUserStatsInner.integrationId)
                && equalsNullable(this.oauthApplicationId, apiInsightsUserStatsInner.oauthApplicationId)
                && Objects.equals(this.totalRequestCount, apiInsightsUserStatsInner.totalRequestCount)
                && Objects.equals(this.rateLimitedRequestCount, apiInsightsUserStatsInner.rateLimitedRequestCount)
                && equalsNullable(this.lastRateLimitedTimestamp, apiInsightsUserStatsInner.lastRateLimitedTimestamp)
                && Objects.equals(this.lastRequestTimestamp, apiInsightsUserStatsInner.lastRequestTimestamp);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                actorType,
                actorName,
                actorId,
                hashCodeNullable(integrationId),
                hashCodeNullable(oauthApplicationId),
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
        sb.append("class ApiInsightsUserStatsInner {\n");
        sb.append("    actorType: ").append(toIndentedString(actorType)).append("\n");
        sb.append("    actorName: ").append(toIndentedString(actorName)).append("\n");
        sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
        sb.append("    integrationId: ").append(toIndentedString(integrationId)).append("\n");
        sb.append("    oauthApplicationId: ")
                .append(toIndentedString(oauthApplicationId))
                .append("\n");
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
