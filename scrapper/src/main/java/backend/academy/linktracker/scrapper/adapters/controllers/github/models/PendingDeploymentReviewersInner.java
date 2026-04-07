package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * PendingDeploymentReviewersInner
 */
@JsonTypeName("pending_deployment_reviewers_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PendingDeploymentReviewersInner {

    private Optional<DeploymentReviewerType> type = Optional.empty();

    private Optional<PendingDeploymentReviewersInnerReviewer> reviewer = Optional.empty();

    public PendingDeploymentReviewersInner type(DeploymentReviewerType type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Valid
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<DeploymentReviewerType> getType() {
        return type;
    }

    public void setType(Optional<DeploymentReviewerType> type) {
        this.type = type;
    }

    public PendingDeploymentReviewersInner reviewer(PendingDeploymentReviewersInnerReviewer reviewer) {
        this.reviewer = Optional.ofNullable(reviewer);
        return this;
    }

    /**
     * Get reviewer
     * @return reviewer
     */
    @Valid
    @Schema(name = "reviewer", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("reviewer")
    public Optional<PendingDeploymentReviewersInnerReviewer> getReviewer() {
        return reviewer;
    }

    public void setReviewer(Optional<PendingDeploymentReviewersInnerReviewer> reviewer) {
        this.reviewer = reviewer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PendingDeploymentReviewersInner pendingDeploymentReviewersInner = (PendingDeploymentReviewersInner) o;
        return Objects.equals(this.type, pendingDeploymentReviewersInner.type)
                && Objects.equals(this.reviewer, pendingDeploymentReviewersInner.reviewer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, reviewer);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PendingDeploymentReviewersInner {\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    reviewer: ").append(toIndentedString(reviewer)).append("\n");
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
