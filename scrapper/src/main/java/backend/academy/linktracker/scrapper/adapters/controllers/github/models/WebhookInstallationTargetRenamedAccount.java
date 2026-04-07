package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Arrays;
import java.util.Objects;
import java.util.Optional;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * WebhookInstallationTargetRenamedAccount
 */
@JsonTypeName("webhook_installation_target_renamed_account")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookInstallationTargetRenamedAccount {

    private JsonNullable<String> archivedAt = JsonNullable.<String>undefined();

    private String avatarUrl;

    private Optional<String> createdAt = Optional.empty();

    private JsonNullable<Object> description = JsonNullable.<Object>undefined();

    private Optional<String> eventsUrl = Optional.empty();

    private Optional<Long> followers = Optional.empty();

    private Optional<String> followersUrl = Optional.empty();

    private Optional<Long> following = Optional.empty();

    private Optional<String> followingUrl = Optional.empty();

    private Optional<String> gistsUrl = Optional.empty();

    private Optional<String> gravatarId = Optional.empty();

    private Optional<Boolean> hasOrganizationProjects = Optional.empty();

    private Optional<Boolean> hasRepositoryProjects = Optional.empty();

    private Optional<String> hooksUrl = Optional.empty();

    private String htmlUrl;

    private Long id;

    private Optional<Boolean> isVerified = Optional.empty();

    private Optional<String> issuesUrl = Optional.empty();

    private Optional<String> login = Optional.empty();

    private Optional<String> membersUrl = Optional.empty();

    private Optional<String> name = Optional.empty();

    private String nodeId;

    private Optional<String> organizationsUrl = Optional.empty();

    private Optional<Long> publicGists = Optional.empty();

    private Optional<String> publicMembersUrl = Optional.empty();

    private Optional<Long> publicRepos = Optional.empty();

    private Optional<String> receivedEventsUrl = Optional.empty();

    private Optional<String> reposUrl = Optional.empty();

    private Optional<Boolean> siteAdmin = Optional.empty();

    private Optional<String> slug = Optional.empty();

    private Optional<String> starredUrl = Optional.empty();

    private Optional<String> subscriptionsUrl = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> updatedAt = Optional.empty();

    private Optional<String> url = Optional.empty();

    private JsonNullable<Object> websiteUrl = JsonNullable.<Object>undefined();

    private Optional<String> userViewType = Optional.empty();

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
        this.archivedAt = JsonNullable.of(archivedAt);
        return this;
    }

    /**
     * Get archivedAt
     * @return archivedAt
     */
    @Schema(name = "archived_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("archived_at")
    public JsonNullable<String> getArchivedAt() {
        return archivedAt;
    }

    public void setArchivedAt(JsonNullable<String> archivedAt) {
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
        this.createdAt = Optional.ofNullable(createdAt);
        return this;
    }

    /**
     * Get createdAt
     * @return createdAt
     */
    @Schema(name = "created_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("created_at")
    public Optional<String> getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Optional<String> createdAt) {
        this.createdAt = createdAt;
    }

    public WebhookInstallationTargetRenamedAccount description(Object description) {
        this.description = JsonNullable.of(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public JsonNullable<Object> getDescription() {
        return description;
    }

    public void setDescription(JsonNullable<Object> description) {
        this.description = description;
    }

    public WebhookInstallationTargetRenamedAccount eventsUrl(String eventsUrl) {
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

    public WebhookInstallationTargetRenamedAccount followers(Long followers) {
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

    public WebhookInstallationTargetRenamedAccount followersUrl(String followersUrl) {
        this.followersUrl = Optional.ofNullable(followersUrl);
        return this;
    }

    /**
     * Get followersUrl
     * @return followersUrl
     */
    @Schema(name = "followers_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("followers_url")
    public Optional<String> getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(Optional<String> followersUrl) {
        this.followersUrl = followersUrl;
    }

    public WebhookInstallationTargetRenamedAccount following(Long following) {
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

    public WebhookInstallationTargetRenamedAccount followingUrl(String followingUrl) {
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

    public WebhookInstallationTargetRenamedAccount gistsUrl(String gistsUrl) {
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

    public WebhookInstallationTargetRenamedAccount gravatarId(String gravatarId) {
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

    public WebhookInstallationTargetRenamedAccount hasOrganizationProjects(Boolean hasOrganizationProjects) {
        this.hasOrganizationProjects = Optional.ofNullable(hasOrganizationProjects);
        return this;
    }

    /**
     * Get hasOrganizationProjects
     * @return hasOrganizationProjects
     */
    @Schema(name = "has_organization_projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_organization_projects")
    public Optional<Boolean> getHasOrganizationProjects() {
        return hasOrganizationProjects;
    }

    public void setHasOrganizationProjects(Optional<Boolean> hasOrganizationProjects) {
        this.hasOrganizationProjects = hasOrganizationProjects;
    }

    public WebhookInstallationTargetRenamedAccount hasRepositoryProjects(Boolean hasRepositoryProjects) {
        this.hasRepositoryProjects = Optional.ofNullable(hasRepositoryProjects);
        return this;
    }

    /**
     * Get hasRepositoryProjects
     * @return hasRepositoryProjects
     */
    @Schema(name = "has_repository_projects", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("has_repository_projects")
    public Optional<Boolean> getHasRepositoryProjects() {
        return hasRepositoryProjects;
    }

    public void setHasRepositoryProjects(Optional<Boolean> hasRepositoryProjects) {
        this.hasRepositoryProjects = hasRepositoryProjects;
    }

    public WebhookInstallationTargetRenamedAccount hooksUrl(String hooksUrl) {
        this.hooksUrl = Optional.ofNullable(hooksUrl);
        return this;
    }

    /**
     * Get hooksUrl
     * @return hooksUrl
     */
    @Schema(name = "hooks_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("hooks_url")
    public Optional<String> getHooksUrl() {
        return hooksUrl;
    }

    public void setHooksUrl(Optional<String> hooksUrl) {
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
        this.isVerified = Optional.ofNullable(isVerified);
        return this;
    }

    /**
     * Get isVerified
     * @return isVerified
     */
    @Schema(name = "is_verified", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("is_verified")
    public Optional<Boolean> getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Optional<Boolean> isVerified) {
        this.isVerified = isVerified;
    }

    public WebhookInstallationTargetRenamedAccount issuesUrl(String issuesUrl) {
        this.issuesUrl = Optional.ofNullable(issuesUrl);
        return this;
    }

    /**
     * Get issuesUrl
     * @return issuesUrl
     */
    @Schema(name = "issues_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("issues_url")
    public Optional<String> getIssuesUrl() {
        return issuesUrl;
    }

    public void setIssuesUrl(Optional<String> issuesUrl) {
        this.issuesUrl = issuesUrl;
    }

    public WebhookInstallationTargetRenamedAccount login(String login) {
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

    public WebhookInstallationTargetRenamedAccount membersUrl(String membersUrl) {
        this.membersUrl = Optional.ofNullable(membersUrl);
        return this;
    }

    /**
     * Get membersUrl
     * @return membersUrl
     */
    @Schema(name = "members_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("members_url")
    public Optional<String> getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(Optional<String> membersUrl) {
        this.membersUrl = membersUrl;
    }

    public WebhookInstallationTargetRenamedAccount name(String name) {
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
        this.organizationsUrl = Optional.ofNullable(organizationsUrl);
        return this;
    }

    /**
     * Get organizationsUrl
     * @return organizationsUrl
     */
    @Schema(name = "organizations_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organizations_url")
    public Optional<String> getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(Optional<String> organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public WebhookInstallationTargetRenamedAccount publicGists(Long publicGists) {
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

    public WebhookInstallationTargetRenamedAccount publicMembersUrl(String publicMembersUrl) {
        this.publicMembersUrl = Optional.ofNullable(publicMembersUrl);
        return this;
    }

    /**
     * Get publicMembersUrl
     * @return publicMembersUrl
     */
    @Schema(name = "public_members_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("public_members_url")
    public Optional<String> getPublicMembersUrl() {
        return publicMembersUrl;
    }

    public void setPublicMembersUrl(Optional<String> publicMembersUrl) {
        this.publicMembersUrl = publicMembersUrl;
    }

    public WebhookInstallationTargetRenamedAccount publicRepos(Long publicRepos) {
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

    public WebhookInstallationTargetRenamedAccount receivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = Optional.ofNullable(receivedEventsUrl);
        return this;
    }

    /**
     * Get receivedEventsUrl
     * @return receivedEventsUrl
     */
    @Schema(name = "received_events_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("received_events_url")
    public Optional<String> getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(Optional<String> receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public WebhookInstallationTargetRenamedAccount reposUrl(String reposUrl) {
        this.reposUrl = Optional.ofNullable(reposUrl);
        return this;
    }

    /**
     * Get reposUrl
     * @return reposUrl
     */
    @Schema(name = "repos_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("repos_url")
    public Optional<String> getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(Optional<String> reposUrl) {
        this.reposUrl = reposUrl;
    }

    public WebhookInstallationTargetRenamedAccount siteAdmin(Boolean siteAdmin) {
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

    public WebhookInstallationTargetRenamedAccount slug(String slug) {
        this.slug = Optional.ofNullable(slug);
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @Schema(name = "slug", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("slug")
    public Optional<String> getSlug() {
        return slug;
    }

    public void setSlug(Optional<String> slug) {
        this.slug = slug;
    }

    public WebhookInstallationTargetRenamedAccount starredUrl(String starredUrl) {
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

    public WebhookInstallationTargetRenamedAccount subscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = Optional.ofNullable(subscriptionsUrl);
        return this;
    }

    /**
     * Get subscriptionsUrl
     * @return subscriptionsUrl
     */
    @Schema(name = "subscriptions_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscriptions_url")
    public Optional<String> getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(Optional<String> subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public WebhookInstallationTargetRenamedAccount type(String type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    public WebhookInstallationTargetRenamedAccount updatedAt(String updatedAt) {
        this.updatedAt = Optional.ofNullable(updatedAt);
        return this;
    }

    /**
     * Get updatedAt
     * @return updatedAt
     */
    @Schema(name = "updated_at", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("updated_at")
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Optional<String> updatedAt) {
        this.updatedAt = updatedAt;
    }

    public WebhookInstallationTargetRenamedAccount url(String url) {
        this.url = Optional.ofNullable(url);
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @Schema(name = "url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("url")
    public Optional<String> getUrl() {
        return url;
    }

    public void setUrl(Optional<String> url) {
        this.url = url;
    }

    public WebhookInstallationTargetRenamedAccount websiteUrl(Object websiteUrl) {
        this.websiteUrl = JsonNullable.of(websiteUrl);
        return this;
    }

    /**
     * Get websiteUrl
     * @return websiteUrl
     */
    @Schema(name = "website_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("website_url")
    public JsonNullable<Object> getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(JsonNullable<Object> websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    public WebhookInstallationTargetRenamedAccount userViewType(String userViewType) {
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
        WebhookInstallationTargetRenamedAccount webhookInstallationTargetRenamedAccount =
                (WebhookInstallationTargetRenamedAccount) o;
        return equalsNullable(this.archivedAt, webhookInstallationTargetRenamedAccount.archivedAt)
                && Objects.equals(this.avatarUrl, webhookInstallationTargetRenamedAccount.avatarUrl)
                && Objects.equals(this.createdAt, webhookInstallationTargetRenamedAccount.createdAt)
                && equalsNullable(this.description, webhookInstallationTargetRenamedAccount.description)
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
                && equalsNullable(this.websiteUrl, webhookInstallationTargetRenamedAccount.websiteUrl)
                && Objects.equals(this.userViewType, webhookInstallationTargetRenamedAccount.userViewType);
    }

    private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
        return a == b
                || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                hashCodeNullable(archivedAt),
                avatarUrl,
                createdAt,
                hashCodeNullable(description),
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
                hashCodeNullable(websiteUrl),
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
