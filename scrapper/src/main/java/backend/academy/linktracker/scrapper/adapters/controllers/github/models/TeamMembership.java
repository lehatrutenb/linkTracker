package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Objects;

/**
 * Team Membership
 */
@Schema(name = "team-membership", description = "Team Membership")
@JsonTypeName("team-membership")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class TeamMembership {

    private URI url;

    /**
     * The role of the user in the team.
     */
    public enum RoleEnum {
        MEMBER("member"),

        MAINTAINER("maintainer");

        private final String value;

        RoleEnum(String value) {
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
        public static RoleEnum fromValue(String value) {
            for (RoleEnum b : RoleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private RoleEnum role = RoleEnum.MEMBER;

    /**
     * The state of the user's membership in the team.
     */
    public enum StateEnum {
        ACTIVE("active"),

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

    public TeamMembership() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public TeamMembership(URI url, RoleEnum role, StateEnum state) {
        this.url = url;
        this.role = role;
        this.state = state;
    }

    public TeamMembership url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public TeamMembership role(RoleEnum role) {
        this.role = role;
        return this;
    }

    /**
     * The role of the user in the team.
     * @return role
     */
    @NotNull
    @Schema(
            name = "role",
            example = "member",
            description = "The role of the user in the team.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("role")
    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }

    public TeamMembership state(StateEnum state) {
        this.state = state;
        return this;
    }

    /**
     * The state of the user's membership in the team.
     * @return state
     */
    @NotNull
    @Schema(
            name = "state",
            description = "The state of the user's membership in the team.",
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
        TeamMembership teamMembership = (TeamMembership) o;
        return Objects.equals(this.url, teamMembership.url)
                && Objects.equals(this.role, teamMembership.role)
                && Objects.equals(this.state, teamMembership.state);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, role, state);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TeamMembership {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
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
