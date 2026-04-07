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
 * Public User
 */
@Schema(name = "public-user", description = "Public User")
@JsonTypeName("public-user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PublicUser implements UsersGetAuthenticated200Response {

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

    private Optional<PublicUserPlan> plan = Optional.empty();

    private Optional<Long> privateGists = Optional.empty();

    private Optional<Long> totalPrivateRepos = Optional.empty();

    private Optional<Long> ownedPrivateRepos = Optional.empty();

    private Optional<Long> diskUsage = Optional.empty();

    private Optional<Long> collaborators = Optional.empty();

    public PublicUser() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PublicUser(
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
            OffsetDateTime updatedAt) {
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
    }

    public PublicUser login(String login) {
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

    public PublicUser id(Long id) {
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

    public PublicUser userViewType(String userViewType) {
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

    public PublicUser nodeId(String nodeId) {
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

    public PublicUser avatarUrl(URI avatarUrl) {
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

    public PublicUser gravatarId(String gravatarId) {
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

    public PublicUser url(URI url) {
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

    public PublicUser htmlUrl(URI htmlUrl) {
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

    public PublicUser followersUrl(URI followersUrl) {
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

    public PublicUser followingUrl(String followingUrl) {
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

    public PublicUser gistsUrl(String gistsUrl) {
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

    public PublicUser starredUrl(String starredUrl) {
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

    public PublicUser subscriptionsUrl(URI subscriptionsUrl) {
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

    public PublicUser organizationsUrl(URI organizationsUrl) {
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

    public PublicUser reposUrl(URI reposUrl) {
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

    public PublicUser eventsUrl(String eventsUrl) {
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

    public PublicUser receivedEventsUrl(URI receivedEventsUrl) {
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

    public PublicUser type(String type) {
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

    public PublicUser siteAdmin(Boolean siteAdmin) {
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

    public PublicUser name(String name) {
        this.name = JsonNullable.of(name);
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public JsonNullable<String> getName() {
        return name;
    }

    public void setName(JsonNullable<String> name) {
        this.name = name;
    }

    public PublicUser company(String company) {
        this.company = JsonNullable.of(company);
        return this;
    }

    /**
     * Get company
     * @return company
     */
    @NotNull
    @Schema(name = "company", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("company")
    public JsonNullable<String> getCompany() {
        return company;
    }

    public void setCompany(JsonNullable<String> company) {
        this.company = company;
    }

    public PublicUser blog(String blog) {
        this.blog = JsonNullable.of(blog);
        return this;
    }

    /**
     * Get blog
     * @return blog
     */
    @NotNull
    @Schema(name = "blog", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blog")
    public JsonNullable<String> getBlog() {
        return blog;
    }

    public void setBlog(JsonNullable<String> blog) {
        this.blog = blog;
    }

    public PublicUser location(String location) {
        this.location = JsonNullable.of(location);
        return this;
    }

    /**
     * Get location
     * @return location
     */
    @NotNull
    @Schema(name = "location", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("location")
    public JsonNullable<String> getLocation() {
        return location;
    }

    public void setLocation(JsonNullable<String> location) {
        this.location = location;
    }

    public PublicUser email(String email) {
        this.email = JsonNullable.of(email);
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @NotNull
    @jakarta.validation.constraints.Email
    @Schema(name = "email", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("email")
    public JsonNullable<@jakarta.validation.constraints.Email String> getEmail() {
        return email;
    }

    public void setEmail(JsonNullable<String> email) {
        this.email = email;
    }

    public PublicUser notificationEmail(String notificationEmail) {
        this.notificationEmail = JsonNullable.of(notificationEmail);
        return this;
    }

    /**
     * Get notificationEmail
     * @return notificationEmail
     */
    @Schema(name = "notification_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_email")
    public JsonNullable<@jakarta.validation.constraints.Email String> getNotificationEmail() {
        return notificationEmail;
    }

    public void setNotificationEmail(JsonNullable<String> notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    public PublicUser hireable(Boolean hireable) {
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

    public PublicUser bio(String bio) {
        this.bio = JsonNullable.of(bio);
        return this;
    }

    /**
     * Get bio
     * @return bio
     */
    @NotNull
    @Schema(name = "bio", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("bio")
    public JsonNullable<String> getBio() {
        return bio;
    }

    public void setBio(JsonNullable<String> bio) {
        this.bio = bio;
    }

    public PublicUser twitterUsername(String twitterUsername) {
        this.twitterUsername = JsonNullable.of(twitterUsername);
        return this;
    }

    /**
     * Get twitterUsername
     * @return twitterUsername
     */
    @Schema(name = "twitter_username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("twitter_username")
    public JsonNullable<String> getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(JsonNullable<String> twitterUsername) {
        this.twitterUsername = twitterUsername;
    }

    public PublicUser publicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
        return this;
    }

    /**
     * Get publicRepos
     * @return publicRepos
     */
    @NotNull
    @Schema(name = "public_repos", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_repos")
    public Long getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
    }

    public PublicUser publicGists(Long publicGists) {
        this.publicGists = publicGists;
        return this;
    }

    /**
     * Get publicGists
     * @return publicGists
     */
    @NotNull
    @Schema(name = "public_gists", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("public_gists")
    public Long getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Long publicGists) {
        this.publicGists = publicGists;
    }

    public PublicUser followers(Long followers) {
        this.followers = followers;
        return this;
    }

    /**
     * Get followers
     * @return followers
     */
    @NotNull
    @Schema(name = "followers", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("followers")
    public Long getFollowers() {
        return followers;
    }

    public void setFollowers(Long followers) {
        this.followers = followers;
    }

    public PublicUser following(Long following) {
        this.following = following;
        return this;
    }

    /**
     * Get following
     * @return following
     */
    @NotNull
    @Schema(name = "following", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("following")
    public Long getFollowing() {
        return following;
    }

    public void setFollowing(Long following) {
        this.following = following;
    }

    public PublicUser createdAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @NotNull
    @Valid
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("created_at")
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public PublicUser updatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @NotNull
    @Valid
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("updated_at")
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public PublicUser plan(PublicUserPlan plan) {
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

    public PublicUser privateGists(Long privateGists) {
        this.privateGists = Optional.ofNullable(privateGists);
        return this;
    }

    /**
     * Get privateGists
     * @return privateGists
     */
    @Schema(name = "private_gists", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private_gists")
    public Optional<Long> getPrivateGists() {
        return privateGists;
    }

    public void setPrivateGists(Optional<Long> privateGists) {
        this.privateGists = privateGists;
    }

    public PublicUser totalPrivateRepos(Long totalPrivateRepos) {
        this.totalPrivateRepos = Optional.ofNullable(totalPrivateRepos);
        return this;
    }

    /**
     * Get totalPrivateRepos
     * @return totalPrivateRepos
     */
    @Schema(name = "total_private_repos", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_private_repos")
    public Optional<Long> getTotalPrivateRepos() {
        return totalPrivateRepos;
    }

    public void setTotalPrivateRepos(Optional<Long> totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
    }

    public PublicUser ownedPrivateRepos(Long ownedPrivateRepos) {
        this.ownedPrivateRepos = Optional.ofNullable(ownedPrivateRepos);
        return this;
    }

    /**
     * Get ownedPrivateRepos
     * @return ownedPrivateRepos
     */
    @Schema(name = "owned_private_repos", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owned_private_repos")
    public Optional<Long> getOwnedPrivateRepos() {
        return ownedPrivateRepos;
    }

    public void setOwnedPrivateRepos(Optional<Long> ownedPrivateRepos) {
        this.ownedPrivateRepos = ownedPrivateRepos;
    }

    public PublicUser diskUsage(Long diskUsage) {
        this.diskUsage = Optional.ofNullable(diskUsage);
        return this;
    }

    /**
     * Get diskUsage
     * @return diskUsage
     */
    @Schema(name = "disk_usage", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("disk_usage")
    public Optional<Long> getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(Optional<Long> diskUsage) {
        this.diskUsage = diskUsage;
    }

    public PublicUser collaborators(Long collaborators) {
        this.collaborators = Optional.ofNullable(collaborators);
        return this;
    }

    /**
     * Get collaborators
     * @return collaborators
     */
    @Schema(name = "collaborators", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collaborators")
    public Optional<Long> getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(Optional<Long> collaborators) {
        this.collaborators = collaborators;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PublicUser publicUser = (PublicUser) o;
        return Objects.equals(this.login, publicUser.login)
                && Objects.equals(this.id, publicUser.id)
                && Objects.equals(this.userViewType, publicUser.userViewType)
                && Objects.equals(this.nodeId, publicUser.nodeId)
                && Objects.equals(this.avatarUrl, publicUser.avatarUrl)
                && Objects.equals(this.gravatarId, publicUser.gravatarId)
                && Objects.equals(this.url, publicUser.url)
                && Objects.equals(this.htmlUrl, publicUser.htmlUrl)
                && Objects.equals(this.followersUrl, publicUser.followersUrl)
                && Objects.equals(this.followingUrl, publicUser.followingUrl)
                && Objects.equals(this.gistsUrl, publicUser.gistsUrl)
                && Objects.equals(this.starredUrl, publicUser.starredUrl)
                && Objects.equals(this.subscriptionsUrl, publicUser.subscriptionsUrl)
                && Objects.equals(this.organizationsUrl, publicUser.organizationsUrl)
                && Objects.equals(this.reposUrl, publicUser.reposUrl)
                && Objects.equals(this.eventsUrl, publicUser.eventsUrl)
                && Objects.equals(this.receivedEventsUrl, publicUser.receivedEventsUrl)
                && Objects.equals(this.type, publicUser.type)
                && Objects.equals(this.siteAdmin, publicUser.siteAdmin)
                && Objects.equals(this.name, publicUser.name)
                && Objects.equals(this.company, publicUser.company)
                && Objects.equals(this.blog, publicUser.blog)
                && Objects.equals(this.location, publicUser.location)
                && Objects.equals(this.email, publicUser.email)
                && equalsNullable(this.notificationEmail, publicUser.notificationEmail)
                && Objects.equals(this.hireable, publicUser.hireable)
                && Objects.equals(this.bio, publicUser.bio)
                && equalsNullable(this.twitterUsername, publicUser.twitterUsername)
                && Objects.equals(this.publicRepos, publicUser.publicRepos)
                && Objects.equals(this.publicGists, publicUser.publicGists)
                && Objects.equals(this.followers, publicUser.followers)
                && Objects.equals(this.following, publicUser.following)
                && Objects.equals(this.createdAt, publicUser.createdAt)
                && Objects.equals(this.updatedAt, publicUser.updatedAt)
                && Objects.equals(this.plan, publicUser.plan)
                && Objects.equals(this.privateGists, publicUser.privateGists)
                && Objects.equals(this.totalPrivateRepos, publicUser.totalPrivateRepos)
                && Objects.equals(this.ownedPrivateRepos, publicUser.ownedPrivateRepos)
                && Objects.equals(this.diskUsage, publicUser.diskUsage)
                && Objects.equals(this.collaborators, publicUser.collaborators);
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
                plan,
                privateGists,
                totalPrivateRepos,
                ownedPrivateRepos,
                diskUsage,
                collaborators);
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
        sb.append("class PublicUser {\n");
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
        sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
        sb.append("    privateGists: ").append(toIndentedString(privateGists)).append("\n");
        sb.append("    totalPrivateRepos: ")
                .append(toIndentedString(totalPrivateRepos))
                .append("\n");
        sb.append("    ownedPrivateRepos: ")
                .append(toIndentedString(ownedPrivateRepos))
                .append("\n");
        sb.append("    diskUsage: ").append(toIndentedString(diskUsage)).append("\n");
        sb.append("    collaborators: ").append(toIndentedString(collaborators)).append("\n");
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
