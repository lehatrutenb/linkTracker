package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Arrays;
import java.util.Objects;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * User2
 */
@JsonTypeName("User_2")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-07T21:07:31.193741288Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class User2 {

    private Optional<URI> avatarUrl = Optional.empty();

    private Optional<Boolean> deleted = Optional.empty();

    private JsonNullable<String> email = JsonNullable.<String>undefined();

    private Optional<String> eventsUrl = Optional.empty();

    private Optional<URI> followersUrl = Optional.empty();

    private Optional<String> followingUrl = Optional.empty();

    private Optional<String> gistsUrl = Optional.empty();

    private Optional<String> gravatarId = Optional.empty();

    private Optional<URI> htmlUrl = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private Optional<String> login = Optional.empty();

    private Optional<String> name = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<URI> organizationsUrl = Optional.empty();

    private Optional<URI> receivedEventsUrl = Optional.empty();

    private Optional<URI> reposUrl = Optional.empty();

    private Optional<Boolean> siteAdmin = Optional.empty();

    private Optional<String> starredUrl = Optional.empty();

    private Optional<URI> subscriptionsUrl = Optional.empty();

    /**
     * Gets or Sets type
     */
    public enum TypeEnum {
        BOT("Bot"),

        USER("User"),

        ORGANIZATION("Organization");

        private final String value;

        TypeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }

    private Optional<TypeEnum> type = Optional.empty();

    private Optional<URI> url = Optional.empty();

    private Optional<String> userViewType = Optional.empty();

    public User2 avatarUrl(URI avatarUrl) {
        this.avatarUrl = Optional.ofNullable(avatarUrl);
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @Valid
    @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("avatar_url")
    public Optional<URI> getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(Optional<URI> avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public User2 deleted(Boolean deleted) {
        this.deleted = Optional.ofNullable(deleted);
        return this;
    }

    /**
     * Get deleted
     * @return deleted
     */
    @Schema(name = "deleted", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("deleted")
    public Optional<Boolean> getDeleted() {
        return deleted;
    }

    public void setDeleted(Optional<Boolean> deleted) {
        this.deleted = deleted;
    }

    public User2 email(String email) {
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public JsonNullable<String> getEmail() {
        return email;
    }

    public void setEmail(JsonNullable<String> email) {
        this.email = email;
    }

    public User2 eventsUrl(String eventsUrl) {
        this.eventsUrl = Optional.ofNullable(eventsUrl);
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events_url")
    public Optional<String> getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(Optional<String> eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public User2 followersUrl(URI followersUrl) {
        this.followersUrl = Optional.ofNullable(followersUrl);
        return this;
    }

    /**
     * Get followersUrl
     * @return followersUrl
     */
    @Valid
    @Schema(name = "followers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("followers_url")
    public Optional<URI> getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(Optional<URI> followersUrl) {
        this.followersUrl = followersUrl;
    }

    public User2 followingUrl(String followingUrl) {
        this.followingUrl = Optional.ofNullable(followingUrl);
        return this;
    }

    /**
     * Get followingUrl
     * @return followingUrl
     */
    @Schema(name = "following_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("following_url")
    public Optional<String> getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(Optional<String> followingUrl) {
        this.followingUrl = followingUrl;
    }

    public User2 gistsUrl(String gistsUrl) {
        this.gistsUrl = Optional.ofNullable(gistsUrl);
        return this;
    }

    /**
     * Get gistsUrl
     * @return gistsUrl
     */
    @Schema(name = "gists_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gists_url")
    public Optional<String> getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(Optional<String> gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public User2 gravatarId(String gravatarId) {
        this.gravatarId = Optional.ofNullable(gravatarId);
        return this;
    }

    /**
     * Get gravatarId
     * @return gravatarId
     */
    @Schema(name = "gravatar_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gravatar_id")
    public Optional<String> getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(Optional<String> gravatarId) {
        this.gravatarId = gravatarId;
    }

    public User2 htmlUrl(URI htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<URI> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<URI> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public User2 id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public User2 login(String login) {
        this.login = Optional.ofNullable(login);
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @Schema(name = "login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("login")
    public Optional<String> getLogin() {
        return login;
    }

    public void setLogin(Optional<String> login) {
        this.login = login;
    }

    public User2 name(String name) {
        this.name = Optional.ofNullable(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public Optional<String> getName() {
        return name;
    }

    public void setName(Optional<String> name) {
        this.name = name;
    }

    public User2 nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public User2 organizationsUrl(URI organizationsUrl) {
        this.organizationsUrl = Optional.ofNullable(organizationsUrl);
        return this;
    }

    /**
     * Get organizationsUrl
     * @return organizationsUrl
     */
    @Valid
    @Schema(name = "organizations_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organizations_url")
    public Optional<URI> getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(Optional<URI> organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public User2 receivedEventsUrl(URI receivedEventsUrl) {
        this.receivedEventsUrl = Optional.ofNullable(receivedEventsUrl);
        return this;
    }

    /**
     * Get receivedEventsUrl
     * @return receivedEventsUrl
     */
    @Valid
    @Schema(name = "received_events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("received_events_url")
    public Optional<URI> getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(Optional<URI> receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public User2 reposUrl(URI reposUrl) {
        this.reposUrl = Optional.ofNullable(reposUrl);
        return this;
    }

    /**
     * Get reposUrl
     * @return reposUrl
     */
    @Valid
    @Schema(name = "repos_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repos_url")
    public Optional<URI> getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(Optional<URI> reposUrl) {
        this.reposUrl = reposUrl;
    }

    public User2 siteAdmin(Boolean siteAdmin) {
        this.siteAdmin = Optional.ofNullable(siteAdmin);
        return this;
    }

    /**
     * Get siteAdmin
     * @return siteAdmin
     */
    @Schema(name = "site_admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("site_admin")
    public Optional<Boolean> getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Optional<Boolean> siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public User2 starredUrl(String starredUrl) {
        this.starredUrl = Optional.ofNullable(starredUrl);
        return this;
    }

    /**
     * Get starredUrl
     * @return starredUrl
     */
    @Schema(name = "starred_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("starred_url")
    public Optional<String> getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(Optional<String> starredUrl) {
        this.starredUrl = starredUrl;
    }

    public User2 subscriptionsUrl(URI subscriptionsUrl) {
        this.subscriptionsUrl = Optional.ofNullable(subscriptionsUrl);
        return this;
    }

    /**
     * Get subscriptionsUrl
     * @return subscriptionsUrl
     */
    @Valid
    @Schema(name = "subscriptions_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscriptions_url")
    public Optional<URI> getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(Optional<URI> subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public User2 type(TypeEnum type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<TypeEnum> getType() {
        return type;
    }

    public void setType(Optional<TypeEnum> type) {
        this.type = type;
    }

    public User2 url(URI url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Valid
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<URI> getUrl() {
        return url;
    }

    public void setUrl(Optional<URI> url) {
        this.url = url;
    }

    public User2 userViewType(String userViewType) {
        this.userViewType = Optional.ofNullable(userViewType);
        return this;
    }

    /**
     * Get userViewType
     * @return userViewType
     */
    @Schema(name = "user_view_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user_view_type")
    public Optional<String> getUserViewType() {
        return userViewType;
    }

    public void setUserViewType(Optional<String> userViewType) {
        this.userViewType = userViewType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User2 user2 = (User2) o;
        return Objects.equals(this.avatarUrl, user2.avatarUrl)
                && Objects.equals(this.deleted, user2.deleted)
                && equalsNullable(this.email, user2.email)
                && Objects.equals(this.eventsUrl, user2.eventsUrl)
                && Objects.equals(this.followersUrl, user2.followersUrl)
                && Objects.equals(this.followingUrl, user2.followingUrl)
                && Objects.equals(this.gistsUrl, user2.gistsUrl)
                && Objects.equals(this.gravatarId, user2.gravatarId)
                && Objects.equals(this.htmlUrl, user2.htmlUrl)
                && Objects.equals(this.id, user2.id)
                && Objects.equals(this.login, user2.login)
                && Objects.equals(this.name, user2.name)
                && Objects.equals(this.nodeId, user2.nodeId)
                && Objects.equals(this.organizationsUrl, user2.organizationsUrl)
                && Objects.equals(this.receivedEventsUrl, user2.receivedEventsUrl)
                && Objects.equals(this.reposUrl, user2.reposUrl)
                && Objects.equals(this.siteAdmin, user2.siteAdmin)
                && Objects.equals(this.starredUrl, user2.starredUrl)
                && Objects.equals(this.subscriptionsUrl, user2.subscriptionsUrl)
                && Objects.equals(this.type, user2.type)
                && Objects.equals(this.url, user2.url)
                && Objects.equals(this.userViewType, user2.userViewType);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                avatarUrl,
                deleted,
                hashCodeNullable(email),
                eventsUrl,
                followersUrl,
                followingUrl,
                gistsUrl,
                gravatarId,
                htmlUrl,
                id,
                login,
                name,
                nodeId,
                organizationsUrl,
                receivedEventsUrl,
                reposUrl,
                siteAdmin,
                starredUrl,
                subscriptionsUrl,
                type,
                url,
                userViewType);
    }

    private static <T> int hashCodeNullable(JsonNullable<T> a) {
        if (a == null) {
            return 1;
        }
        return a.isPresent() ? Arrays.deepHashCode(new Object[] {a.get()}) : 31;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class User2 {\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    deleted: ").append(toIndentedString(deleted)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    followersUrl: ").append(toIndentedString(followersUrl)).append("\n");
        sb.append("    followingUrl: ").append(toIndentedString(followingUrl)).append("\n");
        sb.append("    gistsUrl: ").append(toIndentedString(gistsUrl)).append("\n");
        sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    organizationsUrl: ")
                .append(toIndentedString(organizationsUrl))
                .append("\n");
        sb.append("    receivedEventsUrl: ")
                .append(toIndentedString(receivedEventsUrl))
                .append("\n");
        sb.append("    reposUrl: ").append(toIndentedString(reposUrl)).append("\n");
        sb.append("    siteAdmin: ").append(toIndentedString(siteAdmin)).append("\n");
        sb.append("    starredUrl: ").append(toIndentedString(starredUrl)).append("\n");
        sb.append("    subscriptionsUrl: ")
                .append(toIndentedString(subscriptionsUrl))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    userViewType: ").append(toIndentedString(userViewType)).append("\n");
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
