package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WorkflowStep4
 */
@JsonTypeName("Workflow_Step_4")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowStep4 {

    private JsonNullable<String> completedAt = JsonNullable.<String>undefined();

    /**
     * Gets or Sets conclusion
     */
    public enum ConclusionEnum {
        FAILURE("failure"),

        SKIPPED("skipped"),

        SUCCESS("success"),

        CANCELLED("cancelled");

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
            return null;
        }
    }

    private JsonNullable<ConclusionEnum> conclusion = JsonNullable.<ConclusionEnum>undefined();

    private String name;

    private Long number;

    private JsonNullable<String> startedAt = JsonNullable.<String>undefined();

    /**
     * Gets or Sets status
     */
    public enum StatusEnum {
        COMPLETED("completed"),

        IN_PROGRESS("in_progress"),

        QUEUED("queued"),

        PENDING("pending"),

        WAITING("waiting");

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

    public WorkflowStep4() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WorkflowStep4(
            String completedAt,
            ConclusionEnum conclusion,
            String name,
            Long number,
            String startedAt,
            StatusEnum status) {
        this.completedAt = JsonNullable.of(completedAt);
        this.conclusion = JsonNullable.of(conclusion);
        this.name = name;
        this.number = number;
        this.startedAt = JsonNullable.of(startedAt);
        this.status = status;
    }

    public WorkflowStep4 completedAt(String completedAt) {
        this.completedAt = JsonNullable.of(completedAt);
        return this;
    }

    /**
     * Get completedAt
     * @return completedAt
     */
    @NotNull
    @Schema(name = "completed_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("completed_at")
    public JsonNullable<String> getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(JsonNullable<String> completedAt) {
        this.completedAt = completedAt;
    }

    public WorkflowStep4 conclusion(ConclusionEnum conclusion) {
        this.conclusion = JsonNullable.of(conclusion);
        return this;
    }

    /**
     * Get conclusion
     * @return conclusion
     */
    @NotNull
    @Schema(name = "conclusion", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("conclusion")
    public JsonNullable<ConclusionEnum> getConclusion() {
        return conclusion;
    }

    public void setConclusion(JsonNullable<ConclusionEnum> conclusion) {
        this.conclusion = conclusion;
    }

    public WorkflowStep4 name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkflowStep4 number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @NotNull
    @Schema(name = "number", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public WorkflowStep4 startedAt(String startedAt) {
        this.startedAt = JsonNullable.of(startedAt);
        return this;
    }

    /**
     * Get startedAt
     * @return startedAt
     */
    @NotNull
    @Schema(name = "started_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("started_at")
    public JsonNullable<String> getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(JsonNullable<String> startedAt) {
        this.startedAt = startedAt;
    }

    public WorkflowStep4 status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * Get status
     * @return status
     */
    @NotNull
    @Schema(name = "status", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowStep4 workflowStep4 = (WorkflowStep4) o;
        return Objects.equals(this.completedAt, workflowStep4.completedAt)
                && Objects.equals(this.conclusion, workflowStep4.conclusion)
                && Objects.equals(this.name, workflowStep4.name)
                && Objects.equals(this.number, workflowStep4.number)
                && Objects.equals(this.startedAt, workflowStep4.startedAt)
                && Objects.equals(this.status, workflowStep4.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(completedAt, conclusion, name, number, startedAt, status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowStep4 {\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
