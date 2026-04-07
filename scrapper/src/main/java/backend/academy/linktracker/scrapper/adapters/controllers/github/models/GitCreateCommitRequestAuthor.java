package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Information about the author of the commit. By default, the &#x60;author&#x60; will be the authenticated user and the current date. See the &#x60;author&#x60; and &#x60;committer&#x60; object below for details.
 */
@Schema(
        name = "git_create_commit_request_author",
        description =
                "Information about the author of the commit. By default, the `author` will be the authenticated user and the current date. See the `author` and `committer` object below for details.")
@JsonTypeName("git_create_commit_request_author")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCreateCommitRequestAuthor {

    private String name;

    private String email;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> date = Optional.empty();

    public GitCreateCommitRequestAuthor() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public GitCreateCommitRequestAuthor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public GitCreateCommitRequestAuthor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the author (or committer) of the commit
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description = "The name of the author (or committer) of the commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GitCreateCommitRequestAuthor email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The email of the author (or committer) of the commit
     * @return email
     */
    @NotNull
    @Schema(
            name = "email",
            description = "The email of the author (or committer) of the commit",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GitCreateCommitRequestAuthor date(OffsetDateTime date) {
        this.date = Optional.ofNullable(date);
        return this;
    }

    /**
     * Indicates when this commit was authored (or committed). This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
     * @return date
     */
    @Valid
    @Schema(
            name = "date",
            description =
                    "Indicates when this commit was authored (or committed). This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("date")
    public Optional<OffsetDateTime> getDate() {
        return date;
    }

    public void setDate(Optional<OffsetDateTime> date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        GitCreateCommitRequestAuthor gitCreateCommitRequestAuthor = (GitCreateCommitRequestAuthor) o;
        return Objects.equals(this.name, gitCreateCommitRequestAuthor.name)
                && Objects.equals(this.email, gitCreateCommitRequestAuthor.email)
                && Objects.equals(this.date, gitCreateCommitRequestAuthor.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCreateCommitRequestAuthor {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
