package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * DependencyGraphDiffInner
 */
@JsonTypeName("dependency_graph_diff_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependencyGraphDiffInner {

    /**
     * Gets or Sets changeType
     */
    public enum ChangeTypeEnum {
        ADDED("added"),

        REMOVED("removed");

        private final String value;

        ChangeTypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ChangeTypeEnum fromValue(String value) {
            for (ChangeTypeEnum b : ChangeTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ChangeTypeEnum changeType;

    private String manifest;

    private String ecosystem;

    private String name;

    private String version;

    private String packageUrl = null;

    private String license = null;

    private String sourceRepositoryUrl = null;

    @Valid
    private List<@Valid DependencyGraphDiffInnerVulnerabilitiesInner> vulnerabilities = new ArrayList<>();

    /**
     * Where the dependency is utilized. `development` means that the dependency is only utilized in the development environment. `runtime` means that the dependency is utilized at runtime and in the development environment.
     */
    public enum ScopeEnum {
        UNKNOWN("unknown"),

        RUNTIME("runtime"),

        DEVELOPMENT("development");

        private final String value;

        ScopeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ScopeEnum fromValue(String value) {
            for (ScopeEnum b : ScopeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ScopeEnum scope;

    public DependencyGraphDiffInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependencyGraphDiffInner(
            ChangeTypeEnum changeType,
            String manifest,
            String ecosystem,
            String name,
            String version,
            String packageUrl,
            String license,
            String sourceRepositoryUrl,
            List<@Valid DependencyGraphDiffInnerVulnerabilitiesInner> vulnerabilities,
            ScopeEnum scope) {
        this.changeType = changeType;
        this.manifest = manifest;
        this.ecosystem = ecosystem;
        this.name = name;
        this.version = version;
        this.packageUrl = packageUrl;
        this.license = license;
        this.sourceRepositoryUrl = sourceRepositoryUrl;
        this.vulnerabilities = vulnerabilities;
        this.scope = scope;
    }

    public DependencyGraphDiffInner changeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
        return this;
    }

    /**
     * Get changeType
     * @return changeType
     */
    @NotNull
    @Schema(name = "change_type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("change_type")
    public ChangeTypeEnum getChangeType() {
        return changeType;
    }

    public void setChangeType(ChangeTypeEnum changeType) {
        this.changeType = changeType;
    }

    public DependencyGraphDiffInner manifest(String manifest) {
        this.manifest = manifest;
        return this;
    }

    /**
     * Get manifest
     * @return manifest
     */
    @NotNull
    @Schema(name = "manifest", example = "path/to/package-lock.json", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("manifest")
    public String getManifest() {
        return manifest;
    }

    public void setManifest(String manifest) {
        this.manifest = manifest;
    }

    public DependencyGraphDiffInner ecosystem(String ecosystem) {
        this.ecosystem = ecosystem;
        return this;
    }

    /**
     * Get ecosystem
     * @return ecosystem
     */
    @NotNull
    @Schema(name = "ecosystem", example = "npm", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ecosystem")
    public String getEcosystem() {
        return ecosystem;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    public DependencyGraphDiffInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", example = "@actions/core", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DependencyGraphDiffInner version(String version) {
        this.version = version;
        return this;
    }

    /**
     * Get version
     * @return version
     */
    @NotNull
    @Schema(name = "version", example = "1.0.0", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public DependencyGraphDiffInner packageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
        return this;
    }

    /**
     * Get packageUrl
     * @return packageUrl
     */
    @NotNull
    @Schema(
            name = "package_url",
            example = "pkg:/npm/%40actions/core@1.1.0",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("package_url")
    public String getPackageUrl() {
        return packageUrl;
    }

    public void setPackageUrl(String packageUrl) {
        this.packageUrl = packageUrl;
    }

    public DependencyGraphDiffInner license(String license) {
        this.license = license;
        return this;
    }

    /**
     * Get license
     * @return license
     */
    @NotNull
    @Schema(name = "license", example = "MIT", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("license")
    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public DependencyGraphDiffInner sourceRepositoryUrl(String sourceRepositoryUrl) {
        this.sourceRepositoryUrl = sourceRepositoryUrl;
        return this;
    }

    /**
     * Get sourceRepositoryUrl
     * @return sourceRepositoryUrl
     */
    @NotNull
    @Schema(
            name = "source_repository_url",
            example = "https://github.com/github/actions",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("source_repository_url")
    public String getSourceRepositoryUrl() {
        return sourceRepositoryUrl;
    }

    public void setSourceRepositoryUrl(String sourceRepositoryUrl) {
        this.sourceRepositoryUrl = sourceRepositoryUrl;
    }

    public DependencyGraphDiffInner vulnerabilities(
            List<@Valid DependencyGraphDiffInnerVulnerabilitiesInner> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }

    public DependencyGraphDiffInner addVulnerabilitiesItem(
            DependencyGraphDiffInnerVulnerabilitiesInner vulnerabilitiesItem) {
        if (this.vulnerabilities == null) {
            this.vulnerabilities = new ArrayList<>();
        }
        this.vulnerabilities.add(vulnerabilitiesItem);
        return this;
    }

    /**
     * Get vulnerabilities
     * @return vulnerabilities
     */
    @NotNull
    @Valid
    @Schema(name = "vulnerabilities", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("vulnerabilities")
    public List<@Valid DependencyGraphDiffInnerVulnerabilitiesInner> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<@Valid DependencyGraphDiffInnerVulnerabilitiesInner> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public DependencyGraphDiffInner scope(ScopeEnum scope) {
        this.scope = scope;
        return this;
    }

    /**
     * Where the dependency is utilized. `development` means that the dependency is only utilized in the development environment. `runtime` means that the dependency is utilized at runtime and in the development environment.
     * @return scope
     */
    @NotNull
    @Schema(
            name = "scope",
            description =
                    "Where the dependency is utilized. `development` means that the dependency is only utilized in the development environment. `runtime` means that the dependency is utilized at runtime and in the development environment.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("scope")
    public ScopeEnum getScope() {
        return scope;
    }

    public void setScope(ScopeEnum scope) {
        this.scope = scope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependencyGraphDiffInner dependencyGraphDiffInner = (DependencyGraphDiffInner) o;
        return Objects.equals(this.changeType, dependencyGraphDiffInner.changeType)
                && Objects.equals(this.manifest, dependencyGraphDiffInner.manifest)
                && Objects.equals(this.ecosystem, dependencyGraphDiffInner.ecosystem)
                && Objects.equals(this.name, dependencyGraphDiffInner.name)
                && Objects.equals(this.version, dependencyGraphDiffInner.version)
                && Objects.equals(this.packageUrl, dependencyGraphDiffInner.packageUrl)
                && Objects.equals(this.license, dependencyGraphDiffInner.license)
                && Objects.equals(this.sourceRepositoryUrl, dependencyGraphDiffInner.sourceRepositoryUrl)
                && Objects.equals(this.vulnerabilities, dependencyGraphDiffInner.vulnerabilities)
                && Objects.equals(this.scope, dependencyGraphDiffInner.scope);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                changeType,
                manifest,
                ecosystem,
                name,
                version,
                packageUrl,
                license,
                sourceRepositoryUrl,
                vulnerabilities,
                scope);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyGraphDiffInner {\n");
        sb.append("    changeType: ").append(toIndentedString(changeType)).append("\n");
        sb.append("    manifest: ").append(toIndentedString(manifest)).append("\n");
        sb.append("    ecosystem: ").append(toIndentedString(ecosystem)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    packageUrl: ").append(toIndentedString(packageUrl)).append("\n");
        sb.append("    license: ").append(toIndentedString(license)).append("\n");
        sb.append("    sourceRepositoryUrl: ")
                .append(toIndentedString(sourceRepositoryUrl))
                .append("\n");
        sb.append("    vulnerabilities: ")
                .append(toIndentedString(vulnerabilities))
                .append("\n");
        sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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
