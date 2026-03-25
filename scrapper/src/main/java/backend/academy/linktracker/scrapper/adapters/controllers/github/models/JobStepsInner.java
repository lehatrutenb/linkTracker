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
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * JobStepsInner
 */
@JsonTypeName("job_steps_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class JobStepsInner {

    /**
     * The phase of the lifecycle that the job is currently in.
     */
    public enum StatusEnum {
        QUEUED("queued"),

        IN_PROGRESS("in_progress"),

        COMPLETED("completed");

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

    private String conclusion = null;

    private String name;

    private Long number;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime startedAt = null;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime completedAt = null;

    public JobStepsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public JobStepsInner(StatusEnum status, String conclusion, String name, Long number) {
        this.status = status;
        this.conclusion = conclusion;
        this.name = name;
        this.number = number;
    }

    public JobStepsInner status(StatusEnum status) {
        this.status = status;
        return this;
    }

    /**
     * The phase of the lifecycle that the job is currently in.
     * @return status
     */
    @NotNull
    @Schema(
            name = "status",
            example = "queued",
            description = "The phase of the lifecycle that the job is currently in.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("status")
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public JobStepsInner conclusion(String conclusion) {
        this.conclusion = conclusion;
        return this;
    }

    /**
     * The outcome of the job.
     * @return conclusion
     */
    @NotNull
    @Schema(
            name = "conclusion",
            example = "success",
            description = "The outcome of the job.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("conclusion")
    public String getConclusion() {
        return conclusion;
    }

    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public JobStepsInner name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the job.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "test-coverage",
            description = "The name of the job.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public JobStepsInner number(Long number) {
        this.number = number;
        return this;
    }

    /**
     * Get number
     * @return number
     */
    @NotNull
    @Schema(name = "number", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("number")
    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public JobStepsInner startedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
        return this;
    }

    /**
     * The time that the step started, in ISO 8601 format.
     * @return startedAt
     */
    @Valid
    @Schema(
            name = "started_at",
            example = "2019-08-08T08:00-07:00",
            description = "The time that the step started, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("started_at")
    public OffsetDateTime getStartedAt() {
        return startedAt;
    }

    public void setStartedAt(OffsetDateTime startedAt) {
        this.startedAt = startedAt;
    }

    public JobStepsInner completedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
        return this;
    }

    /**
     * The time that the job finished, in ISO 8601 format.
     * @return completedAt
     */
    @Valid
    @Schema(
            name = "completed_at",
            example = "2019-08-08T08:00-07:00",
            description = "The time that the job finished, in ISO 8601 format.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("completed_at")
    public OffsetDateTime getCompletedAt() {
        return completedAt;
    }

    public void setCompletedAt(OffsetDateTime completedAt) {
        this.completedAt = completedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        JobStepsInner jobStepsInner = (JobStepsInner) o;
        return Objects.equals(this.status, jobStepsInner.status)
                && Objects.equals(this.conclusion, jobStepsInner.conclusion)
                && Objects.equals(this.name, jobStepsInner.name)
                && Objects.equals(this.number, jobStepsInner.number)
                && Objects.equals(this.startedAt, jobStepsInner.startedAt)
                && Objects.equals(this.completedAt, jobStepsInner.completedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, conclusion, name, number, startedAt, completedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class JobStepsInner {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    conclusion: ").append(toIndentedString(conclusion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
        sb.append("    completedAt: ").append(toIndentedString(completedAt)).append("\n");
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
