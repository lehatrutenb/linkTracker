package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Rate Limit Overview
 */
@Schema(name = "rate-limit-overview", description = "Rate Limit Overview")
@JsonTypeName("rate-limit-overview")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RateLimitOverview {

    private RateLimitOverviewResources resources;

    public RateLimitOverview() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RateLimitOverview(RateLimitOverviewResources resources) {
        this.resources = resources;
    }

    public RateLimitOverview resources(RateLimitOverviewResources resources) {
        this.resources = resources;
        return this;
    }

    /**
     * Get resources
     * @return resources
     */
    @NotNull
    @Valid
    @Schema(name = "resources", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("resources")
    public RateLimitOverviewResources getResources() {
        return resources;
    }

    public void setResources(RateLimitOverviewResources resources) {
        this.resources = resources;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RateLimitOverview rateLimitOverview = (RateLimitOverview) o;
        return Objects.equals(this.resources, rateLimitOverview.resources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resources);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RateLimitOverview {\n");
        sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
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
