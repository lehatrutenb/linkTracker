package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
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
 * CodeScanningOrganizationAlertItems
 */
@JsonTypeName("code-scanning-organization-alert-items")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CodeScanningOrganizationAlertItems {

    private Long number;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> updatedAt = Optional.empty();

    private URI url;

    private URI htmlUrl;

    private URI instancesUrl;

    private JsonNullable<CodeScanningAlertState> state = JsonNullable.<CodeScanningAlertState>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> fixedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<NullableSimpleUser> dismissedBy = JsonNullable.<NullableSimpleUser>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> dismissedAt = JsonNullable.<OffsetDateTime>undefined();

    private JsonNullable<CodeScanningAlertDismissedReason> dismissedReason =
            JsonNullable.<CodeScanningAlertDismissedReason>undefined();

    private JsonNullable<@Size(max = 280) String> dismissedComment = JsonNullable.<String>undefined();

    private CodeScanningAlertRuleSummary rule;

    private CodeScanningAnalysisTool tool;

    private CodeScanningAlertInstance mostRecentInstance;

    private SimpleRepository repository;

    private JsonNullable<NullableSimpleUser> dismissalApprovedBy = JsonNullable.<NullableSimpleUser>undefined();

    @Valid
    private List<@Valid SimpleUser> assignees = new ArrayList<>();

    public CodeScanningOrganizationAlertItems() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CodeScanningOrganizationAlertItems(
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
            CodeScanningAlertInstance mostRecentInstance,
            SimpleRepository repository) {
        this.number = number;
        this.createdAt = createdAt;
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.instancesUrl = instancesUrl;
        this.state = JsonNullable.of(state);
        this.dismissedBy = JsonNullable.of(dismissedBy);
        this.dismissedAt = JsonNullable.of(dismissedAt);
        this.dismissedReason = JsonNullable.of(dismissedReason);
        this.rule = rule;
        this.tool = tool;
        this.mostRecentInstance = mostRecentInstance;
        this.repository = repository;
    }

    public CodeScanningOrganizationAlertItems number(Long number) {
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

    public CodeScanningOrganizationAlertItems createdAt(OffsetDateTime createdAt) {
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

    public CodeScanningOrganizationAlertItems updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
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
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CodeScanningOrganizationAlertItems url(URI url) {
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

    public CodeScanningOrganizationAlertItems htmlUrl(URI htmlUrl) {
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

    public CodeScanningOrganizationAlertItems instancesUrl(URI instancesUrl) {
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

    public CodeScanningOrganizationAlertItems state(CodeScanningAlertState state) {
        this.state = JsonNullable.of(state);
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
    public JsonNullable<CodeScanningAlertState> getState() {
        return state;
    }

    public void setState(JsonNullable<CodeScanningAlertState> state) {
        this.state = state;
    }

    public CodeScanningOrganizationAlertItems fixedAt(OffsetDateTime fixedAt) {
        this.fixedAt = JsonNullable.of(fixedAt);
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
    public JsonNullable<OffsetDateTime> getFixedAt() {
        return fixedAt;
    }

    public void setFixedAt(JsonNullable<OffsetDateTime> fixedAt) {
        this.fixedAt = fixedAt;
    }

    public CodeScanningOrganizationAlertItems dismissedBy(NullableSimpleUser dismissedBy) {
        this.dismissedBy = JsonNullable.of(dismissedBy);
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
    public JsonNullable<NullableSimpleUser> getDismissedBy() {
        return dismissedBy;
    }

    public void setDismissedBy(JsonNullable<NullableSimpleUser> dismissedBy) {
        this.dismissedBy = dismissedBy;
    }

    public CodeScanningOrganizationAlertItems dismissedAt(OffsetDateTime dismissedAt) {
        this.dismissedAt = JsonNullable.of(dismissedAt);
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
    public JsonNullable<OffsetDateTime> getDismissedAt() {
        return dismissedAt;
    }

    public void setDismissedAt(JsonNullable<OffsetDateTime> dismissedAt) {
        this.dismissedAt = dismissedAt;
    }

    public CodeScanningOrganizationAlertItems dismissedReason(CodeScanningAlertDismissedReason dismissedReason) {
        this.dismissedReason = JsonNullable.of(dismissedReason);
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
    public JsonNullable<CodeScanningAlertDismissedReason> getDismissedReason() {
        return dismissedReason;
    }

    public void setDismissedReason(JsonNullable<CodeScanningAlertDismissedReason> dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    public CodeScanningOrganizationAlertItems dismissedComment(String dismissedComment) {
        this.dismissedComment = JsonNullable.of(dismissedComment);
        return this;
    }

    /**
     * The dismissal comment associated with the dismissal of the alert.
     * @return dismissedComment
     */
    @Schema(
            name = "dismissed_comment",
            description = "The dismissal comment associated with the dismissal of the alert.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissed_comment")
    public JsonNullable<@Size(max = 280) String> getDismissedComment() {
        return dismissedComment;
    }

    public void setDismissedComment(JsonNullable<String> dismissedComment) {
        this.dismissedComment = dismissedComment;
    }

    public CodeScanningOrganizationAlertItems rule(CodeScanningAlertRuleSummary rule) {
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

    public CodeScanningOrganizationAlertItems tool(CodeScanningAnalysisTool tool) {
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

    public CodeScanningOrganizationAlertItems mostRecentInstance(CodeScanningAlertInstance mostRecentInstance) {
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

    public CodeScanningOrganizationAlertItems repository(SimpleRepository repository) {
        this.repository = repository;
        return this;
    }

    /**
     * Get repository
     * @return repository
     */
    @NotNull
    @Valid
    @Schema(name = "repository", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repository")
    public SimpleRepository getRepository() {
        return repository;
    }

    public void setRepository(SimpleRepository repository) {
        this.repository = repository;
    }

    public CodeScanningOrganizationAlertItems dismissalApprovedBy(NullableSimpleUser dismissalApprovedBy) {
        this.dismissalApprovedBy = JsonNullable.of(dismissalApprovedBy);
        return this;
    }

    /**
     * Get dismissalApprovedBy
     * @return dismissalApprovedBy
     */
    @Valid
    @Schema(name = "dismissal_approved_by", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("dismissal_approved_by")
    public JsonNullable<NullableSimpleUser> getDismissalApprovedBy() {
        return dismissalApprovedBy;
    }

    public void setDismissalApprovedBy(JsonNullable<NullableSimpleUser> dismissalApprovedBy) {
        this.dismissalApprovedBy = dismissalApprovedBy;
    }

    public CodeScanningOrganizationAlertItems assignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
        return this;
    }

    public CodeScanningOrganizationAlertItems addAssigneesItem(SimpleUser assigneesItem) {
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
        CodeScanningOrganizationAlertItems codeScanningOrganizationAlertItems = (CodeScanningOrganizationAlertItems) o;
        return Objects.equals(this.number, codeScanningOrganizationAlertItems.number)
                && Objects.equals(this.createdAt, codeScanningOrganizationAlertItems.createdAt)
                && Objects.equals(this.updatedAt, codeScanningOrganizationAlertItems.updatedAt)
                && Objects.equals(this.url, codeScanningOrganizationAlertItems.url)
                && Objects.equals(this.htmlUrl, codeScanningOrganizationAlertItems.htmlUrl)
                && Objects.equals(this.instancesUrl, codeScanningOrganizationAlertItems.instancesUrl)
                && Objects.equals(this.state, codeScanningOrganizationAlertItems.state)
                && equalsNullable(this.fixedAt, codeScanningOrganizationAlertItems.fixedAt)
                && Objects.equals(this.dismissedBy, codeScanningOrganizationAlertItems.dismissedBy)
                && Objects.equals(this.dismissedAt, codeScanningOrganizationAlertItems.dismissedAt)
                && Objects.equals(this.dismissedReason, codeScanningOrganizationAlertItems.dismissedReason)
                && equalsNullable(this.dismissedComment, codeScanningOrganizationAlertItems.dismissedComment)
                && Objects.equals(this.rule, codeScanningOrganizationAlertItems.rule)
                && Objects.equals(this.tool, codeScanningOrganizationAlertItems.tool)
                && Objects.equals(this.mostRecentInstance, codeScanningOrganizationAlertItems.mostRecentInstance)
                && Objects.equals(this.repository, codeScanningOrganizationAlertItems.repository)
                && equalsNullable(this.dismissalApprovedBy, codeScanningOrganizationAlertItems.dismissalApprovedBy)
                && Objects.equals(this.assignees, codeScanningOrganizationAlertItems.assignees);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
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
                hashCodeNullable(fixedAt),
                dismissedBy,
                dismissedAt,
                dismissedReason,
                hashCodeNullable(dismissedComment),
                rule,
                tool,
                mostRecentInstance,
                repository,
                hashCodeNullable(dismissalApprovedBy),
                assignees);
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
        sb.append("class CodeScanningOrganizationAlertItems {\n");
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
        sb.append("    repository: ").append(toIndentedString(repository)).append("\n");
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
