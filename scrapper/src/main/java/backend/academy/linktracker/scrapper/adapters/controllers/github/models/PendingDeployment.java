package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Details of a deployment that is waiting for protection rules to pass
 */
@Schema(
        name = "pending-deployment",
        description = "Details of a deployment that is waiting for protection rules to pass")
@JsonTypeName("pending-deployment")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PendingDeployment {

    private PendingDeploymentEnvironment environment;

    private Long waitTimer;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> waitTimerStartedAt = JsonNullable.<OffsetDateTime>undefined();

    private Boolean currentUserCanApprove;

    @Valid
    private List<@Valid PendingDeploymentReviewersInner> reviewers = new ArrayList<>();

    public PendingDeployment() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PendingDeployment(
            PendingDeploymentEnvironment environment,
            Long waitTimer,
            OffsetDateTime waitTimerStartedAt,
            Boolean currentUserCanApprove,
            List<@Valid PendingDeploymentReviewersInner> reviewers) {
        this.environment = environment;
        this.waitTimer = waitTimer;
        this.waitTimerStartedAt = JsonNullable.of(waitTimerStartedAt);
        this.currentUserCanApprove = currentUserCanApprove;
        this.reviewers = reviewers;
    }

    public PendingDeployment environment(PendingDeploymentEnvironment environment) {
        this.environment = environment;
        return this;
    }

    /**
     * Get environment
     * @return environment
     */
    @NotNull
    @Valid
    @Schema(name = "environment", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("environment")
    public PendingDeploymentEnvironment getEnvironment() {
        return environment;
    }

    public void setEnvironment(PendingDeploymentEnvironment environment) {
        this.environment = environment;
    }

    public PendingDeployment waitTimer(Long waitTimer) {
        this.waitTimer = waitTimer;
        return this;
    }

    /**
     * The set duration of the wait timer
     * @return waitTimer
     */
    @NotNull
    @Schema(
            name = "wait_timer",
            example = "30",
            description = "The set duration of the wait timer",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("wait_timer")
    public Long getWaitTimer() {
        return waitTimer;
    }

    public void setWaitTimer(Long waitTimer) {
        this.waitTimer = waitTimer;
    }

    public PendingDeployment waitTimerStartedAt(OffsetDateTime waitTimerStartedAt) {
        this.waitTimerStartedAt = JsonNullable.of(waitTimerStartedAt);
        return this;
    }

    /**
     * The time that the wait timer began.
     * @return waitTimerStartedAt
     */
    @NotNull
    @Valid
    @Schema(
            name = "wait_timer_started_at",
            example = "2020-11-23T22:00:40Z",
            description = "The time that the wait timer began.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("wait_timer_started_at")
    public JsonNullable<OffsetDateTime> getWaitTimerStartedAt() {
        return waitTimerStartedAt;
    }

    public void setWaitTimerStartedAt(JsonNullable<OffsetDateTime> waitTimerStartedAt) {
        this.waitTimerStartedAt = waitTimerStartedAt;
    }

    public PendingDeployment currentUserCanApprove(Boolean currentUserCanApprove) {
        this.currentUserCanApprove = currentUserCanApprove;
        return this;
    }

    /**
     * Whether the currently authenticated user can approve the deployment
     * @return currentUserCanApprove
     */
    @NotNull
    @Schema(
            name = "current_user_can_approve",
            example = "true",
            description = "Whether the currently authenticated user can approve the deployment",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("current_user_can_approve")
    public Boolean getCurrentUserCanApprove() {
        return currentUserCanApprove;
    }

    public void setCurrentUserCanApprove(Boolean currentUserCanApprove) {
        this.currentUserCanApprove = currentUserCanApprove;
    }

    public PendingDeployment reviewers(List<@Valid PendingDeploymentReviewersInner> reviewers) {
        this.reviewers = reviewers;
        return this;
    }

    public PendingDeployment addReviewersItem(PendingDeploymentReviewersInner reviewersItem) {
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
    @NotNull
    @Valid
    @Schema(
            name = "reviewers",
            description =
                    "The people or teams that may approve jobs that reference the environment. You can list up to six users or teams as reviewers. The reviewers must have at least read access to the repository. Only one of the required reviewers needs to approve the job for it to proceed.",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        PendingDeployment pendingDeployment = (PendingDeployment) o;
        return Objects.equals(this.environment, pendingDeployment.environment)
                && Objects.equals(this.waitTimer, pendingDeployment.waitTimer)
                && Objects.equals(this.waitTimerStartedAt, pendingDeployment.waitTimerStartedAt)
                && Objects.equals(this.currentUserCanApprove, pendingDeployment.currentUserCanApprove)
                && Objects.equals(this.reviewers, pendingDeployment.reviewers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environment, waitTimer, waitTimerStartedAt, currentUserCanApprove, reviewers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PendingDeployment {\n");
        sb.append("    environment: ").append(toIndentedString(environment)).append("\n");
        sb.append("    waitTimer: ").append(toIndentedString(waitTimer)).append("\n");
        sb.append("    waitTimerStartedAt: ")
                .append(toIndentedString(waitTimerStartedAt))
                .append("\n");
        sb.append("    currentUserCanApprove: ")
                .append(toIndentedString(currentUserCanApprove))
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
