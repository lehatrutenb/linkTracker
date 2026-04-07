package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CvssSeveritiesCvssV3
 */
@JsonTypeName("cvss_severities_cvss_v3")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CvssSeveritiesCvssV3 {

    private JsonNullable<String> vectorString = JsonNullable.<String>undefined();

    private JsonNullable<@DecimalMin(value = "0") @DecimalMax(value = "10") BigDecimal> score =
            JsonNullable.<BigDecimal>undefined();

    public CvssSeveritiesCvssV3() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CvssSeveritiesCvssV3(String vectorString, BigDecimal score) {
        this.vectorString = JsonNullable.of(vectorString);
        this.score = JsonNullable.of(score);
    }

    public CvssSeveritiesCvssV3 vectorString(String vectorString) {
        this.vectorString = JsonNullable.of(vectorString);
        return this;
    }

    /**
     * The CVSS 3 vector string.
     * @return vectorString
     */
    @NotNull
    @Schema(
            name = "vector_string",
            description = "The CVSS 3 vector string.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("vector_string")
    public JsonNullable<String> getVectorString() {
        return vectorString;
    }

    public void setVectorString(JsonNullable<String> vectorString) {
        this.vectorString = vectorString;
    }

    public CvssSeveritiesCvssV3 score(BigDecimal score) {
        this.score = JsonNullable.of(score);
        return this;
    }

    /**
     * The CVSS 3 score.
     * minimum: 0
     * maximum: 10
     * @return score
     */
    @Valid
    @DecimalMin(value = "0")
    @DecimalMax(value = "10")
    @Schema(
            name = "score",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The CVSS 3 score.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("score")
    public JsonNullable<@DecimalMin(value = "0") @DecimalMax(value = "10") BigDecimal> getScore() {
        return score;
    }

    public void setScore(JsonNullable<BigDecimal> score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CvssSeveritiesCvssV3 cvssSeveritiesCvssV3 = (CvssSeveritiesCvssV3) o;
        return Objects.equals(this.vectorString, cvssSeveritiesCvssV3.vectorString)
                && Objects.equals(this.score, cvssSeveritiesCvssV3.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vectorString, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CvssSeveritiesCvssV3 {\n");
        sb.append("    vectorString: ").append(toIndentedString(vectorString)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
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
