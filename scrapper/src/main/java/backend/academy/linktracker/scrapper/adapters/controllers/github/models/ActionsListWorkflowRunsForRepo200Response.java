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
 * ActionsListWorkflowRunsForRepo200Response
 */
@JsonTypeName("actions_list_workflow_runs_for_repo_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListWorkflowRunsForRepo200Response {

    private Long totalCount;

    @Valid
    private List<@Valid WorkflowRun> workflowRuns = new ArrayList<>();

    public ActionsListWorkflowRunsForRepo200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListWorkflowRunsForRepo200Response(Long totalCount, List<@Valid WorkflowRun> workflowRuns) {
        this.totalCount = totalCount;
        this.workflowRuns = workflowRuns;
    }

    public ActionsListWorkflowRunsForRepo200Response totalCount(Long totalCount) {
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

    public ActionsListWorkflowRunsForRepo200Response workflowRuns(List<@Valid WorkflowRun> workflowRuns) {
        this.workflowRuns = workflowRuns;
        return this;
    }

    public ActionsListWorkflowRunsForRepo200Response addWorkflowRunsItem(WorkflowRun workflowRunsItem) {
        if (this.workflowRuns == null) {
            this.workflowRuns = new ArrayList<>();
        }
        this.workflowRuns.add(workflowRunsItem);
        return this;
    }

    /**
     * Get workflowRuns
     * @return workflowRuns
     */
    @NotNull
    @Valid
    @Schema(name = "workflow_runs", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflow_runs")
    public List<@Valid WorkflowRun> getWorkflowRuns() {
        return workflowRuns;
    }

    public void setWorkflowRuns(List<@Valid WorkflowRun> workflowRuns) {
        this.workflowRuns = workflowRuns;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsListWorkflowRunsForRepo200Response actionsListWorkflowRunsForRepo200Response =
                (ActionsListWorkflowRunsForRepo200Response) o;
        return Objects.equals(this.totalCount, actionsListWorkflowRunsForRepo200Response.totalCount)
                && Objects.equals(this.workflowRuns, actionsListWorkflowRunsForRepo200Response.workflowRuns);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, workflowRuns);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListWorkflowRunsForRepo200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    workflowRuns: ").append(toIndentedString(workflowRuns)).append("\n");
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
