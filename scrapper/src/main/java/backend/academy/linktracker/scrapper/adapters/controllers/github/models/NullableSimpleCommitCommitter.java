package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * Information about the Git committer
 */
@Schema(name = "nullable_simple_commit_committer", description = "Information about the Git committer")
@JsonTypeName("nullable_simple_commit_committer")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableSimpleCommitCommitter {

    private String name;

    private String email;

    public NullableSimpleCommitCommitter() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableSimpleCommitCommitter(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public NullableSimpleCommitCommitter name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the commit's committer
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Monalisa Octocat",
            description = "Name of the commit's committer",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NullableSimpleCommitCommitter email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Git email address of the commit's committer
     * @return email
     */
    @NotNull
    @jakarta.validation.constraints.Email
    @Schema(
            name = "email",
            example = "monalisa.octocat@example.com",
            description = "Git email address of the commit's committer",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        NullableSimpleCommitCommitter nullableSimpleCommitCommitter = (NullableSimpleCommitCommitter) o;
        return Objects.equals(this.name, nullableSimpleCommitCommitter.name)
                && Objects.equals(this.email, nullableSimpleCommitCommitter.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableSimpleCommitCommitter {\n");
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
