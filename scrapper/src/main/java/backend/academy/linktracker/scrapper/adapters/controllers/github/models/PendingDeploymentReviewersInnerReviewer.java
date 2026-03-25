package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.net.URI;
import java.util.*;
import java.util.Objects;

/**
 * PendingDeploymentReviewersInnerReviewer
 */
@JsonTypeName("pending_deployment_reviewers_inner_reviewer")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class PendingDeploymentReviewersInnerReviewer {

    private String name;

    private String email = null;

    private String login;

    private Long id;

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

    private String starredAt;

    private String userViewType;

    private String slug;

    private String description = null;

    private String privacy;

    private String notificationSetting;

    private String permission;

    private TeamPermissions permissions;

    private String membersUrl;

    private URI repositoriesUrl;

    private Long organizationId;

    private Long enterpriseId;

    private NullableTeamSimple parent = null;

    public PendingDeploymentReviewersInnerReviewer() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public PendingDeploymentReviewersInnerReviewer(
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
            String description,
            String permission,
            String membersUrl,
            URI repositoriesUrl,
            NullableTeamSimple parent) {
        this.name = name;
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
        this.slug = slug;
        this.description = description;
        this.permission = permission;
        this.membersUrl = membersUrl;
        this.repositoriesUrl = repositoriesUrl;
        this.parent = parent;
    }

    public PendingDeploymentReviewersInnerReviewer name(String name) {
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

    public PendingDeploymentReviewersInnerReviewer email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Get email
     * @return email
     */
    @Schema(name = "email", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public PendingDeploymentReviewersInnerReviewer login(String login) {
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

    public PendingDeploymentReviewersInnerReviewer id(Long id) {
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

    public PendingDeploymentReviewersInnerReviewer nodeId(String nodeId) {
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

    public PendingDeploymentReviewersInnerReviewer avatarUrl(URI avatarUrl) {
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

    public PendingDeploymentReviewersInnerReviewer gravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
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
    public String getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(String gravatarId) {
        this.gravatarId = gravatarId;
    }

    public PendingDeploymentReviewersInnerReviewer url(URI url) {
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

    public PendingDeploymentReviewersInnerReviewer htmlUrl(URI htmlUrl) {
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
            example = "https://github.com/orgs/rails/teams/core",
            requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("html_url")
    public URI getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(URI htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public PendingDeploymentReviewersInnerReviewer followersUrl(URI followersUrl) {
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

    public PendingDeploymentReviewersInnerReviewer followingUrl(String followingUrl) {
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

    public PendingDeploymentReviewersInnerReviewer gistsUrl(String gistsUrl) {
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

    public PendingDeploymentReviewersInnerReviewer starredUrl(String starredUrl) {
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

    public PendingDeploymentReviewersInnerReviewer subscriptionsUrl(URI subscriptionsUrl) {
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

    public PendingDeploymentReviewersInnerReviewer organizationsUrl(URI organizationsUrl) {
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

    public PendingDeploymentReviewersInnerReviewer reposUrl(URI reposUrl) {
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

    public PendingDeploymentReviewersInnerReviewer eventsUrl(String eventsUrl) {
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

    public PendingDeploymentReviewersInnerReviewer receivedEventsUrl(URI receivedEventsUrl) {
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

    public PendingDeploymentReviewersInnerReviewer type(String type) {
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

    public PendingDeploymentReviewersInnerReviewer siteAdmin(Boolean siteAdmin) {
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

    public PendingDeploymentReviewersInnerReviewer starredAt(String starredAt) {
        this.starredAt = starredAt;
        return this;
    }

    /**
     * Get starredAt
     * @return starredAt
     */
    @Schema(name = "starred_at", example = "\"2020-07-09T00:17:55Z\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("starred_at")
    public String getStarredAt() {
        return starredAt;
    }

    public void setStarredAt(String starredAt) {
        this.starredAt = starredAt;
    }

    public PendingDeploymentReviewersInnerReviewer userViewType(String userViewType) {
        this.userViewType = userViewType;
        return this;
    }

    /**
     * Get userViewType
     * @return userViewType
     */
    @Schema(name = "user_view_type", example = "public", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("user_view_type")
    public String getUserViewType() {
        return userViewType;
    }

    public void setUserViewType(String userViewType) {
        this.userViewType = userViewType;
    }

    public PendingDeploymentReviewersInnerReviewer slug(String slug) {
        this.slug = slug;
        return this;
    }

    /**
     * Get slug
     * @return slug
     */
    @NotNull
    @Schema(name = "slug", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("slug")
    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public PendingDeploymentReviewersInnerReviewer description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @NotNull
    @Schema(name = "description", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PendingDeploymentReviewersInnerReviewer privacy(String privacy) {
        this.privacy = privacy;
        return this;
    }

    /**
     * Get privacy
     * @return privacy
     */
    @Schema(name = "privacy", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("privacy")
    public String getPrivacy() {
        return privacy;
    }

    public void setPrivacy(String privacy) {
        this.privacy = privacy;
    }

    public PendingDeploymentReviewersInnerReviewer notificationSetting(String notificationSetting) {
        this.notificationSetting = notificationSetting;
        return this;
    }

    /**
     * Get notificationSetting
     * @return notificationSetting
     */
    @Schema(name = "notification_setting", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("notification_setting")
    public String getNotificationSetting() {
        return notificationSetting;
    }

    public void setNotificationSetting(String notificationSetting) {
        this.notificationSetting = notificationSetting;
    }

    public PendingDeploymentReviewersInnerReviewer permission(String permission) {
        this.permission = permission;
        return this;
    }

    /**
     * Get permission
     * @return permission
     */
    @NotNull
    @Schema(name = "permission", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("permission")
    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public PendingDeploymentReviewersInnerReviewer permissions(TeamPermissions permissions) {
        this.permissions = permissions;
        return this;
    }

    /**
     * Get permissions
     * @return permissions
     */
    @Valid
    @Schema(name = "permissions", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("permissions")
    public TeamPermissions getPermissions() {
        return permissions;
    }

    public void setPermissions(TeamPermissions permissions) {
        this.permissions = permissions;
    }

    public PendingDeploymentReviewersInnerReviewer membersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
        return this;
    }

    /**
     * Get membersUrl
     * @return membersUrl
     */
    @NotNull
    @Schema(name = "members_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("members_url")
    public String getMembersUrl() {
        return membersUrl;
    }

    public void setMembersUrl(String membersUrl) {
        this.membersUrl = membersUrl;
    }

    public PendingDeploymentReviewersInnerReviewer repositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
        return this;
    }

    /**
     * Get repositoriesUrl
     * @return repositoriesUrl
     */
    @NotNull
    @Valid
    @Schema(name = "repositories_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repositories_url")
    public URI getRepositoriesUrl() {
        return repositoriesUrl;
    }

    public void setRepositoriesUrl(URI repositoriesUrl) {
        this.repositoriesUrl = repositoriesUrl;
    }

    public PendingDeploymentReviewersInnerReviewer organizationId(Long organizationId) {
        this.organizationId = organizationId;
        return this;
    }

    /**
     * Unique identifier of the organization to which this team belongs
     * @return organizationId
     */
    @Schema(
            name = "organization_id",
            example = "37",
            description = "Unique identifier of the organization to which this team belongs",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organization_id")
    public Long getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Long organizationId) {
        this.organizationId = organizationId;
    }

    public PendingDeploymentReviewersInnerReviewer enterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
        return this;
    }

    /**
     * Unique identifier of the enterprise to which this team belongs
     * @return enterpriseId
     */
    @Schema(
            name = "enterprise_id",
            example = "42",
            description = "Unique identifier of the enterprise to which this team belongs",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("enterprise_id")
    public Long getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(Long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public PendingDeploymentReviewersInnerReviewer parent(NullableTeamSimple parent) {
        this.parent = parent;
        return this;
    }

    /**
     * Get parent
     * @return parent
     */
    @NotNull
    @Valid
    @Schema(name = "parent", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("parent")
    public NullableTeamSimple getParent() {
        return parent;
    }

    public void setParent(NullableTeamSimple parent) {
        this.parent = parent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PendingDeploymentReviewersInnerReviewer pendingDeploymentReviewersInnerReviewer =
                (PendingDeploymentReviewersInnerReviewer) o;
        return Objects.equals(this.name, pendingDeploymentReviewersInnerReviewer.name)
                && Objects.equals(this.email, pendingDeploymentReviewersInnerReviewer.email)
                && Objects.equals(this.login, pendingDeploymentReviewersInnerReviewer.login)
                && Objects.equals(this.id, pendingDeploymentReviewersInnerReviewer.id)
                && Objects.equals(this.nodeId, pendingDeploymentReviewersInnerReviewer.nodeId)
                && Objects.equals(this.avatarUrl, pendingDeploymentReviewersInnerReviewer.avatarUrl)
                && Objects.equals(this.gravatarId, pendingDeploymentReviewersInnerReviewer.gravatarId)
                && Objects.equals(this.url, pendingDeploymentReviewersInnerReviewer.url)
                && Objects.equals(this.htmlUrl, pendingDeploymentReviewersInnerReviewer.htmlUrl)
                && Objects.equals(this.followersUrl, pendingDeploymentReviewersInnerReviewer.followersUrl)
                && Objects.equals(this.followingUrl, pendingDeploymentReviewersInnerReviewer.followingUrl)
                && Objects.equals(this.gistsUrl, pendingDeploymentReviewersInnerReviewer.gistsUrl)
                && Objects.equals(this.starredUrl, pendingDeploymentReviewersInnerReviewer.starredUrl)
                && Objects.equals(this.subscriptionsUrl, pendingDeploymentReviewersInnerReviewer.subscriptionsUrl)
                && Objects.equals(this.organizationsUrl, pendingDeploymentReviewersInnerReviewer.organizationsUrl)
                && Objects.equals(this.reposUrl, pendingDeploymentReviewersInnerReviewer.reposUrl)
                && Objects.equals(this.eventsUrl, pendingDeploymentReviewersInnerReviewer.eventsUrl)
                && Objects.equals(this.receivedEventsUrl, pendingDeploymentReviewersInnerReviewer.receivedEventsUrl)
                && Objects.equals(this.type, pendingDeploymentReviewersInnerReviewer.type)
                && Objects.equals(this.siteAdmin, pendingDeploymentReviewersInnerReviewer.siteAdmin)
                && Objects.equals(this.starredAt, pendingDeploymentReviewersInnerReviewer.starredAt)
                && Objects.equals(this.userViewType, pendingDeploymentReviewersInnerReviewer.userViewType)
                && Objects.equals(this.slug, pendingDeploymentReviewersInnerReviewer.slug)
                && Objects.equals(this.description, pendingDeploymentReviewersInnerReviewer.description)
                && Objects.equals(this.privacy, pendingDeploymentReviewersInnerReviewer.privacy)
                && Objects.equals(this.notificationSetting, pendingDeploymentReviewersInnerReviewer.notificationSetting)
                && Objects.equals(this.permission, pendingDeploymentReviewersInnerReviewer.permission)
                && Objects.equals(this.permissions, pendingDeploymentReviewersInnerReviewer.permissions)
                && Objects.equals(this.membersUrl, pendingDeploymentReviewersInnerReviewer.membersUrl)
                && Objects.equals(this.repositoriesUrl, pendingDeploymentReviewersInnerReviewer.repositoriesUrl)
                && Objects.equals(this.organizationId, pendingDeploymentReviewersInnerReviewer.organizationId)
                && Objects.equals(this.enterpriseId, pendingDeploymentReviewersInnerReviewer.enterpriseId)
                && Objects.equals(this.parent, pendingDeploymentReviewersInnerReviewer.parent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                name,
                email,
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
                slug,
                description,
                privacy,
                notificationSetting,
                permission,
                permissions,
                membersUrl,
                repositoriesUrl,
                organizationId,
                enterpriseId,
                parent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PendingDeploymentReviewersInnerReviewer {\n");
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
        sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    privacy: ").append(toIndentedString(privacy)).append("\n");
        sb.append("    notificationSetting: ")
                .append(toIndentedString(notificationSetting))
                .append("\n");
        sb.append("    permission: ").append(toIndentedString(permission)).append("\n");
        sb.append("    permissions: ").append(toIndentedString(permissions)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    repositoriesUrl: ")
                .append(toIndentedString(repositoriesUrl))
                .append("\n");
        sb.append("    organizationId: ")
                .append(toIndentedString(organizationId))
                .append("\n");
        sb.append("    enterpriseId: ").append(toIndentedString(enterpriseId)).append("\n");
        sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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
