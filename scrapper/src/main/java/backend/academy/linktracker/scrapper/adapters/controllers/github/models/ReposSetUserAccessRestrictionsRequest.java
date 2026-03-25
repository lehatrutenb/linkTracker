package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ReposSetUserAccessRestrictionsRequest
 */
@JsonTypeName("repos_set_user_access_restrictions_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposSetUserAccessRestrictionsRequest {

    @Valid
    private List<String> users = new ArrayList<>();

    public ReposSetUserAccessRestrictionsRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposSetUserAccessRestrictionsRequest(List<String> users) {
        this.users = users;
    }

    public ReposSetUserAccessRestrictionsRequest users(List<String> users) {
        this.users = users;
        return this;
    }

    public ReposSetUserAccessRestrictionsRequest addUsersItem(String usersItem) {
        if (this.users == null) {
            this.users = new ArrayList<>();
        }
        this.users.add(usersItem);
        return this;
    }

    /**
     * The username for users
     * @return users
     */
    @NotNull
    @Schema(name = "users", description = "The username for users", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("users")
    public List<String> getUsers() {
        return users;
    }

    public void setUsers(List<String> users) {
        this.users = users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposSetUserAccessRestrictionsRequest reposSetUserAccessRestrictionsRequest =
                (ReposSetUserAccessRestrictionsRequest) o;
        return Objects.equals(this.users, reposSetUserAccessRestrictionsRequest.users);
    }

    @Override
    public int hashCode() {
        return Objects.hash(users);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposSetUserAccessRestrictionsRequest {\n");
        sb.append("    users: ").append(toIndentedString(users)).append("\n");
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
