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
 * Private User
 */
@Schema(name = "private-user", description = "Private User")
@JsonTypeName("private-user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PrivateUser implements UsersGetAuthenticated200Response {

    private String login;

    private Long id;

    private Optional<String> userViewType = Optional.empty();

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

    private JsonNullable<String> name = JsonNullable.<String>undefined();

    private JsonNullable<String> company = JsonNullable.<String>undefined();

    private JsonNullable<String> blog = JsonNullable.<String>undefined();

    private JsonNullable<String> location = JsonNullable.<String>undefined();

    private JsonNullable<@jakarta.validation.constraints.Email String> email = JsonNullable.<String>undefined();

    private JsonNullable<@jakarta.validation.constraints.Email String> notificationEmail =
            JsonNullable.<String>undefined();

    private JsonNullable<Boolean> hireable = JsonNullable.<Boolean>undefined();

    private JsonNullable<String> bio = JsonNullable.<String>undefined();

    private JsonNullable<String> twitterUsername = JsonNullable.<String>undefined();

    private Long publicRepos;

    private Long publicGists;

    private Long followers;

    private Long following;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private Long privateGists;

    private Long totalPrivateRepos;

    private Long ownedPrivateRepos;

    private Long diskUsage;

    private Long collaborators;

    private Boolean twoFactorAuthentication;

    private Optional<PublicUserPlan> plan = Optional.empty();

    private Optional<Boolean> businessPlus = Optional.empty();

    private Optional<String> ldapDn = Optional.empty();

    public PrivateUser() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PrivateUser(
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
            String name,
            String company,
            String blog,
            String location,
            String email,
            Boolean hireable,
            String bio,
            Long publicRepos,
            Long publicGists,
            Long followers,
            Long following,
            OffsetDateTime createdAt,
            OffsetDateTime updatedAt,
            Long privateGists,
            Long totalPrivateRepos,
            Long ownedPrivateRepos,
            Long diskUsage,
            Long collaborators,
            Boolean twoFactorAuthentication) {
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
        this.name = JsonNullable.of(name);
        this.company = JsonNullable.of(company);
        this.blog = JsonNullable.of(blog);
        this.location = JsonNullable.of(location);
        this.email = JsonNullable.of(email);
        this.hireable = JsonNullable.of(hireable);
        this.bio = JsonNullable.of(bio);
        this.publicRepos = publicRepos;
        this.publicGists = publicGists;
        this.followers = followers;
        this.following = following;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.privateGists = privateGists;
        this.totalPrivateRepos = totalPrivateRepos;
        this.ownedPrivateRepos = ownedPrivateRepos;
        this.diskUsage = diskUsage;
        this.collaborators = collaborators;
        this.twoFactorAuthentication = twoFactorAuthentication;
    }

    public PrivateUser login(String login) {
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

    public PrivateUser id(Long id) {
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

    public PrivateUser userViewType(String userViewType) {
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
        return Optional.of(userViewType.toString());
    }

    public void setUserViewType(Optional<String> userViewType) {
        this.userViewType = userViewType;
    }

    public PrivateUser nodeId(String nodeId) {
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

    public PrivateUser avatarUrl(URI avatarUrl) {
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

    public PrivateUser gravatarId(String gravatarId) {
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

    public PrivateUser url(URI url) {
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

    public PrivateUser htmlUrl(URI htmlUrl) {
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

    public PrivateUser followersUrl(URI followersUrl) {
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

    public PrivateUser followingUrl(String followingUrl) {
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

    public PrivateUser gistsUrl(String gistsUrl) {
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

    public PrivateUser starredUrl(String starredUrl) {
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

    public PrivateUser subscriptionsUrl(URI subscriptionsUrl) {
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

    public PrivateUser organizationsUrl(URI organizationsUrl) {
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

    public PrivateUser reposUrl(URI reposUrl) {
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

    public PrivateUser eventsUrl(String eventsUrl) {
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

    public PrivateUser receivedEventsUrl(URI receivedEventsUrl) {
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

    public PrivateUser type(String type) {
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

    public PrivateUser siteAdmin(Boolean siteAdmin) {
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

    public PrivateUser name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", example = "monalisa octocat", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public PrivateUser company(String company) {
        this.company = JsonNullable.of(company);
        return this;
    }

    /**
     * Get company
     * @return company
     */
    @NotNull
    @Schema(name = "company", example = "GitHub", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("company")
    public JsonNullable<String> getCompany() {
        return company;
    }

    public void setCompany(JsonNullable<String> company) {
        this.company = company;
    }

    public PrivateUser blog(String blog) {
        this.blog = JsonNullable.of(blog);
        return this;
    }

    /**
     * Get blog
     * @return blog
     */
    @NotNull
    @Schema(name = "blog", example = "https://github.com/blog", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blog")
    public JsonNullable<String> getBlog() {
        return blog;
    }

    public void setBlog(JsonNullable<String> blog) {
        this.blog = blog;
    }

    public PrivateUser location(String location) {
        this.location = JsonNullable.of(location);
        return this;
    }

    /**
     * Get location
     * @return location
     */
    @NotNull
    @Schema(name = "location", example = "San Francisco", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("location")
    public JsonNullable<String> getLocation() {
        return location;
    }

    public void setLocation(JsonNullable<String> location) {
        this.location = location;
    }

    public PrivateUser email(String email) {
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @NotNull
    @jakarta.validation.constraints.Email
    @Schema(name = "email", example = "octocat@github.com", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public JsonNullable<@jakarta.validation.constraints.Email String> getEmail() {
        return email;
    }

    public void setEmail(JsonNullable<String> email) {
        this.email = email;
    }

    public PrivateUser notificationEmail(String notificationEmail) {
        this.notificationEmail = JsonNullable.of(notificationEmail);
        return this;
    }

    /**
     * Get notificationEmail
     * @return notificationEmail
     */
    @Schema(
            name = "notification_email",
            example = "octocat@github.com",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_email")
    public JsonNullable<@jakarta.validation.constraints.Email String> getNotificationEmail() {
        return notificationEmail;
    }

    public void setNotificationEmail(JsonNullable<String> notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    public PrivateUser hireable(Boolean hireable) {
        this.hireable = JsonNullable.of(hireable);
        return this;
    }

    /**
     * Get hireable
     * @return hireable
     */
    @NotNull
    @Schema(name = "hireable", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hireable")
    public JsonNullable<Boolean> getHireable() {
        return hireable;
    }

    public void setHireable(JsonNullable<Boolean> hireable) {
        this.hireable = hireable;
    }

    public PrivateUser bio(String bio) {
        this.bio = JsonNullable.of(bio);
        return this;
    }

    /**
     * Get bio
     * @return bio
     */
    @NotNull
    @Schema(name = "bio", example = "There once was...", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("bio")
    public JsonNullable<String> getBio() {
        return bio;
    }

    public void setBio(JsonNullable<String> bio) {
        this.bio = bio;
    }

    public PrivateUser twitterUsername(String twitterUsername) {
        this.twitterUsername = JsonNullable.of(twitterUsername);
        return this;
    }

    /**
     * Get twitterUsername
     * @return twitterUsername
     */
    @Schema(name = "twitter_username", example = "monalisa", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("twitter_username")
    public JsonNullable<String> getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(JsonNullable<String> twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public PrivateUser publicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
        return this;
    }

    /**
     * Get publicRepos
     * @return publicRepos
     */
    @NotNull
    @Schema(name = "public_repos", example = "2", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_repos")
    public Long getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
    }

    public PrivateUser publicGists(Long publicGists) {
        this.publicGists = publicGists;
        return this;
    }

    /**
     * Get publicGists
     * @return publicGists
     */
    @NotNull
    @Schema(name = "public_gists", example = "1", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_gists")
    public Long getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Long publicGists) {
        this.publicGists = publicGists;
    }

    public PrivateUser followers(Long followers) {
        this.followers = followers;
        return this;
    }

    /**
     * Get followers
     * @return followers
     */
    @NotNull
    @Schema(name = "followers", example = "20", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("followers")
    public Long getFollowers() {
        return followers;
    }

    public void setFollowers(Long followers) {
        this.followers = followers;
    }

    public PrivateUser following(Long following) {
        this.following = following;
        return this;
    }

    /**
     * Get following
     * @return following
     */
    @NotNull
    @Schema(name = "following", example = "0", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("following")
    public Long getFollowing() {
        return following;
    }

    public void setFollowing(Long following) {
        this.following = following;
    }

    public PrivateUser createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", example = "2008-01-14T04:33:35Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PrivateUser updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", example = "2008-01-14T04:33:35Z", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PrivateUser privateGists(Long privateGists) {
        this.privateGists = privateGists;
        return this;
    }

    /**
     * Get privateGists
     * @return privateGists
     */
    @NotNull
    @Schema(name = "private_gists", example = "81", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("private_gists")
    public Long getPrivateGists() {
        return privateGists;
    }

    public void setPrivateGists(Long privateGists) {
        this.privateGists = privateGists;
    }

    public PrivateUser totalPrivateRepos(Long totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
        return this;
    }

    /**
     * Get totalPrivateRepos
     * @return totalPrivateRepos
     */
    @NotNull
    @Schema(name = "total_private_repos", example = "100", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("total_private_repos")
    public Long getTotalPrivateRepos() {
        return totalPrivateRepos;
    }

    public void setTotalPrivateRepos(Long totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
    }

    public PrivateUser ownedPrivateRepos(Long ownedPrivateRepos) {
        this.ownedPrivateRepos = ownedPrivateRepos;
        return this;
    }

    /**
     * Get ownedPrivateRepos
     * @return ownedPrivateRepos
     */
    @NotNull
    @Schema(name = "owned_private_repos", example = "100", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("owned_private_repos")
    public Long getOwnedPrivateRepos() {
        return ownedPrivateRepos;
    }

    public void setOwnedPrivateRepos(Long ownedPrivateRepos) {
        this.ownedPrivateRepos = ownedPrivateRepos;
    }

    public PrivateUser diskUsage(Long diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }

    /**
     * Get diskUsage
     * @return diskUsage
     */
    @NotNull
    @Schema(name = "disk_usage", example = "10000", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("disk_usage")
    public Long getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(Long diskUsage) {
        this.diskUsage = diskUsage;
    }

    public PrivateUser collaborators(Long collaborators) {
        this.collaborators = collaborators;
        return this;
    }

    /**
     * Get collaborators
     * @return collaborators
     */
    @NotNull
    @Schema(name = "collaborators", example = "8", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("collaborators")
    public Long getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(Long collaborators) {
        this.collaborators = collaborators;
    }

    public PrivateUser twoFactorAuthentication(Boolean twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
        return this;
    }

    /**
     * Get twoFactorAuthentication
     * @return twoFactorAuthentication
     */
    @NotNull
    @Schema(name = "two_factor_authentication", example = "true", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("two_factor_authentication")
    public Boolean getTwoFactorAuthentication() {
        return twoFactorAuthentication;
    }

    public void setTwoFactorAuthentication(Boolean twoFactorAuthentication) {
        this.twoFactorAuthentication = twoFactorAuthentication;
    }

    public PrivateUser plan(PublicUserPlan plan) {
        this.plan = Optional.ofNullable(plan);
        return this;
    }

    /**
     * Get plan
     * @return plan
     */
    @Valid
    @Schema(name = "plan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("plan")
    public Optional<PublicUserPlan> getPlan() {
        return plan;
    }

    public void setPlan(Optional<PublicUserPlan> plan) {
        this.plan = plan;
    }

    public PrivateUser businessPlus(Boolean businessPlus) {
        this.businessPlus = Optional.ofNullable(businessPlus);
        return this;
    }

    /**
     * Get businessPlus
     * @return businessPlus
     */
    @Schema(name = "business_plus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("business_plus")
    public Optional<Boolean> getBusinessPlus() {
        return businessPlus;
    }

    public void setBusinessPlus(Optional<Boolean> businessPlus) {
        this.businessPlus = businessPlus;
    }

    public PrivateUser ldapDn(String ldapDn) {
        this.ldapDn = Optional.ofNullable(ldapDn);
        return this;
    }

    /**
     * Get ldapDn
     * @return ldapDn
     */
    @Schema(name = "ldap_dn", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("ldap_dn")
    public Optional<String> getLdapDn() {
        return ldapDn;
    }

    public void setLdapDn(Optional<String> ldapDn) {
        this.ldapDn = ldapDn;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PrivateUser privateUser = (PrivateUser) o;
        return Objects.equals(this.login, privateUser.login)
                && Objects.equals(this.id, privateUser.id)
                && Objects.equals(this.userViewType, privateUser.userViewType)
                && Objects.equals(this.nodeId, privateUser.nodeId)
                && Objects.equals(this.avatarUrl, privateUser.avatarUrl)
                && Objects.equals(this.gravatarId, privateUser.gravatarId)
                && Objects.equals(this.url, privateUser.url)
                && Objects.equals(this.htmlUrl, privateUser.htmlUrl)
                && Objects.equals(this.followersUrl, privateUser.followersUrl)
                && Objects.equals(this.followingUrl, privateUser.followingUrl)
                && Objects.equals(this.gistsUrl, privateUser.gistsUrl)
                && Objects.equals(this.starredUrl, privateUser.starredUrl)
                && Objects.equals(this.subscriptionsUrl, privateUser.subscriptionsUrl)
                && Objects.equals(this.organizationsUrl, privateUser.organizationsUrl)
                && Objects.equals(this.reposUrl, privateUser.reposUrl)
                && Objects.equals(this.eventsUrl, privateUser.eventsUrl)
                && Objects.equals(this.receivedEventsUrl, privateUser.receivedEventsUrl)
                && Objects.equals(this.type, privateUser.type)
                && Objects.equals(this.siteAdmin, privateUser.siteAdmin)
                && Objects.equals(this.name, privateUser.name)
                && Objects.equals(this.company, privateUser.company)
                && Objects.equals(this.blog, privateUser.blog)
                && Objects.equals(this.location, privateUser.location)
                && Objects.equals(this.email, privateUser.email)
                && equalsNullable(this.notificationEmail, privateUser.notificationEmail)
                && Objects.equals(this.hireable, privateUser.hireable)
                && Objects.equals(this.bio, privateUser.bio)
                && equalsNullable(this.twitterUsername, privateUser.twitterUsername)
                && Objects.equals(this.publicRepos, privateUser.publicRepos)
                && Objects.equals(this.publicGists, privateUser.publicGists)
                && Objects.equals(this.followers, privateUser.followers)
                && Objects.equals(this.following, privateUser.following)
                && Objects.equals(this.createdAt, privateUser.createdAt)
                && Objects.equals(this.updatedAt, privateUser.updatedAt)
                && Objects.equals(this.privateGists, privateUser.privateGists)
                && Objects.equals(this.totalPrivateRepos, privateUser.totalPrivateRepos)
                && Objects.equals(this.ownedPrivateRepos, privateUser.ownedPrivateRepos)
                && Objects.equals(this.diskUsage, privateUser.diskUsage)
                && Objects.equals(this.collaborators, privateUser.collaborators)
                && Objects.equals(this.twoFactorAuthentication, privateUser.twoFactorAuthentication)
                && Objects.equals(this.plan, privateUser.plan)
                && Objects.equals(this.businessPlus, privateUser.businessPlus)
                && Objects.equals(this.ldapDn, privateUser.ldapDn);
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
                userViewType,
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
                name,
                company,
                blog,
                location,
                email,
                hashCodeNullable(notificationEmail),
                hireable,
                bio,
                hashCodeNullable(twitterUsername),
                publicRepos,
                publicGists,
                followers,
                following,
                createdAt,
                updatedAt,
                privateGists,
                totalPrivateRepos,
                ownedPrivateRepos,
                diskUsage,
                collaborators,
                twoFactorAuthentication,
                plan,
                businessPlus,
                ldapDn);
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
        sb.append("class PrivateUser {\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    userViewType: ").append(toIndentedString(userViewType)).append("\n");
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
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    company: ").append(toIndentedString(company)).append("\n");
        sb.append("    blog: ").append(toIndentedString(blog)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    notificationEmail: ")
                .append(toIndentedString(notificationEmail))
                .append("\n");
        sb.append("    hireable: ").append(toIndentedString(hireable)).append("\n");
        sb.append("    bio: ").append(toIndentedString(bio)).append("\n");
        sb.append("    twitterUsername: ")
                .append(toIndentedString(twitterUsername))
                .append("\n");
        sb.append("    publicRepos: ").append(toIndentedString(publicRepos)).append("\n");
        sb.append("    publicGists: ").append(toIndentedString(publicGists)).append("\n");
        sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
        sb.append("    following: ").append(toIndentedString(following)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    privateGists: ").append(toIndentedString(privateGists)).append("\n");
        sb.append("    totalPrivateRepos: ")
                .append(toIndentedString(totalPrivateRepos))
                .append("\n");
        sb.append("    ownedPrivateRepos: ")
                .append(toIndentedString(ownedPrivateRepos))
                .append("\n");
        sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
        sb.append("    collaborators: ").append(toIndentedString(collaborators)).append("\n");
        sb.append("    twoFactorAuthentication: ")
                .append(toIndentedString(twoFactorAuthentication))
                .append("\n");
        sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
        sb.append("    businessPlus: ").append(toIndentedString(businessPlus)).append("\n");
        sb.append("    ldapDn: ").append(toIndentedString(ldapDn)).append("\n");
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
