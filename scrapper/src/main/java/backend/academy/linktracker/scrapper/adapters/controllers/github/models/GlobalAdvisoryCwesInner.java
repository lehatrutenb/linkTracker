package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * GlobalAdvisoryCwesInner
 */
@JsonTypeName("global_advisory_cwes_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GlobalAdvisoryCwesInner {

    private String cweId;

    private String name;

    public GlobalAdvisoryCwesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GlobalAdvisoryCwesInner(String cweId, String name) {
        this.cweId = cweId;
        this.name = name;
    }

    public GlobalAdvisoryCwesInner cweId(String cweId) {
        this.cweId = cweId;
        return this;
    }

    /**
     * The Common Weakness Enumeration (CWE) identifier.
     * @return cweId
     */
    @NotNull
    @Schema(
            name = "cwe_id",
            description = "The Common Weakness Enumeration (CWE) identifier.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cwe_id")
    public String getCweId() {
        return cweId;
    }

    public void setCweId(String cweId) {
        this.cweId = cweId;
    }

    public GlobalAdvisoryCwesInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the CWE.
     * @return name
     */
    @Schema(
            name = "name",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The name of the CWE.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalAdvisoryCwesInner globalAdvisoryCwesInner = (GlobalAdvisoryCwesInner) o;
        return Objects.equals(this.cweId, globalAdvisoryCwesInner.cweId)
                && Objects.equals(this.name, globalAdvisoryCwesInner.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cweId, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalAdvisoryCwesInner {\n");
        sb.append("    cweId: ").append(toIndentedString(cweId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
