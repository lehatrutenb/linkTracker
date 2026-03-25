package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;
import org.springframework.lang.Nullable;

/**
 * WebhookInstallationTargetRenamedAccount
 */
@JsonTypeName("webhook_installation_target_renamed_account")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookInstallationTargetRenamedAccount {

    private String archivedAt = null;

    private String avatarUrl;

    private String createdAt;

    private @Nullable Object description = null;

    private String eventsUrl;

    private Long followers;

    private String followersUrl;

    private Long following;

    private String followingUrl;

    private String gistsUrl;

    private String gravatarId;

    private Boolean hasOrganizationProjects;

    private Boolean hasRepositoryProjects;

    private String hooksUrl;

    private String htmlUrl;

    private Long id;

    private Boolean isVerified;

    private String issuesUrl;

    private String login;

    private String membersUrl;

    private String name;

    private String nodeId;

    private String organizationsUrl;

    private Long publicGists;

    private String publicMembersUrl;

    private Long publicRepos;

    private String receivedEventsUrl;

    private String reposUrl;

    private Boolean siteAdmin;

    private String slug;

    private String starredUrl;

    private String subscriptionsUrl;

    private String type;

    private String updatedAt;

    private String url;

    private @Nullable Object websiteUrl = null;

    private String userViewType;

    public WebhookInstallationTargetRenamedAccount() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookInstallationTargetRenamedAccount(String avatarUrl, String htmlUrl, Long id, String nodeId) {
        this.avatarUrl = avatarUrl;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.nodeId = nodeId;
    }

    public WebhookInstallationTargetRenamedAccount archivedAt(String archivedAt) {
        this.archivedAt = archivedAt;
        return this;
    }

    /**
     * Get archivedAt
     * @return archivedAt
     */
    @Schema(name = "archived_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archived_at")
    public String getArchivedAt() {
        return archivedAt;
    }

    public void setArchivedAt(String archivedAt) {
        this.archivedAt = archivedAt;
    }

    public WebhookInstallationTargetRenamedAccount avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @NotNull
    @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public WebhookInstallationTargetRenamedAccount createdAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookInstallationTargetRenamedAccount description(@Nullable Object description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public @Nullable Object getDescription() {
        return description;
    }

    public void setDescription(@Nullable Object description) {
        this.description = description;
    }

    public WebhookInstallationTargetRenamedAccount eventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
        return this;
    }

    /**
     * Get eventsUrl
     * @return eventsUrl
     */
    @Schema(name = "events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("events_url")
    public String getEventsUrl() {
        return eventsUrl;
    }

    public void setEventsUrl(String eventsUrl) {
        this.eventsUrl = eventsUrl;
    }

    public WebhookInstallationTargetRenamedAccount followers(Long followers) {
        this.followers = followers;
        return this;
    }

    /**
     * Get followers
     * @return followers
     */
    @Schema(name = "followers", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("followers")
    public Long getFollowers() {
        return followers;
    }

    public void setFollowers(Long followers) {
        this.followers = followers;
    }

    public WebhookInstallationTargetRenamedAccount followersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    /**
     * Get followersUrl
     * @return followersUrl
     */
    @Schema(name = "followers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("followers_url")
    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public WebhookInstallationTargetRenamedAccount following(Long following) {
        this.following = following;
        return this;
    }

    /**
     * Get following
     * @return following
     */
    @Schema(name = "following", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("following")
    public Long getFollowing() {
        return following;
    }

    public void setFollowing(Long following) {
        this.following = following;
    }

    public WebhookInstallationTargetRenamedAccount followingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
        return this;
    }

    /**
     * Get followingUrl
     * @return followingUrl
     */
    @Schema(name = "following_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("following_url")
    public String getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(String followingUrl) {
        this.followingUrl = followingUrl;
    }

    public WebhookInstallationTargetRenamedAccount gistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
        return this;
    }

    /**
     * Get gistsUrl
     * @return gistsUrl
     */
    @Schema(name = "gists_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gists_url")
    public String getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(String gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public WebhookInstallationTargetRenamedAccount gravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
        return this;
    }

    /**
     * Get gravatarId
     * @return gravatarId
     */
    @Schema(name = "gravatar_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gravatar_id")
    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public WebhookInstallationTargetRenamedAccount hasOrganizationProjects(Boolean hasOrganizationProjects) {
        this.hasOrganizationProjects = hasOrganizationProjects;
        return this;
    }

    /**
     * Get hasOrganizationProjects
     * @return hasOrganizationProjects
     */
    @Schema(name = "has_organization_projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_organization_projects")
    public Boolean getHasOrganizationProjects() {
        return hasOrganizationProjects;
    }

    public void setHasOrganizationProjects(Boolean hasOrganizationProjects) {
        this.hasOrganizationProjects = hasOrganizationProjects;
    }

    public WebhookInstallationTargetRenamedAccount hasRepositoryProjects(Boolean hasRepositoryProjects) {
        this.hasRepositoryProjects = hasRepositoryProjects;
        return this;
    }

    /**
     * Get hasRepositoryProjects
     * @return hasRepositoryProjects
     */
    @Schema(name = "has_repository_projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_repository_projects")
    public Boolean getHasRepositoryProjects() {
        return hasRepositoryProjects;
    }

    public void setHasRepositoryProjects(Boolean hasRepositoryProjects) {
        this.hasRepositoryProjects = hasRepositoryProjects;
    }

    public WebhookInstallationTargetRenamedAccount hooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
        return this;
    }

    /**
     * Get hooksUrl
     * @return hooksUrl
     */
    @Schema(name = "hooks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hooks_url")
    public String getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(String hooksUrl) {
        this.hooksUrl = hooksUrl;
    }

    public WebhookInstallationTargetRenamedAccount htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @NotNull
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookInstallationTargetRenamedAccount id(Long id) {
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

    public WebhookInstallationTargetRenamedAccount isVerified(Boolean isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    /**
     * Get isVerified
     * @return isVerified
     */
    @Schema(name = "is_verified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_verified")
    public Boolean getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Boolean isVerified) {
        this.isVerified = isVerified;
    }

    public WebhookInstallationTargetRenamedAccount issuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
        return this;
    }

    /**
     * Get issuesUrl
     * @return issuesUrl
     */
    @Schema(name = "issues_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues_url")
    public String getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(String issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public WebhookInstallationTargetRenamedAccount login(String login) {
        this.login = login;
        return this;
    }

    /**
     * Get login
     * @return login
     */
    @Schema(name = "login", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("login")
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public WebhookInstallationTargetRenamedAccount membersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
        return this;
    }

    /**
     * Get membersUrl
     * @return membersUrl
     */
    @Schema(name = "members_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_url")
    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public WebhookInstallationTargetRenamedAccount name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    @Schema(name = "name", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WebhookInstallationTargetRenamedAccount nodeId(String nodeId) {
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

    public WebhookInstallationTargetRenamedAccount organizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    /**
     * Get organizationsUrl
     * @return organizationsUrl
     */
    @Schema(name = "organizations_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organizations_url")
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public WebhookInstallationTargetRenamedAccount publicGists(Long publicGists) {
        this.publicGists = publicGists;
        return this;
    }

    /**
     * Get publicGists
     * @return publicGists
     */
    @Schema(name = "public_gists", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public_gists")
    public Long getPublicGists() {
        return publicGists;
    }

    public void setPublicGists(Long publicGists) {
        this.publicGists = publicGists;
    }

    public WebhookInstallationTargetRenamedAccount publicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
        return this;
    }

    /**
     * Get publicMembersUrl
     * @return publicMembersUrl
     */
    @Schema(name = "public_members_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public_members_url")
    public String getPublicMembersUrl() {
        return publicMembersUrl;
    }

    public void setPublicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
    }

    public WebhookInstallationTargetRenamedAccount publicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
        return this;
    }

    /**
     * Get publicRepos
     * @return publicRepos
     */
    @Schema(name = "public_repos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public_repos")
    public Long getPublicRepos() {
        return publicRepos;
    }

    public void setPublicRepos(Long publicRepos) {
        this.publicRepos = publicRepos;
    }

    public WebhookInstallationTargetRenamedAccount receivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    /**
     * Get receivedEventsUrl
     * @return receivedEventsUrl
     */
    @Schema(name = "received_events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("received_events_url")
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public WebhookInstallationTargetRenamedAccount reposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    /**
     * Get reposUrl
     * @return reposUrl
     */
    @Schema(name = "repos_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repos_url")
    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public WebhookInstallationTargetRenamedAccount siteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
        return this;
    }

    /**
     * Get siteAdmin
     * @return siteAdmin
     */
    @Schema(name = "site_admin", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("site_admin")
    public Boolean getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Boolean siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public WebhookInstallationTargetRenamedAccount slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @Schema(name = "slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public WebhookInstallationTargetRenamedAccount starredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
        return this;
    }

    /**
     * Get starredUrl
     * @return starredUrl
     */
    @Schema(name = "starred_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("starred_url")
    public String getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(String starredUrl) {
        this.starredUrl = starredUrl;
    }

    public WebhookInstallationTargetRenamedAccount subscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    /**
     * Get subscriptionsUrl
     * @return subscriptionsUrl
     */
    @Schema(name = "subscriptions_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscriptions_url")
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public WebhookInstallationTargetRenamedAccount type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public WebhookInstallationTargetRenamedAccount updatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhookInstallationTargetRenamedAccount url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebhookInstallationTargetRenamedAccount websiteUrl(@Nullable Object websiteUrl) {
        this.websiteUrl = websiteUrl;
        return this;
    }

    /**
     * Get websiteUrl
     * @return websiteUrl
     */
    @Schema(name = "website_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("website_url")
    public @Nullable Object getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(@Nullable Object websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public WebhookInstallationTargetRenamedAccount userViewType(String userViewType) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        WebhookInstallationTargetRenamedAccount webhookInstallationTargetRenamedAccount =
                (WebhookInstallationTargetRenamedAccount) o;
        return Objects.equals(this.archivedAt, webhookInstallationTargetRenamedAccount.archivedAt)
                && Objects.equals(this.avatarUrl, webhookInstallationTargetRenamedAccount.avatarUrl)
                && Objects.equals(this.createdAt, webhookInstallationTargetRenamedAccount.createdAt)
                && Objects.equals(this.description, webhookInstallationTargetRenamedAccount.description)
                && Objects.equals(this.eventsUrl, webhookInstallationTargetRenamedAccount.eventsUrl)
                && Objects.equals(this.followers, webhookInstallationTargetRenamedAccount.followers)
                && Objects.equals(this.followersUrl, webhookInstallationTargetRenamedAccount.followersUrl)
                && Objects.equals(this.following, webhookInstallationTargetRenamedAccount.following)
                && Objects.equals(this.followingUrl, webhookInstallationTargetRenamedAccount.followingUrl)
                && Objects.equals(this.gistsUrl, webhookInstallationTargetRenamedAccount.gistsUrl)
                && Objects.equals(this.gravatarId, webhookInstallationTargetRenamedAccount.gravatarId)
                && Objects.equals(
                        this.hasOrganizationProjects, webhookInstallationTargetRenamedAccount.hasOrganizationProjects)
                && Objects.equals(
                        this.hasRepositoryProjects, webhookInstallationTargetRenamedAccount.hasRepositoryProjects)
                && Objects.equals(this.hooksUrl, webhookInstallationTargetRenamedAccount.hooksUrl)
                && Objects.equals(this.htmlUrl, webhookInstallationTargetRenamedAccount.htmlUrl)
                && Objects.equals(this.id, webhookInstallationTargetRenamedAccount.id)
                && Objects.equals(this.isVerified, webhookInstallationTargetRenamedAccount.isVerified)
                && Objects.equals(this.issuesUrl, webhookInstallationTargetRenamedAccount.issuesUrl)
                && Objects.equals(this.login, webhookInstallationTargetRenamedAccount.login)
                && Objects.equals(this.membersUrl, webhookInstallationTargetRenamedAccount.membersUrl)
                && Objects.equals(this.name, webhookInstallationTargetRenamedAccount.name)
                && Objects.equals(this.nodeId, webhookInstallationTargetRenamedAccount.nodeId)
                && Objects.equals(this.organizationsUrl, webhookInstallationTargetRenamedAccount.organizationsUrl)
                && Objects.equals(this.publicGists, webhookInstallationTargetRenamedAccount.publicGists)
                && Objects.equals(this.publicMembersUrl, webhookInstallationTargetRenamedAccount.publicMembersUrl)
                && Objects.equals(this.publicRepos, webhookInstallationTargetRenamedAccount.publicRepos)
                && Objects.equals(this.receivedEventsUrl, webhookInstallationTargetRenamedAccount.receivedEventsUrl)
                && Objects.equals(this.reposUrl, webhookInstallationTargetRenamedAccount.reposUrl)
                && Objects.equals(this.siteAdmin, webhookInstallationTargetRenamedAccount.siteAdmin)
                && Objects.equals(this.slug, webhookInstallationTargetRenamedAccount.slug)
                && Objects.equals(this.starredUrl, webhookInstallationTargetRenamedAccount.starredUrl)
                && Objects.equals(this.subscriptionsUrl, webhookInstallationTargetRenamedAccount.subscriptionsUrl)
                && Objects.equals(this.type, webhookInstallationTargetRenamedAccount.type)
                && Objects.equals(this.updatedAt, webhookInstallationTargetRenamedAccount.updatedAt)
                && Objects.equals(this.url, webhookInstallationTargetRenamedAccount.url)
                && Objects.equals(this.websiteUrl, webhookInstallationTargetRenamedAccount.websiteUrl)
                && Objects.equals(this.userViewType, webhookInstallationTargetRenamedAccount.userViewType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                archivedAt,
                avatarUrl,
                createdAt,
                description,
                eventsUrl,
                followers,
                followersUrl,
                following,
                followingUrl,
                gistsUrl,
                gravatarId,
                hasOrganizationProjects,
                hasRepositoryProjects,
                hooksUrl,
                htmlUrl,
                id,
                isVerified,
                issuesUrl,
                login,
                membersUrl,
                name,
                nodeId,
                organizationsUrl,
                publicGists,
                publicMembersUrl,
                publicRepos,
                receivedEventsUrl,
                reposUrl,
                siteAdmin,
                slug,
                starredUrl,
                subscriptionsUrl,
                type,
                updatedAt,
                url,
                websiteUrl,
                userViewType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookInstallationTargetRenamedAccount {\n");
        sb.append("    archivedAt: ").append(toIndentedString(archivedAt)).append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    followers: ").append(toIndentedString(followers)).append("\n");
        sb.append("    followersUrl: ").append(toIndentedString(followersUrl)).append("\n");
        sb.append("    following: ").append(toIndentedString(following)).append("\n");
        sb.append("    followingUrl: ").append(toIndentedString(followingUrl)).append("\n");
        sb.append("    gistsUrl: ").append(toIndentedString(gistsUrl)).append("\n");
        sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
        sb.append("    hasOrganizationProjects: ")
                .append(toIndentedString(hasOrganizationProjects))
                .append("\n");
        sb.append("    hasRepositoryProjects: ")
                .append(toIndentedString(hasRepositoryProjects))
                .append("\n");
        sb.append("    hooksUrl: ").append(toIndentedString(hooksUrl)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
        sb.append("    issuesUrl: ").append(toIndentedString(issuesUrl)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    organizationsUrl: ")
                .append(toIndentedString(organizationsUrl))
                .append("\n");
        sb.append("    publicGists: ").append(toIndentedString(publicGists)).append("\n");
        sb.append("    publicMembersUrl: ")
                .append(toIndentedString(publicMembersUrl))
                .append("\n");
        sb.append("    publicRepos: ").append(toIndentedString(publicRepos)).append("\n");
        sb.append("    receivedEventsUrl: ")
                .append(toIndentedString(receivedEventsUrl))
                .append("\n");
        sb.append("    reposUrl: ").append(toIndentedString(reposUrl)).append("\n");
        sb.append("    siteAdmin: ").append(toIndentedString(siteAdmin)).append("\n");
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    starredUrl: ").append(toIndentedString(starredUrl)).append("\n");
        sb.append("    subscriptionsUrl: ")
                .append(toIndentedString(subscriptionsUrl))
                .append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    websiteUrl: ").append(toIndentedString(websiteUrl)).append("\n");
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
