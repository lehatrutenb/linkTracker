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
 * ReviewCustomGatesStateRequired
 */
@JsonTypeName("review-custom-gates-state-required")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReviewCustomGatesStateRequired {

    private String environmentName;

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

    public ReviewCustomGatesStateRequired() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReviewCustomGatesStateRequired(String environmentName, StateEnum state) {
        this.environmentName = environmentName;
        this.state = state;
    }

    public ReviewCustomGatesStateRequired environmentName(String environmentName) {
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

    public ReviewCustomGatesStateRequired state(StateEnum state) {
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

    public ReviewCustomGatesStateRequired comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * Optional comment to include with the review.
     * @return comment
     */
    @Schema(
            name = "comment",
            description = "Optional comment to include with the review.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        ReviewCustomGatesStateRequired reviewCustomGatesStateRequired = (ReviewCustomGatesStateRequired) o;
        return Objects.equals(this.environmentName, reviewCustomGatesStateRequired.environmentName)
                && Objects.equals(this.state, reviewCustomGatesStateRequired.state)
                && Objects.equals(this.comment, reviewCustomGatesStateRequired.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environmentName, state, comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReviewCustomGatesStateRequired {\n");
        sb.append("    environmentName: ")
                .append(toIndentedString(environmentName))
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
