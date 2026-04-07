package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Identifying information for the git-user
 */
@Schema(name = "git_commit_author", description = "Identifying information for the git-user")
@JsonTypeName("git_commit_author")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCommitAuthor {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime date;

    private String email;

    private String name;

    public GitCommitAuthor() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitCommitAuthor(OffsetDateTime date, String email, String name) {
        this.date = date;
        this.email = email;
        this.name = name;
    }

    public GitCommitAuthor date(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Timestamp of the commit
     * @return date
     */
    @NotNull
    @Valid
    @Schema(
            name = "date",
            example = "2014-08-09T08:02:04+12:00",
            description = "Timestamp of the commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("date")
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
        this.date = date;
    }

    public GitCommitAuthor email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Git email address of the user
     * @return email
     */
    @NotNull
    @Schema(
            name = "email",
            example = "monalisa.octocat@example.com",
            description = "Git email address of the user",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GitCommitAuthor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name of the git user
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Monalisa Octocat",
            description = "Name of the git user",
            requiredMode = Schema.RequiredMode.REQUIRED)
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
        GitCommitAuthor gitCommitAuthor = (GitCommitAuthor) o;
        return Objects.equals(this.date, gitCommitAuthor.date)
                && Objects.equals(this.email, gitCommitAuthor.email)
                && Objects.equals(this.name, gitCommitAuthor.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, email, name);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCommitAuthor {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
