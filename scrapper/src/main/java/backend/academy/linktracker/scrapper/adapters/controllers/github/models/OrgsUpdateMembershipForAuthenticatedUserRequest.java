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
 * OrgsUpdateMembershipForAuthenticatedUserRequest
 */
@JsonTypeName("orgs_update_membership_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class OrgsUpdateMembershipForAuthenticatedUserRequest {

    /**
     * The state that the membership should be in. Only `\"active\"` will be accepted.
     */
    public enum StateEnum {
        ACTIVE("active");

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

    public OrgsUpdateMembershipForAuthenticatedUserRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public OrgsUpdateMembershipForAuthenticatedUserRequest(StateEnum state) {
        this.state = state;
    }

    public OrgsUpdateMembershipForAuthenticatedUserRequest state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state that the membership should be in. Only `\"active\"` will be accepted.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description = "The state that the membership should be in. Only `\"active\"` will be accepted.",
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
        OrgsUpdateMembershipForAuthenticatedUserRequest orgsUpdateMembershipForAuthenticatedUserRequest =
                (OrgsUpdateMembershipForAuthenticatedUserRequest) o;
        return Objects.equals(this.state, orgsUpdateMembershipForAuthenticatedUserRequest.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrgsUpdateMembershipForAuthenticatedUserRequest {\n");
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
