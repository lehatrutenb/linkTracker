package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * ChecksCreateRequestOneOf1
 */
@JsonTypeName("checks_create_request_oneOf_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksCreateRequestOneOf1 implements ChecksCreateRequest {

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        QUEUED("queued"),

        IN_PROGRESS("in_progress");

        private final String value;

        StatusEnum(String value) {
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
        public static StatusEnum fromValue(String value) {
            for (StatusEnum b : StatusEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StatusEnum status;

    private String name;

    private String headSha;

    private String detailsUrl;

    private String externalId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt;

    /**
     * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check.  **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. You cannot change a check run conclusion to `stale`, only GitHub can set this.
     */
    public enum ConclusionEnum {
        ACTION_REQUIRED("action_required"),

        CANCELLED("cancelled"),

        FAILURE("failure"),

        NEUTRAL("neutral"),

        SUCCESS("success"),

        SKIPPED("skipped"),

        STALE("stale"),

        TIMED_OUT("timed_out");

        private final String value;

        ConclusionEnum(String value) {
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
        public static ConclusionEnum fromValue(String value) {
            for (ConclusionEnum b : ConclusionEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private ConclusionEnum conclusion;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime completedAt;

    private ChecksCreateRequestOutput output;

    @Valid
    private List<@Valid ChecksCreateRequestActionsInner> actions = new ArrayList<>();

    public ChecksCreateRequestOneOf1 status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     *
     * @return status
     */
    @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public String getStatus() {
        return String.valueOf(status);
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ChecksCreateRequestOneOf1 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the check. For example, \"code-coverage\".
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description = "The name of the check. For example, \"code-coverage\".",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChecksCreateRequestOneOf1 headSha(String headSha) {
        this.headSha = headSha;
        return this;
    }

    /**
     * The SHA of the commit.
     * @return headSha
     */
    @NotNull
    @Schema(name = "head_sha", description = "The SHA of the commit.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("head_sha")
    public String getHeadSha() {
        return headSha;
    }

    public void setHeadSha(String headSha) {
        this.headSha = headSha;
    }

    public ChecksCreateRequestOneOf1 detailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
        return this;
    }

    /**
     * The URL of the integrator's site that has the full details of the check. If the integrator does not provide this, then the homepage of the GitHub app is used.
     * @return detailsUrl
     */
    @Schema(
            name = "details_url",
            description =
                    "The URL of the integrator's site that has the full details of the check. If the integrator does not provide this, then the homepage of the GitHub app is used.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("details_url")
    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public ChecksCreateRequestOneOf1 externalId(String externalId) {
        this.externalId = externalId;
        return this;
    }

    /**
     * A reference for the run on the integrator's system.
     * @return externalId
     */
    @Schema(
            name = "external_id",
            description = "A reference for the run on the integrator's system.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("external_id")
    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public ChecksCreateRequestOneOf1 startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * The time that the check run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return startedAt
     */
    @Valid
    @Schema(
            name = "started_at",
            description =
                    "The time that the check run began. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("started_at")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public ChecksCreateRequestOneOf1 conclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
        return this;
    }

    /**
     * **Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check.  **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. You cannot change a check run conclusion to `stale`, only GitHub can set this.
     * @return conclusion
     */
    @Schema(
            name = "conclusion",
            description =
                    "**Required if you provide `completed_at` or a `status` of `completed`**. The final conclusion of the check.  **Note:** Providing `conclusion` will automatically set the `status` parameter to `completed`. You cannot change a check run conclusion to `stale`, only GitHub can set this.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("conclusion")
    public ConclusionEnum getConclusion() {
        return conclusion;
    }

    public void setConclusion(ConclusionEnum conclusion) {
        this.conclusion = conclusion;
    }

    public ChecksCreateRequestOneOf1 completedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return completedAt
     */
    @Valid
    @Schema(
            name = "completed_at",
            description =
                    "The time the check completed. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("completed_at")
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    public ChecksCreateRequestOneOf1 output(ChecksCreateRequestOutput output) {
        this.output = output;
        return this;
    }

    /**
     * Get output
     * @return output
     */
    @Valid
    @Schema(name = "output", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("output")
    public ChecksCreateRequestOutput getOutput() {
        return output;
    }

    public void setOutput(ChecksCreateRequestOutput output) {
        this.output = output;
    }

    public ChecksCreateRequestOneOf1 actions(List<@Valid ChecksCreateRequestActionsInner> actions) {
        this.actions = actions;
        return this;
    }

    public ChecksCreateRequestOneOf1 addActionsItem(ChecksCreateRequestActionsInner actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Displays a button on GitHub that can be clicked to alert your app to do additional tasks. For example, a code linting app can display a button that automatically fixes detected errors. The button created in this object is displayed after the check run completes. When a user clicks the button, GitHub sends the [`check_run.requested_action` webhook](https://docs.github.com/webhooks/event-payloads/#check_run) to your app. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. To learn more about check runs and requested actions, see \"[Check runs and requested actions](https://docs.github.com/rest/guides/using-the-rest-api-to-interact-with-checks#check-runs-and-requested-actions).\"
     * @return actions
     */
    @Valid
    @Size(max = 3)
    @Schema(
            name = "actions",
            description =
                    "Displays a button on GitHub that can be clicked to alert your app to do additional tasks. For example, a code linting app can display a button that automatically fixes detected errors. The button created in this object is displayed after the check run completes. When a user clicks the button, GitHub sends the [`check_run.requested_action` webhook](https://docs.github.com/webhooks/event-payloads/#check_run) to your app. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. To learn more about check runs and requested actions, see \"[Check runs and requested actions](https://docs.github.com/rest/guides/using-the-rest-api-to-interact-with-checks#check-runs-and-requested-actions).\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actions")
    public List<@Valid ChecksCreateRequestActionsInner> getActions() {
        return actions;
    }

    public void setActions(List<@Valid ChecksCreateRequestActionsInner> actions) {
        this.actions = actions;
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
    public ChecksCreateRequestOneOf1 putAdditionalProperty(String key, Object value) {
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
        ChecksCreateRequestOneOf1 checksCreateRequestOneOf1 = (ChecksCreateRequestOneOf1) o;
        return Objects.equals(this.status, checksCreateRequestOneOf1.status)
                && Objects.equals(this.name, checksCreateRequestOneOf1.name)
                && Objects.equals(this.headSha, checksCreateRequestOneOf1.headSha)
                && Objects.equals(this.detailsUrl, checksCreateRequestOneOf1.detailsUrl)
                && Objects.equals(this.externalId, checksCreateRequestOneOf1.externalId)
                && Objects.equals(this.startedAt, checksCreateRequestOneOf1.startedAt)
                && Objects.equals(this.conclusion, checksCreateRequestOneOf1.conclusion)
                && Objects.equals(this.completedAt, checksCreateRequestOneOf1.completedAt)
                && Objects.equals(this.output, checksCreateRequestOneOf1.output)
                && Objects.equals(this.actions, checksCreateRequestOneOf1.actions)
                && Objects.equals(this.additionalProperties, checksCreateRequestOneOf1.additionalProperties);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                status,
                name,
                headSha,
                detailsUrl,
                externalId,
                startedAt,
                conclusion,
                completedAt,
                output,
                actions,
                additionalProperties);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksCreateRequestOneOf1 {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    headSha: ").append(toIndentedString(headSha)).append("\n");
        sb.append("    detailsUrl: ").append(toIndentedString(detailsUrl)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");

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
