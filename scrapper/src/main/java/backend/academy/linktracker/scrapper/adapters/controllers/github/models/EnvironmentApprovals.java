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
 * An entry in the reviews log for environment deployments
 */
@Schema(name = "environment-approvals", description = "An entry in the reviews log for environment deployments")
@JsonTypeName("environment-approvals")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class EnvironmentApprovals {

    @Valid
    private List<@Valid EnvironmentApprovalsEnvironmentsInner> environments = new ArrayList<>();

    /**
     * Whether deployment to the environment(s) was approved or rejected or pending (with comments)
     */
    public enum StateEnum {
        APPROVED("approved"),

        REJECTED("rejected"),

        PENDING("pending");

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

    private SimpleUser user;

    private String comment;

    public EnvironmentApprovals() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public EnvironmentApprovals(
            List<@Valid EnvironmentApprovalsEnvironmentsInner> environments,
            StateEnum state,
            SimpleUser user,
            String comment) {
        this.environments = environments;
        this.state = state;
        this.user = user;
        this.comment = comment;
    }

    public EnvironmentApprovals environments(List<@Valid EnvironmentApprovalsEnvironmentsInner> environments) {
        this.environments = environments;
        return this;
    }

    public EnvironmentApprovals addEnvironmentsItem(EnvironmentApprovalsEnvironmentsInner environmentsItem) {
        if (this.environments == null) {
            this.environments = new ArrayList<>();
        }
        this.environments.add(environmentsItem);
        return this;
    }

    /**
     * The list of environments that were approved or rejected
     * @return environments
     */
    @NotNull
    @Valid
    @Schema(
            name = "environments",
            description = "The list of environments that were approved or rejected",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("environments")
    public List<@Valid EnvironmentApprovalsEnvironmentsInner> getEnvironments() {
        return environments;
    }

    public void setEnvironments(List<@Valid EnvironmentApprovalsEnvironmentsInner> environments) {
        this.environments = environments;
    }

    public EnvironmentApprovals state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * Whether deployment to the environment(s) was approved or rejected or pending (with comments)
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            example = "approved",
            description =
                    "Whether deployment to the environment(s) was approved or rejected or pending (with comments)",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("state")
    public StateEnum getState() {
        return state;
    }

    public void setState(StateEnum state) {
        this.state = state;
    }

    public EnvironmentApprovals user(SimpleUser user) {
        this.user = user;
        return this;
    }

    /**
     * Get user
     * @return user
     */
    @NotNull
    @Valid
    @Schema(name = "user", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("user")
    public SimpleUser getUser() {
        return user;
    }

    public void setUser(SimpleUser user) {
        this.user = user;
    }

    public EnvironmentApprovals comment(String comment) {
        this.comment = comment;
        return this;
    }

    /**
     * The comment submitted with the deployment review
     * @return comment
     */
    @NotNull
    @Schema(
            name = "comment",
            example = "Ship it!",
            description = "The comment submitted with the deployment review",
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
        EnvironmentApprovals environmentApprovals = (EnvironmentApprovals) o;
        return Objects.equals(this.environments, environmentApprovals.environments)
                && Objects.equals(this.state, environmentApprovals.state)
                && Objects.equals(this.user, environmentApprovals.user)
                && Objects.equals(this.comment, environmentApprovals.comment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(environments, state, user, comment);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EnvironmentApprovals {\n");
        sb.append("    environments: ").append(toIndentedString(environments)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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
