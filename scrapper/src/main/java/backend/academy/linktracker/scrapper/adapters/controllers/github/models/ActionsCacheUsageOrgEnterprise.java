package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ActionsCacheUsageOrgEnterprise
 */
@JsonTypeName("actions-cache-usage-org-enterprise")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCacheUsageOrgEnterprise {

    private Long totalActiveCachesCount;

    private Long totalActiveCachesSizeInBytes;

    public ActionsCacheUsageOrgEnterprise() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsCacheUsageOrgEnterprise(Long totalActiveCachesCount, Long totalActiveCachesSizeInBytes) {
        this.totalActiveCachesCount = totalActiveCachesCount;
        this.totalActiveCachesSizeInBytes = totalActiveCachesSizeInBytes;
    }

    public ActionsCacheUsageOrgEnterprise totalActiveCachesCount(Long totalActiveCachesCount) {
        this.totalActiveCachesCount = totalActiveCachesCount;
        return this;
    }

    /**
     * The count of active caches across all repositories of an enterprise or an organization.
     * @return totalActiveCachesCount
     */
    @NotNull
    @Schema(
            name = "total_active_caches_count",
            description = "The count of active caches across all repositories of an enterprise or an organization.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_active_caches_count")
    public Long getTotalActiveCachesCount() {
        return totalActiveCachesCount;
    }

    public void setTotalActiveCachesCount(Long totalActiveCachesCount) {
        this.totalActiveCachesCount = totalActiveCachesCount;
    }

    public ActionsCacheUsageOrgEnterprise totalActiveCachesSizeInBytes(Long totalActiveCachesSizeInBytes) {
        this.totalActiveCachesSizeInBytes = totalActiveCachesSizeInBytes;
        return this;
    }

    /**
     * The total size in bytes of all active cache items across all repositories of an enterprise or an organization.
     * @return totalActiveCachesSizeInBytes
     */
    @NotNull
    @Schema(
            name = "total_active_caches_size_in_bytes",
            description =
                    "The total size in bytes of all active cache items across all repositories of an enterprise or an organization.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_active_caches_size_in_bytes")
    public Long getTotalActiveCachesSizeInBytes() {
        return totalActiveCachesSizeInBytes;
    }

    public void setTotalActiveCachesSizeInBytes(Long totalActiveCachesSizeInBytes) {
        this.totalActiveCachesSizeInBytes = totalActiveCachesSizeInBytes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsCacheUsageOrgEnterprise actionsCacheUsageOrgEnterprise = (ActionsCacheUsageOrgEnterprise) o;
        return Objects.equals(this.totalActiveCachesCount, actionsCacheUsageOrgEnterprise.totalActiveCachesCount)
                && Objects.equals(
                        this.totalActiveCachesSizeInBytes, actionsCacheUsageOrgEnterprise.totalActiveCachesSizeInBytes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalActiveCachesCount, totalActiveCachesSizeInBytes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCacheUsageOrgEnterprise {\n");
        sb.append("    totalActiveCachesCount: ")
                .append(toIndentedString(totalActiveCachesCount))
                .append("\n");
        sb.append("    totalActiveCachesSizeInBytes: ")
                .append(toIndentedString(totalActiveCachesSizeInBytes))
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
