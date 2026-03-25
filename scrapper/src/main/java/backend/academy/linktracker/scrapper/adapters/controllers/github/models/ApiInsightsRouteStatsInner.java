package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ApiInsightsRouteStatsInner
 */
@JsonTypeName("api_insights_route_stats_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ApiInsightsRouteStatsInner {

    private String httpMethod;

    private String apiRoute;

    private Long totalRequestCount;

    private Long rateLimitedRequestCount;

    private String lastRateLimitedTimestamp = null;

    private String lastRequestTimestamp;

    public ApiInsightsRouteStatsInner httpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
        return this;
    }

    /**
     * The HTTP method
     * @return httpMethod
     */
    @Schema(name = "http_method", description = "The HTTP method", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("http_method")
    public String getHttpMethod() {
        return httpMethod;
    }

    public void setHttpMethod(String httpMethod) {
        this.httpMethod = httpMethod;
    }

    public ApiInsightsRouteStatsInner apiRoute(String apiRoute) {
        this.apiRoute = apiRoute;
        return this;
    }

    /**
     * The API path's route template
     * @return apiRoute
     */
    @Schema(
            name = "api_route",
            description = "The API path's route template",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("api_route")
    public String getApiRoute() {
        return apiRoute;
    }

    public void setApiRoute(String apiRoute) {
        this.apiRoute = apiRoute;
    }

    public ApiInsightsRouteStatsInner totalRequestCount(Long totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
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
    public Long getTotalRequestCount() {
        return totalRequestCount;
    }

    public void setTotalRequestCount(Long totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
    }

    public ApiInsightsRouteStatsInner rateLimitedRequestCount(Long rateLimitedRequestCount) {
        this.rateLimitedRequestCount = rateLimitedRequestCount;
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
    public Long getRateLimitedRequestCount() {
        return rateLimitedRequestCount;
    }

    public void setRateLimitedRequestCount(Long rateLimitedRequestCount) {
        this.rateLimitedRequestCount = rateLimitedRequestCount;
    }

    public ApiInsightsRouteStatsInner lastRateLimitedTimestamp(String lastRateLimitedTimestamp) {
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

    public ApiInsightsRouteStatsInner lastRequestTimestamp(String lastRequestTimestamp) {
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
        ApiInsightsRouteStatsInner apiInsightsRouteStatsInner = (ApiInsightsRouteStatsInner) o;
        return Objects.equals(this.httpMethod, apiInsightsRouteStatsInner.httpMethod)
                && Objects.equals(this.apiRoute, apiInsightsRouteStatsInner.apiRoute)
                && Objects.equals(this.totalRequestCount, apiInsightsRouteStatsInner.totalRequestCount)
                && Objects.equals(this.rateLimitedRequestCount, apiInsightsRouteStatsInner.rateLimitedRequestCount)
                && Objects.equals(this.lastRateLimitedTimestamp, apiInsightsRouteStatsInner.lastRateLimitedTimestamp)
                && Objects.equals(this.lastRequestTimestamp, apiInsightsRouteStatsInner.lastRequestTimestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                httpMethod,
                apiRoute,
                totalRequestCount,
                rateLimitedRequestCount,
                lastRateLimitedTimestamp,
                lastRequestTimestamp);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiInsightsRouteStatsInner {\n");
        sb.append("    httpMethod: ").append(toIndentedString(httpMethod)).append("\n");
        sb.append("    apiRoute: ").append(toIndentedString(apiRoute)).append("\n");
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
