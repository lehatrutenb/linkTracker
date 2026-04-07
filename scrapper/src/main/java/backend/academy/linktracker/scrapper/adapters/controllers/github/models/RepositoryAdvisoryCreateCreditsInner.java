package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;

/**
 * RepositoryAdvisoryCreateCreditsInner
 */
@JsonTypeName("repository_advisory_create_credits_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisoryCreateCreditsInner {

    private String login;

    private SecurityAdvisoryCreditTypes type;

    public RepositoryAdvisoryCreateCreditsInner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public RepositoryAdvisoryCreateCreditsInner(String login, SecurityAdvisoryCreditTypes type) {
        this.login = login;
        this.type = type;
    }

    public RepositoryAdvisoryCreateCreditsInner login(String login) {
        this.login = login;
        return this;
    }

    /**
     * The username of the user credited.
     * @return login
     */
    @NotNull
    @Schema(
            name = "login",
            description = "The username of the user credited.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public RepositoryAdvisoryCreateCreditsInner type(SecurityAdvisoryCreditTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Valid
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public SecurityAdvisoryCreditTypes getType() {
        return type;
    }

    public void setType(SecurityAdvisoryCreditTypes type) {
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
        RepositoryAdvisoryCreateCreditsInner repositoryAdvisoryCreateCreditsInner =
                (RepositoryAdvisoryCreateCreditsInner) o;
        return Objects.equals(this.login, repositoryAdvisoryCreateCreditsInner.login)
                && Objects.equals(this.type, repositoryAdvisoryCreateCreditsInner.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(login, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RepositoryAdvisoryCreateCreditsInner {\n");
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
