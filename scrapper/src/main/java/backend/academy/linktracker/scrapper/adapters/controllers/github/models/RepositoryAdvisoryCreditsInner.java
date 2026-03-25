package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * RepositoryAdvisoryCreditsInner
 */
@JsonTypeName("repository_advisory_credits_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class RepositoryAdvisoryCreditsInner {

    private String login;

    private SecurityAdvisoryCreditTypes type;

    public RepositoryAdvisoryCreditsInner login(String login) {
        this.login = login;
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
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public RepositoryAdvisoryCreditsInner type(SecurityAdvisoryCreditTypes type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Valid
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
