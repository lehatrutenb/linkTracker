package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ActionsGetDefaultWorkflowPermissions
 */
@JsonTypeName("actions-get-default-workflow-permissions")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsGetDefaultWorkflowPermissions {

    private ActionsDefaultWorkflowPermissions defaultWorkflowPermissions;

    private Boolean canApprovePullRequestReviews;

    public ActionsGetDefaultWorkflowPermissions() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsGetDefaultWorkflowPermissions(
            ActionsDefaultWorkflowPermissions defaultWorkflowPermissions, Boolean canApprovePullRequestReviews) {
        this.defaultWorkflowPermissions = defaultWorkflowPermissions;
        this.canApprovePullRequestReviews = canApprovePullRequestReviews;
    }

    public ActionsGetDefaultWorkflowPermissions defaultWorkflowPermissions(
            ActionsDefaultWorkflowPermissions defaultWorkflowPermissions) {
        this.defaultWorkflowPermissions = defaultWorkflowPermissions;
        return this;
    }

    /**
     * Get defaultWorkflowPermissions
     * @return defaultWorkflowPermissions
     */
    @NotNull
    @Valid
    @Schema(name = "default_workflow_permissions", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("default_workflow_permissions")
    public ActionsDefaultWorkflowPermissions getDefaultWorkflowPermissions() {
        return defaultWorkflowPermissions;
    }

    public void setDefaultWorkflowPermissions(ActionsDefaultWorkflowPermissions defaultWorkflowPermissions) {
        this.defaultWorkflowPermissions = defaultWorkflowPermissions;
    }

    public ActionsGetDefaultWorkflowPermissions canApprovePullRequestReviews(Boolean canApprovePullRequestReviews) {
        this.canApprovePullRequestReviews = canApprovePullRequestReviews;
        return this;
    }

    /**
     * Whether GitHub Actions can approve pull requests. Enabling this can be a security risk.
     * @return canApprovePullRequestReviews
     */
    @NotNull
    @Schema(
            name = "can_approve_pull_request_reviews",
            description = "Whether GitHub Actions can approve pull requests. Enabling this can be a security risk.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("can_approve_pull_request_reviews")
    public Boolean getCanApprovePullRequestReviews() {
        return canApprovePullRequestReviews;
    }

    public void setCanApprovePullRequestReviews(Boolean canApprovePullRequestReviews) {
        this.canApprovePullRequestReviews = canApprovePullRequestReviews;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsGetDefaultWorkflowPermissions actionsGetDefaultWorkflowPermissions =
                (ActionsGetDefaultWorkflowPermissions) o;
        return Objects.equals(
                        this.defaultWorkflowPermissions,
                        actionsGetDefaultWorkflowPermissions.defaultWorkflowPermissions)
                && Objects.equals(
                        this.canApprovePullRequestReviews,
                        actionsGetDefaultWorkflowPermissions.canApprovePullRequestReviews);
    }

    @Override
    public int hashCode() {
        return Objects.hash(defaultWorkflowPermissions, canApprovePullRequestReviews);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsGetDefaultWorkflowPermissions {\n");
        sb.append("    defaultWorkflowPermissions: ")
                .append(toIndentedString(defaultWorkflowPermissions))
                .append("\n");
        sb.append("    canApprovePullRequestReviews: ")
                .append(toIndentedString(canApprovePullRequestReviews))
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
