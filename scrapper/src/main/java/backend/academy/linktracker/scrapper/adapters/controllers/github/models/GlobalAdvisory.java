package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * A GitHub Security Advisory.
 */
@Schema(name = "global-advisory", description = "A GitHub Security Advisory.")
@JsonTypeName("global-advisory")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GlobalAdvisory {

    private String ghsaId;

    private JsonNullable<String> cveId = JsonNullable.<String>undefined();

    private String url;

    private URI htmlUrl;

    private JsonNullable<URI> repositoryAdvisoryUrl = JsonNullable.<URI>undefined();

    private String summary;

    private JsonNullable<@Size(max = 65535) String> description = JsonNullable.<String>undefined();

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

    private JsonNullable<URI> sourceCodeLocation = JsonNullable.<URI>undefined();

    @Valid
    private JsonNullable<List<@Valid GlobalAdvisoryIdentifiersInner>> identifiers =
            JsonNullable.<List<@Valid GlobalAdvisoryIdentifiersInner>>undefined();

    @Valid
    private JsonNullable<List<String>> references = JsonNullable.<List<String>>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime publishedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> githubReviewedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> nvdPublishedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> withdrawnAt = JsonNullable.<OffsetDateTime>undefined();

    @Valid
    private JsonNullable<List<@Valid Vulnerability>> vulnerabilities =
            JsonNullable.<List<@Valid Vulnerability>>undefined();

    private JsonNullable<CvssSeverities> cvssSeverities = JsonNullable.<CvssSeverities>undefined();

    private JsonNullable<SecurityAdvisoryEpss> epss = JsonNullable.<SecurityAdvisoryEpss>undefined();

    @Valid
    private JsonNullable<List<@Valid GlobalAdvisoryCwesInner>> cwes =
            JsonNullable.<List<@Valid GlobalAdvisoryCwesInner>>undefined();

    @Valid
    private JsonNullable<List<@Valid GlobalAdvisoryCreditsInner>> credits =
            JsonNullable.<List<@Valid GlobalAdvisoryCreditsInner>>undefined();

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
        this.cveId = JsonNullable.of(cveId);
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.repositoryAdvisoryUrl = JsonNullable.of(repositoryAdvisoryUrl);
        this.summary = summary;
        this.description = JsonNullable.of(description);
        this.type = type;
        this.severity = severity;
        this.sourceCodeLocation = JsonNullable.of(sourceCodeLocation);
        this.identifiers = JsonNullable.of(identifiers);
        this.references = JsonNullable.of(references);
        this.publishedAt = publishedAt;
        this.updatedAt = updatedAt;
        this.githubReviewedAt = JsonNullable.of(githubReviewedAt);
        this.nvdPublishedAt = JsonNullable.of(nvdPublishedAt);
        this.withdrawnAt = JsonNullable.of(withdrawnAt);
        this.vulnerabilities = JsonNullable.of(vulnerabilities);
        this.cwes = JsonNullable.of(cwes);
        this.credits = JsonNullable.of(credits);
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
        this.cveId = JsonNullable.of(cveId);
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
    public JsonNullable<String> getCveId() {
        return cveId;
    }

    public void setCveId(JsonNullable<String> cveId) {
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
        this.repositoryAdvisoryUrl = JsonNullable.of(repositoryAdvisoryUrl);
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
    public JsonNullable<URI> getRepositoryAdvisoryUrl() {
        return repositoryAdvisoryUrl;
    }

    public void setRepositoryAdvisoryUrl(JsonNullable<URI> repositoryAdvisoryUrl) {
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
        this.description = JsonNullable.of(description);
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
    public JsonNullable<@Size(max = 65535) String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
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
        this.sourceCodeLocation = JsonNullable.of(sourceCodeLocation);
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
    public JsonNullable<URI> getSourceCodeLocation() {
        return sourceCodeLocation;
    }

    public void setSourceCodeLocation(JsonNullable<URI> sourceCodeLocation) {
        this.sourceCodeLocation = sourceCodeLocation;
    }

    public GlobalAdvisory identifiers(List<@Valid GlobalAdvisoryIdentifiersInner> identifiers) {
        this.identifiers = JsonNullable.of(identifiers);
        return this;
    }

    public GlobalAdvisory addIdentifiersItem(GlobalAdvisoryIdentifiersInner identifiersItem) {
        if (this.identifiers == null || !this.identifiers.isPresent()) {
            this.identifiers = JsonNullable.of(new ArrayList<>());
        }
        this.identifiers.get().add(identifiersItem);
        return this;
    }

    /**
     * Get identifiers
     * @return identifiers
     */
    @Valid
    @Schema(name = "identifiers", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("identifiers")
    public JsonNullable<List<@Valid GlobalAdvisoryIdentifiersInner>> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(JsonNullable<List<@Valid GlobalAdvisoryIdentifiersInner>> identifiers) {
        this.identifiers = identifiers;
    }

    public GlobalAdvisory references(List<String> references) {
        this.references = JsonNullable.of(references);
        return this;
    }

    public GlobalAdvisory addReferencesItem(String referencesItem) {
        if (this.references == null || !this.references.isPresent()) {
            this.references = JsonNullable.of(new ArrayList<>());
        }
        this.references.get().add(referencesItem);
        return this;
    }

    /**
     * Get references
     * @return references
     */
    @NotNull
    @Schema(name = "references", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("references")
    public JsonNullable<List<String>> getReferences() {
        return references;
    }

    public void setReferences(JsonNullable<List<String>> references) {
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
        this.githubReviewedAt = JsonNullable.of(githubReviewedAt);
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
    public JsonNullable<OffsetDateTime> getGithubReviewedAt() {
        return githubReviewedAt;
    }

    public void setGithubReviewedAt(JsonNullable<OffsetDateTime> githubReviewedAt) {
        this.githubReviewedAt = githubReviewedAt;
    }

    public GlobalAdvisory nvdPublishedAt(OffsetDateTime nvdPublishedAt) {
        this.nvdPublishedAt = JsonNullable.of(nvdPublishedAt);
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
    public JsonNullable<OffsetDateTime> getNvdPublishedAt() {
        return nvdPublishedAt;
    }

    public void setNvdPublishedAt(JsonNullable<OffsetDateTime> nvdPublishedAt) {
        this.nvdPublishedAt = nvdPublishedAt;
    }

    public GlobalAdvisory withdrawnAt(OffsetDateTime withdrawnAt) {
        this.withdrawnAt = JsonNullable.of(withdrawnAt);
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
    public JsonNullable<OffsetDateTime> getWithdrawnAt() {
        return withdrawnAt;
    }

    public void setWithdrawnAt(JsonNullable<OffsetDateTime> withdrawnAt) {
        this.withdrawnAt = withdrawnAt;
    }

    public GlobalAdvisory vulnerabilities(List<@Valid Vulnerability> vulnerabilities) {
        this.vulnerabilities = JsonNullable.of(vulnerabilities);
        return this;
    }

    public GlobalAdvisory addVulnerabilitiesItem(Vulnerability vulnerabilitiesItem) {
        if (this.vulnerabilities == null || !this.vulnerabilities.isPresent()) {
            this.vulnerabilities = JsonNullable.of(new ArrayList<>());
        }
        this.vulnerabilities.get().add(vulnerabilitiesItem);
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
    public JsonNullable<List<@Valid Vulnerability>> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(JsonNullable<List<@Valid Vulnerability>> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public GlobalAdvisory cvssSeverities(CvssSeverities cvssSeverities) {
        this.cvssSeverities = JsonNullable.of(cvssSeverities);
        return this;
    }

    /**
     * Get cvssSeverities
     * @return cvssSeverities
     */
    @Valid
    @Schema(name = "cvss_severities", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cvss_severities")
    public JsonNullable<CvssSeverities> getCvssSeverities() {
        return cvssSeverities;
    }

    public void setCvssSeverities(JsonNullable<CvssSeverities> cvssSeverities) {
        this.cvssSeverities = cvssSeverities;
    }

    public GlobalAdvisory epss(SecurityAdvisoryEpss epss) {
        this.epss = JsonNullable.of(epss);
        return this;
    }

    /**
     * Get epss
     * @return epss
     */
    @Valid
    @Schema(name = "epss", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("epss")
    public JsonNullable<SecurityAdvisoryEpss> getEpss() {
        return epss;
    }

    public void setEpss(JsonNullable<SecurityAdvisoryEpss> epss) {
        this.epss = epss;
    }

    public GlobalAdvisory cwes(List<@Valid GlobalAdvisoryCwesInner> cwes) {
        this.cwes = JsonNullable.of(cwes);
        return this;
    }

    public GlobalAdvisory addCwesItem(GlobalAdvisoryCwesInner cwesItem) {
        if (this.cwes == null || !this.cwes.isPresent()) {
            this.cwes = JsonNullable.of(new ArrayList<>());
        }
        this.cwes.get().add(cwesItem);
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
    public JsonNullable<List<@Valid GlobalAdvisoryCwesInner>> getCwes() {
        return cwes;
    }

    public void setCwes(JsonNullable<List<@Valid GlobalAdvisoryCwesInner>> cwes) {
        this.cwes = cwes;
    }

    public GlobalAdvisory credits(List<@Valid GlobalAdvisoryCreditsInner> credits) {
        this.credits = JsonNullable.of(credits);
        return this;
    }

    public GlobalAdvisory addCreditsItem(GlobalAdvisoryCreditsInner creditsItem) {
        if (this.credits == null || !this.credits.isPresent()) {
            this.credits = JsonNullable.of(new ArrayList<>());
        }
        this.credits.get().add(creditsItem);
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
    public JsonNullable<List<@Valid GlobalAdvisoryCreditsInner>> getCredits() {
        return credits;
    }

    public void setCredits(JsonNullable<List<@Valid GlobalAdvisoryCreditsInner>> credits) {
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
                && equalsNullable(this.cvssSeverities, globalAdvisory.cvssSeverities)
                && equalsNullable(this.epss, globalAdvisory.epss)
                && Objects.equals(this.cwes, globalAdvisory.cwes)
                && Objects.equals(this.credits, globalAdvisory.credits);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
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
                hashCodeNullable(cvssSeverities),
                hashCodeNullable(epss),
                cwes,
                credits);
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
