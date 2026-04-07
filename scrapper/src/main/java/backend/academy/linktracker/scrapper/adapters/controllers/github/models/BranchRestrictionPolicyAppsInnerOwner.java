package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * BranchRestrictionPolicyAppsInnerOwner
 */
@JsonTypeName("branch_restriction_policy_apps_inner_owner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class BranchRestrictionPolicyAppsInnerOwner {

    private Optional<String> login = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> url = Optional.empty();

    private Optional<String> reposUrl = Optional.empty();

    private Optional<String> eventsUrl = Optional.empty();

    private Optional<String> hooksUrl = Optional.empty();

    private Optional<String> issuesUrl = Optional.empty();

    private Optional<String> membersUrl = Optional.empty();

    private Optional<String> publicMembersUrl = Optional.empty();

    private Optional<String> avatarUrl = Optional.empty();

    private Optional<String> description = Optional.empty();

    private Optional<String> gravatarId = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private Optional<String> followersUrl = Optional.empty();

    private Optional<String> followingUrl = Optional.empty();

    private Optional<String> gistsUrl = Optional.empty();

    private Optional<String> starredUrl = Optional.empty();

    private Optional<String> subscriptionsUrl = Optional.empty();

    private Optional<String> organizationsUrl = Optional.empty();

    private Optional<String> receivedEventsUrl = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<Boolean> siteAdmin = Optional.empty();

    private Optional<String> userViewType = Optional.empty();

    public BranchRestrictionPolicyAppsInnerOwner login(String login) {
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

    public BranchRestrictionPolicyAppsInnerOwner id(Long id) {
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

    public BranchRestrictionPolicyAppsInnerOwner nodeId(String nodeId) {
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

    public BranchRestrictionPolicyAppsInnerOwner url(String url) {
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

    public BranchRestrictionPolicyAppsInnerOwner reposUrl(String reposUrl) {
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

    public BranchRestrictionPolicyAppsInnerOwner eventsUrl(String eventsUrl) {
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

    public BranchRestrictionPolicyAppsInnerOwner hooksUrl(String hooksUrl) {
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

    public BranchRestrictionPolicyAppsInnerOwner issuesUrl(String issuesUrl) {
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

    public BranchRestrictionPolicyAppsInnerOwner membersUrl(String membersUrl) {
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

    public BranchRestrictionPolicyAppsInnerOwner publicMembersUrl(String publicMembersUrl) {
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

    public BranchRestrictionPolicyAppsInnerOwner avatarUrl(String avatarUrl) {
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

    public BranchRestrictionPolicyAppsInnerOwner description(String description) {
        this.description = Optional.ofNullable(description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    @Schema(name = "description", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("description")
    public Optional<String> getDescription() {
        return description;
    }

    public void setDescription(Optional<String> description) {
        this.description = description;
    }

    public BranchRestrictionPolicyAppsInnerOwner gravatarId(String gravatarId) {
        this.gravatarId = Optional.ofNullable(gravatarId);
        return this;
    }

    /**
     * Get gravatarId
     * @return gravatarId
     */
    @Schema(name = "gravatar_id", example = "\"\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gravatar_id")
    public Optional<String> getGravatarId() {
        return gravatarId;
    }

    public void setGravatarId(Optional<String> gravatarId) {
        this.gravatarId = gravatarId;
    }

    public BranchRestrictionPolicyAppsInnerOwner htmlUrl(String htmlUrl) {
        this.htmlUrl = Optional.ofNullable(htmlUrl);
        return this;
    }

    /**
     * Get htmlUrl
     * @return htmlUrl
     */
    @Schema(
            name = "html_url",
            example = "\"https://github.com/testorg-ea8ec76d71c3af4b\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("html_url")
    public Optional<String> getHtmlUrl() {
        return htmlUrl;
    }

    public void setHtmlUrl(Optional<String> htmlUrl) {
        this.htmlUrl = htmlUrl;
    }

    public BranchRestrictionPolicyAppsInnerOwner followersUrl(String followersUrl) {
        this.followersUrl = Optional.ofNullable(followersUrl);
        return this;
    }

    /**
     * Get followersUrl
     * @return followersUrl
     */
    @Schema(
            name = "followers_url",
            example = "\"https://api.github.com/users/testorg-ea8ec76d71c3af4b/followers\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("followers_url")
    public Optional<String> getFollowersUrl() {
        return followersUrl;
    }

    public void setFollowersUrl(Optional<String> followersUrl) {
        this.followersUrl = followersUrl;
    }

    public BranchRestrictionPolicyAppsInnerOwner followingUrl(String followingUrl) {
        this.followingUrl = Optional.ofNullable(followingUrl);
        return this;
    }

    /**
     * Get followingUrl
     * @return followingUrl
     */
    @Schema(
            name = "following_url",
            example = "\"https://api.github.com/users/testorg-ea8ec76d71c3af4b/following{/other_user}\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("following_url")
    public Optional<String> getFollowingUrl() {
        return followingUrl;
    }

    public void setFollowingUrl(Optional<String> followingUrl) {
        this.followingUrl = followingUrl;
    }

    public BranchRestrictionPolicyAppsInnerOwner gistsUrl(String gistsUrl) {
        this.gistsUrl = Optional.ofNullable(gistsUrl);
        return this;
    }

    /**
     * Get gistsUrl
     * @return gistsUrl
     */
    @Schema(
            name = "gists_url",
            example = "\"https://api.github.com/users/testorg-ea8ec76d71c3af4b/gists{/gist_id}\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("gists_url")
    public Optional<String> getGistsUrl() {
        return gistsUrl;
    }

    public void setGistsUrl(Optional<String> gistsUrl) {
        this.gistsUrl = gistsUrl;
    }

    public BranchRestrictionPolicyAppsInnerOwner starredUrl(String starredUrl) {
        this.starredUrl = Optional.ofNullable(starredUrl);
        return this;
    }

    /**
     * Get starredUrl
     * @return starredUrl
     */
    @Schema(
            name = "starred_url",
            example = "\"https://api.github.com/users/testorg-ea8ec76d71c3af4b/starred{/owner}{/repo}\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("starred_url")
    public Optional<String> getStarredUrl() {
        return starredUrl;
    }

    public void setStarredUrl(Optional<String> starredUrl) {
        this.starredUrl = starredUrl;
    }

    public BranchRestrictionPolicyAppsInnerOwner subscriptionsUrl(String subscriptionsUrl) {
        this.subscriptionsUrl = Optional.ofNullable(subscriptionsUrl);
        return this;
    }

    /**
     * Get subscriptionsUrl
     * @return subscriptionsUrl
     */
    @Schema(
            name = "subscriptions_url",
            example = "\"https://api.github.com/users/testorg-ea8ec76d71c3af4b/subscriptions\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("subscriptions_url")
    public Optional<String> getSubscriptionsUrl() {
        return subscriptionsUrl;
    }

    public void setSubscriptionsUrl(Optional<String> subscriptionsUrl) {
        this.subscriptionsUrl = subscriptionsUrl;
    }

    public BranchRestrictionPolicyAppsInnerOwner organizationsUrl(String organizationsUrl) {
        this.organizationsUrl = Optional.ofNullable(organizationsUrl);
        return this;
    }

    /**
     * Get organizationsUrl
     * @return organizationsUrl
     */
    @Schema(
            name = "organizations_url",
            example = "\"https://api.github.com/users/testorg-ea8ec76d71c3af4b/orgs\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("organizations_url")
    public Optional<String> getOrganizationsUrl() {
        return organizationsUrl;
    }

    public void setOrganizationsUrl(Optional<String> organizationsUrl) {
        this.organizationsUrl = organizationsUrl;
    }

    public BranchRestrictionPolicyAppsInnerOwner receivedEventsUrl(String receivedEventsUrl) {
        this.receivedEventsUrl = Optional.ofNullable(receivedEventsUrl);
        return this;
    }

    /**
     * Get receivedEventsUrl
     * @return receivedEventsUrl
     */
    @Schema(
            name = "received_events_url",
            example = "\"https://api.github.com/users/testorg-ea8ec76d71c3af4b/received_events\"",
            requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("received_events_url")
    public Optional<String> getReceivedEventsUrl() {
        return receivedEventsUrl;
    }

    public void setReceivedEventsUrl(Optional<String> receivedEventsUrl) {
        this.receivedEventsUrl = receivedEventsUrl;
    }

    public BranchRestrictionPolicyAppsInnerOwner type(String type) {
        this.type = Optional.ofNullable(type);
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @Schema(name = "type", example = "\"Organization\"", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("type")
    public Optional<String> getType() {
        return type;
    }

    public void setType(Optional<String> type) {
        this.type = type;
    }

    public BranchRestrictionPolicyAppsInnerOwner siteAdmin(Boolean siteAdmin) {
        this.siteAdmin = Optional.ofNullable(siteAdmin);
        return this;
    }

    /**
     * Get siteAdmin
     * @return siteAdmin
     */
    @Schema(name = "site_admin", example = "false", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty("site_admin")
    public Optional<Boolean> getSiteAdmin() {
        return siteAdmin;
    }

    public void setSiteAdmin(Optional<Boolean> siteAdmin) {
        this.siteAdmin = siteAdmin;
    }

    public BranchRestrictionPolicyAppsInnerOwner userViewType(String userViewType) {
        this.userViewType = Optional.ofNullable(userViewType);
        return this;
    }

    /**
     * Get userViewType
     * @return userViewType
     */
    @Schema(name = "user_view_type", example = "public", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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
        BranchRestrictionPolicyAppsInnerOwner branchRestrictionPolicyAppsInnerOwner =
                (BranchRestrictionPolicyAppsInnerOwner) o;
        return Objects.equals(this.login, branchRestrictionPolicyAppsInnerOwner.login)
                && Objects.equals(this.id, branchRestrictionPolicyAppsInnerOwner.id)
                && Objects.equals(this.nodeId, branchRestrictionPolicyAppsInnerOwner.nodeId)
                && Objects.equals(this.url, branchRestrictionPolicyAppsInnerOwner.url)
                && Objects.equals(this.reposUrl, branchRestrictionPolicyAppsInnerOwner.reposUrl)
                && Objects.equals(this.eventsUrl, branchRestrictionPolicyAppsInnerOwner.eventsUrl)
                && Objects.equals(this.hooksUrl, branchRestrictionPolicyAppsInnerOwner.hooksUrl)
                && Objects.equals(this.issuesUrl, branchRestrictionPolicyAppsInnerOwner.issuesUrl)
                && Objects.equals(this.membersUrl, branchRestrictionPolicyAppsInnerOwner.membersUrl)
                && Objects.equals(this.publicMembersUrl, branchRestrictionPolicyAppsInnerOwner.publicMembersUrl)
                && Objects.equals(this.avatarUrl, branchRestrictionPolicyAppsInnerOwner.avatarUrl)
                && Objects.equals(this.description, branchRestrictionPolicyAppsInnerOwner.description)
                && Objects.equals(this.gravatarId, branchRestrictionPolicyAppsInnerOwner.gravatarId)
                && Objects.equals(this.htmlUrl, branchRestrictionPolicyAppsInnerOwner.htmlUrl)
                && Objects.equals(this.followersUrl, branchRestrictionPolicyAppsInnerOwner.followersUrl)
                && Objects.equals(this.followingUrl, branchRestrictionPolicyAppsInnerOwner.followingUrl)
                && Objects.equals(this.gistsUrl, branchRestrictionPolicyAppsInnerOwner.gistsUrl)
                && Objects.equals(this.starredUrl, branchRestrictionPolicyAppsInnerOwner.starredUrl)
                && Objects.equals(this.subscriptionsUrl, branchRestrictionPolicyAppsInnerOwner.subscriptionsUrl)
                && Objects.equals(this.organizationsUrl, branchRestrictionPolicyAppsInnerOwner.organizationsUrl)
                && Objects.equals(this.receivedEventsUrl, branchRestrictionPolicyAppsInnerOwner.receivedEventsUrl)
                && Objects.equals(this.type, branchRestrictionPolicyAppsInnerOwner.type)
                && Objects.equals(this.siteAdmin, branchRestrictionPolicyAppsInnerOwner.siteAdmin)
                && Objects.equals(this.userViewType, branchRestrictionPolicyAppsInnerOwner.userViewType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                login,
                id,
                nodeId,
                url,
                reposUrl,
                eventsUrl,
                hooksUrl,
                issuesUrl,
                membersUrl,
                publicMembersUrl,
                avatarUrl,
                description,
                gravatarId,
                htmlUrl,
                followersUrl,
                followingUrl,
                gistsUrl,
                starredUrl,
                subscriptionsUrl,
                organizationsUrl,
                receivedEventsUrl,
                type,
                siteAdmin,
                userViewType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BranchRestrictionPolicyAppsInnerOwner {\n");
        sb.append("    login: ").append(toIndentedString(login)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    reposUrl: ").append(toIndentedString(reposUrl)).append("\n");
        sb.append("    eventsUrl: ").append(toIndentedString(eventsUrl)).append("\n");
        sb.append("    hooksUrl: ").append(toIndentedString(hooksUrl)).append("\n");
        sb.append("    issuesUrl: ").append(toIndentedString(issuesUrl)).append("\n");
        sb.append("    membersUrl: ").append(toIndentedString(membersUrl)).append("\n");
        sb.append("    publicMembersUrl: ")
                .append(toIndentedString(publicMembersUrl))
                .append("\n");
        sb.append("    avatarUrl: ").append(toIndentedString(avatarUrl)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    gravatarId: ").append(toIndentedString(gravatarId)).append("\n");
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
