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
 * The name of the package affected by the vulnerability.
 */
@Schema(
        name = "repository_advisory_create_vulnerabilities_inner_package",
        description = "The name of the package affected by the vulnerability.")
@JsonTypeName("repository_advisory_create_vulnerabilities_inner_package")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisoryCreateVulnerabilitiesInnerPackage {

    private SecurityAdvisoryEcosystems ecosystem;

    private String name = null;

    public RepositoryAdvisoryCreateVulnerabilitiesInnerPackage() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryAdvisoryCreateVulnerabilitiesInnerPackage(SecurityAdvisoryEcosystems ecosystem) {
        this.ecosystem = ecosystem;
    }

    public RepositoryAdvisoryCreateVulnerabilitiesInnerPackage ecosystem(SecurityAdvisoryEcosystems ecosystem) {
        this.ecosystem = ecosystem;
        return this;
    }

    /**
     * Get ecosystem
     * @return ecosystem
     */
    @NotNull
    @Valid
    @Schema(name = "ecosystem", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ecosystem")
    public SecurityAdvisoryEcosystems getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(SecurityAdvisoryEcosystems ecosystem) {
        this.ecosystem = ecosystem;
    }

    public RepositoryAdvisoryCreateVulnerabilitiesInnerPackage name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The unique package name within its ecosystem.
     * @return name
     */
    @Schema(
            name = "name",
            description = "The unique package name within its ecosystem.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        RepositoryAdvisoryCreateVulnerabilitiesInnerPackage repositoryAdvisoryCreateVulnerabilitiesInnerPackage =
                (RepositoryAdvisoryCreateVulnerabilitiesInnerPackage) o;
        return Objects.equals(this.ecosystem, repositoryAdvisoryCreateVulnerabilitiesInnerPackage.ecosystem)
                && Objects.equals(this.name, repositoryAdvisoryCreateVulnerabilitiesInnerPackage.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecosystem, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryAdvisoryCreateVulnerabilitiesInnerPackage {\n");
        sb.append("    ecosystem: ").append(toIndentedString(ecosystem)).append("\n");
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
