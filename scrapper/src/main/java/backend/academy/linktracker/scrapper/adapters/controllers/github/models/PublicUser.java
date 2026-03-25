package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.time.OffsetDateTime;
import java.util.*;
import java.util.Objects;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Public User
 */
@Schema(name = "public-user", description = "Public User")
@JsonTypeName("public-user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PublicUser implements UsersGetAuthenticated200Response {

    private String login;

    private Long id;

    private String userViewType;

    private String nodeId;

    private URI avatarUrl;

    private String gravatarId = null;

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

    private String name = null;

    private String company = null;

    private String blog = null;

    private String location = null;

    private String email = null;

    private String notificationEmail = null;

    private Boolean hireable = null;

    private String bio = null;

    private String twitterUsername = null;

    private Long publicRepos;

    private Long publicGists;

    private Long followers;

    private Long following;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime createdAt;

    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private OffsetDateTime updatedAt;

    private PublicUserPlan plan;

    private Long privateGists;

    private Long totalPrivateRepos;

    private Long ownedPrivateRepos;

    private Long diskUsage;

    private Long collaborators;

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
        this.gravatarId = gravatarId;
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
        this.name = name;
        this.company = company;
        this.blog = blog;
        this.location = location;
        this.email = email;
        this.hireable = hireable;
        this.bio = bio;
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
        this.userViewType = userViewType;
        return this;
    }

    /**
     * Get userViewType
     * @return userViewType
     */
    @Schema(name = "user_view_type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user_view_type")
    public String getUserViewType() {
        return userViewType;
    }

    public void setUserViewType(String userViewType) {
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
        this.gravatarId = gravatarId;
        return this;
    }

    /**
     * Get gravatarId
     * @return gravatarId
     */
    @NotNull
    @Schema(name = "gravatar_id", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
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
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @NotNull
    @Schema(name = "name", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PublicUser company(String company) {
        this.company = company;
        return this;
    }

    /**
     * Get company
     * @return company
     */
    @NotNull
    @Schema(name = "company", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("company")
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public PublicUser blog(String blog) {
        this.blog = blog;
        return this;
    }

    /**
     * Get blog
     * @return blog
     */
    @NotNull
    @Schema(name = "blog", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("blog")
    public String getBlog() {
        return blog;
    }

    public void setBlog(String blog) {
        this.blog = blog;
    }

    public PublicUser location(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get location
     * @return location
     */
    @NotNull
    @Schema(name = "location", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("location")
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public PublicUser email(String email) {
        this.email = email;
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
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PublicUser notificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
        return this;
    }

    /**
     * Get notificationEmail
     * @return notificationEmail
     */
    @jakarta.validation.constraints.Email
    @Schema(name = "notification_email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_email")
    public String getNotificationEmail() {
        return notificationEmail;
    }

    public void setNotificationEmail(String notificationEmail) {
        this.notificationEmail = notificationEmail;
    }

    public PublicUser hireable(Boolean hireable) {
        this.hireable = hireable;
        return this;
    }

    /**
     * Get hireable
     * @return hireable
     */
    @NotNull
    @Schema(name = "hireable", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("hireable")
    public Boolean getHireable() {
        return hireable;
    }

    public void setHireable(Boolean hireable) {
        this.hireable = hireable;
    }

    public PublicUser bio(String bio) {
        this.bio = bio;
        return this;
    }

    /**
     * Get bio
     * @return bio
     */
    @NotNull
    @Schema(name = "bio", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("bio")
    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

    public PublicUser twitterUsername(String twitterUsername) {
        this.twitterUsername = twitterUsername;
        return this;
    }

    /**
     * Get twitterUsername
     * @return twitterUsername
     */
    @Schema(name = "twitter_username", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("twitter_username")
    public String getTwitterUsername() {
        return twitterUsername;
    }

    public void setTwitterUsername(String twitterUsername) {
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
        this.plan = plan;
        return this;
    }

    /**
     * Get plan
     * @return plan
     */
    @Valid
    @Schema(name = "plan", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("plan")
    public PublicUserPlan getPlan() {
        return plan;
    }

    public void setPlan(PublicUserPlan plan) {
        this.plan = plan;
    }

    public PublicUser privateGists(Long privateGists) {
        this.privateGists = privateGists;
        return this;
    }

    /**
     * Get privateGists
     * @return privateGists
     */
    @Schema(name = "private_gists", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("private_gists")
    public Long getPrivateGists() {
        return privateGists;
    }

    public void setPrivateGists(Long privateGists) {
        this.privateGists = privateGists;
    }

    public PublicUser totalPrivateRepos(Long totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
        return this;
    }

    /**
     * Get totalPrivateRepos
     * @return totalPrivateRepos
     */
    @Schema(name = "total_private_repos", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("total_private_repos")
    public Long getTotalPrivateRepos() {
        return totalPrivateRepos;
    }

    public void setTotalPrivateRepos(Long totalPrivateRepos) {
        this.totalPrivateRepos = totalPrivateRepos;
    }

    public PublicUser ownedPrivateRepos(Long ownedPrivateRepos) {
        this.ownedPrivateRepos = ownedPrivateRepos;
        return this;
    }

    /**
     * Get ownedPrivateRepos
     * @return ownedPrivateRepos
     */
    @Schema(name = "owned_private_repos", example = "2", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("owned_private_repos")
    public Long getOwnedPrivateRepos() {
        return ownedPrivateRepos;
    }

    public void setOwnedPrivateRepos(Long ownedPrivateRepos) {
        this.ownedPrivateRepos = ownedPrivateRepos;
    }

    public PublicUser diskUsage(Long diskUsage) {
        this.diskUsage = diskUsage;
        return this;
    }

    /**
     * Get diskUsage
     * @return diskUsage
     */
    @Schema(name = "disk_usage", example = "1", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("disk_usage")
    public Long getDiskUsage() {
        return diskUsage;
    }

    public void setDiskUsage(Long diskUsage) {
        this.diskUsage = diskUsage;
    }

    public PublicUser collaborators(Long collaborators) {
        this.collaborators = collaborators;
        return this;
    }

    /**
     * Get collaborators
     * @return collaborators
     */
    @Schema(name = "collaborators", example = "3", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("collaborators")
    public Long getCollaborators() {
        return collaborators;
    }

    public void setCollaborators(Long collaborators) {
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
                && Objects.equals(this.notificationEmail, publicUser.notificationEmail)
                && Objects.equals(this.hireable, publicUser.hireable)
                && Objects.equals(this.bio, publicUser.bio)
                && Objects.equals(this.twitterUsername, publicUser.twitterUsername)
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
                notificationEmail,
                hireable,
                bio,
                twitterUsername,
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
