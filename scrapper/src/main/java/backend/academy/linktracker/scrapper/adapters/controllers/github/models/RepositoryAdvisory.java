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
 * A repository security advisory.
 */
@Schema(name = "repository-advisory", description = "A repository security advisory.")
@JsonTypeName("repository-advisory")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisory {

    private String ghsaId;

    private JsonNullable<String> cveId = JsonNullable.<String>undefined();

    private URI url;

    private URI htmlUrl;

    private String summary;

    private JsonNullable<@Size(max = 65535) String> description = JsonNullable.<String>undefined();

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

    private JsonNullable<SeverityEnum> severity = JsonNullable.<SeverityEnum>undefined();

    private JsonNullable<SimpleUser> author = JsonNullable.<SimpleUser>undefined();

    private JsonNullable<SimpleUser> publisher = JsonNullable.<SimpleUser>undefined();

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
    private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> publishedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> closedAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> withdrawnAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<RepositoryAdvisorySubmission> submission =
            JsonNullable.<RepositoryAdvisorySubmission>undefined();

    @Valid
    private JsonNullable<List<@Valid RepositoryAdvisoryVulnerability>> vulnerabilities =
            JsonNullable.<List<@Valid RepositoryAdvisoryVulnerability>>undefined();

    private JsonNullable<CvssSeverities> cvssSeverities = JsonNullable.<CvssSeverities>undefined();

    @Valid
    private JsonNullable<List<@Valid GlobalAdvisoryCwesInner>> cwes =
            JsonNullable.<List<@Valid GlobalAdvisoryCwesInner>>undefined();

    @Valid
    private JsonNullable<List<String>> cweIds = JsonNullable.<List<String>>undefined();

    @Valid
    private JsonNullable<List<@Valid RepositoryAdvisoryCreditsInner>> credits =
            JsonNullable.<List<@Valid RepositoryAdvisoryCreditsInner>>undefined();

    @Valid
    private JsonNullable<List<@Valid RepositoryAdvisoryCredit>> creditsDetailed =
            JsonNullable.<List<@Valid RepositoryAdvisoryCredit>>undefined();

    @Valid
    private JsonNullable<List<@Valid SimpleUser>> collaboratingUsers =
            JsonNullable.<List<@Valid SimpleUser>>undefined();

    @Valid
    private JsonNullable<List<@Valid Team>> collaboratingTeams = JsonNullable.<List<@Valid Team>>undefined();

    private JsonNullable<SimpleRepository> privateFork = JsonNullable.<SimpleRepository>undefined();

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
        this.cveId = JsonNullable.of(cveId);
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.summary = summary;
        this.description = JsonNullable.of(description);
        this.severity = JsonNullable.of(severity);
        this.author = JsonNullable.of(author);
        this.publisher = JsonNullable.of(publisher);
        this.identifiers = identifiers;
        this.state = state;
        this.createdAt = JsonNullable.of(createdAt);
        this.updatedAt = JsonNullable.of(updatedAt);
        this.publishedAt = JsonNullable.of(publishedAt);
        this.closedAt = JsonNullable.of(closedAt);
        this.withdrawnAt = JsonNullable.of(withdrawnAt);
        this.submission = JsonNullable.of(submission);
        this.vulnerabilities = JsonNullable.of(vulnerabilities);
        this.cwes = JsonNullable.of(cwes);
        this.cweIds = JsonNullable.of(cweIds);
        this.credits = JsonNullable.of(credits);
        this.creditsDetailed = JsonNullable.of(creditsDetailed);
        this.collaboratingUsers = JsonNullable.of(collaboratingUsers);
        this.collaboratingTeams = JsonNullable.of(collaboratingTeams);
        this.privateFork = JsonNullable.of(privateFork);
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
        this.cveId = JsonNullable.of(cveId);
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
    public JsonNullable<String> getCveId() {
        return cveId;
    }

    public void setCveId(JsonNullable<String> cveId) {
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

    public RepositoryAdvisory severity(SeverityEnum severity) {
        this.severity = JsonNullable.of(severity);
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
    public JsonNullable<SeverityEnum> getSeverity() {
        return severity;
    }

    public void setSeverity(JsonNullable<SeverityEnum> severity) {
        this.severity = severity;
    }

    public RepositoryAdvisory author(SimpleUser author) {
        this.author = JsonNullable.of(author);
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
    public JsonNullable<SimpleUser> getAuthor() {
        return author;
    }

    public void setAuthor(JsonNullable<SimpleUser> author) {
        this.author = author;
    }

    public RepositoryAdvisory publisher(SimpleUser publisher) {
        this.publisher = JsonNullable.of(publisher);
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
    public JsonNullable<SimpleUser> getPublisher() {
        return publisher;
    }

    public void setPublisher(JsonNullable<SimpleUser> publisher) {
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
        this.createdAt = JsonNullable.of(createdAt);
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
    public JsonNullable<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public RepositoryAdvisory updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
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
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RepositoryAdvisory publishedAt(OffsetDateTime publishedAt) {
        this.publishedAt = JsonNullable.of(publishedAt);
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
    public JsonNullable<OffsetDateTime> getPublishedAt() {
        return publishedAt;
    }

    public void setPublishedAt(JsonNullable<OffsetDateTime> publishedAt) {
        this.publishedAt = publishedAt;
    }

    public RepositoryAdvisory closedAt(OffsetDateTime closedAt) {
        this.closedAt = JsonNullable.of(closedAt);
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
    public JsonNullable<OffsetDateTime> getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(JsonNullable<OffsetDateTime> closedAt) {
        this.closedAt = closedAt;
    }

    public RepositoryAdvisory withdrawnAt(OffsetDateTime withdrawnAt) {
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

    public RepositoryAdvisory submission(RepositoryAdvisorySubmission submission) {
        this.submission = JsonNullable.of(submission);
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
    public JsonNullable<RepositoryAdvisorySubmission> getSubmission() {
        return submission;
    }

    public void setSubmission(JsonNullable<RepositoryAdvisorySubmission> submission) {
        this.submission = submission;
    }

    public RepositoryAdvisory vulnerabilities(List<@Valid RepositoryAdvisoryVulnerability> vulnerabilities) {
        this.vulnerabilities = JsonNullable.of(vulnerabilities);
        return this;
    }

    public RepositoryAdvisory addVulnerabilitiesItem(RepositoryAdvisoryVulnerability vulnerabilitiesItem) {
        if (this.vulnerabilities == null || !this.vulnerabilities.isPresent()) {
            this.vulnerabilities = JsonNullable.of(new ArrayList<>());
        }
        this.vulnerabilities.get().add(vulnerabilitiesItem);
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
    public JsonNullable<List<@Valid RepositoryAdvisoryVulnerability>> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(JsonNullable<List<@Valid RepositoryAdvisoryVulnerability>> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public RepositoryAdvisory cvssSeverities(CvssSeverities cvssSeverities) {
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

    public RepositoryAdvisory cwes(List<@Valid GlobalAdvisoryCwesInner> cwes) {
        this.cwes = JsonNullable.of(cwes);
        return this;
    }

    public RepositoryAdvisory addCwesItem(GlobalAdvisoryCwesInner cwesItem) {
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
    @Valid
    @Schema(name = "cwes", accessMode = Schema.AccessMode.READ_ONLY, requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cwes")
    public JsonNullable<List<@Valid GlobalAdvisoryCwesInner>> getCwes() {
        return cwes;
    }

    public void setCwes(JsonNullable<List<@Valid GlobalAdvisoryCwesInner>> cwes) {
        this.cwes = cwes;
    }

    public RepositoryAdvisory cweIds(List<String> cweIds) {
        this.cweIds = JsonNullable.of(cweIds);
        return this;
    }

    public RepositoryAdvisory addCweIdsItem(String cweIdsItem) {
        if (this.cweIds == null || !this.cweIds.isPresent()) {
            this.cweIds = JsonNullable.of(new ArrayList<>());
        }
        this.cweIds.get().add(cweIdsItem);
        return this;
    }

    /**
     * A list of only the CWE IDs.
     * @return cweIds
     */
    @NotNull
    @Schema(name = "cwe_ids", description = "A list of only the CWE IDs.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("cwe_ids")
    public JsonNullable<List<String>> getCweIds() {
        return cweIds;
    }

    public void setCweIds(JsonNullable<List<String>> cweIds) {
        this.cweIds = cweIds;
    }

    public RepositoryAdvisory credits(List<@Valid RepositoryAdvisoryCreditsInner> credits) {
        this.credits = JsonNullable.of(credits);
        return this;
    }

    public RepositoryAdvisory addCreditsItem(RepositoryAdvisoryCreditsInner creditsItem) {
        if (this.credits == null || !this.credits.isPresent()) {
            this.credits = JsonNullable.of(new ArrayList<>());
        }
        this.credits.get().add(creditsItem);
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
    public JsonNullable<List<@Valid RepositoryAdvisoryCreditsInner>> getCredits() {
        return credits;
    }

    public void setCredits(JsonNullable<List<@Valid RepositoryAdvisoryCreditsInner>> credits) {
        this.credits = credits;
    }

    public RepositoryAdvisory creditsDetailed(List<@Valid RepositoryAdvisoryCredit> creditsDetailed) {
        this.creditsDetailed = JsonNullable.of(creditsDetailed);
        return this;
    }

    public RepositoryAdvisory addCreditsDetailedItem(RepositoryAdvisoryCredit creditsDetailedItem) {
        if (this.creditsDetailed == null || !this.creditsDetailed.isPresent()) {
            this.creditsDetailed = JsonNullable.of(new ArrayList<>());
        }
        this.creditsDetailed.get().add(creditsDetailedItem);
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
    public JsonNullable<List<@Valid RepositoryAdvisoryCredit>> getCreditsDetailed() {
        return creditsDetailed;
    }

    public void setCreditsDetailed(JsonNullable<List<@Valid RepositoryAdvisoryCredit>> creditsDetailed) {
        this.creditsDetailed = creditsDetailed;
    }

    public RepositoryAdvisory collaboratingUsers(List<@Valid SimpleUser> collaboratingUsers) {
        this.collaboratingUsers = JsonNullable.of(collaboratingUsers);
        return this;
    }

    public RepositoryAdvisory addCollaboratingUsersItem(SimpleUser collaboratingUsersItem) {
        if (this.collaboratingUsers == null || !this.collaboratingUsers.isPresent()) {
            this.collaboratingUsers = JsonNullable.of(new ArrayList<>());
        }
        this.collaboratingUsers.get().add(collaboratingUsersItem);
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
    public JsonNullable<List<@Valid SimpleUser>> getCollaboratingUsers() {
        return collaboratingUsers;
    }

    public void setCollaboratingUsers(JsonNullable<List<@Valid SimpleUser>> collaboratingUsers) {
        this.collaboratingUsers = collaboratingUsers;
    }

    public RepositoryAdvisory collaboratingTeams(List<@Valid Team> collaboratingTeams) {
        this.collaboratingTeams = JsonNullable.of(collaboratingTeams);
        return this;
    }

    public RepositoryAdvisory addCollaboratingTeamsItem(Team collaboratingTeamsItem) {
        if (this.collaboratingTeams == null || !this.collaboratingTeams.isPresent()) {
            this.collaboratingTeams = JsonNullable.of(new ArrayList<>());
        }
        this.collaboratingTeams.get().add(collaboratingTeamsItem);
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
    public JsonNullable<List<@Valid Team>> getCollaboratingTeams() {
        return collaboratingTeams;
    }

    public void setCollaboratingTeams(JsonNullable<List<@Valid Team>> collaboratingTeams) {
        this.collaboratingTeams = collaboratingTeams;
    }

    public RepositoryAdvisory privateFork(SimpleRepository privateFork) {
        this.privateFork = JsonNullable.of(privateFork);
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
    public JsonNullable<SimpleRepository> getPrivateFork() {
        return privateFork;
    }

    public void setPrivateFork(JsonNullable<SimpleRepository> privateFork) {
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
                && equalsNullable(this.cvssSeverities, repositoryAdvisory.cvssSeverities)
                && Objects.equals(this.cwes, repositoryAdvisory.cwes)
                && Objects.equals(this.cweIds, repositoryAdvisory.cweIds)
                && Objects.equals(this.credits, repositoryAdvisory.credits)
                && Objects.equals(this.creditsDetailed, repositoryAdvisory.creditsDetailed)
                && Objects.equals(this.collaboratingUsers, repositoryAdvisory.collaboratingUsers)
                && Objects.equals(this.collaboratingTeams, repositoryAdvisory.collaboratingTeams)
                && Objects.equals(this.privateFork, repositoryAdvisory.privateFork);
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
                hashCodeNullable(cvssSeverities),
                cwes,
                cweIds,
                credits,
                creditsDetailed,
                collaboratingUsers,
                collaboratingTeams,
                privateFork);
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
