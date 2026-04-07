package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * BranchRestrictionPolicyUsersInner
 */
@JsonTypeName("branch_restriction_policy_users_inner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchRestrictionPolicyUsersInner {

    private Optional<String> login = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> avatarUrl = Optional.empty();

    private Optional<String> gravatarId = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private Optional<String> followersUrl = Optional.empty();

    private Optional<String> followingUrl = Optional.empty();

    private Optional<String> gistsUrl = Optional.empty();

    private Optional<String> starredUrl = Optional.empty();

    private Optional<String> subscriptionsUrl = Optional.empty();

    private Optional<String> organizationsUrl = Optional.empty();

    private Optional<String> reposUrl = Optional.empty();

    private Optional<String> eventsUrl = Optional.empty();

    private Optional<String> receivedEventsUrl = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<Boolean> siteAdmin = Optional.empty();

    private Optional<String> userViewType = Optional.empty();

    public BranchRestrictionPolicyUsersInner login(String login) {
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

    public BranchRestrictionPolicyUsersInner id(Long id) {
        this.id = Optional.ofNullable(id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    @Schema(name = "id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("id")
    public Optional<Long> getId() {
        return id;
    }

    public void setId(Optional<Long> id) {
        this.id = id;
    }

    public BranchRestrictionPolicyUsersInner nodeId(String nodeId) {
        this.nodeId = Optional.ofNullable(nodeId);
        return this;
    }

    /**
     * Get nodeId
     * @return nodeId
     */
    @Schema(name = "node_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("node_id")
    public Optional<String> getNodeId() {
        return nodeId;
    }

    public void setNodeId(Optional<String> nodeId) {
        this.nodeId = nodeId;
    }

    public BranchRestrictionPolicyUsersInner avatarUrl(String avatarUrl) {
        this.avatarUrl = Optional.ofNullable(avatarUrl);
        return this;
    }

    /**
     * Get avatarUrl
     * @return avatarUrl
     */
    @Schema(name = "avatar_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("avatar_url")
    public Optional<String> getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(Optional<String> avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public BranchRestrictionPolicyUsersInner gravatarId(String gravatarId) {
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

    public BranchRestrictionPolicyUsersInner url(String url) {
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

    public BranchRestrictionPolicyUsersInner htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(name = "html_url", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public BranchRestrictionPolicyUsersInner followersUrl(String followersUrl) {
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

    public BranchRestrictionPolicyUsersInner followingUrl(String followingUrl) {
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

    public BranchRestrictionPolicyUsersInner gistsUrl(String gistsUrl) {
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

    public BranchRestrictionPolicyUsersInner starredUrl(String starredUrl) {
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

    public BranchRestrictionPolicyUsersInner subscriptionsUrl(String subscriptionsUrl) {
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

    public BranchRestrictionPolicyUsersInner organizationsUrl(String organizationsUrl) {
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

    public BranchRestrictionPolicyUsersInner reposUrl(String reposUrl) {
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

    public BranchRestrictionPolicyUsersInner eventsUrl(String eventsUrl) {
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

    public BranchRestrictionPolicyUsersInner receivedEventsUrl(String receivedEventsUrl) {
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

    public BranchRestrictionPolicyUsersInner type(String type) {
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

    public BranchRestrictionPolicyUsersInner siteAdmin(Boolean siteAdmin) {
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

    public BranchRestrictionPolicyUsersInner userViewType(String userViewType) {
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
        BranchRestrictionPolicyUsersInner branchRestrictionPolicyUsersInner = (BranchRestrictionPolicyUsersInner) o;
        return Objects.equals(this.login, branchRestrictionPolicyUsersInner.login)
                && Objects.equals(this.id, branchRestrictionPolicyUsersInner.id)
                && Objects.equals(this.nodeId, branchRestrictionPolicyUsersInner.nodeId)
                && Objects.equals(this.avatarUrl, branchRestrictionPolicyUsersInner.avatarUrl)
                && Objects.equals(this.gravatarId, branchRestrictionPolicyUsersInner.gravatarId)
                && Objects.equals(this.url, branchRestrictionPolicyUsersInner.url)
                && Objects.equals(this.htmlUrl, branchRestrictionPolicyUsersInner.htmlUrl)
                && Objects.equals(this.followersUrl, branchRestrictionPolicyUsersInner.followersUrl)
                && Objects.equals(this.followingUrl, branchRestrictionPolicyUsersInner.followingUrl)
                && Objects.equals(this.gistsUrl, branchRestrictionPolicyUsersInner.gistsUrl)
                && Objects.equals(this.starredUrl, branchRestrictionPolicyUsersInner.starredUrl)
                && Objects.equals(this.subscriptionsUrl, branchRestrictionPolicyUsersInner.subscriptionsUrl)
                && Objects.equals(this.organizationsUrl, branchRestrictionPolicyUsersInner.organizationsUrl)
                && Objects.equals(this.reposUrl, branchRestrictionPolicyUsersInner.reposUrl)
                && Objects.equals(this.eventsUrl, branchRestrictionPolicyUsersInner.eventsUrl)
                && Objects.equals(this.receivedEventsUrl, branchRestrictionPolicyUsersInner.receivedEventsUrl)
                && Objects.equals(this.type, branchRestrictionPolicyUsersInner.type)
                && Objects.equals(this.siteAdmin, branchRestrictionPolicyUsersInner.siteAdmin)
                && Objects.equals(this.userViewType, branchRestrictionPolicyUsersInner.userViewType);
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
                userViewType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchRestrictionPolicyUsersInner {\n");
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
