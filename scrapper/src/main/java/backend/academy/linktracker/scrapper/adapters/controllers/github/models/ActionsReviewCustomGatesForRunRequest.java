package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * ActionsReviewCustomGatesForRunRequest
 */
@JsonTypeName("actions_review_custom_gates_for_run_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ActionsReviewCustomGatesForRunRequest {

    private String environmentName;

    private String comment;

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

    public ActionsReviewCustomGatesForRunRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ActionsReviewCustomGatesForRunRequest(String environmentName, String comment, StateEnum state) {
        this.environmentName = environmentName;
        this.comment = comment;
        this.state = state;
    }

    public ActionsReviewCustomGatesForRunRequest environmentName(String environmentName) {
        this.environmentName = environmentName;
        return this;
    }

    /**
     * The name of the environment to approve or reject.
     * @return environmentName
     */
    @NotNull
    @Schema(
            name = "environment_name",
            description = "The name of the environment to approve or reject.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("environment_name")
    public String getEnvironmentName() {
        return environmentName;
    }

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    public ActionsReviewCustomGatesForRunRequest comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Optional comment to include with the review.
     * @return comment
     */
    @NotNull
    @Schema(
            name = "comment",
            description = "Optional comment to include with the review.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public ActionsReviewCustomGatesForRunRequest state(StateEnum state) {
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
            description = "Whether to approve or reject deployment to the specified environments.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ActionsReviewCustomGatesForRunRequest actionsReviewCustomGatesForRunRequest =
                (ActionsReviewCustomGatesForRunRequest) o;
        return Objects.equals(this.environmentName, actionsReviewCustomGatesForRunRequest.environmentName)
                && Objects.equals(this.comment, actionsReviewCustomGatesForRunRequest.comment)
                && Objects.equals(this.state, actionsReviewCustomGatesForRunRequest.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environmentName, comment, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ActionsReviewCustomGatesForRunRequest {\n");
        sb.append("    environmentName: ")
                .append(toIndentedString(environmentName))
                .append("\n");
        sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
