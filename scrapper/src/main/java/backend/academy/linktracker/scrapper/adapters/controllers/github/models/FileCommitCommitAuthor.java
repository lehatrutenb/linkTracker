package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * FileCommitCommitAuthor
 */
@JsonTypeName("file_commit_commit_author")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FileCommitCommitAuthor {

    private Optional<String> date = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> email = Optional.empty();

    public FileCommitCommitAuthor date(String date) {
        this.date = Optional.ofNullable(date);
        return this;
    }

    /**
     * Get date
     * @return date
     */
    @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("date")
    public Optional<String> getDate() {
        return date;
    }

    public void setDate(Optional<String> date) {
        this.date = date;
    }

    public FileCommitCommitAuthor name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public FileCommitCommitAuthor email(String email) {
        this.email = Optional.ofNullable(email);
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public Optional<String> getEmail() {
        return email;
    }

    public void setEmail(Optional<String> email) {
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
        FileCommitCommitAuthor fileCommitCommitAuthor = (FileCommitCommitAuthor) o;
        return Objects.equals(this.date, fileCommitCommitAuthor.date)
                && Objects.equals(this.name, fileCommitCommitAuthor.name)
                && Objects.equals(this.email, fileCommitCommitAuthor.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, name, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FileCommitCommitAuthor {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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
