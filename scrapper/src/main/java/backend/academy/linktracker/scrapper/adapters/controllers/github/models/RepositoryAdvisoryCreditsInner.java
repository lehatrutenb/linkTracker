package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import java.util.Objects;
import java.util.Optional;

/**
 * RepositoryAdvisoryCreditsInner
 */
@JsonTypeName("repository_advisory_credits_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisoryCreditsInner {

    private Optional<String> login = Optional.empty();

    private Optional<SecurityAdvisoryCreditTypes> type = Optional.empty();

    public RepositoryAdvisoryCreditsInner login(String login) {
        this.login = Optional.ofNullable(login);
        return this;
    }

    /**
     * The username of the user credited.
     * @return login
     */
    @Schema(
            name = "login",
            description = "The username of the user credited.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("login")
    public Optional<String> getLogin() {
        return login;
    }

    public void setLogin(Optional<String> login) {
        this.login = login;
    }

    public RepositoryAdvisoryCreditsInner type(SecurityAdvisoryCreditTypes type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Valid
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<SecurityAdvisoryCreditTypes> getType() {
        return type;
    }

    public void setType(Optional<SecurityAdvisoryCreditTypes> type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RepositoryAdvisoryCreditsInner repositoryAdvisoryCreditsInner = (RepositoryAdvisoryCreditsInner) o;
        return Objects.equals(this.login, repositoryAdvisoryCreditsInner.login)
                && Objects.equals(this.type, repositoryAdvisoryCreditsInner.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryAdvisoryCreditsInner {\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
