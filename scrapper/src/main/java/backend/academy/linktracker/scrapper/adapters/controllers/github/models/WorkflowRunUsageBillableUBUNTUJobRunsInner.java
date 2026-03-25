package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WorkflowRunUsageBillableUBUNTUJobRunsInner
 */
@JsonTypeName("workflow_run_usage_billable_UBUNTU_job_runs_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowRunUsageBillableUBUNTUJobRunsInner {

    private Long jobId;

    private Long durationMs;

    public WorkflowRunUsageBillableUBUNTUJobRunsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WorkflowRunUsageBillableUBUNTUJobRunsInner(Long jobId, Long durationMs) {
        this.jobId = jobId;
        this.durationMs = durationMs;
    }

    public WorkflowRunUsageBillableUBUNTUJobRunsInner jobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }

    /**
     * Get jobId
     * @return jobId
     */
    @NotNull
    @Schema(name = "job_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("job_id")
    public Long getJobId() {
        return jobId;
    }

    public void setJobId(Long jobId) {
        this.jobId = jobId;
    }

    public WorkflowRunUsageBillableUBUNTUJobRunsInner durationMs(Long durationMs) {
        this.durationMs = durationMs;
        return this;
    }

    /**
     * Get durationMs
     * @return durationMs
     */
    @NotNull
    @Schema(name = "duration_ms", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("duration_ms")
    public Long getDurationMs() {
        return durationMs;
    }

    public void setDurationMs(Long durationMs) {
        this.durationMs = durationMs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowRunUsageBillableUBUNTUJobRunsInner workflowRunUsageBillableUBUNTUJobRunsInner =
                (WorkflowRunUsageBillableUBUNTUJobRunsInner) o;
        return Objects.equals(this.jobId, workflowRunUsageBillableUBUNTUJobRunsInner.jobId)
                && Objects.equals(this.durationMs, workflowRunUsageBillableUBUNTUJobRunsInner.durationMs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jobId, durationMs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowRunUsageBillableUBUNTUJobRunsInner {\n");
        sb.append("    jobId: ").append(toIndentedString(jobId)).append("\n");
        sb.append("    durationMs: ").append(toIndentedString(durationMs)).append("\n");
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
