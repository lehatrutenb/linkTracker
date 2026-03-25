package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * CvssSeverities
 */
@JsonTypeName("cvss-severities")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CvssSeverities {

    private CvssSeveritiesCvssV3 cvssV3 = null;

    private CvssSeveritiesCvssV4 cvssV4 = null;

    public CvssSeverities cvssV3(CvssSeveritiesCvssV3 cvssV3) {
        this.cvssV3 = cvssV3;
        return this;
    }

    /**
     * Get cvssV3
     * @return cvssV3
     */
    @Valid
    @Schema(name = "cvss_v3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cvss_v3")
    public CvssSeveritiesCvssV3 getCvssV3() {
        return cvssV3;
    }

    public void setCvssV3(CvssSeveritiesCvssV3 cvssV3) {
        this.cvssV3 = cvssV3;
    }

    public CvssSeverities cvssV4(CvssSeveritiesCvssV4 cvssV4) {
        this.cvssV4 = cvssV4;
        return this;
    }

    /**
     * Get cvssV4
     * @return cvssV4
     */
    @Valid
    @Schema(name = "cvss_v4", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cvss_v4")
    public CvssSeveritiesCvssV4 getCvssV4() {
        return cvssV4;
    }

    public void setCvssV4(CvssSeveritiesCvssV4 cvssV4) {
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
        return Objects.equals(this.cvssV3, cvssSeverities.cvssV3) && Objects.equals(this.cvssV4, cvssSeverities.cvssV4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cvssV3, cvssV4);
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
