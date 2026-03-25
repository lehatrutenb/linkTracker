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
 * UsersDeleteSocialAccountForAuthenticatedUserRequest
 */
@JsonTypeName("users_delete_social_account_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UsersDeleteSocialAccountForAuthenticatedUserRequest {

    @Valid
    private List<String> accountUrls = new ArrayList<>();

    public UsersDeleteSocialAccountForAuthenticatedUserRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UsersDeleteSocialAccountForAuthenticatedUserRequest(List<String> accountUrls) {
        this.accountUrls = accountUrls;
    }

    public UsersDeleteSocialAccountForAuthenticatedUserRequest accountUrls(List<String> accountUrls) {
        this.accountUrls = accountUrls;
        return this;
    }

    public UsersDeleteSocialAccountForAuthenticatedUserRequest addAccountUrlsItem(String accountUrlsItem) {
        if (this.accountUrls == null) {
            this.accountUrls = new ArrayList<>();
        }
        this.accountUrls.add(accountUrlsItem);
        return this;
    }

    /**
     * Full URLs for the social media profiles to delete.
     * @return accountUrls
     */
    @NotNull
    @Schema(
            name = "account_urls",
            example = "[]",
            description = "Full URLs for the social media profiles to delete.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("account_urls")
    public List<String> getAccountUrls() {
        return accountUrls;
    }

    public void setAccountUrls(List<String> accountUrls) {
        this.accountUrls = accountUrls;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UsersDeleteSocialAccountForAuthenticatedUserRequest usersDeleteSocialAccountForAuthenticatedUserRequest =
                (UsersDeleteSocialAccountForAuthenticatedUserRequest) o;
        return Objects.equals(this.accountUrls, usersDeleteSocialAccountForAuthenticatedUserRequest.accountUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersDeleteSocialAccountForAuthenticatedUserRequest {\n");
        sb.append("    accountUrls: ").append(toIndentedString(accountUrls)).append("\n");
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
