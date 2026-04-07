package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * GitHub Actions cache storage policy for a repository.
 */
@Schema(
        name = "actions-cache-storage-limit-for-repository",
        description = "GitHub Actions cache storage policy for a repository.")
@JsonTypeName("actions-cache-storage-limit-for-repository")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsCacheStorageLimitForRepository {

    private Optional<Long> maxCacheSizeGb = Optional.empty();

    public ActionsCacheStorageLimitForRepository maxCacheSizeGb(Long maxCacheSizeGb) {
        this.maxCacheSizeGb = Optional.ofNullable(maxCacheSizeGb);
        return this;
    }

    /**
     * The maximum total cache size for this repository, in gigabytes.
     * @return maxCacheSizeGb
     */
    @Schema(
            name = "max_cache_size_gb",
            example = "10",
            description = "The maximum total cache size for this repository, in gigabytes.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("max_cache_size_gb")
    public Optional<Long> getMaxCacheSizeGb() {
        return maxCacheSizeGb;
    }

    public void setMaxCacheSizeGb(Optional<Long> maxCacheSizeGb) {
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
        ActionsCacheStorageLimitForRepository actionsCacheStorageLimitForRepository =
                (ActionsCacheStorageLimitForRepository) o;
        return Objects.equals(this.maxCacheSizeGb, actionsCacheStorageLimitForRepository.maxCacheSizeGb);
    }

    @Override
    public int hashCode() {
        return Objects.hash(maxCacheSizeGb);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsCacheStorageLimitForRepository {\n");
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
