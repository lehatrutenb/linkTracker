package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The name of the package affected by the vulnerability.
 */
@Schema(
        name = "repository_advisory_create_vulnerabilities_inner_package",
        description = "The name of the package affected by the vulnerability.")
@JsonTypeName("repository_advisory_create_vulnerabilities_inner_package")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisoryCreateVulnerabilitiesInnerPackage {

    private SecurityAdvisoryEcosystems ecosystem;

    private JsonNullable<String> name = JsonNullable.<String>undefined();

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
        this.name = JsonNullable.of(name);
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
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
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
                && equalsNullable(this.name, repositoryAdvisoryCreateVulnerabilitiesInnerPackage.name);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(ecosystem, hashCodeNullable(name));
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
