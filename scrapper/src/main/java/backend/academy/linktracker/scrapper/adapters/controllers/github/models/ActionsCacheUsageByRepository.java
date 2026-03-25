package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * GitHub Actions Cache Usage by repository.
 */
@Schema(name = "actions-cache-usage-by-repository", description = "GitHub Actions Cache Usage by repository.")
@JsonTypeName("actions-cache-usage-by-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCacheUsageByRepository {

    private String fullName;

    private Long activeCachesSizeInBytes;

    private Long activeCachesCount;

    public ActionsCacheUsageByRepository() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsCacheUsageByRepository(String fullName, Long activeCachesSizeInBytes, Long activeCachesCount) {
        this.fullName = fullName;
        this.activeCachesSizeInBytes = activeCachesSizeInBytes;
        this.activeCachesCount = activeCachesCount;
    }

    public ActionsCacheUsageByRepository fullName(String fullName) {
        this.fullName = fullName;
        return this;
    }

    /**
     * The repository owner and name for the cache usage being shown.
     * @return fullName
     */
    @NotNull
    @Schema(
            name = "full_name",
            example = "octo-org/Hello-World",
            description = "The repository owner and name for the cache usage being shown.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public ActionsCacheUsageByRepository activeCachesSizeInBytes(Long activeCachesSizeInBytes) {
        this.activeCachesSizeInBytes = activeCachesSizeInBytes;
        return this;
    }

    /**
     * The sum of the size in bytes of all the active cache items in the repository.
     * @return activeCachesSizeInBytes
     */
    @NotNull
    @Schema(
            name = "active_caches_size_in_bytes",
            example = "2322142",
            description = "The sum of the size in bytes of all the active cache items in the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("active_caches_size_in_bytes")
    public Long getActiveCachesSizeInBytes() {
        return activeCachesSizeInBytes;
    }

    public void setActiveCachesSizeInBytes(Long activeCachesSizeInBytes) {
        this.activeCachesSizeInBytes = activeCachesSizeInBytes;
    }

    public ActionsCacheUsageByRepository activeCachesCount(Long activeCachesCount) {
        this.activeCachesCount = activeCachesCount;
        return this;
    }

    /**
     * The number of active caches in the repository.
     * @return activeCachesCount
     */
    @NotNull
    @Schema(
            name = "active_caches_count",
            example = "3",
            description = "The number of active caches in the repository.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("active_caches_count")
    public Long getActiveCachesCount() {
        return activeCachesCount;
    }

    public void setActiveCachesCount(Long activeCachesCount) {
        this.activeCachesCount = activeCachesCount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsCacheUsageByRepository actionsCacheUsageByRepository = (ActionsCacheUsageByRepository) o;
        return Objects.equals(this.fullName, actionsCacheUsageByRepository.fullName)
                && Objects.equals(this.activeCachesSizeInBytes, actionsCacheUsageByRepository.activeCachesSizeInBytes)
                && Objects.equals(this.activeCachesCount, actionsCacheUsageByRepository.activeCachesCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fullName, activeCachesSizeInBytes, activeCachesCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCacheUsageByRepository {\n");
        sb.append("    fullName: ").append(toIndentedString(fullName)).append("\n");
        sb.append("    activeCachesSizeInBytes: ")
                .append(toIndentedString(activeCachesSizeInBytes))
                .append("\n");
        sb.append("    activeCachesCount: ")
                .append(toIndentedString(activeCachesCount))
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
