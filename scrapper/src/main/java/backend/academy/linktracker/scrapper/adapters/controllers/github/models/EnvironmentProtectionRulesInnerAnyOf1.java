package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * EnvironmentProtectionRulesInnerAnyOf1
 */
@JsonTypeName("environment_protection_rules_inner_anyOf_1")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnvironmentProtectionRulesInnerAnyOf1 {

    private Long id;

    private String nodeId;

    private Optional<Boolean> preventSelfReview = Optional.empty();

    private String type;

    @Valid
    private List<@Valid PendingDeploymentReviewersInner> reviewers = new ArrayList<>();

    public EnvironmentProtectionRulesInnerAnyOf1() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnvironmentProtectionRulesInnerAnyOf1(Long id, String nodeId, String type) {
        this.id = id;
        this.nodeId = nodeId;
        this.type = type;
    }

    public EnvironmentProtectionRulesInnerAnyOf1 id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "3755", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public EnvironmentProtectionRulesInnerAnyOf1 nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDQ6R2F0ZTM3NTU=", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public EnvironmentProtectionRulesInnerAnyOf1 preventSelfReview(Boolean preventSelfReview) {
        this.preventSelfReview = Optional.ofNullable(preventSelfReview);
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
    public Optional<Boolean> getPreventSelfReview() {
        return preventSelfReview;
    }

    public void setPreventSelfReview(Optional<Boolean> preventSelfReview) {
        this.preventSelfReview = preventSelfReview;
    }

    public EnvironmentProtectionRulesInnerAnyOf1 type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", example = "required_reviewers", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public EnvironmentProtectionRulesInnerAnyOf1 reviewers(List<@Valid PendingDeploymentReviewersInner> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public EnvironmentProtectionRulesInnerAnyOf1 addReviewersItem(PendingDeploymentReviewersInner reviewersItem) {
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
        EnvironmentProtectionRulesInnerAnyOf1 environmentProtectionRulesInnerAnyOf1 =
                (EnvironmentProtectionRulesInnerAnyOf1) o;
        return Objects.equals(this.id, environmentProtectionRulesInnerAnyOf1.id)
                && Objects.equals(this.nodeId, environmentProtectionRulesInnerAnyOf1.nodeId)
                && Objects.equals(this.preventSelfReview, environmentProtectionRulesInnerAnyOf1.preventSelfReview)
                && Objects.equals(this.type, environmentProtectionRulesInnerAnyOf1.type)
                && Objects.equals(this.reviewers, environmentProtectionRulesInnerAnyOf1.reviewers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nodeId, preventSelfReview, type, reviewers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentProtectionRulesInnerAnyOf1 {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    preventSelfReview: ")
                .append(toIndentedString(preventSelfReview))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
