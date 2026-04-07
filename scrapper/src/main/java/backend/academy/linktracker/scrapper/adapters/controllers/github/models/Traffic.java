package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Traffic
 */
@JsonTypeName("traffic")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Traffic {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime timestamp;

    private Long uniques;

    private Long count;

    public Traffic() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Traffic(OffsetDateTime timestamp, Long uniques, Long count) {
        this.timestamp = timestamp;
        this.uniques = uniques;
        this.count = count;
    }

    public Traffic timestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * Get timestamp
     * @return timestamp
     */
    @NotNull
    @Valid
    @Schema(name = "timestamp", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("timestamp")
    public OffsetDateTime getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(OffsetDateTime timestamp) {
        this.timestamp = timestamp;
    }

    public Traffic uniques(Long uniques) {
        this.uniques = uniques;
        return this;
    }

    /**
     * Get uniques
     * @return uniques
     */
    @NotNull
    @Schema(name = "uniques", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("uniques")
    public Long getUniques() {
        return uniques;
    }

    public void setUniques(Long uniques) {
        this.uniques = uniques;
    }

    public Traffic count(Long count) {
        this.count = count;
        return this;
    }

    /**
     * Get count
     * @return count
     */
    @NotNull
    @Schema(name = "count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("count")
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Traffic traffic = (Traffic) o;
        return Objects.equals(this.timestamp, traffic.timestamp)
                && Objects.equals(this.uniques, traffic.uniques)
                && Objects.equals(this.count, traffic.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, uniques, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Traffic {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    uniques: ").append(toIndentedString(uniques)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
