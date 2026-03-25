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
 * A Dependabot alert.
 */
@Schema(name = "dependabot-alert", description = "A Dependabot alert.")
@JsonTypeName("dependabot-alert")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotAlert {

    private Long number;

    /**
     * The state of the Dependabot alert.
     */
    public enum StateEnum {
        AUTO_DISMISSED("auto_dismissed"),

        DISMISSED("dismissed"),

        FIXED("fixed"),

        OPEN("open");

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

    private DependabotAlertWithRepositoryDependency dependency;

    private DependabotAlertSecurityAdvisory securityAdvisory;

    private DependabotAlertSecurityVulnerability securityVulnerability;

    private URI url;

    private URI htmlUrl;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime dismissedAt = null;

    private NullableSimpleUser dismissedBy = null;

    /**
     * The reason that the alert was dismissed.
     */
    public enum DismissedReasonEnum {
        FIX_STARTED("fix_started"),

        INACCURATE("inaccurate"),

        NO_BANDWIDTH("no_bandwidth"),

        NOT_USED("not_used"),

        TOLERABLE_RISK("tolerable_risk");

        private final String value;

        DismissedReasonEnum(String value) {
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
        public static DismissedReasonEnum fromValue(String value) {
            for (DismissedReasonEnum b : DismissedReasonEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            return null;
        }
    }

    private DismissedReasonEnum dismissedReason = null;

    private String dismissedComment = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime fixedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime autoDismissedAt = null;

    private DependabotAlertDismissalRequestSimple dismissalRequest = null;

    @Valid
    private List<@Valid SimpleUser> assignees = new ArrayList<>();

    public DependabotAlert() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public DependabotAlert(
            Long number,
            StateEnum state,
            DependabotAlertWithRepositoryDependency dependency,
            DependabotAlertSecurityAdvisory securityAdvisory,
            DependabotAlertSecurityVulnerability securityVulnerability,
            URI url,
            URI htmlUrl,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            OffsetDateTime dismissedAt,
            NullableSimpleUser dismissedBy,
            DismissedReasonEnum dismissedReason,
            String dismissedComment,
            OffsetDateTime fixedAt) {
        this.number = number;
        this.state = state;
        this.dependency = dependency;
        this.securityAdvisory = securityAdvisory;
        this.securityVulnerability = securityVulnerability;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.dismissedAt = dismissedAt;
        this.dismissedBy = dismissedBy;
        this.dismissedReason = dismissedReason;
        this.dismissedComment = dismissedComment;
        this.fixedAt = fixedAt;
    }

    public DependabotAlert number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * The security alert number.
     * @return number
     */
    @Schema(
            name = "number",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The security alert number.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public DependabotAlert state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the Dependabot alert.
     * @return state
     */
    @Schema(
            name = "state",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The state of the Dependabot alert.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public DependabotAlert dependency(DependabotAlertWithRepositoryDependency dependency) {
        this.dependency = dependency;
        return this;
    }

    /**
     * Get dependency
     * @return dependency
     */
    @NotNull
    @Valid
    @Schema(name = "dependency", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dependency")
    public DependabotAlertWithRepositoryDependency getDependency() {
        return dependency;
    }

    public void setDependency(DependabotAlertWithRepositoryDependency dependency) {
        this.dependency = dependency;
    }

    public DependabotAlert securityAdvisory(DependabotAlertSecurityAdvisory securityAdvisory) {
        this.securityAdvisory = securityAdvisory;
        return this;
    }

    /**
     * Get securityAdvisory
     * @return securityAdvisory
     */
    @NotNull
    @Valid
    @Schema(name = "security_advisory", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("security_advisory")
    public DependabotAlertSecurityAdvisory getSecurityAdvisory() {
        return securityAdvisory;
    }

    public void setSecurityAdvisory(DependabotAlertSecurityAdvisory securityAdvisory) {
        this.securityAdvisory = securityAdvisory;
    }

    public DependabotAlert securityVulnerability(DependabotAlertSecurityVulnerability securityVulnerability) {
        this.securityVulnerability = securityVulnerability;
        return this;
    }

    /**
     * Get securityVulnerability
     * @return securityVulnerability
     */
    @NotNull
    @Valid
    @Schema(name = "security_vulnerability", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("security_vulnerability")
    public DependabotAlertSecurityVulnerability getSecurityVulnerability() {
        return securityVulnerability;
    }

    public void setSecurityVulnerability(DependabotAlertSecurityVulnerability securityVulnerability) {
        this.securityVulnerability = securityVulnerability;
    }

    public DependabotAlert url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * The REST API URL of the alert resource.
     * @return url
     */
    @Valid
    @Schema(
            name = "url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The REST API URL of the alert resource.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public DependabotAlert htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * The GitHub URL of the alert resource.
     * @return htmlUrl
     */
    @Valid
    @Schema(
            name = "html_url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The GitHub URL of the alert resource.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public DependabotAlert createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return createdAt
     */
    @Valid
    @Schema(
            name = "created_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public DependabotAlert updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return updatedAt
     */
    @Valid
    @Schema(
            name = "updated_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The time that the alert was last updated in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public DependabotAlert dismissedAt(OffsetDateTime dismissedAt) {
        this.dismissedAt = dismissedAt;
        return this;
    }

    /**
     * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return dismissedAt
     */
    @Valid
    @Schema(
            name = "dismissed_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissed_at")
    public OffsetDateTime getDismissedAt() {
        return dismissedAt;
    }

    public void setDismissedAt(OffsetDateTime dismissedAt) {
        this.dismissedAt = dismissedAt;
    }

    public DependabotAlert dismissedBy(NullableSimpleUser dismissedBy) {
        this.dismissedBy = dismissedBy;
        return this;
    }

    /**
     * Get dismissedBy
     * @return dismissedBy
     */
    @NotNull
    @Valid
    @Schema(name = "dismissed_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissed_by")
    public NullableSimpleUser getDismissedBy() {
        return dismissedBy;
    }

    public void setDismissedBy(NullableSimpleUser dismissedBy) {
        this.dismissedBy = dismissedBy;
    }

    public DependabotAlert dismissedReason(DismissedReasonEnum dismissedReason) {
        this.dismissedReason = dismissedReason;
        return this;
    }

    /**
     * The reason that the alert was dismissed.
     * @return dismissedReason
     */
    @NotNull
    @Schema(
            name = "dismissed_reason",
            description = "The reason that the alert was dismissed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissed_reason")
    public DismissedReasonEnum getDismissedReason() {
        return dismissedReason;
    }

    public void setDismissedReason(DismissedReasonEnum dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    public DependabotAlert dismissedComment(String dismissedComment) {
        this.dismissedComment = dismissedComment;
        return this;
    }

    /**
     * An optional comment associated with the alert's dismissal.
     * @return dismissedComment
     */
    @NotNull
    @Size(max = 280)
    @Schema(
            name = "dismissed_comment",
            description = "An optional comment associated with the alert's dismissal.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissed_comment")
    public String getDismissedComment() {
        return dismissedComment;
    }

    public void setDismissedComment(String dismissedComment) {
        this.dismissedComment = dismissedComment;
    }

    public DependabotAlert fixedAt(OffsetDateTime fixedAt) {
        this.fixedAt = fixedAt;
        return this;
    }

    /**
     * The time that the alert was no longer detected and was considered fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return fixedAt
     */
    @Valid
    @Schema(
            name = "fixed_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description =
                    "The time that the alert was no longer detected and was considered fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("fixed_at")
    public OffsetDateTime getFixedAt() {
        return fixedAt;
    }

    public void setFixedAt(OffsetDateTime fixedAt) {
        this.fixedAt = fixedAt;
    }

    public DependabotAlert autoDismissedAt(OffsetDateTime autoDismissedAt) {
        this.autoDismissedAt = autoDismissedAt;
        return this;
    }

    /**
     * The time that the alert was auto-dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return autoDismissedAt
     */
    @Valid
    @Schema(
            name = "auto_dismissed_at",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The time that the alert was auto-dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("auto_dismissed_at")
    public OffsetDateTime getAutoDismissedAt() {
        return autoDismissedAt;
    }

    public void setAutoDismissedAt(OffsetDateTime autoDismissedAt) {
        this.autoDismissedAt = autoDismissedAt;
    }

    public DependabotAlert dismissalRequest(DependabotAlertDismissalRequestSimple dismissalRequest) {
        this.dismissalRequest = dismissalRequest;
        return this;
    }

    /**
     * Get dismissalRequest
     * @return dismissalRequest
     */
    @Valid
    @Schema(name = "dismissal_request", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissal_request")
    public DependabotAlertDismissalRequestSimple getDismissalRequest() {
        return dismissalRequest;
    }

    public void setDismissalRequest(DependabotAlertDismissalRequestSimple dismissalRequest) {
        this.dismissalRequest = dismissalRequest;
    }

    public DependabotAlert assignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
        return this;
    }

    public DependabotAlert addAssigneesItem(SimpleUser assigneesItem) {
        if (this.assignees == null) {
            this.assignees = new ArrayList<>();
        }
        this.assignees.add(assigneesItem);
        return this;
    }

    /**
     * The users assigned to this alert.
     * @return assignees
     */
    @Valid
    @Schema(
            name = "assignees",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The users assigned to this alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("assignees")
    public List<@Valid SimpleUser> getAssignees() {
        return assignees;
    }

    public void setAssignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotAlert dependabotAlert = (DependabotAlert) o;
        return Objects.equals(this.number, dependabotAlert.number)
                && Objects.equals(this.state, dependabotAlert.state)
                && Objects.equals(this.dependency, dependabotAlert.dependency)
                && Objects.equals(this.securityAdvisory, dependabotAlert.securityAdvisory)
                && Objects.equals(this.securityVulnerability, dependabotAlert.securityVulnerability)
                && Objects.equals(this.url, dependabotAlert.url)
                && Objects.equals(this.htmlUrl, dependabotAlert.htmlUrl)
                && Objects.equals(this.createdAt, dependabotAlert.createdAt)
                && Objects.equals(this.updatedAt, dependabotAlert.updatedAt)
                && Objects.equals(this.dismissedAt, dependabotAlert.dismissedAt)
                && Objects.equals(this.dismissedBy, dependabotAlert.dismissedBy)
                && Objects.equals(this.dismissedReason, dependabotAlert.dismissedReason)
                && Objects.equals(this.dismissedComment, dependabotAlert.dismissedComment)
                && Objects.equals(this.fixedAt, dependabotAlert.fixedAt)
                && Objects.equals(this.autoDismissedAt, dependabotAlert.autoDismissedAt)
                && Objects.equals(this.dismissalRequest, dependabotAlert.dismissalRequest)
                && Objects.equals(this.assignees, dependabotAlert.assignees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                number,
                state,
                dependency,
                securityAdvisory,
                securityVulnerability,
                url,
                htmlUrl,
                createdAt,
                updatedAt,
                dismissedAt,
                dismissedBy,
                dismissedReason,
                dismissedComment,
                fixedAt,
                autoDismissedAt,
                dismissalRequest,
                assignees);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotAlert {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    dependency: ").append(toIndentedString(dependency)).append("\n");
        sb.append("    securityAdvisory: ")
                .append(toIndentedString(securityAdvisory))
                .append("\n");
        sb.append("    securityVulnerability: ")
                .append(toIndentedString(securityVulnerability))
                .append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    dismissedAt: ").append(toIndentedString(dismissedAt)).append("\n");
        sb.append("    dismissedBy: ").append(toIndentedString(dismissedBy)).append("\n");
        sb.append("    dismissedReason: ")
                .append(toIndentedString(dismissedReason))
                .append("\n");
        sb.append("    dismissedComment: ")
                .append(toIndentedString(dismissedComment))
                .append("\n");
        sb.append("    fixedAt: ").append(toIndentedString(fixedAt)).append("\n");
        sb.append("    autoDismissedAt: ")
                .append(toIndentedString(autoDismissedAt))
                .append("\n");
        sb.append("    dismissalRequest: ")
                .append(toIndentedString(dismissalRequest))
                .append("\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
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
