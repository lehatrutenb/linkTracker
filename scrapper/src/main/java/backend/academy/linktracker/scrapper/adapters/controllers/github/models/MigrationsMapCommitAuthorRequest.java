package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * MigrationsMapCommitAuthorRequest
 */
@JsonTypeName("migrations_map_commit_author_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class MigrationsMapCommitAuthorRequest {

    private Optional<String> email = Optional.empty();

    private Optional<String> name = Optional.empty();

    public MigrationsMapCommitAuthorRequest email(String email) {
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * The new Git author email.
     * @return email
     */
    @Schema(name = "email", description = "The new Git author email.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
        this.email = email;
    }

    public MigrationsMapCommitAuthorRequest name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * The new Git author name.
     * @return name
     */
    @Schema(name = "name", description = "The new Git author name.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
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
