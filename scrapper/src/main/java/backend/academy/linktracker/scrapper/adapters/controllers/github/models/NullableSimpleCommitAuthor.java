package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * Information about the Git author
 */
@Schema(name = "nullable_simple_commit_author", description = "Information about the Git author")
@JsonTypeName("nullable_simple_commit_author")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableSimpleCommitAuthor {

    private String name;

    private String email;

    public NullableSimpleCommitAuthor() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public NullableSimpleCommitAuthor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public NullableSimpleCommitAuthor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the commit's author
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Monalisa Octocat",
            description = "Name of the commit's author",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NullableSimpleCommitAuthor email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Git email address of the commit's author
     * @return email
     */
    @NotNull
    @jakarta.validation.constraints.Email
    @Schema(
            name = "email",
            example = "monalisa.octocat@example.com",
            description = "Git email address of the commit's author",
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
        NullableSimpleCommitAuthor nullableSimpleCommitAuthor = (NullableSimpleCommitAuthor) o;
        return Objects.equals(this.name, nullableSimpleCommitAuthor.name)
                && Objects.equals(this.email, nullableSimpleCommitAuthor.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableSimpleCommitAuthor {\n");
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
