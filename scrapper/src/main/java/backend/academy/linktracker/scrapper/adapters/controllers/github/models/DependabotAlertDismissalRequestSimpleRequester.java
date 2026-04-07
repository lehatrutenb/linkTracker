package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * The user who requested the dismissal.
 */
@Schema(
        name = "dependabot_alert_dismissal_request_simple_requester",
        description = "The user who requested the dismissal.")
@JsonTypeName("dependabot_alert_dismissal_request_simple_requester")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DependabotAlertDismissalRequestSimpleRequester {

    private Optional<Long> id = Optional.empty();

    private Optional<String> login = Optional.empty();

    public DependabotAlertDismissalRequestSimpleRequester id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * The unique identifier of the user.
     * @return id
     */
    @Schema(
            name = "id",
            description = "The unique identifier of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public DependabotAlertDismissalRequestSimpleRequester login(String login) {
        this.login = Optional.ofNullable(login);
        return this;
    }

    /**
     * The login name of the user.
     * @return login
     */
    @Schema(
            name = "login",
            description = "The login name of the user.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("login")
    public Optional<String> getLogin() {
        return login;
    }

    public void setLogin(Optional<String> login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DependabotAlertDismissalRequestSimpleRequester dependabotAlertDismissalRequestSimpleRequester =
                (DependabotAlertDismissalRequestSimpleRequester) o;
        return Objects.equals(this.id, dependabotAlertDismissalRequestSimpleRequester.id)
                && Objects.equals(this.login, dependabotAlertDismissalRequestSimpleRequester.login);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DependabotAlertDismissalRequestSimpleRequester {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
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
