package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DependencyGraphSpdxSbomSbomCreationInfo
 */
@JsonTypeName("dependency_graph_spdx_sbom_sbom_creationInfo")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependencyGraphSpdxSbomSbomCreationInfo {

    private String created;

    @Valid
    private List<String> creators = new ArrayList<>();

    public DependencyGraphSpdxSbomSbomCreationInfo() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependencyGraphSpdxSbomSbomCreationInfo(String created, List<String> creators) {
        this.created = created;
        this.creators = creators;
    }

    public DependencyGraphSpdxSbomSbomCreationInfo created(String created) {
        this.created = created;
        return this;
    }

    /**
     * The date and time the SPDX document was created.
     * @return created
     */
    @NotNull
    @Schema(
            name = "created",
            example = "2021-11-03T00:00:00Z",
            description = "The date and time the SPDX document was created.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created")
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public DependencyGraphSpdxSbomSbomCreationInfo creators(List<String> creators) {
        this.creators = creators;
        return this;
    }

    public DependencyGraphSpdxSbomSbomCreationInfo addCreatorsItem(String creatorsItem) {
        if (this.creators == null) {
            this.creators = new ArrayList<>();
        }
        this.creators.add(creatorsItem);
        return this;
    }

    /**
     * The tools that were used to generate the SPDX document.
     * @return creators
     */
    @NotNull
    @Schema(
            name = "creators",
            description = "The tools that were used to generate the SPDX document.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("creators")
    public List<String> getCreators() {
        return creators;
    }

    public void setCreators(List<String> creators) {
        this.creators = creators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependencyGraphSpdxSbomSbomCreationInfo dependencyGraphSpdxSbomSbomCreationInfo =
                (DependencyGraphSpdxSbomSbomCreationInfo) o;
        return Objects.equals(this.created, dependencyGraphSpdxSbomSbomCreationInfo.created)
                && Objects.equals(this.creators, dependencyGraphSpdxSbomSbomCreationInfo.creators);
    }

    @Override
    public int hashCode() {
        return Objects.hash(created, creators);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyGraphSpdxSbomSbomCreationInfo {\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    creators: ").append(toIndentedString(creators)).append("\n");
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
