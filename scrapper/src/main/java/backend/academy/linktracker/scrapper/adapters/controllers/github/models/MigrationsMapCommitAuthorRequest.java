package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * MigrationsMapCommitAuthorRequest
 */
@JsonTypeName("migrations_map_commit_author_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MigrationsMapCommitAuthorRequest {

    private String email;

    private String name;

    public MigrationsMapCommitAuthorRequest email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The new Git author email.
     * @return email
     */
    @Schema(name = "email", description = "The new Git author email.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public MigrationsMapCommitAuthorRequest name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The new Git author name.
     * @return name
     */
    @Schema(name = "name", description = "The new Git author name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MigrationsMapCommitAuthorRequest migrationsMapCommitAuthorRequest = (MigrationsMapCommitAuthorRequest) o;
        return Objects.equals(this.email, migrationsMapCommitAuthorRequest.email)
                && Objects.equals(this.name, migrationsMapCommitAuthorRequest.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MigrationsMapCommitAuthorRequest {\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
