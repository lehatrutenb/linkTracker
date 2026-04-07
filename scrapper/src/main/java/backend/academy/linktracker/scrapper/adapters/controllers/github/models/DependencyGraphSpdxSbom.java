package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * A schema for the SPDX JSON format returned by the Dependency Graph.
 */
@Schema(
        name = "dependency-graph-spdx-sbom",
        description = "A schema for the SPDX JSON format returned by the Dependency Graph.")
@JsonTypeName("dependency-graph-spdx-sbom")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependencyGraphSpdxSbom {

    private DependencyGraphSpdxSbomSbom sbom;

    public DependencyGraphSpdxSbom() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependencyGraphSpdxSbom(DependencyGraphSpdxSbomSbom sbom) {
        this.sbom = sbom;
    }

    public DependencyGraphSpdxSbom sbom(DependencyGraphSpdxSbomSbom sbom) {
        this.sbom = sbom;
        return this;
    }

    /**
     * Get sbom
     * @return sbom
     */
    @NotNull
    @Valid
    @Schema(name = "sbom", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("sbom")
    public DependencyGraphSpdxSbomSbom getSbom() {
        return sbom;
    }

    public void setSbom(DependencyGraphSpdxSbomSbom sbom) {
        this.sbom = sbom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependencyGraphSpdxSbom dependencyGraphSpdxSbom = (DependencyGraphSpdxSbom) o;
        return Objects.equals(this.sbom, dependencyGraphSpdxSbom.sbom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sbom);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyGraphSpdxSbom {\n");
        sb.append("    sbom: ").append(toIndentedString(sbom)).append("\n");
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
