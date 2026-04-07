package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * The person that committed the file. Default: the authenticated user.
 */
@Schema(
        name = "repos_create_or_update_file_contents_request_committer",
        description = "The person that committed the file. Default: the authenticated user.")
@JsonTypeName("repos_create_or_update_file_contents_request_committer")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class ReposCreateOrUpdateFileContentsRequestCommitter {

    private String name;

    private String email;

    private Optional<String> date = Optional.empty();

    public ReposCreateOrUpdateFileContentsRequestCommitter() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public ReposCreateOrUpdateFileContentsRequestCommitter(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public ReposCreateOrUpdateFileContentsRequestCommitter name(String name) {
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

    public ReposCreateOrUpdateFileContentsRequestCommitter email(String email) {
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

    public ReposCreateOrUpdateFileContentsRequestCommitter date(String date) {
        this.date = Optional.ofNullable(date);
        return this;
    }

    /**
     * Get date
     * @return date
     */
    @Schema(name = "date", example = "\"2013-01-05T13:13:22+05:00\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        ReposCreateOrUpdateFileContentsRequestCommitter reposCreateOrUpdateFileContentsRequestCommitter =
                (ReposCreateOrUpdateFileContentsRequestCommitter) o;
        return Objects.equals(this.name, reposCreateOrUpdateFileContentsRequestCommitter.name)
                && Objects.equals(this.email, reposCreateOrUpdateFileContentsRequestCommitter.email)
                && Objects.equals(this.date, reposCreateOrUpdateFileContentsRequestCommitter.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReposCreateOrUpdateFileContentsRequestCommitter {\n");
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
