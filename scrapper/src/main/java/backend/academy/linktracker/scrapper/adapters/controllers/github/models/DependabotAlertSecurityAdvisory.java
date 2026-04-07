package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Details for the GitHub Security Advisory.
 */
@Schema(name = "dependabot-alert-security-advisory", description = "Details for the GitHub Security Advisory.")
@JsonTypeName("dependabot-alert-security-advisory")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotAlertSecurityAdvisory {

    private String ghsaId;

    private JsonNullable<String> cveId = JsonNullable.<String>undefined();

    private String summary;

    private String description;

    @Valid
    private List<@Valid DependabotAlertSecurityVulnerability> vulnerabilities = new ArrayList<>();

    /**
     * The severity of the advisory.
     */
    public enum SeverityEnum {
        LOW("low"),

        MEDIUM("medium"),

        HIGH("high"),

        CRITICAL("critical");

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

    private JsonNullable<CvssSeverities> cvssSeverities = JsonNullable.<CvssSeverities>undefined();

    private JsonNullable<SecurityAdvisoryEpss> epss = JsonNullable.<SecurityAdvisoryEpss>undefined();

    @Valid
    private List<@Valid DependabotAlertSecurityAdvisoryCwesInner> cwes = new ArrayList<>();

    @Valid
    private List<@Valid DependabotAlertSecurityAdvisoryIdentifiersInner> identifiers = new ArrayList<>();

    @Valid
    private List<@Valid DependabotAlertSecurityAdvisoryReferencesInner> references = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime publishedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> withdrawnAt = JsonNullable.<OffsetDateTime>undefined();

    public DependabotAlertSecurityAdvisory() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependabotAlertSecurityAdvisory(
            String ghsaId,
            String cveId,
            String summary,
            String description,
            List<@Valid DependabotAlertSecurityVulnerability> vulnerabilities,
            SeverityEnum severity,
            List<@Valid DependabotAlertSecurityAdvisoryCwesInner> cwes,
            List<@Valid DependabotAlertSecurityAdvisoryIdentifiersInner> identifiers,
            List<@Valid DependabotAlertSecurityAdvisoryReferencesInner> references,
            OffsetDateTime publishedAt,
            OffsetDateTime updatedAt,
            OffsetDateTime withdrawnAt) {
        this.ghsaId = ghsaId;
        this.cveId = JsonNullable.of(cveId);
        this.summary = summary;
        this.description = description;
        this.vulnerabilities = vulnerabilities;
        this.severity = severity;
        this.cwes = cwes;
        this.identifiers = identifiers;
        this.references = references;
        this.publishedAt = publishedAt;
        this.updatedAt = updatedAt;
        this.withdrawnAt = JsonNullable.of(withdrawnAt);
    }

    public DependabotAlertSecurityAdvisory ghsaId(String ghsaId) {
        this.ghsaId = ghsaId;
        return this;
    }

    /**
     * The unique GitHub Security Advisory ID assigned to the advisory.
     * @return ghsaId
     */
    @Schema(
            name = "ghsa_id",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The unique GitHub Security Advisory ID assigned to the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ghsa_id")
    public String getGhsaId() {
        return ghsaId;
    }

    public void setGhsaId(String ghsaId) {
        this.ghsaId = ghsaId;
    }

    public DependabotAlertSecurityAdvisory cveId(String cveId) {
        this.cveId = JsonNullable.of(cveId);
        return this;
    }

    /**
     * The unique CVE ID assigned to the advisory.
     * @return cveId
     */
    @Schema(
            name = "cve_id",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The unique CVE ID assigned to the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cve_id")
    public JsonNullable<String> getCveId() {
        return cveId;
    }

    public void setCveId(JsonNullable<String> cveId) {
        this.cveId = cveId;
    }

    public DependabotAlertSecurityAdvisory summary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * A short, plain text summary of the advisory.
     * @return summary
     */
    @Size(max = 1024)
    @Schema(
            name = "summary",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "A short, plain text summary of the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public DependabotAlertSecurityAdvisory description(String description) {
        this.description = description;
        return this;
    }

    /**
     * A long-form Markdown-supported description of the advisory.
     * @return description
     */
    @Schema(
            name = "description",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "A long-form Markdown-supported description of the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DependabotAlertSecurityAdvisory vulnerabilities(
            List<@Valid DependabotAlertSecurityVulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }

    public DependabotAlertSecurityAdvisory addVulnerabilitiesItem(
            DependabotAlertSecurityVulnerability vulnerabilitiesItem) {
        if (this.vulnerabilities == null) {
            this.vulnerabilities = new ArrayList<>();
        }
        this.vulnerabilities.add(vulnerabilitiesItem);
        return this;
    }

    /**
     * Vulnerable version range information for the advisory.
     * @return vulnerabilities
     */
    @Valid
    @Schema(
            name = "vulnerabilities",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Vulnerable version range information for the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("vulnerabilities")
    public List<@Valid DependabotAlertSecurityVulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<@Valid DependabotAlertSecurityVulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public DependabotAlertSecurityAdvisory severity(SeverityEnum severity) {
        this.severity = severity;
        return this;
    }

    /**
     * The severity of the advisory.
     * @return severity
     */
    @Schema(
            name = "severity",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The severity of the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("severity")
    public SeverityEnum getSeverity() {
        return severity;
    }

    public void setSeverity(SeverityEnum severity) {
        this.severity = severity;
    }

    public DependabotAlertSecurityAdvisory cvssSeverities(CvssSeverities cvssSeverities) {
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

    public DependabotAlertSecurityAdvisory epss(SecurityAdvisoryEpss epss) {
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

    public DependabotAlertSecurityAdvisory cwes(List<@Valid DependabotAlertSecurityAdvisoryCwesInner> cwes) {
        this.cwes = cwes;
        return this;
    }

    public DependabotAlertSecurityAdvisory addCwesItem(DependabotAlertSecurityAdvisoryCwesInner cwesItem) {
        if (this.cwes == null) {
            this.cwes = new ArrayList<>();
        }
        this.cwes.add(cwesItem);
        return this;
    }

    /**
     * Details for the advisory pertaining to Common Weakness Enumeration.
     * @return cwes
     */
    @Valid
    @Schema(
            name = "cwes",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Details for the advisory pertaining to Common Weakness Enumeration.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cwes")
    public List<@Valid DependabotAlertSecurityAdvisoryCwesInner> getCwes() {
        return cwes;
    }

    public void setCwes(List<@Valid DependabotAlertSecurityAdvisoryCwesInner> cwes) {
        this.cwes = cwes;
    }

    public DependabotAlertSecurityAdvisory identifiers(
            List<@Valid DependabotAlertSecurityAdvisoryIdentifiersInner> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public DependabotAlertSecurityAdvisory addIdentifiersItem(
            DependabotAlertSecurityAdvisoryIdentifiersInner identifiersItem) {
        if (this.identifiers == null) {
            this.identifiers = new ArrayList<>();
        }
        this.identifiers.add(identifiersItem);
        return this;
    }

    /**
     * Values that identify this advisory among security information sources.
     * @return identifiers
     */
    @Valid
    @Schema(
            name = "identifiers",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Values that identify this advisory among security information sources.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("identifiers")
    public List<@Valid DependabotAlertSecurityAdvisoryIdentifiersInner> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<@Valid DependabotAlertSecurityAdvisoryIdentifiersInner> identifiers) {
        this.identifiers = identifiers;
    }

    public DependabotAlertSecurityAdvisory references(
            List<@Valid DependabotAlertSecurityAdvisoryReferencesInner> references) {
        this.references = references;
        return this;
    }

    public DependabotAlertSecurityAdvisory addReferencesItem(
            DependabotAlertSecurityAdvisoryReferencesInner referencesItem) {
        if (this.references == null) {
            this.references = new ArrayList<>();
        }
        this.references.add(referencesItem);
        return this;
    }

    /**
     * Links to additional advisory information.
     * @return references
     */
    @Valid
    @Schema(
            name = "references",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "Links to additional advisory information.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("references")
    public List<@Valid DependabotAlertSecurityAdvisoryReferencesInner> getReferences() {
        return references;
    }

    public void setReferences(List<@Valid DependabotAlertSecurityAdvisoryReferencesInner> references) {
        this.references = references;
    }

    public DependabotAlertSecurityAdvisory publishedAt(OffsetDateTime publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    /**
     * The time that the advisory was published in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return publishedAt
     */
    @Valid
    @Schema(
            name = "published_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The time that the advisory was published in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("published_at")
    public OffsetDateTime getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(OffsetDateTime publishedAt) {
        this.publishedAt = publishedAt;
    }

    public DependabotAlertSecurityAdvisory updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time that the advisory was last modified in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return updatedAt
     */
    @Valid
    @Schema(
            name = "updated_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The time that the advisory was last modified in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DependabotAlertSecurityAdvisory withdrawnAt(OffsetDateTime withdrawnAt) {
        this.withdrawnAt = JsonNullable.of(withdrawnAt);
        return this;
    }

    /**
     * The time that the advisory was withdrawn in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return withdrawnAt
     */
    @Valid
    @Schema(
            name = "withdrawn_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The time that the advisory was withdrawn in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("withdrawn_at")
    public JsonNullable<OffsetDateTime> getWithdrawnAt() {
        return withdrawnAt;
    }

    public void setWithdrawnAt(JsonNullable<OffsetDateTime> withdrawnAt) {
        this.withdrawnAt = withdrawnAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotAlertSecurityAdvisory dependabotAlertSecurityAdvisory = (DependabotAlertSecurityAdvisory) o;
        return Objects.equals(this.ghsaId, dependabotAlertSecurityAdvisory.ghsaId)
                && Objects.equals(this.cveId, dependabotAlertSecurityAdvisory.cveId)
                && Objects.equals(this.summary, dependabotAlertSecurityAdvisory.summary)
                && Objects.equals(this.description, dependabotAlertSecurityAdvisory.description)
                && Objects.equals(this.vulnerabilities, dependabotAlertSecurityAdvisory.vulnerabilities)
                && Objects.equals(this.severity, dependabotAlertSecurityAdvisory.severity)
                && equalsNullable(this.cvssSeverities, dependabotAlertSecurityAdvisory.cvssSeverities)
                && equalsNullable(this.epss, dependabotAlertSecurityAdvisory.epss)
                && Objects.equals(this.cwes, dependabotAlertSecurityAdvisory.cwes)
                && Objects.equals(this.identifiers, dependabotAlertSecurityAdvisory.identifiers)
                && Objects.equals(this.references, dependabotAlertSecurityAdvisory.references)
                && Objects.equals(this.publishedAt, dependabotAlertSecurityAdvisory.publishedAt)
                && Objects.equals(this.updatedAt, dependabotAlertSecurityAdvisory.updatedAt)
                && Objects.equals(this.withdrawnAt, dependabotAlertSecurityAdvisory.withdrawnAt);
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
                summary,
                description,
                vulnerabilities,
                severity,
                hashCodeNullable(cvssSeverities),
                hashCodeNullable(epss),
                cwes,
                identifiers,
                references,
                publishedAt,
                updatedAt,
                withdrawnAt);
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
        sb.append("class DependabotAlertSecurityAdvisory {\n");
        sb.append("    ghsaId: ").append(toIndentedString(ghsaId)).append("\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    vulnerabilities: ")
                .append(toIndentedString(vulnerabilities))
                .append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    cvssSeverities: ")
                .append(toIndentedString(cvssSeverities))
                .append("\n");
        sb.append("    epss: ").append(toIndentedString(epss)).append("\n");
        sb.append("    cwes: ").append(toIndentedString(cwes)).append("\n");
        sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    withdrawnAt: ").append(toIndentedString(withdrawnAt)).append("\n");
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
