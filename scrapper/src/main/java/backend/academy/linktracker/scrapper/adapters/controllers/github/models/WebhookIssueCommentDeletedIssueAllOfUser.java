package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.*;
import java.util.*;
import java.util.Objects;

/**
 * WebhookIssueCommentDeletedIssueAllOfUser
 */
@JsonTypeName("webhook_issue_comment_deleted_issue_allOf_user")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-03-23T19:30:01.508827706Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookIssueCommentDeletedIssueAllOfUser {

    private String avatarUrl;

    private String eventsUrl;

    private String followersUrl;

    private String followingUrl;

    private String gistsUrl;

    private String gravatarId;

    private String htmlUrl;

    private Long id;

    private String login;

    private String nodeId;

    private String organizationsUrl;

    private String receivedEventsUrl;

    private String reposUrl;

    private Boolean siteAdmin;

    private String starredUrl;

    private String subscriptionsUrl;

    private String type;

    private String url;

    private String userViewType;

    public WebhookIssueCommentDeletedIssueAllOfUser avatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("avatar_url")
    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public WebhookIssueCommentDeletedIssueAllOfUser eventsUrl(String eventsUrl) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser followersUrl(String followersUrl) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser followingUrl(String followingUrl) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser gistsUrl(String gistsUrl) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser gravatarId(String gravatarId) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser htmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public String getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(String htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public WebhookIssueCommentDeletedIssueAllOfUser id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public WebhookIssueCommentDeletedIssueAllOfUser login(String login) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser nodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public WebhookIssueCommentDeletedIssueAllOfUser organizationsUrl(String organizationsUrl) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser receivedEventsUrl(String receivedEventsUrl) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser reposUrl(String reposUrl) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser siteAdmin(Boolean siteAdmin) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser starredUrl(String starredUrl) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser subscriptionsUrl(String subscriptionsUrl) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser type(String type) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser url(String url) {
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

    public WebhookIssueCommentDeletedIssueAllOfUser userViewType(String userViewType) {
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
        WebhookIssueCommentDeletedIssueAllOfUser webhookIssueCommentDeletedIssueAllOfUser =
                (WebhookIssueCommentDeletedIssueAllOfUser) o;
        return Objects.equals(this.avatarUrl, webhookIssueCommentDeletedIssueAllOfUser.avatarUrl)
                && Objects.equals(this.eventsUrl, webhookIssueCommentDeletedIssueAllOfUser.eventsUrl)
                && Objects.equals(this.followersUrl, webhookIssueCommentDeletedIssueAllOfUser.followersUrl)
                && Objects.equals(this.followingUrl, webhookIssueCommentDeletedIssueAllOfUser.followingUrl)
                && Objects.equals(this.gistsUrl, webhookIssueCommentDeletedIssueAllOfUser.gistsUrl)
                && Objects.equals(this.gravatarId, webhookIssueCommentDeletedIssueAllOfUser.gravatarId)
                && Objects.equals(this.htmlUrl, webhookIssueCommentDeletedIssueAllOfUser.htmlUrl)
                && Objects.equals(this.id, webhookIssueCommentDeletedIssueAllOfUser.id)
                && Objects.equals(this.login, webhookIssueCommentDeletedIssueAllOfUser.login)
                && Objects.equals(this.nodeId, webhookIssueCommentDeletedIssueAllOfUser.nodeId)
                && Objects.equals(this.organizationsUrl, webhookIssueCommentDeletedIssueAllOfUser.organizationsUrl)
                && Objects.equals(this.receivedEventsUrl, webhookIssueCommentDeletedIssueAllOfUser.receivedEventsUrl)
                && Objects.equals(this.reposUrl, webhookIssueCommentDeletedIssueAllOfUser.reposUrl)
                && Objects.equals(this.siteAdmin, webhookIssueCommentDeletedIssueAllOfUser.siteAdmin)
                && Objects.equals(this.starredUrl, webhookIssueCommentDeletedIssueAllOfUser.starredUrl)
                && Objects.equals(this.subscriptionsUrl, webhookIssueCommentDeletedIssueAllOfUser.subscriptionsUrl)
                && Objects.equals(this.type, webhookIssueCommentDeletedIssueAllOfUser.type)
                && Objects.equals(this.url, webhookIssueCommentDeletedIssueAllOfUser.url)
                && Objects.equals(this.userViewType, webhookIssueCommentDeletedIssueAllOfUser.userViewType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                avatarUrl,
                eventsUrl,
                followersUrl,
                followingUrl,
                gistsUrl,
                gravatarId,
                htmlUrl,
                id,
                login,
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebhookIssueCommentDeletedIssueAllOfUser {\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    followersUrl: ").append(toIndentedString(followersUrl)).append("\n");
        sb.append("    followingUrl: ").append(toIndentedString(followingUrl)).append("\n");
        sb.append("    gistsUrl: ").append(toIndentedString(gistsUrl)).append("\n");
        sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
        sb.append("    htmlUrl: ").append(toIndentedString(htmlUrl)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
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
