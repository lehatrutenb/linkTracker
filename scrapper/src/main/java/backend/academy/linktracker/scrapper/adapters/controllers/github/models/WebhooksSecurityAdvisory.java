package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * The details of the security advisory, including summary, description, and severity.
 */
@Schema(
        name = "webhooks_security_advisory",
        description = "The details of the security advisory, including summary, description, and severity.")
@JsonTypeName("webhooks_security_advisory")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhooksSecurityAdvisory {

    private JsonNullable<CvssSeverities> cvssSeverities = JsonNullable.<CvssSeverities>undefined();

    @Valid
    private List<@Valid WebhooksSecurityAdvisoryCwesInner> cwes = new ArrayList<>();

    private String description;

    private String ghsaId;

    @Valid
    private List<@Valid WebhooksSecurityAdvisoryIdentifiersInner> identifiers = new ArrayList<>();

    private String publishedAt;

    @Valid
    private List<@Valid WebhooksSecurityAdvisoryReferencesInner> references = new ArrayList<>();

    private String severity;

    private String summary;

    private String updatedAt;

    @Valid
    private List<@Valid WebhooksSecurityAdvisoryVulnerabilitiesInner> vulnerabilities = new ArrayList<>();

    private JsonNullable<String> withdrawnAt = JsonNullable.<String>undefined();

    public WebhooksSecurityAdvisory() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhooksSecurityAdvisory(
            List<@Valid WebhooksSecurityAdvisoryCwesInner> cwes,
            String description,
            String ghsaId,
            List<@Valid WebhooksSecurityAdvisoryIdentifiersInner> identifiers,
            String publishedAt,
            List<@Valid WebhooksSecurityAdvisoryReferencesInner> references,
            String severity,
            String summary,
            String updatedAt,
            List<@Valid WebhooksSecurityAdvisoryVulnerabilitiesInner> vulnerabilities,
            String withdrawnAt) {
        this.cwes = cwes;
        this.description = description;
        this.ghsaId = ghsaId;
        this.identifiers = identifiers;
        this.publishedAt = publishedAt;
        this.references = references;
        this.severity = severity;
        this.summary = summary;
        this.updatedAt = updatedAt;
        this.vulnerabilities = vulnerabilities;
        this.withdrawnAt = JsonNullable.of(withdrawnAt);
    }

    public WebhooksSecurityAdvisory cvssSeverities(CvssSeverities cvssSeverities) {
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

    public WebhooksSecurityAdvisory cwes(List<@Valid WebhooksSecurityAdvisoryCwesInner> cwes) {
        this.cwes = cwes;
        return this;
    }

    public WebhooksSecurityAdvisory addCwesItem(WebhooksSecurityAdvisoryCwesInner cwesItem) {
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
    public List<@Valid WebhooksSecurityAdvisoryCwesInner> getCwes() {
        return cwes;
    }

    public void setCwes(List<@Valid WebhooksSecurityAdvisoryCwesInner> cwes) {
        this.cwes = cwes;
    }

    public WebhooksSecurityAdvisory description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WebhooksSecurityAdvisory ghsaId(String ghsaId) {
        this.ghsaId = ghsaId;
        return this;
    }

    /**
     * Get ghsaId
     * @return ghsaId
     */
    @NotNull
    @Schema(name = "ghsa_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("ghsa_id")
    public String getGhsaId() {
        return ghsaId;
    }

    public void setGhsaId(String ghsaId) {
        this.ghsaId = ghsaId;
    }

    public WebhooksSecurityAdvisory identifiers(List<@Valid WebhooksSecurityAdvisoryIdentifiersInner> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public WebhooksSecurityAdvisory addIdentifiersItem(WebhooksSecurityAdvisoryIdentifiersInner identifiersItem) {
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
    @NotNull
    @Valid
    @Schema(name = "identifiers", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("identifiers")
    public List<@Valid WebhooksSecurityAdvisoryIdentifiersInner> getIdentifiers() {
        return identifiers;
    }

    public void setIdentifiers(List<@Valid WebhooksSecurityAdvisoryIdentifiersInner> identifiers) {
        this.identifiers = identifiers;
    }

    public WebhooksSecurityAdvisory publishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
        return this;
    }

    /**
     * Get publishedAt
     * @return publishedAt
     */
    @NotNull
    @Schema(name = "published_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("published_at")
    public String getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(String publishedAt) {
        this.publishedAt = publishedAt;
    }

    public WebhooksSecurityAdvisory references(List<@Valid WebhooksSecurityAdvisoryReferencesInner> references) {
        this.references = references;
        return this;
    }

    public WebhooksSecurityAdvisory addReferencesItem(WebhooksSecurityAdvisoryReferencesInner referencesItem) {
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
    @Valid
    @Schema(name = "references", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("references")
    public List<@Valid WebhooksSecurityAdvisoryReferencesInner> getReferences() {
        return references;
    }

    public void setReferences(List<@Valid WebhooksSecurityAdvisoryReferencesInner> references) {
        this.references = references;
    }

    public WebhooksSecurityAdvisory severity(String severity) {
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

    public WebhooksSecurityAdvisory summary(String summary) {
        this.summary = summary;
        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    @NotNull
    @Schema(name = "summary", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("summary")
    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public WebhooksSecurityAdvisory updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhooksSecurityAdvisory vulnerabilities(
            List<@Valid WebhooksSecurityAdvisoryVulnerabilitiesInner> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }

    public WebhooksSecurityAdvisory addVulnerabilitiesItem(
            WebhooksSecurityAdvisoryVulnerabilitiesInner vulnerabilitiesItem) {
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
    public List<@Valid WebhooksSecurityAdvisoryVulnerabilitiesInner> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<@Valid WebhooksSecurityAdvisoryVulnerabilitiesInner> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public WebhooksSecurityAdvisory withdrawnAt(String withdrawnAt) {
        this.withdrawnAt = JsonNullable.of(withdrawnAt);
        return this;
    }

    /**
     * Get withdrawnAt
     * @return withdrawnAt
     */
    @NotNull
    @Schema(name = "withdrawn_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("withdrawn_at")
    public JsonNullable<String> getWithdrawnAt() {
        return withdrawnAt;
    }

    public void setWithdrawnAt(JsonNullable<String> withdrawnAt) {
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
        WebhooksSecurityAdvisory webhooksSecurityAdvisory = (WebhooksSecurityAdvisory) o;
        return equalsNullable(this.cvssSeverities, webhooksSecurityAdvisory.cvssSeverities)
                && Objects.equals(this.cwes, webhooksSecurityAdvisory.cwes)
                && Objects.equals(this.description, webhooksSecurityAdvisory.description)
                && Objects.equals(this.ghsaId, webhooksSecurityAdvisory.ghsaId)
                && Objects.equals(this.identifiers, webhooksSecurityAdvisory.identifiers)
                && Objects.equals(this.publishedAt, webhooksSecurityAdvisory.publishedAt)
                && Objects.equals(this.references, webhooksSecurityAdvisory.references)
                && Objects.equals(this.severity, webhooksSecurityAdvisory.severity)
                && Objects.equals(this.summary, webhooksSecurityAdvisory.summary)
                && Objects.equals(this.updatedAt, webhooksSecurityAdvisory.updatedAt)
                && Objects.equals(this.vulnerabilities, webhooksSecurityAdvisory.vulnerabilities)
                && Objects.equals(this.withdrawnAt, webhooksSecurityAdvisory.withdrawnAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(cvssSeverities),
                cwes,
                description,
                ghsaId,
                identifiers,
                publishedAt,
                references,
                severity,
                summary,
                updatedAt,
                vulnerabilities,
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
        sb.append("class WebhooksSecurityAdvisory {\n");
        sb.append("    cvssSeverities: ")
                .append(toIndentedString(cvssSeverities))
                .append("\n");
        sb.append("    cwes: ").append(toIndentedString(cwes)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    ghsaId: ").append(toIndentedString(ghsaId)).append("\n");
        sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    references: ").append(toIndentedString(references)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    vulnerabilities: ")
                .append(toIndentedString(vulnerabilities))
                .append("\n");
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
