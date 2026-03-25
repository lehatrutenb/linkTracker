package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Deletes one or more email addresses from your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an &#x60;array&#x60; of emails addresses directly, but we recommend that you pass an object using the &#x60;emails&#x60; key.
 */
@Schema(
        name = "users_delete_email_for_authenticated_user_request_oneOf",
        description =
                "Deletes one or more email addresses from your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that you pass an object using the `emails` key.")
@JsonTypeName("users_delete_email_for_authenticated_user_request_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UsersDeleteEmailForAuthenticatedUserRequestOneOf implements UsersDeleteEmailForAuthenticatedUserRequest {

    @Valid
    private List<String> emails = new ArrayList<>();

    public UsersDeleteEmailForAuthenticatedUserRequestOneOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UsersDeleteEmailForAuthenticatedUserRequestOneOf(List<String> emails) {
        this.emails = emails;
    }

    public UsersDeleteEmailForAuthenticatedUserRequestOneOf emails(List<String> emails) {
        this.emails = emails;
        return this;
    }

    public UsersDeleteEmailForAuthenticatedUserRequestOneOf addEmailsItem(String emailsItem) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    /**
     * Email addresses associated with the GitHub user account.
     * @return emails
     */
    @NotNull
    @Size(min = 1)
    @Schema(
            name = "emails",
            description = "Email addresses associated with the GitHub user account.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("emails")
    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsersDeleteEmailForAuthenticatedUserRequestOneOf usersDeleteEmailForAuthenticatedUserRequestOneOf =
                (UsersDeleteEmailForAuthenticatedUserRequestOneOf) o;
        return Objects.equals(this.emails, usersDeleteEmailForAuthenticatedUserRequestOneOf.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersDeleteEmailForAuthenticatedUserRequestOneOf {\n");
        sb.append("    emails: ").append(toIndentedString(emails)).append("\n");
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
