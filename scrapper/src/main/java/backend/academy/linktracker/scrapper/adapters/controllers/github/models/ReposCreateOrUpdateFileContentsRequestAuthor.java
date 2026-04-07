package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * The author of the file. Default: The &#x60;committer&#x60; or the authenticated user if you omit &#x60;committer&#x60;.
 */
@Schema(
        name = "repos_create_or_update_file_contents_request_author",
        description =
                "The author of the file. Default: The `committer` or the authenticated user if you omit `committer`.")
@JsonTypeName("repos_create_or_update_file_contents_request_author")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateOrUpdateFileContentsRequestAuthor {

    private String name;

    private String email;

    private Optional<String> date = Optional.empty();

    public ReposCreateOrUpdateFileContentsRequestAuthor() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateOrUpdateFileContentsRequestAuthor(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public ReposCreateOrUpdateFileContentsRequestAuthor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the author or committer of the commit. You'll receive a `422` status code if `name` is omitted.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            description =
                    "The name of the author or committer of the commit. You'll receive a `422` status code if `name` is omitted.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ReposCreateOrUpdateFileContentsRequestAuthor email(String email) {
        this.email = email;
        return this;
    }

    /**
     * The email of the author or committer of the commit. You'll receive a `422` status code if `email` is omitted.
     * @return email
     */
    @NotNull
    @Schema(
            name = "email",
            description =
                    "The email of the author or committer of the commit. You'll receive a `422` status code if `email` is omitted.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ReposCreateOrUpdateFileContentsRequestAuthor date(String date) {
        this.date = Optional.ofNullable(date);
        return this;
    }

    /**
     * Get date
     * @return date
     */
    @Schema(name = "date", example = "\"2013-01-15T17:13:22+05:00\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("date")
    public Optional<String> getDate() {
        return date;
    }

    public void setDate(Optional<String> date) {
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
        ReposCreateOrUpdateFileContentsRequestAuthor reposCreateOrUpdateFileContentsRequestAuthor =
                (ReposCreateOrUpdateFileContentsRequestAuthor) o;
        return Objects.equals(this.name, reposCreateOrUpdateFileContentsRequestAuthor.name)
                && Objects.equals(this.email, reposCreateOrUpdateFileContentsRequestAuthor.email)
                && Objects.equals(this.date, reposCreateOrUpdateFileContentsRequestAuthor.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateOrUpdateFileContentsRequestAuthor {\n");
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
