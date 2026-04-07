package backend.academy.linktracker.scrapper.adapters.controllers.github.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.annotation.Generated;
import java.util.Objects;
import java.util.Optional;

/**
 * DeploymentWorkflowRunHeadRepositoryOwner
 */
@JsonTypeName("Deployment_Workflow_Run_head_repository_owner")
@Generated(
        value = "org.openapitools.codegen.languages.SpringCodegen",
        date = "2026-04-05T13:06:55.012025427Z[Etc/UTC]",
        comments = "Generator version: 7.21.0-SNAPSHOT")
public class DeploymentWorkflowRunHeadRepositoryOwner {

    private Optional<String> avatarUrl = Optional.empty();

    private Optional<String> eventsUrl = Optional.empty();

    private Optional<String> followersUrl = Optional.empty();

    private Optional<String> followingUrl = Optional.empty();

    private Optional<String> gistsUrl = Optional.empty();

    private Optional<String> gravatarId = Optional.empty();

    private Optional<String> htmlUrl = Optional.empty();

    private Optional<Long> id = Optional.empty();

    private Optional<String> login = Optional.empty();

    private Optional<String> nodeId = Optional.empty();

    private Optional<String> organizationsUrl = Optional.empty();

    private Optional<String> receivedEventsUrl = Optional.empty();

    private Optional<String> reposUrl = Optional.empty();

    private Optional<Boolean> siteAdmin = Optional.empty();

    private Optional<String> starredUrl = Optional.empty();

    private Optional<String> subscriptionsUrl = Optional.empty();

    private Optional<String> type = Optional.empty();

    private Optional<String> url = Optional.empty();

    public DeploymentWorkflowRunHeadRepositoryOwner avatarUrl(String avatarUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner eventsUrl(String eventsUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner followersUrl(String followersUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner followingUrl(String followingUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner gistsUrl(String gistsUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner gravatarId(String gravatarId) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner htmlUrl(String htmlUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner id(Long id) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner login(String login) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner nodeId(String nodeId) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner organizationsUrl(String organizationsUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner receivedEventsUrl(String receivedEventsUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner reposUrl(String reposUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner siteAdmin(Boolean siteAdmin) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner starredUrl(String starredUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner subscriptionsUrl(String subscriptionsUrl) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner type(String type) {
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

    public DeploymentWorkflowRunHeadRepositoryOwner url(String url) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeploymentWorkflowRunHeadRepositoryOwner deploymentWorkflowRunHeadRepositoryOwner =
                (DeploymentWorkflowRunHeadRepositoryOwner) o;
        return Objects.equals(this.avatarUrl, deploymentWorkflowRunHeadRepositoryOwner.avatarUrl)
                && Objects.equals(this.eventsUrl, deploymentWorkflowRunHeadRepositoryOwner.eventsUrl)
                && Objects.equals(this.followersUrl, deploymentWorkflowRunHeadRepositoryOwner.followersUrl)
                && Objects.equals(this.followingUrl, deploymentWorkflowRunHeadRepositoryOwner.followingUrl)
                && Objects.equals(this.gistsUrl, deploymentWorkflowRunHeadRepositoryOwner.gistsUrl)
                && Objects.equals(this.gravatarId, deploymentWorkflowRunHeadRepositoryOwner.gravatarId)
                && Objects.equals(this.htmlUrl, deploymentWorkflowRunHeadRepositoryOwner.htmlUrl)
                && Objects.equals(this.id, deploymentWorkflowRunHeadRepositoryOwner.id)
                && Objects.equals(this.login, deploymentWorkflowRunHeadRepositoryOwner.login)
                && Objects.equals(this.nodeId, deploymentWorkflowRunHeadRepositoryOwner.nodeId)
                && Objects.equals(this.organizationsUrl, deploymentWorkflowRunHeadRepositoryOwner.organizationsUrl)
                && Objects.equals(this.receivedEventsUrl, deploymentWorkflowRunHeadRepositoryOwner.receivedEventsUrl)
                && Objects.equals(this.reposUrl, deploymentWorkflowRunHeadRepositoryOwner.reposUrl)
                && Objects.equals(this.siteAdmin, deploymentWorkflowRunHeadRepositoryOwner.siteAdmin)
                && Objects.equals(this.starredUrl, deploymentWorkflowRunHeadRepositoryOwner.starredUrl)
                && Objects.equals(this.subscriptionsUrl, deploymentWorkflowRunHeadRepositoryOwner.subscriptionsUrl)
                && Objects.equals(this.type, deploymentWorkflowRunHeadRepositoryOwner.type)
                && Objects.equals(this.url, deploymentWorkflowRunHeadRepositoryOwner.url);
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
                url);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeploymentWorkflowRunHeadRepositoryOwner {\n");
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
