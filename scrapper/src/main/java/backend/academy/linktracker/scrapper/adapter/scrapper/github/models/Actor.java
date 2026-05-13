package backend.academy.linktracker.scrapper.adapter.scrapper.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * Actor
 */
@Schema(name = "Actor", description = "Actor")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class Actor {

    private Long id;

    private String login;

    private Optional<String> displayLogin = Optional.empty();

    private JsonNullable<String> gravatarId = JsonNullable.<String>undefined();

    private URI url;

    private URI avatarUrl;

    public Actor() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public Actor(Long id, String login, String gravatarId, URI url, URI avatarUrl) {
        this.id = id;
        this.login = login;
        this.gravatarId = JsonNullable.of(gravatarId);
        this.url = url;
        this.avatarUrl = avatarUrl;
    }

    public Actor id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Actor login(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @NotNull
    @Schema(name = "login", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Actor displayLogin(String displayLogin) {
        this.displayLogin = Optional.ofNullable(displayLogin);
        return this;
    }

    /**
     * Get displayLogin
     * @return displayLogin
     */
    @Schema(name = "display_login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("display_login")
    public Optional<String> getDisplayLogin() {
        return displayLogin;
    }

    public void setDisplayLogin(Optional<String> displayLogin) {
        this.displayLogin = displayLogin;
    }

    public Actor gravatarId(String gravatarId) {
        this.gravatarId = JsonNullable.of(gravatarId);
        return this;
    }

    /**
     * Get gravatarId
     * @return gravatarId
     */
    @NotNull
    @Schema(name = "gravatar_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("gravatar_id")
    public JsonNullable<String> getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(JsonNullable<String> gravatarId) {
        this.gravatarId = gravatarId;
    }

    public Actor url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public Actor avatarUrl(URI avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @NotNull
    @Valid
    @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("avatar_url")
    public URI getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(URI avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Actor actor = (Actor) o;
        return Objects.equals(this.id, actor.id)
                && Objects.equals(this.login, actor.login)
                && Objects.equals(this.displayLogin, actor.displayLogin)
                && Objects.equals(this.gravatarId, actor.gravatarId)
                && Objects.equals(this.url, actor.url)
                && Objects.equals(this.avatarUrl, actor.avatarUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, login, displayLogin, gravatarId, url, avatarUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Actor {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    displayLogin: ").append(toIndentedString(displayLogin)).append("\n");
        sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
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
