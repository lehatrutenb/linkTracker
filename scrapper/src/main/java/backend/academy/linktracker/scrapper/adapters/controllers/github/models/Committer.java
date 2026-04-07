package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Metaproperties for Git author/committer information.
 */
@Schema(name = "Committer", description = "Metaproperties for Git author/committer information.")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Committer {

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> date = Optional.empty();

    private JsonNullable<@jakarta.validation.constraints.Email String> email = JsonNullable.<String>undefined();

    private String name;

    private Optional<String> username = Optional.empty();

    public Committer() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Committer(String email, String name) {
        this.email = JsonNullable.of(email);
        this.name = name;
    }

    public Committer date(OffsetDateTime date) {
        this.date = Optional.ofNullable(date);
        return this;
    }

    /**
     * Get date
     * @return date
     */
    @Valid
    @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("date")
    public Optional<OffsetDateTime> getDate() {
        return date;
    }

    public void setDate(Optional<OffsetDateTime> date) {
        this.date = date;
    }

    public Committer email(String email) {
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @NotNull
    @jakarta.validation.constraints.Email
    @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public JsonNullable<@jakarta.validation.constraints.Email String> getEmail() {
        return email;
    }

    public void setEmail(JsonNullable<String> email) {
        this.email = email;
    }

    public Committer name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The git author's name.
     * @return name
     */
    @NotNull
    @Schema(name = "name", description = "The git author's name.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Committer username(String username) {
        this.username = Optional.ofNullable(username);
        return this;
    }

    /**
     * Get username
     * @return username
     */
    @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("username")
    public Optional<String> getUsername() {
        return username;
    }

    public void setUsername(Optional<String> username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Committer committer = (Committer) o;
        return Objects.equals(this.date, committer.date)
                && Objects.equals(this.email, committer.email)
                && Objects.equals(this.name, committer.name)
                && Objects.equals(this.username, committer.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, email, name, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Committer {\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
