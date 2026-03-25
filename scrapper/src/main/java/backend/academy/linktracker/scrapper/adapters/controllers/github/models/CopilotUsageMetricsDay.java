package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.LocalDate;
import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Copilot usage metrics for a given day.
 */
@Schema(name = "copilot-usage-metrics-day", description = "Copilot usage metrics for a given day.")
@JsonTypeName("copilot-usage-metrics-day")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotUsageMetricsDay {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    private Long totalActiveUsers;

    private Long totalEngagedUsers;

    private CopilotIdeCodeCompletions copilotIdeCodeCompletions = null;

    private CopilotIdeChat copilotIdeChat = null;

    private CopilotDotcomChat copilotDotcomChat = null;

    private CopilotDotcomPullRequests copilotDotcomPullRequests = null;

    public CopilotUsageMetricsDay() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public CopilotUsageMetricsDay(LocalDate date) {
        this.date = date;
    }

    public CopilotUsageMetricsDay date(LocalDate date) {
        this.date = date;
        return this;
    }

    /**
     * The date for which the usage metrics are aggregated, in `YYYY-MM-DD` format.
     * @return date
     */
    @NotNull
    @Valid
    @Schema(
            name = "date",
            description = "The date for which the usage metrics are aggregated, in `YYYY-MM-DD` format.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("date")
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public CopilotUsageMetricsDay totalActiveUsers(Long totalActiveUsers) {
        this.totalActiveUsers = totalActiveUsers;
        return this;
    }

    /**
     * The total number of Copilot users with activity belonging to any Copilot feature, globally, for the given day. Includes passive activity such as receiving a code suggestion, as well as engagement activity such as accepting a code suggestion or prompting chat. Does not include authentication events. Is not limited to the individual features detailed on the endpoint.
     * @return totalActiveUsers
     */
    @Schema(
            name = "total_active_users",
            description =
                    "The total number of Copilot users with activity belonging to any Copilot feature, globally, for the given day. Includes passive activity such as receiving a code suggestion, as well as engagement activity such as accepting a code suggestion or prompting chat. Does not include authentication events. Is not limited to the individual features detailed on the endpoint.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_active_users")
    public Long getTotalActiveUsers() {
        return totalActiveUsers;
    }

    public void setTotalActiveUsers(Long totalActiveUsers) {
        this.totalActiveUsers = totalActiveUsers;
    }

    public CopilotUsageMetricsDay totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
        return this;
    }

    /**
     * The total number of Copilot users who engaged with any Copilot feature, for the given day. Examples include but are not limited to accepting a code suggestion, prompting Copilot chat, or triggering a PR Summary. Does not include authentication events. Is not limited to the individual features detailed on the endpoint.
     * @return totalEngagedUsers
     */
    @Schema(
            name = "total_engaged_users",
            description =
                    "The total number of Copilot users who engaged with any Copilot feature, for the given day. Examples include but are not limited to accepting a code suggestion, prompting Copilot chat, or triggering a PR Summary. Does not include authentication events. Is not limited to the individual features detailed on the endpoint.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_engaged_users")
    public Long getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotUsageMetricsDay copilotIdeCodeCompletions(CopilotIdeCodeCompletions copilotIdeCodeCompletions) {
        this.copilotIdeCodeCompletions = copilotIdeCodeCompletions;
        return this;
    }

    /**
     * Get copilotIdeCodeCompletions
     * @return copilotIdeCodeCompletions
     */
    @Valid
    @Schema(name = "copilot_ide_code_completions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copilot_ide_code_completions")
    public CopilotIdeCodeCompletions getCopilotIdeCodeCompletions() {
        return copilotIdeCodeCompletions;
    }

    public void setCopilotIdeCodeCompletions(CopilotIdeCodeCompletions copilotIdeCodeCompletions) {
        this.copilotIdeCodeCompletions = copilotIdeCodeCompletions;
    }

    public CopilotUsageMetricsDay copilotIdeChat(CopilotIdeChat copilotIdeChat) {
        this.copilotIdeChat = copilotIdeChat;
        return this;
    }

    /**
     * Get copilotIdeChat
     * @return copilotIdeChat
     */
    @Valid
    @Schema(name = "copilot_ide_chat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copilot_ide_chat")
    public CopilotIdeChat getCopilotIdeChat() {
        return copilotIdeChat;
    }

    public void setCopilotIdeChat(CopilotIdeChat copilotIdeChat) {
        this.copilotIdeChat = copilotIdeChat;
    }

    public CopilotUsageMetricsDay copilotDotcomChat(CopilotDotcomChat copilotDotcomChat) {
        this.copilotDotcomChat = copilotDotcomChat;
        return this;
    }

    /**
     * Get copilotDotcomChat
     * @return copilotDotcomChat
     */
    @Valid
    @Schema(name = "copilot_dotcom_chat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copilot_dotcom_chat")
    public CopilotDotcomChat getCopilotDotcomChat() {
        return copilotDotcomChat;
    }

    public void setCopilotDotcomChat(CopilotDotcomChat copilotDotcomChat) {
        this.copilotDotcomChat = copilotDotcomChat;
    }

    public CopilotUsageMetricsDay copilotDotcomPullRequests(CopilotDotcomPullRequests copilotDotcomPullRequests) {
        this.copilotDotcomPullRequests = copilotDotcomPullRequests;
        return this;
    }

    /**
     * Get copilotDotcomPullRequests
     * @return copilotDotcomPullRequests
     */
    @Valid
    @Schema(name = "copilot_dotcom_pull_requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copilot_dotcom_pull_requests")
    public CopilotDotcomPullRequests getCopilotDotcomPullRequests() {
        return copilotDotcomPullRequests;
    }

    public void setCopilotDotcomPullRequests(CopilotDotcomPullRequests copilotDotcomPullRequests) {
        this.copilotDotcomPullRequests = copilotDotcomPullRequests;
    }
    /**
     * A container for additional, undeclared properties.
     * This is a holder for any undeclared properties as specified with
     * the 'additionalProperties' keyword in the OAS document.
     */
    private Map<String, Object> additionalProperties;

    /**
     * Set the additional (undeclared) property with the specified name and value.
     * If the property does not already exist, create it otherwise replace it.
     */
    @JsonAnySetter
    public CopilotUsageMetricsDay putAdditionalProperty(String key, Object value) {
        if (this.additionalProperties == null) {
            this.additionalProperties = new HashMap<String, Object>();
        }
        this.additionalProperties.put(key, value);
        return this;
    }

    /**
     * Return the additional (undeclared) property.
     */
    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return additionalProperties;
    }

    /**
     * Return the additional (undeclared) property with the specified name.
     */
    public Object getAdditionalProperty(String key) {
        if (this.additionalProperties == null) {
            return null;
        }
        return this.additionalProperties.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CopilotUsageMetricsDay copilotUsageMetricsDay = (CopilotUsageMetricsDay) o;
        return Objects.equals(this.date, copilotUsageMetricsDay.date)
                && Objects.equals(this.totalActiveUsers, copilotUsageMetricsDay.totalActiveUsers)
                && Objects.equals(this.totalEngagedUsers, copilotUsageMetricsDay.totalEngagedUsers)
                && Objects.equals(this.copilotIdeCodeCompletions, copilotUsageMetricsDay.copilotIdeCodeCompletions)
                && Objects.equals(this.copilotIdeChat, copilotUsageMetricsDay.copilotIdeChat)
                && Objects.equals(this.copilotDotcomChat, copilotUsageMetricsDay.copilotDotcomChat)
                && Objects.equals(this.copilotDotcomPullRequests, copilotUsageMetricsDay.copilotDotcomPullRequests)
                && Objects.equals(this.additionalProperties, copilotUsageMetricsDay.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                date,
                totalActiveUsers,
                totalEngagedUsers,
                copilotIdeCodeCompletions,
                copilotIdeChat,
                copilotDotcomChat,
                copilotDotcomPullRequests,
                additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CopilotUsageMetricsDay {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    totalActiveUsers: ")
                .append(toIndentedString(totalActiveUsers))
                .append("\n");
        sb.append("    totalEngagedUsers: ")
                .append(toIndentedString(totalEngagedUsers))
                .append("\n");
        sb.append("    copilotIdeCodeCompletions: ")
                .append(toIndentedString(copilotIdeCodeCompletions))
                .append("\n");
        sb.append("    copilotIdeChat: ")
                .append(toIndentedString(copilotIdeChat))
                .append("\n");
        sb.append("    copilotDotcomChat: ")
                .append(toIndentedString(copilotDotcomChat))
                .append("\n");
        sb.append("    copilotDotcomPullRequests: ")
                .append(toIndentedString(copilotDotcomPullRequests))
                .append("\n");

        sb.append("    additionalProperties: ")
                .append(toIndentedString(additionalProperties))
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
