package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhooksSecurityAdvisoryVulnerabilitiesInner
 */
@JsonTypeName("webhooks_security_advisory_vulnerabilities_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksSecurityAdvisoryVulnerabilitiesInner {

    private JsonNullable<WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion> firstPatchedVersion =
            JsonNullable.<WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion>undefined();

    private WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage _package;

    private String severity;

    private String vulnerableVersionRange;

    public WebhooksSecurityAdvisoryVulnerabilitiesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksSecurityAdvisoryVulnerabilitiesInner(
            WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion firstPatchedVersion,
            WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage _package,
            String severity,
            String vulnerableVersionRange) {
        this.firstPatchedVersion = JsonNullable.of(firstPatchedVersion);
        this._package = _package;
        this.severity = severity;
        this.vulnerableVersionRange = vulnerableVersionRange;
    }

    public WebhooksSecurityAdvisoryVulnerabilitiesInner firstPatchedVersion(
            WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion firstPatchedVersion) {
        this.firstPatchedVersion = JsonNullable.of(firstPatchedVersion);
        return this;
    }

    /**
     * Get firstPatchedVersion
     * @return firstPatchedVersion
     */
    @NotNull
    @Valid
    @Schema(name = "first_patched_version", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("first_patched_version")
    public JsonNullable<WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion> getFirstPatchedVersion() {
        return firstPatchedVersion;
    }

    public void setFirstPatchedVersion(
            JsonNullable<WebhooksSecurityAdvisoryVulnerabilitiesInnerFirstPatchedVersion> firstPatchedVersion) {
        this.firstPatchedVersion = firstPatchedVersion;
    }

    public WebhooksSecurityAdvisoryVulnerabilitiesInner _package(
            WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage _package) {
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
    public WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage getPackage() {
        return _package;
    }

    public void setPackage(WebhooksSecurityAdvisoryVulnerabilitiesInnerPackage _package) {
        this._package = _package;
    }

    public WebhooksSecurityAdvisoryVulnerabilitiesInner severity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    @NotNull
    @Schema(name = "severity", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public WebhooksSecurityAdvisoryVulnerabilitiesInner vulnerableVersionRange(String vulnerableVersionRange) {
        this.vulnerableVersionRange = vulnerableVersionRange;
        return this;
    }

    /**
     * Get vulnerableVersionRange
     * @return vulnerableVersionRange
     */
    @NotNull
    @Schema(name = "vulnerable_version_range", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("vulnerable_version_range")
    public String getVulnerableVersionRange() {
        return vulnerableVersionRange;
    }

    public void setVulnerableVersionRange(String vulnerableVersionRange) {
        this.vulnerableVersionRange = vulnerableVersionRange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhooksSecurityAdvisoryVulnerabilitiesInner webhooksSecurityAdvisoryVulnerabilitiesInner =
                (WebhooksSecurityAdvisoryVulnerabilitiesInner) o;
        return Objects.equals(
                        this.firstPatchedVersion, webhooksSecurityAdvisoryVulnerabilitiesInner.firstPatchedVersion)
                && Objects.equals(this._package, webhooksSecurityAdvisoryVulnerabilitiesInner._package)
                && Objects.equals(this.severity, webhooksSecurityAdvisoryVulnerabilitiesInner.severity)
                && Objects.equals(
                        this.vulnerableVersionRange,
                        webhooksSecurityAdvisoryVulnerabilitiesInner.vulnerableVersionRange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstPatchedVersion, _package, severity, vulnerableVersionRange);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhooksSecurityAdvisoryVulnerabilitiesInner {\n");
        sb.append("    firstPatchedVersion: ")
                .append(toIndentedString(firstPatchedVersion))
                .append("\n");
        sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    vulnerableVersionRange: ")
                .append(toIndentedString(vulnerableVersionRange))
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
