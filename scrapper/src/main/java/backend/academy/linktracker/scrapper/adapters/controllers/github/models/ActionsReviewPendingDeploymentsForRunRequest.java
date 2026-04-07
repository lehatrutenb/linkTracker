package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ActionsReviewPendingDeploymentsForRunRequest
 */
@JsonTypeName("actions_review_pending_deployments_for_run_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsReviewPendingDeploymentsForRunRequest {

    @Valid
    private List<Long> environmentIds = new ArrayList<>();

    /**
     * Whether to approve or reject deployment to the specified environments.
     */
    public enum StateEnum {
        APPROVED("approved"),

        REJECTED("rejected");

        private final String value;

        StateEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private StateEnum state;

    private String comment;

    public ActionsReviewPendingDeploymentsForRunRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsReviewPendingDeploymentsForRunRequest(List<Long> environmentIds, StateEnum state, String comment) {
        this.environmentIds = environmentIds;
        this.state = state;
        this.comment = comment;
    }

    public ActionsReviewPendingDeploymentsForRunRequest environmentIds(List<Long> environmentIds) {
        this.environmentIds = environmentIds;
        return this;
    }

    public ActionsReviewPendingDeploymentsForRunRequest addEnvironmentIdsItem(Long environmentIdsItem) {
        if (this.environmentIds == null) {
            this.environmentIds = new ArrayList<>();
        }
        this.environmentIds.add(environmentIdsItem);
        return this;
    }

    /**
     * The list of environment ids to approve or reject
     * @return environmentIds
     */
    @NotNull
    @Schema(
            name = "environment_ids",
            example = "[161171787,161171795]",
            description = "The list of environment ids to approve or reject",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("environment_ids")
    public List<Long> getEnvironmentIds() {
        return environmentIds;
    }

    public void setEnvironmentIds(List<Long> environmentIds) {
        this.environmentIds = environmentIds;
    }

    public ActionsReviewPendingDeploymentsForRunRequest state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Whether to approve or reject deployment to the specified environments.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            example = "approved",
            description = "Whether to approve or reject deployment to the specified environments.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public ActionsReviewPendingDeploymentsForRunRequest comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * A comment to accompany the deployment review
     * @return comment
     */
    @NotNull
    @Schema(
            name = "comment",
            example = "Ship it!",
            description = "A comment to accompany the deployment review",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsReviewPendingDeploymentsForRunRequest actionsReviewPendingDeploymentsForRunRequest =
                (ActionsReviewPendingDeploymentsForRunRequest) o;
        return Objects.equals(this.environmentIds, actionsReviewPendingDeploymentsForRunRequest.environmentIds)
                && Objects.equals(this.state, actionsReviewPendingDeploymentsForRunRequest.state)
                && Objects.equals(this.comment, actionsReviewPendingDeploymentsForRunRequest.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environmentIds, state, comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsReviewPendingDeploymentsForRunRequest {\n");
        sb.append("    environmentIds: ")
                .append(toIndentedString(environmentIds))
                .append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
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
