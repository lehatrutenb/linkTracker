package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Information about the person who is making the commit. By default, &#x60;committer&#x60; will use the information set in &#x60;author&#x60;. See the &#x60;author&#x60; and &#x60;committer&#x60; object below for details.
 */
@Schema(
        name = "git_create_commit_request_committer",
        description =
                "Information about the person who is making the commit. By default, `committer` will use the information set in `author`. See the `author` and `committer` object below for details.")
@JsonTypeName("git_create_commit_request_committer")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class GitCreateCommitRequestCommitter {

    private String name;

    private String email;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime date;

    public GitCreateCommitRequestCommitter name(String name) {
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

    public GitCreateCommitRequestCommitter email(String email) {
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

    public GitCreateCommitRequestCommitter date(OffsetDateTime date) {
        this.date = date;
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
    public OffsetDateTime getDate() {
        return date;
    }

    public void setDate(OffsetDateTime date) {
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
        GitCreateCommitRequestCommitter gitCreateCommitRequestCommitter = (GitCreateCommitRequestCommitter) o;
        return Objects.equals(this.name, gitCreateCommitRequestCommitter.name)
                && Objects.equals(this.email, gitCreateCommitRequestCommitter.email)
                && Objects.equals(this.date, gitCreateCommitRequestCommitter.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GitCreateCommitRequestCommitter {\n");
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
