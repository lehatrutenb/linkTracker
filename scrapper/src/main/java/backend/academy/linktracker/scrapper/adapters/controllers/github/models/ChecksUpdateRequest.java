package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * ChecksUpdateRequest
 */
@JsonTypeName("checks_update_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ChecksUpdateRequest {

    private String name;

    private String detailsUrl;

    private String externalId;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt;

    /**
     * The current status of the check run. Only GitHub Actions can set a status of `waiting`, `pending`, or `requested`.
     */
    public enum StatusEnum {
        QUEUED("queued"),

        IN_PROGRESS("in_progress"),

        COMPLETED("completed"),

        WAITING("waiting"),

        REQUESTED("requested"),

        PENDING("pending");

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

    private ChecksUpdateRequestOutput output;

    @Valid
    private List<@Valid ChecksCreateRequestActionsInner> actions = new ArrayList<>();

    public ChecksUpdateRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the check. For example, \"code-coverage\".
     * @return name
     */
    @Schema(
            name = "name",
            description = "The name of the check. For example, \"code-coverage\".",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChecksUpdateRequest detailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
        return this;
    }

    /**
     * The URL of the integrator's site that has the full details of the check.
     * @return detailsUrl
     */
    @Schema(
            name = "details_url",
            description = "The URL of the integrator's site that has the full details of the check.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("details_url")
    public String getDetailsUrl() {
        return detailsUrl;
    }

    public void setDetailsUrl(String detailsUrl) {
        this.detailsUrl = detailsUrl;
    }

    public ChecksUpdateRequest externalId(String externalId) {
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

    public ChecksUpdateRequest startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return startedAt
     */
    @Valid
    @Schema(
            name = "started_at",
            description =
                    "This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("started_at")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public ChecksUpdateRequest status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The current status of the check run. Only GitHub Actions can set a status of `waiting`, `pending`, or `requested`.
     * @return status
     */
    @Schema(
            name = "status",
            description =
                    "The current status of the check run. Only GitHub Actions can set a status of `waiting`, `pending`, or `requested`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public ChecksUpdateRequest conclusion(ConclusionEnum conclusion) {
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

    public ChecksUpdateRequest completedAt(OffsetDateTime completedAt) {
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

    public ChecksUpdateRequest output(ChecksUpdateRequestOutput output) {
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
    public ChecksUpdateRequestOutput getOutput() {
        return output;
    }

    public void setOutput(ChecksUpdateRequestOutput output) {
        this.output = output;
    }

    public ChecksUpdateRequest actions(List<@Valid ChecksCreateRequestActionsInner> actions) {
        this.actions = actions;
        return this;
    }

    public ChecksUpdateRequest addActionsItem(ChecksCreateRequestActionsInner actionsItem) {
        if (this.actions == null) {
            this.actions = new ArrayList<>();
        }
        this.actions.add(actionsItem);
        return this;
    }

    /**
     * Possible further actions the integrator can perform, which a user may trigger. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. To learn more about check runs and requested actions, see \"[Check runs and requested actions](https://docs.github.com/rest/guides/using-the-rest-api-to-interact-with-checks#check-runs-and-requested-actions).\"
     * @return actions
     */
    @Valid
    @Size(max = 3)
    @Schema(
            name = "actions",
            description =
                    "Possible further actions the integrator can perform, which a user may trigger. Each action includes a `label`, `identifier` and `description`. A maximum of three actions are accepted. To learn more about check runs and requested actions, see \"[Check runs and requested actions](https://docs.github.com/rest/guides/using-the-rest-api-to-interact-with-checks#check-runs-and-requested-actions).\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("actions")
    public List<@Valid ChecksCreateRequestActionsInner> getActions() {
        return actions;
    }

    public void setActions(List<@Valid ChecksCreateRequestActionsInner> actions) {
        this.actions = actions;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChecksUpdateRequest checksUpdateRequest = (ChecksUpdateRequest) o;
        return Objects.equals(this.name, checksUpdateRequest.name)
                && Objects.equals(this.detailsUrl, checksUpdateRequest.detailsUrl)
                && Objects.equals(this.externalId, checksUpdateRequest.externalId)
                && Objects.equals(this.startedAt, checksUpdateRequest.startedAt)
                && Objects.equals(this.status, checksUpdateRequest.status)
                && Objects.equals(this.conclusion, checksUpdateRequest.conclusion)
                && Objects.equals(this.completedAt, checksUpdateRequest.completedAt)
                && Objects.equals(this.output, checksUpdateRequest.output)
                && Objects.equals(this.actions, checksUpdateRequest.actions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, detailsUrl, externalId, startedAt, status, conclusion, completedAt, output, actions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChecksUpdateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    detailsUrl: ").append(toIndentedString(detailsUrl)).append("\n");
        sb.append("    externalId: ").append(toIndentedString(externalId)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    output: ").append(toIndentedString(output)).append("\n");
        sb.append("    actions: ").append(toIndentedString(actions)).append("\n");
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
