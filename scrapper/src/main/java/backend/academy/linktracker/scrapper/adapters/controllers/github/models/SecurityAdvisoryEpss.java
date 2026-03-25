package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.Objects;

/**
 * The EPSS scores as calculated by the [Exploit Prediction Scoring System](https://www.first.org/epss).
 */
@Schema(
        name = "security-advisory-epss",
        description =
                "The EPSS scores as calculated by the [Exploit Prediction Scoring System](https://www.first.org/epss).")
@JsonTypeName("security-advisory-epss")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SecurityAdvisoryEpss {

    private BigDecimal percentage;

    private BigDecimal percentile;

    public SecurityAdvisoryEpss percentage(BigDecimal percentage) {
        this.percentage = percentage;
        return this;
    }

    /**
     * Get percentage
     * minimum: 0
     * maximum: 100
     * @return percentage
     */
    @Valid
    @DecimalMin(value = "0")
    @DecimalMax(value = "100")
    @Schema(name = "percentage", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("percentage")
    public BigDecimal getPercentage() {
        return percentage;
    }

    public void setPercentage(BigDecimal percentage) {
        this.percentage = percentage;
    }

    public SecurityAdvisoryEpss percentile(BigDecimal percentile) {
        this.percentile = percentile;
        return this;
    }

    /**
     * Get percentile
     * minimum: 0
     * maximum: 100
     * @return percentile
     */
    @Valid
    @DecimalMin(value = "0")
    @DecimalMax(value = "100")
    @Schema(name = "percentile", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("percentile")
    public BigDecimal getPercentile() {
        return percentile;
    }

    public void setPercentile(BigDecimal percentile) {
        this.percentile = percentile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        SecurityAdvisoryEpss securityAdvisoryEpss = (SecurityAdvisoryEpss) o;
        return Objects.equals(this.percentage, securityAdvisoryEpss.percentage)
                && Objects.equals(this.percentile, securityAdvisoryEpss.percentile);
    }

    @Override
    public int hashCode() {
        return Objects.hash(percentage, percentile);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SecurityAdvisoryEpss {\n");
        sb.append("    percentage: ").append(toIndentedString(percentage)).append("\n");
        sb.append("    percentile: ").append(toIndentedString(percentile)).append("\n");
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
