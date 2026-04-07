package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Size;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * RepositoryAdvisoryUpdate
 */
@JsonTypeName("repository-advisory-update")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisoryUpdate {

    private Optional<@Size(max = 1024) String> summary = Optional.empty();

    private Optional<@Size(max = 65535) String> description = Optional.empty();

    private JsonNullable<String> cveId = JsonNullable.<String>undefined();

    @Valid
    private List<@Valid RepositoryAdvisoryCreateVulnerabilitiesInner> vulnerabilities = new ArrayList<>();

    @Valid
    private JsonNullable<List<String>> cweIds = JsonNullable.<List<String>>undefined();

    @Valid
    private JsonNullable<List<@Valid RepositoryAdvisoryCreateCreditsInner>> credits =
            JsonNullable.<List<@Valid RepositoryAdvisoryCreateCreditsInner>>undefined();

    /**
     * The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
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

    private JsonNullable<String> cvssVectorString = JsonNullable.<String>undefined();

    /**
     * The state of the advisory.
     */
    public enum StateEnum {
        PUBLISHED("published"),

        CLOSED("closed"),

        DRAFT("draft");

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

    private Optional<StateEnum> state = Optional.empty();

    @Valid
    private JsonNullable<List<String>> collaboratingUsers = JsonNullable.<List<String>>undefined();

    @Valid
    private JsonNullable<List<String>> collaboratingTeams = JsonNullable.<List<String>>undefined();

    public RepositoryAdvisoryUpdate summary(String summary) {
        this.summary = Optional.ofNullable(summary);
        return this;
    }

    /**
     * A short summary of the advisory.
     * @return summary
     */
    @Schema(
            name = "summary",
            description = "A short summary of the advisory.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("summary")
    public Optional<@Size(max = 1024) String> getSummary() {
        return summary;
    }

    public void setSummary(Optional<String> summary) {
        this.summary = summary;
    }

    public RepositoryAdvisoryUpdate description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * A detailed description of what the advisory impacts.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A detailed description of what the advisory impacts.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<@Size(max = 65535) String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public RepositoryAdvisoryUpdate cveId(String cveId) {
        this.cveId = JsonNullable.of(cveId);
        return this;
    }

    /**
     * The Common Vulnerabilities and Exposures (CVE) ID.
     * @return cveId
     */
    @Schema(
            name = "cve_id",
            description = "The Common Vulnerabilities and Exposures (CVE) ID.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cve_id")
    public JsonNullable<String> getCveId() {
        return cveId;
    }

    public void setCveId(JsonNullable<String> cveId) {
        this.cveId = cveId;
    }

    public RepositoryAdvisoryUpdate vulnerabilities(
            List<@Valid RepositoryAdvisoryCreateVulnerabilitiesInner> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
        return this;
    }

    public RepositoryAdvisoryUpdate addVulnerabilitiesItem(
            RepositoryAdvisoryCreateVulnerabilitiesInner vulnerabilitiesItem) {
        if (this.vulnerabilities == null) {
            this.vulnerabilities = new ArrayList<>();
        }
        this.vulnerabilities.add(vulnerabilitiesItem);
        return this;
    }

    /**
     * A product affected by the vulnerability detailed in a repository security advisory.
     * @return vulnerabilities
     */
    @Valid
    @Schema(
            name = "vulnerabilities",
            description = "A product affected by the vulnerability detailed in a repository security advisory.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("vulnerabilities")
    public List<@Valid RepositoryAdvisoryCreateVulnerabilitiesInner> getVulnerabilities() {
        return vulnerabilities;
    }

    public void setVulnerabilities(List<@Valid RepositoryAdvisoryCreateVulnerabilitiesInner> vulnerabilities) {
        this.vulnerabilities = vulnerabilities;
    }

    public RepositoryAdvisoryUpdate cweIds(List<String> cweIds) {
        this.cweIds = JsonNullable.of(cweIds);
        return this;
    }

    public RepositoryAdvisoryUpdate addCweIdsItem(String cweIdsItem) {
        if (this.cweIds == null || !this.cweIds.isPresent()) {
            this.cweIds = JsonNullable.of(new ArrayList<>());
        }
        this.cweIds.get().add(cweIdsItem);
        return this;
    }

    /**
     * A list of Common Weakness Enumeration (CWE) IDs.
     * @return cweIds
     */
    @Schema(
            name = "cwe_ids",
            description = "A list of Common Weakness Enumeration (CWE) IDs.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cwe_ids")
    public JsonNullable<List<String>> getCweIds() {
        return cweIds;
    }

    public void setCweIds(JsonNullable<List<String>> cweIds) {
        this.cweIds = cweIds;
    }

    public RepositoryAdvisoryUpdate credits(List<@Valid RepositoryAdvisoryCreateCreditsInner> credits) {
        this.credits = JsonNullable.of(credits);
        return this;
    }

    public RepositoryAdvisoryUpdate addCreditsItem(RepositoryAdvisoryCreateCreditsInner creditsItem) {
        if (this.credits == null || !this.credits.isPresent()) {
            this.credits = JsonNullable.of(new ArrayList<>());
        }
        this.credits.get().add(creditsItem);
        return this;
    }

    /**
     * A list of users receiving credit for their participation in the security advisory.
     * @return credits
     */
    @Valid
    @Schema(
            name = "credits",
            description = "A list of users receiving credit for their participation in the security advisory.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("credits")
    public JsonNullable<List<@Valid RepositoryAdvisoryCreateCreditsInner>> getCredits() {
        return credits;
    }

    public void setCredits(JsonNullable<List<@Valid RepositoryAdvisoryCreateCreditsInner>> credits) {
        this.credits = credits;
    }

    public RepositoryAdvisoryUpdate severity(SeverityEnum severity) {
        this.severity = JsonNullable.of(severity);
        return this;
    }

    /**
     * The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.
     * @return severity
     */
    @Schema(
            name = "severity",
            description =
                    "The severity of the advisory. You must choose between setting this field or `cvss_vector_string`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("severity")
    public JsonNullable<SeverityEnum> getSeverity() {
        return severity;
    }

    public void setSeverity(JsonNullable<SeverityEnum> severity) {
        this.severity = severity;
    }

    public RepositoryAdvisoryUpdate cvssVectorString(String cvssVectorString) {
        this.cvssVectorString = JsonNullable.of(cvssVectorString);
        return this;
    }

    /**
     * The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or `severity`.
     * @return cvssVectorString
     */
    @Schema(
            name = "cvss_vector_string",
            description =
                    "The CVSS vector that calculates the severity of the advisory. You must choose between setting this field or `severity`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("cvss_vector_string")
    public JsonNullable<String> getCvssVectorString() {
        return cvssVectorString;
    }

    public void setCvssVectorString(JsonNullable<String> cvssVectorString) {
        this.cvssVectorString = cvssVectorString;
    }

    public RepositoryAdvisoryUpdate state(StateEnum state) {
        this.state = Optional.ofNullable(state);
        return this;
    }

    /**
     * The state of the advisory.
     * @return state
     */
    @Schema(name = "state", description = "The state of the advisory.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("state")
    public Optional<StateEnum> getState() {
        return state;
    }

    public void setState(Optional<StateEnum> state) {
        this.state = state;
    }

    public RepositoryAdvisoryUpdate collaboratingUsers(List<String> collaboratingUsers) {
        this.collaboratingUsers = JsonNullable.of(collaboratingUsers);
        return this;
    }

    public RepositoryAdvisoryUpdate addCollaboratingUsersItem(String collaboratingUsersItem) {
        if (this.collaboratingUsers == null || !this.collaboratingUsers.isPresent()) {
            this.collaboratingUsers = JsonNullable.of(new ArrayList<>());
        }
        this.collaboratingUsers.get().add(collaboratingUsersItem);
        return this;
    }

    /**
     * A list of usernames who have been granted write access to the advisory.
     * @return collaboratingUsers
     */
    @Schema(
            name = "collaborating_users",
            description = "A list of usernames who have been granted write access to the advisory.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collaborating_users")
    public JsonNullable<List<String>> getCollaboratingUsers() {
        return collaboratingUsers;
    }

    public void setCollaboratingUsers(JsonNullable<List<String>> collaboratingUsers) {
        this.collaboratingUsers = collaboratingUsers;
    }

    public RepositoryAdvisoryUpdate collaboratingTeams(List<String> collaboratingTeams) {
        this.collaboratingTeams = JsonNullable.of(collaboratingTeams);
        return this;
    }

    public RepositoryAdvisoryUpdate addCollaboratingTeamsItem(String collaboratingTeamsItem) {
        if (this.collaboratingTeams == null || !this.collaboratingTeams.isPresent()) {
            this.collaboratingTeams = JsonNullable.of(new ArrayList<>());
        }
        this.collaboratingTeams.get().add(collaboratingTeamsItem);
        return this;
    }

    /**
     * A list of team slugs which have been granted write access to the advisory.
     * @return collaboratingTeams
     */
    @Schema(
            name = "collaborating_teams",
            description = "A list of team slugs which have been granted write access to the advisory.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collaborating_teams")
    public JsonNullable<List<String>> getCollaboratingTeams() {
        return collaboratingTeams;
    }

    public void setCollaboratingTeams(JsonNullable<List<String>> collaboratingTeams) {
        this.collaboratingTeams = collaboratingTeams;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryAdvisoryUpdate repositoryAdvisoryUpdate = (RepositoryAdvisoryUpdate) o;
        return Objects.equals(this.summary, repositoryAdvisoryUpdate.summary)
                && Objects.equals(this.description, repositoryAdvisoryUpdate.description)
                && equalsNullable(this.cveId, repositoryAdvisoryUpdate.cveId)
                && Objects.equals(this.vulnerabilities, repositoryAdvisoryUpdate.vulnerabilities)
                && equalsNullable(this.cweIds, repositoryAdvisoryUpdate.cweIds)
                && equalsNullable(this.credits, repositoryAdvisoryUpdate.credits)
                && equalsNullable(this.severity, repositoryAdvisoryUpdate.severity)
                && equalsNullable(this.cvssVectorString, repositoryAdvisoryUpdate.cvssVectorString)
                && Objects.equals(this.state, repositoryAdvisoryUpdate.state)
                && equalsNullable(this.collaboratingUsers, repositoryAdvisoryUpdate.collaboratingUsers)
                && equalsNullable(this.collaboratingTeams, repositoryAdvisoryUpdate.collaboratingTeams);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                summary,
                description,
                hashCodeNullable(cveId),
                vulnerabilities,
                hashCodeNullable(cweIds),
                hashCodeNullable(credits),
                hashCodeNullable(severity),
                hashCodeNullable(cvssVectorString),
                state,
                hashCodeNullable(collaboratingUsers),
                hashCodeNullable(collaboratingTeams));
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
        sb.append("class RepositoryAdvisoryUpdate {\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    cveId: ").append(toIndentedString(cveId)).append("\n");
        sb.append("    vulnerabilities: ")
                .append(toIndentedString(vulnerabilities))
                .append("\n");
        sb.append("    cweIds: ").append(toIndentedString(cweIds)).append("\n");
        sb.append("    credits: ").append(toIndentedString(credits)).append("\n");
        sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
        sb.append("    cvssVectorString: ")
                .append(toIndentedString(cvssVectorString))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    collaboratingUsers: ")
                .append(toIndentedString(collaboratingUsers))
                .append("\n");
        sb.append("    collaboratingTeams: ")
                .append(toIndentedString(collaboratingTeams))
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
