package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * WorkflowRunUsageBillableUBUNTU
 */
@JsonTypeName("workflow_run_usage_billable_UBUNTU")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WorkflowRunUsageBillableUBUNTU {

    private Long totalMs;

    private Long jobs;

    @Valid
    private List<@Valid WorkflowRunUsageBillableUBUNTUJobRunsInner> jobRuns = new ArrayList<>();

    public WorkflowRunUsageBillableUBUNTU() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WorkflowRunUsageBillableUBUNTU(Long totalMs, Long jobs) {
        this.totalMs = totalMs;
        this.jobs = jobs;
    }

    public WorkflowRunUsageBillableUBUNTU totalMs(Long totalMs) {
        this.totalMs = totalMs;
        return this;
    }

    /**
     * Get totalMs
     * @return totalMs
     */
    @NotNull
    @Schema(name = "total_ms", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_ms")
    public Long getTotalMs() {
        return totalMs;
    }

    public void setTotalMs(Long totalMs) {
        this.totalMs = totalMs;
    }

    public WorkflowRunUsageBillableUBUNTU jobs(Long jobs) {
        this.jobs = jobs;
        return this;
    }

    /**
     * Get jobs
     * @return jobs
     */
    @NotNull
    @Schema(name = "jobs", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("jobs")
    public Long getJobs() {
        return jobs;
    }

    public void setJobs(Long jobs) {
        this.jobs = jobs;
    }

    public WorkflowRunUsageBillableUBUNTU jobRuns(List<@Valid WorkflowRunUsageBillableUBUNTUJobRunsInner> jobRuns) {
        this.jobRuns = jobRuns;
        return this;
    }

    public WorkflowRunUsageBillableUBUNTU addJobRunsItem(WorkflowRunUsageBillableUBUNTUJobRunsInner jobRunsItem) {
        if (this.jobRuns == null) {
            this.jobRuns = new ArrayList<>();
        }
        this.jobRuns.add(jobRunsItem);
        return this;
    }

    /**
     * Get jobRuns
     * @return jobRuns
     */
    @Valid
    @Schema(name = "job_runs", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("job_runs")
    public List<@Valid WorkflowRunUsageBillableUBUNTUJobRunsInner> getJobRuns() {
        return jobRuns;
    }

    public void setJobRuns(List<@Valid WorkflowRunUsageBillableUBUNTUJobRunsInner> jobRuns) {
        this.jobRuns = jobRuns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WorkflowRunUsageBillableUBUNTU workflowRunUsageBillableUBUNTU = (WorkflowRunUsageBillableUBUNTU) o;
        return Objects.equals(this.totalMs, workflowRunUsageBillableUBUNTU.totalMs)
                && Objects.equals(this.jobs, workflowRunUsageBillableUBUNTU.jobs)
                && Objects.equals(this.jobRuns, workflowRunUsageBillableUBUNTU.jobRuns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalMs, jobs, jobRuns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkflowRunUsageBillableUBUNTU {\n");
        sb.append("    totalMs: ").append(toIndentedString(totalMs)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
        sb.append("    jobRuns: ").append(toIndentedString(jobRuns)).append("\n");
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
