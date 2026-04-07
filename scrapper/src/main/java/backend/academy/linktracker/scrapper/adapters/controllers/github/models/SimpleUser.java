package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * A GitHub user.
 */
@Schema(name = "simple-user", description = "A GitHub user.")
@JsonTypeName("simple-user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class SimpleUser implements CommitAuthor, IntegrationOwner {

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private JsonNullable<String> email = JsonNullable.<String>undefined();

    private String login;

    private Long id;

    private String nodeId;

    private URI avatarUrl;

    private JsonNullable<String> gravatarId = JsonNullable.<String>undefined();

    private URI url;

    private URI htmlUrl;

    private URI followersUrl;

    private String followingUrl;

    private String gistsUrl;

    private String starredUrl;

    private URI subscriptionsUrl;

    private URI organizationsUrl;

    private URI reposUrl;

    private String eventsUrl;

    private URI receivedEventsUrl;

    private String type;

    private Boolean siteAdmin;

    private Optional<String> starredAt = Optional.empty();

    private Optional<String> userViewType = Optional.empty();

    public SimpleUser() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public SimpleUser(
            String login,
            Long id,
            String nodeId,
            URI avatarUrl,
            String gravatarId,
            URI url,
            URI htmlUrl,
            URI followersUrl,
            String followingUrl,
            String gistsUrl,
            String starredUrl,
            URI subscriptionsUrl,
            URI organizationsUrl,
            URI reposUrl,
            String eventsUrl,
            URI receivedEventsUrl,
            String type,
            Boolean siteAdmin) {
        this.login = login;
        this.id = id;
        this.nodeId = nodeId;
        this.avatarUrl = avatarUrl;
        this.gravatarId = JsonNullable.of(gravatarId);
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.starredUrl = starredUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.organizationsUrl = organizationsUrl;
        this.reposUrl = reposUrl;
        this.eventsUrl = eventsUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.type = type;
        this.siteAdmin = siteAdmin;
    }

    public SimpleUser name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public SimpleUser email(String email) {
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

    public SimpleUser login(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @NotNull
    @Schema(name = "login", example = "octocat", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public SimpleUser id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @NotNull
    @Schema(name = "id", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SimpleUser nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDQ6VXNlcjE=", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public SimpleUser avatarUrl(URI avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "avatar_url",
            example = "https://github.com/images/error/octocat_happy.gif",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("avatar_url")
    public URI getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(URI avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public SimpleUser gravatarId(String gravatarId) {
        this.gravatarId = JsonNullable.of(gravatarId);
        return this;
    }

    /**
     * Get gravatarId
     * @return gravatarId
     */
    @NotNull
    @Schema(
            name = "gravatar_id",
            example = "41d064eb2195891e12d0413f63227ea7",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("gravatar_id")
    public JsonNullable<String> getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(JsonNullable<String> gravatarId) {
        this.gravatarId = gravatarId;
    }

    public SimpleUser url(URI url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Valid
    @Schema(name = "url", example = "https://api.github.com/users/octocat", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    public SimpleUser htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", example = "https://github.com/octocat", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public SimpleUser followersUrl(URI followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    /**
     * Get followersUrl
     * @return followersUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "followers_url",
            example = "https://api.github.com/users/octocat/followers",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("followers_url")
    public URI getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(URI followersUrl) {
        this.followersUrl = followersUrl;
    }

    public SimpleUser followingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    /**
     * Get followingUrl
     * @return followingUrl
     */
    @NotNull
    @Schema(
            name = "following_url",
            example = "https://api.github.com/users/octocat/following{/other_user}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public SimpleUser gistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    /**
     * Get gistsUrl
     * @return gistsUrl
     */
    @NotNull
    @Schema(
            name = "gists_url",
            example = "https://api.github.com/users/octocat/gists{/gist_id}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public SimpleUser starredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    /**
     * Get starredUrl
     * @return starredUrl
     */
    @NotNull
    @Schema(
            name = "starred_url",
            example = "https://api.github.com/users/octocat/starred{/owner}{/repo}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public SimpleUser subscriptionsUrl(URI subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    /**
     * Get subscriptionsUrl
     * @return subscriptionsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "subscriptions_url",
            example = "https://api.github.com/users/octocat/subscriptions",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscriptions_url")
    public URI getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(URI subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public SimpleUser organizationsUrl(URI organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    /**
     * Get organizationsUrl
     * @return organizationsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "organizations_url",
            example = "https://api.github.com/users/octocat/orgs",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organizations_url")
    public URI getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(URI organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public SimpleUser reposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    /**
     * Get reposUrl
     * @return reposUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "repos_url",
            example = "https://api.github.com/users/octocat/repos",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repos_url")
    public URI getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
    }

    public SimpleUser eventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @NotNull
    @Schema(
            name = "events_url",
            example = "https://api.github.com/users/octocat/events{/privacy}",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public SimpleUser receivedEventsUrl(URI receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    /**
     * Get receivedEventsUrl
     * @return receivedEventsUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "received_events_url",
            example = "https://api.github.com/users/octocat/received_events",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("received_events_url")
    public URI getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(URI receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public SimpleUser type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", example = "User", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SimpleUser siteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
        return this;
    }

    /**
     * Get siteAdmin
     * @return siteAdmin
     */
    @NotNull
    @Schema(name = "site_admin", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("site_admin")
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public SimpleUser starredAt(String starredAt) {
        this.starredAt = Optional.ofNullable(starredAt);
        return this;
    }

    /**
     * Get starredAt
     * @return starredAt
     */
    @Schema(name = "starred_at", example = "\"2020-07-09T00:17:55Z\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("starred_at")
    public Optional<String> getStarredAt() {
        return starredAt;
    }

    public void setStarredAt(Optional<String> starredAt) {
        this.starredAt = starredAt;
    }

    public SimpleUser userViewType(String userViewType) {
        this.userViewType = Optional.ofNullable(userViewType);
        return this;
    }

    /**
     * Get userViewType
     * @return userViewType
     */
    @Schema(name = "user_view_type", example = "public", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        SimpleUser simpleUser = (SimpleUser) o;
        return equalsNullable(this.name, simpleUser.name)
                && equalsNullable(this.email, simpleUser.email)
                && Objects.equals(this.login, simpleUser.login)
                && Objects.equals(this.id, simpleUser.id)
                && Objects.equals(this.nodeId, simpleUser.nodeId)
                && Objects.equals(this.avatarUrl, simpleUser.avatarUrl)
                && Objects.equals(this.gravatarId, simpleUser.gravatarId)
                && Objects.equals(this.url, simpleUser.url)
                && Objects.equals(this.htmlUrl, simpleUser.htmlUrl)
                && Objects.equals(this.followersUrl, simpleUser.followersUrl)
                && Objects.equals(this.followingUrl, simpleUser.followingUrl)
                && Objects.equals(this.gistsUrl, simpleUser.gistsUrl)
                && Objects.equals(this.starredUrl, simpleUser.starredUrl)
                && Objects.equals(this.subscriptionsUrl, simpleUser.subscriptionsUrl)
                && Objects.equals(this.organizationsUrl, simpleUser.organizationsUrl)
                && Objects.equals(this.reposUrl, simpleUser.reposUrl)
                && Objects.equals(this.eventsUrl, simpleUser.eventsUrl)
                && Objects.equals(this.receivedEventsUrl, simpleUser.receivedEventsUrl)
                && Objects.equals(this.type, simpleUser.type)
                && Objects.equals(this.siteAdmin, simpleUser.siteAdmin)
                && Objects.equals(this.starredAt, simpleUser.starredAt)
                && Objects.equals(this.userViewType, simpleUser.userViewType);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(name),
                hashCodeNullable(email),
                login,
                id,
                nodeId,
                avatarUrl,
                gravatarId,
                url,
                htmlUrl,
                followersUrl,
                followingUrl,
                gistsUrl,
                starredUrl,
                subscriptionsUrl,
                organizationsUrl,
                reposUrl,
                eventsUrl,
                receivedEventsUrl,
                type,
                siteAdmin,
                starredAt,
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
        sb.append("class SimpleUser {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    followersUrl: ").append(toIndentedString(followersUrl)).append("\n");
        sb.append("    followingUrl: ").append(toIndentedString(followingUrl)).append("\n");
        sb.append("    gistsUrl: ").append(toIndentedString(gistsUrl)).append("\n");
        sb.append("    starredUrl: ").append(toIndentedString(starredUrl)).append("\n");
        sb.append("    subscriptionsUrl: ")
                .append(toIndentedString(subscriptionsUrl))
                .append("\n");
        sb.append("    organizationsUrl: ")
                .append(toIndentedString(organizationsUrl))
                .append("\n");
        sb.append("    reposUrl: ").append(toIndentedString(reposUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    receivedEventsUrl: ")
                .append(toIndentedString(receivedEventsUrl))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    siteAdmin: ").append(toIndentedString(siteAdmin)).append("\n");
        sb.append("    starredAt: ").append(toIndentedString(starredAt)).append("\n");
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
