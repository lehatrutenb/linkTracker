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
 * UsersAddEmailForAuthenticatedUserRequestOneOf
 */
@JsonTypeName("users_add_email_for_authenticated_user_request_oneOf")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UsersAddEmailForAuthenticatedUserRequestOneOf implements UsersAddEmailForAuthenticatedUserRequest {

    @Valid
    private List<String> emails = new ArrayList<>();

    public UsersAddEmailForAuthenticatedUserRequestOneOf() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UsersAddEmailForAuthenticatedUserRequestOneOf(List<String> emails) {
        this.emails = emails;
    }

    public UsersAddEmailForAuthenticatedUserRequestOneOf emails(List<String> emails) {
        this.emails = emails;
        return this;
    }

    public UsersAddEmailForAuthenticatedUserRequestOneOf addEmailsItem(String emailsItem) {
        if (this.emails == null) {
            this.emails = new ArrayList<>();
        }
        this.emails.add(emailsItem);
        return this;
    }

    /**
     * Adds one or more email addresses to your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that you pass an object using the `emails` key.
     * @return emails
     */
    @NotNull
    @Size(min = 1)
    @Schema(
            name = "emails",
            example = "[]",
            description =
                    "Adds one or more email addresses to your GitHub account. Must contain at least one email address. **Note:** Alternatively, you can pass a single email address or an `array` of emails addresses directly, but we recommend that you pass an object using the `emails` key.",
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
        UsersAddEmailForAuthenticatedUserRequestOneOf usersAddEmailForAuthenticatedUserRequestOneOf =
                (UsersAddEmailForAuthenticatedUserRequestOneOf) o;
        return Objects.equals(this.emails, usersAddEmailForAuthenticatedUserRequestOneOf.emails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(emails);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersAddEmailForAuthenticatedUserRequestOneOf {\n");
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
