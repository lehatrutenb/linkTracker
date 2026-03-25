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
 * ActionsListJobsForWorkflowRunAttempt200Response
 */
@JsonTypeName("actions_list_jobs_for_workflow_run_attempt_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListJobsForWorkflowRunAttempt200Response {

    private Long totalCount;

    @Valid
    private List<@Valid Job> jobs = new ArrayList<>();

    public ActionsListJobsForWorkflowRunAttempt200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListJobsForWorkflowRunAttempt200Response(Long totalCount, List<@Valid Job> jobs) {
        this.totalCount = totalCount;
        this.jobs = jobs;
    }

    public ActionsListJobsForWorkflowRunAttempt200Response totalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * Get totalCount
     * @return totalCount
     */
    @NotNull
    @Schema(name = "total_count", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_count")
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public ActionsListJobsForWorkflowRunAttempt200Response jobs(List<@Valid Job> jobs) {
        this.jobs = jobs;
        return this;
    }

    public ActionsListJobsForWorkflowRunAttempt200Response addJobsItem(Job jobsItem) {
        if (this.jobs == null) {
            this.jobs = new ArrayList<>();
        }
        this.jobs.add(jobsItem);
        return this;
    }

    /**
     * Get jobs
     * @return jobs
     */
    @NotNull
    @Valid
    @Schema(name = "jobs", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("jobs")
    public List<@Valid Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<@Valid Job> jobs) {
        this.jobs = jobs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsListJobsForWorkflowRunAttempt200Response actionsListJobsForWorkflowRunAttempt200Response =
                (ActionsListJobsForWorkflowRunAttempt200Response) o;
        return Objects.equals(this.totalCount, actionsListJobsForWorkflowRunAttempt200Response.totalCount)
                && Objects.equals(this.jobs, actionsListJobsForWorkflowRunAttempt200Response.jobs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, jobs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListJobsForWorkflowRunAttempt200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    jobs: ").append(toIndentedString(jobs)).append("\n");
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
