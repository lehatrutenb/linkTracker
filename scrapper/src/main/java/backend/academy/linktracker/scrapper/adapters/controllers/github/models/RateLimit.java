package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * RateLimit
 */
@JsonTypeName("rate-limit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RateLimit {

    private Long limit;

    private Long remaining;

    private Long reset;

    private Long used;

    public RateLimit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RateLimit(Long limit, Long remaining, Long reset, Long used) {
        this.limit = limit;
        this.remaining = remaining;
        this.reset = reset;
        this.used = used;
    }

    public RateLimit limit(Long limit) {
        this.limit = limit;
        return this;
    }

    /**
     * Get limit
     * @return limit
     */
    @NotNull
    @Schema(name = "limit", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("limit")
    public Long getLimit() {
        return limit;
    }

    public void setLimit(Long limit) {
        this.limit = limit;
    }

    public RateLimit remaining(Long remaining) {
        this.remaining = remaining;
        return this;
    }

    /**
     * Get remaining
     * @return remaining
     */
    @NotNull
    @Schema(name = "remaining", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("remaining")
    public Long getRemaining() {
        return remaining;
    }

    public void setRemaining(Long remaining) {
        this.remaining = remaining;
    }

    public RateLimit reset(Long reset) {
        this.reset = reset;
        return this;
    }

    /**
     * Get reset
     * @return reset
     */
    @NotNull
    @Schema(name = "reset", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("reset")
    public Long getReset() {
        return reset;
    }

    public void setReset(Long reset) {
        this.reset = reset;
    }

    public RateLimit used(Long used) {
        this.used = used;
        return this;
    }

    /**
     * Get used
     * @return used
     */
    @NotNull
    @Schema(name = "used", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("used")
    public Long getUsed() {
        return used;
    }

    public void setUsed(Long used) {
        this.used = used;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RateLimit rateLimit = (RateLimit) o;
        return Objects.equals(this.limit, rateLimit.limit)
                && Objects.equals(this.remaining, rateLimit.remaining)
                && Objects.equals(this.reset, rateLimit.reset)
                && Objects.equals(this.used, rateLimit.used);
    }

    @Override
    public int hashCode() {
        return Objects.hash(limit, remaining, reset, used);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RateLimit {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    remaining: ").append(toIndentedString(remaining)).append("\n");
        sb.append("    reset: ").append(toIndentedString(reset)).append("\n");
        sb.append("    used: ").append(toIndentedString(used)).append("\n");
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
