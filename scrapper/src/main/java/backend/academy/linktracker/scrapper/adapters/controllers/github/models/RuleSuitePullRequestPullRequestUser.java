package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * The user who created the pull request.
 */
@Schema(name = "rule_suite_pull_request_pull_request_user", description = "The user who created the pull request.")
@JsonTypeName("rule_suite_pull_request_pull_request_user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuitePullRequestPullRequestUser {

    private Optional<Long> id = Optional.empty();

    private Optional<String> login = Optional.empty();

    private Optional<String> type = Optional.empty();

    public RuleSuitePullRequestPullRequestUser id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The unique identifier of the user.
     * @return id
     */
    @Schema(
            name = "id",
            description = "The unique identifier of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public RuleSuitePullRequestPullRequestUser login(String login) {
        this.login = Optional.ofNullable(login);
        return this;
    }

    /**
     * The handle for the GitHub user account.
     * @return login
     */
    @Schema(
            name = "login",
            description = "The handle for the GitHub user account.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("login")
    public Optional<String> getLogin() {
        return login;
    }

    public void setLogin(Optional<String> login) {
        this.login = login;
    }

    public RuleSuitePullRequestPullRequestUser type(String type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * The type of the user.
     * @return type
     */
    @Schema(name = "type", description = "The type of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RuleSuitePullRequestPullRequestUser ruleSuitePullRequestPullRequestUser =
                (RuleSuitePullRequestPullRequestUser) o;
        return Objects.equals(this.id, ruleSuitePullRequestPullRequestUser.id)
                && Objects.equals(this.login, ruleSuitePullRequestPullRequestUser.login)
                && Objects.equals(this.type, ruleSuitePullRequestPullRequestUser.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RuleSuitePullRequestPullRequestUser {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
