package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * IntegrationInstallationRequestAccount
 */
@JsonTypeName("integration_installation_request_account")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class IntegrationInstallationRequestAccount {

    private String name;

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

    private JsonNullable<String> description = JsonNullable.<String>undefined();

    private JsonNullable<URI> websiteUrl = JsonNullable.<URI>undefined();

    private String slug;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> createdAt = JsonNullable.<OffsetDateTime>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> updatedAt = JsonNullable.<OffsetDateTime>undefined();

    public IntegrationInstallationRequestAccount() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public IntegrationInstallationRequestAccount(
            String name,
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
            Boolean siteAdmin,
            String slug,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt) {
        this.name = name;
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
        this.slug = slug;
        this.createdAt = JsonNullable.of(createdAt);
        this.updatedAt = JsonNullable.of(updatedAt);
    }

    public IntegrationInstallationRequestAccount name(String name) {
        this.name = name;
        return this;
    }

    /**
     * The name of the enterprise.
     * @return name
     */
    @NotNull
    @Schema(
            name = "name",
            example = "Octo Business",
            description = "The name of the enterprise.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IntegrationInstallationRequestAccount email(String email) {
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

    public IntegrationInstallationRequestAccount login(String login) {
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

    public IntegrationInstallationRequestAccount id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Unique identifier of the enterprise
     * @return id
     */
    @NotNull
    @Schema(
            name = "id",
            example = "42",
            description = "Unique identifier of the enterprise",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public IntegrationInstallationRequestAccount nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", example = "MDEwOlJlcG9zaXRvcnkxMjk2MjY5", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public IntegrationInstallationRequestAccount avatarUrl(URI avatarUrl) {
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

    public IntegrationInstallationRequestAccount gravatarId(String gravatarId) {
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

    public IntegrationInstallationRequestAccount url(URI url) {
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

    public IntegrationInstallationRequestAccount htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(
            name = "html_url",
            example = "https://github.com/enterprises/octo-business",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public IntegrationInstallationRequestAccount followersUrl(URI followersUrl) {
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

    public IntegrationInstallationRequestAccount followingUrl(String followingUrl) {
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

    public IntegrationInstallationRequestAccount gistsUrl(String gistsUrl) {
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

    public IntegrationInstallationRequestAccount starredUrl(String starredUrl) {
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

    public IntegrationInstallationRequestAccount subscriptionsUrl(URI subscriptionsUrl) {
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

    public IntegrationInstallationRequestAccount organizationsUrl(URI organizationsUrl) {
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

    public IntegrationInstallationRequestAccount reposUrl(URI reposUrl) {
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

    public IntegrationInstallationRequestAccount eventsUrl(String eventsUrl) {
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

    public IntegrationInstallationRequestAccount receivedEventsUrl(URI receivedEventsUrl) {
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

    public IntegrationInstallationRequestAccount type(String type) {
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

    public IntegrationInstallationRequestAccount siteAdmin(Boolean siteAdmin) {
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

    public IntegrationInstallationRequestAccount starredAt(String starredAt) {
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

    public IntegrationInstallationRequestAccount userViewType(String userViewType) {
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

    public IntegrationInstallationRequestAccount description(String description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * A short description of the enterprise.
     * @return description
     */
    @Schema(
            name = "description",
            description = "A short description of the enterprise.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<String> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<String> description) {
        this.description = description;
    }

    public IntegrationInstallationRequestAccount websiteUrl(URI websiteUrl) {
        this.websiteUrl = JsonNullable.of(websiteUrl);
        return this;
    }

    /**
     * The enterprise's website URL.
     * @return websiteUrl
     */
    @Valid
    @Schema(
            name = "website_url",
            description = "The enterprise's website URL.",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("website_url")
    public JsonNullable<URI> getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(JsonNullable<URI> websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public IntegrationInstallationRequestAccount slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * The slug url identifier for the enterprise.
     * @return slug
     */
    @NotNull
    @Schema(
            name = "slug",
            example = "octo-business",
            description = "The slug url identifier for the enterprise.",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public IntegrationInstallationRequestAccount createdAt(OffsetDateTime createdAt) {
        this.createdAt = JsonNullable.of(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2019-01-26T19:01:12Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public JsonNullable<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(JsonNullable<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public IntegrationInstallationRequestAccount updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = JsonNullable.of(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2019-01-26T19:14:43Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public JsonNullable<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(JsonNullable<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        IntegrationInstallationRequestAccount integrationInstallationRequestAccount =
                (IntegrationInstallationRequestAccount) o;
        return Objects.equals(this.name, integrationInstallationRequestAccount.name)
                && equalsNullable(this.email, integrationInstallationRequestAccount.email)
                && Objects.equals(this.login, integrationInstallationRequestAccount.login)
                && Objects.equals(this.id, integrationInstallationRequestAccount.id)
                && Objects.equals(this.nodeId, integrationInstallationRequestAccount.nodeId)
                && Objects.equals(this.avatarUrl, integrationInstallationRequestAccount.avatarUrl)
                && Objects.equals(this.gravatarId, integrationInstallationRequestAccount.gravatarId)
                && Objects.equals(this.url, integrationInstallationRequestAccount.url)
                && Objects.equals(this.htmlUrl, integrationInstallationRequestAccount.htmlUrl)
                && Objects.equals(this.followersUrl, integrationInstallationRequestAccount.followersUrl)
                && Objects.equals(this.followingUrl, integrationInstallationRequestAccount.followingUrl)
                && Objects.equals(this.gistsUrl, integrationInstallationRequestAccount.gistsUrl)
                && Objects.equals(this.starredUrl, integrationInstallationRequestAccount.starredUrl)
                && Objects.equals(this.subscriptionsUrl, integrationInstallationRequestAccount.subscriptionsUrl)
                && Objects.equals(this.organizationsUrl, integrationInstallationRequestAccount.organizationsUrl)
                && Objects.equals(this.reposUrl, integrationInstallationRequestAccount.reposUrl)
                && Objects.equals(this.eventsUrl, integrationInstallationRequestAccount.eventsUrl)
                && Objects.equals(this.receivedEventsUrl, integrationInstallationRequestAccount.receivedEventsUrl)
                && Objects.equals(this.type, integrationInstallationRequestAccount.type)
                && Objects.equals(this.siteAdmin, integrationInstallationRequestAccount.siteAdmin)
                && Objects.equals(this.starredAt, integrationInstallationRequestAccount.starredAt)
                && Objects.equals(this.userViewType, integrationInstallationRequestAccount.userViewType)
                && equalsNullable(this.description, integrationInstallationRequestAccount.description)
                && equalsNullable(this.websiteUrl, integrationInstallationRequestAccount.websiteUrl)
                && Objects.equals(this.slug, integrationInstallationRequestAccount.slug)
                && Objects.equals(this.createdAt, integrationInstallationRequestAccount.createdAt)
                && Objects.equals(this.updatedAt, integrationInstallationRequestAccount.updatedAt);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
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
                userViewType,
                hashCodeNullable(description),
                hashCodeNullable(websiteUrl),
                slug,
                createdAt,
                updatedAt);
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
        sb.append("class IntegrationInstallationRequestAccount {\n");
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
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
