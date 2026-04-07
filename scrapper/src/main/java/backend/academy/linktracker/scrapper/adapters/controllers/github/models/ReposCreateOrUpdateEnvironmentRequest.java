package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ReposCreateOrUpdateEnvironmentRequest
 */
@JsonTypeName("repos_create_or_update_environment_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateOrUpdateEnvironmentRequest {

    private Optional<Long> waitTimer = Optional.empty();

    private Optional<Boolean> preventSelfReview = Optional.empty();

    @Valid
    private JsonNullable<List<@Valid ReposCreateOrUpdateEnvironmentRequestReviewersInner>> reviewers =
            JsonNullable.<List<@Valid ReposCreateOrUpdateEnvironmentRequestReviewersInner>>undefined();

    private JsonNullable<DeploymentBranchPolicySettings> deploymentBranchPolicy =
            JsonNullable.<DeploymentBranchPolicySettings>undefined();

    public ReposCreateOrUpdateEnvironmentRequest waitTimer(Long waitTimer) {
        this.waitTimer = Optional.ofNullable(waitTimer);
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
    public Optional<Long> getWaitTimer() {
        return waitTimer;
    }

    public void setWaitTimer(Optional<Long> waitTimer) {
        this.waitTimer = waitTimer;
    }

    public ReposCreateOrUpdateEnvironmentRequest preventSelfReview(Boolean preventSelfReview) {
        this.preventSelfReview = Optional.ofNullable(preventSelfReview);
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
    public Optional<Boolean> getPreventSelfReview() {
        return preventSelfReview;
    }

    public void setPreventSelfReview(Optional<Boolean> preventSelfReview) {
        this.preventSelfReview = preventSelfReview;
    }

    public ReposCreateOrUpdateEnvironmentRequest reviewers(
            List<@Valid ReposCreateOrUpdateEnvironmentRequestReviewersInner> reviewers) {
        this.reviewers = JsonNullable.of(reviewers);
        return this;
    }

    public ReposCreateOrUpdateEnvironmentRequest addReviewersItem(
            ReposCreateOrUpdateEnvironmentRequestReviewersInner reviewersItem) {
        if (this.reviewers == null || !this.reviewers.isPresent()) {
            this.reviewers = JsonNullable.of(new ArrayList<>());
        }
        this.reviewers.get().add(reviewersItem);
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
    public JsonNullable<List<@Valid ReposCreateOrUpdateEnvironmentRequestReviewersInner>> getReviewers() {
        return reviewers;
    }

    public void setReviewers(JsonNullable<List<@Valid ReposCreateOrUpdateEnvironmentRequestReviewersInner>> reviewers) {
        this.reviewers = reviewers;
    }

    public ReposCreateOrUpdateEnvironmentRequest deploymentBranchPolicy(
            DeploymentBranchPolicySettings deploymentBranchPolicy) {
        this.deploymentBranchPolicy = JsonNullable.of(deploymentBranchPolicy);
        return this;
    }

    /**
     * Get deploymentBranchPolicy
     * @return deploymentBranchPolicy
     */
    @Valid
    @Schema(name = "deployment_branch_policy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deployment_branch_policy")
    public JsonNullable<DeploymentBranchPolicySettings> getDeploymentBranchPolicy() {
        return deploymentBranchPolicy;
    }

    public void setDeploymentBranchPolicy(JsonNullable<DeploymentBranchPolicySettings> deploymentBranchPolicy) {
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
                && equalsNullable(this.reviewers, reposCreateOrUpdateEnvironmentRequest.reviewers)
                && equalsNullable(
                        this.deploymentBranchPolicy, reposCreateOrUpdateEnvironmentRequest.deploymentBranchPolicy);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                waitTimer, preventSelfReview, hashCodeNullable(reviewers), hashCodeNullable(deploymentBranchPolicy));
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
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
