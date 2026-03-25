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
 * RepositoryRuleWorkflowsParameters
 */
@JsonTypeName("repository_rule_workflows_parameters")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryRuleWorkflowsParameters {

    private Boolean doNotEnforceOnCreate;

    @Valid
    private List<@Valid RepositoryRuleParamsWorkflowFileReference> workflows = new ArrayList<>();

    public RepositoryRuleWorkflowsParameters() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryRuleWorkflowsParameters(List<@Valid RepositoryRuleParamsWorkflowFileReference> workflows) {
        this.workflows = workflows;
    }

    public RepositoryRuleWorkflowsParameters doNotEnforceOnCreate(Boolean doNotEnforceOnCreate) {
        this.doNotEnforceOnCreate = doNotEnforceOnCreate;
        return this;
    }

    /**
     * Allow repositories and branches to be created if a check would otherwise prohibit it.
     * @return doNotEnforceOnCreate
     */
    @Schema(
            name = "do_not_enforce_on_create",
            description = "Allow repositories and branches to be created if a check would otherwise prohibit it.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("do_not_enforce_on_create")
    public Boolean getDoNotEnforceOnCreate() {
        return doNotEnforceOnCreate;
    }

    public void setDoNotEnforceOnCreate(Boolean doNotEnforceOnCreate) {
        this.doNotEnforceOnCreate = doNotEnforceOnCreate;
    }

    public RepositoryRuleWorkflowsParameters workflows(
            List<@Valid RepositoryRuleParamsWorkflowFileReference> workflows) {
        this.workflows = workflows;
        return this;
    }

    public RepositoryRuleWorkflowsParameters addWorkflowsItem(RepositoryRuleParamsWorkflowFileReference workflowsItem) {
        if (this.workflows == null) {
            this.workflows = new ArrayList<>();
        }
        this.workflows.add(workflowsItem);
        return this;
    }

    /**
     * Workflows that must pass for this rule to pass.
     * @return workflows
     */
    @NotNull
    @Valid
    @Schema(
            name = "workflows",
            description = "Workflows that must pass for this rule to pass.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("workflows")
    public List<@Valid RepositoryRuleParamsWorkflowFileReference> getWorkflows() {
        return workflows;
    }

    public void setWorkflows(List<@Valid RepositoryRuleParamsWorkflowFileReference> workflows) {
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
        RepositoryRuleWorkflowsParameters repositoryRuleWorkflowsParameters = (RepositoryRuleWorkflowsParameters) o;
        return Objects.equals(this.doNotEnforceOnCreate, repositoryRuleWorkflowsParameters.doNotEnforceOnCreate)
                && Objects.equals(this.workflows, repositoryRuleWorkflowsParameters.workflows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(doNotEnforceOnCreate, workflows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryRuleWorkflowsParameters {\n");
        sb.append("    doNotEnforceOnCreate: ")
                .append(toIndentedString(doNotEnforceOnCreate))
                .append("\n");
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
