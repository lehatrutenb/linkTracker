package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * CvssSeverities
 */
@JsonTypeName("cvss-severities")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CvssSeverities {

    private JsonNullable<CvssSeveritiesCvssV3> cvssV3 = JsonNullable.<CvssSeveritiesCvssV3>undefined();

    private JsonNullable<CvssSeveritiesCvssV4> cvssV4 = JsonNullable.<CvssSeveritiesCvssV4>undefined();

    public CvssSeverities cvssV3(CvssSeveritiesCvssV3 cvssV3) {
        this.cvssV3 = JsonNullable.of(cvssV3);
        return this;
    }

    /**
     * Get cvssV3
     * @return cvssV3
     */
    @Valid
    @Schema(name = "cvss_v3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cvss_v3")
    public JsonNullable<CvssSeveritiesCvssV3> getCvssV3() {
        return cvssV3;
    }

    public void setCvssV3(JsonNullable<CvssSeveritiesCvssV3> cvssV3) {
        this.cvssV3 = cvssV3;
    }

    public CvssSeverities cvssV4(CvssSeveritiesCvssV4 cvssV4) {
        this.cvssV4 = JsonNullable.of(cvssV4);
        return this;
    }

    /**
     * Get cvssV4
     * @return cvssV4
     */
    @Valid
    @Schema(name = "cvss_v4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cvss_v4")
    public JsonNullable<CvssSeveritiesCvssV4> getCvssV4() {
        return cvssV4;
    }

    public void setCvssV4(JsonNullable<CvssSeveritiesCvssV4> cvssV4) {
        this.cvssV4 = cvssV4;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CvssSeverities cvssSeverities = (CvssSeverities) o;
        return equalsNullable(this.cvssV3, cvssSeverities.cvssV3) && equalsNullable(this.cvssV4, cvssSeverities.cvssV4);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(hashCodeNullable(cvssV3), hashCodeNullable(cvssV4));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CvssSeverities {\n");
        sb.append("    cvssV3: ").append(toIndentedString(cvssV3)).append("\n");
        sb.append("    cvssV4: ").append(toIndentedString(cvssV4)).append("\n");
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
