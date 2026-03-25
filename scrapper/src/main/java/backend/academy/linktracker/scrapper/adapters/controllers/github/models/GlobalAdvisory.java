package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A GitHub Security Advisory.
 */
@Schema(name = "global-advisory", description = "A GitHub Security Advisory.")
@JsonTypeName("global-advisory")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GlobalAdvisory {

    private String ghsaId;

    private String cveId = null;

    private String url;

    private URI htmlUrl;

    private URI repositoryAdvisoryUrl = null;

    private String summary;

    private String description = null;

    /**
     * The type of advisory.
     */
    public enum TypeEnum {
        REVIEWED("reviewed"),

        UNREVIEWED("unreviewed"),

        MALWARE("malware");

        private final String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private TypeEnum type;

    /**
     * The severity of the advisory.
     */
    public enum SeverityEnum {
        CRITICAL("critical"),

        HIGH("high"),

        MEDIUM("medium"),

        LOW("low"),

        UNKNOWN("unknown");

        private final String value;

        SeverityEnum(String value) {
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
        public static SeverityEnum fromValue(String value) {
            for (SeverityEnum b : SeverityEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private SeverityEnum severity;

    private URI sourceCodeLocation = null;

    @Valid
    private List<@Valid GlobalAdvisoryIdentifiersInner> identifiers;

    @Valid
    private List<String> references;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime publishedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime githubReviewedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime nvdPublishedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime withdrawnAt = null;

    @Valid
    private List<@Valid Vulnerability> vulnerabilities;

    private CvssSeverities cvssSeverities = null;

    private SecurityAdvisoryEpss epss = null;

    @Valid
    private List<@Valid GlobalAdvisoryCwesInner> cwes;

    @Valid
    private List<@Valid GlobalAdvisoryCreditsInner> credits;

    public GlobalAdvisory() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GlobalAdvisory(
            String ghsaId,
            String cveId,
            String url,
            URI htmlUrl,
            URI repositoryAdvisoryUrl,
            String summary,
            String description,
            TypeEnum type,
            SeverityEnum severity,
            URI sourceCodeLocation,
            List<@Valid GlobalAdvisoryIdentifiersInner> identifiers,
            List<String> references,
            OffsetDateTime publishedAt,
            OffsetDateTime updatedAt,
            OffsetDateTime githubReviewedAt,
            OffsetDateTime nvdPublishedAt,
            OffsetDateTime withdrawnAt,
            List<@Valid Vulnerability> vulnerabilities,
            List<@Valid GlobalAdvisoryCwesInner> cwes,
            List<@Valid GlobalAdvisoryCreditsInner> credits) {
        this.ghsaId = ghsaId;
        this.cveId = cveId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.repositoryAdvisoryUrl = repositoryAdvisoryUrl;
        this.summary = summary;
        this.description = description;
        this.type = type;
        this.severity = severity;
        this.sourceCodeLocation = sourceCodeLocation;
        this.identifiers = identifiers;
        this.references = references;
        this.publishedAt = publishedAt;
        this.updatedAt = updatedAt;
        this.githubReviewedAt = githubReviewedAt;
        this.nvdPublishedAt = nvdPublishedAt;
        this.withdrawnAt = withdrawnAt;
        this.vulnerabilities = vulnerabilities;
        this.cwes = cwes;
        this.credits = credits;
    }

    public GlobalAdvisory ghsaId(String ghsaId) {
        this.ghsaId = ghsaId;
        return this;
    }

    /**
     * The GitHub Security Advisory ID.
     * @return ghsaId
     */
    @Schema(
            name = "ghsa_id",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The GitHub Security Advisory ID.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ghsa_id")
    public String getGhsaId() {
        return ghsaId;
    }

    public void setGhsaId(String ghsaId) {
        this.ghsaId = ghsaId;
    }

    public GlobalAdvisory cveId(String cveId) {
        this.cveId = cveId;
        return this;
    }

    /**
     * The Common Vulnerabilities and Exposures (CVE) ID.
     * @return cveId
     */
    @Schema(
            name = "cve_id",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The Common Vulnerabilities and Exposures (CVE) ID.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cve_id")
    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    public GlobalAdvisory url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The API URL for the advisory.
     * @return url
     */
    @Schema(
            name = "url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The API URL for the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public GlobalAdvisory htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * The URL for the advisory.
     * @return htmlUrl
     */
    @Valid
    @Schema(
            name = "html_url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The URL for the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public GlobalAdvisory repositoryAdvisoryUrl(URI repositoryAdvisoryUrl) {
        this.repositoryAdvisoryUrl = repositoryAdvisoryUrl;
        return this;
    }

    /**
     * The API URL for the repository advisory.
     * @return repositoryAdvisoryUrl
     */
    @Valid
    @Schema(
            name = "repository_advisory_url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The API URL for the repository advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository_advisory_url")
    public URI getRepositoryAdvisoryUrl() {
        return repositoryAdvisoryUrl;
    }

    public void setRepositoryAdvisoryUrl(URI repositoryAdvisoryUrl) {
        this.repositoryAdvisoryUrl = repositoryAdvisoryUrl;
    }

    public GlobalAdvisory summary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * A short summary of the advisory.
     * @return summary
     */
    @NotNull
    @Size(max = 1024)
    @Schema(
            name = "summary",
            description = "A short summary of the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public GlobalAdvisory description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A detailed description of what the advisory entails.
     * @return description
     */
    @NotNull
    @Size(max = 65535)
    @Schema(
            name = "description",
            description = "A detailed description of what the advisory entails.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GlobalAdvisory type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * The type of advisory.
     * @return type
     */
    @Schema(
            name = "type",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The type of advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public GlobalAdvisory severity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * The severity of the advisory.
     * @return severity
     */
    @NotNull
    @Schema(
            name = "severity",
            description = "The severity of the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("severity")
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public GlobalAdvisory sourceCodeLocation(URI sourceCodeLocation) {
        this.sourceCodeLocation = sourceCodeLocation;
        return this;
    }

    /**
     * The URL of the advisory's source code.
     * @return sourceCodeLocation
     */
    @NotNull
    @Valid
    @Schema(
            name = "source_code_location",
            description = "The URL of the advisory's source code.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("source_code_location")
    public URI getSourceCodeLocation() {
        return sourceCodeLocation;
    }

    public void setSourceCodeLocation(URI sourceCodeLocation) {
        this.sourceCodeLocation = sourceCodeLocation;
    }

    public GlobalAdvisory identifiers(List<@Valid GlobalAdvisoryIdentifiersInner> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public GlobalAdvisory addIdentifiersItem(GlobalAdvisoryIdentifiersInner identifiersItem) {
        if (this.identifiers == null) {
            this.identifiers = new ArrayList<>();
        }
        this.identifiers.add(identifiersItem);
        return this;
    }

    /**
     * Get identifiers
     * @return identifiers
     */
    @Valid
    @Schema(name = "identifiers", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("identifiers")
    public List<@Valid GlobalAdvisoryIdentifiersInner> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<@Valid GlobalAdvisoryIdentifiersInner> identifiers) {
        this.identifiers = identifiers;
    }

    public GlobalAdvisory references(List<String> references) {
        this.references = references;
        return this;
    }

    public GlobalAdvisory addReferencesItem(String referencesItem) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.add(referencesItem);
        return this;
    }

    /**
     * Get references
     * @return references
     */
    @NotNull
    @Schema(name = "references", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("references")
    public List<String> getReferences() {
        return references;
    }

    public void setReferences(List<String> references) {
        this.references = references;
    }

    public GlobalAdvisory publishedAt(OffsetDateTime publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    /**
     * The date and time of when the advisory was published, in ISO 8601 format.
     * @return publishedAt
     */
    @Valid
    @Schema(
            name = "published_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The date and time of when the advisory was published, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("published_at")
    public OffsetDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(OffsetDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public GlobalAdvisory updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The date and time of when the advisory was last updated, in ISO 8601 format.
     * @return updatedAt
     */
    @Valid
    @Schema(
            name = "updated_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The date and time of when the advisory was last updated, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public GlobalAdvisory githubReviewedAt(OffsetDateTime githubReviewedAt) {
        this.githubReviewedAt = githubReviewedAt;
        return this;
    }

    /**
     * The date and time of when the advisory was reviewed by GitHub, in ISO 8601 format.
     * @return githubReviewedAt
     */
    @Valid
    @Schema(
            name = "github_reviewed_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The date and time of when the advisory was reviewed by GitHub, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("github_reviewed_at")
    public OffsetDateTime getGithubReviewedAt() {
        return githubReviewedAt;
    }

    public void setGithubReviewedAt(OffsetDateTime githubReviewedAt) {
        this.githubReviewedAt = githubReviewedAt;
    }

    public GlobalAdvisory nvdPublishedAt(OffsetDateTime nvdPublishedAt) {
        this.nvdPublishedAt = nvdPublishedAt;
        return this;
    }

    /**
     * The date and time when the advisory was published in the National Vulnerability Database, in ISO 8601 format. This field is only populated when the advisory is imported from the National Vulnerability Database.
     * @return nvdPublishedAt
     */
    @Valid
    @Schema(
            name = "nvd_published_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description =
                    "The date and time when the advisory was published in the National Vulnerability Database, in ISO 8601 format. This field is only populated when the advisory is imported from the National Vulnerability Database.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("nvd_published_at")
    public OffsetDateTime getNvdPublishedAt() {
        return nvdPublishedAt;
    }

    public void setNvdPublishedAt(OffsetDateTime nvdPublishedAt) {
        this.nvdPublishedAt = nvdPublishedAt;
    }

    public GlobalAdvisory withdrawnAt(OffsetDateTime withdrawnAt) {
        this.withdrawnAt = withdrawnAt;
        return this;
    }

    /**
     * The date and time of when the advisory was withdrawn, in ISO 8601 format.
     * @return withdrawnAt
     */
    @Valid
    @Schema(
            name = "withdrawn_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The date and time of when the advisory was withdrawn, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("withdrawn_at")
    public OffsetDateTime getWithdrawnAt() {
        return withdrawnAt;
    }

    public void setWithdrawnAt(OffsetDateTime withdrawnAt) {
        this.withdrawnAt = withdrawnAt;
    }

    public GlobalAdvisory vulnerabilities(List<@Valid Vulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }

    public GlobalAdvisory addVulnerabilitiesItem(Vulnerability vulnerabilitiesItem) {
        if (this.vulnerabilities == null) {
            this.vulnerabilities = new ArrayList<>();
        }
        this.vulnerabilities.add(vulnerabilitiesItem);
        return this;
    }

    /**
     * The products and respective version ranges affected by the advisory.
     * @return vulnerabilities
     */
    @NotNull
    @Valid
    @Schema(
            name = "vulnerabilities",
            description = "The products and respective version ranges affected by the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("vulnerabilities")
    public List<@Valid Vulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<@Valid Vulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public GlobalAdvisory cvssSeverities(CvssSeverities cvssSeverities) {
        this.cvssSeverities = cvssSeverities;
        return this;
    }

    /**
     * Get cvssSeverities
     * @return cvssSeverities
     */
    @Valid
    @Schema(name = "cvss_severities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cvss_severities")
    public CvssSeverities getCvssSeverities() {
        return cvssSeverities;
    }

    public void setCvssSeverities(CvssSeverities cvssSeverities) {
        this.cvssSeverities = cvssSeverities;
    }

    public GlobalAdvisory epss(SecurityAdvisoryEpss epss) {
        this.epss = epss;
        return this;
    }

    /**
     * Get epss
     * @return epss
     */
    @Valid
    @Schema(name = "epss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("epss")
    public SecurityAdvisoryEpss getEpss() {
        return epss;
    }

    public void setEpss(SecurityAdvisoryEpss epss) {
        this.epss = epss;
    }

    public GlobalAdvisory cwes(List<@Valid GlobalAdvisoryCwesInner> cwes) {
        this.cwes = cwes;
        return this;
    }

    public GlobalAdvisory addCwesItem(GlobalAdvisoryCwesInner cwesItem) {
        if (this.cwes == null) {
            this.cwes = new ArrayList<>();
        }
        this.cwes.add(cwesItem);
        return this;
    }

    /**
     * Get cwes
     * @return cwes
     */
    @NotNull
    @Valid
    @Schema(name = "cwes", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cwes")
    public List<@Valid GlobalAdvisoryCwesInner> getCwes() {
        return cwes;
    }

    public void setCwes(List<@Valid GlobalAdvisoryCwesInner> cwes) {
        this.cwes = cwes;
    }

    public GlobalAdvisory credits(List<@Valid GlobalAdvisoryCreditsInner> credits) {
        this.credits = credits;
        return this;
    }

    public GlobalAdvisory addCreditsItem(GlobalAdvisoryCreditsInner creditsItem) {
        if (this.credits == null) {
            this.credits = new ArrayList<>();
        }
        this.credits.add(creditsItem);
        return this;
    }

    /**
     * The users who contributed to the advisory.
     * @return credits
     */
    @Valid
    @Schema(
            name = "credits",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The users who contributed to the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("credits")
    public List<@Valid GlobalAdvisoryCreditsInner> getCredits() {
        return credits;
    }

    public void setCredits(List<@Valid GlobalAdvisoryCreditsInner> credits) {
        this.credits = credits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GlobalAdvisory globalAdvisory = (GlobalAdvisory) o;
        return Objects.equals(this.ghsaId, globalAdvisory.ghsaId)
                && Objects.equals(this.cveId, globalAdvisory.cveId)
                && Objects.equals(this.url, globalAdvisory.url)
                && Objects.equals(this.htmlUrl, globalAdvisory.htmlUrl)
                && Objects.equals(this.repositoryAdvisoryUrl, globalAdvisory.repositoryAdvisoryUrl)
                && Objects.equals(this.summary, globalAdvisory.summary)
                && Objects.equals(this.description, globalAdvisory.description)
                && Objects.equals(this.type, globalAdvisory.type)
                && Objects.equals(this.severity, globalAdvisory.severity)
                && Objects.equals(this.sourceCodeLocation, globalAdvisory.sourceCodeLocation)
                && Objects.equals(this.identifiers, globalAdvisory.identifiers)
                && Objects.equals(this.references, globalAdvisory.references)
                && Objects.equals(this.publishedAt, globalAdvisory.publishedAt)
                && Objects.equals(this.updatedAt, globalAdvisory.updatedAt)
                && Objects.equals(this.githubReviewedAt, globalAdvisory.githubReviewedAt)
                && Objects.equals(this.nvdPublishedAt, globalAdvisory.nvdPublishedAt)
                && Objects.equals(this.withdrawnAt, globalAdvisory.withdrawnAt)
                && Objects.equals(this.vulnerabilities, globalAdvisory.vulnerabilities)
                && Objects.equals(this.cvssSeverities, globalAdvisory.cvssSeverities)
                && Objects.equals(this.epss, globalAdvisory.epss)
                && Objects.equals(this.cwes, globalAdvisory.cwes)
                && Objects.equals(this.credits, globalAdvisory.credits);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ghsaId,
                cveId,
                url,
                htmlUrl,
                repositoryAdvisoryUrl,
                summary,
                description,
                type,
                severity,
                sourceCodeLocation,
                identifiers,
                references,
                publishedAt,
                updatedAt,
                githubReviewedAt,
                nvdPublishedAt,
                withdrawnAt,
                vulnerabilities,
                cvssSeverities,
                epss,
                cwes,
                credits);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GlobalAdvisory {\n");
        sb.append("    ghsaId: ").append(toIndentedString(ghsaId)).append("\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    repositoryAdvisoryUrl: ")
                .append(toIndentedString(repositoryAdvisoryUrl))
                .append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    sourceCodeLocation: ")
                .append(toIndentedString(sourceCodeLocation))
                .append("\n");
        sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    githubReviewedAt: ")
                .append(toIndentedString(githubReviewedAt))
                .append("\n");
        sb.append("    nvdPublishedAt: ")
                .append(toIndentedString(nvdPublishedAt))
                .append("\n");
        sb.append("    withdrawnAt: ").append(toIndentedString(withdrawnAt)).append("\n");
        sb.append("    vulnerabilities: ")
                .append(toIndentedString(vulnerabilities))
                .append("\n");
        sb.append("    cvssSeverities: ")
                .append(toIndentedString(cvssSeverities))
                .append("\n");
        sb.append("    epss: ").append(toIndentedString(epss)).append("\n");
        sb.append("    cwes: ").append(toIndentedString(cwes)).append("\n");
        sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
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
