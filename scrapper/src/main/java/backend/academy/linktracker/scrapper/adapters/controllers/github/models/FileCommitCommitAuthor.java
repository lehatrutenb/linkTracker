package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * FileCommitCommitAuthor
 */
@JsonTypeName("file_commit_commit_author")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class FileCommitCommitAuthor {

    private String date;

    private String name;

    private String email;

    public FileCommitCommitAuthor date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public FileCommitCommitAuthor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileCommitCommitAuthor email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
