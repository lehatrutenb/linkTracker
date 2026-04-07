package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * A credit given to a user for a repository security advisory.
 */
@Schema(
        name = "repository-advisory-credit",
        description = "A credit given to a user for a repository security advisory.")
@JsonTypeName("repository-advisory-credit")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisoryCredit {

    private SimpleUser user;

    private SecurityAdvisoryCreditTypes type;

    /**
     * The state of the user's acceptance of the credit.
     */
    public enum StateEnum {
        ACCEPTED("accepted"),

        DECLINED("declined"),

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

    public RepositoryAdvisoryCredit() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryAdvisoryCredit(SimpleUser user, SecurityAdvisoryCreditTypes type, StateEnum state) {
        this.user = user;
        this.type = type;
        this.state = state;
    }

    public RepositoryAdvisoryCredit user(SimpleUser user) {
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

    public RepositoryAdvisoryCredit type(SecurityAdvisoryCreditTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Valid
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public SecurityAdvisoryCreditTypes getType() {
        return type;
    }

    public void setType(SecurityAdvisoryCreditTypes type) {
        this.type = type;
    }

    public RepositoryAdvisoryCredit state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the user's acceptance of the credit.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description = "The state of the user's acceptance of the credit.",
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
        RepositoryAdvisoryCredit repositoryAdvisoryCredit = (RepositoryAdvisoryCredit) o;
        return Objects.equals(this.user, repositoryAdvisoryCredit.user)
                && Objects.equals(this.type, repositoryAdvisoryCredit.type)
                && Objects.equals(this.state, repositoryAdvisoryCredit.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, type, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryAdvisoryCredit {\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
