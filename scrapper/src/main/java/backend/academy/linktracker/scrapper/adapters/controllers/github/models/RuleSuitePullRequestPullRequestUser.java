package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * The user who created the pull request.
 */
@Schema(name = "rule_suite_pull_request_pull_request_user", description = "The user who created the pull request.")
@JsonTypeName("rule_suite_pull_request_pull_request_user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RuleSuitePullRequestPullRequestUser {

    private Long id;

    private String login;

    private String type;

    public RuleSuitePullRequestPullRequestUser id(Long id) {
        this.id = id;
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
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public RuleSuitePullRequestPullRequestUser login(String login) {
        this.login = login;
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
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public RuleSuitePullRequestPullRequestUser type(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the user.
     * @return type
     */
    @Schema(name = "type", description = "The type of the user.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
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
