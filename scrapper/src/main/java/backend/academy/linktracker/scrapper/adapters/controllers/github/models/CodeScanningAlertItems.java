package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * CodeScanningAlertItems
 */
@JsonTypeName("code-scanning-alert-items")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningAlertItems {

    private Long number;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private URI url;

    private URI htmlUrl;

    private URI instancesUrl;

    private CodeScanningAlertState state = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime fixedAt = null;

    private NullableSimpleUser dismissedBy = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime dismissedAt = null;

    private CodeScanningAlertDismissedReason dismissedReason = null;

    private String dismissedComment = null;

    private CodeScanningAlertRuleSummary rule;

    private CodeScanningAnalysisTool tool;

    private CodeScanningAlertInstance mostRecentInstance;

    private NullableSimpleUser dismissalApprovedBy = null;

    @Valid
    private List<@Valid SimpleUser> assignees = new ArrayList<>();

    public CodeScanningAlertItems() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningAlertItems(
            Long number,
            OffsetDateTime createdAt,
            URI url,
            URI htmlUrl,
            URI instancesUrl,
            CodeScanningAlertState state,
            NullableSimpleUser dismissedBy,
            OffsetDateTime dismissedAt,
            CodeScanningAlertDismissedReason dismissedReason,
            CodeScanningAlertRuleSummary rule,
            CodeScanningAnalysisTool tool,
            CodeScanningAlertInstance mostRecentInstance) {
        this.number = number;
        this.createdAt = createdAt;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.instancesUrl = instancesUrl;
        this.state = state;
        this.dismissedBy = dismissedBy;
        this.dismissedAt = dismissedAt;
        this.dismissedReason = dismissedReason;
        this.rule = rule;
        this.tool = tool;
        this.mostRecentInstance = mostRecentInstance;
    }

    public CodeScanningAlertItems number(Long number) {
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

    public CodeScanningAlertItems createdAt(OffsetDateTime createdAt) {
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

    public CodeScanningAlertItems updatedAt(OffsetDateTime updatedAt) {
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
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CodeScanningAlertItems url(URI url) {
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

    public CodeScanningAlertItems htmlUrl(URI htmlUrl) {
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

    public CodeScanningAlertItems instancesUrl(URI instancesUrl) {
        this.instancesUrl = instancesUrl;
        return this;
    }

    /**
     * The REST API URL for fetching the list of instances for an alert.
     * @return instancesUrl
     */
    @Valid
    @Schema(
            name = "instances_url",
            accessMode = Schema.AccessMode.READ_ONLY,
            description = "The REST API URL for fetching the list of instances for an alert.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("instances_url")
    public URI getInstancesUrl() {
        return instancesUrl;
    }

    public void setInstancesUrl(URI instancesUrl) {
        this.instancesUrl = instancesUrl;
    }

    public CodeScanningAlertItems state(CodeScanningAlertState state) {
        this.state = state;
        return this;
    }

    /**
     * Get state
     * @return state
     */
    @NotNull
    @Valid
    @Schema(name = "state", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public CodeScanningAlertState getState() {
        return state;
    }

    public void setState(CodeScanningAlertState state) {
        this.state = state;
    }

    public CodeScanningAlertItems fixedAt(OffsetDateTime fixedAt) {
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
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fixed_at")
    public OffsetDateTime getFixedAt() {
        return fixedAt;
    }

    public void setFixedAt(OffsetDateTime fixedAt) {
        this.fixedAt = fixedAt;
    }

    public CodeScanningAlertItems dismissedBy(NullableSimpleUser dismissedBy) {
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

    public CodeScanningAlertItems dismissedAt(OffsetDateTime dismissedAt) {
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

    public CodeScanningAlertItems dismissedReason(CodeScanningAlertDismissedReason dismissedReason) {
        this.dismissedReason = dismissedReason;
        return this;
    }

    /**
     * Get dismissedReason
     * @return dismissedReason
     */
    @NotNull
    @Valid
    @Schema(name = "dismissed_reason", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissed_reason")
    public CodeScanningAlertDismissedReason getDismissedReason() {
        return dismissedReason;
    }

    public void setDismissedReason(CodeScanningAlertDismissedReason dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    public CodeScanningAlertItems dismissedComment(String dismissedComment) {
        this.dismissedComment = dismissedComment;
        return this;
    }

    /**
     * The dismissal comment associated with the dismissal of the alert.
     * @return dismissedComment
     */
    @Size(max = 280)
    @Schema(
            name = "dismissed_comment",
            description = "The dismissal comment associated with the dismissal of the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissed_comment")
    public String getDismissedComment() {
        return dismissedComment;
    }

    public void setDismissedComment(String dismissedComment) {
        this.dismissedComment = dismissedComment;
    }

    public CodeScanningAlertItems rule(CodeScanningAlertRuleSummary rule) {
        this.rule = rule;
        return this;
    }

    /**
     * Get rule
     * @return rule
     */
    @NotNull
    @Valid
    @Schema(name = "rule", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("rule")
    public CodeScanningAlertRuleSummary getRule() {
        return rule;
    }

    public void setRule(CodeScanningAlertRuleSummary rule) {
        this.rule = rule;
    }

    public CodeScanningAlertItems tool(CodeScanningAnalysisTool tool) {
        this.tool = tool;
        return this;
    }

    /**
     * Get tool
     * @return tool
     */
    @NotNull
    @Valid
    @Schema(name = "tool", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("tool")
    public CodeScanningAnalysisTool getTool() {
        return tool;
    }

    public void setTool(CodeScanningAnalysisTool tool) {
        this.tool = tool;
    }

    public CodeScanningAlertItems mostRecentInstance(CodeScanningAlertInstance mostRecentInstance) {
        this.mostRecentInstance = mostRecentInstance;
        return this;
    }

    /**
     * Get mostRecentInstance
     * @return mostRecentInstance
     */
    @NotNull
    @Valid
    @Schema(name = "most_recent_instance", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("most_recent_instance")
    public CodeScanningAlertInstance getMostRecentInstance() {
        return mostRecentInstance;
    }

    public void setMostRecentInstance(CodeScanningAlertInstance mostRecentInstance) {
        this.mostRecentInstance = mostRecentInstance;
    }

    public CodeScanningAlertItems dismissalApprovedBy(NullableSimpleUser dismissalApprovedBy) {
        this.dismissalApprovedBy = dismissalApprovedBy;
        return this;
    }

    /**
     * Get dismissalApprovedBy
     * @return dismissalApprovedBy
     */
    @Valid
    @Schema(name = "dismissal_approved_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissal_approved_by")
    public NullableSimpleUser getDismissalApprovedBy() {
        return dismissalApprovedBy;
    }

    public void setDismissalApprovedBy(NullableSimpleUser dismissalApprovedBy) {
        this.dismissalApprovedBy = dismissalApprovedBy;
    }

    public CodeScanningAlertItems assignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
        return this;
    }

    public CodeScanningAlertItems addAssigneesItem(SimpleUser assigneesItem) {
        if (this.assignees == null) {
            this.assignees = new ArrayList<>();
        }
        this.assignees.add(assigneesItem);
        return this;
    }

    /**
     * Get assignees
     * @return assignees
     */
    @Valid
    @Schema(name = "assignees", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        CodeScanningAlertItems codeScanningAlertItems = (CodeScanningAlertItems) o;
        return Objects.equals(this.number, codeScanningAlertItems.number)
                && Objects.equals(this.createdAt, codeScanningAlertItems.createdAt)
                && Objects.equals(this.updatedAt, codeScanningAlertItems.updatedAt)
                && Objects.equals(this.url, codeScanningAlertItems.url)
                && Objects.equals(this.htmlUrl, codeScanningAlertItems.htmlUrl)
                && Objects.equals(this.instancesUrl, codeScanningAlertItems.instancesUrl)
                && Objects.equals(this.state, codeScanningAlertItems.state)
                && Objects.equals(this.fixedAt, codeScanningAlertItems.fixedAt)
                && Objects.equals(this.dismissedBy, codeScanningAlertItems.dismissedBy)
                && Objects.equals(this.dismissedAt, codeScanningAlertItems.dismissedAt)
                && Objects.equals(this.dismissedReason, codeScanningAlertItems.dismissedReason)
                && Objects.equals(this.dismissedComment, codeScanningAlertItems.dismissedComment)
                && Objects.equals(this.rule, codeScanningAlertItems.rule)
                && Objects.equals(this.tool, codeScanningAlertItems.tool)
                && Objects.equals(this.mostRecentInstance, codeScanningAlertItems.mostRecentInstance)
                && Objects.equals(this.dismissalApprovedBy, codeScanningAlertItems.dismissalApprovedBy)
                && Objects.equals(this.assignees, codeScanningAlertItems.assignees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                number,
                createdAt,
                updatedAt,
                url,
                htmlUrl,
                instancesUrl,
                state,
                fixedAt,
                dismissedBy,
                dismissedAt,
                dismissedReason,
                dismissedComment,
                rule,
                tool,
                mostRecentInstance,
                dismissalApprovedBy,
                assignees);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CodeScanningAlertItems {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    instancesUrl: ").append(toIndentedString(instancesUrl)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    fixedAt: ").append(toIndentedString(fixedAt)).append("\n");
        sb.append("    dismissedBy: ").append(toIndentedString(dismissedBy)).append("\n");
        sb.append("    dismissedAt: ").append(toIndentedString(dismissedAt)).append("\n");
        sb.append("    dismissedReason: ")
                .append(toIndentedString(dismissedReason))
                .append("\n");
        sb.append("    dismissedComment: ")
                .append(toIndentedString(dismissedComment))
                .append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
        sb.append("    mostRecentInstance: ")
                .append(toIndentedString(mostRecentInstance))
                .append("\n");
        sb.append("    dismissalApprovedBy: ")
                .append(toIndentedString(dismissalApprovedBy))
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
