package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDate;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Copilot usage metrics for a given day.
 */
@Schema(name = "copilot-usage-metrics-day", description = "Copilot usage metrics for a given day.")
@JsonTypeName("copilot-usage-metrics-day")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class CopilotUsageMetricsDay {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate date;

    private Optional<Long> totalActiveUsers = Optional.empty();

    private Optional<Long> totalEngagedUsers = Optional.empty();

    private JsonNullable<CopilotIdeCodeCompletions> copilotIdeCodeCompletions =
            JsonNullable.<CopilotIdeCodeCompletions>undefined();

    private JsonNullable<CopilotIdeChat> copilotIdeChat = JsonNullable.<CopilotIdeChat>undefined();

    private JsonNullable<CopilotDotcomChat> copilotDotcomChat = JsonNullable.<CopilotDotcomChat>undefined();

    private JsonNullable<CopilotDotcomPullRequests> copilotDotcomPullRequests =
            JsonNullable.<CopilotDotcomPullRequests>undefined();

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
        this.totalActiveUsers = Optional.ofNullable(totalActiveUsers);
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
    public Optional<Long> getTotalActiveUsers() {
        return totalActiveUsers;
    }

    public void setTotalActiveUsers(Optional<Long> totalActiveUsers) {
        this.totalActiveUsers = totalActiveUsers;
    }

    public CopilotUsageMetricsDay totalEngagedUsers(Long totalEngagedUsers) {
        this.totalEngagedUsers = Optional.ofNullable(totalEngagedUsers);
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
    public Optional<Long> getTotalEngagedUsers() {
        return totalEngagedUsers;
    }

    public void setTotalEngagedUsers(Optional<Long> totalEngagedUsers) {
        this.totalEngagedUsers = totalEngagedUsers;
    }

    public CopilotUsageMetricsDay copilotIdeCodeCompletions(CopilotIdeCodeCompletions copilotIdeCodeCompletions) {
        this.copilotIdeCodeCompletions = JsonNullable.of(copilotIdeCodeCompletions);
        return this;
    }

    /**
     * Get copilotIdeCodeCompletions
     * @return copilotIdeCodeCompletions
     */
    @Valid
    @Schema(name = "copilot_ide_code_completions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copilot_ide_code_completions")
    public JsonNullable<CopilotIdeCodeCompletions> getCopilotIdeCodeCompletions() {
        return copilotIdeCodeCompletions;
    }

    public void setCopilotIdeCodeCompletions(JsonNullable<CopilotIdeCodeCompletions> copilotIdeCodeCompletions) {
        this.copilotIdeCodeCompletions = copilotIdeCodeCompletions;
    }

    public CopilotUsageMetricsDay copilotIdeChat(CopilotIdeChat copilotIdeChat) {
        this.copilotIdeChat = JsonNullable.of(copilotIdeChat);
        return this;
    }

    /**
     * Get copilotIdeChat
     * @return copilotIdeChat
     */
    @Valid
    @Schema(name = "copilot_ide_chat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copilot_ide_chat")
    public JsonNullable<CopilotIdeChat> getCopilotIdeChat() {
        return copilotIdeChat;
    }

    public void setCopilotIdeChat(JsonNullable<CopilotIdeChat> copilotIdeChat) {
        this.copilotIdeChat = copilotIdeChat;
    }

    public CopilotUsageMetricsDay copilotDotcomChat(CopilotDotcomChat copilotDotcomChat) {
        this.copilotDotcomChat = JsonNullable.of(copilotDotcomChat);
        return this;
    }

    /**
     * Get copilotDotcomChat
     * @return copilotDotcomChat
     */
    @Valid
    @Schema(name = "copilot_dotcom_chat", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copilot_dotcom_chat")
    public JsonNullable<CopilotDotcomChat> getCopilotDotcomChat() {
        return copilotDotcomChat;
    }

    public void setCopilotDotcomChat(JsonNullable<CopilotDotcomChat> copilotDotcomChat) {
        this.copilotDotcomChat = copilotDotcomChat;
    }

    public CopilotUsageMetricsDay copilotDotcomPullRequests(CopilotDotcomPullRequests copilotDotcomPullRequests) {
        this.copilotDotcomPullRequests = JsonNullable.of(copilotDotcomPullRequests);
        return this;
    }

    /**
     * Get copilotDotcomPullRequests
     * @return copilotDotcomPullRequests
     */
    @Valid
    @Schema(name = "copilot_dotcom_pull_requests", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("copilot_dotcom_pull_requests")
    public JsonNullable<CopilotDotcomPullRequests> getCopilotDotcomPullRequests() {
        return copilotDotcomPullRequests;
    }

    public void setCopilotDotcomPullRequests(JsonNullable<CopilotDotcomPullRequests> copilotDotcomPullRequests) {
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
                && equalsNullable(this.copilotIdeCodeCompletions, copilotUsageMetricsDay.copilotIdeCodeCompletions)
                && equalsNullable(this.copilotIdeChat, copilotUsageMetricsDay.copilotIdeChat)
                && equalsNullable(this.copilotDotcomChat, copilotUsageMetricsDay.copilotDotcomChat)
                && equalsNullable(this.copilotDotcomPullRequests, copilotUsageMetricsDay.copilotDotcomPullRequests)
                && Objects.equals(this.additionalProperties, copilotUsageMetricsDay.additionalProperties);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                date,
                totalActiveUsers,
                totalEngagedUsers,
                hashCodeNullable(copilotIdeCodeCompletions),
                hashCodeNullable(copilotIdeChat),
                hashCodeNullable(copilotDotcomChat),
                hashCodeNullable(copilotDotcomPullRequests),
                additionalProperties);
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
