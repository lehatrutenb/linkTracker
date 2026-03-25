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
 * ReposCreateOrUpdateEnvironmentRequest
 */
@JsonTypeName("repos_create_or_update_environment_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateOrUpdateEnvironmentRequest {

    private Long waitTimer;

    private Boolean preventSelfReview;

    @Valid
    private List<@Valid ReposCreateOrUpdateEnvironmentRequestReviewersInner> reviewers;

    private DeploymentBranchPolicySettings deploymentBranchPolicy = null;

    public ReposCreateOrUpdateEnvironmentRequest waitTimer(Long waitTimer) {
        this.waitTimer = waitTimer;
        return this;
    }

    /**
     * The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days).
     * @return waitTimer
     */
    @Schema(
            name = "wait_timer",
            example = "30",
            description =
                    "The amount of time to delay a job after the job is initially triggered. The time (in minutes) must be an integer between 0 and 43,200 (30 days).",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("wait_timer")
    public Long getWaitTimer() {
        return waitTimer;
    }

    public void setWaitTimer(Long waitTimer) {
        this.waitTimer = waitTimer;
    }

    public ReposCreateOrUpdateEnvironmentRequest preventSelfReview(Boolean preventSelfReview) {
        this.preventSelfReview = preventSelfReview;
        return this;
    }

    /**
     * Whether or not a user who created the job is prevented from approving their own job.
     * @return preventSelfReview
     */
    @Schema(
            name = "prevent_self_review",
            example = "false",
            description = "Whether or not a user who created the job is prevented from approving their own job.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("prevent_self_review")
    public Boolean getPreventSelfReview() {
        return preventSelfReview;
    }

    public void setPreventSelfReview(Boolean preventSelfReview) {
        this.preventSelfReview = preventSelfReview;
    }

    public ReposCreateOrUpdateEnvironmentRequest reviewers(
            List<@Valid ReposCreateOrUpdateEnvironmentRequestReviewersInner> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public ReposCreateOrUpdateEnvironmentRequest addReviewersItem(
            ReposCreateOrUpdateEnvironmentRequestReviewersInner reviewersItem) {
        if (this.reviewers == null) {
            this.reviewers = new ArrayList<>();
        }
        this.reviewers.add(reviewersItem);
        return this;
    }

    /**
     * The people or teams that may review jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.
     * @return reviewers
     */
    @Valid
    @Schema(
            name = "reviewers",
            description =
                    "The people or teams that may review jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reviewers")
    public List<@Valid ReposCreateOrUpdateEnvironmentRequestReviewersInner> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<@Valid ReposCreateOrUpdateEnvironmentRequestReviewersInner> reviewers) {
        this.reviewers = reviewers;
    }

    public ReposCreateOrUpdateEnvironmentRequest deploymentBranchPolicy(
            DeploymentBranchPolicySettings deploymentBranchPolicy) {
        this.deploymentBranchPolicy = deploymentBranchPolicy;
        return this;
    }

    /**
     * Get deploymentBranchPolicy
     * @return deploymentBranchPolicy
     */
    @Valid
    @Schema(name = "deployment_branch_policy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployment_branch_policy")
    public DeploymentBranchPolicySettings getDeploymentBranchPolicy() {
        return deploymentBranchPolicy;
    }

    public void setDeploymentBranchPolicy(DeploymentBranchPolicySettings deploymentBranchPolicy) {
        this.deploymentBranchPolicy = deploymentBranchPolicy;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposCreateOrUpdateEnvironmentRequest reposCreateOrUpdateEnvironmentRequest =
                (ReposCreateOrUpdateEnvironmentRequest) o;
        return Objects.equals(this.waitTimer, reposCreateOrUpdateEnvironmentRequest.waitTimer)
                && Objects.equals(this.preventSelfReview, reposCreateOrUpdateEnvironmentRequest.preventSelfReview)
                && Objects.equals(this.reviewers, reposCreateOrUpdateEnvironmentRequest.reviewers)
                && Objects.equals(
                        this.deploymentBranchPolicy, reposCreateOrUpdateEnvironmentRequest.deploymentBranchPolicy);
    }

    @Override
    public int hashCode() {
        return Objects.hash(waitTimer, preventSelfReview, reviewers, deploymentBranchPolicy);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateOrUpdateEnvironmentRequest {\n");
        sb.append("    waitTimer: ").append(toIndentedString(waitTimer)).append("\n");
        sb.append("    preventSelfReview: ")
                .append(toIndentedString(preventSelfReview))
                .append("\n");
        sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
        sb.append("    deploymentBranchPolicy: ")
                .append(toIndentedString(deploymentBranchPolicy))
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
