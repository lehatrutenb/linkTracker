package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * GitHub Actions cache retention policy for an organization.
 */
@Schema(
        name = "actions-cache-retention-limit-for-organization",
        description = "GitHub Actions cache retention policy for an organization.")
@JsonTypeName("actions-cache-retention-limit-for-organization")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCacheRetentionLimitForOrganization {

    private Optional<Long> maxCacheRetentionDays = Optional.empty();

    public ActionsCacheRetentionLimitForOrganization maxCacheRetentionDays(Long maxCacheRetentionDays) {
        this.maxCacheRetentionDays = Optional.ofNullable(maxCacheRetentionDays);
        return this;
    }

    /**
     * For repositories in this organization, the maximum duration, in days, for which caches in a repository may be retained.
     * @return maxCacheRetentionDays
     */
    @Schema(
            name = "max_cache_retention_days",
            example = "14",
            description =
                    "For repositories in this organization, the maximum duration, in days, for which caches in a repository may be retained.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("max_cache_retention_days")
    public Optional<Long> getMaxCacheRetentionDays() {
        return maxCacheRetentionDays;
    }

    public void setMaxCacheRetentionDays(Optional<Long> maxCacheRetentionDays) {
        this.maxCacheRetentionDays = maxCacheRetentionDays;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsCacheRetentionLimitForOrganization actionsCacheRetentionLimitForOrganization =
                (ActionsCacheRetentionLimitForOrganization) o;
        return Objects.equals(
                this.maxCacheRetentionDays, actionsCacheRetentionLimitForOrganization.maxCacheRetentionDays);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxCacheRetentionDays);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCacheRetentionLimitForOrganization {\n");
        sb.append("    maxCacheRetentionDays: ")
                .append(toIndentedString(maxCacheRetentionDays))
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
