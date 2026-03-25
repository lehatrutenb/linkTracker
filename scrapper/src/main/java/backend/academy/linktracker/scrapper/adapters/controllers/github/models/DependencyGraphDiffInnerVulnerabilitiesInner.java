package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * DependencyGraphDiffInnerVulnerabilitiesInner
 */
@JsonTypeName("dependency_graph_diff_inner_vulnerabilities_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependencyGraphDiffInnerVulnerabilitiesInner {

    private String severity;

    private String advisoryGhsaId;

    private String advisorySummary;

    private String advisoryUrl;

    public DependencyGraphDiffInnerVulnerabilitiesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependencyGraphDiffInnerVulnerabilitiesInner(
            String severity, String advisoryGhsaId, String advisorySummary, String advisoryUrl) {
        this.severity = severity;
        this.advisoryGhsaId = advisoryGhsaId;
        this.advisorySummary = advisorySummary;
        this.advisoryUrl = advisoryUrl;
    }

    public DependencyGraphDiffInnerVulnerabilitiesInner severity(String severity) {
        this.severity = severity;
        return this;
    }

    /**
     * Get severity
     * @return severity
     */
    @NotNull
    @Schema(name = "severity", example = "critical", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public DependencyGraphDiffInnerVulnerabilitiesInner advisoryGhsaId(String advisoryGhsaId) {
        this.advisoryGhsaId = advisoryGhsaId;
        return this;
    }

    /**
     * Get advisoryGhsaId
     * @return advisoryGhsaId
     */
    @NotNull
    @Schema(name = "advisory_ghsa_id", example = "GHSA-rf4j-j272-fj86", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("advisory_ghsa_id")
    public String getAdvisoryGhsaId() {
        return advisoryGhsaId;
    }

    public void setAdvisoryGhsaId(String advisoryGhsaId) {
        this.advisoryGhsaId = advisoryGhsaId;
    }

    public DependencyGraphDiffInnerVulnerabilitiesInner advisorySummary(String advisorySummary) {
        this.advisorySummary = advisorySummary;
        return this;
    }

    /**
     * Get advisorySummary
     * @return advisorySummary
     */
    @NotNull
    @Schema(
            name = "advisory_summary",
            example = "A summary of the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("advisory_summary")
    public String getAdvisorySummary() {
        return advisorySummary;
    }

    public void setAdvisorySummary(String advisorySummary) {
        this.advisorySummary = advisorySummary;
    }

    public DependencyGraphDiffInnerVulnerabilitiesInner advisoryUrl(String advisoryUrl) {
        this.advisoryUrl = advisoryUrl;
        return this;
    }

    /**
     * Get advisoryUrl
     * @return advisoryUrl
     */
    @NotNull
    @Schema(
            name = "advisory_url",
            example = "https://github.com/advisories/GHSA-rf4j-j272-fj86",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("advisory_url")
    public String getAdvisoryUrl() {
        return advisoryUrl;
    }

    public void setAdvisoryUrl(String advisoryUrl) {
        this.advisoryUrl = advisoryUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependencyGraphDiffInnerVulnerabilitiesInner dependencyGraphDiffInnerVulnerabilitiesInner =
                (DependencyGraphDiffInnerVulnerabilitiesInner) o;
        return Objects.equals(this.severity, dependencyGraphDiffInnerVulnerabilitiesInner.severity)
                && Objects.equals(this.advisoryGhsaId, dependencyGraphDiffInnerVulnerabilitiesInner.advisoryGhsaId)
                && Objects.equals(this.advisorySummary, dependencyGraphDiffInnerVulnerabilitiesInner.advisorySummary)
                && Objects.equals(this.advisoryUrl, dependencyGraphDiffInnerVulnerabilitiesInner.advisoryUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(severity, advisoryGhsaId, advisorySummary, advisoryUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependencyGraphDiffInnerVulnerabilitiesInner {\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    advisoryGhsaId: ")
                .append(toIndentedString(advisoryGhsaId))
                .append("\n");
        sb.append("    advisorySummary: ")
                .append(toIndentedString(advisorySummary))
                .append("\n");
        sb.append("    advisoryUrl: ").append(toIndentedString(advisoryUrl)).append("\n");
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
