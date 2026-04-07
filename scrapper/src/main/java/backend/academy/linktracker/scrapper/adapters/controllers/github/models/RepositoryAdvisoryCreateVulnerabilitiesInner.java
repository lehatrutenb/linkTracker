package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RepositoryAdvisoryCreateVulnerabilitiesInner
 */
@JsonTypeName("repository_advisory_create_vulnerabilities_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisoryCreateVulnerabilitiesInner {

    private RepositoryAdvisoryCreateVulnerabilitiesInnerPackage _package;

    private JsonNullable<String> vulnerableVersionRange = JsonNullable.<String>undefined();

    private JsonNullable<String> patchedVersions = JsonNullable.<String>undefined();

    @Valid
    private JsonNullable<List<String>> vulnerableFunctions = JsonNullable.<List<String>>undefined();

    public RepositoryAdvisoryCreateVulnerabilitiesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryAdvisoryCreateVulnerabilitiesInner(RepositoryAdvisoryCreateVulnerabilitiesInnerPackage _package) {
        this._package = _package;
    }

    public RepositoryAdvisoryCreateVulnerabilitiesInner _package(
            RepositoryAdvisoryCreateVulnerabilitiesInnerPackage _package) {
        this._package = _package;
        return this;
    }

    /**
     * Get _package
     * @return _package
     */
    @NotNull
    @Valid
    @Schema(name = "package", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("package")
    public RepositoryAdvisoryCreateVulnerabilitiesInnerPackage getPackage() {
        return _package;
    }

    public void setPackage(RepositoryAdvisoryCreateVulnerabilitiesInnerPackage _package) {
        this._package = _package;
    }

    public RepositoryAdvisoryCreateVulnerabilitiesInner vulnerableVersionRange(String vulnerableVersionRange) {
        this.vulnerableVersionRange = JsonNullable.of(vulnerableVersionRange);
        return this;
    }

    /**
     * The range of the package versions affected by the vulnerability.
     * @return vulnerableVersionRange
     */
    @Schema(
            name = "vulnerable_version_range",
            description = "The range of the package versions affected by the vulnerability.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vulnerable_version_range")
    public JsonNullable<String> getVulnerableVersionRange() {
        return vulnerableVersionRange;
    }

    public void setVulnerableVersionRange(JsonNullable<String> vulnerableVersionRange) {
        this.vulnerableVersionRange = vulnerableVersionRange;
    }

    public RepositoryAdvisoryCreateVulnerabilitiesInner patchedVersions(String patchedVersions) {
        this.patchedVersions = JsonNullable.of(patchedVersions);
        return this;
    }

    /**
     * The package version(s) that resolve the vulnerability.
     * @return patchedVersions
     */
    @Schema(
            name = "patched_versions",
            description = "The package version(s) that resolve the vulnerability.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("patched_versions")
    public JsonNullable<String> getPatchedVersions() {
        return patchedVersions;
    }

    public void setPatchedVersions(JsonNullable<String> patchedVersions) {
        this.patchedVersions = patchedVersions;
    }

    public RepositoryAdvisoryCreateVulnerabilitiesInner vulnerableFunctions(List<String> vulnerableFunctions) {
        this.vulnerableFunctions = JsonNullable.of(vulnerableFunctions);
        return this;
    }

    public RepositoryAdvisoryCreateVulnerabilitiesInner addVulnerableFunctionsItem(String vulnerableFunctionsItem) {
        if (this.vulnerableFunctions == null || !this.vulnerableFunctions.isPresent()) {
            this.vulnerableFunctions = JsonNullable.of(new ArrayList<>());
        }
        this.vulnerableFunctions.get().add(vulnerableFunctionsItem);
        return this;
    }

    /**
     * The functions in the package that are affected.
     * @return vulnerableFunctions
     */
    @Schema(
            name = "vulnerable_functions",
            description = "The functions in the package that are affected.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vulnerable_functions")
    public JsonNullable<List<String>> getVulnerableFunctions() {
        return vulnerableFunctions;
    }

    public void setVulnerableFunctions(JsonNullable<List<String>> vulnerableFunctions) {
        this.vulnerableFunctions = vulnerableFunctions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryAdvisoryCreateVulnerabilitiesInner repositoryAdvisoryCreateVulnerabilitiesInner =
                (RepositoryAdvisoryCreateVulnerabilitiesInner) o;
        return Objects.equals(this._package, repositoryAdvisoryCreateVulnerabilitiesInner._package)
                && equalsNullable(
                        this.vulnerableVersionRange,
                        repositoryAdvisoryCreateVulnerabilitiesInner.vulnerableVersionRange)
                && equalsNullable(this.patchedVersions, repositoryAdvisoryCreateVulnerabilitiesInner.patchedVersions)
                && equalsNullable(
                        this.vulnerableFunctions, repositoryAdvisoryCreateVulnerabilitiesInner.vulnerableFunctions);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                _package,
                hashCodeNullable(vulnerableVersionRange),
                hashCodeNullable(patchedVersions),
                hashCodeNullable(vulnerableFunctions));
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
        sb.append("class RepositoryAdvisoryCreateVulnerabilitiesInner {\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    vulnerableVersionRange: ")
                .append(toIndentedString(vulnerableVersionRange))
                .append("\n");
        sb.append("    patchedVersions: ")
                .append(toIndentedString(patchedVersions))
                .append("\n");
        sb.append("    vulnerableFunctions: ")
                .append(toIndentedString(vulnerableFunctions))
                .append("\n");
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
