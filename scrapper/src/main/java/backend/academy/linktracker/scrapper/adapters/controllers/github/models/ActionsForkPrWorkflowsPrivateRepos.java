package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * ActionsForkPrWorkflowsPrivateRepos
 */
@JsonTypeName("actions-fork-pr-workflows-private-repos")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsForkPrWorkflowsPrivateRepos {

    private Boolean runWorkflowsFromForkPullRequests;

    private Boolean sendWriteTokensToWorkflows;

    private Boolean sendSecretsAndVariables;

    private Boolean requireApprovalForForkPrWorkflows;

    public ActionsForkPrWorkflowsPrivateRepos() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsForkPrWorkflowsPrivateRepos(
            Boolean runWorkflowsFromForkPullRequests,
            Boolean sendWriteTokensToWorkflows,
            Boolean sendSecretsAndVariables,
            Boolean requireApprovalForForkPrWorkflows) {
        this.runWorkflowsFromForkPullRequests = runWorkflowsFromForkPullRequests;
        this.sendWriteTokensToWorkflows = sendWriteTokensToWorkflows;
        this.sendSecretsAndVariables = sendSecretsAndVariables;
        this.requireApprovalForForkPrWorkflows = requireApprovalForForkPrWorkflows;
    }

    public ActionsForkPrWorkflowsPrivateRepos runWorkflowsFromForkPullRequests(
            Boolean runWorkflowsFromForkPullRequests) {
        this.runWorkflowsFromForkPullRequests = runWorkflowsFromForkPullRequests;
        return this;
    }

    /**
     * Whether workflows triggered by pull requests from forks are allowed to run on private repositories.
     * @return runWorkflowsFromForkPullRequests
     */
    @NotNull
    @Schema(
            name = "run_workflows_from_fork_pull_requests",
            description =
                    "Whether workflows triggered by pull requests from forks are allowed to run on private repositories.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("run_workflows_from_fork_pull_requests")
    public Boolean getRunWorkflowsFromForkPullRequests() {
        return runWorkflowsFromForkPullRequests;
    }

    public void setRunWorkflowsFromForkPullRequests(Boolean runWorkflowsFromForkPullRequests) {
        this.runWorkflowsFromForkPullRequests = runWorkflowsFromForkPullRequests;
    }

    public ActionsForkPrWorkflowsPrivateRepos sendWriteTokensToWorkflows(Boolean sendWriteTokensToWorkflows) {
        this.sendWriteTokensToWorkflows = sendWriteTokensToWorkflows;
        return this;
    }

    /**
     * Whether GitHub Actions can create pull requests or submit approving pull request reviews from a workflow triggered by a fork pull request.
     * @return sendWriteTokensToWorkflows
     */
    @NotNull
    @Schema(
            name = "send_write_tokens_to_workflows",
            description =
                    "Whether GitHub Actions can create pull requests or submit approving pull request reviews from a workflow triggered by a fork pull request.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("send_write_tokens_to_workflows")
    public Boolean getSendWriteTokensToWorkflows() {
        return sendWriteTokensToWorkflows;
    }

    public void setSendWriteTokensToWorkflows(Boolean sendWriteTokensToWorkflows) {
        this.sendWriteTokensToWorkflows = sendWriteTokensToWorkflows;
    }

    public ActionsForkPrWorkflowsPrivateRepos sendSecretsAndVariables(Boolean sendSecretsAndVariables) {
        this.sendSecretsAndVariables = sendSecretsAndVariables;
        return this;
    }

    /**
     * Whether to make secrets and variables available to workflows triggered by pull requests from forks.
     * @return sendSecretsAndVariables
     */
    @NotNull
    @Schema(
            name = "send_secrets_and_variables",
            description =
                    "Whether to make secrets and variables available to workflows triggered by pull requests from forks.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("send_secrets_and_variables")
    public Boolean getSendSecretsAndVariables() {
        return sendSecretsAndVariables;
    }

    public void setSendSecretsAndVariables(Boolean sendSecretsAndVariables) {
        this.sendSecretsAndVariables = sendSecretsAndVariables;
    }

    public ActionsForkPrWorkflowsPrivateRepos requireApprovalForForkPrWorkflows(
            Boolean requireApprovalForForkPrWorkflows) {
        this.requireApprovalForForkPrWorkflows = requireApprovalForForkPrWorkflows;
        return this;
    }

    /**
     * Whether workflows triggered by pull requests from forks require approval from a repository administrator to run.
     * @return requireApprovalForForkPrWorkflows
     */
    @NotNull
    @Schema(
            name = "require_approval_for_fork_pr_workflows",
            description =
                    "Whether workflows triggered by pull requests from forks require approval from a repository administrator to run.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("require_approval_for_fork_pr_workflows")
    public Boolean getRequireApprovalForForkPrWorkflows() {
        return requireApprovalForForkPrWorkflows;
    }

    public void setRequireApprovalForForkPrWorkflows(Boolean requireApprovalForForkPrWorkflows) {
        this.requireApprovalForForkPrWorkflows = requireApprovalForForkPrWorkflows;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsForkPrWorkflowsPrivateRepos actionsForkPrWorkflowsPrivateRepos = (ActionsForkPrWorkflowsPrivateRepos) o;
        return Objects.equals(
                        this.runWorkflowsFromForkPullRequests,
                        actionsForkPrWorkflowsPrivateRepos.runWorkflowsFromForkPullRequests)
                && Objects.equals(
                        this.sendWriteTokensToWorkflows, actionsForkPrWorkflowsPrivateRepos.sendWriteTokensToWorkflows)
                && Objects.equals(
                        this.sendSecretsAndVariables, actionsForkPrWorkflowsPrivateRepos.sendSecretsAndVariables)
                && Objects.equals(
                        this.requireApprovalForForkPrWorkflows,
                        actionsForkPrWorkflowsPrivateRepos.requireApprovalForForkPrWorkflows);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                runWorkflowsFromForkPullRequests,
                sendWriteTokensToWorkflows,
                sendSecretsAndVariables,
                requireApprovalForForkPrWorkflows);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsForkPrWorkflowsPrivateRepos {\n");
        sb.append("    runWorkflowsFromForkPullRequests: ")
                .append(toIndentedString(runWorkflowsFromForkPullRequests))
                .append("\n");
        sb.append("    sendWriteTokensToWorkflows: ")
                .append(toIndentedString(sendWriteTokensToWorkflows))
                .append("\n");
        sb.append("    sendSecretsAndVariables: ")
                .append(toIndentedString(sendSecretsAndVariables))
                .append("\n");
        sb.append("    requireApprovalForForkPrWorkflows: ")
                .append(toIndentedString(requireApprovalForForkPrWorkflows))
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
