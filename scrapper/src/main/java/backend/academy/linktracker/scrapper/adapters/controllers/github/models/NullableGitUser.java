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
 * Metaproperties for Git author/committer information.
 */
@Schema(name = "nullable-git-user", description = "Metaproperties for Git author/committer information.")
@JsonTypeName("nullable-git-user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class NullableGitUser {

    private String name;

    private String email;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime date;

    public NullableGitUser name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", example = "\"Chris Wanstrath\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public NullableGitUser email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @Schema(name = "email", example = "\"chris@ozmm.org\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public NullableGitUser date(OffsetDateTime date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    @Valid
    @Schema(name = "date", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        NullableGitUser nullableGitUser = (NullableGitUser) o;
        return Objects.equals(this.name, nullableGitUser.name)
                && Objects.equals(this.email, nullableGitUser.email)
                && Objects.equals(this.date, nullableGitUser.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, email, date);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NullableGitUser {\n");
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
