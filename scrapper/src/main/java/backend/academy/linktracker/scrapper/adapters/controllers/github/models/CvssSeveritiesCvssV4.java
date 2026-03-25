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
 * CvssSeveritiesCvssV4
 */
@JsonTypeName("cvss_severities_cvss_v4")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CvssSeveritiesCvssV4 {

    private String vectorString = null;

    private BigDecimal score = null;

    public CvssSeveritiesCvssV4() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CvssSeveritiesCvssV4(String vectorString, BigDecimal score) {
        this.vectorString = vectorString;
        this.score = score;
    }

    public CvssSeveritiesCvssV4 vectorString(String vectorString) {
        this.vectorString = vectorString;
        return this;
    }

    /**
     * The CVSS 4 vector string.
     * @return vectorString
     */
    @NotNull
    @Schema(
            name = "vector_string",
            description = "The CVSS 4 vector string.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("vector_string")
    public String getVectorString() {
        return vectorString;
    }

    public void setVectorString(String vectorString) {
        this.vectorString = vectorString;
    }

    public CvssSeveritiesCvssV4 score(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * The CVSS 4 score.
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
            description = "The CVSS 4 score.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("score")
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
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
        CvssSeveritiesCvssV4 cvssSeveritiesCvssV4 = (CvssSeveritiesCvssV4) o;
        return Objects.equals(this.vectorString, cvssSeveritiesCvssV4.vectorString)
                && Objects.equals(this.score, cvssSeveritiesCvssV4.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vectorString, score);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CvssSeveritiesCvssV4 {\n");
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
