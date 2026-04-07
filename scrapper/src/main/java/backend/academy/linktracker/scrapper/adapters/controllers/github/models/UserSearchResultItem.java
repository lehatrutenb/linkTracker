package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import org.openapitools.jackson.nullable.JsonNullable;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * User Search Result Item
 */
@Schema(name = "user-search-result-item", description = "User Search Result Item")
@JsonTypeName("user-search-result-item")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class UserSearchResultItem {

    private String login;

    private Long id;

    private String nodeId;

    private URI avatarUrl;

    private JsonNullable<String> gravatarId = JsonNullable.<String>undefined();

    private URI url;

    private URI htmlUrl;

    private URI followersUrl;

    private URI subscriptionsUrl;

    private URI organizationsUrl;

    private URI reposUrl;

    private URI receivedEventsUrl;

    private String type;

    private BigDecimal score;

    private String followingUrl;

    private String gistsUrl;

    private String starredUrl;

    private String eventsUrl;

    private Optional<Long> publicRepos = Optional.empty();

    private Optional<Long> publicGists = Optional.empty();

    private Optional<Long> followers = Optional.empty();

    private Optional<Long> following = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> createdAt = Optional.empty();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private Optional<OffsetDateTime> updatedAt = Optional.empty();

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private JsonNullable<String> bio = JsonNullable.<String>undefined();

    private JsonNullable<@jakarta.validation.constraints.Email String> email = JsonNullable.<String>undefined();

    private JsonNullable<String> location = JsonNullable.<String>undefined();

    private Boolean siteAdmin;

    private JsonNullable<Boolean> hireable = JsonNullable.<Boolean>undefined();

    @Valid
    private List<@Valid SearchResultTextMatchesInner> textMatches = new ArrayList<>();

    private JsonNullable<String> blog = JsonNullable.<String>undefined();

    private JsonNullable<String> company = JsonNullable.<String>undefined();

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private JsonNullable<OffsetDateTime> suspendedAt = JsonNullable.<OffsetDateTime>undefined();

    private Optional<String> userViewType = Optional.empty();

    public UserSearchResultItem() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public UserSearchResultItem(
            String login,
            Long id,
            String nodeId,
            URI avatarUrl,
            String gravatarId,
            URI url,
            URI htmlUrl,
            URI followersUrl,
            URI subscriptionsUrl,
            URI organizationsUrl,
            URI reposUrl,
            URI receivedEventsUrl,
            String type,
            BigDecimal score,
            String followingUrl,
            String gistsUrl,
            String starredUrl,
            String eventsUrl,
            Boolean siteAdmin) {
        this.login = login;
        this.id = id;
        this.nodeId = nodeId;
        this.avatarUrl = avatarUrl;
        this.gravatarId = JsonNullable.of(gravatarId);
        this.url = url;
        this.htmlUrl = htmlUrl;
        this.followersUrl = followersUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.organizationsUrl = organizationsUrl;
        this.reposUrl = reposUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.type = type;
        this.score = score;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.starredUrl = starredUrl;
        this.eventsUrl = eventsUrl;
        this.siteAdmin = siteAdmin;
    }

    public UserSearchResultItem login(String login) {
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

    public UserSearchResultItem id(Long id) {
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

    public UserSearchResultItem nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @NotNull
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public UserSearchResultItem avatarUrl(URI avatarUrl) {
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

    public UserSearchResultItem gravatarId(String gravatarId) {
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

    public UserSearchResultItem url(URI url) {
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

    public UserSearchResultItem htmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Valid
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public UserSearchResultItem followersUrl(URI followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    /**
     * Get followersUrl
     * @return followersUrl
     */
    @NotNull
    @Valid
    @Schema(name = "followers_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("followers_url")
    public URI getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(URI followersUrl) {
        this.followersUrl = followersUrl;
    }

    public UserSearchResultItem subscriptionsUrl(URI subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    /**
     * Get subscriptionsUrl
     * @return subscriptionsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "subscriptions_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscriptions_url")
    public URI getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(URI subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public UserSearchResultItem organizationsUrl(URI organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    /**
     * Get organizationsUrl
     * @return organizationsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "organizations_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organizations_url")
    public URI getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(URI organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public UserSearchResultItem reposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    /**
     * Get reposUrl
     * @return reposUrl
     */
    @NotNull
    @Valid
    @Schema(name = "repos_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repos_url")
    public URI getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(URI reposUrl) {
        this.reposUrl = reposUrl;
    }

    public UserSearchResultItem receivedEventsUrl(URI receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    /**
     * Get receivedEventsUrl
     * @return receivedEventsUrl
     */
    @NotNull
    @Valid
    @Schema(name = "received_events_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("received_events_url")
    public URI getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(URI receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public UserSearchResultItem type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public UserSearchResultItem score(BigDecimal score) {
        this.score = score;
        return this;
    }

    /**
     * Get score
     * @return score
     */
    @NotNull
    @Valid
    @Schema(name = "score", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("score")
    public BigDecimal getScore() {
        return score;
    }

    public void setScore(BigDecimal score) {
        this.score = score;
    }

    public UserSearchResultItem followingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    /**
     * Get followingUrl
     * @return followingUrl
     */
    @NotNull
    @Schema(name = "following_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public UserSearchResultItem gistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    /**
     * Get gistsUrl
     * @return gistsUrl
     */
    @NotNull
    @Schema(name = "gists_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public UserSearchResultItem starredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    /**
     * Get starredUrl
     * @return starredUrl
     */
    @NotNull
    @Schema(name = "starred_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public UserSearchResultItem eventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @NotNull
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public UserSearchResultItem publicRepos(Long publicRepos) {
        this.publicRepos = Optional.ofNullable(publicRepos);
        return this;
    }

    /**
     * Get publicRepos
     * @return publicRepos
     */
    @Schema(name = "public_repos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public_repos")
    public Optional<Long> getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Optional<Long> publicRepos) {
        this.publicRepos = publicRepos;
    }

    public UserSearchResultItem publicGists(Long publicGists) {
        this.publicGists = Optional.ofNullable(publicGists);
        return this;
    }

    /**
     * Get publicGists
     * @return publicGists
     */
    @Schema(name = "public_gists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public_gists")
    public Optional<Long> getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Optional<Long> publicGists) {
        this.publicGists = publicGists;
    }

    public UserSearchResultItem followers(Long followers) {
        this.followers = Optional.ofNullable(followers);
        return this;
    }

    /**
     * Get followers
     * @return followers
     */
    @Schema(name = "followers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("followers")
    public Optional<Long> getFollowers() {
        return followers;
    }

    public void setFollowers(Optional<Long> followers) {
        this.followers = followers;
    }

    public UserSearchResultItem following(Long following) {
        this.following = Optional.ofNullable(following);
        return this;
    }

    /**
     * Get following
     * @return following
     */
    @Schema(name = "following", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("following")
    public Optional<Long> getFollowing() {
        return following;
    }

    public void setFollowing(Optional<Long> following) {
        this.following = following;
    }

    public UserSearchResultItem createdAt(OffsetDateTime createdAt) {
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<OffsetDateTime> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<OffsetDateTime> createdAt) {
        this.createdAt = createdAt;
    }

    public UserSearchResultItem updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<OffsetDateTime> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<OffsetDateTime> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UserSearchResultItem name(String name) {
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

    public UserSearchResultItem bio(String bio) {
        this.bio = JsonNullable.of(bio);
        return this;
    }

    /**
     * Get bio
     * @return bio
     */
    @Schema(name = "bio", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("bio")
    public JsonNullable<String> getBio() {
        return bio;
    }

    public void setBio(JsonNullable<String> bio) {
        this.bio = bio;
    }

    public UserSearchResultItem email(String email) {
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public JsonNullable<@jakarta.validation.constraints.Email String> getEmail() {
        return email;
    }

    public void setEmail(JsonNullable<String> email) {
        this.email = email;
    }

    public UserSearchResultItem location(String location) {
        this.location = JsonNullable.of(location);
        return this;
    }

    /**
     * Get location
     * @return location
     */
    @Schema(name = "location", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("location")
    public JsonNullable<String> getLocation() {
        return location;
    }

    public void setLocation(JsonNullable<String> location) {
        this.location = location;
    }

    public UserSearchResultItem siteAdmin(Boolean siteAdmin) {
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

    public UserSearchResultItem hireable(Boolean hireable) {
        this.hireable = JsonNullable.of(hireable);
        return this;
    }

    /**
     * Get hireable
     * @return hireable
     */
    @Schema(name = "hireable", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hireable")
    public JsonNullable<Boolean> getHireable() {
        return hireable;
    }

    public void setHireable(JsonNullable<Boolean> hireable) {
        this.hireable = hireable;
    }

    public UserSearchResultItem textMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
        return this;
    }

    public UserSearchResultItem addTextMatchesItem(SearchResultTextMatchesInner textMatchesItem) {
        if (this.textMatches == null) {
            this.textMatches = new ArrayList<>();
        }
        this.textMatches.add(textMatchesItem);
        return this;
    }

    /**
     * Get textMatches
     * @return textMatches
     */
    @Valid
    @Schema(name = "text_matches", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("text_matches")
    public List<@Valid SearchResultTextMatchesInner> getTextMatches() {
        return textMatches;
    }

    public void setTextMatches(List<@Valid SearchResultTextMatchesInner> textMatches) {
        this.textMatches = textMatches;
    }

    public UserSearchResultItem blog(String blog) {
        this.blog = JsonNullable.of(blog);
        return this;
    }

    /**
     * Get blog
     * @return blog
     */
    @Schema(name = "blog", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("blog")
    public JsonNullable<String> getBlog() {
        return blog;
    }

    public void setBlog(JsonNullable<String> blog) {
        this.blog = blog;
    }

    public UserSearchResultItem company(String company) {
        this.company = JsonNullable.of(company);
        return this;
    }

    /**
     * Get company
     * @return company
     */
    @Schema(name = "company", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("company")
    public JsonNullable<String> getCompany() {
        return company;
    }

    public void setCompany(JsonNullable<String> company) {
        this.company = company;
    }

    public UserSearchResultItem suspendedAt(OffsetDateTime suspendedAt) {
        this.suspendedAt = JsonNullable.of(suspendedAt);
        return this;
    }

    /**
     * Get suspendedAt
     * @return suspendedAt
     */
    @Valid
    @Schema(name = "suspended_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("suspended_at")
    public JsonNullable<OffsetDateTime> getSuspendedAt() {
        return suspendedAt;
    }

    public void setSuspendedAt(JsonNullable<OffsetDateTime> suspendedAt) {
        this.suspendedAt = suspendedAt;
    }

    public UserSearchResultItem userViewType(String userViewType) {
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
        UserSearchResultItem userSearchResultItem = (UserSearchResultItem) o;
        return Objects.equals(this.login, userSearchResultItem.login)
                && Objects.equals(this.id, userSearchResultItem.id)
                && Objects.equals(this.nodeId, userSearchResultItem.nodeId)
                && Objects.equals(this.avatarUrl, userSearchResultItem.avatarUrl)
                && Objects.equals(this.gravatarId, userSearchResultItem.gravatarId)
                && Objects.equals(this.url, userSearchResultItem.url)
                && Objects.equals(this.htmlUrl, userSearchResultItem.htmlUrl)
                && Objects.equals(this.followersUrl, userSearchResultItem.followersUrl)
                && Objects.equals(this.subscriptionsUrl, userSearchResultItem.subscriptionsUrl)
                && Objects.equals(this.organizationsUrl, userSearchResultItem.organizationsUrl)
                && Objects.equals(this.reposUrl, userSearchResultItem.reposUrl)
                && Objects.equals(this.receivedEventsUrl, userSearchResultItem.receivedEventsUrl)
                && Objects.equals(this.type, userSearchResultItem.type)
                && Objects.equals(this.score, userSearchResultItem.score)
                && Objects.equals(this.followingUrl, userSearchResultItem.followingUrl)
                && Objects.equals(this.gistsUrl, userSearchResultItem.gistsUrl)
                && Objects.equals(this.starredUrl, userSearchResultItem.starredUrl)
                && Objects.equals(this.eventsUrl, userSearchResultItem.eventsUrl)
                && Objects.equals(this.publicRepos, userSearchResultItem.publicRepos)
                && Objects.equals(this.publicGists, userSearchResultItem.publicGists)
                && Objects.equals(this.followers, userSearchResultItem.followers)
                && Objects.equals(this.following, userSearchResultItem.following)
                && Objects.equals(this.createdAt, userSearchResultItem.createdAt)
                && Objects.equals(this.updatedAt, userSearchResultItem.updatedAt)
                && equalsNullable(this.name, userSearchResultItem.name)
                && equalsNullable(this.bio, userSearchResultItem.bio)
                && equalsNullable(this.email, userSearchResultItem.email)
                && equalsNullable(this.location, userSearchResultItem.location)
                && Objects.equals(this.siteAdmin, userSearchResultItem.siteAdmin)
                && equalsNullable(this.hireable, userSearchResultItem.hireable)
                && Objects.equals(this.textMatches, userSearchResultItem.textMatches)
                && equalsNullable(this.blog, userSearchResultItem.blog)
                && equalsNullable(this.company, userSearchResultItem.company)
                && equalsNullable(this.suspendedAt, userSearchResultItem.suspendedAt)
                && Objects.equals(this.userViewType, userSearchResultItem.userViewType);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                login,
                id,
                nodeId,
                avatarUrl,
                gravatarId,
                url,
                htmlUrl,
                followersUrl,
                subscriptionsUrl,
                organizationsUrl,
                reposUrl,
                receivedEventsUrl,
                type,
                score,
                followingUrl,
                gistsUrl,
                starredUrl,
                eventsUrl,
                publicRepos,
                publicGists,
                followers,
                following,
                createdAt,
                updatedAt,
                hashCodeNullable(name),
                hashCodeNullable(bio),
                hashCodeNullable(email),
                hashCodeNullable(location),
                siteAdmin,
                hashCodeNullable(hireable),
                textMatches,
                hashCodeNullable(blog),
                hashCodeNullable(company),
                hashCodeNullable(suspendedAt),
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
        sb.append("class UserSearchResultItem {\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    followersUrl: ").append(toIndentedString(followersUrl)).append("\n");
        sb.append("    subscriptionsUrl: ")
                .append(toIndentedString(subscriptionsUrl))
                .append("\n");
        sb.append("    organizationsUrl: ")
                .append(toIndentedString(organizationsUrl))
                .append("\n");
        sb.append("    reposUrl: ").append(toIndentedString(reposUrl)).append("\n");
        sb.append("    receivedEventsUrl: ")
                .append(toIndentedString(receivedEventsUrl))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    score: ").append(toIndentedString(score)).append("\n");
        sb.append("    followingUrl: ").append(toIndentedString(followingUrl)).append("\n");
        sb.append("    gistsUrl: ").append(toIndentedString(gistsUrl)).append("\n");
        sb.append("    starredUrl: ").append(toIndentedString(starredUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    publicRepos: ").append(toIndentedString(publicRepos)).append("\n");
        sb.append("    publicGists: ").append(toIndentedString(publicGists)).append("\n");
        sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
        sb.append("    following: ").append(toIndentedString(following)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    siteAdmin: ").append(toIndentedString(siteAdmin)).append("\n");
        sb.append("    hireable: ").append(toIndentedString(hireable)).append("\n");
        sb.append("    textMatches: ").append(toIndentedString(textMatches)).append("\n");
        sb.append("    blog: ").append(toIndentedString(blog)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    suspendedAt: ").append(toIndentedString(suspendedAt)).append("\n");
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
