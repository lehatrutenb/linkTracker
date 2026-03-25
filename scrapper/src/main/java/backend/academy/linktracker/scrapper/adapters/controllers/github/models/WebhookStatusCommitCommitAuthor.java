package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookStatusCommitCommitAuthor
 */
@JsonTypeName("webhook_status_commit_commit_author")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookStatusCommitCommitAuthor {

    private String date;

    private String email;

    private String name;

    private String username;

    public WebhookStatusCommitCommitAuthor() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookStatusCommitCommitAuthor(String date, String email, String name) {
        this.date = date;
        this.email = email;
        this.name = name;
    }

    public WebhookStatusCommitCommitAuthor date(String date) {
        this.date = date;
        return this;
    }

    /**
     * Get date
     * @return date
     */
    @NotNull
    @Schema(name = "date", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public WebhookStatusCommitCommitAuthor email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @NotNull
    @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public WebhookStatusCommitCommitAuthor name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookStatusCommitCommitAuthor username(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get username
     * @return username
     */
    @Schema(name = "username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
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
        WebhookStatusCommitCommitAuthor webhookStatusCommitCommitAuthor = (WebhookStatusCommitCommitAuthor) o;
        return Objects.equals(this.date, webhookStatusCommitCommitAuthor.date)
                && Objects.equals(this.email, webhookStatusCommitCommitAuthor.email)
                && Objects.equals(this.name, webhookStatusCommitCommitAuthor.name)
                && Objects.equals(this.username, webhookStatusCommitCommitAuthor.username);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, email, name, username);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookStatusCommitCommitAuthor {\n");
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
