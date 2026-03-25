package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ApiInsightsUserStatsInner
 */
@JsonTypeName("api_insights_user_stats_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiInsightsUserStatsInner {

    private String actorType;

    private String actorName;

    private Long actorId;

    private Long integrationId = null;

    private Long oauthApplicationId = null;

    private Long totalRequestCount;

    private Long rateLimitedRequestCount;

    private String lastRateLimitedTimestamp = null;

    private String lastRequestTimestamp;

    public ApiInsightsUserStatsInner actorType(String actorType) {
        this.actorType = actorType;
        return this;
    }

    /**
     * Get actorType
     * @return actorType
     */
    @Schema(name = "actor_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actor_type")
    public String getActorType() {
        return actorType;
    }

    public void setActorType(String actorType) {
        this.actorType = actorType;
    }

    public ApiInsightsUserStatsInner actorName(String actorName) {
        this.actorName = actorName;
        return this;
    }

    /**
     * Get actorName
     * @return actorName
     */
    @Schema(name = "actor_name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actor_name")
    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public ApiInsightsUserStatsInner actorId(Long actorId) {
        this.actorId = actorId;
        return this;
    }

    /**
     * Get actorId
     * @return actorId
     */
    @Schema(name = "actor_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actor_id")
    public Long getActorId() {
        return actorId;
    }

    public void setActorId(Long actorId) {
        this.actorId = actorId;
    }

    public ApiInsightsUserStatsInner integrationId(Long integrationId) {
        this.integrationId = integrationId;
        return this;
    }

    /**
     * Get integrationId
     * @return integrationId
     */
    @Schema(name = "integration_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("integration_id")
    public Long getIntegrationId() {
        return integrationId;
    }

    public void setIntegrationId(Long integrationId) {
        this.integrationId = integrationId;
    }

    public ApiInsightsUserStatsInner oauthApplicationId(Long oauthApplicationId) {
        this.oauthApplicationId = oauthApplicationId;
        return this;
    }

    /**
     * Get oauthApplicationId
     * @return oauthApplicationId
     */
    @Schema(name = "oauth_application_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("oauth_application_id")
    public Long getOauthApplicationId() {
        return oauthApplicationId;
    }

    public void setOauthApplicationId(Long oauthApplicationId) {
        this.oauthApplicationId = oauthApplicationId;
    }

    public ApiInsightsUserStatsInner totalRequestCount(Long totalRequestCount) {
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

    public ApiInsightsUserStatsInner rateLimitedRequestCount(Long rateLimitedRequestCount) {
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

    public ApiInsightsUserStatsInner lastRateLimitedTimestamp(String lastRateLimitedTimestamp) {
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

    public ApiInsightsUserStatsInner lastRequestTimestamp(String lastRequestTimestamp) {
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
        ApiInsightsUserStatsInner apiInsightsUserStatsInner = (ApiInsightsUserStatsInner) o;
        return Objects.equals(this.actorType, apiInsightsUserStatsInner.actorType)
                && Objects.equals(this.actorName, apiInsightsUserStatsInner.actorName)
                && Objects.equals(this.actorId, apiInsightsUserStatsInner.actorId)
                && Objects.equals(this.integrationId, apiInsightsUserStatsInner.integrationId)
                && Objects.equals(this.oauthApplicationId, apiInsightsUserStatsInner.oauthApplicationId)
                && Objects.equals(this.totalRequestCount, apiInsightsUserStatsInner.totalRequestCount)
                && Objects.equals(this.rateLimitedRequestCount, apiInsightsUserStatsInner.rateLimitedRequestCount)
                && Objects.equals(this.lastRateLimitedTimestamp, apiInsightsUserStatsInner.lastRateLimitedTimestamp)
                && Objects.equals(this.lastRequestTimestamp, apiInsightsUserStatsInner.lastRequestTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                actorType,
                actorName,
                actorId,
                integrationId,
                oauthApplicationId,
                totalRequestCount,
                rateLimitedRequestCount,
                lastRateLimitedTimestamp,
                lastRequestTimestamp);
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
