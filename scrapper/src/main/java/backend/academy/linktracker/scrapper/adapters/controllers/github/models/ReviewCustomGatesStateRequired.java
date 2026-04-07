package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * ReviewCustomGatesStateRequired
 */
@JsonTypeName("review-custom-gates-state-required")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
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

    private Optional<String> comment = Optional.empty();

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
        this.comment = Optional.ofNullable(comment);
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
    public Optional<String> getComment() {
        return comment;
    }

    public void setComment(Optional<String> comment) {
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
