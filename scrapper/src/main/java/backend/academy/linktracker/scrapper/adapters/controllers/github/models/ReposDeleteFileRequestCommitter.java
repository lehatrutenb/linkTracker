package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * object containing information about the committer.
 */
@Schema(
        name = "repos_delete_file_request_committer",
        description = "object containing information about the committer.")
@JsonTypeName("repos_delete_file_request_committer")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposDeleteFileRequestCommitter {

    private String name;

    private String email;

    public ReposDeleteFileRequestCommitter name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the author (or committer) of the commit
     * @return name
     */
    @Schema(
            name = "name",
            description = "The name of the author (or committer) of the commit",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReposDeleteFileRequestCommitter email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The email of the author (or committer) of the commit
     * @return email
     */
    @Schema(
            name = "email",
            description = "The email of the author (or committer) of the commit",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReposDeleteFileRequestCommitter reposDeleteFileRequestCommitter = (ReposDeleteFileRequestCommitter) o;
        return Objects.equals(this.name, reposDeleteFileRequestCommitter.name)
                && Objects.equals(this.email, reposDeleteFileRequestCommitter.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposDeleteFileRequestCommitter {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
