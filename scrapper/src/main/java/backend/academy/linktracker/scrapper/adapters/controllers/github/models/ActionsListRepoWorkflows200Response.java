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
 * ActionsListRepoWorkflows200Response
 */
@JsonTypeName("actions_list_repo_workflows_200_response")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsListRepoWorkflows200Response {

    private Long totalCount;

    @Valid
    private List<@Valid Workflow> workflows = new ArrayList<>();

    public ActionsListRepoWorkflows200Response() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsListRepoWorkflows200Response(Long totalCount, List<@Valid Workflow> workflows) {
        this.totalCount = totalCount;
        this.workflows = workflows;
    }

    public ActionsListRepoWorkflows200Response totalCount(Long totalCount) {
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

    public ActionsListRepoWorkflows200Response workflows(List<@Valid Workflow> workflows) {
        this.workflows = workflows;
        return this;
    }

    public ActionsListRepoWorkflows200Response addWorkflowsItem(Workflow workflowsItem) {
        if (this.workflows == null) {
            this.workflows = new ArrayList<>();
        }
        this.workflows.add(workflowsItem);
        return this;
    }

    /**
     * Get workflows
     * @return workflows
     */
    @NotNull
    @Valid
    @Schema(name = "workflows", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflows")
    public List<@Valid Workflow> getWorkflows() {
        return workflows;
    }

    public void setWorkflows(List<@Valid Workflow> workflows) {
        this.workflows = workflows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsListRepoWorkflows200Response actionsListRepoWorkflows200Response =
                (ActionsListRepoWorkflows200Response) o;
        return Objects.equals(this.totalCount, actionsListRepoWorkflows200Response.totalCount)
                && Objects.equals(this.workflows, actionsListRepoWorkflows200Response.workflows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, workflows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsListRepoWorkflows200Response {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    workflows: ").append(toIndentedString(workflows)).append("\n");
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
