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
 * EnvironmentProtectionRulesInner
 */
@JsonTypeName("environment_protection_rules_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnvironmentProtectionRulesInner {

    private Long id;

    private String nodeId;

    private String type;

    private Long waitTimer;

    private Boolean preventSelfReview;

    @Valid
    private List<@Valid PendingDeploymentReviewersInner> reviewers = new ArrayList<>();

    public EnvironmentProtectionRulesInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnvironmentProtectionRulesInner(Long id, String nodeId, String type) {
        this.id = id;
        this.nodeId = nodeId;
        this.type = type;
    }

    public EnvironmentProtectionRulesInner id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "3515", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnvironmentProtectionRulesInner nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDQ6R2F0ZTM1MTU=", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public EnvironmentProtectionRulesInner type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", example = "branch_policy", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EnvironmentProtectionRulesInner waitTimer(Long waitTimer) {
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

    public EnvironmentProtectionRulesInner preventSelfReview(Boolean preventSelfReview) {
        this.preventSelfReview = preventSelfReview;
        return this;
    }

    /**
     * Whether deployments to this environment can be approved by the user who created the deployment.
     * @return preventSelfReview
     */
    @Schema(
            name = "prevent_self_review",
            example = "false",
            description =
                    "Whether deployments to this environment can be approved by the user who created the deployment.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("prevent_self_review")
    public Boolean getPreventSelfReview() {
        return preventSelfReview;
    }

    public void setPreventSelfReview(Boolean preventSelfReview) {
        this.preventSelfReview = preventSelfReview;
    }

    public EnvironmentProtectionRulesInner reviewers(List<@Valid PendingDeploymentReviewersInner> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public EnvironmentProtectionRulesInner addReviewersItem(PendingDeploymentReviewersInner reviewersItem) {
        if (this.reviewers == null) {
            this.reviewers = new ArrayList<>();
        }
        this.reviewers.add(reviewersItem);
        return this;
    }

    /**
     * The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.
     * @return reviewers
     */
    @Valid
    @Schema(
            name = "reviewers",
            description =
                    "The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reviewers")
    public List<@Valid PendingDeploymentReviewersInner> getReviewers() {
        return reviewers;
    }

    public void setReviewers(List<@Valid PendingDeploymentReviewersInner> reviewers) {
        this.reviewers = reviewers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EnvironmentProtectionRulesInner environmentProtectionRulesInner = (EnvironmentProtectionRulesInner) o;
        return Objects.equals(this.id, environmentProtectionRulesInner.id)
                && Objects.equals(this.nodeId, environmentProtectionRulesInner.nodeId)
                && Objects.equals(this.type, environmentProtectionRulesInner.type)
                && Objects.equals(this.waitTimer, environmentProtectionRulesInner.waitTimer)
                && Objects.equals(this.preventSelfReview, environmentProtectionRulesInner.preventSelfReview)
                && Objects.equals(this.reviewers, environmentProtectionRulesInner.reviewers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, type, waitTimer, preventSelfReview, reviewers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentProtectionRulesInner {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    waitTimer: ").append(toIndentedString(waitTimer)).append("\n");
        sb.append("    preventSelfReview: ")
                .append(toIndentedString(preventSelfReview))
                .append("\n");
        sb.append("    reviewers: ").append(toIndentedString(reviewers)).append("\n");
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
