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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * The code scanning alert involved in the event.
 */
@Schema(
        name = "webhook_code_scanning_alert_reopened_by_user_alert",
        description = "The code scanning alert involved in the event.")
@JsonTypeName("webhook_code_scanning_alert_reopened_by_user_alert")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookCodeScanningAlertReopenedByUserAlert {

    @Valid
    private List<@Valid SimpleUser> assignees = new ArrayList<>();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    private JsonNullable<Object> dismissedAt = JsonNullable.<Object>undefined();

    private JsonNullable<Object> dismissedBy = JsonNullable.<Object>undefined();

    private JsonNullable<@Size(max = 280) String> dismissedComment = JsonNullable.<String>undefined();

    private JsonNullable<Object> dismissedReason = JsonNullable.<Object>undefined();

    private JsonNullable<Object> fixedAt = JsonNullable.<Object>undefined();

    private URI htmlUrl;

    private JsonNullable<AlertInstance> mostRecentInstance = JsonNullable.<AlertInstance>undefined();

    private Long number;

    private WebhookCodeScanningAlertAppearedInBranchAlertRule rule;

    /**
     * State of a code scanning alert. Events for alerts found outside the default branch will return a `null` value until they are dismissed or fixed.
     */
    public enum StateEnum {
        OPEN("open"),

        FIXED("fixed");

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
            return null;
        }
    }

    private JsonNullable<StateEnum> state = JsonNullable.<StateEnum>undefined();

    private WebhookCodeScanningAlertAppearedInBranchAlertTool tool;

    private URI url;

    public WebhookCodeScanningAlertReopenedByUserAlert() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookCodeScanningAlertReopenedByUserAlert(
            OffsetDateTime createdAt,
            Object dismissedAt,
            Object dismissedBy,
            Object dismissedReason,
            URI htmlUrl,
            Long number,
            WebhookCodeScanningAlertAppearedInBranchAlertRule rule,
            StateEnum state,
            WebhookCodeScanningAlertAppearedInBranchAlertTool tool,
            URI url) {
        this.createdAt = createdAt;
        this.dismissedAt = JsonNullable.of(dismissedAt);
        this.dismissedBy = JsonNullable.of(dismissedBy);
        this.dismissedReason = JsonNullable.of(dismissedReason);
        this.htmlUrl = htmlUrl;
        this.number = number;
        this.rule = rule;
        this.state = JsonNullable.of(state);
        this.tool = tool;
        this.url = url;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert assignees(List<@Valid SimpleUser> assignees) {
        this.assignees = assignees;
        return this;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert addAssigneesItem(SimpleUser assigneesItem) {
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

    public WebhookCodeScanningAlertReopenedByUserAlert createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.`
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "created_at",
            description = "The time that the alert was created in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ.`",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert dismissedAt(Object dismissedAt) {
        this.dismissedAt = JsonNullable.of(dismissedAt);
        return this;
    }

    /**
     * The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return dismissedAt
     */
    @NotNull
    @Schema(
            name = "dismissed_at",
            description = "The time that the alert was dismissed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissed_at")
    public JsonNullable<Object> getDismissedAt() {
        return dismissedAt;
    }

    public void setDismissedAt(JsonNullable<Object> dismissedAt) {
        this.dismissedAt = dismissedAt;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert dismissedBy(Object dismissedBy) {
        this.dismissedBy = JsonNullable.of(dismissedBy);
        return this;
    }

    /**
     * Get dismissedBy
     * @return dismissedBy
     */
    @NotNull
    @Schema(name = "dismissed_by", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissed_by")
    public JsonNullable<Object> getDismissedBy() {
        return dismissedBy;
    }

    public void setDismissedBy(JsonNullable<Object> dismissedBy) {
        this.dismissedBy = dismissedBy;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert dismissedComment(String dismissedComment) {
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

    public WebhookCodeScanningAlertReopenedByUserAlert dismissedReason(Object dismissedReason) {
        this.dismissedReason = JsonNullable.of(dismissedReason);
        return this;
    }

    /**
     * The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`.
     * @return dismissedReason
     */
    @NotNull
    @Schema(
            name = "dismissed_reason",
            description =
                    "The reason for dismissing or closing the alert. Can be one of: `false positive`, `won't fix`, and `used in tests`.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("dismissed_reason")
    public JsonNullable<Object> getDismissedReason() {
        return dismissedReason;
    }

    public void setDismissedReason(JsonNullable<Object> dismissedReason) {
        this.dismissedReason = dismissedReason;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert fixedAt(Object fixedAt) {
        this.fixedAt = JsonNullable.of(fixedAt);
        return this;
    }

    /**
     * The time that the alert was fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return fixedAt
     */
    @Schema(
            name = "fixed_at",
            description = "The time that the alert was fixed in ISO 8601 format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("fixed_at")
    public JsonNullable<Object> getFixedAt() {
        return fixedAt;
    }

    public void setFixedAt(JsonNullable<Object> fixedAt) {
        this.fixedAt = fixedAt;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * The GitHub URL of the alert resource.
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            description = "The GitHub URL of the alert resource.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert mostRecentInstance(AlertInstance mostRecentInstance) {
        this.mostRecentInstance = JsonNullable.of(mostRecentInstance);
        return this;
    }

    /**
     * Get mostRecentInstance
     * @return mostRecentInstance
     */
    @Valid
    @Schema(name = "most_recent_instance", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("most_recent_instance")
    public JsonNullable<AlertInstance> getMostRecentInstance() {
        return mostRecentInstance;
    }

    public void setMostRecentInstance(JsonNullable<AlertInstance> mostRecentInstance) {
        this.mostRecentInstance = mostRecentInstance;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * The code scanning alert number.
     * @return number
     */
    @NotNull
    @Schema(
            name = "number",
            description = "The code scanning alert number.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert rule(WebhookCodeScanningAlertAppearedInBranchAlertRule rule) {
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
    public WebhookCodeScanningAlertAppearedInBranchAlertRule getRule() {
        return rule;
    }

    public void setRule(WebhookCodeScanningAlertAppearedInBranchAlertRule rule) {
        this.rule = rule;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert state(StateEnum state) {
        this.state = JsonNullable.of(state);
        return this;
    }

    /**
     * State of a code scanning alert. Events for alerts found outside the default branch will return a `null` value until they are dismissed or fixed.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description =
                    "State of a code scanning alert. Events for alerts found outside the default branch will return a `null` value until they are dismissed or fixed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public JsonNullable<StateEnum> getState() {
        return state;
    }

    public void setState(JsonNullable<StateEnum> state) {
        this.state = state;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert tool(WebhookCodeScanningAlertAppearedInBranchAlertTool tool) {
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
    public WebhookCodeScanningAlertAppearedInBranchAlertTool getTool() {
        return tool;
    }

    public void setTool(WebhookCodeScanningAlertAppearedInBranchAlertTool tool) {
        this.tool = tool;
    }

    public WebhookCodeScanningAlertReopenedByUserAlert url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookCodeScanningAlertReopenedByUserAlert webhookCodeScanningAlertReopenedByUserAlert =
                (WebhookCodeScanningAlertReopenedByUserAlert) o;
        return Objects.equals(this.assignees, webhookCodeScanningAlertReopenedByUserAlert.assignees)
                && Objects.equals(this.createdAt, webhookCodeScanningAlertReopenedByUserAlert.createdAt)
                && Objects.equals(this.dismissedAt, webhookCodeScanningAlertReopenedByUserAlert.dismissedAt)
                && Objects.equals(this.dismissedBy, webhookCodeScanningAlertReopenedByUserAlert.dismissedBy)
                && equalsNullable(this.dismissedComment, webhookCodeScanningAlertReopenedByUserAlert.dismissedComment)
                && Objects.equals(this.dismissedReason, webhookCodeScanningAlertReopenedByUserAlert.dismissedReason)
                && equalsNullable(this.fixedAt, webhookCodeScanningAlertReopenedByUserAlert.fixedAt)
                && Objects.equals(this.htmlUrl, webhookCodeScanningAlertReopenedByUserAlert.htmlUrl)
                && equalsNullable(
                        this.mostRecentInstance, webhookCodeScanningAlertReopenedByUserAlert.mostRecentInstance)
                && Objects.equals(this.number, webhookCodeScanningAlertReopenedByUserAlert.number)
                && Objects.equals(this.rule, webhookCodeScanningAlertReopenedByUserAlert.rule)
                && Objects.equals(this.state, webhookCodeScanningAlertReopenedByUserAlert.state)
                && Objects.equals(this.tool, webhookCodeScanningAlertReopenedByUserAlert.tool)
                && Objects.equals(this.url, webhookCodeScanningAlertReopenedByUserAlert.url);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                assignees,
                createdAt,
                dismissedAt,
                dismissedBy,
                hashCodeNullable(dismissedComment),
                dismissedReason,
                hashCodeNullable(fixedAt),
                htmlUrl,
                hashCodeNullable(mostRecentInstance),
                number,
                rule,
                state,
                tool,
                url);
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
        sb.append("class WebhookCodeScanningAlertReopenedByUserAlert {\n");
        sb.append("    assignees: ").append(toIndentedString(assignees)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    dismissedAt: ").append(toIndentedString(dismissedAt)).append("\n");
        sb.append("    dismissedBy: ").append(toIndentedString(dismissedBy)).append("\n");
        sb.append("    dismissedComment: ")
                .append(toIndentedString(dismissedComment))
                .append("\n");
        sb.append("    dismissedReason: ")
                .append(toIndentedString(dismissedReason))
                .append("\n");
        sb.append("    fixedAt: ").append(toIndentedString(fixedAt)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    mostRecentInstance: ")
                .append(toIndentedString(mostRecentInstance))
                .append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    tool: ").append(toIndentedString(tool)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
