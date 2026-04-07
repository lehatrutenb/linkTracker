package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UsersAddSocialAccountForAuthenticatedUserRequest
 */
@JsonTypeName("users_add_social_account_for_authenticated_user_request")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UsersAddSocialAccountForAuthenticatedUserRequest {

    @Valid
    private List<String> accountUrls = new ArrayList<>();

    public UsersAddSocialAccountForAuthenticatedUserRequest() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UsersAddSocialAccountForAuthenticatedUserRequest(List<String> accountUrls) {
        this.accountUrls = accountUrls;
    }

    public UsersAddSocialAccountForAuthenticatedUserRequest accountUrls(List<String> accountUrls) {
        this.accountUrls = accountUrls;
        return this;
    }

    public UsersAddSocialAccountForAuthenticatedUserRequest addAccountUrlsItem(String accountUrlsItem) {
        if (this.accountUrls == null) {
            this.accountUrls = new ArrayList<>();
        }
        this.accountUrls.add(accountUrlsItem);
        return this;
    }

    /**
     * Full URLs for the social media profiles to add.
     * @return accountUrls
     */
    @NotNull
    @Schema(
            name = "account_urls",
            example = "[]",
            description = "Full URLs for the social media profiles to add.",
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
        UsersAddSocialAccountForAuthenticatedUserRequest usersAddSocialAccountForAuthenticatedUserRequest =
                (UsersAddSocialAccountForAuthenticatedUserRequest) o;
        return Objects.equals(this.accountUrls, usersAddSocialAccountForAuthenticatedUserRequest.accountUrls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountUrls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsersAddSocialAccountForAuthenticatedUserRequest {\n");
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
