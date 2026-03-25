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
 * A repository security advisory.
 */
@Schema(name = "repository-advisory", description = "A repository security advisory.")
@JsonTypeName("repository-advisory")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisory {

    private String ghsaId;

    private String cveId = null;

    private URI url;

    private URI htmlUrl;

    private String summary;

    private String description = null;

    /**
     * The severity of the advisory.
     */
    public enum SeverityEnum {
        CRITICAL("critical"),

        HIGH("high"),

        MEDIUM("medium"),

        LOW("low");

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
            return null;
        }
    }

    private SeverityEnum severity = null;

    private SimpleUser author = null;

    private SimpleUser publisher = null;

    @Valid
    private List<@Valid GlobalAdvisoryIdentifiersInner> identifiers = new ArrayList<>();

    /**
     * The state of the advisory.
     */
    public enum StateEnum {
        PUBLISHED("published"),

        CLOSED("closed"),

        WITHDRAWN("withdrawn"),

        DRAFT("draft"),

        TRIAGE("triage");

        private final String value;

        StateEnum(String value) {
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
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime publishedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime closedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime withdrawnAt = null;

    private RepositoryAdvisorySubmission submission = null;

    @Valid
    private List<@Valid RepositoryAdvisoryVulnerability> vulnerabilities;

    private CvssSeverities cvssSeverities = null;

    @Valid
    private List<@Valid GlobalAdvisoryCwesInner> cwes;

    @Valid
    private List<String> cweIds;

    @Valid
    private List<@Valid RepositoryAdvisoryCreditsInner> credits;

    @Valid
    private List<@Valid RepositoryAdvisoryCredit> creditsDetailed;

    @Valid
    private List<@Valid SimpleUser> collaboratingUsers;

    @Valid
    private List<@Valid Team> collaboratingTeams;

    private SimpleRepository privateFork = null;

    public RepositoryAdvisory() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryAdvisory(
            String ghsaId,
            String cveId,
            URI url,
            URI htmlUrl,
            String summary,
            String description,
            SeverityEnum severity,
            SimpleUser author,
            SimpleUser publisher,
            List<@Valid GlobalAdvisoryIdentifiersInner> identifiers,
            StateEnum state,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime publishedAt,
            OffsetDateTime closedAt,
            OffsetDateTime withdrawnAt,
            RepositoryAdvisorySubmission submission,
            List<@Valid RepositoryAdvisoryVulnerability> vulnerabilities,
            List<@Valid GlobalAdvisoryCwesInner> cwes,
            List<String> cweIds,
            List<@Valid RepositoryAdvisoryCreditsInner> credits,
            List<@Valid RepositoryAdvisoryCredit> creditsDetailed,
            List<@Valid SimpleUser> collaboratingUsers,
            List<@Valid Team> collaboratingTeams,
            SimpleRepository privateFork) {
        this.ghsaId = ghsaId;
        this.cveId = cveId;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.summary = summary;
        this.description = description;
        this.severity = severity;
        this.author = author;
        this.publisher = publisher;
        this.identifiers = identifiers;
        this.state = state;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.publishedAt = publishedAt;
        this.closedAt = closedAt;
        this.withdrawnAt = withdrawnAt;
        this.submission = submission;
        this.vulnerabilities = vulnerabilities;
        this.cwes = cwes;
        this.cweIds = cweIds;
        this.credits = credits;
        this.creditsDetailed = creditsDetailed;
        this.collaboratingUsers = collaboratingUsers;
        this.collaboratingTeams = collaboratingTeams;
        this.privateFork = privateFork;
    }

    public RepositoryAdvisory ghsaId(String ghsaId) {
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

    public RepositoryAdvisory cveId(String cveId) {
        this.cveId = cveId;
        return this;
    }

    /**
     * The Common Vulnerabilities and Exposures (CVE) ID.
     * @return cveId
     */
    @NotNull
    @Schema(
            name = "cve_id",
            description = "The Common Vulnerabilities and Exposures (CVE) ID.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cve_id")
    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    public RepositoryAdvisory url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The API URL for the advisory.
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The API URL for the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public RepositoryAdvisory htmlUrl(URI htmlUrl) {
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

    public RepositoryAdvisory summary(String summary) {
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

    public RepositoryAdvisory description(String description) {
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

    public RepositoryAdvisory severity(SeverityEnum severity) {
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

    public RepositoryAdvisory author(SimpleUser author) {
        this.author = author;
        return this;
    }

    /**
     * The author of the advisory.
     * @return author
     */
    @Valid
    @Schema(
            name = "author",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The author of the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("author")
    public SimpleUser getAuthor() {
        return author;
    }

    public void setAuthor(SimpleUser author) {
        this.author = author;
    }

    public RepositoryAdvisory publisher(SimpleUser publisher) {
        this.publisher = publisher;
        return this;
    }

    /**
     * The publisher of the advisory.
     * @return publisher
     */
    @Valid
    @Schema(
            name = "publisher",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The publisher of the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("publisher")
    public SimpleUser getPublisher() {
        return publisher;
    }

    public void setPublisher(SimpleUser publisher) {
        this.publisher = publisher;
    }

    public RepositoryAdvisory identifiers(List<@Valid GlobalAdvisoryIdentifiersInner> identifiers) {
        this.identifiers = identifiers;
        return this;
    }

    public RepositoryAdvisory addIdentifiersItem(GlobalAdvisoryIdentifiersInner identifiersItem) {
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

    public RepositoryAdvisory state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the advisory.
     * @return state
     */
    @NotNull
    @Schema(name = "state", description = "The state of the advisory.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public RepositoryAdvisory createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The date and time of when the advisory was created, in ISO 8601 format.
     * @return createdAt
     */
    @Valid
    @Schema(
            name = "created_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The date and time of when the advisory was created, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public RepositoryAdvisory updatedAt(OffsetDateTime updatedAt) {
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

    public RepositoryAdvisory publishedAt(OffsetDateTime publishedAt) {
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

    public RepositoryAdvisory closedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    /**
     * The date and time of when the advisory was closed, in ISO 8601 format.
     * @return closedAt
     */
    @Valid
    @Schema(
            name = "closed_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The date and time of when the advisory was closed, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("closed_at")
    public OffsetDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(OffsetDateTime closedAt) {
        this.closedAt = closedAt;
    }

    public RepositoryAdvisory withdrawnAt(OffsetDateTime withdrawnAt) {
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

    public RepositoryAdvisory submission(RepositoryAdvisorySubmission submission) {
        this.submission = submission;
        return this;
    }

    /**
     * Get submission
     * @return submission
     */
    @NotNull
    @Valid
    @Schema(name = "submission", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("submission")
    public RepositoryAdvisorySubmission getSubmission() {
        return submission;
    }

    public void setSubmission(RepositoryAdvisorySubmission submission) {
        this.submission = submission;
    }

    public RepositoryAdvisory vulnerabilities(List<@Valid RepositoryAdvisoryVulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }

    public RepositoryAdvisory addVulnerabilitiesItem(RepositoryAdvisoryVulnerability vulnerabilitiesItem) {
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
    public List<@Valid RepositoryAdvisoryVulnerability> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<@Valid RepositoryAdvisoryVulnerability> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public RepositoryAdvisory cvssSeverities(CvssSeverities cvssSeverities) {
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

    public RepositoryAdvisory cwes(List<@Valid GlobalAdvisoryCwesInner> cwes) {
        this.cwes = cwes;
        return this;
    }

    public RepositoryAdvisory addCwesItem(GlobalAdvisoryCwesInner cwesItem) {
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
    @Valid
    @Schema(name = "cwes", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cwes")
    public List<@Valid GlobalAdvisoryCwesInner> getCwes() {
        return cwes;
    }

    public void setCwes(List<@Valid GlobalAdvisoryCwesInner> cwes) {
        this.cwes = cwes;
    }

    public RepositoryAdvisory cweIds(List<String> cweIds) {
        this.cweIds = cweIds;
        return this;
    }

    public RepositoryAdvisory addCweIdsItem(String cweIdsItem) {
        if (this.cweIds == null) {
            this.cweIds = new ArrayList<>();
        }
        this.cweIds.add(cweIdsItem);
        return this;
    }

    /**
     * A list of only the CWE IDs.
     * @return cweIds
     */
    @NotNull
    @Schema(name = "cwe_ids", description = "A list of only the CWE IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cwe_ids")
    public List<String> getCweIds() {
        return cweIds;
    }

    public void setCweIds(List<String> cweIds) {
        this.cweIds = cweIds;
    }

    public RepositoryAdvisory credits(List<@Valid RepositoryAdvisoryCreditsInner> credits) {
        this.credits = credits;
        return this;
    }

    public RepositoryAdvisory addCreditsItem(RepositoryAdvisoryCreditsInner creditsItem) {
        if (this.credits == null) {
            this.credits = new ArrayList<>();
        }
        this.credits.add(creditsItem);
        return this;
    }

    /**
     * Get credits
     * @return credits
     */
    @NotNull
    @Valid
    @Schema(name = "credits", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("credits")
    public List<@Valid RepositoryAdvisoryCreditsInner> getCredits() {
        return credits;
    }

    public void setCredits(List<@Valid RepositoryAdvisoryCreditsInner> credits) {
        this.credits = credits;
    }

    public RepositoryAdvisory creditsDetailed(List<@Valid RepositoryAdvisoryCredit> creditsDetailed) {
        this.creditsDetailed = creditsDetailed;
        return this;
    }

    public RepositoryAdvisory addCreditsDetailedItem(RepositoryAdvisoryCredit creditsDetailedItem) {
        if (this.creditsDetailed == null) {
            this.creditsDetailed = new ArrayList<>();
        }
        this.creditsDetailed.add(creditsDetailedItem);
        return this;
    }

    /**
     * Get creditsDetailed
     * @return creditsDetailed
     */
    @Valid
    @Schema(
            name = "credits_detailed",
            accessMode = Schema.AccessMode.READ_ONLY,
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("credits_detailed")
    public List<@Valid RepositoryAdvisoryCredit> getCreditsDetailed() {
        return creditsDetailed;
    }

    public void setCreditsDetailed(List<@Valid RepositoryAdvisoryCredit> creditsDetailed) {
        this.creditsDetailed = creditsDetailed;
    }

    public RepositoryAdvisory collaboratingUsers(List<@Valid SimpleUser> collaboratingUsers) {
        this.collaboratingUsers = collaboratingUsers;
        return this;
    }

    public RepositoryAdvisory addCollaboratingUsersItem(SimpleUser collaboratingUsersItem) {
        if (this.collaboratingUsers == null) {
            this.collaboratingUsers = new ArrayList<>();
        }
        this.collaboratingUsers.add(collaboratingUsersItem);
        return this;
    }

    /**
     * A list of users that collaborate on the advisory.
     * @return collaboratingUsers
     */
    @NotNull
    @Valid
    @Schema(
            name = "collaborating_users",
            description = "A list of users that collaborate on the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("collaborating_users")
    public List<@Valid SimpleUser> getCollaboratingUsers() {
        return collaboratingUsers;
    }

    public void setCollaboratingUsers(List<@Valid SimpleUser> collaboratingUsers) {
        this.collaboratingUsers = collaboratingUsers;
    }

    public RepositoryAdvisory collaboratingTeams(List<@Valid Team> collaboratingTeams) {
        this.collaboratingTeams = collaboratingTeams;
        return this;
    }

    public RepositoryAdvisory addCollaboratingTeamsItem(Team collaboratingTeamsItem) {
        if (this.collaboratingTeams == null) {
            this.collaboratingTeams = new ArrayList<>();
        }
        this.collaboratingTeams.add(collaboratingTeamsItem);
        return this;
    }

    /**
     * A list of teams that collaborate on the advisory.
     * @return collaboratingTeams
     */
    @NotNull
    @Valid
    @Schema(
            name = "collaborating_teams",
            description = "A list of teams that collaborate on the advisory.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("collaborating_teams")
    public List<@Valid Team> getCollaboratingTeams() {
        return collaboratingTeams;
    }

    public void setCollaboratingTeams(List<@Valid Team> collaboratingTeams) {
        this.collaboratingTeams = collaboratingTeams;
    }

    public RepositoryAdvisory privateFork(SimpleRepository privateFork) {
        this.privateFork = privateFork;
        return this;
    }

    /**
     * A temporary private fork of the advisory's repository for collaborating on a fix.
     * @return privateFork
     */
    @Valid
    @Schema(
            name = "private_fork",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "A temporary private fork of the advisory's repository for collaborating on a fix.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("private_fork")
    public SimpleRepository getPrivateFork() {
        return privateFork;
    }

    public void setPrivateFork(SimpleRepository privateFork) {
        this.privateFork = privateFork;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryAdvisory repositoryAdvisory = (RepositoryAdvisory) o;
        return Objects.equals(this.ghsaId, repositoryAdvisory.ghsaId)
                && Objects.equals(this.cveId, repositoryAdvisory.cveId)
                && Objects.equals(this.url, repositoryAdvisory.url)
                && Objects.equals(this.htmlUrl, repositoryAdvisory.htmlUrl)
                && Objects.equals(this.summary, repositoryAdvisory.summary)
                && Objects.equals(this.description, repositoryAdvisory.description)
                && Objects.equals(this.severity, repositoryAdvisory.severity)
                && Objects.equals(this.author, repositoryAdvisory.author)
                && Objects.equals(this.publisher, repositoryAdvisory.publisher)
                && Objects.equals(this.identifiers, repositoryAdvisory.identifiers)
                && Objects.equals(this.state, repositoryAdvisory.state)
                && Objects.equals(this.createdAt, repositoryAdvisory.createdAt)
                && Objects.equals(this.updatedAt, repositoryAdvisory.updatedAt)
                && Objects.equals(this.publishedAt, repositoryAdvisory.publishedAt)
                && Objects.equals(this.closedAt, repositoryAdvisory.closedAt)
                && Objects.equals(this.withdrawnAt, repositoryAdvisory.withdrawnAt)
                && Objects.equals(this.submission, repositoryAdvisory.submission)
                && Objects.equals(this.vulnerabilities, repositoryAdvisory.vulnerabilities)
                && Objects.equals(this.cvssSeverities, repositoryAdvisory.cvssSeverities)
                && Objects.equals(this.cwes, repositoryAdvisory.cwes)
                && Objects.equals(this.cweIds, repositoryAdvisory.cweIds)
                && Objects.equals(this.credits, repositoryAdvisory.credits)
                && Objects.equals(this.creditsDetailed, repositoryAdvisory.creditsDetailed)
                && Objects.equals(this.collaboratingUsers, repositoryAdvisory.collaboratingUsers)
                && Objects.equals(this.collaboratingTeams, repositoryAdvisory.collaboratingTeams)
                && Objects.equals(this.privateFork, repositoryAdvisory.privateFork);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                ghsaId,
                cveId,
                url,
                htmlUrl,
                summary,
                description,
                severity,
                author,
                publisher,
                identifiers,
                state,
                createdAt,
                updatedAt,
                publishedAt,
                closedAt,
                withdrawnAt,
                submission,
                vulnerabilities,
                cvssSeverities,
                cwes,
                cweIds,
                credits,
                creditsDetailed,
                collaboratingUsers,
                collaboratingTeams,
                privateFork);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryAdvisory {\n");
        sb.append("    ghsaId: ").append(toIndentedString(ghsaId)).append("\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    author: ").append(toIndentedString(author)).append("\n");
        sb.append("    publisher: ").append(toIndentedString(publisher)).append("\n");
        sb.append("    identifiers: ").append(toIndentedString(identifiers)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    publishedAt: ").append(toIndentedString(publishedAt)).append("\n");
        sb.append("    closedAt: ").append(toIndentedString(closedAt)).append("\n");
        sb.append("    withdrawnAt: ").append(toIndentedString(withdrawnAt)).append("\n");
        sb.append("    submission: ").append(toIndentedString(submission)).append("\n");
        sb.append("    vulnerabilities: ")
                .append(toIndentedString(vulnerabilities))
                .append("\n");
        sb.append("    cvssSeverities: ")
                .append(toIndentedString(cvssSeverities))
                .append("\n");
        sb.append("    cwes: ").append(toIndentedString(cwes)).append("\n");
        sb.append("    cweIds: ").append(toIndentedString(cweIds)).append("\n");
        sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
        sb.append("    creditsDetailed: ")
                .append(toIndentedString(creditsDetailed))
                .append("\n");
        sb.append("    collaboratingUsers: ")
                .append(toIndentedString(collaboratingUsers))
                .append("\n");
        sb.append("    collaboratingTeams: ")
                .append(toIndentedString(collaboratingTeams))
                .append("\n");
        sb.append("    privateFork: ").append(toIndentedString(privateFork)).append("\n");
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
