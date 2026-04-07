package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import jakarta.validation.constraints.NotNull;
import java.util.Objects;
import java.util.Optional;

/**
 * WebhookRegistryPackagePublishedRegistryPackageOwner
 */
@JsonTypeName("webhook_registry_package_published_registry_package_owner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class WebhookRegistryPackagePublishedRegistryPackageOwner {

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

    private Optional<String> userViewType = Optional.empty();

    public WebhookRegistryPackagePublishedRegistryPackageOwner() {
        super();
    }

    /**
     * Constructor with only required parameters
     */
    public WebhookRegistryPackagePublishedRegistryPackageOwner(
            String avatarUrl,
            String eventsUrl,
            String followersUrl,
            String followingUrl,
            String gistsUrl,
            String gravatarId,
            String htmlUrl,
            Long id,
            String login,
            String nodeId,
            String organizationsUrl,
            String receivedEventsUrl,
            String reposUrl,
            Boolean siteAdmin,
            String starredUrl,
            String subscriptionsUrl,
            String type,
            String url) {
        this.avatarUrl = avatarUrl;
        this.eventsUrl = eventsUrl;
        this.followersUrl = followersUrl;
        this.followingUrl = followingUrl;
        this.gistsUrl = gistsUrl;
        this.gravatarId = gravatarId;
        this.htmlUrl = htmlUrl;
        this.id = id;
        this.login = login;
        this.nodeId = nodeId;
        this.organizationsUrl = organizationsUrl;
        this.receivedEventsUrl = receivedEventsUrl;
        this.reposUrl = reposUrl;
        this.siteAdmin = siteAdmin;
        this.starredUrl = starredUrl;
        this.subscriptionsUrl = subscriptionsUrl;
        this.type = type;
        this.url = url;
    }

    public WebhookRegistryPackagePublishedRegistryPackageOwner avatarUrl(String avatarUrl) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner eventsUrl(String eventsUrl) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner followersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
        return this;
    }

    /**
     * Get followersUrl
     * @return followersUrl
     */
    @NotNull
    @Schema(name = "followers_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("followers_url")
    public String getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(String followersUrl) {
        this.followersUrl = followersUrl;
    }

    public WebhookRegistryPackagePublishedRegistryPackageOwner followingUrl(String followingUrl) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner gistsUrl(String gistsUrl) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner gravatarId(String gravatarId) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner htmlUrl(String htmlUrl) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner id(Long id) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner login(String login) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner nodeId(String nodeId) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner organizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
        return this;
    }

    /**
     * Get organizationsUrl
     * @return organizationsUrl
     */
    @NotNull
    @Schema(name = "organizations_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("organizations_url")
    public String getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(String organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public WebhookRegistryPackagePublishedRegistryPackageOwner receivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
        return this;
    }

    /**
     * Get receivedEventsUrl
     * @return receivedEventsUrl
     */
    @NotNull
    @Schema(name = "received_events_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("received_events_url")
    public String getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public WebhookRegistryPackagePublishedRegistryPackageOwner reposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
        return this;
    }

    /**
     * Get reposUrl
     * @return reposUrl
     */
    @NotNull
    @Schema(name = "repos_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("repos_url")
    public String getReposUrl() {
        return reposUrl;
    }

    public void setReposUrl(String reposUrl) {
        this.reposUrl = reposUrl;
    }

    public WebhookRegistryPackagePublishedRegistryPackageOwner siteAdmin(Boolean siteAdmin) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner starredUrl(String starredUrl) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner subscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
        return this;
    }

    /**
     * Get subscriptionsUrl
     * @return subscriptionsUrl
     */
    @NotNull
    @Schema(name = "subscriptions_url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("subscriptions_url")
    public String getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public WebhookRegistryPackagePublishedRegistryPackageOwner type(String type) {
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

    public WebhookRegistryPackagePublishedRegistryPackageOwner url(String url) {
        this.url = url;
        return this;
    }

    /**
     * Get url
     * @return url
     */
    @NotNull
    @Schema(name = "url", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WebhookRegistryPackagePublishedRegistryPackageOwner userViewType(String userViewType) {
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
        WebhookRegistryPackagePublishedRegistryPackageOwner webhookRegistryPackagePublishedRegistryPackageOwner =
                (WebhookRegistryPackagePublishedRegistryPackageOwner) o;
        return Objects.equals(this.avatarUrl, webhookRegistryPackagePublishedRegistryPackageOwner.avatarUrl)
                && Objects.equals(this.eventsUrl, webhookRegistryPackagePublishedRegistryPackageOwner.eventsUrl)
                && Objects.equals(this.followersUrl, webhookRegistryPackagePublishedRegistryPackageOwner.followersUrl)
                && Objects.equals(this.followingUrl, webhookRegistryPackagePublishedRegistryPackageOwner.followingUrl)
                && Objects.equals(this.gistsUrl, webhookRegistryPackagePublishedRegistryPackageOwner.gistsUrl)
                && Objects.equals(this.gravatarId, webhookRegistryPackagePublishedRegistryPackageOwner.gravatarId)
                && Objects.equals(this.htmlUrl, webhookRegistryPackagePublishedRegistryPackageOwner.htmlUrl)
                && Objects.equals(this.id, webhookRegistryPackagePublishedRegistryPackageOwner.id)
                && Objects.equals(this.login, webhookRegistryPackagePublishedRegistryPackageOwner.login)
                && Objects.equals(this.nodeId, webhookRegistryPackagePublishedRegistryPackageOwner.nodeId)
                && Objects.equals(
                        this.organizationsUrl, webhookRegistryPackagePublishedRegistryPackageOwner.organizationsUrl)
                && Objects.equals(
                        this.receivedEventsUrl, webhookRegistryPackagePublishedRegistryPackageOwner.receivedEventsUrl)
                && Objects.equals(this.reposUrl, webhookRegistryPackagePublishedRegistryPackageOwner.reposUrl)
                && Objects.equals(this.siteAdmin, webhookRegistryPackagePublishedRegistryPackageOwner.siteAdmin)
                && Objects.equals(this.starredUrl, webhookRegistryPackagePublishedRegistryPackageOwner.starredUrl)
                && Objects.equals(
                        this.subscriptionsUrl, webhookRegistryPackagePublishedRegistryPackageOwner.subscriptionsUrl)
                && Objects.equals(this.type, webhookRegistryPackagePublishedRegistryPackageOwner.type)
                && Objects.equals(this.url, webhookRegistryPackagePublishedRegistryPackageOwner.url)
                && Objects.equals(this.userViewType, webhookRegistryPackagePublishedRegistryPackageOwner.userViewType);
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
        sb.append("class WebhookRegistryPackagePublishedRegistryPackageOwner {\n");
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
