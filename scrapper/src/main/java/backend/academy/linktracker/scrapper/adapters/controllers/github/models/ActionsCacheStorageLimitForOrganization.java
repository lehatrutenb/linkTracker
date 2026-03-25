package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * GitHub Actions cache storage policy for an organization.
 */
@Schema(
        name = "actions-cache-storage-limit-for-organization",
        description = "GitHub Actions cache storage policy for an organization.")
@JsonTypeName("actions-cache-storage-limit-for-organization")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCacheStorageLimitForOrganization {

    private Long maxCacheSizeGb;

    public ActionsCacheStorageLimitForOrganization maxCacheSizeGb(Long maxCacheSizeGb) {
        this.maxCacheSizeGb = maxCacheSizeGb;
        return this;
    }

    /**
     * For repositories in the organization, the maximum size limit for the sum of all caches in a repository, in gigabytes.
     * @return maxCacheSizeGb
     */
    @Schema(
            name = "max_cache_size_gb",
            example = "10",
            description =
                    "For repositories in the organization, the maximum size limit for the sum of all caches in a repository, in gigabytes.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("max_cache_size_gb")
    public Long getMaxCacheSizeGb() {
        return maxCacheSizeGb;
    }

    public void setMaxCacheSizeGb(Long maxCacheSizeGb) {
        this.maxCacheSizeGb = maxCacheSizeGb;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsCacheStorageLimitForOrganization actionsCacheStorageLimitForOrganization =
                (ActionsCacheStorageLimitForOrganization) o;
        return Objects.equals(this.maxCacheSizeGb, actionsCacheStorageLimitForOrganization.maxCacheSizeGb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxCacheSizeGb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCacheStorageLimitForOrganization {\n");
        sb.append("    maxCacheSizeGb: ")
                .append(toIndentedString(maxCacheSizeGb))
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
